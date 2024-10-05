package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abzc implements afwx {
    final /* synthetic */ abxx a;
    final /* synthetic */ abzl b;

    public abzc(abzl abzlVar, abxx abxxVar) {
        this.b = abzlVar;
        this.a = abxxVar;
    }

    private final void d(final int i, final String str) {
        Handler handler = this.b.b;
        final abxx abxxVar = this.a;
        handler.post(new Runnable() { // from class: abza
            @Override // java.lang.Runnable
            public final void run() {
                abxx.this.b(i, str);
            }
        });
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        String valueOf = String.valueOf(abzl.n(cnqVar));
        zga.b(valueOf.length() != 0 ? "Error stopping broadcast: ".concat(valueOf) : new String("Error stopping broadcast: "));
        abvt.b().n(9, 1, cnqVar);
        d(1, null);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        final atfw atfwVar;
        String str;
        final asbk asbkVar = (asbk) obj;
        if (asbkVar != null) {
            this.b.a.D(new acqx(asbkVar.f));
        }
        if (asbkVar != null && asbkVar.d.size() != 0) {
            for (int i = 0; i < asbkVar.d.size(); i++) {
                asss asssVar = ((asbi) asbkVar.d.get(i)).b;
                if (asssVar == null) {
                    asssVar = asss.a;
                }
                int df = amkq.df(asssVar.d);
                if (df != 0 && df == 7) {
                    int i2 = asssVar.b;
                    if (i2 == 5) {
                        str = ajcq.b((aqyg) asssVar.c).toString();
                    } else {
                        if (i2 == 6) {
                        }
                        str = null;
                    }
                    abvt b = abvt.b();
                    int df2 = amkq.df(asssVar.d);
                    if (df2 == 0) {
                        df2 = 1;
                    }
                    b.n(9, abzl.o(df2), null);
                    int df3 = amkq.df(asssVar.d);
                    d(abzl.p(df3 != 0 ? df3 : 1), str);
                    return;
                }
            }
        }
        if (asbkVar != null) {
            asbh asbhVar = asbkVar.c;
            if (asbhVar == null) {
                asbhVar = asbh.a;
            }
            if (asbhVar.b == 122079382) {
                abvt.b().m(11);
                asbh asbhVar2 = asbkVar.c;
                if (asbhVar2 == null) {
                    asbhVar2 = asbh.a;
                }
                if (asbhVar2.b == 122079382) {
                    atfwVar = (atfw) asbhVar2.c;
                } else {
                    atfwVar = atfw.a;
                }
                Handler handler = this.b.b;
                final abxx abxxVar = this.a;
                handler.post(new Runnable() { // from class: abzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        abxx.this.a(atfwVar, asbkVar.e);
                    }
                });
                return;
            }
        }
        zga.b("Stop broadcast: missing response");
        abvt.b().n(9, 1, null);
        d(1, null);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
