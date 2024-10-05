package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class p implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b b;

    public p(com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b bVar, Bitmap bitmap) {
        this.b = bVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.b(this.a);
    }
}
