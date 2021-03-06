/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pivot_contrib.guicy_apache_pivot;

import com.google.inject.Inject;
import org.apache.pivot.beans.Bindable;
import org.apache.pivot.collections.Map;
import org.apache.pivot.util.Resources;
import org.apache.pivot.wtk.BoxPane;

import java.net.URL;

/**
 * @author TEyckmans
 */
public class GuicyBXMLSerializerTestBoxPaneOne extends BoxPane implements Bindable
{
    private final GuicyBXMLSerialiserTestSharedObject sharedObject;

    @Inject
    public GuicyBXMLSerializerTestBoxPaneOne(GuicyBXMLSerialiserTestSharedObject sharedObject)
    {
        this.sharedObject = sharedObject;
    }

    @Override
    public void initialize(Map<String, Object> namespace, URL location, Resources resources)
    {

    }

    public GuicyBXMLSerialiserTestSharedObject getSharedObject()
    {
        return sharedObject;
    }
}
