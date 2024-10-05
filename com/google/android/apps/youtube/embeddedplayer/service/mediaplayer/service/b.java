package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.Surface;
import android.view.SurfaceHolder;
import defpackage.zga;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements SurfaceHolder {
    public final List a = new ArrayList();
    public com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f b;
    public com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i c;
    public Surface d;

    public b(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar) {
        this.b = fVar;
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SurfaceHolder.Callback) it.next()).surfaceDestroyed(this);
        }
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
        if (this.a.contains(callback)) {
            return;
        }
        this.a.add(callback);
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.d;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar = this.b;
        if (fVar != null) {
            try {
                return fVar.a();
            } catch (RemoteException unused) {
            }
        }
        return new Rect();
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar = this.b;
        if (fVar == null) {
            return false;
        }
        try {
            return fVar.l();
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException("Unsupported call to lockCanvas");
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
        this.a.remove(callback);
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i, int i2) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar = this.b;
        if (fVar != null) {
            try {
                fVar.f(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar = this.b;
        if (fVar != null) {
            try {
                fVar.g(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z) {
        zga.l("setKeepScreenOn should be through player Surface, not SurfaceHolder");
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar = this.b;
        if (fVar != null) {
            try {
                fVar.h(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar = this.b;
        if (fVar != null) {
            try {
                fVar.i();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.view.SurfaceHolder
    @Deprecated
    public final void setType(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f fVar = this.b;
        if (fVar != null) {
            try {
                fVar.k(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
        throw new UnsupportedOperationException("Unsupported call to unlockCanvasAndPost");
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException("Unsupported call to lockCanvas");
    }
}
