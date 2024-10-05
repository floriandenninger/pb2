package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abyn implements afwx {
    final /* synthetic */ abxr a;
    final /* synthetic */ abzl b;

    public abyn(abzl abzlVar, abxr abxrVar) {
        this.b = abzlVar;
        this.a = abxrVar;
    }

    private final void d(final int i, final String str, final aqdt aqdtVar) {
        Handler handler = this.b.b;
        final abxr abxrVar = this.a;
        handler.post(new Runnable() { // from class: abyl
            @Override // java.lang.Runnable
            public final void run() {
                abxr.this.a(i, str, aqdtVar);
            }
        });
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        String valueOf = String.valueOf(abzl.n(cnqVar));
        zga.b(valueOf.length() != 0 ? "Error creating broadcast: ".concat(valueOf) : new String("Error creating broadcast: "));
        abvt.b().n(4, 1, cnqVar);
        d(1, null, null);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        String str;
        aqdt aqdtVar;
        int i;
        asss asssVar;
        final arnl arnlVar = (arnl) obj;
        final atfp atfpVar = null;
        if (arnlVar == null) {
            zga.b("Create broadcast: missing response");
            abvt.b().n(4, 1, null);
            d(1, null, null);
            return;
        }
        if (arnlVar.e.size() <= 0) {
            if (!arnlVar.d.isEmpty()) {
                if ((arnlVar.b & 32) != 0) {
                    arnm arnmVar = arnlVar.f;
                    if (arnmVar == null) {
                        arnmVar = arnm.a;
                    }
                    if (arnmVar.b == 124974497) {
                        atfpVar = (atfp) arnmVar.c;
                    }
                }
                abvt.b().e = arnlVar.d;
                abvt.b().m(7);
                Handler handler = this.b.b;
                final abxr abxrVar = this.a;
                handler.post(new Runnable() { // from class: abym
                    @Override // java.lang.Runnable
                    public final void run() {
                        abxr abxrVar2 = abxr.this;
                        arnl arnlVar2 = arnlVar;
                        abxrVar2.b(arnlVar2.d, atfpVar);
                    }
                });
                return;
            }
            zga.b("Create broadcast: missing video ID");
            abvt.b().n(4, 1, null);
            d(1, null, null);
            return;
        }
        for (arnj arnjVar : arnlVar.e) {
            if (arnjVar.b == 124003698) {
                int df = amkq.df(((asss) arnjVar.c).d);
                if (df == 0) {
                    df = 1;
                }
                StringBuilder sb = new StringBuilder(57);
                sb.append("Create broadcast: got an error response: type=");
                sb.append(df - 1);
                zga.b(sb.toString());
            }
        }
        if (((arnj) arnlVar.e.get(0)).b == 124003698) {
            arnj arnjVar2 = (arnj) arnlVar.e.get(0);
            if (arnjVar2.b == 124003698) {
                asssVar = (asss) arnjVar2.c;
            } else {
                asssVar = asss.a;
            }
            int df2 = amkq.df(asssVar.d);
            int i2 = df2 != 0 ? df2 : 1;
            int i3 = asssVar.b;
            if (i3 == 5) {
                str = ajcq.b((aqyg) asssVar.c).toString();
                i = i2;
                aqdtVar = null;
            } else if (i3 == 6) {
                i = i2;
                aqdtVar = (aqdt) ((aulq) asssVar.c).pX(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                str = null;
            } else {
                i = i2;
                str = null;
                aqdtVar = null;
            }
        } else {
            str = null;
            aqdtVar = null;
            i = 1;
        }
        abvt.b().n(4, abzl.o(i), null);
        d(abzl.p(i), str, aqdtVar);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
