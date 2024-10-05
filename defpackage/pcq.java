package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pcq extends pcs {
    public pcq() {
        super(null);
    }

    private static Double d(pgx pgxVar) {
        return Double.valueOf(Double.longBitsToDouble(pgxVar.m()));
    }

    private static String f(pgx pgxVar) {
        int k = pgxVar.k();
        int i = pgxVar.b;
        pgxVar.A(k);
        return new String(pgxVar.a, i, k);
    }

    private static HashMap g(pgx pgxVar) {
        int j = pgxVar.j();
        HashMap hashMap = new HashMap(j);
        for (int i = 0; i < j; i++) {
            hashMap.put(f(pgxVar), e(pgxVar, pgxVar.h()));
        }
        return hashMap;
    }

    @Override // defpackage.pcs
    protected final void a(pgx pgxVar, long j) {
        if (pgxVar.h() != 2) {
            throw new oyo();
        }
        if ("onMetaData".equals(f(pgxVar))) {
            if (pgxVar.h() != 8) {
                throw new oyo();
            }
            HashMap g = g(pgxVar);
            if (g.containsKey("duration")) {
                double doubleValue = ((Double) g.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    @Override // defpackage.pcs
    protected final boolean b(pgx pgxVar) {
        return true;
    }

    private static Object e(pgx pgxVar, int i) {
        if (i == 0) {
            return d(pgxVar);
        }
        if (i == 1) {
            return Boolean.valueOf(pgxVar.h() == 1);
        }
        if (i == 2) {
            return f(pgxVar);
        }
        if (i != 3) {
            if (i == 8) {
                return g(pgxVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) d(pgxVar).doubleValue());
                pgxVar.A(2);
                return date;
            }
            int j = pgxVar.j();
            ArrayList arrayList = new ArrayList(j);
            for (int i2 = 0; i2 < j; i2++) {
                arrayList.add(e(pgxVar, pgxVar.h()));
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String f = f(pgxVar);
            int h = pgxVar.h();
            if (h == 9) {
                return hashMap;
            }
            hashMap.put(f, e(pgxVar, h));
        }
    }
}
