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

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.killbill.billing.catalog.api.BillingMode;
import org.killbill.billing.catalog.api.UsageType;

public class UsagePriceOverride {
    private final String usageName;

    private final UsageType usageType;

    private final BillingMode billingMode;

    private final List<TierPriceOverride> tierPriceOverrides;

    @JsonCreator
    public UsagePriceOverride(@JsonProperty("usageName") final String usageName,
                              @Nullable @JsonProperty("usageType") final UsageType usageType,
                              @Nullable @JsonProperty("billingMode") final BillingMode billingMode,
                              @Nullable @JsonProperty("tierPriceOverrides") final List<TierPriceOverride> tierPriceOverrides ) {
        this.usageName = usageName;
        this.usageType = usageType;
        this.billingMode = billingMode;
        this.tierPriceOverrides = tierPriceOverrides;
    }

    public String getUsageName() {
        return usageName;
    }

    public UsageType getUsageType() {
        return usageType;
    }

    public BillingMode getBillingMode() {
        return billingMode;
    }

    public List<TierPriceOverride> getTierPriceOverrides() {
        return tierPriceOverrides;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsagePriceOverride)) {
            return false;
        }

        final UsagePriceOverride that = (UsagePriceOverride) o;

        if (usageName != null ? !usageName.equals(that.usageName) : that.usageName != null) {
            return false;
        }
        if (usageType != null ? !usageType.equals(that.usageType) : that.usageType != null) {
            return false;
        }
        if (billingMode != null ? !billingMode.equals(that.billingMode) : that.billingMode != null) {
            return false;
        }
        if (tierPriceOverrides != null ? !tierPriceOverrides.equals(that.tierPriceOverrides)  : that.tierPriceOverrides != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = usageName != null ? usageName.hashCode() : 0;
        result = 31 * result + (usageType != null ? usageType.hashCode() : 0);
        result = 31 * result + (billingMode != null ? billingMode.hashCode() : 0);
        result = 31 * result + (tierPriceOverrides != null ? tierPriceOverrides.hashCode() : 0);
        return result;
    }
}
