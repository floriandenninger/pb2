package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqq extends anqp {
    private final long[] d;

    anqq() {
        super(new long[10], new long[10], new long[10]);
        this.d = new long[10];
    }

    @Override // defpackage.anqp
    public final void b(long[] jArr, long[] jArr2) {
        anrb.a(jArr, jArr2, this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anqq(anqr anqrVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.d = jArr;
        long[] jArr2 = this.a;
        anqp anqpVar = anqrVar.b;
        anrb.f(jArr2, anqpVar.b, anqpVar.c);
        long[] jArr3 = this.b;
        anqp anqpVar2 = anqrVar.b;
        anrb.e(jArr3, anqpVar2.b, anqpVar2.c);
        System.arraycopy(anqrVar.b.a, 0, jArr, 0, 10);
        anrb.a(this.c, anqrVar.a, anqu.b);
    }
}
