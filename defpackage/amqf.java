package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amqf extends amqi {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqf(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // defpackage.amqi
    public final void c(StringBuilder sb) {
        sb.append('(');
        sb.append(this.b);
    }

    @Override // defpackage.amqi
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(']');
    }

    @Override // defpackage.amqi
    public final boolean e(Comparable comparable) {
        return amvf.b(this.b, comparable) < 0;
    }

    @Override // defpackage.amqi
    public final int hashCode() {
        return this.b.hashCode() ^ (-1);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("/");
        sb.append(valueOf);
        sb.append("\\");
        return sb.toString();
    }
}
