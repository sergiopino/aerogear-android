/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.android.impl.pipeline;

import org.jboss.aerogear.android.pipeline.ResponseParser;

import com.google.gson.Gson;

public class GsonResponseParser<T> implements ResponseParser<T> {

    private Gson gson;

    public GsonResponseParser() {
        this.gson = new Gson();
    }

    public GsonResponseParser(Gson gson) {
        this.gson = gson;
    }

    @Override
    public T handleResponse(String response, Class<T> responseType) {
        return gson.fromJson(response, responseType);
    }

    @Override
    public T[] handleArrayResponse(String response, Class<T[]> responseType) {
        return gson.fromJson(response, responseType);
    }

    /**
     * @deprecated This method exists to support another deprecated method while we transition off of it.  {@link  PipeConfig#setGsonBuilder(com.google.gson.GsonBuilder) }
     */
    @Deprecated
    public Gson getGson() {
        return gson;
    }

    /**
     * @deprecated This method exists to support another deprecated method while we transition off of it.  {@link  PipeConfig#setGsonBuilder(com.google.gson.GsonBuilder) }
     */
    @Deprecated
    public void setGson(Gson gson) {
        this.gson = gson;
    }

}
