package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final int a() {
        Parcel po = po(6, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final int f() {
        Parcel po = po(5, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void g() {
        pp(4, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void h(Bitmap bitmap) {
        Parcel pn = pn();
        ecr.g(pn, bitmap);
        pp(7, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void i(f fVar) {
        Parcel pn = pn();
        ecr.i(pn, fVar);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void j(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        Parcel pn = pn();
        ecr.f(pn, charSequence);
        ecr.f(pn, charSequence2);
        ecr.e(pn, z);
        ecr.f(pn, charSequence3);
        pn.writeInt(i);
        ecr.f(pn, charSequence4);
        pn.writeInt(i2);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void k(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Parcel pn = pn();
        ecr.f(pn, charSequence);
        ecr.f(pn, charSequence2);
        ecr.f(pn, charSequence3);
        pp(3, pn);
    }
}
