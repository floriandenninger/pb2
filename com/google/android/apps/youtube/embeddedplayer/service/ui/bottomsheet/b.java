package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.view.View;
import defpackage.algb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends algb {
    final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    @Override // defpackage.algb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r2, int r3) {
        /*
            r1 = this;
            r2 = 4
            r0 = 5
            if (r3 == r0) goto L7
            if (r3 != r2) goto Lc
            r3 = 4
        L7:
            com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e r2 = r1.a
            r2.cancel()
        Lc:
            r2 = 3
            if (r3 != r2) goto L14
            com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e r2 = r1.a
            r3 = 0
            r2.c = r3
        L14:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.b.b(android.view.View, int):void");
    }

    @Override // defpackage.algb
    public final void mx(View view, float f) {
        e eVar = this.a;
        if (eVar.c) {
            eVar.a(0.6f);
        } else if (f >= 0.0f) {
            eVar.a(f * 0.6f);
        }
    }
}
