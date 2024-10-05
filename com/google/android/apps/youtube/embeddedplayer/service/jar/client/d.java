package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.alvc;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvs;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ alvc b;
    private final /* synthetic */ int c;

    public /* synthetic */ d(alvc alvcVar, boolean z, int i) {
        this.c = i;
        this.b = alvcVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            alvc alvcVar = this.b;
            boolean z = this.a;
            alvh alvhVar = alvcVar.P;
            if (alvhVar == null || !alvcVar.au()) {
                return;
            }
            try {
                Parcel pn = alvhVar.pn();
                ecr.e(pn, z);
                alvhVar.pp(4, pn);
                return;
            } catch (RemoteException e) {
                throw new alvs(e);
            }
        }
        alvc alvcVar2 = this.b;
        boolean z2 = this.a;
        alvg alvgVar = alvcVar2.Q;
        if (alvgVar == null || !alvcVar2.au()) {
            return;
        }
        try {
            Parcel pn2 = alvgVar.pn();
            ecr.e(pn2, z2);
            alvgVar.pp(1, pn2);
        } catch (RemoteException e2) {
            throw new alvs(e2);
        }
    }
}
