package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqv implements abrp, abqx {
    public abro a;
    public int b = 0;
    private final abqy c = new abqy(this);
    private final abru d;

    public abqv(abru abruVar) {
        this.d = abruVar;
    }

    @Override // defpackage.abqx
    public final void a(int i) {
        this.b = i;
    }

    @Override // defpackage.abqx
    public final synchronized void b() {
        abro abroVar = this.a;
        if (abroVar != null) {
            abroVar.a();
        }
    }

    @Override // defpackage.abrp
    public final void c(abqu abquVar) {
        this.c.a();
        this.b = 0;
    }

    @Override // defpackage.abrp
    public final synchronized boolean e(boolean z, abrr abrrVar, abqu abquVar) {
        int b = this.d.b();
        int a = this.d.a();
        if (b != 0 && a != 0) {
            this.c.b(b, a);
            this.c.e(z, abrrVar, abquVar);
            return true;
        }
        return false;
    }
}
