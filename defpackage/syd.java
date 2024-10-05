package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class syd {
    public abstract void a(int i, String str, sxc sxcVar, Throwable th);

    @Deprecated
    public final void b(int i, String str) {
        a(i, str, sxc.a, null);
    }

    public final void c(int i, String str, sxc sxcVar) {
        a(i, str, sxcVar, null);
    }

    @Deprecated
    public final void d(int i, String str, Throwable th) {
        a(i, str, sxc.a, th);
    }
}
