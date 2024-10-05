package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends ecp implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f
    public final void a() {
        pp(3, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f
    public final void f(i iVar) {
        Parcel pn = pn();
        ecr.i(pn, iVar);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f
    public final void g(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(2, pn);
    }
}
