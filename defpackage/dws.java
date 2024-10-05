package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dws implements qbp, qch, qbt, qbz, qbx {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private pue adLoader;
    protected pui mAdView;
    public qbl mInterstitialAd;

    public pug buildAdRequest(Context context, qbn qbnVar, Bundle bundle, Bundle bundle2) {
        puf pufVar = new puf();
        Date d = qbnVar.d();
        if (d != null) {
            pufVar.a.g = d;
        }
        int a = qbnVar.a();
        if (a != 0) {
            pufVar.a.i = a;
        }
        Set e = qbnVar.e();
        if (e != null) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                pufVar.a.a.add((String) it.next());
            }
        }
        Location c = qbnVar.c();
        if (c != null) {
            pufVar.a.j = c;
        }
        if (qbnVar.g()) {
            pvy.c();
            pufVar.a.a(qbg.h(context));
        }
        if (qbnVar.b() != -1) {
            pufVar.a.k = qbnVar.b() != 1 ? 0 : 1;
        }
        pufVar.a.l = qbnVar.f();
        Bundle buildExtrasBundle = buildExtrasBundle(bundle, bundle2);
        pufVar.a.b.putBundle(AdMobAdapter.class.getName(), buildExtrasBundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && buildExtrasBundle.getBoolean("_emulatorLiveAds")) {
            pufVar.a.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return new pug(pufVar);
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // defpackage.qbp
    public View getBannerView() {
        return this.mAdView;
    }

    qbl getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // defpackage.qch
    public Bundle getInterstitialAdapterInfo() {
        ajbh ajbhVar = new ajbh((byte[]) null, (char[]) null);
        ajbhVar.i = 1;
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", ajbhVar.i);
        return bundle;
    }

    @Override // defpackage.qbz
    public pxn getVideoController() {
        pui puiVar = this.mAdView;
        if (puiVar != null) {
            return puiVar.a.c.a();
        }
        return null;
    }

    public pud newAdLoader(Context context, String str) {
        qip.az(context, "context cannot be null");
        return new pud(context, (pwp) new pvv(pvy.a(), context, str, new pzs()).d(context));
    }

    @Override // defpackage.qbo
    public void onDestroy() {
        pui puiVar = this.mAdView;
        if (puiVar != null) {
            try {
                pwt pwtVar = puiVar.a.f;
                if (pwtVar != null) {
                    pwtVar.h();
                }
            } catch (RemoteException e) {
                qbi.i("#007 Could not call remote method.", e);
            }
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // defpackage.qbx
    public void onImmersiveModeUpdated(boolean z) {
        qbl qblVar = this.mInterstitialAd;
        if (qblVar != null) {
            qblVar.b(z);
        }
    }

    @Override // defpackage.qbo
    public void onPause() {
        pui puiVar = this.mAdView;
        if (puiVar != null) {
            try {
                pwt pwtVar = puiVar.a.f;
                if (pwtVar != null) {
                    pwtVar.j();
                }
            } catch (RemoteException e) {
                qbi.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // defpackage.qbo
    public void onResume() {
        pui puiVar = this.mAdView;
        if (puiVar != null) {
            try {
                pwt pwtVar = puiVar.a.f;
                if (pwtVar != null) {
                    pwtVar.k();
                }
            } catch (RemoteException e) {
                qbi.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // defpackage.qbp
    public void requestBannerAd(Context context, qbq qbqVar, Bundle bundle, puh puhVar, qbn qbnVar, Bundle bundle2) {
        pwt pwtVar;
        pui puiVar = new pui(context);
        this.mAdView = puiVar;
        puh puhVar2 = new puh(puhVar.c, puhVar.d);
        pxs pxsVar = puiVar.a;
        puh[] puhVarArr = {puhVar2};
        if (pxsVar.e == null) {
            pxsVar.e = puhVarArr;
            try {
                pwt pwtVar2 = pxsVar.f;
                if (pwtVar2 != null) {
                    pwtVar2.n(pxs.b(pxsVar.h.getContext(), pxsVar.e));
                }
            } catch (RemoteException e) {
                qbi.i("#007 Could not call remote method.", e);
            }
            pxsVar.h.requestLayout();
            pui puiVar2 = this.mAdView;
            String adUnitId = getAdUnitId(bundle);
            pxs pxsVar2 = puiVar2.a;
            if (pxsVar2.g == null) {
                pxsVar2.g = adUnitId;
                pui puiVar3 = this.mAdView;
                dwp dwpVar = new dwp(qbqVar);
                pvz pvzVar = puiVar3.a.d;
                synchronized (pvzVar.a) {
                    pvzVar.b = dwpVar;
                }
                pxs pxsVar3 = puiVar3.a;
                try {
                    pxsVar3.i = dwpVar;
                    pwt pwtVar3 = pxsVar3.f;
                    if (pwtVar3 != null) {
                        pwtVar3.l(new pwc(dwpVar));
                    }
                } catch (RemoteException e2) {
                    qbi.i("#007 Could not call remote method.", e2);
                }
                pxs pxsVar4 = puiVar3.a;
                try {
                    pxsVar4.j = dwpVar;
                    pwt pwtVar4 = pxsVar4.f;
                    if (pwtVar4 != null) {
                        pwtVar4.o(new pwx(dwpVar));
                    }
                } catch (RemoteException e3) {
                    qbi.i("#007 Could not call remote method.", e3);
                }
                pui puiVar4 = this.mAdView;
                pug buildAdRequest = buildAdRequest(context, qbnVar, bundle2, bundle);
                pxs pxsVar5 = puiVar4.a;
                pxq pxqVar = buildAdRequest.a;
                try {
                    if (pxsVar5.f == null) {
                        if (pxsVar5.e == null || pxsVar5.g == null) {
                            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                        }
                        Context context2 = pxsVar5.h.getContext();
                        AdSizeParcel b = pxs.b(context2, pxsVar5.e);
                        if ("search_v2".equals(b.a)) {
                            pwtVar = (pwt) new pvt(pvy.a(), context2, b, pxsVar5.g).d(context2);
                        } else {
                            pwtVar = (pwt) new pvs(pvy.a(), context2, b, pxsVar5.g, pxsVar5.a).d(context2);
                        }
                        pxsVar5.f = pwtVar;
                        pxsVar5.f.m(new pwf(pxsVar5.d, null, null));
                        dwp dwpVar2 = pxsVar5.i;
                        if (dwpVar2 != null) {
                            pxsVar5.f.l(new pwc(dwpVar2));
                        }
                        dwp dwpVar3 = pxsVar5.j;
                        if (dwpVar3 != null) {
                            pxsVar5.f.o(new pwx(dwpVar3));
                        }
                        pxsVar5.f.r(new pxi());
                        pxsVar5.f.u();
                        pwt pwtVar5 = pxsVar5.f;
                        if (pwtVar5 != null) {
                            try {
                                qvf g = pwtVar5.g();
                                if (g != null) {
                                    pxsVar5.h.addView((View) qve.b(g));
                                }
                            } catch (RemoteException e4) {
                                qbi.i("#007 Could not call remote method.", e4);
                            }
                        }
                    }
                    pwt pwtVar6 = pxsVar5.f;
                    pwtVar6.getClass();
                    if (pwtVar6.t(pxsVar5.b.a(pxsVar5.h.getContext(), pxqVar))) {
                        pxsVar5.a.a = pxqVar.g;
                        return;
                    }
                    return;
                } catch (RemoteException e5) {
                    qbi.i("#007 Could not call remote method.", e5);
                    return;
                }
            }
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    @Override // defpackage.qbr
    public void requestInterstitialAd(Context context, qbs qbsVar, Bundle bundle, qbn qbnVar, Bundle bundle2) {
        String adUnitId = getAdUnitId(bundle);
        pug buildAdRequest = buildAdRequest(context, qbnVar, bundle2, bundle);
        dwq dwqVar = new dwq(this, qbsVar);
        qip.az(context, "Context cannot be null.");
        qip.az(adUnitId, "AdUnitId cannot be null.");
        qip.az(buildAdRequest, "AdRequest cannot be null.");
        pur purVar = new pur(context, adUnitId);
        pxq pxqVar = buildAdRequest.a;
        try {
            pwt pwtVar = purVar.c;
            if (pwtVar != null) {
                purVar.d.a = pxqVar.g;
                pwtVar.i(purVar.b.a(purVar.a, pxqVar), new pwi(dwqVar, purVar, null, null, null));
            }
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
            dwqVar.a(new pum(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v3, types: [pzd] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [pwp] */
    @Override // defpackage.qbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestNativeAd(android.content.Context r21, defpackage.qbu r22, android.os.Bundle r23, defpackage.qbv r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dws.requestNativeAd(android.content.Context, qbu, android.os.Bundle, qbv, android.os.Bundle):void");
    }

    @Override // defpackage.qbr
    public void showInterstitial() {
        qbl qblVar = this.mInterstitialAd;
        if (qblVar != null) {
            qblVar.c();
        }
    }
}
