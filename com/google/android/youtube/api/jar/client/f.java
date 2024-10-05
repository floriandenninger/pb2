package com.google.android.youtube.api.jar.client;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ f(h hVar, long j, int i) {
        this.c = i;
        this.a = hVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                this.a.a.f = this.b;
                return;
            } else {
                this.a.a.f = this.b;
                return;
            }
        }
        h hVar = this.a;
        long j = this.b;
        RemoteEmbeddedPlayer remoteEmbeddedPlayer = hVar.a;
        remoteEmbeddedPlayer.f = j;
        remoteEmbeddedPlayer.a = false;
        remoteEmbeddedPlayer.P();
    }
}
