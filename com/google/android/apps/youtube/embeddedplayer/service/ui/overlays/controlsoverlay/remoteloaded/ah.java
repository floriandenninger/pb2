package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import defpackage.aicj;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ah implements aicj {
    final /* synthetic */ ak a;

    public ah(ak akVar) {
        this.a = akVar;
    }

    @Override // defpackage.aicj
    public final void J() {
        ak akVar = this.a;
        if (akVar.O) {
            return;
        }
        akVar.O = true;
        akVar.V();
    }

    @Override // defpackage.aicj
    public final void K() {
        ak akVar = this.a;
        if (akVar.O) {
            akVar.O = false;
            akVar.V();
        }
    }
}
