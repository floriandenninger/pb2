package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.herrevad.NetworkQualityReport;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcu {
    private final qzw a;

    public tcu(qzw qzwVar) {
        this.a = qzwVar;
    }

    public final void a(tcs tcsVar) {
        final NetworkQualityReport networkQualityReport = new NetworkQualityReport();
        int i = tcsVar.c;
        if (i >= 0) {
            networkQualityReport.e = i;
        }
        if (tcsVar.e) {
            networkQualityReport.g = true;
            if (tcsVar.d.containsKey("network_error_code")) {
                networkQualityReport.a("network_error_code", (String) tcsVar.d.get("network_error_code"));
            }
        } else {
            Long l = tcsVar.b;
            if (l != null) {
                networkQualityReport.c = l.longValue();
                networkQualityReport.b = tcsVar.a.longValue();
            }
            amxd listIterator = tcsVar.d.entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                networkQualityReport.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        qzw qzwVar = this.a;
        qrd b = qre.b();
        b.a = new qqu() { // from class: qzu
            @Override // defpackage.qqu
            public final void a(Object obj, Object obj2) {
                NetworkQualityReport networkQualityReport2 = NetworkQualityReport.this;
                qzy qzyVar = (qzy) obj;
                int i2 = qzw.a;
                try {
                    qzx qzxVar = (qzx) qzyVar.D();
                    Parcel pn = qzxVar.pn();
                    ecr.g(pn, networkQualityReport2);
                    qzxVar.pq(1, pn);
                    ((rpv) obj2).b(null);
                } catch (RemoteException e) {
                    ((rpv) obj2).c(e);
                }
            }
        };
        b.b();
        b.c = 17101;
        qzwVar.s(b.a()).n(new tct());
    }
}
