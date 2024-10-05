package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pft {
    public final int a;
    private int b;
    private int c;
    private anrc[] d;

    public pft(int i) {
        opn.i(i > 0);
        opn.i(true);
        this.a = i;
        this.c = 0;
        this.d = new anrc[100];
    }

    public final synchronized int a() {
        return this.b * this.a;
    }

    public final synchronized void b(int i) {
        while (a() > i) {
            wait();
        }
    }

    public final synchronized void c(int i) {
        int max = Math.max(0, pgz.a(i, this.a) - this.b);
        int i2 = this.c;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.d, max, i2, (Object) null);
        this.c = max;
    }

    public final synchronized anrc d() {
        anrc anrcVar;
        this.b++;
        int i = this.c;
        if (i > 0) {
            anrc[] anrcVarArr = this.d;
            int i2 = i - 1;
            this.c = i2;
            anrcVar = anrcVarArr[i2];
            anrcVarArr[i2] = null;
        } else {
            anrcVar = new anrc(new byte[this.a]);
        }
        return anrcVar;
    }

    public final synchronized void e(anrc anrcVar) {
        byte[] bArr = anrcVar.a;
        boolean z = true;
        if (bArr != null && bArr.length != this.a) {
            z = false;
        }
        opn.i(z);
        this.b--;
        int i = this.c;
        anrc[] anrcVarArr = this.d;
        int length = anrcVarArr.length;
        if (i == length) {
            this.d = (anrc[]) Arrays.copyOf(anrcVarArr, length + length);
        }
        anrc[] anrcVarArr2 = this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        anrcVarArr2[i2] = anrcVar;
        notifyAll();
    }

    public final synchronized void f(anrc[] anrcVarArr) {
        int length = this.c + anrcVarArr.length;
        anrc[] anrcVarArr2 = this.d;
        int length2 = anrcVarArr2.length;
        if (length >= length2) {
            this.d = (anrc[]) Arrays.copyOf(anrcVarArr2, Math.max(length2 + length2, length));
        }
        for (anrc anrcVar : anrcVarArr) {
            byte[] bArr = anrcVar.a;
            boolean z = true;
            if (bArr != null && bArr.length != this.a) {
                z = false;
            }
            opn.i(z);
            anrc[] anrcVarArr3 = this.d;
            int i = this.c;
            this.c = i + 1;
            anrcVarArr3[i] = anrcVar;
        }
        this.b -= anrcVarArr.length;
        notifyAll();
    }
}
