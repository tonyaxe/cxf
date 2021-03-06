/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.aegis.type.array;

public class FlatArrayService implements FlatArrayServiceInterface {

    String[] stringArrayValue;
    BeanWithFlatArray beanWithFlatArrayValue;
    BeanWithFlatCollection beanWithFlatCollection;

    public FlatArrayService() {
    }

    /** {@inheritDoc}*/
    public String[] getStringArrayValue() {
        return new String[] {"bleh", "bleh"};
    }

    /** {@inheritDoc}*/
    public void submitStringArray(String[] array) {
        stringArrayValue = array;
    }

    /** {@inheritDoc}*/
    public void takeBeanWithFlatArray(BeanWithFlatArray bwfa) {
        beanWithFlatArrayValue = bwfa;
    }

    public BeanWithFlatCollection echoBeanWithFlatCollection(BeanWithFlatCollection c) {
        beanWithFlatCollection = c;
        return c;
    }
}
