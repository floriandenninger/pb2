package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service;

import defpackage.xla;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ xla a;
    private final /* synthetic */ int b;

    public /* synthetic */ c(xla xlaVar, int i) {
        this.b = i;
        this.a = xlaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.b();
        } else {
            this.a.d();
        }
    }
}
