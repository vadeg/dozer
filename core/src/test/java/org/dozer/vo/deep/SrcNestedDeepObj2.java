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
package org.dozer.vo.deep;

import org.dozer.vo.BaseTestObject;
import org.dozer.vo.SimpleObj;

/**
 * @author garsombke.franz
 * @author sullins.ben
 * @author tierney.matt
 */
public class SrcNestedDeepObj2 extends BaseTestObject {
  private String src5;
  private SimpleObj[] simpleObjects;

  public String getSrc5() {
    return src5;
  }
  public void setSrc5(String src5) {
    this.src5 = src5;
  }
  public SimpleObj[] getSimpleObjects() {
    return simpleObjects;
  }
  public void setSimpleObjects(SimpleObj[] simpleObjects) {
    this.simpleObjects = simpleObjects;
  }
}
