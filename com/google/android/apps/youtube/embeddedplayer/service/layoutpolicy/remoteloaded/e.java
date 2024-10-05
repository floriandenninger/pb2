package com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import defpackage.aqrt;
import defpackage.ayrs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ayrs {
    public final /* synthetic */ h a;
    private final /* synthetic */ int b;

    public /* synthetic */ e(h hVar, int i) {
        this.b = i;
        this.a = hVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            h hVar = this.a;
            aqrt aqrtVar = (aqrt) obj;
            if (aqrtVar != null) {
                hVar.n = (aqrtVar.c && h.b.contains(hVar.c.getContext().getPackageName())) ? g.RELAXED : g.STRICT;
                hVar.g = aqrtVar.d;
                hVar.h = aqrtVar.j;
                return;
            }
            return;
        }
        this.a.m = ((MutedAutoplayState) obj).g;
    }
}
