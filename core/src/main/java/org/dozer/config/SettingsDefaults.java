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
package org.dozer.config;

public final class SettingsDefaults {

    private SettingsDefaults() {
    }

    public static final String LEGACY_PROPERTIES_FILE = "dozer.properties";
    public static final String YAML_PROPERTIES_FILE = "dozer.yaml";

    public static final Integer CONVERTER_BY_DEST_TYPE_CACHE_MAX_SIZE = 10000;
    public static final Integer SUPER_TYPE_CHECK_CACHE_MAX_SIZE = 10000;
    public static final String CLASS_LOADER_BEAN = "org.dozer.util.DefaultClassLoader";
    public static final String PROXY_RESOLVER_BEAN = "org.dozer.util.DefaultProxyResolver";
}
