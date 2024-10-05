package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ao implements Consumer {
    public final /* synthetic */ av a;

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.a.l((SimplePlaybackDescriptor) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
