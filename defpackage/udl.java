package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udl {
    public aooy a;
    public Throwable b;
    private Boolean c;

    public final udn a() {
        Boolean bool = this.c;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: isRetryableError");
        }
        return new udn(this.a, this.b, bool.booleanValue());
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
