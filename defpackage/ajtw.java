package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajtw implements ajtx {
    private static final ajtw a = new ajtw();
    private final ammv b;

    private ajtw() {
        this.b = amlr.a;
    }

    public ajtw(ajce ajceVar) {
        this.b = ammv.j(ajceVar);
    }

    public static ajtw a() {
        return a;
    }

    public ammv b() {
        return this.b;
    }

    public boolean c() {
        return this.b.h() && ((ajce) this.b.c()).a() == ajcd.RELOAD;
    }

    public boolean d() {
        return c() && ((ajce) this.b.c()).c();
    }
}
