package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahsz implements ahsq {
    public final Executor a;
    public final banw b;
    public final aivl c;
    public aixl d;
    public aixi e;
    public aixi f;
    public aixi g;
    public ajbq h;
    public boolean i = false;
    private final banw j;

    public ahsz(aypn aypnVar, aypn aypnVar2, Executor executor, banw banwVar, banw banwVar2, aivl aivlVar) {
        final int i = 0;
        final int i2 = 1;
        aypnVar.Y(new ayrs(this) { // from class: ahsr
            public final /* synthetic */ ahsz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    ahsz ahszVar = this.a;
                    ahszVar.c();
                    if (ahszVar.i) {
                        ahszVar.i = false;
                        ahszVar.b.c(ahsp.b(3));
                        return;
                    }
                    return;
                }
                ahsz ahszVar2 = this.a;
                ahel ahelVar = (ahel) obj;
                ahszVar2.d = ahelVar.a().m();
                ahszVar2.h = ahelVar.a().p();
            }
        }, ahfo.k);
        aypnVar2.Y(new ayrs(this) { // from class: ahsr
            public final /* synthetic */ ahsz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    ahsz ahszVar = this.a;
                    ahszVar.c();
                    if (ahszVar.i) {
                        ahszVar.i = false;
                        ahszVar.b.c(ahsp.b(3));
                        return;
                    }
                    return;
                }
                ahsz ahszVar2 = this.a;
                ahel ahelVar = (ahel) obj;
                ahszVar2.d = ahelVar.a().m();
                ahszVar2.h = ahelVar.a().p();
            }
        }, ahfo.k);
        this.a = executor;
        this.b = banwVar;
        this.j = banwVar2;
        this.c = aivlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i) {
        c();
        this.i = false;
        this.b.c(ahsp.b(i));
    }

    @Override // defpackage.ahsq
    public final void a() {
        if (this.i) {
            c();
            this.i = false;
            this.b.c(ahsp.b(2));
        }
    }

    @Override // defpackage.ahsq
    public final void b(final long j, long j2) {
        this.d.getClass();
        if (!this.i) {
            this.a.execute(new Runnable() { // from class: ahss
                @Override // java.lang.Runnable
                public final void run() {
                    ahsz ahszVar = ahsz.this;
                    ahszVar.c.U(j);
                    ahszVar.c.b();
                }
            });
            this.i = true;
        }
        c();
        ahsu ahsuVar = new ahsu(this, j - 1, j);
        this.e = ahsuVar;
        this.d.c(ahsuVar);
        ahsw ahswVar = new ahsw(this, j2, j);
        this.f = ahswVar;
        this.d.c(ahswVar);
        ahsy ahsyVar = new ahsy(this, j);
        this.g = ahsyVar;
        this.d.c(ahsyVar);
        this.j.c(ahta.c(j, j2));
    }

    public final void c() {
        aixl aixlVar = this.d;
        if (aixlVar != null) {
            aixlVar.i(this.e);
            this.d.i(this.f);
            this.d.i(this.g);
        }
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void d(long j) {
        if (j < this.h.g) {
            f(1);
        } else {
            this.c.U(j);
        }
    }
}
