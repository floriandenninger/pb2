package com.google.android.youtube.api.jar.client;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ h a;
    private final /* synthetic */ int b;

    public /* synthetic */ e(h hVar, int i) {
        this.b = i;
        this.a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a.N();
            return;
        }
        if (i == 1) {
            this.a.a.M();
            return;
        }
        if (i == 2) {
            RemoteEmbeddedPlayer remoteEmbeddedPlayer = this.a.a;
            remoteEmbeddedPlayer.f = -1L;
            remoteEmbeddedPlayer.g = -1L;
        } else if (i == 3) {
            this.a.a.R();
        } else {
            if (i != 4) {
                this.a.a.S();
                return;
            }
            RemoteEmbeddedPlayer remoteEmbeddedPlayer2 = this.a.a;
            remoteEmbeddedPlayer2.a = false;
            remoteEmbeddedPlayer2.P();
        }
    }
}
