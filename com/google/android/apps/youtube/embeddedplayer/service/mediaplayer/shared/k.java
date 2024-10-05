package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.TextureView;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.s;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.t;
import defpackage.ecq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class k extends ecq implements l {
    public final Context a;
    public s b;
    public final t c;
    private final Handler d;

    public k(t tVar, Context context, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
        this.c = tVar;
        this.a = context;
        handler.getClass();
        this.d = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l
    public final void a(final o oVar) {
        this.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.r
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.k kVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.k.this;
                kVar.b = new s(oVar, kVar.c);
                TextureView textureView = new TextureView(kVar.a);
                textureView.setSurfaceTextureListener(kVar.b);
                t tVar = kVar.c;
                tVar.a = textureView;
                tVar.addView(textureView);
            }
        });
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        o mVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            mVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
            if (queryLocalInterface instanceof o) {
                mVar = (o) queryLocalInterface;
            } else {
                mVar = new m(readStrongBinder);
            }
        }
        a(mVar);
        parcel2.writeNoException();
        return true;
    }

    public k() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
    }
}
