package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import defpackage.aqrt;
import defpackage.ayrs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ab implements ayrs {
    public final /* synthetic */ ak a;
    private final /* synthetic */ int b;

    public /* synthetic */ ab(ak akVar, int i) {
        this.b = i;
        this.a = akVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.T = (com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c) obj;
            return;
        }
        if (i == 1) {
            ak akVar = this.a;
            int i2 = ((PlayerViewModeData) obj).a;
            akVar.R = i2;
            if (i2 == 1) {
                akVar.kX();
                return;
            } else {
                akVar.kV();
                return;
            }
        }
        this.a.S = ((aqrt) obj).l;
    }
}
