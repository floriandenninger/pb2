package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsa implements axqr {
    private final trx a;
    private final /* synthetic */ int b;

    public tsa(trx trxVar, int i) {
        this.b = i;
        this.a = trxVar;
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                tss tssVar = this.a.c;
                ayaw.k(tssVar);
                return tssVar;
            case 1:
                ammv ammvVar = this.a.d;
                ayaw.k(ammvVar);
                return ammvVar;
            case 2:
                return this.a.i;
            case 3:
                ammv ammvVar2 = this.a.f;
                ayaw.k(ammvVar2);
                return ammvVar2;
            case 4:
                ttw ttwVar = this.a.b;
                ayaw.k(ttwVar);
                return ttwVar;
            case 5:
                return this.a.g;
            case 6:
                vcw vcwVar = this.a.a;
                ayaw.k(vcwVar);
                return vcwVar;
            default:
                trx trxVar = this.a;
                return trxVar.e.h() ? (tme) trxVar.e.c() : new tme() { // from class: trw
                    @Override // defpackage.tme
                    public final void a(Throwable th, String str, Object[] objArr) {
                    }
                };
        }
    }
}
