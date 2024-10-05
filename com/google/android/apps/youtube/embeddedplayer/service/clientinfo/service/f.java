package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;

import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f {
    public final String a;
    public final String b;
    public final String c;
    private int d;

    public f(String str, String str2, String str3) {
        zhq.n(str, "App package name cannot be null or empty");
        this.a = str;
        zhq.n(str2, "App versionName cannot be null or empty");
        this.b = str2;
        zhq.n(str3, "App developerKey cannot be null or empty");
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b) && this.c.equals(fVar.c);
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        this.d = hashCode;
        return hashCode;
    }
}
