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
package org.dozer.config.resolvers;

import org.dozer.config.SettingsKeys;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SystemPropertySettingsResolverTest {

    @Test
    public void canResolve() {
        SystemPropertySettingsResolver.set(SettingsKeys.CONVERTER_BY_DEST_TYPE_CACHE_MAX_SIZE, "5000");

        SettingsResolver resolver = new SystemPropertySettingsResolver();
        resolver.init();

        Integer answer = Integer.valueOf(resolver.get(SettingsKeys.CONVERTER_BY_DEST_TYPE_CACHE_MAX_SIZE, 0).toString());

        assertNotNull(answer);
        assertEquals(Integer.valueOf(5000), answer);
    }
}
