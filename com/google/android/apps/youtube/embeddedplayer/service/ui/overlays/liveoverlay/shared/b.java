package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ahvy;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecq implements c {
    public final ahvy a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.f b;
    private final Handler c;

    public b(ahvy ahvyVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
        ahvyVar.getClass();
        this.a = ahvyVar;
        handler.getClass();
        this.c = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final int a() {
        return this.a.getHeight();
    }

    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.f fVar = this.b;
        if (fVar != null) {
            fVar.a = null;
            this.b = null;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final int f() {
        return this.a.getWidth();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void g() {
        Handler handler = this.c;
        final ahvy ahvyVar = this.a;
        ahvyVar.getClass();
        handler.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.e
            @Override // java.lang.Runnable
            public final void run() {
                ahvy.this.kV();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void h(final Bitmap bitmap) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b.this;
                bVar.a.p(bitmap);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void i(final f fVar) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b.this;
                bVar.b = new f(fVar);
                bVar.a.q(bVar.b);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void j(final CharSequence charSequence, final CharSequence charSequence2, final boolean z, final CharSequence charSequence3, final int i, final CharSequence charSequence4, final int i2) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b.this;
                bVar.a.t(charSequence, charSequence2, z, charSequence3, i, charSequence4, i2);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void k(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b.this;
                bVar.a.v(charSequence, charSequence2, charSequence3);
            }
        });
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        f dVar;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        dVar = (f) queryLocalInterface;
                    } else {
                        dVar = new d(readStrongBinder);
                    }
                }
                i(dVar);
                parcel2.writeNoException();
                return true;
            case 2:
                j(ecr.b(parcel), ecr.b(parcel), ecr.j(parcel), ecr.b(parcel), parcel.readInt(), ecr.b(parcel), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                k(ecr.b(parcel), ecr.b(parcel), ecr.b(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                g();
                parcel2.writeNoException();
                return true;
            case 5:
                int f = f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case 6:
                int a = a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 7:
                h((Bitmap) ecr.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
