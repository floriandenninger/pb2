package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;

import android.util.Base64;
import defpackage.axqr;
import defpackage.ayaw;
import defpackage.wbs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e implements axqr {
    private final d a;
    private final /* synthetic */ int b;

    public e(d dVar, int i) {
        this.b = i;
        this.a = dVar;
    }

    public static e a(d dVar) {
        return new e(dVar, 0);
    }

    public static e b(d dVar) {
        return new e(dVar, 1);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        if (this.b != 0) {
            return this.a.a;
        }
        String encodeToString = Base64.encodeToString(wbs.af(this.a.a.b().toByteArray()), 11);
        ayaw.k(encodeToString);
        return encodeToString;
    }
}
