package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abwn implements abxx {
    final /* synthetic */ abwy a;
    private int b = 5;

    public abwn(abwy abwyVar) {
        this.a = abwyVar;
    }

    @Override // defpackage.abxx
    public final void a(atfw atfwVar, List list) {
        if (this.a.d.d()) {
            abwy abwyVar = this.a;
            abwyVar.V = atfwVar;
            abwyVar.g(list);
            String.valueOf(String.valueOf(atfwVar)).length();
            abxc abxcVar = this.a.i;
            int i = abxcVar.a;
            amkq.N(i == 10 || i == 9 || i == 12 || i == 11);
            abxcVar.e = true;
            abxcVar.h();
        }
    }

    @Override // defpackage.abxx
    public final void b(int i, String str) {
        if (this.a.d.d()) {
            if (i == 33) {
                this.a.b(false);
                this.a.i(33, str, false);
                return;
            }
            int i2 = this.b - 1;
            this.b = i2;
            StringBuilder sb = new StringBuilder(69);
            sb.append("Stop stream failed: status=");
            sb.append(i);
            sb.append(", attemptsRemaining=");
            sb.append(i2);
            zga.b(sb.toString());
            if (this.b <= 0) {
                this.a.b(false);
            } else {
                this.a.s.postDelayed(new Runnable() { // from class: abwm
                    @Override // java.lang.Runnable
                    public final void run() {
                        abwn abwnVar = abwn.this;
                        abxx abxxVar = this;
                        abwy abwyVar = abwnVar.a;
                        abwyVar.k.e(abwyVar.x, abxxVar);
                    }
                }, 400L);
            }
        }
    }
}
