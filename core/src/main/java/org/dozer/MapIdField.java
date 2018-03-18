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
package org.dozer;

import java.util.HashMap;
import java.util.Map;

/**
 * Only intended for internal use. Simple helper class to keep track of mapped objects
 * and their mapIds.
 *
 * @author andino.alexander
 *
 */
public class MapIdField {

  // <mapIdOfObject, mappedObject>
  private Map<String, Object> mappedObjects;

  public MapIdField() {
    mappedObjects = new HashMap<String, Object>();
  }

  public void put(String mapId, Object value) {
    mappedObjects.put(mapId, value);
  }

  public Object get(String mapId) {
    return mappedObjects.get(mapId);
  }

  public boolean containsMapId(String mapId) {
    return mappedObjects.containsKey(mapId);
  }
}
