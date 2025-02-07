/*
 * Copyright (c) 2025 Oracle and/or its affiliates.
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

package io.helidon.integrations.langchain4j.providers.openai;

import java.net.Proxy;
import java.time.Duration;
import java.util.Map;
import java.util.Optional;

import io.helidon.builder.api.Option;

interface OpenAiCommonConfig {
    /**
     * If set to {@code false} (default), OpenAI model will not be available even if configured.
     *
     * @return whether OpenAI model is enabled, defaults to {@code false}
     */
    @Option.Configured
    boolean enabled();

    /**
     * The base URL for the OpenAI API.
     *
     * @return the base URL
     */
    @Option.Configured
    Optional<String> baseUrl();

    /**
     * The API key used to authenticate requests to the OpenAI API.
     *
     * @return an {@link java.util.Optional} containing the API key
     */
    @Option.Configured
    Optional<String> apiKey();

    /**
     * Whether to log API requests.
     *
     * @return an {@link java.util.Optional} containing true if requests should be logged, false otherwise
     */
    @Option.Configured
    Optional<Boolean> logRequests();

    /**
     * Whether to log API responses.
     *
     * @return an {@link java.util.Optional} containing true if responses should be logged, false otherwise
     */
    @Option.Configured
    Optional<Boolean> logResponses();

    /**
     * A map containing custom headers.
     *
     * @return custom headers map
     */
    @Option.Configured
    @Option.Singular
    Map<String, String> customHeaders();

    /**
     * The timeout setting for API requests.
     *
     * @return the timeout setting in {@link java.time.Duration#parse} format
     */
    @Option.Configured
    Optional<Duration> timeout();

    /**
     * The maximum number of retries for failed API requests.
     *
     * @return an {@link java.util.Optional} containing the maximum number of retries
     */
    @Option.Configured
    Optional<Integer> maxRetries();

    /**
     * Proxy to use.
     *
     * @return an {@link java.util.Optional} containing HTTP proxy to use
     */
    Optional<Proxy> proxy();

    /**
     * The ID of the organization for API requests.
     *
     * @return organization ID
     */
    @Option.Configured
    Optional<String> organizationId();

    /**
     * The model name to use (e.g., "gpt-3.5-turbo").
     *
     * @return the model name
     */
    @Option.Configured
    Optional<String> modelName();
}
