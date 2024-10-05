package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.view.Surface;
import android.view.SurfaceHolder;
import defpackage.aflb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends a {
    public Surface c;

    public e(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar) {
        super(cVar);
    }

    @Override // defpackage.afky
    public final Surface A() {
        return this.c;
    }

    @Override // defpackage.afky
    public final SurfaceHolder B() {
        return null;
    }

    @Override // defpackage.afky
    public final aflb C() {
        return aflb.TEXTURE;
    }

    @Override // defpackage.afkl
    public final void D() {
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
    }

    @Override // defpackage.afkl
    public final boolean E() {
        return this.c != null;
    }
}
