package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class o implements Runnable {
    final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b a;
    private final /* synthetic */ int b;

    public o(com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b bVar, int i) {
        this.b = i;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a.kV();
        } else if (i != 1) {
            this.a.a.nw();
        } else {
            this.a.a.kX();
        }
    }
}
