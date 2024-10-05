package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwf {
    final Class a;
    final cwa b;
    private final Class c;

    public cwf(Class cls, Class cls2, cwa cwaVar) {
        this.c = cls;
        this.a = cls2;
        this.b = cwaVar;
    }

    public final boolean a(Class cls) {
        return this.c.isAssignableFrom(cls);
    }

    public final boolean b(Class cls, Class cls2) {
        return a(cls) && this.a.isAssignableFrom(cls2);
    }
}
