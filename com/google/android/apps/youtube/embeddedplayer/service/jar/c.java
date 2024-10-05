package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.HotConfigData;
import defpackage.aqrt;
import defpackage.azrh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c {
    public static final c a = new c();
    private aqrt c = aqrt.a;
    public final azrh b = azrh.e();

    private c() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void b(BusSupported$Data busSupported$Data) {
        if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.HOT_CONFIG_DATA) && (busSupported$Data instanceof HotConfigData)) {
            aqrt aqrtVar = ((HotConfigData) busSupported$Data).a;
            this.c = aqrtVar;
            this.b.c(aqrtVar);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void e() {
    }
}
