package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdt extends rdu {
    public final Map a;
    public final Map b;
    public long c;

    public rdt(rgt rgtVar) {
        super(rgtVar);
        this.b = new adz();
        this.a = new adz();
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            aF().c.a("Ad unit id must be a non-empty string");
        } else {
            aG().g(new rdr(this, str, j, 1));
        }
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            aF().c.a("Ad unit id must be a non-empty string");
        } else {
            aG().g(new rdr(this, str, j, 0));
        }
    }

    public final void c(long j, rij rijVar) {
        if (rijVar == null) {
            aF().k.a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            aF().k.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        rkm.D(rijVar, bundle, true);
        j().v("am", "_xa", bundle);
    }

    public final void d(String str, long j, rij rijVar) {
        if (rijVar == null) {
            aF().k.a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            aF().k.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        rkm.D(rijVar, bundle, true);
        j().v("am", "_xu", bundle);
    }

    public final void e(long j) {
        rij o = k().o();
        for (String str : this.a.keySet()) {
            d(str, j - ((Long) this.a.get(str)).longValue(), o);
        }
        if (!this.a.isEmpty()) {
            c(j - this.c, o);
        }
        f(j);
    }

    public final void f(long j) {
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            this.a.put((String) it.next(), Long.valueOf(j));
        }
        if (this.a.isEmpty()) {
            return;
        }
        this.c = j;
    }
}
