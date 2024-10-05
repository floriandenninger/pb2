package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void a(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, false);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void f(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void g(long j) {
        Parcel pn = pn();
        pn.writeLong(j);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void h(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void i(CharSequence charSequence) {
        Parcel pn = pn();
        ecr.f(pn, charSequence);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void j() {
        pp(1, pn());
    }
}
