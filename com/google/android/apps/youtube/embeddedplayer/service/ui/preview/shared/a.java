package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void a() {
        pp(2, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void f() {
        pp(3, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void g(Bitmap bitmap) {
        Parcel pn = pn();
        ecr.g(pn, bitmap);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void h() {
        pp(1, pn());
    }
}
