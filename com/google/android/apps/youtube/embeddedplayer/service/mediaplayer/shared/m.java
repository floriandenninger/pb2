package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m extends ecp implements o {
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void a(int i, int i2) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(i2);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void f(Surface surface) {
        Parcel pn = pn();
        ecr.g(pn, surface);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void g() {
        pp(4, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void h() {
        pp(3, pn());
    }
}
