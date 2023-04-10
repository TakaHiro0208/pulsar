/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pulsar.broker.stats.prometheus;

public class AggregatedTransactionCoordinatorStats {

    public int actives;

    public long committedCount;

    public long abortedCount;

    public long createdCount;

    public long timeoutCount;

    public long appendLogCount;

    public long nonRetryableCount;

    public long[] executionLatency;

    public void reset() {
        actives = 0;
        committedCount = 0;
        abortedCount = 0;
        createdCount = 0;
        timeoutCount = 0;
        appendLogCount = 0;
        nonRetryableCount = 0;
        executionLatency = null;
    }
}
