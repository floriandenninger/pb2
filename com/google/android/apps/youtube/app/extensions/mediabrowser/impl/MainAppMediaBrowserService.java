package com.google.android.apps.youtube.app.extensions.mediabrowser.impl;

import android.support.v4.media.session.MediaSessionCompat$Token;
import defpackage.aikd;
import defpackage.aioc;
import defpackage.arb;
import defpackage.azrw;
import defpackage.gzq;
import defpackage.gzs;
import defpackage.hn;
import defpackage.ypn;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainAppMediaBrowserService extends gzq {
    public gzs f;
    public azrw g;
    public azrw h;

    @Override // defpackage.arm
    public final void b(arb arbVar) {
        arbVar.b(Collections.emptyList());
    }

    @Override // defpackage.arm
    public final ypn e(String str) {
        if (str.equals("com.android.systemui")) {
            return null;
        }
        return new ypn(null);
    }

    @Override // defpackage.gzq, defpackage.arm, android.app.Service
    public final void onCreate() {
        super.onCreate();
        hn hnVar = (hn) this.f.e.get();
        hnVar.l();
        MediaSessionCompat$Token b = hnVar.b();
        if (b != null) {
            if (this.e == null) {
                this.e = b;
                this.a.c(b);
                return;
            }
            throw new IllegalStateException("The session token has already been set");
        }
        throw new IllegalArgumentException("Session token may not be null");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((aikd) this.h.get()).b(((aioc) this.g.get()).s().k);
    }
}
