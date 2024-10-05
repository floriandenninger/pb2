package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c
    public final void a(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c
    public final void f(f fVar) {
        Parcel pn = pn();
        ecr.i(pn, fVar);
        pp(1, pn);
    }
}
