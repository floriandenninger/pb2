package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aziw implements ayqd {
    final ayqd a;
    final ayrv b;
    final aysd c = new aysd();
    boolean d;
    boolean e;

    public aziw(ayqd ayqdVar, ayrv ayrvVar) {
        this.a = ayqdVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.d) {
            if (this.e) {
                aynu.j(th);
                return;
            } else {
                this.a.b(th);
                return;
            }
        }
        this.d = true;
        try {
            ayqb ayqbVar = (ayqb) ((aysq) this.b).a;
            if (ayqbVar == null) {
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                this.a.b(nullPointerException);
                return;
            }
            ayqbVar.aE(this);
        } catch (Throwable th2) {
            aynu.c(th2);
            this.a.b(new ayrf(th, th2));
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        this.a.c(obj);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.i(this.c, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d = true;
        this.a.sh();
    }
}
