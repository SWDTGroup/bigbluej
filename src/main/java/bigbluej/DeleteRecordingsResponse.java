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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Michael Lieshoff
 */
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeleteRecordingsResponse extends Response {

    @XmlElement(name = "deleted")
    private boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeleteRecordingsResponse)) return false;
        if (!super.equals(o)) return false;

        DeleteRecordingsResponse that = (DeleteRecordingsResponse) o;

        if (deleted != that.deleted) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (deleted ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DeleteRecordingsResponse{" +
                "deleted=" + deleted +
                "} " + super.toString();
    }

}