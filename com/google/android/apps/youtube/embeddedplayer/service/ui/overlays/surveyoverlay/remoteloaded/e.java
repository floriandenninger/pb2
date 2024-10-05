package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded;

import defpackage.xja;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ xja a;
    private final /* synthetic */ int b;

    public /* synthetic */ e(xja xjaVar, int i) {
        this.b = i;
        this.a = xjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.h();
        } else if (i != 1) {
            this.a.l();
        } else {
            this.a.e();
        }
    }
}
