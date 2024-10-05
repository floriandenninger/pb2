package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class siy {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final AtomicReference c;
    public final six[] d;
    public final six[] e;
    public final sim[] f;

    public siy(sim[] simVarArr) {
        this.f = simVarArr;
        int length = simVarArr.length;
        int i = length + 1;
        six[] sixVarArr = new six[i];
        six[] sixVarArr2 = new six[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sixVarArr[i3] = new six(b, i3);
            sixVarArr2[i3] = new six(a, i3);
        }
        this.d = sixVarArr;
        this.e = sixVarArr2;
        six sixVar = sixVarArr[0];
        while (i2 < length) {
            six sixVar2 = new six(sixVar, i2);
            i2++;
            sixVar = sixVar2;
        }
        this.c = new AtomicReference(sixVar);
    }
}
