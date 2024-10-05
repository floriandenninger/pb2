package com.google.ads.mediation.customevent;

import android.os.RemoteException;
import defpackage.dvc;
import defpackage.dwu;
import defpackage.dwv;
import defpackage.dwy;
import defpackage.dxa;
import defpackage.dxb;
import defpackage.dxc;
import defpackage.pvy;
import defpackage.qai;
import defpackage.qaj;
import defpackage.qar;
import defpackage.qbg;
import defpackage.qbi;
import defpackage.qcc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements dwu, dwv {
    dxa a;
    dxb b;

    private static Object h() {
        try {
            return Class.forName(null).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder("null".length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: null. ");
            sb.append(message);
            qbi.f(sb.toString());
            return null;
        }
    }

    @Override // defpackage.dwt
    public final Class a() {
        return qcc.class;
    }

    @Override // defpackage.dwt
    public final Class b() {
        return dxc.class;
    }

    @Override // defpackage.dwt
    public final void c() {
        dxa dxaVar = this.a;
        if (dxaVar != null) {
            dxaVar.a();
        }
        dxb dxbVar = this.b;
        if (dxbVar != null) {
            dxbVar.a();
        }
    }

    @Override // defpackage.dwu
    public final void d() {
    }

    @Override // defpackage.dwu
    public final /* bridge */ /* synthetic */ void e(qaj qajVar, dwy dwyVar, qcc qccVar) {
        dxc dxcVar = (dxc) dwyVar;
        String str = dxcVar.b;
        dxa dxaVar = (dxa) h();
        this.a = dxaVar;
        if (dxaVar == null) {
            dvc dvcVar = dvc.INTERNAL_ERROR;
            String valueOf = String.valueOf(dvcVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("Adapter called onFailedToReceiveAd with error. ");
            sb.append(valueOf);
            qbi.b(sb.toString());
            pvy.c();
            if (!qbg.f()) {
                qbi.h("#008 Must be called on the main UI thread.");
                qbg.a.post(new qai(qajVar, dvcVar, 1));
                return;
            } else {
                try {
                    qajVar.a.g(qar.a(dvcVar));
                    return;
                } catch (RemoteException e) {
                    qbi.i("#007 Could not call remote method.", e);
                    return;
                }
            }
        }
        if (qccVar != null) {
            String str2 = dxcVar.a;
            qccVar.a();
        }
        dxa dxaVar2 = this.a;
        String str3 = dxcVar.a;
        String str4 = dxcVar.c;
        dxaVar2.b();
    }

    @Override // defpackage.dwv
    public final void f() {
        this.b.b();
    }

    @Override // defpackage.dwv
    public final /* bridge */ /* synthetic */ void g(qaj qajVar, dwy dwyVar, qcc qccVar) {
        dxc dxcVar = (dxc) dwyVar;
        String str = dxcVar.b;
        dxb dxbVar = (dxb) h();
        this.b = dxbVar;
        if (dxbVar == null) {
            dvc dvcVar = dvc.INTERNAL_ERROR;
            String valueOf = String.valueOf(dvcVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("Adapter called onFailedToReceiveAd with error ");
            sb.append(valueOf);
            sb.append(".");
            qbi.b(sb.toString());
            pvy.c();
            if (!qbg.f()) {
                qbi.h("#008 Must be called on the main UI thread.");
                qbg.a.post(new qai(qajVar, dvcVar, 0));
                return;
            } else {
                try {
                    qajVar.a.g(qar.a(dvcVar));
                    return;
                } catch (RemoteException e) {
                    qbi.i("#007 Could not call remote method.", e);
                    return;
                }
            }
        }
        if (qccVar != null) {
            String str2 = dxcVar.a;
            qccVar.a();
        }
        dxb dxbVar2 = this.b;
        String str3 = dxcVar.a;
        String str4 = dxcVar.c;
        dxbVar2.c();
    }
}
