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
package com.github.dozermapper.spring.functional_tests.support;

import java.util.concurrent.atomic.AtomicInteger;

import org.dozer.DozerEventListener;
import org.dozer.event.DozerEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventTestListener implements DozerEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(EventTestListener.class);

    private final AtomicInteger invocationCount = new AtomicInteger();

    public void mappingStarted(DozerEvent event) {
        LOG.debug("mappingStarted Called with:" + event.getClassMap().getDestClassToMap());

        invocationCount.incrementAndGet();
    }

    public void preWritingDestinationValue(DozerEvent event) {
        LOG.debug("preWritingDestinationValue Called with:" + event.getClassMap().getDestClassToMap());

        invocationCount.incrementAndGet();
    }

    public void postWritingDestinationValue(DozerEvent event) {
        LOG.debug("postWritingDestinationValue Called with:" + event.getClassMap().getDestClassToMap());

        invocationCount.incrementAndGet();
    }

    public void mappingFinished(DozerEvent event) {
        LOG.debug("mappingFinished Called with:" + event.getClassMap().getDestClassToMap());

        invocationCount.incrementAndGet();
    }

    public int getInvocationCount() {
        return invocationCount.intValue();
    }
}
