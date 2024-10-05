package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;

import defpackage.axqr;
import defpackage.ayaw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements axqr {
    private final a a;
    private final /* synthetic */ int b;

    public b(a aVar, int i) {
        this.b = i;
        this.a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar, 0);
    }

    public static b b(a aVar) {
        return new b(aVar, 1);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        if (this.b != 0) {
            return this.a.b;
        }
        String str = this.a.a;
        ayaw.k(str);
        return str;
    }
}
