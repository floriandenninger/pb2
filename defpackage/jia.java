package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jia {
    public final jhz a;
    public final Class b;
    public final Runnable c;

    private jia(jhz jhzVar, Class cls, Runnable runnable) {
        this.a = jhzVar;
        this.b = cls;
        this.c = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jia a(String str, Class cls, Runnable runnable) {
        return new jia(new jhz(jhy.PLAYLIST, str), cls, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jia b(String str, Class cls, Runnable runnable) {
        return new jia(new jhz(jhy.VIDEO, str), cls, runnable);
    }
}
