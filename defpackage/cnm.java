package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnm {
    public final Object a;
    public final cnc b;
    public final cnq c;

    private cnm(cnq cnqVar) {
        this.a = null;
        this.b = null;
        this.c = cnqVar;
    }

    private cnm(Object obj, cnc cncVar) {
        this.a = obj;
        this.b = cncVar;
        this.c = null;
    }

    public static cnm a(cnq cnqVar) {
        return new cnm(cnqVar);
    }

    public static cnm b(Object obj, cnc cncVar) {
        return new cnm(obj, cncVar);
    }

    public final boolean c() {
        return this.c == null;
    }
}
