package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.view.Surface;
import android.view.SurfaceHolder;
import defpackage.afkx;
import defpackage.aflb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c extends a implements SurfaceHolder.Callback {
    private final SurfaceHolder c;
    private boolean d;

    public c(SurfaceHolder surfaceHolder, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar) {
        super(cVar);
        surfaceHolder.getClass();
        this.c = surfaceHolder;
        surfaceHolder.addCallback(this);
    }

    @Override // defpackage.afky
    public final Surface A() {
        return ((b) this.c).d;
    }

    @Override // defpackage.afky
    public final SurfaceHolder B() {
        return this.c;
    }

    @Override // defpackage.afky
    public final aflb C() {
        return aflb.SURFACE;
    }

    @Override // defpackage.afkl
    public final void D() {
        Surface surface = ((b) this.c).d;
        if (surface != null) {
            surface.release();
        }
    }

    @Override // defpackage.afkl
    public final boolean E() {
        return this.d;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        afkx afkxVar = this.b;
        if (afkxVar != null) {
            afkxVar.b();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.d = true;
        afkx afkxVar = this.b;
        if (afkxVar != null) {
            afkxVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.d = false;
        afkx afkxVar = this.b;
        if (afkxVar != null) {
            afkxVar.d();
        }
    }
}
