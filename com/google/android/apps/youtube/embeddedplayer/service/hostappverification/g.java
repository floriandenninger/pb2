package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import android.net.Uri;
import defpackage.anfq;
import defpackage.angq;
import defpackage.anhy;
import defpackage.jom;
import defpackage.ysl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g {
    private final ysl a;
    private final String b;
    private final String c;
    private final String d;

    public g(ysl yslVar, com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f fVar, String str) {
        this.a = yslVar;
        this.b = fVar.c;
        this.c = fVar.a;
        this.d = str;
    }

    public final anhy a() {
        ysl yslVar = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        str.getClass();
        return anfq.i(yslVar.b(new f(new Uri.Builder().scheme("https").authority("youtubeembeddedplayer.googleapis.com").appendEncodedPath("v1beta1:verifyHostApp").appendQueryParameter("key", str).build().toString(), str, str2, str3)), jom.c, angq.a);
    }
}
