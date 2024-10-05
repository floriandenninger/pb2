package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.c
    public final void a(BitmapKey bitmapKey) {
        Parcel pn = pn();
        ecr.g(pn, bitmapKey);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.c
    public final void f(BitmapKey bitmapKey) {
        Parcel pn = pn();
        ecr.g(pn, bitmapKey);
        pp(1, pn);
    }
}
