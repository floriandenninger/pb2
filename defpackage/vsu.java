package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsu implements avm {
    final /* synthetic */ vsw a;

    public vsu(vsw vswVar) {
        this.a = vswVar;
    }

    private final boolean ar() {
        bej bejVar = this.a.e;
        ben benVar = bejVar != null ? bejVar.d : null;
        return benVar != null && benVar.b(1) == 3;
    }

    private final boolean as() {
        bej bejVar = this.a.e;
        ben benVar = bejVar != null ? bejVar.d : null;
        return benVar != null && benVar.b(2) == 3;
    }

    @Override // defpackage.avm
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void C() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void F() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void G() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void I() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void J() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void K() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void M() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void N() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void O() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void Q() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void R() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void S() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void T() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void U() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.avm
    public final void Y(int i) {
        if (i == 4) {
            aq(null);
        }
    }

    @Override // defpackage.avm
    public final /* synthetic */ void Z() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void a(avl avlVar, String str, long j, long j2) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.avm
    public final void ae(asj asjVar) {
        pom pomVar;
        if (asjVar.b <= 0 || (pomVar = this.a.c) == null || pomVar.q() == -9223372036854775807L) {
            return;
        }
        boolean ar = ar();
        boolean as = as();
        StringBuilder sb = new StringBuilder(64);
        sb.append("TransformerSource: Tracks found. HasAudio: ");
        sb.append(ar);
        sb.append(" HasVideo: ");
        sb.append(as);
        vtv.a(sb.toString());
        if (!as()) {
            aq(new IllegalStateException("The source does not contain any supported video tracks"));
            return;
        }
        if (ar()) {
            return;
        }
        vsw vswVar = this.a;
        if (vswVar.n) {
            pom pomVar2 = vswVar.c;
            long q = pomVar2 != null ? pomVar2.q() : 0L;
            vsw vswVar2 = this.a;
            pom pomVar3 = vswVar2.c;
            if (pomVar3 == null || q <= 0) {
                aq(new IllegalStateException("Player not initialized when tracks changed"));
                return;
            }
            pomVar3.f(new bce(vswVar2.j, new bde(TimeUnit.MILLISECONDS.toMicros(q))));
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("TransformerSource: Forcing silent audio track with duration ");
            sb2.append(q);
            vtv.a(sb2.toString());
            return;
        }
        vtf vtfVar = vswVar.o.a;
        try {
            vto vtoVar = ((vtn) vtfVar).e;
            if (vtoVar != null) {
                vtv.b("Mp4Muxer.configureNoAudioAvailable");
                vtoVar.h = true;
                vtoVar.a();
                return;
            }
            throw new IOException("Configured audio with uninitialized muxer");
        } catch (IOException e) {
            ((vtn) vtfVar).c(e);
        }
    }

    @Override // defpackage.avm
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void am(avl avlVar, auk aukVar) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ap(avl avlVar, int i, int i2, float f) {
    }

    public final void aq(Exception exc) {
        try {
            vsw vswVar = this.a;
            pom pomVar = vswVar.c;
            if (pomVar != null) {
                pomVar.A(vswVar.a());
                vswVar.c.w();
                vswVar.c = null;
            }
            vswVar.f = 4;
        } catch (IllegalStateException unused) {
        }
        vsw vswVar2 = this.a;
        if (vswVar2.h) {
            return;
        }
        vswVar2.h = true;
        if (exc == null) {
            synchronized (vswVar2.b) {
                vsw vswVar3 = this.a;
                vyv vyvVar = vswVar3.p;
                long j = vswVar3.g;
                StringBuilder sb = new StringBuilder(52);
                sb.append("onSourceCompleted. Last frame @ ");
                sb.append(j);
                vtv.a(sb.toString());
                vtf vtfVar = vyvVar.a;
                if (vtfVar != null) {
                    ((vtn) vtfVar).c(null);
                } else {
                    vyvVar.d.a(new IllegalStateException("Transcode completed with uninitialized Listener"));
                }
            }
            return;
        }
        vyv vyvVar2 = vswVar2.p;
        String valueOf = String.valueOf(exc);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb2.append("onSourceError: ");
        sb2.append(valueOf);
        vtv.e(sb2.toString());
        vtf vtfVar2 = vyvVar2.a;
        if (vtfVar2 != null) {
            ((vtn) vtfVar2).c(exc);
        } else {
            vyvVar2.d.a(new IllegalStateException("Transcode source error with uninitialized Listener", exc));
        }
    }

    @Override // defpackage.avm
    public final /* synthetic */ void b(avl avlVar, long j) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void c(avl avlVar, int i, long j, long j2) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void d(avl avlVar, int i, auj aujVar) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void e(avl avlVar, int i, auj aujVar) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void f(avl avlVar, int i, pms pmsVar) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void g(avl avlVar, bbn bbnVar) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void h(avl avlVar, Exception exc) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void i(avl avlVar, int i, long j) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void j(avl avlVar, bbi bbiVar, bbn bbnVar, IOException iOException, boolean z) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void k(avl avlVar, boolean z) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void l(avl avlVar, pnu pnuVar) {
    }

    @Override // defpackage.avm
    public final void m(avl avlVar, pns pnsVar) {
        aq(pnsVar);
    }

    @Override // defpackage.avm
    public final /* synthetic */ void n(avl avlVar, boolean z, int i) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void o(avl avlVar, pnz pnzVar, pnz pnzVar2, int i) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void p(avl avlVar, Object obj, long j) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void q(avl avlVar) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void r(avl avlVar) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void s(avl avlVar, boolean z) {
    }

    @Override // defpackage.avm
    public final void t(avl avlVar, int i) {
        if (this.a.f != 0) {
            return;
        }
        pot potVar = new pot();
        avlVar.b.y(0, potVar);
        if (potVar.l) {
            return;
        }
        long j = potVar.n;
        vsw vswVar = this.a;
        int i2 = 2;
        if (j > 0 && j != -9223372036854775807L) {
            i2 = 1;
        }
        vswVar.f = i2;
        pom pomVar = vswVar.c;
        if (pomVar != null) {
            pomVar.T();
        } else {
            vtv.b("TransformerSource: player null in onTimelineChanged");
            aq(new IllegalStateException("TransformerSource not initialized when timeline changed"));
        }
        StringBuilder sb = new StringBuilder(71);
        sb.append("TransformerSource: Begin decoding. Total duration: ");
        sb.append(j);
        vtv.a(sb.toString());
    }

    @Override // defpackage.avm
    public final /* synthetic */ void u(avl avlVar, Exception exc) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void v(avl avlVar, String str, long j, long j2) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void z() {
    }
}
