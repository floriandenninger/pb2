package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aetj extends aetl {
    private final afjf b;
    private final long c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private final int j;

    public aetj(afjf afjfVar, int i, long j) {
        this.b = afjfVar;
        this.j = i;
        this.c = j;
    }

    @Override // defpackage.aetl
    public final void a() {
        this.b.h();
    }

    @Override // defpackage.aetl
    public final void b(long j) {
        if (j >= this.c / 2 && !this.h) {
            this.h = true;
            if (this.j == 2) {
                this.b.au();
            } else {
                this.b.d();
            }
        }
        if (j < this.c || this.i) {
            return;
        }
        this.i = true;
        if (this.j == 2) {
            this.b.at();
        } else {
            this.b.c();
        }
    }

    @Override // defpackage.aetl
    public final void c() {
        if (this.d) {
            return;
        }
        this.d = true;
        if (this.j == 2) {
            this.b.ay();
        } else {
            this.b.i();
        }
    }

    @Override // defpackage.aetl
    public final void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j == 2) {
            this.b.ar();
        } else {
            this.b.a();
        }
    }

    @Override // defpackage.aetl
    public final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.j == 2) {
            this.b.az();
        } else {
            this.b.j();
        }
    }

    @Override // defpackage.aetl
    public final void f() {
        if (this.g) {
            return;
        }
        this.g = true;
        if (this.j == 2) {
            this.b.aA();
        } else {
            this.b.k();
        }
    }
}
