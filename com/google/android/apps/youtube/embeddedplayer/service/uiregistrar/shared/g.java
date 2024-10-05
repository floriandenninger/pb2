package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g extends ecp implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.i
    public final void a(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(1, pn);
    }
}
