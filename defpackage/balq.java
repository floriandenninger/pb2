package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class balq extends balk {
    private final bajp a;
    final long b;

    public balq(bajj bajjVar, long j) {
        super(bajjVar);
        this.b = j;
        this.a = new balp(this, ((baji) bajjVar).a);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp p() {
        return this.a;
    }

    public abstract long v(long j, long j2);

    public long w(long j, long j2) {
        throw null;
    }

    public final int x(long j, long j2) {
        return aynu.w(w(j, j2));
    }
}
