package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import defpackage.puc;
import defpackage.puh;
import defpackage.qbi;
import defpackage.qbn;
import defpackage.qbp;
import defpackage.qbq;
import defpackage.qbr;
import defpackage.qbs;
import defpackage.qbt;
import defpackage.qbu;
import defpackage.qbv;
import defpackage.qcb;
import defpackage.qcd;
import defpackage.qce;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements qbp, qbr, qbt {
    static final puc a = new puc(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
    qcb b;
    qcd c;
    qce d;

    private static Object a(Class cls, String str) {
        try {
            str.getClass();
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            qbi.f(sb.toString());
            return null;
        }
    }

    @Override // defpackage.qbp
    public final View getBannerView() {
        return null;
    }

    @Override // defpackage.qbo
    public final void onDestroy() {
        qcb qcbVar = this.b;
        if (qcbVar != null) {
            qcbVar.a();
        }
        qcd qcdVar = this.c;
        if (qcdVar != null) {
            qcdVar.a();
        }
        qce qceVar = this.d;
        if (qceVar != null) {
            qceVar.a();
        }
    }

    @Override // defpackage.qbo
    public final void onPause() {
        qcb qcbVar = this.b;
        if (qcbVar != null) {
            qcbVar.b();
        }
        qcd qcdVar = this.c;
        if (qcdVar != null) {
            qcdVar.b();
        }
        qce qceVar = this.d;
        if (qceVar != null) {
            qceVar.b();
        }
    }

    @Override // defpackage.qbo
    public final void onResume() {
        qcb qcbVar = this.b;
        if (qcbVar != null) {
            qcbVar.c();
        }
        qcd qcdVar = this.c;
        if (qcdVar != null) {
            qcdVar.c();
        }
        qce qceVar = this.d;
        if (qceVar != null) {
            qceVar.c();
        }
    }

    @Override // defpackage.qbp
    public final void requestBannerAd(Context context, qbq qbqVar, Bundle bundle, puh puhVar, qbn qbnVar, Bundle bundle2) {
        qcb qcbVar = (qcb) a(qcb.class, bundle.getString("class_name"));
        this.b = qcbVar;
        if (qcbVar == null) {
            qbqVar.g(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        qcb qcbVar2 = this.b;
        qcbVar2.getClass();
        bundle.getString("parameter");
        qcbVar2.d();
    }

    @Override // defpackage.qbr
    public final void requestInterstitialAd(Context context, qbs qbsVar, Bundle bundle, qbn qbnVar, Bundle bundle2) {
        qcd qcdVar = (qcd) a(qcd.class, bundle.getString("class_name"));
        this.c = qcdVar;
        if (qcdVar == null) {
            qbsVar.h(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        qcd qcdVar2 = this.c;
        qcdVar2.getClass();
        bundle.getString("parameter");
        qcdVar2.e();
    }

    @Override // defpackage.qbt
    public final void requestNativeAd(Context context, qbu qbuVar, Bundle bundle, qbv qbvVar, Bundle bundle2) {
        qce qceVar = (qce) a(qce.class, bundle.getString("class_name"));
        this.d = qceVar;
        if (qceVar == null) {
            qbuVar.i(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        qce qceVar2 = this.d;
        qceVar2.getClass();
        bundle.getString("parameter");
        qceVar2.d();
    }

    @Override // defpackage.qbr
    public final void showInterstitial() {
        qcd qcdVar = this.c;
        if (qcdVar != null) {
            qcdVar.d();
        }
    }
}
