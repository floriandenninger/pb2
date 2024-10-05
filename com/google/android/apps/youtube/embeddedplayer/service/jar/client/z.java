package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import defpackage.ayrs;
import defpackage.nbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements ayrs {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ z(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            boolean z = this.a;
            nbq a = com.google.android.apps.youtube.embeddedplayer.service.model.f.a();
            a.a = z;
            ((av) obj).l = a.a();
            return;
        }
        boolean z2 = this.a;
        av avVar = (av) obj;
        if (avVar.n()) {
            return;
        }
        avVar.g.x(avVar, z2);
    }
}
