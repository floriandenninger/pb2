package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqn {
    public final LinkedHashMap a;

    public axqn(byte[] bArr) {
        this(new double[]{teg.FULL.f, teg.THREE_QUARTER.f, teg.HALF.f, teg.QUARTER.f, teg.NONE.f});
    }

    private final tev j(double d) {
        for (Map.Entry entry : this.a.entrySet()) {
            if (d >= ((Double) entry.getKey()).doubleValue()) {
                return (tev) entry.getValue();
            }
        }
        throw new IllegalArgumentException(String.format("No matching bucket for value %s", Double.valueOf(d)));
    }

    public final void a(Object obj, azrw azrwVar) {
        LinkedHashMap linkedHashMap = this.a;
        obj.getClass();
        azrwVar.getClass();
        linkedHashMap.put(obj, azrwVar);
    }

    public final synchronized Object b(Object obj) {
        return this.a.get(obj);
    }

    public final synchronized void c(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    public final long d(double d) {
        return j(d).c();
    }

    public final long e(int i, double d) {
        return j(d).b(i);
    }

    public final void f(double d, long j) {
        for (Map.Entry entry : this.a.entrySet()) {
            double doubleValue = ((Double) entry.getKey()).doubleValue();
            tev tevVar = (tev) entry.getValue();
            if (d <= 0.0d || d < doubleValue) {
                tevVar.e();
            } else {
                tevVar.d(j);
            }
        }
    }

    public final void g() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ((tev) ((Map.Entry) it.next()).getValue()).e();
        }
    }

    public final void h() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ((tev) ((Map.Entry) it.next()).getValue()).f();
        }
    }

    public final Long[] i(int i, boolean z) {
        int size = this.a.size();
        Long[] lArr = new Long[size];
        Iterator it = this.a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            lArr[i2] = Long.valueOf(((tev) ((Map.Entry) it.next()).getValue()).b(i));
            i2++;
        }
        if (!z) {
            int i3 = size - 1;
            while (i3 > 0) {
                int i4 = i3 - 1;
                lArr[i3] = Long.valueOf(lArr[i3].longValue() - lArr[i4].longValue());
                i3 = i4;
            }
        }
        return lArr;
    }

    public axqn(double[] dArr) {
        this.a = new LinkedHashMap(dArr.length);
        double d = -1.0d;
        int i = 0;
        while (i < dArr.length) {
            double d2 = dArr[i];
            amkq.E(d2 >= 0.0d);
            if (i > 0) {
                amkq.E(d2 < d);
            }
            this.a.put(Double.valueOf(d2), new tev());
            i++;
            d = d2;
        }
    }

    public axqn() {
        this.a = new uyc();
    }

    public axqn(int i) {
        this.a = ayaw.o(i);
    }
}
