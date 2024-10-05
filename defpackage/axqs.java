package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqs implements axqr, axpg {
    private static final axqs b = new axqs(null);
    public final Object a;

    private axqs(Object obj) {
        this.a = obj;
    }

    public static axqr a(Object obj) {
        obj.getClass();
        return new axqs(obj);
    }

    public static axqr b(Object obj) {
        return obj == null ? b : new axqs(obj);
    }

    @Override // defpackage.azrw
    public final Object get() {
        return this.a;
    }
}
