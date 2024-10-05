package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import defpackage.aase;
import defpackage.afsy;
import defpackage.ajoy;
import defpackage.amkq;
import defpackage.aone;
import defpackage.arpi;
import defpackage.arpk;
import defpackage.arpl;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends aase {
    public e(ajoy ajoyVar, afsy afsyVar, aone aoneVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, afsyVar.c(), "embedded_player", aoneVar, null, null, null);
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        arpl arplVar;
        arpk arpkVar;
        aone aoneVar = (aone) a();
        arpi arpiVar = (arpi) aoneVar.instance;
        if (arpiVar.c == 2) {
            arplVar = (arpl) arpiVar.d;
        } else {
            arplVar = arpl.a;
        }
        boolean z = !arplVar.c.isEmpty();
        arpi arpiVar2 = (arpi) aoneVar.instance;
        if (arpiVar2.c == 3) {
            arpkVar = (arpk) arpiVar2.d;
        } else {
            arpkVar = arpk.a;
        }
        amkq.N((!arpkVar.c.isEmpty()) ^ z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return amkq.b(a(), ((e) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }
}
