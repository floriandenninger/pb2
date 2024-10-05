package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rwc {
    public sba a;
    public int b;
    public rwz c;
    public boolean d = false;

    public rwc(rwz rwzVar) {
        this.c = rwzVar;
    }

    protected final void a() {
        this.d = true;
    }

    public final synchronized void b(float f) {
        this.c.g(f);
        a();
    }

    public synchronized void c(rze rzeVar, rze rzeVar2, sba sbaVar, saw sawVar, boolean z) {
        this.a = sbaVar;
        this.c.x(rzeVar, rzeVar2, sawVar, sbaVar);
        a();
    }
}
