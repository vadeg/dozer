/*
 * Copyright 2005-2018 Dozer Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dozer.propertydescriptor;

import java.lang.ref.SoftReference;
import java.lang.reflect.Method;

import org.dozer.config.BeanContainer;
import org.dozer.factory.DestBeanCreator;
import org.dozer.fieldmap.HintContainer;
import org.dozer.util.MappingUtils;
import org.dozer.util.ReflectionUtils;


/**
 * 
 * Internal class used to read and write values for fields that have an explicitly specified getter or setter method.
 * Only intended for internal use.
 * 
 * @author garsombke.franz
 * @author tierney.matt
 */
public class CustomGetSetPropertyDescriptor extends JavaBeanPropertyDescriptor {

  private final String customSetMethod;
  private final String customGetMethod;

  private SoftReference<Method> writeMethod;
  private SoftReference<Method> readMethod;

  public CustomGetSetPropertyDescriptor(Class<?> clazz, String fieldName, boolean isIndexed, int index, String customSetMethod,
                                        String customGetMethod, HintContainer srcDeepIndexHintContainer, HintContainer destDeepIndexHintContainer,
                                        BeanContainer beanContainer, DestBeanCreator destBeanCreator) {
    super(clazz, fieldName, isIndexed, index, srcDeepIndexHintContainer, destDeepIndexHintContainer, beanContainer, destBeanCreator);
    this.customSetMethod = customSetMethod;
    this.customGetMethod = customGetMethod;
  }

  @Override
  public Method getWriteMethod() throws NoSuchMethodException {
    if (writeMethod == null || writeMethod.get() == null) {
      if (customSetMethod != null && !MappingUtils.isDeepMapping(fieldName)) {
        Method method = ReflectionUtils.findAMethod(clazz, customSetMethod, beanContainer);
        writeMethod = new SoftReference<Method>(method);
      } else {
        return super.getWriteMethod();
      }
    }
    return writeMethod.get();
  }

  @Override
  protected Method getReadMethod() throws NoSuchMethodException {
    if (readMethod == null || readMethod.get() == null) {
      if (customGetMethod != null) {
        Method method = ReflectionUtils.findAMethod(clazz, customGetMethod, beanContainer);
        readMethod = new SoftReference<Method>(method);
      } else {
        return super.getReadMethod();
      }
    }
    return readMethod.get();
  }

  @Override
  protected String getSetMethodName() throws NoSuchMethodException {
    return customSetMethod != null ? customSetMethod : super.getSetMethodName();
  }
  
  @Override
  protected boolean isCustomSetMethod() {
    return customSetMethod != null;
  }

}
