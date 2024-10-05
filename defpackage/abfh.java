package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfh {
    final SparseArray a = new SparseArray();
    public int b = 0;

    private abfh() {
    }

    public static abfh a(aomk aomkVar, alwf alwfVar) {
        abfh abfhVar = new abfh();
        abfhVar.c(aomkVar, alwfVar);
        return abfhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v0, types: [abfh] */
    private final void c(aomk aomkVar, alwf alwfVar) {
        aomf aomfVar;
        while (true) {
            int n = aomkVar.n();
            if (n <= 0) {
                return;
            }
            int a = aoqp.a(n);
            alwf e = alwfVar.e(a);
            if (!e.c.isEmpty() || e.d) {
                this.b += aomp.ae(n);
                int b = aoqp.b(n);
                if (b == 0) {
                    long s = ((aomg) aomkVar).s();
                    this.b += aomp.ag(s);
                    aomfVar = Long.valueOf(s);
                } else if (b == 1) {
                    long r = ((aomg) aomkVar).r();
                    this.b += 8;
                    aomfVar = Long.valueOf(r);
                } else if (b == 2) {
                    alwf e2 = alwfVar.e(a);
                    if (amkq.b(e2, alwf.b)) {
                        aomf x = aomkVar.x();
                        this.b += aomp.J(x);
                        aomfVar = x;
                    } else {
                        int k = aomkVar.k();
                        this.b += aomp.ae(k);
                        int e3 = aomkVar.e();
                        int f = aomkVar.f(k);
                        ?? abfhVar = new abfh();
                        abfhVar.c(aomkVar, e2);
                        aomkVar.C(f);
                        int e4 = aomkVar.e() - e3;
                        if (e4 == k) {
                            this.b += abfhVar.b;
                            aomfVar = abfhVar;
                        } else {
                            StringBuilder sb = new StringBuilder(43);
                            sb.append("Mismatched size: ");
                            sb.append(k);
                            sb.append(" != ");
                            sb.append(e4);
                            throw new aooa(sb.toString());
                        }
                    }
                } else if (b == 5) {
                    int j = ((aomg) aomkVar).j();
                    this.b += 4;
                    aomfVar = Integer.valueOf(j);
                } else {
                    throw new aooa("Unexpected wire type");
                }
            } else {
                aomkVar.G(n);
                aomfVar = null;
            }
            if (aomfVar != null) {
                int indexOfKey = this.a.indexOfKey(n);
                if (indexOfKey < 0) {
                    this.a.append(n, aomfVar);
                } else {
                    Object valueAt = this.a.valueAt(indexOfKey);
                    if (valueAt instanceof ArrayList) {
                        ((ArrayList) valueAt).add(aomfVar);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(valueAt);
                        arrayList.add(aomfVar);
                        this.a.append(n, arrayList);
                    }
                }
            }
        }
    }

    private final void d(int i, Object obj, aomp aompVar) {
        int a = aoqp.a(i);
        int b = aoqp.b(i);
        if (b == 0) {
            aompVar.E(a, ((Long) obj).longValue());
            return;
        }
        if (b == 1) {
            aompVar.r(a, ((Long) obj).longValue());
            return;
        }
        if (b != 2) {
            if (b != 5) {
                throw new aooa("Unexpected wire type");
            }
            aompVar.p(a, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof aomf) {
            aompVar.n(a, (aomf) obj);
            return;
        }
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                d(i, arrayList.get(i2), aompVar);
            }
            return;
        }
        if (obj instanceof abfh) {
            abfh abfhVar = (abfh) obj;
            aompVar.B(a, 2);
            aompVar.D(abfhVar.b);
            abfhVar.b(aompVar);
            return;
        }
        throw new aooa("Unexpected WIRETYPE_LENGTH_DELIMITED value");
    }

    public final void b(aomp aompVar) {
        for (int i = 0; i < this.a.size(); i++) {
            d(this.a.keyAt(i), this.a.valueAt(i), aompVar);
        }
    }
}
