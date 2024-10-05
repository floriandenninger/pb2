package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afcj implements afgj {
    private final long a;

    public afcj(long j) {
        this.a = j;
    }

    @Override // defpackage.afgj
    public final String a(long j) {
        StringBuilder sb = new StringBuilder();
        double d = this.a - j;
        Double.isNaN(d);
        sb.append(d / 1000.0d);
        return sb.toString();
    }
}
