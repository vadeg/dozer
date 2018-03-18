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
package com.github.dozermapper.osgitests;

import com.github.dozermapper.osgitestsmodel.Person;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.dozer.el.ELExpressionFactory;
import org.dozer.osgi.OSGiClassLoader;
import org.junit.Test;

import static org.junit.Assert.*;

public abstract class DozerCoreOsgiContainerTest extends AbstractDozerCoreOsgiContainerTest {

    @Test
    public void canMapUsingXMLWithVariables() {
        Mapper mapper = DozerBeanMapperBuilder.create()
                .withXmlMapping(() -> getLocalResource("mappings/mapping-with-el.xml"))
                .withClassLoader(new OSGiClassLoader(com.github.dozermapper.osgitestsmodel.Activator.getBundleContext()))
                .build();

        Person answer = mapper.map(new Person("bob"), Person.class);

        assertNotNull(answer);
        assertNotNull(answer.getName());
        assertEquals("bob", answer.getName());
    }

    @Test
    public void elSupported() {
        assertTrue(ELExpressionFactory.isSupported());
    }
}
