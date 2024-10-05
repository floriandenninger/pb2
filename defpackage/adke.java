package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adke implements Cloneable {
    final long a;
    final long b;

    public adke(long j, long j2) {
        amkq.E(j <= j2);
        this.a = j;
        this.b = j2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adke clone() {
        try {
            return (adke) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final boolean b(long j) {
        return j >= this.a && j <= this.b;
    }
}
