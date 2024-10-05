package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbd {
    public volatile boolean a = false;
    public final /* synthetic */ ajbf b;
    public wqe c;

    public ajbd(ajbf ajbfVar) {
        this.b = ajbfVar;
        ajbfVar.c.d();
    }

    public final void a() {
        b();
        if (this.c != null && this.a) {
            this.a = false;
            if (!aifk.g(this.b.d)) {
                this.b.a.c();
            }
        }
        final ajbf ajbfVar = this.b;
        ajbfVar.b.execute(new Runnable() { // from class: ajax
            @Override // java.lang.Runnable
            public final void run() {
                ajbf ajbfVar2 = ajbf.this;
                if (this == ajbfVar2.f) {
                    ajbfVar2.f = null;
                    ajbfVar2.g = null;
                    ajbfVar2.b();
                }
            }
        });
        this.b.f = null;
        this.b.b();
    }

    public final void b() {
        if (this.b.f != this) {
            throw new ajbe();
        }
    }
}
