package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.o;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.p;
import defpackage.ahxw;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecq implements c {
    public final ahxw a;
    private final Handler b;

    public b(ahxw ahxwVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
        ahxwVar.getClass();
        this.a = ahxwVar;
        handler.getClass();
        this.b = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void a() {
        this.b.post(new o(this, 0));
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            h();
        } else if (i == 2) {
            a();
        } else if (i == 3) {
            f();
        } else {
            if (i != 4) {
                return false;
            }
            g((Bitmap) ecr.a(parcel, Bitmap.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void f() {
        this.b.post(new o(this, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void g(Bitmap bitmap) {
        this.b.post(new p(this, bitmap));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void h() {
        this.b.post(new o(this, 1));
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
    }
}
