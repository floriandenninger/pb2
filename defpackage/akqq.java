package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqq implements akqw {
    public final aksf a;
    public final amql b = amql.a(3);
    public volatile amru c = amru.q();
    private final aksb d;

    public akqq(aksd aksdVar, anic anicVar) {
        this.a = aksdVar.e();
        aksa a = aksb.a(anicVar, aksdVar.d());
        a.d = aksdVar.c();
        final int i = 1;
        a.a = new Runnable(this) { // from class: akqp
            public final /* synthetic */ akqq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i == 0) {
                    akqq akqqVar = this.a;
                    akqqVar.b.clear();
                    akqqVar.c = amru.q();
                } else {
                    akqq akqqVar2 = this.a;
                    akqqVar2.b.add(akqqVar2.a.call());
                    akqqVar2.c = amru.o(akqqVar2.b);
                }
            }
        };
        a.c = new nvp(9);
        final int i2 = 0;
        a.b = new Runnable(this) { // from class: akqp
            public final /* synthetic */ akqq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 == 0) {
                    akqq akqqVar = this.a;
                    akqqVar.b.clear();
                    akqqVar.c = amru.q();
                } else {
                    akqq akqqVar2 = this.a;
                    akqqVar2.b.add(akqqVar2.a.call());
                    akqqVar2.c = amru.o(akqqVar2.b);
                }
            }
        };
        this.d = a.a();
    }

    @Override // defpackage.akqw
    public final amru a() {
        return this.c;
    }

    @Override // defpackage.akqw
    public final void b() {
        this.d.d();
    }

    @Override // defpackage.akqw
    public final void c() {
        this.d.e();
    }
}
