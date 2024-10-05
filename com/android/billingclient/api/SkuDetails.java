package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SkuDetails {
    public final JSONObject a;
    private final String b;

    public SkuDetails(String str) {
        this.b = str;
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final String a() {
        return this.a.optString("packageName");
    }

    public final String b() {
        return this.a.optString("productId");
    }

    public final String c() {
        return this.a.optString("skuDetailsToken");
    }

    public final String d() {
        return this.a.optString("type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.b, ((SkuDetails) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
