package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hnh {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public aute c;
    public Long d;
    public Long e;

    public final ammv a(long j) {
        if (this.a.isEmpty()) {
            return amlr.a;
        }
        int binarySearch = Collections.binarySearch(this.a, Long.valueOf(j));
        if (binarySearch >= 0) {
            return ammv.j((Long) this.a.get(binarySearch));
        }
        int i = -(binarySearch + 1);
        if (i == this.a.size()) {
            i--;
        }
        long abs = Math.abs(j - ((Long) this.a.get(i)).longValue());
        int i2 = i - 1;
        if (i2 >= 0) {
            long abs2 = Math.abs(j - ((Long) this.a.get(i2)).longValue());
            if (abs2 <= 10000 && abs2 <= abs) {
                return ammv.j((Long) this.a.get(i2));
            }
        }
        return abs <= 10000 ? ammv.j((Long) this.a.get(i)) : amlr.a;
    }

    public final ammv b() {
        return ammv.i(this.d);
    }

    public final void c(autf autfVar) {
        this.a.clear();
        if ((autfVar.b & 1) != 0) {
            aute auteVar = autfVar.c;
            if (auteVar == null) {
                auteVar = aute.a;
            }
            this.c = auteVar;
            this.a.add(Long.valueOf(auteVar.c));
        }
        if (autfVar.d.size() > 0) {
            for (aute auteVar2 : autfVar.d) {
                if ((auteVar2.b & 1) != 0) {
                    this.a.add(Long.valueOf(auteVar2.c));
                }
                if (!auteVar2.equals(this.c)) {
                    this.b.add(auteVar2);
                }
            }
        }
        Collections.sort(this.a);
    }
}
