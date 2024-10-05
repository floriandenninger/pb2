package defpackage;

import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dii extends duq implements Cloneable, djr {
    private ArrayList A;
    private String B;
    private Set C;
    private List D;
    private boolean E;
    private int F;
    private float G;
    private float H;
    private float I;

    /* renamed from: J, reason: collision with root package name */
    private float f182J;
    private float K;
    private float L;
    private long M;
    private int N;
    private dik O;
    public dhe a;
    public List b;
    public din c;
    public boolean d;
    public int e;
    public int f;
    public float g;
    public float h;
    private dut i;
    private final int[] j;
    private final float[] k;
    private djq l;
    private diy m;
    private diy n;
    private diy o;
    private diy p;
    private diy q;
    private diy r;
    private diy s;
    private Drawable t;
    private boolean[] u;
    private diu v;
    private String w;
    private String x;
    private ArrayList y;
    private ArrayList z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dii(dhe dheVar) {
        super(null);
        dlc dlcVar = dld.a;
        duu duuVar = new duu(dld.c);
        this.b = new ArrayList(1);
        this.j = new int[4];
        this.k = new float[4];
        this.F = 0;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.f182J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.e = -1;
        this.f = -1;
        this.g = -1.0f;
        this.h = -1.0f;
        this.a = dheVar;
        duuVar.b = this;
        this.i = duuVar;
        this.C = new HashSet();
    }

    private final float bO(diu diuVar, YogaEdge yogaEdge) {
        YogaEdge yogaEdge2;
        YogaDirection i = this.i.i();
        YogaDirection yogaDirection = YogaDirection.RTL;
        YogaEdge yogaEdge3 = YogaEdge.LEFT;
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            if (i == yogaDirection) {
                yogaEdge2 = YogaEdge.END;
            }
            yogaEdge2 = YogaEdge.START;
        } else if (ordinal == 2) {
            if (i != yogaDirection) {
                yogaEdge2 = YogaEdge.END;
            }
            yogaEdge2 = YogaEdge.START;
        } else {
            String valueOf = String.valueOf(yogaEdge);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Not an horizontal padding edge: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        float c = diuVar.c(yogaEdge2);
        return esv.T(c) ? diuVar.a(yogaEdge) : c;
    }

    private final diu bP() {
        djq ah = ah();
        if (ah.d == null) {
            ah.d = new diu();
        }
        return ah.d;
    }

    private static diy bQ(diy diyVar, diy diyVar2) {
        return diyVar == null ? diyVar2 : diyVar2 == null ? diyVar : new dil(diyVar, diyVar2);
    }

    private static djr bR(dhe dheVar, dii diiVar, dha dhaVar, Set set) {
        dhe dheVar2 = dhaVar.q;
        List list = diiVar.b;
        dha V = diiVar.V();
        if (dheVar2 != null && V != null && !diiVar.aW()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (set.contains(((dha) it.next()).m)) {
                }
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).startsWith(V.m)) {
                    return bS(diiVar, dhaVar, set, 1);
                }
            }
            boolean z = doa.a;
            return bS(diiVar, dhaVar, set, 0);
        }
        return djt.d(dheVar, dhaVar, false, true);
    }

    private static djr bS(dii diiVar, dha dhaVar, Set set, int i) {
        djr bR;
        dut dutVar = diiVar.i;
        dut k = dutVar.k();
        dii clone = diiVar.clone();
        clone.b = new ArrayList();
        clone.c = null;
        clone.C = null;
        clone.G = Float.NaN;
        clone.H = Float.NaN;
        clone.I = Float.NaN;
        clone.f182J = Float.NaN;
        clone.K = Float.NaN;
        clone.L = Float.NaN;
        int size = diiVar.b.size();
        ArrayList<dha> arrayList = new ArrayList(size);
        arrayList.add(dhaVar);
        dhe dheVar = dhaVar.q;
        for (int i2 = size - 2; i2 >= 0; i2--) {
            dha k2 = ((dha) diiVar.b.get(i2)).k(dheVar);
            arrayList.add(k2);
            dheVar = k2.q;
        }
        Collections.reverse(arrayList);
        dhe dheVar2 = dhaVar.q;
        clone.a = dheVar2;
        clone.i = k;
        k.y(clone);
        clone.b = arrayList;
        clone.c = null;
        clone.z = null;
        for (dha dhaVar2 : arrayList) {
        }
        ArrayList arrayList2 = clone.A;
        clone.A = null;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            clone.A = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                dnb dnbVar = (dnb) arrayList2.get(i3);
                dha k3 = dnbVar.b.k(dheVar2);
                ArrayList arrayList3 = clone.A;
                String str = dnbVar.a;
                arrayList3.add(new dnb(dnbVar.c, k3));
            }
        }
        dhe dheVar3 = clone.W().q;
        if (clone.aj() != null) {
            clone.ah().b = null;
        }
        int h = dutVar.h();
        for (int i4 = 0; i4 < h; i4++) {
            dii diiVar2 = (dii) dutVar.l(i4).p();
            dha k4 = ((dha) diiVar2.b.get(Math.max(0, r5.size() - 1))).k(dheVar3);
            if (i == 0) {
                bR = bS(diiVar2, k4, set, 0);
            } else {
                bR = bR(dheVar3, diiVar2, k4, set);
            }
            clone.bj(bR);
        }
        return clone;
    }

    private final void bT(djr djrVar) {
        if (!doa.a || djrVar == null) {
            return;
        }
        dic.n(this.a, djrVar);
        int c = djrVar.c();
        for (int i = 0; i < c; i++) {
            bT(djrVar.g(i));
        }
        if (djrVar.aM()) {
            bT(djrVar.aj());
        }
    }

    private final void bU(YogaEdge yogaEdge, boolean z) {
        if (this.u == null && z) {
            this.u = new boolean[YogaEdge.ALL.j + 1];
        }
        boolean[] zArr = this.u;
        if (zArr != null) {
            zArr[yogaEdge.j] = z;
        }
    }

    private final boolean bV() {
        dik dikVar;
        return (this.v == null || (dikVar = this.O) == null || !dikVar.s()) ? false : true;
    }

    @Override // defpackage.djv
    public final void A(int i) {
        this.M |= 4096;
        this.i.Y(i);
    }

    @Override // defpackage.djv
    public final void B() {
        this.M |= 8;
        this.i.ac();
    }

    @Override // defpackage.dun, defpackage.dhi
    public final int C() {
        if (esv.T(this.L)) {
            this.L = this.i.b();
        }
        return (int) this.L;
    }

    @Override // defpackage.dun, defpackage.dhi
    public final int D() {
        return did.n(this.i.d(YogaEdge.BOTTOM));
    }

    @Override // defpackage.dun, defpackage.dhi
    public final int E() {
        return did.n(this.i.d(YogaEdge.LEFT));
    }

    @Override // defpackage.dun, defpackage.dhi
    public final int F() {
        return did.n(this.i.d(YogaEdge.RIGHT));
    }

    @Override // defpackage.dun, defpackage.dhi
    public final int G() {
        return did.n(this.i.d(YogaEdge.TOP));
    }

    @Override // defpackage.dun, defpackage.dhi
    public final int H() {
        if (esv.T(this.K)) {
            this.K = this.i.e();
        }
        return (int) this.K;
    }

    @Override // defpackage.dhi
    public final int I() {
        if (esv.T(this.I)) {
            this.I = this.i.f();
        }
        return (int) this.I;
    }

    @Override // defpackage.dhi
    public final int J() {
        if (esv.T(this.f182J)) {
            this.f182J = this.i.g();
        }
        return (int) this.f182J;
    }

    @Override // defpackage.dhi
    public final Drawable K() {
        return this.t;
    }

    @Override // defpackage.dhi
    public final YogaDirection L() {
        return this.i.i();
    }

    @Override // defpackage.dhi
    public final boolean M() {
        return (this.M & 1024) != 0;
    }

    @Override // defpackage.djr
    public final float N() {
        return this.i.n().a;
    }

    @Override // defpackage.djr
    public final float O() {
        return this.i.o().a;
    }

    @Override // defpackage.djr
    public final int P() {
        return this.F;
    }

    @Override // defpackage.djr
    public final int Q(YogaEdge yogaEdge) {
        return did.n(this.i.a(yogaEdge));
    }

    @Override // defpackage.djr
    public final int R() {
        if (bV()) {
            return did.n(this.v.a(YogaEdge.BOTTOM));
        }
        return 0;
    }

    @Override // defpackage.djr
    public final int S() {
        if (!bV()) {
            return 0;
        }
        if (esv.T(this.G)) {
            this.G = bO(this.v, YogaEdge.LEFT);
        }
        return did.n(this.G);
    }

    @Override // defpackage.djr
    public final int T() {
        if (!bV()) {
            return 0;
        }
        if (esv.T(this.H)) {
            this.H = bO(this.v, YogaEdge.RIGHT);
        }
        return did.n(this.H);
    }

    @Override // defpackage.djr
    public final int U() {
        if (bV()) {
            return did.n(this.v.a(YogaEdge.TOP));
        }
        return 0;
    }

    @Override // defpackage.djr
    public final dha V() {
        if (this.b.isEmpty()) {
            return null;
        }
        return (dha) this.b.get(r0.size() - 1);
    }

    @Override // defpackage.djr
    public final dha W() {
        if (this.b.isEmpty()) {
            return null;
        }
        return (dha) this.b.get(0);
    }

    @Override // defpackage.djr
    public final dhe X() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final dii clone() {
        try {
            return (dii) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.djr
    public final din Z() {
        return this.c;
    }

    @Override // defpackage.djr, defpackage.din
    public final float a() {
        return this.h;
    }

    @Override // defpackage.djr
    public final void aA(dha dhaVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(dhaVar);
    }

    @Override // defpackage.djr
    public final void aB() {
        List J2 = (this.M & 2) != 0 ? did.J(null, "alignSelf") : null;
        if ((this.M & 4) != 0) {
            J2 = did.J(J2, "positionType");
        }
        if ((this.M & 8) != 0) {
            J2 = did.J(J2, "flex");
        }
        if ((this.M & 16) != 0) {
            J2 = did.J(J2, "flexGrow");
        }
        if ((this.M & 512) != 0) {
            J2 = did.J(J2, "margin");
        }
        if (J2 != null) {
            String valueOf = String.valueOf(TextUtils.join(", ", J2));
            String simpleName = W().getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(simpleName).length());
            sb.append("You should not set ");
            sb.append(valueOf);
            sb.append(" to a root layout in ");
            sb.append(simpleName);
            dhz.a(1, "DefaultInternalNode:ContextSpecificStyleSet", sb.toString());
        }
    }

    @Override // defpackage.djr
    public final void aC(diu diuVar, int[] iArr, float[] fArr) {
        this.M |= 268435456;
        this.i.x(YogaEdge.LEFT, diuVar.c(YogaEdge.LEFT));
        this.i.x(YogaEdge.TOP, diuVar.c(YogaEdge.TOP));
        this.i.x(YogaEdge.RIGHT, diuVar.c(YogaEdge.RIGHT));
        this.i.x(YogaEdge.BOTTOM, diuVar.c(YogaEdge.BOTTOM));
        this.i.x(YogaEdge.VERTICAL, diuVar.c(YogaEdge.VERTICAL));
        this.i.x(YogaEdge.HORIZONTAL, diuVar.c(YogaEdge.HORIZONTAL));
        this.i.x(YogaEdge.START, diuVar.c(YogaEdge.START));
        this.i.x(YogaEdge.END, diuVar.c(YogaEdge.END));
        this.i.x(YogaEdge.ALL, diuVar.c(YogaEdge.ALL));
        System.arraycopy(iArr, 0, this.j, 0, 4);
        System.arraycopy(fArr, 0, this.k, 0, 4);
    }

    @Override // defpackage.djr
    public final void aD(float f, float f2) {
        bT(this);
        this.i.r(f, f2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((dha) it.next()).aq();
        }
    }

    @Override // defpackage.djr
    public final void aE() {
        this.i.s();
    }

    @Override // defpackage.djr
    public final void aF(dic dicVar) {
        if (this.C == null) {
            this.C = new HashSet();
        }
        this.C.add(dicVar);
    }

    @Override // defpackage.djr
    public final void aG(din dinVar) {
        if (dinVar instanceof djr) {
            djr djrVar = (djr) dinVar;
            if (djrVar.aW()) {
                this.c = djrVar.aj();
                return;
            }
        }
        this.c = dinVar;
    }

    @Override // defpackage.djr
    public final void aH(YogaMeasureFunction yogaMeasureFunction) {
        this.i.O(yogaMeasureFunction);
    }

    @Override // defpackage.djr
    public final void aI(djr djrVar) {
        if (djrVar != dhe.a) {
            djrVar.ah().c = this;
        }
        ah().b = djrVar;
    }

    @Override // defpackage.djr
    public final void aJ(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            this.i.K(View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            this.i.F(Float.NaN);
        } else {
            if (mode != 1073741824) {
                return;
            }
            this.i.F(View.MeasureSpec.getSize(i));
        }
    }

    @Override // defpackage.djr
    public final void aK(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            this.i.M(View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            this.i.Y(Float.NaN);
        } else {
            if (mode != 1073741824) {
                return;
            }
            this.i.Y(View.MeasureSpec.getSize(i));
        }
    }

    @Override // defpackage.djr
    public final boolean aL() {
        return this.d;
    }

    @Override // defpackage.djr
    public final boolean aM() {
        djq djqVar = this.l;
        return (djqVar == null || djqVar.b == null) ? false : true;
    }

    @Override // defpackage.djr
    public final boolean aN() {
        return this.i.ab();
    }

    @Override // defpackage.djr
    public final boolean aO() {
        return (this.M & 1073741824) != 0;
    }

    @Override // defpackage.djr
    public final boolean aP() {
        return (this.M & 33554432) != 0;
    }

    @Override // defpackage.djr
    public final boolean aQ() {
        return !TextUtils.isEmpty(this.w);
    }

    @Override // defpackage.djr
    public final boolean aR() {
        return (this.m == null && this.n == null && this.o == null && this.p == null && this.q == null && this.r == null && this.s == null) ? false : true;
    }

    @Override // defpackage.djr
    public final boolean aS() {
        return this.E;
    }

    @Override // defpackage.djr
    public final boolean aT() {
        return (this.M & 128) == 0 || this.F == 0;
    }

    @Override // defpackage.djr
    public final boolean aU() {
        return (this.i == null || this.a == null) ? false : true;
    }

    @Override // defpackage.djr
    public final boolean aV() {
        return (this.M & 1) == 0 || L() == YogaDirection.INHERIT;
    }

    @Override // defpackage.djr
    public final boolean aW() {
        djq djqVar = this.l;
        return djqVar != null && djqVar.a;
    }

    @Override // defpackage.djr
    public final boolean aX() {
        int[] iArr = this.j;
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return (this.i.a(YogaEdge.LEFT) == 0.0f && this.i.a(YogaEdge.TOP) == 0.0f && this.i.a(YogaEdge.RIGHT) == 0.0f && this.i.a(YogaEdge.BOTTOM) == 0.0f) ? false : true;
            }
        }
        return false;
    }

    @Override // defpackage.djr
    public final float[] aY() {
        return this.k;
    }

    @Override // defpackage.djr
    public final int[] aZ() {
        return this.j;
    }

    @Override // defpackage.djr
    public final diy aa() {
        return this.o;
    }

    @Override // defpackage.djr
    public final diy ab() {
        return this.q;
    }

    @Override // defpackage.djr
    public final diy ac() {
        return this.r;
    }

    @Override // defpackage.djr
    public final diy ad() {
        return this.n;
    }

    @Override // defpackage.djr
    public final diy ae() {
        return this.p;
    }

    @Override // defpackage.djr
    public final diy af() {
        return this.s;
    }

    @Override // defpackage.djr
    public final diy ag() {
        return this.m;
    }

    @Override // defpackage.djr
    public final djq ah() {
        if (this.l == null) {
            this.l = new djq();
        }
        return this.l;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, djr] */
    @Override // defpackage.din
    /* renamed from: ai, reason: merged with bridge method [inline-methods] */
    public final djr g(int i) {
        return this.i.l(i).p();
    }

    @Override // defpackage.djr
    public final djr aj() {
        djq djqVar = this.l;
        if (djqVar != null) {
            return djqVar.b;
        }
        return null;
    }

    @Override // defpackage.djr
    public final djr ak() {
        djq djqVar = this.l;
        if (djqVar != null) {
            return djqVar.c;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, djr] */
    @Override // defpackage.djr
    public final djr al() {
        dut dutVar = this.i;
        if (dutVar == null || dutVar.m() == null) {
            return null;
        }
        return this.i.m().p();
    }

    @Override // defpackage.djr
    public final djr am(dhe dheVar, dha dhaVar) {
        dlr dlrVar = dheVar.d;
        return bR(dheVar, this, dhaVar, dlrVar == null ? Collections.emptySet() : dlrVar.g());
    }

    @Override // defpackage.djr
    public final YogaDirection an() {
        return this.i.j();
    }

    @Override // defpackage.djr
    public final YogaDirection ao() {
        dut dutVar = this.i;
        while (dutVar != null && dutVar.i() == YogaDirection.INHERIT) {
            dutVar = dutVar.m();
        }
        return dutVar == null ? YogaDirection.INHERIT : dutVar.i();
    }

    @Override // defpackage.djr
    public final dut ap() {
        return this.i;
    }

    @Override // defpackage.djr
    public final String aq() {
        return this.B;
    }

    @Override // defpackage.djr
    public final String ar() {
        return this.w;
    }

    @Override // defpackage.djr
    public final String as() {
        return this.x;
    }

    @Override // defpackage.djr
    public final ArrayList at() {
        return this.y;
    }

    @Override // defpackage.djr
    public final ArrayList au() {
        return this.A;
    }

    @Override // defpackage.djr
    public final List av() {
        return this.b;
    }

    @Override // defpackage.djr
    public final List aw() {
        return this.D;
    }

    @Override // defpackage.djr
    public final void ax(dmh dmhVar) {
        if (this.y == null) {
            this.y = new ArrayList(1);
        }
        this.y.add(dmhVar);
    }

    @Override // defpackage.djr
    public final void ay(List list) {
        if (this.A == null) {
            this.A = new ArrayList(list.size());
        }
        this.A.addAll(list);
    }

    @Override // defpackage.djr
    public final void az(dha dhaVar) {
        this.b.add(dhaVar);
    }

    @Override // defpackage.djr, defpackage.din
    public final float b() {
        return this.g;
    }

    @Override // defpackage.djr
    public final void bA(int i) {
        this.M |= 4294967296L;
        this.N = i;
    }

    @Override // defpackage.djr
    public final void bB(diy diyVar) {
        this.M |= 16777216;
        this.p = bQ(this.p, diyVar);
    }

    @Override // defpackage.djr
    public final void bC(diy diyVar) {
        this.M |= 2147483648L;
        this.s = bQ(this.s, diyVar);
    }

    @Override // defpackage.djr
    public final void bD(diy diyVar) {
        this.M |= 1048576;
        this.m = bQ(this.m, diyVar);
    }

    @Override // defpackage.djr
    public final void bE(YogaWrap yogaWrap) {
        this.i.aa(yogaWrap);
    }

    @Override // defpackage.djr
    public final void bF() {
        this.E = true;
    }

    @Override // defpackage.djr
    public final void bG() {
        this.M |= 256;
    }

    @Override // defpackage.djr
    public final void bH(YogaFlexDirection yogaFlexDirection) {
        this.i.C(yogaFlexDirection);
    }

    @Override // defpackage.djr
    public final void bI() {
        this.M |= 524288;
    }

    @Override // defpackage.djr
    public final void bJ() {
    }

    @Override // defpackage.djr
    public final void bK() {
    }

    @Override // defpackage.djr
    public final void bL() {
    }

    @Override // defpackage.djr
    public final void bM() {
    }

    @Override // defpackage.djr
    public final amsj bN() {
        djq djqVar = this.l;
        if (djqVar != null) {
            return djqVar.f;
        }
        return null;
    }

    @Override // defpackage.djr
    public final int ba() {
        return this.N;
    }

    @Override // defpackage.djr
    public final dik bb() {
        return this.O;
    }

    @Override // defpackage.djr
    public final dik bc() {
        if (this.O == null) {
            this.O = new dik();
        }
        return this.O;
    }

    @Override // defpackage.djr
    public final void bd(dik dikVar) {
        this.O = dikVar;
    }

    @Override // defpackage.djr
    public final void be(YogaAlign yogaAlign) {
        this.i.t(yogaAlign);
    }

    @Override // defpackage.djr
    public final void bf(YogaAlign yogaAlign) {
        this.i.u(yogaAlign);
    }

    @Override // defpackage.djr
    public final void bg(Drawable drawable) {
        this.M |= 262144;
        this.t = drawable;
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            if (rect.bottom == 0 && rect.top == 0 && rect.left == 0 && rect.right == 0) {
                return;
            }
            v(YogaEdge.LEFT, rect.left);
            v(YogaEdge.TOP, rect.top);
            v(YogaEdge.RIGHT, rect.right);
            v(YogaEdge.BOTTOM, rect.bottom);
        }
    }

    @Override // defpackage.djr
    public final void bh(dgr dgrVar) {
        YogaEdge yogaEdge;
        this.M |= 268435456;
        int[] iArr = dgrVar.b;
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                yogaEdge = YogaEdge.LEFT;
            } else if (i == 1) {
                yogaEdge = YogaEdge.TOP;
            } else if (i != 2) {
                yogaEdge = YogaEdge.BOTTOM;
            } else {
                yogaEdge = YogaEdge.RIGHT;
            }
            int i2 = dgrVar.b[i];
            djq djqVar = this.l;
            if (djqVar == null || !djqVar.a) {
                this.i.x(yogaEdge, i2);
            } else {
                djq ah = ah();
                if (ah.e == null) {
                    ah.e = new diu();
                }
                ah.e.d(yogaEdge, i2);
            }
        }
        System.arraycopy(dgrVar.c, 0, this.j, 0, 4);
        System.arraycopy(dgrVar.a, 0, this.k, 0, 4);
        PathEffect pathEffect = dgrVar.d;
    }

    @Override // defpackage.djr
    public final void bi(dha dhaVar) {
        if (dhaVar != null) {
            bj(djt.b(this.a, dhaVar));
        }
    }

    public final void bj(djr djrVar) {
        if (djrVar == null || djrVar == dhe.a) {
            return;
        }
        this.i.q(djrVar.ap(), this.i.h());
    }

    @Override // defpackage.djr
    public final void bk(diy diyVar) {
        this.M |= 2097152;
        this.o = bQ(this.o, diyVar);
    }

    @Override // defpackage.djr
    public final void bl(diy diyVar) {
        this.M |= 4194304;
        this.q = bQ(this.q, diyVar);
    }

    @Override // defpackage.djr
    public final void bm() {
    }

    @Override // defpackage.djr
    public final void bn() {
    }

    @Override // defpackage.djr
    public final void bo() {
    }

    @Override // defpackage.djr
    public final void bp() {
    }

    @Override // defpackage.djr
    public final void bq(int i) {
        this.M |= 128;
        this.F = i;
    }

    @Override // defpackage.djr
    public final void br(diy diyVar) {
        this.M |= 8388608;
        this.r = bQ(this.r, diyVar);
    }

    @Override // defpackage.djr
    public final void bs(YogaJustify yogaJustify) {
        this.i.H(yogaJustify);
    }

    @Override // defpackage.djr
    public final void bt(diy diyVar) {
        this.M |= Long.MIN_VALUE;
        this.n = bQ(this.n, diyVar);
    }

    @Override // defpackage.djr
    public final void bu() {
        this.d = true;
    }

    @Override // defpackage.djr
    public final void bv() {
        this.M |= 536870912;
        bF();
    }

    @Override // defpackage.djr
    public final void bw() {
        this.M |= 1073741824;
        bF();
    }

    @Override // defpackage.djr
    public final void bx(String str) {
        this.B = str;
    }

    @Override // defpackage.djr
    public final void by(YogaEdge yogaEdge, int i) {
        if (this.v == null) {
            this.v = new diu();
        }
        this.M |= 33554432;
        this.v.d(yogaEdge, i);
    }

    @Override // defpackage.djr
    public final void bz(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.M |= 134217728;
        this.w = str;
        this.x = str2;
    }

    @Override // defpackage.djr, defpackage.din
    public final int c() {
        return this.i.h();
    }

    @Override // defpackage.djr, defpackage.din
    public final int d() {
        return this.f;
    }

    @Override // defpackage.djr, defpackage.din
    public final int e() {
        return this.e;
    }

    @Override // defpackage.din
    public final dha f() {
        return W();
    }

    @Override // defpackage.din
    public final dju h() {
        return null;
    }

    @Override // defpackage.din
    public final dju i() {
        return null;
    }

    @Override // defpackage.din
    public final dju j() {
        return null;
    }

    @Override // defpackage.djv
    public final void k(YogaEdge yogaEdge, float f) {
        this.M |= 512;
        this.i.J(yogaEdge, f);
    }

    @Override // defpackage.djv
    public final void kb(YogaAlign yogaAlign) {
        this.M |= 2;
        this.i.v(yogaAlign);
    }

    @Override // defpackage.djv
    public final void kc(float f) {
        this.M |= 67108864;
        this.i.w(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dia
    public final /* bridge */ /* synthetic */ void kd(Object obj) {
        diu diuVar;
        if (obj == dhe.a) {
            return;
        }
        if (this.O != null) {
            if (obj.bb() == null) {
                obj.bd(this.O);
            } else {
                this.O.A(obj.bc());
            }
        }
        if (obj.aV()) {
            obj.kk(L());
        }
        if (obj.aT()) {
            obj.bq(this.F);
        }
        if ((this.M & 256) != 0) {
            obj.bG();
        }
        if ((this.M & 262144) != 0) {
            obj.bg(this.t);
        }
        if ((this.M & 524288) != 0) {
            obj.bI();
        }
        if (this.E) {
            obj.bF();
        }
        if ((this.M & 1048576) != 0) {
            obj.bD(this.m);
        }
        if ((this.M & Long.MIN_VALUE) != 0) {
            obj.bt(this.n);
        }
        if ((this.M & 2097152) != 0) {
            obj.bk(this.o);
        }
        if ((this.M & 4194304) != 0) {
            obj.bl(this.q);
        }
        if ((this.M & 8388608) != 0) {
            obj.br(this.r);
        }
        if ((this.M & 16777216) != 0) {
            obj.bB(this.p);
        }
        if ((this.M & 2147483648L) != 0) {
            obj.bC(this.s);
        }
        String str = this.B;
        if (str != null) {
            obj.bx(str);
        }
        if ((this.M & 1024) != 0) {
            djq djqVar = this.l;
            if (djqVar != null && djqVar.d != null) {
                for (int i = 0; i < diu.a; i++) {
                    float b = this.l.d.b(i);
                    if (!esv.T(b)) {
                        YogaEdge a = YogaEdge.a(i);
                        boolean[] zArr = this.u;
                        if (zArr == null || !zArr[a.j]) {
                            obj.v(a, (int) b);
                        } else {
                            obj.u(a, b);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("copyInto() must be used when resolving a nestedTree. If padding was set on the holder node, we must have a mNestedTreePadding instance");
            }
        }
        if ((this.M & 268435456) != 0) {
            djq djqVar2 = this.l;
            if (djqVar2 == null || (diuVar = djqVar2.e) == null) {
                throw new IllegalStateException("copyInto() must be used when resolving a nestedTree.If border width was set on the holder node, we must have a mNestedTreeBorderWidth instance");
            }
            obj.aC(diuVar, this.j, this.k);
        }
        if ((this.M & 134217728) != 0) {
            obj.bz(this.w, this.x);
        }
        if ((this.M & 4294967296L) != 0) {
            obj.bA(this.N);
        }
        if ((this.M & 536870912) != 0) {
            obj.bv();
        }
        if ((this.M & 1073741824) != 0) {
            obj.bw();
        }
    }

    @Override // defpackage.djv
    public final void ke(float f) {
        this.M |= 64;
        this.i.B(f);
    }

    @Override // defpackage.djv
    public final void kf(int i) {
        this.M |= 64;
        this.i.A(i);
    }

    @Override // defpackage.djv
    public final void kg(float f) {
        this.M |= 16;
        this.i.D(f);
    }

    @Override // defpackage.djv
    public final void kh(float f) {
        this.M |= 32;
        this.i.E(f);
    }

    @Override // defpackage.djv
    public final void ki(float f) {
        this.M |= 32768;
        this.i.G(f);
    }

    @Override // defpackage.djv
    public final void kj(int i) {
        this.M |= 32768;
        this.i.F(i);
    }

    @Override // defpackage.djv
    public final void kk(YogaDirection yogaDirection) {
        this.M |= 1;
        this.i.z(yogaDirection);
    }

    @Override // defpackage.djr, defpackage.din
    public final void kl(int i) {
        this.f = i;
    }

    @Override // defpackage.djr, defpackage.din
    public final void km(float f) {
        this.h = f;
    }

    @Override // defpackage.djr, defpackage.din
    public final void kn(float f) {
        this.g = f;
    }

    @Override // defpackage.djr, defpackage.din
    public final void ko(int i) {
        this.e = i;
    }

    @Override // defpackage.djv
    public final void l(YogaEdge yogaEdge, int i) {
        this.M |= 512;
        this.i.I(yogaEdge, i);
    }

    @Override // defpackage.djv
    public final void m(float f) {
        this.M |= 131072;
        this.i.L(f);
    }

    @Override // defpackage.djv
    public final void n(int i) {
        this.M |= 131072;
        this.i.K(i);
    }

    @Override // defpackage.djv
    public final void o(float f) {
        this.M |= 16384;
        this.i.N(f);
    }

    @Override // defpackage.djv
    public final void p(int i) {
        this.M |= 16384;
        this.i.M(i);
    }

    @Override // defpackage.djv
    public final void q(float f) {
        this.M |= 65536;
        this.i.Q(f);
    }

    @Override // defpackage.djv
    public final void r(int i) {
        this.M |= 65536;
        this.i.P(i);
    }

    @Override // defpackage.djv
    public final void s(float f) {
        this.M |= 8192;
        this.i.S(f);
    }

    @Override // defpackage.djv
    public final void t(int i) {
        this.M |= 8192;
        this.i.R(i);
    }

    @Override // defpackage.djv
    public final void w(YogaEdge yogaEdge, float f) {
        this.M |= 2048;
        this.i.W(yogaEdge, f);
    }

    @Override // defpackage.djv
    public final void x(YogaEdge yogaEdge, int i) {
        this.M |= 2048;
        this.i.V(yogaEdge, i);
    }

    @Override // defpackage.djv
    public final void y(YogaPositionType yogaPositionType) {
        this.M |= 4;
        this.i.X(yogaPositionType);
    }

    @Override // defpackage.djv
    public final void z(float f) {
        this.M |= 4096;
        this.i.Z(f);
    }

    @Override // defpackage.djv
    public final void u(YogaEdge yogaEdge, float f) {
        this.M |= 1024;
        djq djqVar = this.l;
        if (djqVar == null || !djqVar.a) {
            this.i.U(yogaEdge, f);
        } else {
            bP().d(yogaEdge, f);
            bU(yogaEdge, true);
        }
    }

    @Override // defpackage.djv
    public final void v(YogaEdge yogaEdge, int i) {
        this.M |= 1024;
        djq djqVar = this.l;
        if (djqVar == null || !djqVar.a) {
            this.i.T(yogaEdge, i);
        } else {
            bP().d(yogaEdge, i);
            bU(yogaEdge, false);
        }
    }
}
