package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qah extends pzv {
    private final dwt a;
    private final qcc b;

    public qah(dwt dwtVar, qcc qccVar) {
        this.a = dwtVar;
        this.b = qccVar;
    }

    private final dwy G(String str) {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            dwy dwyVar = (dwy) this.a.b().newInstance();
            HashMap hashMap2 = new HashMap();
            for (Field field : dwyVar.getClass().getFields()) {
                dwx dwxVar = (dwx) field.getAnnotation(dwx.class);
                if (dwxVar != null) {
                    hashMap2.put(dwxVar.a(), field);
                }
            }
            if (hashMap2.isEmpty()) {
                qbi.f("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Field field2 = (Field) hashMap2.remove(entry.getKey());
                if (field2 != null) {
                    try {
                        field2.set(dwyVar, entry.getValue());
                    } catch (IllegalAccessException unused) {
                        String str2 = (String) entry.getKey();
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 49);
                        sb.append("Server option \"");
                        sb.append(str2);
                        sb.append("\" could not be set: Illegal Access");
                        qbi.f(sb.toString());
                    } catch (IllegalArgumentException unused2) {
                        String str3 = (String) entry.getKey();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 43);
                        sb2.append("Server option \"");
                        sb2.append(str3);
                        sb2.append("\" could not be set: Bad Type");
                        qbi.f(sb2.toString());
                    }
                } else {
                    String str4 = (String) entry.getKey();
                    String str5 = (String) entry.getValue();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 31 + String.valueOf(str5).length());
                    sb3.append("Unexpected server option: ");
                    sb3.append(str4);
                    sb3.append(" = \"");
                    sb3.append(str5);
                    sb3.append("\"");
                    qbi.b(sb3.toString());
                }
            }
            StringBuilder sb4 = new StringBuilder();
            for (Field field3 : hashMap2.values()) {
                if (((dwx) field3.getAnnotation(dwx.class)).b()) {
                    String valueOf = String.valueOf(((dwx) field3.getAnnotation(dwx.class)).a());
                    qbi.f(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                    if (sb4.length() > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(((dwx) field3.getAnnotation(dwx.class)).a());
                }
            }
            if (sb4.length() <= 0) {
                return dwyVar;
            }
            String valueOf2 = String.valueOf(sb4.toString());
            throw new dww(valueOf2.length() != 0 ? "Required server option(s) missing: ".concat(valueOf2) : new String("Required server option(s) missing: "));
        } catch (Throwable th) {
            qbi.d(th);
            throw new RemoteException();
        }
    }

    private static final void H(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.f) {
            return;
        }
        pvy.c();
        qbg.e();
    }

    @Override // defpackage.pzw
    public final pyx A() {
        return null;
    }

    @Override // defpackage.pzw
    public final void B(qvf qvfVar, qbd qbdVar) {
    }

    @Override // defpackage.pzw
    public final void C() {
    }

    @Override // defpackage.pzw
    public final void D() {
    }

    @Override // defpackage.pzw
    public final void E(qvf qvfVar, List list) {
    }

    @Override // defpackage.pzw
    public final void F(qvf qvfVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2) {
    }

    @Override // defpackage.pzw
    public final Bundle a() {
        return new Bundle();
    }

    @Override // defpackage.pzw
    public final Bundle b() {
        return new Bundle();
    }

    @Override // defpackage.pzw
    public final Bundle c() {
        return new Bundle();
    }

    @Override // defpackage.pzw
    public final pxn d() {
        return null;
    }

    @Override // defpackage.pzw
    public final qac e() {
        return null;
    }

    @Override // defpackage.pzw
    public final qvf f() {
        dwt dwtVar = this.a;
        if (dwtVar instanceof dwu) {
            try {
                ((dwu) dwtVar).d();
                return qve.a(null);
            } catch (Throwable th) {
                qbi.d(th);
                throw new RemoteException();
            }
        }
        String valueOf = String.valueOf(dwtVar.getClass().getCanonicalName());
        qbi.f(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void h(AdRequestParcel adRequestParcel, String str) {
    }

    @Override // defpackage.pzw
    public final void i(qvf qvfVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, pzz pzzVar) {
        j(qvfVar, adSizeParcel, adRequestParcel, str, null, pzzVar);
    }

    @Override // defpackage.pzw
    public final void j(qvf qvfVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, pzz pzzVar) {
        dwt dwtVar = this.a;
        if (!(dwtVar instanceof dwu)) {
            String valueOf = String.valueOf(dwtVar.getClass().getCanonicalName());
            qbi.f(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        qbi.b("Requesting banner ad from adapter.");
        try {
            dwu dwuVar = (dwu) this.a;
            qaj qajVar = new qaj(pzzVar);
            dwy G = G(str);
            int i = 0;
            dvd[] dvdVarArr = {dvd.a, dvd.b, dvd.c, dvd.d, dvd.e, dvd.f};
            while (true) {
                if (i >= 6) {
                    new dvd(pse.n(adSizeParcel.e, adSizeParcel.b, adSizeParcel.a));
                    break;
                }
                puh puhVar = dvdVarArr[i].g;
                if (puhVar.c == adSizeParcel.e && puhVar.d == adSizeParcel.b) {
                    break;
                } else {
                    i++;
                }
            }
            H(adRequestParcel);
            qar.b(adRequestParcel);
            dwuVar.e(qajVar, G, this.b);
        } catch (Throwable th) {
            qbi.d(th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.pzw
    public final void k(qvf qvfVar, AdRequestParcel adRequestParcel, String str, pzz pzzVar) {
        l(qvfVar, adRequestParcel, str, null, pzzVar);
    }

    @Override // defpackage.pzw
    public final void l(qvf qvfVar, AdRequestParcel adRequestParcel, String str, String str2, pzz pzzVar) {
        dwt dwtVar = this.a;
        if (!(dwtVar instanceof dwv)) {
            String valueOf = String.valueOf(dwtVar.getClass().getCanonicalName());
            qbi.f(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        qbi.b("Requesting interstitial ad from adapter.");
        try {
            dwv dwvVar = (dwv) this.a;
            qaj qajVar = new qaj(pzzVar);
            dwy G = G(str);
            H(adRequestParcel);
            qar.b(adRequestParcel);
            dwvVar.g(qajVar, G, this.b);
        } catch (Throwable th) {
            qbi.d(th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.pzw
    public final void m(qvf qvfVar, AdRequestParcel adRequestParcel, String str, String str2, pzz pzzVar, NativeAdOptionsParcel nativeAdOptionsParcel, List list) {
    }

    @Override // defpackage.pzw
    public final void n(qvf qvfVar) {
    }

    @Override // defpackage.pzw
    public final void o() {
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void p() {
        throw new RemoteException();
    }

    @Override // defpackage.pzw
    public final void q(boolean z) {
    }

    @Override // defpackage.pzw
    public final void r() {
        dwt dwtVar = this.a;
        if (!(dwtVar instanceof dwv)) {
            String valueOf = String.valueOf(dwtVar.getClass().getCanonicalName());
            qbi.f(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        qbi.b("Showing interstitial from adapter.");
        try {
            ((dwv) this.a).f();
        } catch (Throwable th) {
            qbi.d(th);
            throw new RemoteException();
        }
    }

    @Override // defpackage.pzw
    public final void s() {
    }

    @Override // defpackage.pzw
    public final boolean t() {
        return true;
    }

    @Override // defpackage.pzw
    public final void u() {
    }

    @Override // defpackage.pzw
    public final void v(qvf qvfVar, AdRequestParcel adRequestParcel, String str) {
    }

    @Override // defpackage.pzw
    public final void w(AdRequestParcel adRequestParcel, String str) {
    }

    @Override // defpackage.pzw
    public final void x(qvf qvfVar, AdRequestParcel adRequestParcel, String str) {
    }

    @Override // defpackage.pzw
    public final void y() {
    }

    @Override // defpackage.pzw
    public final void z() {
    }

    @Override // defpackage.pzw
    public final void g() {
        try {
            this.a.c();
        } catch (Throwable th) {
            qbi.d(th);
            throw new RemoteException();
        }
    }
}
