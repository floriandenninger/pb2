package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.os.RemoteException;
import android.view.SurfaceHolder;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class q implements SurfaceHolder.Callback {
    public com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i a;
    public i b;

    public q(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i iVar, i iVar2) {
        iVar.getClass();
        this.a = iVar;
        iVar2.getClass();
        this.b = iVar2;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i iVar = this.a;
        if (iVar != null) {
            try {
                iVar.a(i, i2, i3);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i iVar = this.a;
        if (iVar != null) {
            try {
                iVar.f(surfaceHolder.getSurface());
            } catch (RemoteException e) {
                oba.B(e);
            }
            i iVar2 = this.b;
            if (iVar2 != null) {
                surfaceHolder.getSurface();
                iVar2.a.b();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i iVar = this.a;
        if (iVar != null) {
            try {
                iVar.g();
            } catch (RemoteException e) {
                oba.B(e);
            }
            i iVar2 = this.b;
            if (iVar2 != null) {
                iVar2.a.a();
            }
        }
    }
}
