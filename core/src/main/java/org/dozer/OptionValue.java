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

/**
 * A mapping option value
 */
public enum OptionValue {

    /**
     * Turn on the option
     */
    ON(Boolean.TRUE),

    /**
     * Turn off the option
     */
    OFF(Boolean.FALSE),

    /**
     * Use the inherited option value
     */
    INHERITED(null);

    private final Boolean value;

    OptionValue(Boolean value) {
        this.value = value;
    }

    /**
     * Get the equivalent Boolean value.
     *
     * @return Boolean.TRUE for ON, Boolean.FALSE for OFF, null for INHERITED.
     */
    public Boolean toBoolean() {
        return value;
    }
}
