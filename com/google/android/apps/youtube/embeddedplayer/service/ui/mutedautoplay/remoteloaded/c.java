package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import defpackage.aqrt;
import defpackage.ayrs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ayrs {
    public final /* synthetic */ d a;
    private final /* synthetic */ int b;

    public /* synthetic */ c(d dVar, int i) {
        this.b = i;
        this.a = dVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            d dVar = this.a;
            PlayerViewModeData playerViewModeData = (PlayerViewModeData) obj;
            if (playerViewModeData == null) {
                return;
            }
            int i2 = playerViewModeData.a;
            dVar.m = i2;
            if (i2 == 2) {
                dVar.aa();
                return;
            } else {
                dVar.X();
                return;
            }
        }
        if (i != 1) {
            this.a.n = ((aqrt) obj).l;
            return;
        }
        d dVar2 = this.a;
        MutedAutoplayState mutedAutoplayState = (MutedAutoplayState) obj;
        if (mutedAutoplayState == null) {
            return;
        }
        dVar2.l = mutedAutoplayState;
        dVar2.f = mutedAutoplayState.e;
        dVar2.g = mutedAutoplayState.f;
        dVar2.h = mutedAutoplayState.d;
        dVar2.j = mutedAutoplayState.b;
        dVar2.Y();
    }
}
