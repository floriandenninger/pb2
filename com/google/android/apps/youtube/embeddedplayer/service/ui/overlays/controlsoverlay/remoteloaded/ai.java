package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.MotionEvent;
import defpackage.aicf;
import defpackage.zdd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ai implements zdd {
    final /* synthetic */ ak a;

    public ai(ak akVar) {
        this.a = akVar;
    }

    @Override // defpackage.zdd
    public final void nG(MotionEvent motionEvent, boolean z) {
        if (this.a.U(motionEvent)) {
            ak akVar = this.a;
            akVar.F.a(motionEvent, akVar.g);
        }
    }

    @Override // defpackage.zdd
    public final boolean nL(MotionEvent motionEvent, boolean z) {
        if (this.a.np()) {
            ak akVar = this.a;
            if (akVar.N && !akVar.F.e && aicf.b((int) motionEvent.getX(), this.a.g.getWidth(), false) != 0) {
                return true;
            }
        }
        return false;
    }
}
