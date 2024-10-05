package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class emw implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ emz b;

    public emw(emz emzVar, boolean z) {
        this.b = emzVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aadr aadrVar = (aadr) this.b.n.get();
        aadrVar.d(this.b.b);
        aarh aarhVar = (aarh) this.b.o.get();
        emz emzVar = this.b;
        aarhVar.h(emzVar.a, emzVar.n, emzVar.j);
        if (!this.a) {
            this.b.c();
        } else {
            emz emzVar2 = this.b;
            ayph B = emzVar2.c.B(azre.b(emzVar2.a));
            final emz emzVar3 = this.b;
            B.R(new ayrm() { // from class: emv
                @Override // defpackage.ayrm
                public final void a() {
                    emz.this.c();
                }
            });
        }
        ((zfy) this.b.f.get()).c(this.b.b, aadrVar.a());
    }
}
