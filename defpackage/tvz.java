package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tvz {
    public Long a;
    private Long b;

    public final twd a() {
        Long l = this.b;
        if (l == null) {
            throw new IllegalStateException("Missing required properties: startTime");
        }
        return new twd(this.a, l.longValue());
    }

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }
}
