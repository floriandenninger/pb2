package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final int a() {
        Parcel po = po(2, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final int f() {
        Parcel po = po(1, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void g(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void h() {
        pp(8, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void i(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(7, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void j() {
        pp(4, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void k(int i, int i2) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(i2);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void l(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(5, pn);
    }
}
