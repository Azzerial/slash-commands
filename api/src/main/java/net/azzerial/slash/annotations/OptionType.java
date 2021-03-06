/*
 * Copyright 2021 Robin Mercier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.azzerial.slash.annotations;

/**
 * This enum represents the type of a Slash Command option.
 */
public enum OptionType {
    STRING(true),
    INTEGER(true),
    BOOLEAN,
    USER,
    CHANNEL,
    ROLE,
    MENTIONABLE,
    NUMBER(true);

    private final boolean supportsChoices;

    /* Constructors */

    OptionType() {
        this(false);
    }

    OptionType(boolean supportsChoices) {
        this.supportsChoices = supportsChoices;
    }

    /* Getters & Setters */

    public boolean canSupportsChoices() {
        return supportsChoices;
    }
}
