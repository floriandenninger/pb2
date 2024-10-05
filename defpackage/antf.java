package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class antf {
    public String a;
    public String b;
    private String c;
    private String d;

    public final antg a() {
        return new antg(this.d, this.c, null, null, this.a, null, this.b);
    }

    public final void b(String str) {
        qip.ay(str, "ApiKey must be set.");
        this.c = str;
    }

    public final void c(String str) {
        qip.ay(str, "ApplicationId must be set.");
        this.d = str;
    }
}
