package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abtm implements Runnable {
    final /* synthetic */ abtp a;
    private final /* synthetic */ int b;

    public abtm(abtp abtpVar, int i) {
        this.b = i;
        this.a = abtpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            abtp abtpVar = this.a;
            abwl abwlVar = abtpVar.o;
            if (abwlVar == null || !abtpVar.d) {
                return;
            }
            abwy abwyVar = abwlVar.a;
            if (abwyVar.S) {
                String string = abwyVar.t.getString(R.string.lc_error_battery_low);
                abwy abwyVar2 = abwlVar.a;
                abwyVar2.f.d(1, abwyVar2.M, string, false);
                return;
            }
            return;
        }
        if (i == 1) {
            abtp abtpVar2 = this.a;
            if (abtpVar2.o == null || !abtpVar2.d) {
                return;
            }
            abtpVar2.c.postDelayed(abtpVar2.i, 70000L);
            return;
        }
        abtp abtpVar3 = this.a;
        abwl abwlVar2 = abtpVar3.o;
        if (abwlVar2 == null || !abtpVar3.d) {
            return;
        }
        abwy abwyVar3 = abwlVar2.a;
        if (abwyVar3.S && abwyVar3.v()) {
            abwy abwyVar4 = abwlVar2.a;
            abwyVar4.f.b(abwyVar4.M);
        }
    }
}
