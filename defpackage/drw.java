package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class drw extends dha {
    public static final /* synthetic */ int P = 0;

    @dnt(a = 3)
    public int A;

    @dnt(a = 3)
    public boolean B;

    @dnt(a = 13)
    public dsz C;

    @dnt(a = 3)
    public int D;

    @dnt(a = 11)
    public diy E;

    @dnt(a = 13)
    public Integer F;

    @dnt(a = 3)
    public int G;

    @dnt(a = 3)
    public int H;

    @dnt(a = 3)
    public int I;

    /* renamed from: J, reason: collision with root package name */
    @dnt(a = 3)
    public int f186J;

    @dnt(a = 3)
    public boolean K;
    bvi L;

    @dnt(a = 13)
    public ajzj M;

    @dnt(a = 13)
    public wg N;

    @dnt(a = 13)
    public ll O;

    @dnt(a = 14)
    private drv Q;

    @dnt(a = 13)
    public dqr a;

    @dnt(a = 3)
    public int b;

    @dnt(a = 3)
    boolean c;

    @dnt(a = 3)
    public boolean d;

    @dnt(a = 13)
    CharSequence e;

    @dnt(a = 3)
    public int f;

    @dnt(a = 3)
    public boolean g;

    @dnt(a = 13)
    public vz v;

    @dnt(a = 3)
    public int w;

    @dnt(a = 3)
    public boolean x;

    @dnt(a = 13)
    public wh y;

    @dnt(a = 5)
    public List z;

    public drw() {
        super("Recycler");
        this.b = 0;
        this.c = true;
        this.d = true;
        this.v = dtd.a;
        this.w = 0;
        this.x = true;
        this.z = Collections.emptyList();
        this.A = 0;
        this.B = true;
        this.D = -1;
        this.G = -16777216;
        this.H = 0;
        this.I = 0;
        this.f186J = 0;
        this.Q = new drv();
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk, defpackage.dix
    public final Object K(diy diyVar, Object obj) {
        int i = diyVar.b;
        if (i == -1048037474) {
            N((dhe) diyVar.c[0], (diw) obj);
            return null;
        }
        if (i != 946341036) {
            return null;
        }
        dtd.b((dhe) diyVar.c[0], ((drw) diyVar.a).Q.a);
        return null;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return dtd.a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        dtd.l(baqlVar);
        this.Q.a = ((Integer) baqlVar.a).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void P(dhe dheVar, Object obj) {
        dtd.d((dti) obj, this.a, this.C, this.z, this.N, this.B, this.M, this.y, this.L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void Q(dhe dheVar, dhi dhiVar) {
        dtd.e(dhiVar, this.a);
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        dtd.f(dheVar, i, i2, dloVar, this.a);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        dtd.j((dti) obj, this.a, this.d, this.w, this.H, this.f186J, this.b, this.G, this.c, this.x, this.f, this.D, this.A, this.e, this.v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        baql baqlVar = new baql();
        dtd.m(this.E, baqlVar);
        this.L = (bvi) baqlVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        dtd.h((dti) obj, this.a, this.N);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        ((drv) dlqVar2).a = ((drv) dlqVar).a;
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

    @Override // defpackage.dhk
    public final boolean ab() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        dim dimVar;
        Boolean bool;
        dim dimVar2;
        Integer valueOf;
        dim dimVar3;
        vz vzVar;
        drw drwVar = (drw) dhaVar;
        drw drwVar2 = (drw) dhaVar2;
        dim dimVar4 = new dim(drwVar.a, drwVar2 == null ? null : drwVar2.a);
        dim dimVar5 = new dim(true, drwVar2 == null ? null : true);
        dim dimVar6 = new dim(Boolean.valueOf(drwVar.d), drwVar2 == null ? null : Boolean.valueOf(drwVar2.d));
        dim dimVar7 = new dim(Integer.valueOf(drwVar.w), drwVar2 == null ? null : Integer.valueOf(drwVar2.w));
        dim dimVar8 = new dim(Integer.valueOf(drwVar.H), drwVar2 == null ? null : Integer.valueOf(drwVar2.H));
        dim dimVar9 = new dim(Integer.valueOf(drwVar.f186J), drwVar2 == null ? null : Integer.valueOf(drwVar2.f186J));
        dim dimVar10 = new dim(Integer.valueOf(drwVar.b), drwVar2 == null ? null : Integer.valueOf(drwVar2.b));
        dim dimVar11 = new dim(null, null);
        dim dimVar12 = new dim(Integer.valueOf(drwVar.G), drwVar2 == null ? null : Integer.valueOf(drwVar2.G));
        dim dimVar13 = new dim(Boolean.valueOf(drwVar.c), drwVar2 == null ? null : Boolean.valueOf(drwVar2.c));
        dim dimVar14 = new dim(0, drwVar2 == null ? null : 0);
        dim dimVar15 = new dim(null, null);
        if (drwVar2 == null) {
            dimVar = dimVar15;
            bool = null;
        } else {
            dimVar = dimVar15;
            bool = false;
        }
        dim dimVar16 = new dim(false, bool);
        dim dimVar17 = new dim(false, bool);
        Integer valueOf2 = Integer.valueOf(drwVar.f);
        if (drwVar2 == null) {
            dimVar2 = dimVar17;
            valueOf = null;
        } else {
            dimVar2 = dimVar17;
            valueOf = Integer.valueOf(drwVar2.f);
        }
        dim dimVar18 = new dim(valueOf2, valueOf);
        vz vzVar2 = drwVar.v;
        if (drwVar2 == null) {
            dimVar3 = dimVar18;
            vzVar = null;
        } else {
            dimVar3 = dimVar18;
            vzVar = drwVar2.v;
        }
        return dtd.c(dimVar4, dimVar5, dimVar6, dimVar7, dimVar8, dimVar9, dimVar10, dimVar11, dimVar12, dimVar13, dimVar14, dimVar, dimVar16, dimVar2, dimVar3, new dim(vzVar2, vzVar), new dim(Integer.valueOf(drwVar.Q.a), drwVar2 == null ? null : Integer.valueOf(drwVar2.Q.a)));
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dhk
    public final void an() {
        dtd.i(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void ar(Object obj) {
        dtd.g((dti) obj, this.a, this.C, this.y, this.z);
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
        drw drwVar = (drw) dhaVar;
        if (this.k == drwVar.k) {
            return true;
        }
        dqr dqrVar = this.a;
        if (dqrVar == null ? drwVar.a != null : !dqrVar.equals(drwVar.a)) {
            return false;
        }
        if (this.b != drwVar.b || this.c != drwVar.c || this.d != drwVar.d) {
            return false;
        }
        CharSequence charSequence = this.e;
        if (charSequence == null ? drwVar.e != null : !charSequence.equals(drwVar.e)) {
            return false;
        }
        if (this.f != drwVar.f) {
            return false;
        }
        vz vzVar = this.v;
        if (vzVar == null ? drwVar.v != null : !vzVar.equals(drwVar.v)) {
            return false;
        }
        if (this.w != drwVar.w || this.x != drwVar.x) {
            return false;
        }
        wh whVar = this.y;
        if (whVar == null ? drwVar.y != null : !whVar.equals(drwVar.y)) {
            return false;
        }
        List list = this.z;
        if (list == null ? drwVar.z != null : !list.equals(drwVar.z)) {
            return false;
        }
        if (this.A != drwVar.A || this.B != drwVar.B) {
            return false;
        }
        dsz dszVar = this.C;
        if (dszVar == null ? drwVar.C != null : !dszVar.equals(drwVar.C)) {
            return false;
        }
        if (this.D != drwVar.D) {
            return false;
        }
        diy diyVar = this.E;
        if (diyVar == null ? drwVar.E != null : !diyVar.b(drwVar.E)) {
            return false;
        }
        if (this.G != drwVar.G || this.H != drwVar.H) {
            return false;
        }
        wg wgVar = this.N;
        if (wgVar == null ? drwVar.N != null : !wgVar.equals(drwVar.N)) {
            return false;
        }
        if (this.f186J != drwVar.f186J) {
            return false;
        }
        ajzj ajzjVar = this.M;
        if (ajzjVar == null ? drwVar.M == null : ajzjVar.equals(drwVar.M)) {
            return this.Q.a == drwVar.Q.a;
        }
        return false;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        drw drwVar = (drw) super.j();
        drwVar.L = null;
        drwVar.Q = new drv();
        return drwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        this.L = ((drw) dhaVar).L;
    }
}
