package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class c implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ e b;

    public c(e eVar, View view) {
        this.b = eVar;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.b.G(3);
    }
}
