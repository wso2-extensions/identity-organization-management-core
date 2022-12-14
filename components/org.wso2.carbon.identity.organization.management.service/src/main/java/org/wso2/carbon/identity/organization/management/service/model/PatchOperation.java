/*
 * Copyright (c) 2022, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.organization.management.service.model;

/**
 * This class represents a PATCH operation request body.
 */
public class PatchOperation {

    private String path;
    private String value;
    private String op;

    public PatchOperation(String op, String path, String value) {

        this.op = op;
        this.path = path;
        this.value = value;
    }

    public PatchOperation(String op, String path) {

        this.op = op;
        this.path = path;
    }

    public PatchOperation() {

    }

    public String getOp() {

        return op;
    }

    public void setOp(String op) {

        this.op = op;
    }

    public String getPath() {

        return path;
    }

    public void setPath(String path) {

        this.path = path;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }
}
