package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbm extends kbh implements Comparable {
    private final long b;

    public kbm(aooy aooyVar, long j) {
        super(aooyVar);
        this.b = j;
    }

    public final Long a() {
        return Long.valueOf(this.b);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return -a().compareTo(((kbm) obj).a());
    }
}
