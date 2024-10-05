package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.view.SurfaceHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e b;
    private final /* synthetic */ int c;

    public /* synthetic */ k(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar, int i, int i2) {
        this.c = i2;
        this.b = eVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = this.b;
            int i = this.a;
            SurfaceHolder surfaceHolder = eVar.c;
            if (surfaceHolder != null) {
                surfaceHolder.setFormat(i);
                return;
            }
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar2 = this.b;
        int i2 = this.a;
        SurfaceHolder surfaceHolder2 = eVar2.c;
        if (surfaceHolder2 != null) {
            surfaceHolder2.setType(i2);
        }
    }
}
