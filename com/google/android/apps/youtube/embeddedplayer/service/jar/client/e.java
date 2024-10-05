package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import defpackage.alvc;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.alvl;
import defpackage.alvs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ alvc a;
    private final /* synthetic */ int b;

    public /* synthetic */ e(alvc alvcVar, int i) {
        this.b = i;
        this.a = alvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                alvc alvcVar = this.a;
                alvi alviVar = alvcVar.O;
                if (alviVar == null || !alvcVar.au()) {
                    return;
                }
                try {
                    alviVar.pp(1, alviVar.pn());
                    return;
                } catch (RemoteException e) {
                    throw new alvs(e);
                }
            case 1:
                alvc alvcVar2 = this.a;
                alvi alviVar2 = alvcVar2.O;
                if (alviVar2 == null || !alvcVar2.au()) {
                    return;
                }
                try {
                    alviVar2.pp(3, alviVar2.pn());
                    return;
                } catch (RemoteException e2) {
                    throw new alvs(e2);
                }
            case 2:
                alvc alvcVar3 = this.a;
                alvl alvlVar = alvcVar3.K;
                if (alvlVar == null || !alvcVar3.au()) {
                    return;
                }
                try {
                    alvlVar.a();
                    return;
                } catch (RemoteException e3) {
                    throw new alvs(e3);
                }
            case 3:
                alvc alvcVar4 = this.a;
                alvh alvhVar = alvcVar4.P;
                if (alvhVar == null || !alvcVar4.au()) {
                    return;
                }
                try {
                    alvhVar.pp(2, alvhVar.pn());
                    return;
                } catch (RemoteException e4) {
                    throw new alvs(e4);
                }
            case 4:
                alvc alvcVar5 = this.a;
                alvh alvhVar2 = alvcVar5.P;
                if (alvhVar2 == null || !alvcVar5.au()) {
                    return;
                }
                try {
                    alvhVar2.pp(1, alvhVar2.pn());
                    return;
                } catch (RemoteException e5) {
                    throw new alvs(e5);
                }
            case 5:
                alvc alvcVar6 = this.a;
                alvl alvlVar2 = alvcVar6.K;
                if (alvlVar2 == null || !alvcVar6.au()) {
                    return;
                }
                try {
                    alvlVar2.f();
                    return;
                } catch (RemoteException e6) {
                    throw new alvs(e6);
                }
            case 6:
                alvc alvcVar7 = this.a;
                alvl alvlVar3 = alvcVar7.K;
                if (alvlVar3 == null || !alvcVar7.au()) {
                    return;
                }
                try {
                    alvlVar3.g();
                    return;
                } catch (RemoteException e7) {
                    throw new alvs(e7);
                }
            case 7:
                alvc alvcVar8 = this.a;
                alvh alvhVar3 = alvcVar8.P;
                if (alvhVar3 == null || !alvcVar8.au()) {
                    return;
                }
                try {
                    alvhVar3.pp(3, alvhVar3.pn());
                    return;
                } catch (RemoteException e8) {
                    throw new alvs(e8);
                }
            case 8:
                alvc alvcVar9 = this.a;
                alvi alviVar3 = alvcVar9.O;
                if (alviVar3 == null || !alvcVar9.au()) {
                    return;
                }
                try {
                    alviVar3.pp(5, alviVar3.pn());
                    return;
                } catch (RemoteException e9) {
                    throw new alvs(e9);
                }
            default:
                alvc alvcVar10 = this.a;
                alvi alviVar4 = alvcVar10.O;
                if (alviVar4 == null || !alvcVar10.au()) {
                    return;
                }
                try {
                    alviVar4.pp(4, alviVar4.pn());
                    return;
                } catch (RemoteException e10) {
                    throw new alvs(e10);
                }
        }
    }
}
