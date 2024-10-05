package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class psc implements ppw {
    private final List a;
    private final long[] b;
    private final long[] c;

    public psc(List list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            pru pruVar = (pru) list.get(i);
            int i2 = i + i;
            long[] jArr = this.b;
            jArr[i2] = pruVar.b;
            jArr[i2 + 1] = pruVar.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // defpackage.ppw
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.ppw
    public final int b(long j) {
        int ak = pts.ak(this.c, j, false);
        if (ak < this.c.length) {
            return ak;
        }
        return -1;
    }

    @Override // defpackage.ppw
    public final long c(int i) {
        pse.e(i >= 0);
        pse.e(i < this.c.length);
        return this.c[i];
    }

    @Override // defpackage.ppw
    public final List d(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                pru pruVar = (pru) this.a.get(i);
                ppp pppVar = pruVar.a;
                if (pppVar.g == -3.4028235E38f) {
                    arrayList2.add(pruVar);
                } else {
                    arrayList.add(pppVar);
                }
            }
        }
        Collections.sort(arrayList2, bea.n);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ppo ppoVar = new ppo(((pru) arrayList2.get(i3)).a);
            ppoVar.b((-1) - i3, 1);
            arrayList.add(ppoVar.a());
        }
        return arrayList;
    }
}
