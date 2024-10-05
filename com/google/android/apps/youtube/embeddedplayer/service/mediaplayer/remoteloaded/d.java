package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ c a;
    private final /* synthetic */ int b;

    public /* synthetic */ d(c cVar, int i) {
        this.b = i;
        this.a = cVar;
    }

    public d(c cVar, int i, byte[] bArr) {
        this.b = i;
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.f();
        } else if (i != 1) {
            this.a.e();
        } else {
            this.a.h();
        }
    }
}
