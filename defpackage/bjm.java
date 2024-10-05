package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bjm extends bjo {
    public long a;
    public long[] b;
    public long[] c;

    public bjm() {
        super(new big());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }

    private static Double d(pth pthVar) {
        return Double.valueOf(Double.longBitsToDouble(pthVar.o()));
    }

    private static String f(pth pthVar) {
        int m = pthVar.m();
        int i = pthVar.b;
        pthVar.H(m);
        return new String(pthVar.a, i, m);
    }

    private static HashMap g(pth pthVar) {
        int l = pthVar.l();
        HashMap hashMap = new HashMap(l);
        for (int i = 0; i < l; i++) {
            String f = f(pthVar);
            Object e = e(pthVar, pthVar.i());
            if (e != null) {
                hashMap.put(f, e);
            }
        }
        return hashMap;
    }

    @Override // defpackage.bjo
    protected final boolean a(pth pthVar) {
        return true;
    }

    @Override // defpackage.bjo
    protected final boolean b(pth pthVar, long j) {
        if (pthVar.i() != 2 || !"onMetaData".equals(f(pthVar)) || pthVar.i() != 8) {
            return false;
        }
        HashMap g = g(pthVar);
        Object obj = g.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.a = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = g.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.b = new long[size];
                this.c = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.b = new long[0];
                        this.c = new long[0];
                        break;
                    }
                    this.b[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.c[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    private static Object e(pth pthVar, int i) {
        if (i == 0) {
            return d(pthVar);
        }
        if (i == 1) {
            return Boolean.valueOf(pthVar.i() == 1);
        }
        if (i == 2) {
            return f(pthVar);
        }
        if (i != 3) {
            if (i == 8) {
                return g(pthVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) d(pthVar).doubleValue());
                pthVar.H(2);
                return date;
            }
            int l = pthVar.l();
            ArrayList arrayList = new ArrayList(l);
            for (int i2 = 0; i2 < l; i2++) {
                Object e = e(pthVar, pthVar.i());
                if (e != null) {
                    arrayList.add(e);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String f = f(pthVar);
            int i3 = pthVar.i();
            if (i3 == 9) {
                return hashMap;
            }
            Object e2 = e(pthVar, i3);
            if (e2 != null) {
                hashMap.put(f, e2);
            }
        }
    }
}
