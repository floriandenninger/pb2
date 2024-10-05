package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import defpackage.aarm;
import defpackage.aasp;
import defpackage.arpj;
import defpackage.axqr;
import defpackage.azrw;
import defpackage.iom;
import defpackage.lyk;
import defpackage.ysl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g implements axqr {
    private final azrw a;
    private final azrw b;

    public g(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static g a(azrw azrwVar, azrw azrwVar2) {
        return new g(azrwVar, azrwVar2);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aasp get() {
        return new aasp((aarm) this.a.get(), (ysl) this.b.get(), arpj.a, lyk.e, iom.d);
    }
}
