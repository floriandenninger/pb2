package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pzs extends pzt {
    public Map a;

    @Override // defpackage.pzu
    public final pzw a(String str) {
        pzw qahVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, pzs.class.getClassLoader());
                if (dwt.class.isAssignableFrom(cls)) {
                    dwt dwtVar = (dwt) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    return new qah(dwtVar, (qcc) this.a.get(dwtVar.a()));
                }
                if (qbo.class.isAssignableFrom(cls)) {
                    return new qae((qbo) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (qbm.class.isAssignableFrom(cls)) {
                    return new qae((qbm) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                qbi.f(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                qbi.g(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            qbi.b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                qahVar = new qae(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                qahVar = new qae(new AdUrlAdapter());
            } else if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                qahVar = new qae(new CustomEventAdapter());
            } else {
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    qahVar = new qah(new com.google.ads.mediation.customevent.CustomEventAdapter(), (qcc) this.a.get(qcc.class));
                }
                throw new RemoteException();
            }
            return qahVar;
        }
    }

    @Override // defpackage.pzu
    public final qap b(String str) {
        return new qao((qcf) Class.forName(str, false, qar.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // defpackage.pzu
    public final boolean c(String str) {
        try {
            return qbm.class.isAssignableFrom(Class.forName(str, false, pzs.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            qbi.f(sb.toString());
            return false;
        }
    }

    @Override // defpackage.pzu
    public final boolean d(String str) {
        try {
            return qca.class.isAssignableFrom(Class.forName(str, false, pzs.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            qbi.f(sb.toString());
            return false;
        }
    }
}
