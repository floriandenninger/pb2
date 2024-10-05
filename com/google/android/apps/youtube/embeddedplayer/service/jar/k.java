package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.aq;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.ErrorData;
import com.google.android.apps.youtube.embeddedplayer.service.model.FragmentKeyData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class k implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c {
    final /* synthetic */ m a;
    private final /* synthetic */ int b;

    public k(m mVar, int i) {
        this.b = i;
        this.a = mVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void e() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void b(BusSupported$Data busSupported$Data) {
        if (this.b == 0) {
            if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.FRAGMENT_KEY_DATA) && (busSupported$Data instanceof FragmentKeyData)) {
                this.a.e.a(((FragmentKeyData) busSupported$Data).a(), this.a.b);
                return;
            }
            return;
        }
        if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.ERROR_DATA) && (busSupported$Data instanceof ErrorData)) {
            int i = ((ErrorData) busSupported$Data).a;
            av avVar = this.a.b;
            if (avVar != null) {
                avVar.d.post(new aq(avVar, i, 1));
            }
        }
    }
}
