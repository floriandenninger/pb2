package com.google.android.youtube.api.jar.client;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class b implements com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b {
    final /* synthetic */ RemoteEmbeddedPlayer a;

    public b(RemoteEmbeddedPlayer remoteEmbeddedPlayer) {
        this.a = remoteEmbeddedPlayer;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b
    public final void a() {
        this.a.e = false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b
    public final void b() {
        RemoteEmbeddedPlayer remoteEmbeddedPlayer = this.a;
        remoteEmbeddedPlayer.e = true;
        if (remoteEmbeddedPlayer.d) {
            remoteEmbeddedPlayer.g();
        }
    }
}
