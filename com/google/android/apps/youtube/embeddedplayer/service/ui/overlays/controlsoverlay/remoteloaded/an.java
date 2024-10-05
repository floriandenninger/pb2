package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class an implements View.OnAttachStateChangeListener {
    final /* synthetic */ aq a;

    public an(aq aqVar) {
        this.a = aqVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aq aqVar = this.a;
        aqVar.c.removeCallbacks(aqVar.b);
    }
}
