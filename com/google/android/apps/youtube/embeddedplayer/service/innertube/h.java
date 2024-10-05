package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import defpackage.aaea;
import defpackage.aijk;
import defpackage.aone;
import defpackage.aqrt;
import defpackage.atws;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h implements aijk {
    public boolean a;
    private final aaea b;

    public h(aaea aaeaVar) {
        this.b = aaeaVar;
    }

    @Override // defpackage.aijk
    public final void a(aone aoneVar) {
        aqrt D = oba.D(this.b);
        if (D == null || !D.i) {
            boolean z = this.a;
            aoneVar.copyOnWrite();
            atws atwsVar = (atws) aoneVar.instance;
            atws atwsVar2 = atws.a;
            atwsVar.b |= 8192;
            atwsVar.o = z;
        }
    }
}
