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
package org.dozer.converters;

import org.apache.commons.beanutils.Converter;
import org.dozer.util.MappingUtils;

/**
 * Internal class for converting Supported Data Types to Short. Only intended for internal use.
 *
 * @author siarhei.krukau
 */
public class ShortConverter implements Converter {

    private static org.apache.commons.beanutils.converters.ShortConverter commonsConverter = new org.apache.commons.beanutils.converters.ShortConverter();

    @SuppressWarnings("rawtypes")
    public Object convert(Class destClass, Object srcObj) {
        // Boolean to Int not supported in apache common's int converter and this is why this class is req'd
        if (Boolean.class.isAssignableFrom(srcObj.getClass())) {
            boolean value = (Boolean)srcObj;
            return value ? (short)1 : (short)0;
        } else if (MappingUtils.isEnumType(srcObj.getClass())) {
            return ((Integer)((Enum)srcObj).ordinal()).shortValue();
        } else {
            return commonsConverter.convert(destClass, srcObj);
        }
    }
}
