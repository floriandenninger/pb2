package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g extends ecp implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void a(int i, int i2, int i3) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(i2);
        pn.writeInt(i3);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void f(Surface surface) {
        Parcel pn = pn();
        ecr.g(pn, surface);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void g() {
        pp(3, pn());
    }
}
