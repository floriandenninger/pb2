package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.i;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.apxf;
import defpackage.aqsz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements i {
    public static int a = 1;
    public int b;
    public final SparseArray c = new SparseArray();
    private final f d;
    private final aahd e;

    public d(f fVar, aahd aahdVar) {
        this.d = fVar;
        this.e = aahdVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.i
    public final void a(int i) {
        aqsz aqszVar = (aqsz) this.c.get(i);
        if (aqszVar == null) {
            return;
        }
        this.d.j(aqszVar.k.I());
        aahd aahdVar = this.e;
        apxf apxfVar = aqszVar.j;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahc.a(aahdVar, apxfVar);
    }
}
