package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.Handler;
import android.os.Parcel;
import defpackage.ecq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ecq implements f {
    private final Handler a;
    private final Runnable b;

    public e(Handler handler, Runnable runnable) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiServiceListener");
        this.a = handler;
        this.b = runnable;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f
    public final void a() {
        this.a.post(this.b);
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a();
        parcel2.writeNoException();
        return true;
    }

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiServiceListener");
    }
}
