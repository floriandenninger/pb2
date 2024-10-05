package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import android.os.Parcel;
import defpackage.ahvx;
import defpackage.ecq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ecq implements f, ahvx {
    public ahvx a;

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayServiceListener");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        rN();
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.ahvx
    public final void rM() {
        this.a.rM();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f
    public final void rN() {
        this.a.rN();
    }
}
