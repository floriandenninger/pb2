package defpackage;

import android.os.Handler;
import com.google.cardboard.sdk.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abyz implements afwx {
    final /* synthetic */ abzl a;
    final /* synthetic */ abwk b;

    public abyz(abzl abzlVar, abwk abwkVar) {
        this.a = abzlVar;
        this.b = abwkVar;
    }

    private final void d(final int i, final boolean z, final long j) {
        Handler handler = this.a.b;
        final abwk abwkVar = this.b;
        handler.post(new Runnable() { // from class: abyy
            @Override // java.lang.Runnable
            public final void run() {
                final int i2;
                final abwk abwkVar2 = abwk.this;
                int i3 = i;
                boolean z2 = z;
                long j2 = j;
                if (abwkVar2.b.d.d()) {
                    int i4 = abwkVar2.a;
                    StringBuilder sb = new StringBuilder(R.styleable.AppCompatTheme_windowFixedWidthMinor);
                    sb.append("Start stream failed: status=");
                    sb.append(i3);
                    sb.append(", remainingAttempts=");
                    sb.append(i4);
                    sb.append(", mayRetry=");
                    sb.append(z2);
                    sb.append(", minDelayMillis=");
                    sb.append(j2);
                    zga.l(sb.toString());
                    if (!z2 || (i2 = abwkVar2.a) <= 0) {
                        abwkVar2.b.i.m();
                    } else {
                        abwkVar2.b.s.postDelayed(new Runnable() { // from class: abwj
                            @Override // java.lang.Runnable
                            public final void run() {
                                abwk abwkVar3 = abwk.this;
                                int i5 = i2;
                                abwy abwyVar = abwkVar3.b;
                                if (abwyVar.S) {
                                    abwyVar.k(i5 - 1);
                                }
                            }
                        }, Math.max(1000L, j2));
                    }
                }
            }
        });
    }

    private final void e() {
        d(1, true, 500L);
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        String valueOf = String.valueOf(abzl.n(cnqVar));
        zga.b(valueOf.length() != 0 ? "Error starting broadcast: ".concat(valueOf) : new String("Error starting broadcast: "));
        abvt.b().n(8, 1, cnqVar);
        e();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        asbg asbgVar = (asbg) obj;
        if (asbgVar == null) {
            zga.b("Start broadcast: missing response");
            abvt.b().n(8, 1, null);
            e();
            return;
        }
        if (asbgVar.c.size() > 0) {
            asss asssVar = ((asbe) asbgVar.c.get(0)).b;
            if (asssVar == null) {
                asssVar = asss.a;
            }
            abvt b = abvt.b();
            int df = amkq.df(asssVar.d);
            if (df == 0) {
                df = 1;
            }
            b.n(8, abzl.o(df), null);
            int df2 = amkq.df(asssVar.d);
            d(abzl.p(df2 != 0 ? df2 : 1), asssVar.e, asssVar.f);
            return;
        }
        abvt.b().m(10);
        Handler handler = this.a.b;
        final abwk abwkVar = this.b;
        handler.post(new Runnable() { // from class: abyx
            @Override // java.lang.Runnable
            public final void run() {
                abwk abwkVar2 = abwk.this;
                if (abwkVar2.b.d.d()) {
                    abwkVar2.b.c.t();
                    abwkVar2.b.i.d();
                }
            }
        });
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
