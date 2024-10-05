package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class o implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c {
    private n a = n.a;
    private n b = n.a;
    private n c = n.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(av avVar) {
        if (this.a.c(avVar)) {
            return;
        }
        this.a = new n(avVar);
        n nVar = this.b;
        this.c = nVar;
        if (nVar.equals(n.a)) {
            this.b = this.a;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final synchronized void b(BusSupported$Data busSupported$Data) {
        if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.PLAYBACK_EVENT_DATA) && (busSupported$Data instanceof PlaybackEventData)) {
            PlaybackEventData playbackEventData = (PlaybackEventData) busSupported$Data;
            if (playbackEventData.b() == 5) {
                this.c.b(playbackEventData);
                this.c = n.a;
                this.b = this.a;
            } else {
                if (playbackEventData.b() == 1) {
                    this.c.a();
                    this.c = n.a;
                    this.b = this.a;
                }
                this.b.b(playbackEventData);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void e() {
    }
}
