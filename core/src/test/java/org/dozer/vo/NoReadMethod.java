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
package org.dozer.vo;

/**
 * @author garsombke.franz
 * @author sullins.ben
 * @author tierney.matt
 * 
 */
public class NoReadMethod extends BaseTestObject {
  private String noReadMethod;
  private String otherNoReadMethod;

  public void setNoReadMethod(String noReadMethod) {
    this.noReadMethod = noReadMethod;
  }

  // Dozer should not use a get method w/ param when discovering
  // default field mappings
  public String getOtherNoReadMethod(long value) {
    return otherNoReadMethod;
  }

  public void setOtherNoReadMethod(String otherNoReadMethod) {
    this.otherNoReadMethod = otherNoReadMethod;
  }

  // Need this from unit test to access noReadMethod.
  public String getXXXXX() {
    return this.noReadMethod;
  }
}