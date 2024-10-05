package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class owu {
    public static owu d(int i, Object obj) {
        return new ows(Integer.valueOf(i), obj, owv.DEFAULT);
    }

    public static owu e(Object obj) {
        return new ows(null, obj, owv.VERY_LOW);
    }

    public static owu f(int i, Object obj) {
        return new ows(Integer.valueOf(i), obj, owv.VERY_LOW);
    }

    public abstract owv a();

    public abstract Integer b();

    public abstract Object c();
}
