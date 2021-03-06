/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.quarkus.component.optaplanner.it.domain;

import java.util.concurrent.atomic.AtomicLong;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.optaplanner.core.api.domain.lookup.PlanningId;

/**
 * adapted from optaplanner quarkus quickstart :
 * https://github.com/kiegroup/optaplanner-quickstarts/blob/stable/quarkus-school-timetabling/src/main/java/org/acme/schooltimetabling/domain/Room.java
 */
public class Room {

    @PlanningId
    @NotNull
    private Long id;

    @NotBlank
    private String name;
    private static AtomicLong increment = new AtomicLong(1);

    public Room() {
    }

    public Room(String name) {
        this.id = increment.getAndIncrement();
        this.name = name.trim();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
