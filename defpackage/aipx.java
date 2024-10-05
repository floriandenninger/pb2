package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aipx implements Runnable {
    final /* synthetic */ aipz a;

    public aipx(aipz aipzVar) {
        this.a = aipzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aipz aipzVar = this.a;
        yjk.e();
        aaxm a = aipzVar.a.a();
        a.k = aipzVar.b;
        a.b = aipzVar.d.c;
        a.m(aipzVar.e);
        a.d(aipzVar.f);
        a.c = aipzVar.h;
        try {
            arxn b = aipzVar.a.b(a);
            aipzVar.h++;
            if ((b.b & 2) == 0) {
                aipzVar.f(null, 7);
                return;
            }
            aryi aryiVar = b.d;
            if (aryiVar == null) {
                aryiVar = aryi.a;
            }
            if (ahbx.l(aryiVar)) {
                aipzVar.e();
                return;
            }
            int bG = anaf.bG(aryiVar.c);
            if (bG == 0 || bG != 2) {
                aipzVar.d(new aigr(9, true, aryiVar.d), aryiVar, false);
            } else {
                aipzVar.f(null, 7);
            }
        } catch (aasx e) {
            aipzVar.f(e, 8);
        }
    }
}
