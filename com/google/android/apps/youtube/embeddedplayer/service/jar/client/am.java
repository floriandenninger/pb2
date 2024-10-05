package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import defpackage.alta;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class am implements Runnable {
    public final /* synthetic */ av a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ am(av avVar, boolean z, int i) {
        this.c = i;
        this.a = avVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            av avVar = this.a;
            try {
                avVar.k.i(this.b);
                return;
            } catch (RemoteException unused) {
                alta.B("Problem sending ad events authorization to client.", new Object[0]);
                return;
            }
        }
        if (i == 1) {
            av avVar2 = this.a;
            try {
                avVar2.k.k(this.b);
                return;
            } catch (RemoteException unused2) {
                alta.B("Cannot send fullscreen event, client disconnected.", new Object[0]);
                return;
            }
        }
        if (i == 2) {
            av avVar3 = this.a;
            avVar3.c.h.p(this.b);
        } else {
            av avVar4 = this.a;
            avVar4.c.h.e(this.b);
        }
    }
}
