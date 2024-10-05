package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.MotionEvent;
import defpackage.zdh;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aj implements zdh {
    final /* synthetic */ ak a;

    public aj(ak akVar) {
        this.a = akVar;
    }

    @Override // defpackage.zdh
    public final void b(MotionEvent motionEvent) {
        if (this.a.np()) {
            if (this.a.U(motionEvent)) {
                ak akVar = this.a;
                aq aqVar = akVar.F;
                if (aqVar.e) {
                    aqVar.a(motionEvent, akVar.g);
                    return;
                }
            }
            ak akVar2 = this.a;
            if (akVar2.f166J) {
                if (akVar2.I.o) {
                    return;
                }
                akVar2.O();
            } else if (akVar2.T()) {
                this.a.H();
                this.a.Q(true);
            }
        }
    }
}
