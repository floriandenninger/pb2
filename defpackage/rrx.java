package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrx {
    static {
        new Intent().setPackage("com.google.android.gsf.login").setAction("com.google.android.gsf.action.GET_GLS").addCategory("android.intent.category.DEFAULT");
    }

    public static String a(String str) {
        return "service_" + str;
    }
}
