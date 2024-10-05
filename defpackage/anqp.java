package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class anqp {
    final long[] a;
    final long[] b;
    final long[] c;

    anqp() {
        this(new long[10], new long[10], new long[10]);
    }

    public anqp(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    public anqp(long[] jArr, long[] jArr2, long[] jArr3, byte[] bArr) {
        this.c = jArr;
        this.b = jArr2;
        this.a = jArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(anqp anqpVar, anqr anqrVar) {
        anrb.a(anqpVar.c, anqrVar.b.c, anqrVar.a);
        long[] jArr = anqpVar.b;
        anqp anqpVar2 = anqrVar.b;
        anrb.a(jArr, anqpVar2.b, anqpVar2.a);
        anrb.a(anqpVar.a, anqrVar.b.a, anqrVar.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(anqp anqpVar, int i) {
        aocz.as(this.a, anqpVar.a, i);
        aocz.as(this.b, anqpVar.b, i);
        aocz.as(this.c, anqpVar.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final byte[] c() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = this.a;
        int i = anrb.a;
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = new long[10];
        anrb.d(jArr5, jArr4);
        anrb.d(jArr14, jArr5);
        anrb.d(jArr13, jArr14);
        anrb.a(jArr6, jArr13, jArr4);
        anrb.a(jArr7, jArr6, jArr5);
        anrb.d(jArr13, jArr7);
        anrb.a(jArr8, jArr13, jArr6);
        anrb.d(jArr13, jArr8);
        anrb.d(jArr14, jArr13);
        anrb.d(jArr13, jArr14);
        anrb.d(jArr14, jArr13);
        anrb.d(jArr13, jArr14);
        anrb.a(jArr9, jArr13, jArr8);
        anrb.d(jArr13, jArr9);
        anrb.d(jArr14, jArr13);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            anrb.d(jArr13, jArr14);
            anrb.d(jArr14, jArr13);
        }
        anrb.a(jArr10, jArr14, jArr9);
        anrb.d(jArr13, jArr10);
        anrb.d(jArr14, jArr13);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            anrb.d(jArr13, jArr14);
            anrb.d(jArr14, jArr13);
        }
        anrb.a(jArr13, jArr14, jArr10);
        anrb.d(jArr14, jArr13);
        anrb.d(jArr13, jArr14);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            anrb.d(jArr14, jArr13);
            anrb.d(jArr13, jArr14);
        }
        anrb.a(jArr11, jArr13, jArr9);
        anrb.d(jArr13, jArr11);
        anrb.d(jArr14, jArr13);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            anrb.d(jArr13, jArr14);
            anrb.d(jArr14, jArr13);
        }
        anrb.a(jArr12, jArr14, jArr11);
        anrb.d(jArr14, jArr12);
        anrb.d(jArr13, jArr14);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            anrb.d(jArr14, jArr13);
            anrb.d(jArr13, jArr14);
        }
        anrb.a(jArr14, jArr13, jArr12);
        anrb.d(jArr13, jArr14);
        anrb.d(jArr14, jArr13);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            anrb.d(jArr13, jArr14);
            anrb.d(jArr14, jArr13);
        }
        anrb.a(jArr13, jArr14, jArr11);
        anrb.d(jArr14, jArr13);
        anrb.d(jArr13, jArr14);
        anrb.d(jArr14, jArr13);
        anrb.d(jArr13, jArr14);
        anrb.d(jArr14, jArr13);
        anrb.a(jArr, jArr14, jArr7);
        anrb.a(jArr2, this.c, jArr);
        anrb.a(jArr3, this.b, jArr);
        byte[] g = anrb.g(jArr3);
        g[31] = (byte) ((anqs.a(jArr2) << 7) ^ g[31]);
        return g;
    }

    public anqp(anqp anqpVar) {
        this.a = Arrays.copyOf(anqpVar.a, 10);
        this.b = Arrays.copyOf(anqpVar.b, 10);
        this.c = Arrays.copyOf(anqpVar.c, 10);
    }

    public anqp(byte[] bArr) {
        this(new long[10], new long[10], new long[10], null);
    }

    public anqp(anqr anqrVar, byte[] bArr) {
        this((byte[]) null);
        d(this, anqrVar);
    }

    public anqp(anqp anqpVar, byte[] bArr) {
        this.c = Arrays.copyOf(anqpVar.c, 10);
        this.b = Arrays.copyOf(anqpVar.b, 10);
        this.a = Arrays.copyOf(anqpVar.a, 10);
    }
}
