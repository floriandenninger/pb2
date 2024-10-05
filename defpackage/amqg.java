package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amqg extends amqi {
    public static final amqg a = new amqg();
    private static final long serialVersionUID = 0;

    private amqg() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.amqi
    /* renamed from: a */
    public final int compareTo(amqi amqiVar) {
        return amqiVar == this ? 0 : -1;
    }

    @Override // defpackage.amqi
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.amqi
    public final void c(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // defpackage.amqi, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((amqi) obj);
    }

    @Override // defpackage.amqi
    public final void d(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.amqi
    public final boolean e(Comparable comparable) {
        return true;
    }

    @Override // defpackage.amqi
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
