package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.graphics.SurfaceTexture;
import android.os.RemoteException;
import android.view.Surface;
import android.view.TextureView;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class s implements TextureView.SurfaceTextureListener {
    public com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o a;
    public t b;

    public s(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o oVar, t tVar) {
        oVar.getClass();
        this.a = oVar;
        tVar.getClass();
        this.b = tVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.a == null) {
            return;
        }
        try {
            this.a.f(new Surface(surfaceTexture));
        } catch (RemoteException e) {
            oba.B(e);
        }
        t tVar = this.b;
        if (tVar != null) {
            tVar.b.b();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o oVar = this.a;
        if (oVar != null) {
            try {
                oVar.g();
            } catch (RemoteException e) {
                oba.B(e);
            }
            t tVar = this.b;
            if (tVar != null) {
                tVar.b.a();
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o oVar = this.a;
        if (oVar != null) {
            try {
                oVar.a(i, i2);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o oVar = this.a;
        if (oVar != null) {
            try {
                oVar.h();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }
}
