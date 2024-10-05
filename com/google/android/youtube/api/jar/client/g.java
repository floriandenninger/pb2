package com.google.android.youtube.api.jar.client;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    private final /* synthetic */ int d;

    public /* synthetic */ g(h hVar, long j, long j2, int i) {
        this.d = i;
        this.a = hVar;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            h hVar = this.a;
            long j = this.b;
            long j2 = this.c;
            RemoteEmbeddedPlayer remoteEmbeddedPlayer = hVar.a;
            remoteEmbeddedPlayer.f = j;
            remoteEmbeddedPlayer.g = j2;
            return;
        }
        h hVar2 = this.a;
        long j3 = this.b;
        long j4 = this.c;
        RemoteEmbeddedPlayer remoteEmbeddedPlayer2 = hVar2.a;
        remoteEmbeddedPlayer2.f = j3;
        remoteEmbeddedPlayer2.g = j4;
        remoteEmbeddedPlayer2.a = true;
        remoteEmbeddedPlayer2.Q();
    }
}
