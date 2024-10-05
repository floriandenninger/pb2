package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends ecp implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f
    public final void a(BitmapKey bitmapKey, Bitmap bitmap) {
        Parcel pn = pn();
        ecr.g(pn, bitmapKey);
        ecr.g(pn, bitmap);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f
    public final void f(c cVar) {
        Parcel pn = pn();
        ecr.i(pn, cVar);
        pp(1, pn);
    }
}
