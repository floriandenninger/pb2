package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpe extends dha {
    Integer A;
    afpz B;
    avgf C;
    Integer D;

    @dnt(a = 14)
    private fpd E;

    @dnt(a = 13)
    szn a;

    @dnt(a = 13)
    shf b;

    @dnt(a = 13)
    sww c;

    @dnt(a = 13)
    sxc d;

    @dnt(a = 13)
    Executor e;

    @dnt(a = 13)
    ajjn f;

    @dnt(a = 13)
    ajjz g;

    @dnt(a = 0)
    float v;

    @dnt(a = 13)
    syd w;

    @dnt(a = 13)
    afri x;

    @dnt(a = 13)
    awpi y;
    Integer z;

    public fpe() {
        super("ImageZoom");
        this.E = new fpd();
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 30;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new fpl(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baqlVar.a = new AtomicReference(null);
        this.E.a = (AtomicReference) baqlVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void Q(dhe dheVar, dhi dhiVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        awpi awpiVar = this.y;
        szn sznVar = this.a;
        ajjn ajjnVar = this.f;
        awpf awpfVar = awpiVar.d;
        if (awpfVar == null) {
            awpfVar = awpf.a;
        }
        aong aongVar = (aong) avgg.a.createBuilder();
        for (int i = 0; i < awpfVar.c.size(); i++) {
            awph awphVar = (awph) awpfVar.c.get(i);
            if (awphVar.c == 1) {
                aone createBuilder = avgf.a.createBuilder();
                String str = awphVar.c == 1 ? (String) awphVar.d : "";
                createBuilder.copyOnWrite();
                avgf avgfVar = (avgf) createBuilder.instance;
                str.getClass();
                avgfVar.b = 1 | avgfVar.b;
                avgfVar.c = str;
                int i2 = awphVar.e;
                createBuilder.copyOnWrite();
                avgf avgfVar2 = (avgf) createBuilder.instance;
                avgfVar2.b |= 2;
                avgfVar2.d = i2;
                int i3 = awphVar.f;
                createBuilder.copyOnWrite();
                avgf avgfVar3 = (avgf) createBuilder.instance;
                avgfVar3.b |= 4;
                avgfVar3.e = i3;
                aongVar.cB(createBuilder);
            }
        }
        avgg avggVar = (avgg) aongVar.build();
        baqlVar3.a = Integer.valueOf(dhiVar.H());
        baqlVar4.a = Integer.valueOf(dhiVar.C());
        if (avggVar.c.size() > 0 && dhiVar.H() > 0 && dhiVar.C() > 0) {
            avgf H = ahbw.H(avggVar, dhiVar.H(), dhiVar.C());
            baqlVar.a = H;
            if (sznVar != null) {
                baqlVar2.a = (afpz) ajjnVar.b().a(ajhs.c(Uri.parse(H.c)));
            }
        }
        this.C = (avgf) baqlVar.a;
        this.B = (afpz) baqlVar2.a;
        this.D = (Integer) baqlVar3.a;
        this.A = (Integer) baqlVar4.a;
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        awph awphVar;
        int i3;
        awpf awpfVar = this.y.d;
        if (awpfVar == null) {
            awpfVar = awpf.a;
        }
        float f = 1.0f;
        if (awpfVar.c.size() != 0 && (i3 = (awphVar = (awph) awpfVar.c.get(0)).f) != 0) {
            f = awphVar.e / i3;
        }
        esv.X(i, i2, f, dloVar);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        fpl fplVar = (fpl) obj;
        awpi awpiVar = this.y;
        ajjz ajjzVar = this.g;
        sww swwVar = this.c;
        sxc sxcVar = this.d;
        szn sznVar = this.a;
        afri afriVar = this.x;
        avgf avgfVar = this.C;
        this.D.intValue();
        this.A.intValue();
        afpz afpzVar = this.B;
        int intValue = this.z.intValue();
        syd sydVar = this.w;
        ajjn ajjnVar = this.f;
        shf shfVar = this.b;
        AtomicReference atomicReference = this.E.a;
        awpf awpfVar = awpiVar.d;
        if (awpfVar == null) {
            awpfVar = awpf.a;
        }
        Context context = dheVar.b;
        fplVar.a = intValue;
        fplVar.b = awpfVar.e;
        fplVar.i = swwVar;
        fplVar.h = sxcVar;
        if ((awpiVar.c & 2) != 0) {
            awnw awnwVar = awpiVar.e;
            if (awnwVar == null) {
                awnwVar = awnw.a;
            }
            fplVar.j = awnwVar;
        }
        if ((awpiVar.c & 4) != 0) {
            awnw awnwVar2 = awpiVar.f;
            if (awnwVar2 == null) {
                awnwVar2 = awnw.a;
            }
            fplVar.k = awnwVar2;
        }
        fplVar.n = awpiVar.h;
        int v = awxr.v(awpiVar.i);
        if (v == 0) {
            v = 1;
        }
        fplVar.s = v;
        int w = awxr.w(awpiVar.j);
        if (w == 0) {
            w = 1;
        }
        fplVar.t = w;
        if (avgfVar == null) {
            int y = awxr.y(awpfVar.d);
            if (y == 0) {
                y = 1;
            }
            fplVar.r = y;
            int b = swc.b(context, awpfVar);
            if (b > 0) {
                fplVar.setImageDrawable(fk.f(context.getResources(), b, null));
                fplVar.b();
                return;
            }
            ammv t = sgf.t(awpfVar);
            if (t.h()) {
                fplVar.setImageDrawable(sgf.s(context, (byte[]) t.c()));
                fplVar.b();
                return;
            }
            return;
        }
        Uri aj = wbs.aj(avgfVar.c);
        ajju a = ajjv.a();
        a.d = ajkb.a();
        a.c(false);
        if (sznVar == null) {
            a.c = new fpg(awpiVar, context, swwVar, awpfVar);
            ajjzVar.i(fplVar, aj, a.a());
            return;
        }
        int y2 = awxr.y(awpfVar.d);
        if (y2 == 0) {
            y2 = 1;
        }
        awpf awpfVar2 = awpfVar;
        ajhs ajhsVar = new ajhs(null, context, fplVar, sznVar, afriVar, ajjnVar, shfVar, new fph(fplVar, sydVar, y2), sydVar);
        atomicReference.set(ajhsVar);
        if ((awpiVar.c & 8) != 0) {
            awpf awpfVar3 = awpiVar.g;
            if (awpfVar3 == null) {
                awpfVar3 = awpf.a;
            }
            int y3 = awxr.y(awpfVar3.d);
            if (y3 == 0) {
                y3 = 1;
            }
            fplVar.r = y3;
            ahbn.l(awpfVar3, fplVar, context, swwVar);
        }
        fplVar.o = afriVar;
        fplVar.p = sznVar;
        if (afpzVar != null) {
            int y4 = awxr.y(awpfVar2.d);
            if (y4 == 0) {
                y4 = 1;
            }
            fplVar.r = y4;
            ajhsVar.d((Bitmap) afpzVar.a);
            fplVar.b();
            return;
        }
        ajjzVar.m(aj, ajhsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        awpe awpeVar;
        baql baqlVar = new baql();
        awpi awpiVar = this.y;
        baqlVar.a = 0;
        awpf awpfVar = awpiVar.d;
        if (awpfVar == null) {
            awpfVar = awpf.a;
        }
        if (awpfVar.c.size() > 0 && ((awph) awpfVar.c.get(0)).c == 3) {
            awph awphVar = (awph) awpfVar.c.get(0);
            if (awphVar.c == 3) {
                awpeVar = (awpe) awphVar.d;
            } else {
                awpeVar = awpe.a;
            }
            baqlVar.a = Integer.valueOf(awpeVar.d);
        }
        this.z = (Integer) baqlVar.a;
        float f = this.v;
        if (f > 0.0f) {
            B(new szq(f), dheVar.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        fpl fplVar = (fpl) obj;
        ajjz ajjzVar = this.g;
        szn sznVar = this.a;
        AtomicReference atomicReference = this.E.a;
        ajjzVar.e(fplVar);
        ajhs ajhsVar = (ajhs) atomicReference.getAndSet(null);
        if (ajhsVar != null) {
            ajhsVar.e();
        }
        if (sznVar != null) {
            sznVar.d();
            sznVar.a();
        }
        fplVar.setImageDrawable(null);
        fplVar.i = null;
        fplVar.j = null;
        fplVar.k = null;
        fplVar.a = 0;
        fplVar.b = false;
        fplVar.q = null;
        fplVar.o = null;
        fplVar.p = null;
        fplVar.m = false;
        fplVar.n = false;
        fplVar.s = 1;
        fplVar.t = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        ((fpd) dlqVar2).a = ((fpd) dlqVar).a;
    }

    @Override // defpackage.dhk
    public final boolean Y() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean af() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        fpe fpeVar = (fpe) dhaVar2;
        dim dimVar = new dim(((fpe) dhaVar).y, fpeVar == null ? null : fpeVar.y);
        return !((awpi) dimVar.a).equals(dimVar.b);
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dhk
    public final void al() {
        fav.k(this.g, this.C, this.D.intValue(), this.A.intValue(), this.w, this.d, this.e);
    }

    @Override // defpackage.dhk
    public final void am() {
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        fpe fpeVar = (fpe) dhaVar;
        if (this.k == fpeVar.k) {
            return true;
        }
        szn sznVar = this.a;
        if (sznVar == null ? fpeVar.a != null : !sznVar.equals(fpeVar.a)) {
            return false;
        }
        shf shfVar = this.b;
        if (shfVar == null ? fpeVar.b != null : !shfVar.equals(fpeVar.b)) {
            return false;
        }
        sww swwVar = this.c;
        if (swwVar == null ? fpeVar.c != null : !swwVar.equals(fpeVar.c)) {
            return false;
        }
        sxc sxcVar = this.d;
        if (sxcVar == null ? fpeVar.d != null : !sxcVar.equals(fpeVar.d)) {
            return false;
        }
        Executor executor = this.e;
        if (executor == null ? fpeVar.e != null : !executor.equals(fpeVar.e)) {
            return false;
        }
        ajjn ajjnVar = this.f;
        if (ajjnVar == null ? fpeVar.f != null : !ajjnVar.equals(fpeVar.f)) {
            return false;
        }
        ajjz ajjzVar = this.g;
        if (ajjzVar == null ? fpeVar.g != null : !ajjzVar.equals(fpeVar.g)) {
            return false;
        }
        if (Float.compare(this.v, fpeVar.v) != 0) {
            return false;
        }
        syd sydVar = this.w;
        if (sydVar == null ? fpeVar.w != null : !sydVar.equals(fpeVar.w)) {
            return false;
        }
        afri afriVar = this.x;
        if (afriVar == null ? fpeVar.x != null : !afriVar.equals(fpeVar.x)) {
            return false;
        }
        awpi awpiVar = this.y;
        if (awpiVar == null ? fpeVar.y != null : !awpiVar.equals(fpeVar.y)) {
            return false;
        }
        AtomicReference atomicReference = this.E.a;
        AtomicReference atomicReference2 = fpeVar.E.a;
        return atomicReference == null ? atomicReference2 == null : atomicReference.equals(atomicReference2);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        fpe fpeVar = (fpe) super.j();
        fpeVar.z = null;
        fpeVar.A = null;
        fpeVar.B = null;
        fpeVar.C = null;
        fpeVar.D = null;
        fpeVar.E = new fpd();
        return fpeVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        fpe fpeVar = (fpe) dhaVar;
        this.z = fpeVar.z;
        this.A = fpeVar.A;
        this.B = fpeVar.B;
        this.C = fpeVar.C;
        this.D = fpeVar.D;
    }
}
