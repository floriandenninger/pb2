package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxw {
    public String a;
    public int b;
    private Long c;

    public final anxx a() {
        Long l = this.c;
        if (l == null) {
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }
        return new anxx(this.a, l.longValue(), this.b);
    }

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }
}
