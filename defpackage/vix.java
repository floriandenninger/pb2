package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vix implements vis {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.vis
    public final aobc a() {
        aone createBuilder = aoba.a.createBuilder();
        for (int i = 0; i < this.b; i++) {
            aone createBuilder2 = aoaz.a.createBuilder();
            double d = this.a[i];
            createBuilder2.copyOnWrite();
            aoaz aoazVar = (aoaz) createBuilder2.instance;
            aoazVar.b |= 1;
            aoazVar.c = d;
            createBuilder2.copyOnWrite();
            aoaz aoazVar2 = (aoaz) createBuilder2.instance;
            aoazVar2.b |= 2;
            aoazVar2.d = 1L;
            createBuilder.copyOnWrite();
            aoba aobaVar = (aoba) createBuilder.instance;
            aoaz aoazVar3 = (aoaz) createBuilder2.build();
            aoazVar3.getClass();
            aony aonyVar = aobaVar.b;
            if (!aonyVar.c()) {
                aobaVar.b = aonm.mutableCopy(aonyVar);
            }
            aobaVar.b.add(aoazVar3);
        }
        aone createBuilder3 = aobc.a.createBuilder();
        createBuilder3.copyOnWrite();
        aobc aobcVar = (aobc) createBuilder3.instance;
        aoba aobaVar2 = (aoba) createBuilder.build();
        aobaVar2.getClass();
        aobcVar.c = aobaVar2;
        aobcVar.b = 3;
        return (aobc) createBuilder3.build();
    }

    @Override // defpackage.vis
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
