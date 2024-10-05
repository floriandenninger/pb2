package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import android.view.View;
import defpackage.alta;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ap implements Runnable {
    public final /* synthetic */ av a;
    private final /* synthetic */ int b;

    public /* synthetic */ ap(av avVar, int i) {
        this.b = i;
        this.a = avVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            av avVar = this.a;
            com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c cVar = avVar.c;
            cVar.h.d(avVar.j);
            return;
        }
        if (i == 1) {
            try {
                this.a.k.g();
            } catch (RemoteException unused) {
                alta.B("Problem dismissing fullscreen view.", new Object[0]);
            }
        } else {
            Optional a = this.a.c.h.a();
            if (a.isPresent()) {
                ((View) a.get()).setVisibility(0);
            }
        }
    }
}
