package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends ecp implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f
    public final void a(i iVar) {
        Parcel pn = pn();
        ecr.i(pn, iVar);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f
    public final void f(int i, boolean z) {
        Parcel pn = pn();
        pn.writeInt(i);
        ecr.e(pn, z);
        pp(2, pn);
    }
}
