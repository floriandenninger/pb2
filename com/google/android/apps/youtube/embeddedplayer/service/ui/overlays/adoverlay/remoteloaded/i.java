package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ n a;
    private final /* synthetic */ int b;

    public /* synthetic */ i(n nVar, int i) {
        this.b = i;
        this.a = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.b.d();
        } else if (i != 1) {
            this.a.b.b();
        } else {
            this.a.b.a(null);
        }
    }
}
