package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aacj {
    private final Object a;

    private aacj(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public static aacj a(Object obj) {
        return new aacj(obj);
    }

    public Object b() {
        return this.a;
    }
}
