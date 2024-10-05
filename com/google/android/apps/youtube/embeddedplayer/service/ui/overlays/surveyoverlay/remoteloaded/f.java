package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.oba;
import defpackage.xiz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements xiz {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f a;

    public f(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    @Override // defpackage.xiz
    public final void a(Bundle bundle) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.a(bundle);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.xiz
    public final void b(int[] iArr) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.f(iArr);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.xiz
    public final void c(int i, int i2) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.g(i, i2);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }
}
