package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swg extends dha {
    public static final /* synthetic */ int C = 0;

    @dnt(a = 13)
    aoam A;

    @dnt(a = 13)
    aoam B;

    @dnt(a = 13)
    Boolean a;

    @dnt(a = 13)
    szn b;

    @dnt(a = 13)
    sxc c;

    @dnt(a = 0)
    float d;

    @dnt(a = 13)
    syj e;

    @dnt(a = 3)
    int f;

    @dnt(a = 13)
    syd g;

    @dnt(a = 3)
    boolean v;
    con w;
    dlo x;

    @dnt(a = 13)
    ajzi y;

    @dnt(a = 13)
    aoam z;

    public swg() {
        super("GlideImage");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 30;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return swm.a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void Q(dhe dheVar, dhi dhiVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        swm.g(dheVar, dhiVar, this.B, this.f, this.z, this.A, baqlVar, baqlVar2);
        this.w = (con) baqlVar.a;
        this.x = (dlo) baqlVar2.a;
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        float aJ;
        aoam aoamVar = this.B;
        int i3 = swm.a;
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
        swm.e(dheVar, (ImageView) obj, this.B, this.z, this.A, this.y, this.a, this.c, this.b, this.w, this.x, this.g, this.e, this.v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        int i = swm.a;
        swm.b(dheVar, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        swm.f(dheVar, (ImageView) obj, this.a, this.b);
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
    public final boolean af() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        swg swgVar = (swg) dhaVar;
        swg swgVar2 = (swg) dhaVar2;
        return swm.c(new dim(swgVar.B, swgVar2 == null ? null : swgVar2.B), new dim(swgVar.z, swgVar2 == null ? null : swgVar2.z), new dim(swgVar.A, swgVar2 != null ? swgVar2.A : null));
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dhk
    public final void al() {
        swm.d(this.w, this.x, this.B);
    }

    @Override // defpackage.dhk
    public final void am() {
        int i = swm.a;
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
        swg swgVar = (swg) dhaVar;
        if (this.k == swgVar.k) {
            return true;
        }
        Boolean bool = this.a;
        if (bool == null ? swgVar.a != null : !bool.equals(swgVar.a)) {
            return false;
        }
        szn sznVar = this.b;
        if (sznVar == null ? swgVar.b != null : !sznVar.equals(swgVar.b)) {
            return false;
        }
        sxc sxcVar = this.c;
        if (sxcVar == null ? swgVar.c != null : !sxcVar.equals(swgVar.c)) {
            return false;
        }
        aoam aoamVar = this.z;
        if (aoamVar == null ? swgVar.z != null : !aoamVar.equals(swgVar.z)) {
            return false;
        }
        aoam aoamVar2 = this.A;
        if (aoamVar2 == null ? swgVar.A != null : !aoamVar2.equals(swgVar.A)) {
            return false;
        }
        aoam aoamVar3 = this.B;
        if (aoamVar3 == null ? swgVar.B != null : !aoamVar3.equals(swgVar.B)) {
            return false;
        }
        ajzi ajziVar = this.y;
        if (ajziVar == null ? swgVar.y != null : !ajziVar.equals(swgVar.y)) {
            return false;
        }
        if (Float.compare(this.d, swgVar.d) != 0) {
            return false;
        }
        syj syjVar = this.e;
        if (syjVar == null ? swgVar.e != null : !syjVar.equals(swgVar.e)) {
            return false;
        }
        if (this.f != swgVar.f) {
            return false;
        }
        syd sydVar = this.g;
        if (sydVar == null ? swgVar.g == null : sydVar.equals(swgVar.g)) {
            return this.v == swgVar.v;
        }
        return false;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        swg swgVar = (swg) super.j();
        swgVar.w = null;
        swgVar.x = null;
        return swgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        swg swgVar = (swg) dhaVar;
        this.w = swgVar.w;
        this.x = swgVar.x;
    }
}
