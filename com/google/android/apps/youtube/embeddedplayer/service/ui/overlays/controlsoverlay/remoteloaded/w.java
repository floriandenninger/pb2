package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Consumer {
    public final /* synthetic */ ak a;
    private final /* synthetic */ int b;

    public /* synthetic */ w(ak akVar, int i) {
        this.b = i;
        this.a = akVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            this.a.P((View) obj);
        } else {
            this.a.R((View) obj);
        }
    }
}
