package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqx implements azrw {
    private static final Object a = new Object();
    private volatile azrw b;
    private volatile Object c = a;

    private axqx(azrw azrwVar) {
        this.b = azrwVar;
    }

    public static azrw a(azrw azrwVar) {
        if ((azrwVar instanceof axqx) || (azrwVar instanceof axqq)) {
            return azrwVar;
        }
        azrwVar.getClass();
        return new axqx(azrwVar);
    }

    @Override // defpackage.azrw
    public final Object get() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        azrw azrwVar = this.b;
        if (azrwVar == null) {
            return this.c;
        }
        Object obj2 = azrwVar.get();
        this.c = obj2;
        this.b = null;
        return obj2;
    }
}
