package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aacl {
    private final Object a;
    private final ammy b;

    private aacl(Object obj, ammy ammyVar) {
        this.a = obj;
        this.b = ammyVar;
    }

    public static aacl a(ammy ammyVar) {
        ammyVar.getClass();
        return new aacl(null, ammyVar);
    }

    public static aacl b(Object obj) {
        obj.getClass();
        return new aacl(obj, null);
    }

    public ammy c() {
        return this.b;
    }

    public Object d() {
        return this.a;
    }
}
