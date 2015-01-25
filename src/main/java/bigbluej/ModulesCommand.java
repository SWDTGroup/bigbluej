package bigbluej;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.commons.lang.Validate;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Michael Lieshoff
 */
public class ModulesCommand {

    private final Set<ModuleCommand> moduleCommands;

    private ModulesCommand(Set<ModuleCommand> moduleCommands) {
        this.moduleCommands = moduleCommands;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Set<ModuleCommand> getModules() {
        return moduleCommands;
    }

    public static class Builder {

        private Set<ModuleCommand> moduleCommands = new HashSet<>();

        private Builder() {
        }

        public ModulesCommand build() {
            return new ModulesCommand(moduleCommands);
        }

        public Builder module(ModuleCommand moduleCommand) {
            Validate.notNull(moduleCommand, "moduleCommand");
            moduleCommands.add(moduleCommand);
            return this;
        }

    }

}
