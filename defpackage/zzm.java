package defpackage;

import java.util.Arrays;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zzm {
    public int b;
    private zzl[] c = new zzl[1];
    public final PriorityQueue a = new PriorityQueue(1);

    public final ammv a(int i) {
        return (i < 0 || i >= this.b) ? amlr.a : ammv.j(this.c[i]);
    }

    public final void b(float f, float f2) {
        int i = this.b;
        zzl[] zzlVarArr = this.c;
        int length = zzlVarArr.length;
        if (i >= length) {
            this.c = (zzl[]) Arrays.copyOf(zzlVarArr, length + length);
        }
        zzl[] zzlVarArr2 = this.c;
        zzl zzlVar = zzlVarArr2[i];
        if (zzlVar == null) {
            zzlVarArr2[i] = new zzl(i, f, f2);
        } else {
            zzlVar.a = i;
            zzlVar.b = f;
            zzlVar.c = f2;
        }
        this.b++;
        this.a.add(this.c[i]);
    }
}
