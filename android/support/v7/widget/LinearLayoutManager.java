package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.bg;
import defpackage.lp;
import defpackage.up;
import defpackage.uy;
import defpackage.uz;
import defpackage.va;
import defpackage.vo;
import defpackage.wc;
import defpackage.wd;
import defpackage.we;
import defpackage.wk;
import defpackage.wq;
import defpackage.wr;
import defpackage.ws;
import defpackage.wv;
import defpackage.zm;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends wd implements zm, wq {
    private va a;
    private boolean b;
    private final uz c;
    private int d;
    private int[] e;
    public int i;
    vo j;
    public boolean k;
    boolean l;
    public boolean m;
    public boolean n;
    int o;
    int p;
    public boolean q;
    SavedState r;
    final uy s;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new bg(18);
        int a;
        int b;
        boolean c;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
            this.c = savedState.c;
        }

        final void a() {
            this.a = -1;
        }

        final boolean b() {
            return this.a >= 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    private final int bA(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        V();
        return lp.e(wsVar, this.j, am(!this.n), al(!this.n), this, this.n);
    }

    private final int bB(int i, wk wkVar, ws wsVar, boolean z) {
        int f;
        int f2 = this.j.f() - i;
        if (f2 <= 0) {
            return 0;
        }
        int i2 = -N(-f2, wkVar, wsVar);
        int i3 = i + i2;
        if (!z || (f = this.j.f() - i3) <= 0) {
            return i2;
        }
        this.j.n(f);
        return f + i2;
    }

    private final int bC(int i, wk wkVar, ws wsVar, boolean z) {
        int j;
        int j2 = i - this.j.j();
        if (j2 <= 0) {
            return 0;
        }
        int i2 = -N(j2, wkVar, wsVar);
        int i3 = i + i2;
        if (!z || (j = i3 - this.j.j()) <= 0) {
            return i2;
        }
        this.j.n(-j);
        return i2 - j;
    }

    private final View bD() {
        return Q(0, aq());
    }

    private final View bE() {
        return Q(aq() - 1, -1);
    }

    private final View bF() {
        return az(this.l ? 0 : aq() - 1);
    }

    private final View bG() {
        return az(this.l ? aq() - 1 : 0);
    }

    private final void bH(wk wkVar, va vaVar) {
        if (!vaVar.a || vaVar.m) {
            return;
        }
        int i = vaVar.g;
        int i2 = vaVar.i;
        if (vaVar.f == -1) {
            int aq = aq();
            if (i < 0) {
                return;
            }
            int e = (this.j.e() - i) + i2;
            if (this.l) {
                for (int i3 = 0; i3 < aq; i3++) {
                    View az = az(i3);
                    if (this.j.d(az) < e || this.j.m(az) < e) {
                        bI(wkVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = aq - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View az2 = az(i5);
                if (this.j.d(az2) < e || this.j.m(az2) < e) {
                    bI(wkVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int aq2 = aq();
            if (!this.l) {
                for (int i7 = 0; i7 < aq2; i7++) {
                    View az3 = az(i7);
                    if (this.j.a(az3) > i6 || this.j.l(az3) > i6) {
                        bI(wkVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = aq2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View az4 = az(i9);
                if (this.j.a(az4) > i6 || this.j.l(az4) > i6) {
                    bI(wkVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bJ() {
        this.l = (this.i == 1 || !ag()) ? this.k : !this.k;
    }

    private final void bK(int i, int i2, boolean z, ws wsVar) {
        int j;
        this.a.m = ah();
        this.a.f = i;
        int[] iArr = this.e;
        iArr[0] = 0;
        iArr[1] = 0;
        U(wsVar, iArr);
        int max = Math.max(0, this.e[0]);
        int max2 = Math.max(0, this.e[1]);
        va vaVar = this.a;
        int i3 = i == 1 ? max2 : max;
        vaVar.h = i3;
        if (i != 1) {
            max = max2;
        }
        vaVar.i = max;
        if (i == 1) {
            vaVar.h = i3 + this.j.g();
            View bF = bF();
            va vaVar2 = this.a;
            vaVar2.e = true == this.l ? -1 : 1;
            int bm = bm(bF);
            va vaVar3 = this.a;
            vaVar2.d = bm + vaVar3.e;
            vaVar3.b = this.j.a(bF);
            j = this.j.a(bF) - this.j.f();
        } else {
            View bG = bG();
            this.a.h += this.j.j();
            va vaVar4 = this.a;
            vaVar4.e = true != this.l ? -1 : 1;
            int bm2 = bm(bG);
            va vaVar5 = this.a;
            vaVar4.d = bm2 + vaVar5.e;
            vaVar5.b = this.j.d(bG);
            j = (-this.j.d(bG)) + this.j.j();
        }
        va vaVar6 = this.a;
        vaVar6.c = i2;
        if (z) {
            vaVar6.c = i2 - j;
        }
        vaVar6.g = j;
    }

    private final void bL(uy uyVar) {
        bM(uyVar.b, uyVar.c);
    }

    private final void bM(int i, int i2) {
        this.a.c = this.j.f() - i2;
        va vaVar = this.a;
        vaVar.e = true != this.l ? 1 : -1;
        vaVar.d = i;
        vaVar.f = 1;
        vaVar.b = i2;
        vaVar.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    private final void bN(uy uyVar) {
        bO(uyVar.b, uyVar.c);
    }

    private final void bO(int i, int i2) {
        this.a.c = i2 - this.j.j();
        va vaVar = this.a;
        vaVar.d = i;
        vaVar.e = true != this.l ? -1 : 1;
        vaVar.f = -1;
        vaVar.b = i2;
        vaVar.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    private final int c(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        V();
        return lp.c(wsVar, this.j, am(!this.n), al(!this.n), this, this.n);
    }

    private final int q(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        V();
        return lp.d(wsVar, this.j, am(!this.n), al(!this.n), this, this.n, this.l);
    }

    @Override // defpackage.wd
    public final int A(ws wsVar) {
        return c(wsVar);
    }

    @Override // defpackage.wd
    public final int B(ws wsVar) {
        return q(wsVar);
    }

    @Override // defpackage.wd
    public final int C(ws wsVar) {
        return bA(wsVar);
    }

    @Override // defpackage.wd
    public final int D(ws wsVar) {
        return c(wsVar);
    }

    @Override // defpackage.wd
    public final int E(ws wsVar) {
        return q(wsVar);
    }

    @Override // defpackage.wd
    public final int F(ws wsVar) {
        return bA(wsVar);
    }

    final int H(wk wkVar, va vaVar, ws wsVar, boolean z) {
        int i = vaVar.c;
        int i2 = vaVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                vaVar.g = i2 + i;
            }
            bH(wkVar, vaVar);
        }
        int i3 = vaVar.c + vaVar.h;
        uz uzVar = this.c;
        while (true) {
            if ((!vaVar.m && i3 <= 0) || !vaVar.d(wsVar)) {
                break;
            }
            uzVar.a = 0;
            uzVar.b = false;
            uzVar.c = false;
            uzVar.d = false;
            k(wkVar, wsVar, vaVar, uzVar);
            if (!uzVar.b) {
                int i4 = vaVar.b;
                int i5 = uzVar.a;
                vaVar.b = i4 + (vaVar.f * i5);
                if (!uzVar.c || vaVar.l != null || !wsVar.g) {
                    vaVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = vaVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    vaVar.g = i7;
                    int i8 = vaVar.c;
                    if (i8 < 0) {
                        vaVar.g = i7 + i8;
                    }
                    bH(wkVar, vaVar);
                }
                if (z && uzVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - vaVar.c;
    }

    public int I() {
        View R = R(0, aq(), true, false);
        if (R == null) {
            return -1;
        }
        return bm(R);
    }

    public final int J() {
        View R = R(0, aq(), false, true);
        if (R == null) {
            return -1;
        }
        return bm(R);
    }

    public final int K() {
        View R = R(aq() - 1, -1, true, false);
        if (R == null) {
            return -1;
        }
        return bm(R);
    }

    public final int L() {
        View R = R(aq() - 1, -1, false, true);
        if (R == null) {
            return -1;
        }
        return bm(R);
    }

    @Deprecated
    protected int M(ws wsVar) {
        if (wsVar.a != -1) {
            return this.j.k();
        }
        return 0;
    }

    final int N(int i, wk wkVar, ws wsVar) {
        if (aq() == 0 || i == 0) {
            return 0;
        }
        V();
        this.a.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        bK(i2, abs, true, wsVar);
        va vaVar = this.a;
        int H = vaVar.g + H(wkVar, vaVar, wsVar, false);
        if (H < 0) {
            return 0;
        }
        if (abs > H) {
            i = i2 * H;
        }
        this.j.n(-i);
        this.a.k = i;
        return i;
    }

    @Override // defpackage.wq
    public final PointF O(int i) {
        if (aq() == 0) {
            return null;
        }
        int i2 = (i < bm(az(0))) != this.l ? -1 : 1;
        if (this.i == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // defpackage.wd
    public final Parcelable P() {
        SavedState savedState = this.r;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (aq() > 0) {
            V();
            boolean z = this.b ^ this.l;
            savedState2.c = z;
            if (z) {
                View bF = bF();
                savedState2.b = this.j.f() - this.j.a(bF);
                savedState2.a = bm(bF);
            } else {
                View bG = bG();
                savedState2.a = bm(bG);
                savedState2.b = this.j.d(bG) - this.j.j();
            }
        } else {
            savedState2.a();
        }
        return savedState2;
    }

    final View Q(int i, int i2) {
        V();
        if (i2 > i || i2 < i) {
            int d = this.j.d(az(i));
            int j = this.j.j();
            int i3 = d < j ? 16388 : 4097;
            int i4 = d < j ? 16644 : 4161;
            if (this.i == 0) {
                return this.v.a(i, i2, i4, i3);
            }
            return this.w.a(i, i2, i4, i3);
        }
        return az(i);
    }

    final View R(int i, int i2, boolean z, boolean z2) {
        V();
        int i3 = true != z ? 320 : 24579;
        int i4 = true != z2 ? 0 : 320;
        if (this.i == 0) {
            return this.v.a(i, i2, i3, i4);
        }
        return this.w.a(i, i2, i3, i4);
    }

    @Override // defpackage.wd
    public final View S(int i) {
        int aq = aq();
        if (aq == 0) {
            return null;
        }
        int bm = i - bm(az(0));
        if (bm >= 0 && bm < aq) {
            View az = az(bm);
            if (bm(az) == i) {
                return az;
            }
        }
        return super.S(i);
    }

    @Override // defpackage.wd
    public final void T(String str) {
        if (this.r == null) {
            super.T(str);
        }
    }

    protected final void U(ws wsVar, int[] iArr) {
        int M = M(wsVar);
        int i = this.a.f;
        int i2 = i == -1 ? 0 : M;
        if (i != -1) {
            M = 0;
        }
        iArr[0] = M;
        iArr[1] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V() {
        if (this.a == null) {
            this.a = new va();
        }
    }

    @Override // defpackage.wd
    public void W(RecyclerView recyclerView, wk wkVar) {
        if (this.q) {
            aQ(wkVar);
            wkVar.e();
        }
    }

    @Override // defpackage.wd
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (aq() > 0) {
            accessibilityEvent.setFromIndex(J());
            accessibilityEvent.setToIndex(L());
        }
    }

    @Override // defpackage.wd
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.r = savedState;
            if (this.o != -1) {
                savedState.a();
            }
            aV();
        }
    }

    @Override // defpackage.wd
    public final void Z(int i) {
        this.o = i;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        SavedState savedState = this.r;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    public final void aa(int i, int i2) {
        this.o = i;
        this.p = i2;
        SavedState savedState = this.r;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    public final void ac(boolean z) {
        T(null);
        if (z == this.k) {
            return;
        }
        this.k = z;
        aV();
    }

    @Override // defpackage.wd
    public boolean ad() {
        return this.i == 0;
    }

    @Override // defpackage.wd
    public boolean ae() {
        return this.i == 1;
    }

    @Override // defpackage.wd
    public final boolean af() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ag() {
        return au() == 1;
    }

    final boolean ah() {
        return this.j.h() == 0 && this.j.e() == 0;
    }

    @Override // defpackage.wd
    public final boolean ai() {
        if (this.G != 1073741824 && this.F != 1073741824) {
            int aq = aq();
            for (int i = 0; i < aq; i++) {
                ViewGroup.LayoutParams layoutParams = az(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wd
    public final void aj(int i, int i2, ws wsVar, up upVar) {
        if (1 == this.i) {
            i = i2;
        }
        if (aq() == 0 || i == 0) {
            return;
        }
        V();
        bK(i > 0 ? 1 : -1, Math.abs(i), true, wsVar);
        u(wsVar, this.a, upVar);
    }

    final View al(boolean z) {
        return this.l ? R(0, aq(), z, true) : R(aq() - 1, -1, z, true);
    }

    final View am(boolean z) {
        return this.l ? R(aq() - 1, -1, z, true) : R(0, aq(), z, true);
    }

    @Override // defpackage.zm
    public final void an(View view, View view2) {
        T("Cannot drop a view during a scroll or layout calculation");
        V();
        bJ();
        int bm = bm(view);
        int bm2 = bm(view2);
        char c = bm < bm2 ? (char) 1 : (char) 65535;
        if (this.l) {
            if (c == 1) {
                aa(bm2, this.j.f() - (this.j.d(view2) + this.j.b(view)));
                return;
            } else {
                aa(bm2, this.j.f() - this.j.a(view2));
                return;
            }
        }
        if (c == 65535) {
            aa(bm2, this.j.d(view2));
        } else {
            aa(bm2, this.j.a(view2) - this.j.b(view));
        }
    }

    @Override // defpackage.wd
    public void ao(RecyclerView recyclerView, int i) {
        wr wrVar = new wr(recyclerView.getContext());
        wrVar.b = i;
        bd(wrVar);
    }

    @Override // defpackage.wd
    public int d(int i, wk wkVar, ws wsVar) {
        if (this.i == 1) {
            return 0;
        }
        return N(i, wkVar, wsVar);
    }

    @Override // defpackage.wd
    public int e(int i, wk wkVar, ws wsVar) {
        if (this.i == 0) {
            return 0;
        }
        return N(i, wkVar, wsVar);
    }

    @Override // defpackage.wd
    public we f() {
        return new we(-2, -2);
    }

    public View i(wk wkVar, ws wsVar, boolean z, boolean z2) {
        int i;
        int i2;
        V();
        int aq = aq();
        int i3 = -1;
        if (z2) {
            i = aq() - 1;
            i2 = -1;
        } else {
            i3 = aq;
            i = 0;
            i2 = 1;
        }
        int a = wsVar.a();
        int j = this.j.j();
        int f = this.j.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != i3) {
            View az = az(i);
            int bm = bm(az);
            int d = this.j.d(az);
            int a2 = this.j.a(az);
            if (bm >= 0 && bm < a) {
                if (!((we) az.getLayoutParams()).pN()) {
                    boolean z3 = a2 <= j && d < j;
                    boolean z4 = d >= f && a2 > f;
                    if (!z3 && !z4) {
                        return az;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = az;
                        }
                        view2 = az;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = az;
                        }
                        view2 = az;
                    }
                } else if (view3 == null) {
                    view3 = az;
                }
            }
            i += i2;
        }
        return view != null ? view : view2 == null ? view3 : view2;
    }

    public void k(wk wkVar, ws wsVar, va vaVar, uz uzVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View a = vaVar.a(wkVar);
        if (a == null) {
            uzVar.b = true;
            return;
        }
        we weVar = (we) a.getLayoutParams();
        if (vaVar.l == null) {
            if (this.l == (vaVar.f == -1)) {
                aD(a);
            } else {
                aE(a, 0);
            }
        } else {
            if (this.l == (vaVar.f == -1)) {
                aB(a);
            } else {
                aC(a, 0);
            }
        }
        br(a);
        uzVar.a = this.j.b(a);
        if (this.i == 1) {
            if (ag()) {
                i4 = this.H - getPaddingRight();
                i = i4 - this.j.c(a);
            } else {
                i = getPaddingLeft();
                i4 = this.j.c(a) + i;
            }
            if (vaVar.f == -1) {
                i2 = vaVar.b;
                i3 = i2 - uzVar.a;
            } else {
                i3 = vaVar.b;
                i2 = uzVar.a + i3;
            }
        } else {
            int paddingTop = getPaddingTop();
            int c = this.j.c(a) + paddingTop;
            if (vaVar.f == -1) {
                int i5 = vaVar.b;
                int i6 = i5 - uzVar.a;
                i4 = i5;
                i2 = c;
                i = i6;
                i3 = paddingTop;
            } else {
                int i7 = vaVar.b;
                int i8 = uzVar.a + i7;
                i = i7;
                i2 = c;
                i3 = paddingTop;
                i4 = i8;
            }
        }
        bq(a, i, i3, i4, i2);
        if (weVar.pN() || weVar.pM()) {
            uzVar.c = true;
        }
        uzVar.d = a.hasFocusable();
    }

    public void l(wk wkVar, ws wsVar, uy uyVar, int i) {
    }

    @Override // defpackage.wd
    public void n(wk wkVar, ws wsVar) {
        View i;
        int i2;
        int d;
        int i3;
        int i4;
        int i5;
        int bB;
        int i6;
        View S;
        int i7 = -1;
        if ((this.r == null && this.o == -1) || wsVar.a() != 0) {
            SavedState savedState = this.r;
            if (savedState != null && savedState.b()) {
                this.o = this.r.a;
            }
            V();
            this.a.a = false;
            bJ();
            View aA = aA();
            uy uyVar = this.s;
            if (!uyVar.e || this.o != -1 || this.r != null) {
                uyVar.d();
                uy uyVar2 = this.s;
                uyVar2.d = this.l ^ this.m;
                if (!wsVar.g && (i2 = this.o) != -1) {
                    if (i2 < 0 || i2 >= wsVar.a()) {
                        this.o = -1;
                        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                    } else {
                        uyVar2.b = this.o;
                        SavedState savedState2 = this.r;
                        if (savedState2 != null && savedState2.b()) {
                            boolean z = this.r.c;
                            uyVar2.d = z;
                            if (z) {
                                uyVar2.c = this.j.f() - this.r.b;
                            } else {
                                uyVar2.c = this.j.j() + this.r.b;
                            }
                        } else if (this.p == Integer.MIN_VALUE) {
                            View S2 = S(this.o);
                            if (S2 != null) {
                                if (this.j.b(S2) > this.j.k()) {
                                    uyVar2.a();
                                } else if (this.j.d(S2) - this.j.j() < 0) {
                                    uyVar2.c = this.j.j();
                                    uyVar2.d = false;
                                } else if (this.j.f() - this.j.a(S2) < 0) {
                                    uyVar2.c = this.j.f();
                                    uyVar2.d = true;
                                } else {
                                    if (uyVar2.d) {
                                        d = this.j.a(S2) + this.j.o();
                                    } else {
                                        d = this.j.d(S2);
                                    }
                                    uyVar2.c = d;
                                }
                            } else {
                                if (aq() > 0) {
                                    uyVar2.d = (this.o < bm(az(0))) == this.l;
                                }
                                uyVar2.a();
                            }
                        } else {
                            boolean z2 = this.l;
                            uyVar2.d = z2;
                            if (z2) {
                                uyVar2.c = this.j.f() - this.p;
                            } else {
                                uyVar2.c = this.j.j() + this.p;
                            }
                        }
                        this.s.e = true;
                    }
                }
                if (aq() != 0) {
                    View aA2 = aA();
                    if (aA2 != null) {
                        we weVar = (we) aA2.getLayoutParams();
                        if (!weVar.pN() && weVar.pL() >= 0 && weVar.pL() < wsVar.a()) {
                            uyVar2.c(aA2, bm(aA2));
                            this.s.e = true;
                        }
                    }
                    boolean z3 = this.b;
                    boolean z4 = this.m;
                    if (z3 == z4 && (i = i(wkVar, wsVar, uyVar2.d, z4)) != null) {
                        uyVar2.b(i, bm(i));
                        if (!wsVar.g && pS()) {
                            int d2 = this.j.d(i);
                            int a = this.j.a(i);
                            int j = this.j.j();
                            int f = this.j.f();
                            boolean z5 = a <= j && d2 < j;
                            boolean z6 = d2 >= f && a > f;
                            if (z5 || z6) {
                                if (true == uyVar2.d) {
                                    j = f;
                                }
                                uyVar2.c = j;
                            }
                        }
                        this.s.e = true;
                    }
                }
                uyVar2.a();
                uyVar2.b = this.m ? wsVar.a() - 1 : 0;
                this.s.e = true;
            } else if (aA != null && (this.j.d(aA) >= this.j.f() || this.j.a(aA) <= this.j.j())) {
                this.s.c(aA, bm(aA));
            }
            va vaVar = this.a;
            vaVar.f = vaVar.k >= 0 ? 1 : -1;
            int[] iArr = this.e;
            iArr[0] = 0;
            iArr[1] = 0;
            U(wsVar, iArr);
            int max = Math.max(0, this.e[0]) + this.j.j();
            int max2 = Math.max(0, this.e[1]) + this.j.g();
            if (wsVar.g && (i6 = this.o) != -1 && this.p != Integer.MIN_VALUE && (S = S(i6)) != null) {
                int f2 = this.l ? (this.j.f() - this.j.a(S)) - this.p : this.p - (this.j.d(S) - this.j.j());
                if (f2 > 0) {
                    max += f2;
                } else {
                    max2 -= f2;
                }
            }
            uy uyVar3 = this.s;
            if (!uyVar3.d ? true != this.l : true == this.l) {
                i7 = 1;
            }
            l(wkVar, wsVar, uyVar3, i7);
            aG(wkVar);
            this.a.m = ah();
            va vaVar2 = this.a;
            vaVar2.j = wsVar.g;
            vaVar2.i = 0;
            uy uyVar4 = this.s;
            if (uyVar4.d) {
                bN(uyVar4);
                va vaVar3 = this.a;
                vaVar3.h = max;
                H(wkVar, vaVar3, wsVar, false);
                va vaVar4 = this.a;
                i4 = vaVar4.b;
                int i8 = vaVar4.d;
                int i9 = vaVar4.c;
                if (i9 > 0) {
                    max2 += i9;
                }
                bL(this.s);
                va vaVar5 = this.a;
                vaVar5.h = max2;
                vaVar5.d += vaVar5.e;
                H(wkVar, vaVar5, wsVar, false);
                va vaVar6 = this.a;
                i3 = vaVar6.b;
                int i10 = vaVar6.c;
                if (i10 > 0) {
                    bO(i8, i4);
                    va vaVar7 = this.a;
                    vaVar7.h = i10;
                    H(wkVar, vaVar7, wsVar, false);
                    i4 = this.a.b;
                }
            } else {
                bL(uyVar4);
                va vaVar8 = this.a;
                vaVar8.h = max2;
                H(wkVar, vaVar8, wsVar, false);
                va vaVar9 = this.a;
                i3 = vaVar9.b;
                int i11 = vaVar9.d;
                int i12 = vaVar9.c;
                if (i12 > 0) {
                    max += i12;
                }
                bN(this.s);
                va vaVar10 = this.a;
                vaVar10.h = max;
                vaVar10.d += vaVar10.e;
                H(wkVar, vaVar10, wsVar, false);
                va vaVar11 = this.a;
                i4 = vaVar11.b;
                int i13 = vaVar11.c;
                if (i13 > 0) {
                    bM(i11, i3);
                    va vaVar12 = this.a;
                    vaVar12.h = i13;
                    H(wkVar, vaVar12, wsVar, false);
                    i3 = this.a.b;
                }
            }
            if (aq() > 0) {
                if (this.l ^ this.m) {
                    int bB2 = bB(i3, wkVar, wsVar, true);
                    int i14 = i4 + bB2;
                    bB = bC(i14, wkVar, wsVar, false);
                    i4 = i14 + bB;
                    i5 = i3 + bB2;
                } else {
                    int bC = bC(i4, wkVar, wsVar, true);
                    i5 = i3 + bC;
                    bB = bB(i5, wkVar, wsVar, false);
                    i4 = i4 + bC + bB;
                }
                i3 = i5 + bB;
            }
            if (wsVar.k && aq() != 0 && !wsVar.g && pS()) {
                List list = wkVar.d;
                int size = list.size();
                int bm = bm(az(0));
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    wv wvVar = (wv) list.get(i17);
                    if (!wvVar.v()) {
                        if ((wvVar.c() < bm) != this.l) {
                            i15 += this.j.b(wvVar.a);
                        } else {
                            i16 += this.j.b(wvVar.a);
                        }
                    }
                }
                this.a.l = list;
                if (i15 > 0) {
                    bO(bm(bG()), i4);
                    va vaVar13 = this.a;
                    vaVar13.h = i15;
                    vaVar13.c = 0;
                    vaVar13.b();
                    H(wkVar, this.a, wsVar, false);
                }
                if (i16 > 0) {
                    bM(bm(bF()), i3);
                    va vaVar14 = this.a;
                    vaVar14.h = i16;
                    vaVar14.c = 0;
                    vaVar14.b();
                    H(wkVar, this.a, wsVar, false);
                }
                this.a.l = null;
            }
            if (!wsVar.g) {
                vo voVar = this.j;
                voVar.b = voVar.k();
            } else {
                this.s.d();
            }
            this.b = this.m;
            return;
        }
        aQ(wkVar);
    }

    @Override // defpackage.wd
    public void o(ws wsVar) {
        this.r = null;
        this.o = -1;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.s.d();
    }

    @Override // defpackage.wd
    public View pP(View view, int i, wk wkVar, ws wsVar) {
        int G;
        View bE;
        View bF;
        View bD;
        bJ();
        if (aq() == 0 || (G = G(i)) == Integer.MIN_VALUE) {
            return null;
        }
        V();
        bK(G, (int) (this.j.k() * 0.33333334f), false, wsVar);
        va vaVar = this.a;
        vaVar.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        vaVar.a = false;
        H(wkVar, vaVar, wsVar, true);
        if (G == -1) {
            if (this.l) {
                bD = bE();
            } else {
                bD = bD();
            }
            bE = bD;
            G = -1;
        } else if (this.l) {
            bE = bD();
        } else {
            bE = bE();
        }
        if (G == -1) {
            bF = bG();
        } else {
            bF = bF();
        }
        if (!bF.hasFocusable()) {
            return bE;
        }
        if (bE == null) {
            return null;
        }
        return bF;
    }

    @Override // defpackage.wd
    public boolean pS() {
        return this.r == null && this.b == this.m;
    }

    public void r(boolean z) {
        T(null);
        if (this.m == z) {
            return;
        }
        this.m = z;
        aV();
    }

    public void u(ws wsVar, va vaVar, up upVar) {
        int i = vaVar.d;
        if (i < 0 || i >= wsVar.a()) {
            return;
        }
        upVar.a(i, Math.max(0, vaVar.g));
    }

    public LinearLayoutManager(int i) {
        this.i = 1;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = -1;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.r = null;
        this.s = new uy();
        this.c = new uz();
        this.d = 2;
        this.e = new int[2];
        ab(i);
        ac(false);
    }

    private final void bI(wk wkVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aT(i, wkVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aT(i2, wkVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G(int i) {
        if (i == 1) {
            return (this.i != 1 && ag()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.i != 1 && ag()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.i == 0) {
                return -1;
            }
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        if (i == 33) {
            if (this.i == 1) {
                return -1;
            }
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        if (i == 66) {
            if (this.i == 0) {
                return 1;
            }
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        if (i == 130 && this.i == 1) {
            return 1;
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    @Override // defpackage.wd
    public final void ak(int i, up upVar) {
        boolean z;
        int i2;
        SavedState savedState = this.r;
        if (savedState == null || !savedState.b()) {
            bJ();
            z = this.l;
            i2 = this.o;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.r;
            z = savedState2.c;
            i2 = savedState2.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.d && i2 >= 0 && i2 < i; i4++) {
            upVar.a(i2, 0);
            i2 += i3;
        }
    }

    public final void ab(int i) {
        if (i == 0 || i == 1) {
            T(null);
            if (i != this.i || this.j == null) {
                vo q = vo.q(this, i);
                this.j = q;
                this.s.a = q;
                this.i = i;
                aV();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = 1;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = -1;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.r = null;
        this.s = new uy();
        this.c = new uz();
        this.d = 2;
        this.e = new int[2];
        wc ax = ax(context, attributeSet, i, i2);
        ab(ax.a);
        ac(ax.c);
        r(ax.d);
    }
}
