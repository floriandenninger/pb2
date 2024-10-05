package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afji {
    final ArrayDeque a = new ArrayDeque();

    public final double a() {
        if (this.a.size() >= 4) {
            long j = ((afjh) this.a.getLast()).a - ((afjh) this.a.getFirst()).a;
            long j2 = ((afjh) this.a.getLast()).b - ((afjh) this.a.getFirst()).b;
            if (j >= 5000) {
                return (j2 * 1000) / j;
            }
        }
        return 0.0d;
    }

    public final String b() {
        if (this.a.size() < 4) {
            return "";
        }
        return TextUtils.join(".", amkq.bh(this.a, new fjv(((afjh) this.a.getLast()).a, 10)));
    }

    public final void c(long j, long j2) {
        afjh afjhVar;
        if (this.a.isEmpty() || ((afjh) this.a.getLast()).a <= j) {
            this.a.addLast(new afjh(j, j2));
            long j3 = j - 5000;
            Object removeFirst = this.a.removeFirst();
            while (true) {
                afjhVar = (afjh) removeFirst;
                if (this.a.size() <= 1 || ((afjh) this.a.peekFirst()).a >= j3) {
                    break;
                } else {
                    removeFirst = this.a.removeFirst();
                }
            }
            this.a.addFirst(afjhVar);
            return;
        }
        afid.d(afic.EXO, "DropFramerateAnalyzer observation skipped due to time skew");
    }

    public final void d() {
        this.a.clear();
    }

    public final boolean e(double d) {
        return d > 0.0d && a() > d;
    }
}
