package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bed implements Comparable {
    private final boolean a;
    private final boolean b;

    public bed(pms pmsVar, int i) {
        this.a = 1 == (pmsVar.f & 1);
        this.b = bej.e(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bed bedVar) {
        return amqd.b.e(this.b, bedVar.b).e(this.a, bedVar.a).a();
    }
}
