package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sby implements seu {
    public final amnp a;
    public final sbz b;
    public int d = 0;
    public final ArrayList c = new ArrayList(Collections.nCopies(1800, 0));

    public sby(amob amobVar) {
        amnp d = amnp.d(amobVar);
        this.a = d;
        d.e();
        this.b = new sbz();
    }

    private final int d(double d) {
        ArrayList arrayList = this.c;
        double d2 = this.d % 1800;
        Double.isNaN(d2);
        return ((Integer) arrayList.get((int) (d2 * (1.0d - d)))).intValue();
    }

    public final ansj a() {
        ansj a = ansk.a();
        int i = this.d;
        a.copyOnWrite();
        ((ansk) a.instance).q(i);
        Collections.sort(this.c, Collections.reverseOrder());
        int d = d(0.5d);
        a.copyOnWrite();
        ((ansk) a.instance).m(d);
        int d2 = d(0.9d);
        a.copyOnWrite();
        ((ansk) a.instance).n(d2);
        int d3 = d(0.95d);
        a.copyOnWrite();
        ((ansk) a.instance).o(d3);
        int d4 = d(0.99d);
        a.copyOnWrite();
        ((ansk) a.instance).p(d4);
        int min = Math.min(1800, this.d);
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            i2 += ((Integer) this.c.get(i3)).intValue();
            this.c.set(i3, 0);
        }
        if (min == 0) {
            a.copyOnWrite();
            ((ansk) a.instance).k(0);
        } else {
            a.copyOnWrite();
            ((ansk) a.instance).k(i2 / min);
        }
        this.d = 0;
        return a;
    }

    @Override // defpackage.seu
    public final void b() {
    }

    @Override // defpackage.seu
    public final void c(sev sevVar) {
    }
}
