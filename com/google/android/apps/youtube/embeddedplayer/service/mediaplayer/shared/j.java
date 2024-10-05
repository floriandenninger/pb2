package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j extends ecp implements l {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l
    public final void a(o oVar) {
        Parcel pn = pn();
        ecr.i(pn, oVar);
        pp(1, pn);
    }
}
