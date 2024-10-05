package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pj {
    private static pj i;
    private static final Object j = new Object();
    pj a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Object h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pj a(int i2, int i3, int i4) {
        return c(i2, i3, i4, 0, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pj b(int i2, int i3, Object obj) {
        return c(i2, i3, 0, 0, 0, 0, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.a = null;
        this.g = 0;
        this.f = 0;
        this.e = 0;
        this.d = 0;
        this.c = 0;
        this.b = 0;
        this.h = null;
        synchronized (j) {
            pj pjVar = i;
            if (pjVar != null) {
                this.a = pjVar;
            }
            i = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pj c(int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        pj pjVar;
        synchronized (j) {
            pjVar = i;
            if (pjVar == null) {
                pjVar = new pj();
            } else {
                i = pjVar.a;
                pjVar.a = null;
            }
            pjVar.b = i2;
            pjVar.c = i3;
            pjVar.d = i4;
            pjVar.e = i5;
            pjVar.f = i6;
            pjVar.g = i7;
            pjVar.h = obj;
        }
        return pjVar;
    }
}
