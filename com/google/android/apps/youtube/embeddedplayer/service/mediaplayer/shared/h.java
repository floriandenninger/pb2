package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Handler;
import android.os.Parcel;
import android.view.Surface;
import android.view.SurfaceHolder;
import defpackage.ecq;
import defpackage.ecr;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h extends ecq implements i {
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b a;
    private final Handler b;

    public h(Handler handler, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b bVar) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
        this.b = handler;
        this.a = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void a(final int i, final int i2, final int i3) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.g
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.h hVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.h.this;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                b bVar = hVar.a;
                Iterator it = bVar.a.iterator();
                while (it.hasNext()) {
                    ((SurfaceHolder.Callback) it.next()).surfaceChanged(bVar, i4, i5, i6);
                }
            }
        });
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            f((Surface) ecr.a(parcel, Surface.CREATOR));
        } else if (i == 2) {
            a(parcel.readInt(), parcel.readInt(), parcel.readInt());
        } else {
            if (i != 3) {
                return false;
            }
            g();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void f(final Surface surface) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.h
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.h hVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.h.this;
                Surface surface2 = surface;
                b bVar = hVar.a;
                bVar.d = surface2;
                Iterator it = bVar.a.iterator();
                while (it.hasNext()) {
                    ((SurfaceHolder.Callback) it.next()).surfaceCreated(bVar);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void g() {
        Handler handler = this.b;
        final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b bVar = this.a;
        bVar.getClass();
        handler.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.f
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = b.this;
                Surface surface = bVar2.d;
                if (surface != null) {
                    surface.release();
                    bVar2.d = null;
                    bVar2.a();
                }
            }
        });
    }

    public h() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
    }
}
