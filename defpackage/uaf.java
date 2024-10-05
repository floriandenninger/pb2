package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uaf {
    public aooy a;
    public aooy b;
    public Throwable c;
    private Boolean d;

    public final uag a() {
        Boolean bool = this.d;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: isRetryableError");
        }
        return new uag(this.a, this.b, this.c, bool.booleanValue());
    }

    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
