package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.e;
import defpackage.ecq;
import defpackage.ecr;
import defpackage.xla;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ecq implements f, xla {
    public xla a;
    private final Handler b;

    public e(Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
        this.b = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f
    public final void a(final Bundle bundle) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service.b
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.a.a(bundle);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f
    public final void b() {
        Handler handler = this.b;
        xla xlaVar = this.a;
        xlaVar.getClass();
        handler.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service.c(xlaVar, 1));
    }

    @Override // defpackage.xla
    public final void c(boolean z) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f
    public final void d() {
        Handler handler = this.b;
        xla xlaVar = this.a;
        xlaVar.getClass();
        handler.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service.c(xlaVar, 0));
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            b();
        } else if (i == 2) {
            a((Bundle) ecr.a(parcel, Bundle.CREATOR));
        } else if (i == 3) {
            d();
        } else {
            if (i != 4) {
                return false;
            }
            e(parcel.readInt(), parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f
    public final void e(final int i, final int i2) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service.a
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.a.e(i, i2);
            }
        });
    }

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
    }
}
