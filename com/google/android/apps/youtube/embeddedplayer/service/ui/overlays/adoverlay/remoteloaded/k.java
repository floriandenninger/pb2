package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import defpackage.aahd;
import defpackage.aqrt;
import defpackage.ayrs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements ayrs {
    public final /* synthetic */ n a;
    private final /* synthetic */ int b;

    public /* synthetic */ k(n nVar, int i) {
        this.b = i;
        this.a = nVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b != 0) {
            this.a.a = (aahd) obj;
        } else {
            this.a.d = ((aqrt) obj).l;
        }
    }
}
