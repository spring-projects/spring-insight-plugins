/**
 * Copyright (c) 2009-2011 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.springsource.insight.plugin.gemfire;

import com.springsource.insight.intercept.trace.Frame;
import com.springsource.insight.intercept.trace.FrameUtil;


public class GemFireQueryExternalResourceAnalyzer extends AbstractGemFireExternalResourceAnalyzer {
    private static final GemFireQueryExternalResourceAnalyzer INSTANCE = new GemFireQueryExternalResourceAnalyzer();

    private GemFireQueryExternalResourceAnalyzer() {
        super(GemFireDefenitions.TYPE_QUERY.getType());
    }

    public static final GemFireQueryExternalResourceAnalyzer getInstance() {
        return INSTANCE;
    }

    @Override
    protected boolean shouldCreateExteranlResource(Frame frame) {
        return !FrameUtil.hasFrameOfType(frame, GemFireDefenitions.TYPE_REMOTE.getType());
    }
}
