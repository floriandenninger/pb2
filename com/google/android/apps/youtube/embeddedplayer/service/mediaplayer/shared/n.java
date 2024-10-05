package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Handler;
import android.os.Parcel;
import android.view.Surface;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.n;
import defpackage.afkx;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class n extends ecq implements o {
    public com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e a;
    private final Handler b;

    public n(Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
        this.b = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void a(int i, int i2) {
        this.b.post(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.i(this, 2));
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            f((Surface) ecr.a(parcel, Surface.CREATOR));
        } else if (i == 2) {
            a(parcel.readInt(), parcel.readInt());
        } else if (i == 3) {
            h();
        } else {
            if (i != 4) {
                return false;
            }
            g();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void f(final Surface surface) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.j
            @Override // java.lang.Runnable
            public final void run() {
                n nVar = n.this;
                Surface surface2 = surface;
                e eVar = nVar.a;
                if (eVar != null) {
                    eVar.c = surface2;
                    afkx afkxVar = eVar.b;
                    if (afkxVar != null) {
                        afkxVar.c();
                    }
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void g() {
        this.b.post(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.i(this, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void h() {
        this.b.post(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.i(this, 0));
    }

    public n() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
    }
}
