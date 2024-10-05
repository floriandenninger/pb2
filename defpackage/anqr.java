package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anqr {
    final long[] a;
    final anqp b;

    public anqr(anqp anqpVar, long[] jArr, byte[] bArr) {
        this.b = anqpVar;
        this.a = jArr;
    }

    public anqr(anqr anqrVar, byte[] bArr, byte[] bArr2) {
        this.b = new anqp(anqrVar.b, (byte[]) null);
        this.a = Arrays.copyOf(anqrVar.a, 10);
    }

    public static void a(anqr anqrVar, anqr anqrVar2) {
        anrb.a(anqrVar.b.c, anqrVar2.b.c, anqrVar2.a);
        long[] jArr = anqrVar.b.b;
        anqp anqpVar = anqrVar2.b;
        anrb.a(jArr, anqpVar.b, anqpVar.a);
        anrb.a(anqrVar.b.a, anqrVar2.b.a, anqrVar2.a);
        long[] jArr2 = anqrVar.a;
        anqp anqpVar2 = anqrVar2.b;
        anrb.a(jArr2, anqpVar2.c, anqpVar2.b);
    }

    public anqr() {
        this(new anqp((byte[]) null), new long[10], (byte[]) null);
    }

    public anqr(anqr anqrVar, byte[] bArr) {
        this();
        a(this, anqrVar);
    }
}
