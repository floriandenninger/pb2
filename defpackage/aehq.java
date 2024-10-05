package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aehq extends aeqs {
    final long a;

    public aehq(String str, long j) {
        super(str);
        this.a = j;
    }

    @Override // defpackage.aeqs, defpackage.afgj
    public final String a(long j) {
        long j2 = this.a;
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("t.");
        sb.append(j2 - j);
        sb.append(";");
        sb.append(str);
        return sb.toString();
    }
}
