package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b b;
    private final /* synthetic */ int c;

    public /* synthetic */ e(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b bVar, int i, int i2) {
        this.c = i2;
        this.b = bVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b bVar = this.b;
            bVar.a.rE(this.a);
        } else {
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b bVar2 = this.b;
            bVar2.a.g(this.a);
        }
    }
}
