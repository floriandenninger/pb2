package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbm {
    public final Class a;
    public final cqp b;
    private final Class c;

    public dbm(Class cls, Class cls2, cqp cqpVar) {
        this.c = cls;
        this.a = cls2;
        this.b = cqpVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
