package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekr {
    final /* synthetic */ aeks a;
    private ajcc b = null;
    private long c = 0;

    public aekr(aeks aeksVar) {
        this.a = aeksVar;
    }

    public final synchronized long a(String str) {
        ajcc ajccVar = this.b;
        if (ajccVar != null && ajccVar.b.equals(str)) {
            aeks aeksVar = this.a;
            aekg aekgVar = aeksVar.p;
            if (aekgVar.e) {
                return Math.max(aekgVar.g - (aeksVar.n.d() - this.c), 0L);
            }
        }
        return 0L;
    }

    public final synchronized ajcc b() {
        return this.b;
    }

    public final synchronized void c(ajcc ajccVar) {
        this.b = ajccVar;
        this.c = this.a.n.d();
    }

    public final synchronized void d() {
        this.b = null;
        this.c = 0L;
        notifyAll();
    }
}
