package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import defpackage.aaea;
import defpackage.afpi;
import defpackage.aijk;
import defpackage.aijo;
import defpackage.aijq;
import defpackage.aijr;
import defpackage.aone;
import defpackage.aqrt;
import defpackage.atws;
import defpackage.oba;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class l implements aijo {
    final Map a = new k();
    private final aaea b;

    public l(aaea aaeaVar) {
        this.b = aaeaVar;
    }

    public final void b(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    public final boolean c(String str) {
        return (str == null || this.a.get(str) == null || !((Boolean) this.a.get(str)).booleanValue()) ? false : true;
    }

    @Override // defpackage.aijo
    public final void qZ(aijr aijrVar) {
        aqrt D = oba.D(this.b);
        if (D == null || !D.i) {
            return;
        }
        final boolean c = c(aijrVar.K);
        aijrVar.a.add(new aijk() { // from class: com.google.android.apps.youtube.embeddedplayer.service.innertube.i
            @Override // defpackage.aijk
            public final void a(aone aoneVar) {
                boolean z = c;
                aoneVar.copyOnWrite();
                atws atwsVar = (atws) aoneVar.instance;
                atws atwsVar2 = atws.a;
                atwsVar.b |= 8192;
                atwsVar.o = z;
            }
        });
        aijrVar.d(new aijq() { // from class: com.google.android.apps.youtube.embeddedplayer.service.innertube.j
            @Override // defpackage.aijq
            public final void a(afpi afpiVar) {
                afpiVar.d("mutedAutoplay", c);
            }
        });
    }
}
