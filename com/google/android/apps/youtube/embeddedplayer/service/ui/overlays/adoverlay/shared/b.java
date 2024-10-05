package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import defpackage.aqvu;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecq implements c {
    public g a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.h b;
    private final Handler c;

    public b(g gVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
        gVar.getClass();
        this.a = gVar;
        handler.getClass();
        this.c = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void a(final int i, final int i2, final int i3) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
                if (gVar != null) {
                    gVar.m(i4, i5, i6);
                }
            }
        });
    }

    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.h hVar = this.b;
        if (hVar != null) {
            hVar.a = null;
            this.b = null;
        }
        this.a = null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void f(final int i) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                int i2 = i;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
                if (gVar != null) {
                    gVar.n(i2);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void g(final f fVar) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.e
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f fVar2 = fVar;
                if (bVar.a != null) {
                    bVar.b = new h(fVar2);
                    ((n) bVar.a).b = bVar.b;
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void h(CharSequence charSequence) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g(this, charSequence, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void i(final Bitmap bitmap) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                Bitmap bitmap2 = bitmap;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
                if (gVar != null) {
                    gVar.p(bitmap2);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void j(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void k(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 3));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void l(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 4));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void m(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void n(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 0));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void o(FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper) {
        final aqvu aqvuVar = (aqvu) fancyDismissibleDialogRendererWrapper.a;
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.f
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                aqvu aqvuVar2 = aqvuVar;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
                if (gVar != null) {
                    gVar.y(aqvuVar2);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void p(CharSequence charSequence) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g(this, charSequence, 0));
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
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
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        dVar = (f) queryLocalInterface;
                    } else {
                        dVar = new d(readStrongBinder);
                    }
                }
                g(dVar);
                break;
            case 2:
                n(ecr.j(parcel));
                break;
            case 3:
                k(ecr.j(parcel));
                break;
            case 4:
                h(ecr.b(parcel));
                break;
            case 5:
                a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                break;
            case 6:
                i((Bitmap) ecr.a(parcel, Bitmap.CREATOR));
                break;
            case 7:
                j(ecr.j(parcel));
                break;
            case 8:
                p(ecr.b(parcel));
                break;
            case 9:
                m(ecr.j(parcel));
                break;
            case 10:
                l(ecr.j(parcel));
                break;
            case 11:
                f(parcel.readInt());
                break;
            case 12:
                o((FancyDismissibleDialogRendererWrapper) ecr.a(parcel, FancyDismissibleDialogRendererWrapper.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
