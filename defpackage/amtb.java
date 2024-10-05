package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amtb extends amsv {
    private final Comparator e;

    public amtb(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.amsv, defpackage.amrj, defpackage.amrk
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.amsv
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final amtd g() {
        amvt amvtVar;
        Object[] objArr = this.a;
        Comparator comparator = this.e;
        int i = this.b;
        if (i == 0) {
            amvtVar = amtd.F(comparator);
        } else {
            amkq.aC(objArr, i);
            Arrays.sort(objArr, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < (objArr.length >> 1)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            amvtVar = new amvt(amru.j(objArr, i2), comparator);
        }
        this.b = amvtVar.size();
        this.c = true;
        return amvtVar;
    }

    public final void n(Object... objArr) {
        super.i(objArr);
    }
}
