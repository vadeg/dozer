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
package org.dozer.vo.deep3;

/**
 * NestedDest
 *
 * @author tetra
 * @version $Id$
 */
public class NestedDest {
    private NestedNestedDest nestedNestedDest;

    public NestedNestedDest getNestedNestedDest() {
        return nestedNestedDest;
    }

    public void setNestedNestedDest(NestedNestedDest nestedNestedDest) {
        this.nestedNestedDest = nestedNestedDest;
    }
}
