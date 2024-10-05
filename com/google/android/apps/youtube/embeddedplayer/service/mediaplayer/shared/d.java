package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends ecp implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final Rect a() {
        Parcel po = po(3, pn());
        Rect rect = (Rect) ecr.a(po, Rect.CREATOR);
        po.recycle();
        return rect;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void f(int i, int i2) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(i2);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void g(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void h(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void i() {
        pp(7, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void j(i iVar) {
        Parcel pn = pn();
        ecr.i(pn, iVar);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void k(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(8, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final boolean l() {
        Parcel po = po(2, pn());
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }
}
