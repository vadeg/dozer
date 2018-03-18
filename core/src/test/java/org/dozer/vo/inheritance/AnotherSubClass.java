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
package org.dozer.vo.inheritance;

public class AnotherSubClass extends AnotherBaseClass {

  private String subAttribute;
  private java.util.List subList;
  private SClass sClass;
  private SClass sClass2;

  public String getSubAttribute() {
    return subAttribute;
  }

  public void setSubAttribute(String subAttribute) {
    this.subAttribute = subAttribute;
  }

  public java.util.List getSubList() {
    return subList;
  }

  public void setSubList(java.util.List subList) {
    this.subList = subList;
  }

  public SClass getSClass() {
    return sClass;
  }

  public void setSClass(SClass class1) {
    sClass = class1;
  }

  public SClass getSClass2() {
    return sClass2;
  }

  public void setSClass2(SClass class2) {
    sClass2 = class2;
  }

}
