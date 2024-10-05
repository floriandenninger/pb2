package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjq extends jhl {
    private final boolean a;

    public jjq(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        this.a = (asvuVar == null ? asvu.a : asvuVar).P;
    }

    private final atri h(agnv agnvVar) {
        if (agnvVar.i() != agnq.PLAYABLE || !this.a) {
            return null;
        }
        String m = agnvVar.m();
        avxt avxtVar = avxt.DOWNLOAD_STATE_COMPLETE;
        String r = fhe.r(m);
        r.getClass();
        amkq.O(!r.isEmpty(), "key cannot be empty");
        aone createBuilder = atrl.a.createBuilder();
        createBuilder.copyOnWrite();
        atrl atrlVar = (atrl) createBuilder.instance;
        atrlVar.c |= 1;
        atrlVar.d = r;
        atri atriVar = new atri(createBuilder);
        aone aoneVar = atriVar.a;
        aoneVar.copyOnWrite();
        atrl atrlVar2 = (atrl) aoneVar.instance;
        atrlVar2.e = avxtVar.j;
        atrlVar2.c |= 2;
        return atriVar;
    }

    @Override // defpackage.jhl
    protected final amsx a(agsw agswVar) {
        amsv i = amsx.i();
        if (this.a) {
            Iterator it = agswVar.j().iterator();
            while (it.hasNext()) {
                atri h = h((agnv) it.next());
                if (h != null) {
                    i.c(h);
                }
            }
        }
        return i.g();
    }

    @Override // defpackage.jhl
    protected final void d(aalc aalcVar, agnv agnvVar) {
        atri h;
        if (!this.a || (h = h(agnvVar)) == null) {
            return;
        }
        aalcVar.k(h);
    }

    @Override // defpackage.jhl
    protected final void e(aalc aalcVar, String str) {
        if (this.a) {
            aalcVar.g(fhe.r(str));
        }
    }
}
