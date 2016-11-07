/*
 * Copyright 2014-2015 Groupon, Inc
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.client.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TierPriceOverride {
    private final List<BlockPriceOverride> blockPriceOverrides;

    @JsonCreator
    public TierPriceOverride(@JsonProperty("blockPriceOverrides") final List<BlockPriceOverride> blockPriceOverrides) {
        this.blockPriceOverrides = blockPriceOverrides;
    }

    public List<BlockPriceOverride> getBlockPriceOverrides() {
        return blockPriceOverrides;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TierPriceOverride)) {
            return false;
        }

        final TierPriceOverride that = (TierPriceOverride) o;

        if (blockPriceOverrides != null ? !blockPriceOverrides.equals(that.blockPriceOverrides) : that.blockPriceOverrides != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = blockPriceOverrides != null ? blockPriceOverrides.hashCode() : 0;
        result = 31 * result + (blockPriceOverrides != null ? blockPriceOverrides.hashCode() : 0);
        return result;
    }
}
