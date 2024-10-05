package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import defpackage.acrb;
import defpackage.ahyf;
import defpackage.ahyl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ag implements ahyl {
    final /* synthetic */ ak a;

    public ag(ak akVar) {
        this.a = akVar;
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        ahyf.K(this.a.i, j);
        if (i == 1) {
            ak akVar = this.a;
            akVar.M = true;
            akVar.H();
            ak akVar2 = this.a;
            if (akVar2.N) {
                akVar2.nf();
                this.a.w.f(true);
                this.a.I(acrb.DOUBLE_TAP_TO_SEEK_SCRUB_USER_EDUCATION.Jk);
            }
            this.a.b.q();
            return;
        }
        if (i == 2) {
            this.a.b.p(j);
            return;
        }
        if (i == 3 || i == 4) {
            this.a.h.kP();
            ak akVar3 = this.a;
            akVar3.S(j == akVar3.i.a);
            ak akVar4 = this.a;
            if (akVar4.N) {
                akVar4.w.f(false);
                this.a.pA();
            }
            this.a.b.r(j);
            this.a.M = false;
        }
    }
}
