package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.initialization.MediationConfigurationParcel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qae extends pzv {
    private final Object a;
    private qaf b;
    private qvf c;
    private qbd d;

    public qae(qbm qbmVar) {
        this.a = qbmVar;
    }

    private final Bundle G(String str, AdRequestParcel adRequestParcel, String str2) {
        String valueOf = String.valueOf(str);
        qbi.b(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (adRequestParcel != null) {
                    bundle.putInt("tagForChildDirectedTreatment", adRequestParcel.g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            qbi.d(th);
            throw new RemoteException();
        }
    }

    private static final boolean H(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.f) {
            return true;
        }
        pvy.c();
        return qbg.e();
    }

    private final void I(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.m.getBundle(this.a.getClass().getName()) != null) {
            return;
        }
        new Bundle();
    }

    private static final void J(String str, AdRequestParcel adRequestParcel) {
        String str2 = adRequestParcel.u;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    @Override // defpackage.pzw
    public final pyx A() {
        qaf qafVar = this.b;
        if (qafVar == null) {
            return null;
        }
        pyy pyyVar = qafVar.b;
        if (pyyVar instanceof pyy) {
            return pyyVar.a;
        }
        return null;
    }

    @Override // defpackage.pzw
    public final void B(qvf qvfVar, qbd qbdVar) {
        Object obj = this.a;
        if (!(obj instanceof qbm)) {
            String canonicalName = qbm.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            throw new RemoteException();
        }
        this.c = qvfVar;
        this.d = qbdVar;
        qvf a = qve.a(obj);
        Parcel pn = qbdVar.pn();
        ecr.i(pn, a);
        qbdVar.pp(1, pn);
    }

    @Override // defpackage.pzw
    public final void C() {
        Object obj = this.a;
        if (obj instanceof qbm) {
            ((qbm) obj).c();
            throw null;
        }
    }

    @Override // defpackage.pzw
    public final void D() {
        Object obj = this.a;
        if (obj instanceof qbm) {
            ((qbm) obj).b();
            throw null;
        }
    }

    @Override // defpackage.pzw
    public final void E(qvf qvfVar, List list) {
        char c;
        if (!(this.a instanceof qbm)) {
            throw new RemoteException();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediationConfigurationParcel mediationConfigurationParcel = (MediationConfigurationParcel) it.next();
            String str = mediationConfigurationParcel.a;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            c = 65535;
            if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4) {
                Bundle bundle = mediationConfigurationParcel.b;
                arrayList.add(new qar());
            }
        }
        qbm qbmVar = (qbm) this.a;
        qbmVar.a();
    }

    @Override // defpackage.pzw
    public final void F(qvf qvfVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2) {
        if (!(this.a instanceof qbm)) {
            String canonicalName = qbm.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            throw new RemoteException();
        }
        qbi.b("Requesting interscroller ad from adapter.");
        try {
            G(str, adRequestParcel, str2);
            I(adRequestParcel);
            H(adRequestParcel);
            Location location = adRequestParcel.k;
            int i = adRequestParcel.g;
            int i2 = adRequestParcel.t;
            J(str, adRequestParcel);
            int i3 = adSizeParcel.e;
            int i4 = adSizeParcel.b;
            puh puhVar = new puh(i3, i4);
            puhVar.h = true;
            puhVar.i = i4;
            throw null;
        } catch (Exception e) {
            qbi.d(e);
            throw new RemoteException();
        }
    }

    @Override // defpackage.pzw
    public final Bundle a() {
        Object obj = this.a;
        if (!(obj instanceof qcg)) {
            String canonicalName = qcg.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            return new Bundle();
        }
        return ((qcg) obj).a();
    }

    @Override // defpackage.pzw
    public final Bundle b() {
        Object obj = this.a;
        if (!(obj instanceof qch)) {
            String canonicalName = qch.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            return new Bundle();
        }
        return ((qch) obj).getInterstitialAdapterInfo();
    }

    @Override // defpackage.pzw
    public final Bundle c() {
        return new Bundle();
    }

    @Override // defpackage.pzw
    public final pxn d() {
        Object obj = this.a;
        if (obj instanceof qbz) {
            try {
                return ((qbz) obj).getVideoController();
            } catch (Throwable th) {
                qbi.d(th);
            }
        }
        return null;
    }

    @Override // defpackage.pzw
    public final qac e() {
        qaf qafVar;
        qby qbyVar;
        if (!(this.a instanceof qbt) || (qafVar = this.b) == null || (qbyVar = qafVar.a) == null) {
            return null;
        }
        return new qab(qbyVar);
    }

    @Override // defpackage.pzw
    public final qvf f() {
        Object obj = this.a;
        if (obj instanceof qbp) {
            try {
                return qve.a(((qbp) obj).getBannerView());
            } catch (Throwable th) {
                qbi.d(th);
                throw new RemoteException();
            }
        }
        if (obj instanceof qbm) {
            return qve.a(null);
        }
        String canonicalName = qbp.class.getCanonicalName();
        String canonicalName2 = qbm.class.getCanonicalName();
        String canonicalName3 = this.a.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        qbi.f(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void g() {
        Object obj = this.a;
        if (obj instanceof qbo) {
            try {
                ((qbo) obj).onDestroy();
            } catch (Throwable th) {
                qbi.d(th);
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.pzw
    public final void h(AdRequestParcel adRequestParcel, String str) {
        w(adRequestParcel, str);
    }

    @Override // defpackage.pzw
    public final void i(qvf qvfVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, pzz pzzVar) {
        j(qvfVar, adSizeParcel, adRequestParcel, str, null, pzzVar);
    }

    @Override // defpackage.pzw
    public final void j(qvf qvfVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, pzz pzzVar) {
        puh n;
        RemoteException remoteException;
        Object obj = this.a;
        if ((obj instanceof qbp) || (obj instanceof qbm)) {
            qbi.b("Requesting banner ad from adapter.");
            if (adSizeParcel.n) {
                int i = adSizeParcel.e;
                int i2 = adSizeParcel.b;
                n = new puh(i, i2);
                n.f = true;
                n.g = i2;
            } else {
                n = pse.n(adSizeParcel.e, adSizeParcel.b, adSizeParcel.a);
            }
            puh puhVar = n;
            Object obj2 = this.a;
            if (obj2 instanceof qbp) {
                try {
                    qbp qbpVar = (qbp) obj2;
                    List list = adRequestParcel.e;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = adRequestParcel.b;
                    Date date = j != -1 ? new Date(j) : null;
                    int i3 = adRequestParcel.d;
                    Location location = adRequestParcel.k;
                    boolean H = H(adRequestParcel);
                    int i4 = adRequestParcel.g;
                    boolean z = adRequestParcel.r;
                    int i5 = adRequestParcel.t;
                    J(str, adRequestParcel);
                    qbpVar.requestBannerAd((Context) qve.b(qvfVar), new qaf(pzzVar), G(str, adRequestParcel, str2), puhVar, new qad(date, i3, hashSet, location, H, i4, z), adRequestParcel.m.getBundle(qbpVar.getClass().getName()));
                    return;
                } finally {
                }
            }
            if (obj2 instanceof qbm) {
                try {
                    G(str, adRequestParcel, str2);
                    I(adRequestParcel);
                    H(adRequestParcel);
                    Location location2 = adRequestParcel.k;
                    int i6 = adRequestParcel.g;
                    int i7 = adRequestParcel.t;
                    J(str, adRequestParcel);
                    throw null;
                } finally {
                }
            }
            return;
        }
        String canonicalName = qbp.class.getCanonicalName();
        String canonicalName2 = qbm.class.getCanonicalName();
        String canonicalName3 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        qbi.f(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void k(qvf qvfVar, AdRequestParcel adRequestParcel, String str, pzz pzzVar) {
        l(qvfVar, adRequestParcel, str, null, pzzVar);
    }

    @Override // defpackage.pzw
    public final void l(qvf qvfVar, AdRequestParcel adRequestParcel, String str, String str2, pzz pzzVar) {
        RemoteException remoteException;
        Object obj = this.a;
        if ((obj instanceof qbr) || (obj instanceof qbm)) {
            qbi.b("Requesting interstitial ad from adapter.");
            Object obj2 = this.a;
            if (obj2 instanceof qbr) {
                try {
                    qbr qbrVar = (qbr) obj2;
                    List list = adRequestParcel.e;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = adRequestParcel.b;
                    Date date = j != -1 ? new Date(j) : null;
                    int i = adRequestParcel.d;
                    Location location = adRequestParcel.k;
                    boolean H = H(adRequestParcel);
                    int i2 = adRequestParcel.g;
                    boolean z = adRequestParcel.r;
                    int i3 = adRequestParcel.t;
                    J(str, adRequestParcel);
                    qbrVar.requestInterstitialAd((Context) qve.b(qvfVar), new qaf(pzzVar), G(str, adRequestParcel, str2), new qad(date, i, hashSet, location, H, i2, z), adRequestParcel.m.getBundle(qbrVar.getClass().getName()));
                    return;
                } finally {
                }
            }
            if (obj2 instanceof qbm) {
                try {
                    G(str, adRequestParcel, str2);
                    I(adRequestParcel);
                    H(adRequestParcel);
                    Location location2 = adRequestParcel.k;
                    int i4 = adRequestParcel.g;
                    int i5 = adRequestParcel.t;
                    J(str, adRequestParcel);
                    throw null;
                } finally {
                }
            }
            return;
        }
        String canonicalName = qbr.class.getCanonicalName();
        String canonicalName2 = qbm.class.getCanonicalName();
        String canonicalName3 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        qbi.f(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void m(qvf qvfVar, AdRequestParcel adRequestParcel, String str, String str2, pzz pzzVar, NativeAdOptionsParcel nativeAdOptionsParcel, List list) {
        RemoteException remoteException;
        Object obj = this.a;
        if ((obj instanceof qbt) || (obj instanceof qbm)) {
            qbi.b("Requesting native ad from adapter.");
            Object obj2 = this.a;
            if (obj2 instanceof qbt) {
                try {
                    qbt qbtVar = (qbt) obj2;
                    List list2 = adRequestParcel.e;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = adRequestParcel.b;
                    Date date = j != -1 ? new Date(j) : null;
                    int i = adRequestParcel.d;
                    Location location = adRequestParcel.k;
                    boolean H = H(adRequestParcel);
                    int i2 = adRequestParcel.g;
                    boolean z = adRequestParcel.r;
                    int i3 = adRequestParcel.t;
                    J(str, adRequestParcel);
                    qag qagVar = new qag(date, i, hashSet, location, H, i2, nativeAdOptionsParcel, list, z);
                    Bundle bundle = adRequestParcel.m.getBundle(qbtVar.getClass().getName());
                    this.b = new qaf(pzzVar);
                    qbtVar.requestNativeAd((Context) qve.b(qvfVar), this.b, G(str, adRequestParcel, str2), qagVar, bundle);
                    return;
                } finally {
                }
            }
            if (obj2 instanceof qbm) {
                try {
                    G(str, adRequestParcel, str2);
                    I(adRequestParcel);
                    H(adRequestParcel);
                    Location location2 = adRequestParcel.k;
                    int i4 = adRequestParcel.g;
                    int i5 = adRequestParcel.t;
                    J(str, adRequestParcel);
                    throw null;
                } finally {
                }
            }
            return;
        }
        String canonicalName = qbt.class.getCanonicalName();
        String canonicalName2 = qbm.class.getCanonicalName();
        String canonicalName3 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        qbi.f(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void n(qvf qvfVar) {
        Object obj = this.a;
        if (obj instanceof qbw) {
            ((qbw) obj).a();
        }
    }

    @Override // defpackage.pzw
    public final void o() {
        Object obj = this.a;
        if (obj instanceof qbo) {
            try {
                ((qbo) obj).onPause();
            } catch (Throwable th) {
                qbi.d(th);
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.pzw
    public final void p() {
        Object obj = this.a;
        if (obj instanceof qbo) {
            try {
                ((qbo) obj).onResume();
            } catch (Throwable th) {
                qbi.d(th);
                throw new RemoteException();
            }
        }
    }

    @Override // defpackage.pzw
    public final void q(boolean z) {
        Object obj = this.a;
        if (obj instanceof qbx) {
            try {
                ((qbx) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                qbi.d(th);
                return;
            }
        }
        String canonicalName = qbx.class.getCanonicalName();
        String canonicalName2 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        qbi.b(sb.toString());
    }

    @Override // defpackage.pzw
    public final void r() {
        if (!(this.a instanceof qbr)) {
            String canonicalName = qbr.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            throw new RemoteException();
        }
        qbi.b("Showing interstitial from adapter.");
        try {
            ((qbr) this.a).showInterstitial();
        } catch (Throwable th) {
            qbi.d(th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.pzw
    public final void s() {
        if (!(this.a instanceof qbm)) {
            String canonicalName = qbm.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            throw new RemoteException();
        }
        qbi.c("Can not show null mediated rewarded ad.");
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final boolean t() {
        if (this.a instanceof qbm) {
            return this.d != null;
        }
        String canonicalName = qbm.class.getCanonicalName();
        String canonicalName2 = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        qbi.f(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void u() {
        qbi.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void v(qvf qvfVar, AdRequestParcel adRequestParcel, String str) {
        if (!(this.a instanceof qbm)) {
            String canonicalName = qbm.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            throw new RemoteException();
        }
        qbi.b("Requesting rewarded ad from adapter.");
        try {
            G(str, adRequestParcel, null);
            I(adRequestParcel);
            H(adRequestParcel);
            Location location = adRequestParcel.k;
            int i = adRequestParcel.g;
            int i2 = adRequestParcel.t;
            J(str, adRequestParcel);
            throw null;
        } catch (Exception e) {
            qbi.d(e);
            throw new RemoteException();
        }
    }

    @Override // defpackage.pzw
    public final void w(AdRequestParcel adRequestParcel, String str) {
        Object obj = this.a;
        if (!(obj instanceof qbm)) {
            String canonicalName = qbm.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            throw new RemoteException();
        }
        qvf qvfVar = this.c;
        new pzy((qbm) obj, this.d);
        v(qvfVar, adRequestParcel, str);
    }

    @Override // defpackage.pzw
    public final void x(qvf qvfVar, AdRequestParcel adRequestParcel, String str) {
        if (!(this.a instanceof qbm)) {
            String canonicalName = qbm.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            throw new RemoteException();
        }
        qbi.b("Requesting rewarded interstitial ad from adapter.");
        try {
            G(str, adRequestParcel, null);
            I(adRequestParcel);
            H(adRequestParcel);
            Location location = adRequestParcel.k;
            int i = adRequestParcel.g;
            int i2 = adRequestParcel.t;
            J(str, adRequestParcel);
            throw null;
        } catch (Exception e) {
            qbi.d(e);
            throw new RemoteException();
        }
    }

    @Override // defpackage.pzw
    public final void y() {
        Object obj = this.a;
        if ((obj instanceof qbm) || (obj instanceof qbr)) {
            if (obj instanceof qbr) {
                r();
                return;
            } else {
                qbi.b("Show interstitial ad from adapter.");
                qbi.c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = qbr.class.getCanonicalName();
        String canonicalName2 = qbm.class.getCanonicalName();
        String canonicalName3 = this.a.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        qbi.f(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void z() {
        if (!(this.a instanceof qbm)) {
            String canonicalName = qbm.class.getCanonicalName();
            String canonicalName2 = this.a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            qbi.f(sb.toString());
            throw new RemoteException();
        }
        qbi.b("Show rewarded ad from adapter.");
        qbi.c("Can not show null mediation rewarded ad.");
        throw new RemoteException();
    }

    public qae(qbo qboVar) {
        this.a = qboVar;
    }
}
