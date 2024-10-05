package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Purchase {
    private final String a;
    private final String b;

    public Purchase(String str, String str2) {
        this.a = str;
        this.b = str2;
        new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.a) && TextUtils.equals(this.b, purchase.b);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return str.length() != 0 ? "Purchase. Json: ".concat(str) : new String("Purchase. Json: ");
    }
}
