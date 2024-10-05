package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class reu {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final EventParams f;

    public reu(rgt rgtVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        qip.ax(str2);
        qip.ax(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            rgtVar.aF().f.b("Event created with reverse previous/current timestamps. appId", rfp.a(str2));
        }
        this.f = b(rgtVar, bundle);
    }

    static EventParams b(rgt rgtVar, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new EventParams(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                rgtVar.aF().c.a("Param name can't be null");
                it.remove();
            } else {
                Object x = rgtVar.p().x(next, bundle2.get(next));
                if (x == null) {
                    rgtVar.aF().f.b("Param value can't be null", rgtVar.k.d(next));
                    it.remove();
                } else {
                    rgtVar.p().R(bundle2, next, x);
                }
            }
        }
        return new EventParams(bundle2);
    }

    public reu a(rgt rgtVar, long j) {
        return new reu(rgtVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    private reu(rgt rgtVar, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        qip.ax(str2);
        qip.ax(str3);
        qip.an(eventParams);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            rgtVar.aF().f.c("Event created with reverse previous/current timestamps. appId, name", rfp.a(str2), rfp.a(str3));
        }
        this.f = eventParams;
    }
}
