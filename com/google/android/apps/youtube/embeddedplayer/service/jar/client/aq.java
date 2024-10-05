package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import defpackage.alta;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aq implements Runnable {
    public final /* synthetic */ av a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ aq(av avVar, int i, int i2) {
        this.c = i2;
        this.a = avVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            av avVar = this.a;
            avVar.c.h.f(this.b);
        } else {
            av avVar2 = this.a;
            try {
                avVar2.k.j(this.b);
            } catch (RemoteException unused) {
                alta.B("Problem sending error to client.", new Object[0]);
            }
        }
    }
}
