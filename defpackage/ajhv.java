package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajhv extends dha {

    @dnt(a = 13)
    afri A;

    @dnt(a = 3)
    int B;
    Integer C;
    Integer D;
    afpz E;
    avgf F;
    Integer G;

    @dnt(a = 13)
    aoam H;

    @dnt(a = 13)
    aoam I;

    /* renamed from: J, reason: collision with root package name */
    @dnt(a = 13)
    aoam f61J;

    @dnt(a = 14)
    private ajhu K;

    @dnt(a = 13)
    Boolean a;

    @dnt(a = 13)
    szn b;

    @dnt(a = 13)
    shf c;

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
    syj w;

    @dnt(a = 3)
    int x;

    @dnt(a = 13)
    syd y;

    @dnt(a = 3)
    boolean z;

    public ajhv() {
        super("YouTubeImage");
        this.K = new ajhu();
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 30;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new ajib(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baqlVar.a = new AtomicReference(null);
        this.K.a = (AtomicReference) baqlVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void Q(dhe dheVar, dhi dhiVar) {
        avgf G;
        double d;
        double d2;
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        aoam aoamVar = this.f61J;
        int i = this.B;
        szn sznVar = this.b;
        ajjn ajjnVar = this.f;
        aong aongVar = (aong) avgg.a.createBuilder();
        for (int i2 = 0; i2 < aoamVar.aa(); i2++) {
            axov ab = aoamVar.ab(i2);
            String m = ab.m();
            if (m != null) {
                aone createBuilder = avgf.a.createBuilder();
                createBuilder.copyOnWrite();
                avgf avgfVar = (avgf) createBuilder.instance;
                avgfVar.b |= 1;
                avgfVar.c = m;
                long aJ = ab.aJ();
                createBuilder.copyOnWrite();
                avgf avgfVar2 = (avgf) createBuilder.instance;
                avgfVar2.b |= 2;
                avgfVar2.d = (int) aJ;
                long aI = ab.aI();
                createBuilder.copyOnWrite();
                avgf avgfVar3 = (avgf) createBuilder.instance;
                avgfVar3.b |= 4;
                avgfVar3.e = (int) aI;
                aongVar.cB(createBuilder);
            }
        }
        avgg avggVar = (avgg) aongVar.build();
        baqlVar3.a = Integer.valueOf(dhiVar.H());
        baqlVar4.a = Integer.valueOf(dhiVar.C());
        if (avggVar.c.size() > 0 && dhiVar.H() > 0 && dhiVar.C() > 0) {
            ImageView.ScaleType j = ahbn.j(aoamVar.Y());
            int H = dhiVar.H();
            int C = dhiVar.C();
            if (i == 1) {
                G = ahbw.G(avggVar, H, C);
            } else if (i != 2) {
                if (i != 3) {
                    G = ahbw.H(avggVar, H, C);
                } else {
                    if (j == ImageView.ScaleType.CENTER_CROP && H != 0 && C != 0) {
                        if (H > C) {
                            d = H;
                            d2 = C;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                        } else {
                            d = C;
                            d2 = H;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                        }
                        if (d / d2 > 2.0d) {
                            G = ahbw.G(avggVar, H, C);
                        }
                    }
                    G = ahbw.H(avggVar, H, C);
                }
            } else if (j == ImageView.ScaleType.CENTER_CROP) {
                G = ahbw.G(avggVar, H, C);
            } else {
                G = ahbw.H(avggVar, H, C);
            }
            if (G != null) {
                baqlVar.a = G;
                if (sznVar != null) {
                    baqlVar2.a = (afpz) ajjnVar.b().a(ajhs.c(Uri.parse(G.c)));
                }
            }
        }
        this.F = (avgf) baqlVar.a;
        this.E = (afpz) baqlVar2.a;
        this.G = (Integer) baqlVar3.a;
        this.D = (Integer) baqlVar4.a;
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        float aJ;
        aoam aoamVar = this.f61J;
        if (aoamVar.aa() == 0) {
            aJ = 1.0f;
        } else {
            axov ab = aoamVar.ab(0);
            aJ = ((float) ab.aJ()) / ((float) ab.aI());
        }
        esv.X(i, i2, aJ, dloVar);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        AtomicReference atomicReference;
        avgf avgfVar;
        aoam aoamVar;
        sxc sxcVar;
        boolean z;
        boolean z2;
        final ajib ajibVar = (ajib) obj;
        aoam aoamVar2 = this.f61J;
        aoam aoamVar3 = this.H;
        aoam aoamVar4 = this.I;
        Boolean bool = this.a;
        int i = this.x;
        ajjz ajjzVar = this.g;
        szn sznVar = this.b;
        afri afriVar = this.A;
        shf shfVar = this.c;
        ajjn ajjnVar = this.f;
        sxc sxcVar2 = this.d;
        avgf avgfVar2 = this.F;
        this.G.intValue();
        this.D.intValue();
        afpz afpzVar = this.E;
        this.C.intValue();
        syj syjVar = this.w;
        syd sydVar = this.y;
        boolean z3 = this.z;
        AtomicReference atomicReference2 = this.K.a;
        Context context = dheVar.b;
        if (bool == null || !bool.booleanValue()) {
            atomicReference = atomicReference2;
        } else {
            atomicReference = atomicReference2;
            ajibVar.setTag(R.id.elements_image, szz.h(aoamVar2));
        }
        ajibVar.d = aoamVar2;
        ajibVar.b = syjVar;
        ajibVar.c = sydVar;
        if (aoamVar2.aa() == 0 && aoamVar2.aC() != null) {
            ajibVar.setImageBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8));
            return;
        }
        if (avgfVar2 != null) {
            Uri aj = wbs.aj(avgfVar2.c);
            ajju a = ajjv.a();
            a.d = ajkb.a();
            a.c(false);
            if (sznVar == null) {
                a.c = new ajia(context, aoamVar3, aoamVar4);
                ajjzVar.i(ajibVar, aj, a.a());
                aoamVar = aoamVar2;
                sxcVar = sxcVar2;
                avgfVar = avgfVar2;
                z2 = true;
                z = z3;
            } else {
                avgfVar = avgfVar2;
                sxcVar = sxcVar2;
                z = z3;
                ajhs ajhsVar = new ajhs(aoamVar4, context, ajibVar, sznVar, afriVar, ajjnVar, shfVar, null, sydVar);
                atomicReference.set(ajhsVar);
                if (aoamVar3 != null) {
                    ahbn.m(aoamVar3, ajibVar, context);
                }
                if (afpzVar != null) {
                    ajhsVar.d((Bitmap) afpzVar.a);
                } else {
                    ajjzVar.m(aj, ajhsVar);
                }
                aoamVar = aoamVar2;
                z2 = true;
            }
        } else {
            avgfVar = avgfVar2;
            aoamVar = aoamVar2;
            sxcVar = sxcVar2;
            z = z3;
            int c = swc.c(context, aoamVar);
            if (c > 0) {
                ajibVar.setImageDrawable(fk.f(context.getResources(), c, null));
            } else {
                ammv u = sgf.u(aoamVar);
                if (u.h()) {
                    ajibVar.setImageDrawable(sgf.s(context, (byte[]) u.c()));
                } else {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (avgfVar != null && i == 1) {
            ajibVar.post(new Runnable() { // from class: ajhy
                @Override // java.lang.Runnable
                public final void run() {
                    ajib ajibVar2 = ajib.this;
                    if (ajibVar2.getDrawable() == null) {
                        ajibVar2.a = true;
                    }
                }
            });
        }
        if (!z || z2) {
            return;
        }
        int aa = aoamVar.aa();
        StringBuilder sb = new StringBuilder(207);
        sb.append("Failed to find a valid source for the image. Sources: ");
        sb.append(aa);
        sb.append(". Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data.");
        sydVar.c(23, sb.toString(), sxcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        baql baqlVar = new baql();
        aoam aoamVar = this.f61J;
        baqlVar.a = 0;
        if (aoamVar.aa() > 0 && aoamVar.ab(0).aK() != null) {
            baqlVar.a = Integer.valueOf((int) aoamVar.ab(0).aK().r());
        }
        this.C = (Integer) baqlVar.a;
        float f = this.v;
        if (f > 0.0f) {
            B(new szq(f), dheVar.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        ajib ajibVar = (ajib) obj;
        ajjz ajjzVar = this.g;
        Boolean bool = this.a;
        szn sznVar = this.b;
        AtomicReference atomicReference = this.K.a;
        ajjzVar.e(ajibVar);
        ajhs ajhsVar = (ajhs) atomicReference.getAndSet(null);
        if (ajhsVar != null) {
            ajhsVar.e();
        }
        if (bool != null && bool.booleanValue()) {
            ajibVar.setTag(R.id.elements_image, null);
        }
        if (sznVar != null) {
            sznVar.d();
            sznVar.a();
        }
        ajibVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        ((ajhu) dlqVar2).a = ((ajhu) dlqVar).a;
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
        ajhv ajhvVar = (ajhv) dhaVar;
        ajhv ajhvVar2 = (ajhv) dhaVar2;
        dim dimVar = new dim(ajhvVar.f61J, ajhvVar2 == null ? null : ajhvVar2.f61J);
        dim dimVar2 = new dim(ajhvVar.H, ajhvVar2 == null ? null : ajhvVar2.H);
        dim dimVar3 = new dim(ajhvVar.I, ajhvVar2 != null ? ajhvVar2.I : null);
        return (szz.c((aoam) dimVar.b, (aoam) dimVar.a) && szz.c((aoam) dimVar2.b, (aoam) dimVar2.a) && szz.c((aoam) dimVar3.b, (aoam) dimVar3.a)) ? false : true;
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dhk
    public final void al() {
        ahbn.k(this.g, this.b, this.F, this.G.intValue(), this.D.intValue(), this.y, this.d, this.e);
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
        ajhv ajhvVar = (ajhv) dhaVar;
        if (this.k == ajhvVar.k) {
            return true;
        }
        Boolean bool = this.a;
        if (bool == null ? ajhvVar.a != null : !bool.equals(ajhvVar.a)) {
            return false;
        }
        szn sznVar = this.b;
        if (sznVar == null ? ajhvVar.b != null : !sznVar.equals(ajhvVar.b)) {
            return false;
        }
        shf shfVar = this.c;
        if (shfVar == null ? ajhvVar.c != null : !shfVar.equals(ajhvVar.c)) {
            return false;
        }
        sxc sxcVar = this.d;
        if (sxcVar == null ? ajhvVar.d != null : !sxcVar.equals(ajhvVar.d)) {
            return false;
        }
        aoam aoamVar = this.H;
        if (aoamVar == null ? ajhvVar.H != null : !aoamVar.equals(ajhvVar.H)) {
            return false;
        }
        aoam aoamVar2 = this.I;
        if (aoamVar2 == null ? ajhvVar.I != null : !aoamVar2.equals(ajhvVar.I)) {
            return false;
        }
        Executor executor = this.e;
        if (executor == null ? ajhvVar.e != null : !executor.equals(ajhvVar.e)) {
            return false;
        }
        aoam aoamVar3 = this.f61J;
        if (aoamVar3 == null ? ajhvVar.f61J != null : !aoamVar3.equals(ajhvVar.f61J)) {
            return false;
        }
        ajjn ajjnVar = this.f;
        if (ajjnVar == null ? ajhvVar.f != null : !ajjnVar.equals(ajhvVar.f)) {
            return false;
        }
        ajjz ajjzVar = this.g;
        if (ajjzVar == null ? ajhvVar.g != null : !ajjzVar.equals(ajhvVar.g)) {
            return false;
        }
        if (Float.compare(this.v, ajhvVar.v) != 0) {
            return false;
        }
        syj syjVar = this.w;
        if (syjVar == null ? ajhvVar.w != null : !syjVar.equals(ajhvVar.w)) {
            return false;
        }
        if (this.x != ajhvVar.x) {
            return false;
        }
        syd sydVar = this.y;
        if (sydVar == null ? ajhvVar.y != null : !sydVar.equals(ajhvVar.y)) {
            return false;
        }
        if (this.z != ajhvVar.z) {
            return false;
        }
        afri afriVar = this.A;
        if (afriVar == null ? ajhvVar.A != null : !afriVar.equals(ajhvVar.A)) {
            return false;
        }
        if (this.B != ajhvVar.B) {
            return false;
        }
        AtomicReference atomicReference = this.K.a;
        AtomicReference atomicReference2 = ajhvVar.K.a;
        return atomicReference == null ? atomicReference2 == null : atomicReference.equals(atomicReference2);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        ajhv ajhvVar = (ajhv) super.j();
        ajhvVar.C = null;
        ajhvVar.D = null;
        ajhvVar.E = null;
        ajhvVar.F = null;
        ajhvVar.G = null;
        ajhvVar.K = new ajhu();
        return ajhvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        ajhv ajhvVar = (ajhv) dhaVar;
        this.C = ajhvVar.C;
        this.D = ajhvVar.D;
        this.E = ajhvVar.E;
        this.F = ajhvVar.F;
        this.G = ajhvVar.G;
    }
}
