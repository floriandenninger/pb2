package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tbm {
    public Long a;
    public Long b;
    public Long c;
    public Integer d;
    public tbo e;
    private String f;

    public final tbq a() {
        String str = this.f;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: name");
        }
        return new tbq(str, this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f = str;
    }
}
