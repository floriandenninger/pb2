package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import defpackage.pph;
import defpackage.ptu;
import defpackage.ptv;
import defpackage.ptw;
import defpackage.pty;
import defpackage.ptz;
import defpackage.pua;
import defpackage.vo;
import defpackage.wc;
import defpackage.wd;
import defpackage.we;
import defpackage.wk;
import defpackage.wq;
import defpackage.wr;
import defpackage.ws;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends wd implements ptu, wq {
    private static final Rect g = new Rect();
    private final Context L;
    private View M;
    public int a;
    public int b;
    public boolean c;
    public vo f;
    private int h;
    private boolean j;
    private wk k;
    private ws l;
    private pua m;
    private vo o;
    private SavedState p;
    private int i = -1;
    public List d = new ArrayList();
    public final pty e = new pty(this);
    private ptz n = new ptz(this);
    private int q = -1;
    private int r = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    private int s = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    /* renamed from: J, reason: collision with root package name */
    private int f167J = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    private SparseArray K = new SparseArray();
    private int N = -1;
    private ptw O = new ptw();

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class LayoutParams extends we implements FlexItem {
        public static final Parcelable.Creator CREATOR = new pph(18);
        private float a;
        private float b;
        private int g;
        private float h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;

        public LayoutParams() {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float a() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int e() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean p() {
            return this.m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.g = parcel.readInt();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new pph(19);
        public int a;
        public int b;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
        }

        public final void a() {
            this.a = -1;
        }

        public final boolean b(int i) {
            int i2 = this.a;
            return i2 >= 0 && i2 < i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        wc ax = ax(context, attributeSet, i, i2);
        int i3 = ax.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (ax.c) {
                    N(3);
                } else {
                    N(2);
                }
            }
        } else if (ax.c) {
            N(1);
        } else {
            N(0);
        }
        if (this.b != 1) {
            aP();
            bC();
            this.b = 1;
            this.f = null;
            this.o = null;
            aV();
        }
        if (this.h != 4) {
            aP();
            bC();
            this.h = 4;
            aV();
        }
        this.A = true;
        this.L = context;
    }

    private final int Q(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        int a = wsVar.a();
        bE();
        View ah = ah(a);
        View am = am(a);
        if (wsVar.a() == 0 || ah == null || am == null) {
            return 0;
        }
        return Math.min(this.f.k(), this.f.a(am) - this.f.d(ah));
    }

    private final int R(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        int a = wsVar.a();
        View ah = ah(a);
        View am = am(a);
        if (wsVar.a() != 0 && ah != null && am != null) {
            int bm = bm(ah);
            int bm2 = bm(am);
            int abs = Math.abs(this.f.a(am) - this.f.d(ah));
            int i = this.e.b[bm];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((r4[bm2] - i) + 1))) + (this.f.j() - this.f.d(ah)));
            }
        }
        return 0;
    }

    private final int U(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        int a = wsVar.a();
        View ah = ah(a);
        View am = am(a);
        if (wsVar.a() == 0 || ah == null || am == null) {
            return 0;
        }
        int L = L();
        return (int) ((Math.abs(this.f.a(am) - this.f.d(ah)) / ((M() - L) + 1)) * wsVar.a());
    }

    private final int V(wk wkVar, ws wsVar, pua puaVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View view;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        View view2;
        int i13 = puaVar.f;
        if (i13 != Integer.MIN_VALUE) {
            int i14 = puaVar.a;
            if (i14 < 0) {
                puaVar.f = i13 + i14;
            }
            bF(wkVar, puaVar);
        }
        int i15 = puaVar.a;
        boolean K = K();
        int i16 = i15;
        int i17 = 0;
        while (true) {
            if (i16 <= 0 && !this.m.b) {
                break;
            }
            List list = this.d;
            int i18 = puaVar.d;
            if (i18 < 0 || i18 >= wsVar.a() || (i = puaVar.c) < 0 || i >= list.size()) {
                break;
            }
            ptv ptvVar = (ptv) this.d.get(puaVar.c);
            puaVar.d = ptvVar.o;
            if (!K()) {
                i2 = i15;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i19 = this.I;
                int i20 = puaVar.e;
                if (puaVar.i == -1) {
                    int i21 = ptvVar.g;
                    i4 = i20 + i21;
                    i3 = i20 - i21;
                } else {
                    i3 = i20;
                    i4 = i3;
                }
                int i22 = puaVar.d;
                float f = this.n.d;
                float f2 = paddingTop - f;
                float f3 = (i19 - paddingBottom) - f;
                float max = Math.max(0.0f, 0.0f);
                int i23 = ptvVar.h;
                int i24 = i22;
                int i25 = 0;
                while (i24 < i22 + i23) {
                    View t = t(i24);
                    int i26 = i16;
                    long j = this.e.c[i24];
                    int i27 = (int) j;
                    int q = pty.q(j);
                    if (bM(t, i27, q, (LayoutParams) t.getLayoutParams())) {
                        t.measure(i27, q);
                    }
                    float bo = f2 + r7.topMargin + bo(t);
                    float bi = f3 - (r7.rightMargin + bi(t));
                    if (puaVar.i == 1) {
                        aF(t, g);
                        aD(t);
                    } else {
                        aF(t, g);
                        aE(t, i25);
                        i25++;
                    }
                    int i28 = i25;
                    int bl = i3 + bl(t);
                    int bn = i4 - bn(t);
                    if (!this.c) {
                        view = t;
                        i7 = i24;
                        i8 = i23;
                        i9 = i22;
                        if (this.j) {
                            this.e.m(view, ptvVar, false, bl, Math.round(bi) - view.getMeasuredHeight(), bl + view.getMeasuredWidth(), Math.round(bi));
                        } else {
                            this.e.m(view, ptvVar, false, bl, Math.round(bo), bl + view.getMeasuredWidth(), Math.round(bo) + view.getMeasuredHeight());
                        }
                    } else if (this.j) {
                        view = t;
                        i7 = i24;
                        i8 = i23;
                        i9 = i22;
                        this.e.m(t, ptvVar, true, bn - t.getMeasuredWidth(), Math.round(bi) - t.getMeasuredHeight(), bn, Math.round(bi));
                    } else {
                        view = t;
                        i7 = i24;
                        i8 = i23;
                        i9 = i22;
                        this.e.m(view, ptvVar, true, bn - view.getMeasuredWidth(), Math.round(bo), bn, Math.round(bo) + view.getMeasuredHeight());
                    }
                    f2 = bo + view.getMeasuredHeight() + r7.topMargin + bi(view) + max;
                    f3 = bi - (((view.getMeasuredHeight() + r7.bottomMargin) + bo(view)) + max);
                    i24 = i7 + 1;
                    i25 = i28;
                    i16 = i26;
                    i22 = i9;
                    i23 = i8;
                }
                i5 = i16;
                puaVar.c += this.m.i;
                i6 = ptvVar.g;
            } else {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i29 = this.H;
                int i30 = puaVar.e;
                if (puaVar.i == -1) {
                    i30 -= ptvVar.g;
                }
                int i31 = puaVar.d;
                float f4 = this.n.d;
                float f5 = paddingLeft - f4;
                float f6 = (i29 - paddingRight) - f4;
                float max2 = Math.max(0.0f, 0.0f);
                int i32 = ptvVar.h;
                int i33 = i31;
                int i34 = 0;
                while (i33 < i31 + i32) {
                    View t2 = t(i33);
                    int i35 = i31;
                    int i36 = i15;
                    if (puaVar.i == 1) {
                        aF(t2, g);
                        aD(t2);
                    } else {
                        aF(t2, g);
                        aE(t2, i34);
                        i34++;
                    }
                    int i37 = i34;
                    long j2 = this.e.c[i33];
                    int i38 = (int) j2;
                    int q2 = pty.q(j2);
                    if (bM(t2, i38, q2, (LayoutParams) t2.getLayoutParams())) {
                        t2.measure(i38, q2);
                    }
                    float bl2 = r4.leftMargin + bl(t2) + f5;
                    float bn2 = f6 - (r4.rightMargin + bn(t2));
                    int bo2 = i30 + bo(t2);
                    if (this.c) {
                        i11 = i33;
                        i12 = i32;
                        i10 = i30;
                        view2 = t2;
                        this.e.l(t2, ptvVar, Math.round(bn2) - t2.getMeasuredWidth(), bo2, Math.round(bn2), bo2 + t2.getMeasuredHeight());
                    } else {
                        i10 = i30;
                        i11 = i33;
                        i12 = i32;
                        view2 = t2;
                        this.e.l(view2, ptvVar, Math.round(bl2), bo2, Math.round(bl2) + view2.getMeasuredWidth(), bo2 + view2.getMeasuredHeight());
                    }
                    f5 = view2.getMeasuredWidth() + r4.rightMargin + bn(view2) + max2 + bl2;
                    f6 = bn2 - (((view2.getMeasuredWidth() + r4.leftMargin) + bl(view2)) + max2);
                    i33 = i11 + 1;
                    i31 = i35;
                    i15 = i36;
                    i34 = i37;
                    i32 = i12;
                    i30 = i10;
                }
                i2 = i15;
                puaVar.c += this.m.i;
                i6 = ptvVar.g;
                i5 = i16;
            }
            i17 += i6;
            if (K || !this.c) {
                puaVar.e += ptvVar.g * puaVar.i;
            } else {
                puaVar.e -= ptvVar.g * puaVar.i;
            }
            i16 = i5 - ptvVar.g;
            i15 = i2;
        }
        int i39 = i15;
        int i40 = puaVar.a - i17;
        puaVar.a = i40;
        int i41 = puaVar.f;
        if (i41 != Integer.MIN_VALUE) {
            int i42 = i41 + i17;
            puaVar.f = i42;
            if (i40 < 0) {
                puaVar.f = i42 + i40;
            }
            bF(wkVar, puaVar);
        }
        return i39 - puaVar.a;
    }

    private final int ac(int i, wk wkVar, ws wsVar) {
        int i2;
        if (aq() == 0 || i == 0) {
            return 0;
        }
        bE();
        this.m.j = true;
        boolean z = !K() && this.c;
        int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
        int abs = Math.abs(i);
        this.m.i = i3;
        boolean K = K();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.H, this.F);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.I, this.G);
        boolean z2 = !K && this.c;
        if (i3 == 1) {
            View az = az(aq() - 1);
            this.m.e = this.f.a(az);
            int bm = bm(az);
            View an = an(az, (ptv) this.d.get(this.e.b[bm]));
            this.m.h = 1;
            pua puaVar = this.m;
            int i4 = bm + puaVar.h;
            puaVar.d = i4;
            int[] iArr = this.e.b;
            if (iArr.length <= i4) {
                puaVar.c = -1;
            } else {
                puaVar.c = iArr[i4];
            }
            if (z2) {
                puaVar.e = this.f.d(an);
                this.m.f = (-this.f.d(an)) + this.f.j();
                pua puaVar2 = this.m;
                int i5 = puaVar2.f;
                if (i5 < 0) {
                    i5 = 0;
                }
                puaVar2.f = i5;
            } else {
                puaVar.e = this.f.a(an);
                this.m.f = this.f.a(an) - this.f.f();
            }
            int i6 = this.m.c;
            if ((i6 == -1 || i6 > this.d.size() - 1) && this.m.d <= l()) {
                int i7 = abs - this.m.f;
                this.O.a();
                if (i7 > 0) {
                    if (K) {
                        this.e.c(this.O, makeMeasureSpec, makeMeasureSpec2, i7, this.m.d, this.d);
                    } else {
                        this.e.d(this.O, makeMeasureSpec, makeMeasureSpec2, i7, this.m.d, this.d);
                    }
                    this.e.h(makeMeasureSpec, makeMeasureSpec2, this.m.d);
                    this.e.o(this.m.d);
                }
            }
        } else {
            View az2 = az(0);
            this.m.e = this.f.d(az2);
            int bm2 = bm(az2);
            View al = al(az2, (ptv) this.d.get(this.e.b[bm2]));
            this.m.h = 1;
            int i8 = this.e.b[bm2];
            if (i8 == -1) {
                i8 = 0;
            }
            if (i8 > 0) {
                this.m.d = bm2 - ((ptv) this.d.get(i8 - 1)).h;
            } else {
                this.m.d = -1;
            }
            pua puaVar3 = this.m;
            puaVar3.c = i8 > 0 ? i8 - 1 : 0;
            if (z2) {
                puaVar3.e = this.f.a(al);
                this.m.f = this.f.a(al) - this.f.f();
                pua puaVar4 = this.m;
                int i9 = puaVar4.f;
                if (i9 < 0) {
                    i9 = 0;
                }
                puaVar4.f = i9;
            } else {
                puaVar3.e = this.f.d(al);
                this.m.f = (-this.f.d(al)) + this.f.j();
            }
        }
        pua puaVar5 = this.m;
        int i10 = puaVar5.f;
        puaVar5.a = abs - i10;
        int V = i10 + V(wkVar, wsVar, puaVar5);
        if (V < 0) {
            return 0;
        }
        if (z) {
            if (abs > V) {
                i2 = (-i3) * V;
            }
            i2 = i;
        } else {
            if (abs > V) {
                i2 = i3 * V;
            }
            i2 = i;
        }
        this.f.n(-i2);
        this.m.g = i2;
        return i2;
    }

    private final int ag(int i) {
        int i2;
        if (aq() == 0 || i == 0) {
            return 0;
        }
        bE();
        boolean K = K();
        int width = K ? this.M.getWidth() : this.M.getHeight();
        int i3 = K ? this.H : this.I;
        if (au() == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i3 + this.n.d) - width, abs);
            }
            i2 = this.n.d;
            if (i2 + i <= 0) {
                return i;
            }
        } else {
            if (i > 0) {
                return Math.min((i3 - this.n.d) - width, i);
            }
            i2 = this.n.d;
            if (i2 + i >= 0) {
                return i;
            }
        }
        return -i2;
    }

    private final View ah(int i) {
        View bA = bA(0, aq(), i);
        if (bA == null) {
            return null;
        }
        int i2 = this.e.b[bm(bA)];
        if (i2 == -1) {
            return null;
        }
        return al(bA, (ptv) this.d.get(i2));
    }

    private final View al(View view, ptv ptvVar) {
        boolean K = K();
        int i = ptvVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View az = az(i2);
            if (az != null && az.getVisibility() != 8) {
                if (!this.c || K) {
                    if (this.f.d(view) <= this.f.d(az)) {
                    }
                    view = az;
                } else {
                    if (this.f.a(view) >= this.f.a(az)) {
                    }
                    view = az;
                }
            }
        }
        return view;
    }

    private final View am(int i) {
        View bA = bA(aq() - 1, -1, i);
        if (bA == null) {
            return null;
        }
        return an(bA, (ptv) this.d.get(this.e.b[bm(bA)]));
    }

    private final View an(View view, ptv ptvVar) {
        boolean K = K();
        int aq = (aq() - ptvVar.h) - 1;
        for (int aq2 = aq() - 2; aq2 > aq; aq2--) {
            View az = az(aq2);
            if (az != null && az.getVisibility() != 8) {
                if (!this.c || K) {
                    if (this.f.a(view) >= this.f.a(az)) {
                    }
                    view = az;
                } else {
                    if (this.f.d(view) <= this.f.d(az)) {
                    }
                    view = az;
                }
            }
        }
        return view;
    }

    private final View bA(int i, int i2, int i3) {
        bE();
        bD();
        int j = this.f.j();
        int f = this.f.f();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View az = az(i);
            int bm = bm(az);
            if (bm >= 0 && bm < i3) {
                if (((we) az.getLayoutParams()).pN()) {
                    if (view2 == null) {
                        view2 = az;
                    }
                } else {
                    if (this.f.d(az) >= j && this.f.a(az) <= f) {
                        return az;
                    }
                    if (view == null) {
                        view = az;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private final View bB() {
        return az(0);
    }

    private final void bC() {
        this.d.clear();
        this.n.b();
        this.n.d = 0;
    }

    private final void bD() {
        if (this.m == null) {
            this.m = new pua();
        }
    }

    private final void bE() {
        if (this.f != null) {
            return;
        }
        if (K()) {
            if (this.b == 0) {
                this.f = vo.p(this);
                this.o = vo.r(this);
                return;
            } else {
                this.f = vo.r(this);
                this.o = vo.p(this);
                return;
            }
        }
        if (this.b == 0) {
            this.f = vo.r(this);
            this.o = vo.p(this);
        } else {
            this.f = vo.p(this);
            this.o = vo.r(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bF(defpackage.wk r12, defpackage.pua r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.bF(wk, pua):void");
    }

    private final void bG(wk wkVar, int i, int i2) {
        while (i2 >= i) {
            aT(i2, wkVar);
            i2--;
        }
    }

    private final void bH() {
        int i = K() ? this.G : this.F;
        pua puaVar = this.m;
        boolean z = true;
        if (i != 0 && i != Integer.MIN_VALUE) {
            z = false;
        }
        puaVar.b = z;
    }

    private final void bI(int i) {
        int L = L();
        int M = M();
        if (i >= M) {
            return;
        }
        int aq = aq();
        this.e.j(aq);
        this.e.k(aq);
        this.e.i(aq);
        if (i >= this.e.b.length) {
            return;
        }
        this.N = i;
        View bB = bB();
        if (bB == null) {
            return;
        }
        if (L > i || i > M) {
            this.q = bm(bB);
            if (K() || !this.c) {
                this.r = this.f.d(bB) - this.f.j();
            } else {
                this.r = this.f.a(bB) + this.f.g();
            }
        }
    }

    private final void bJ(ptz ptzVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            bH();
        } else {
            this.m.b = false;
        }
        if (K() || !this.c) {
            this.m.a = this.f.f() - ptzVar.c;
        } else {
            this.m.a = ptzVar.c - getPaddingRight();
        }
        pua puaVar = this.m;
        puaVar.d = ptzVar.a;
        puaVar.h = 1;
        pua puaVar2 = this.m;
        puaVar2.i = 1;
        puaVar2.e = ptzVar.c;
        puaVar2.f = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        puaVar2.c = ptzVar.b;
        if (!z || this.d.size() <= 1 || (i = ptzVar.b) < 0 || i >= this.d.size() - 1) {
            return;
        }
        ptv ptvVar = (ptv) this.d.get(ptzVar.b);
        pua puaVar3 = this.m;
        puaVar3.c++;
        puaVar3.d += ptvVar.h;
    }

    private final void bK(ptz ptzVar, boolean z, boolean z2) {
        if (z2) {
            bH();
        } else {
            this.m.b = false;
        }
        if (!K() && this.c) {
            this.m.a = (this.M.getWidth() - ptzVar.c) - this.f.j();
        } else {
            this.m.a = ptzVar.c - this.f.j();
        }
        pua puaVar = this.m;
        puaVar.d = ptzVar.a;
        puaVar.h = 1;
        pua puaVar2 = this.m;
        puaVar2.i = -1;
        puaVar2.e = ptzVar.c;
        puaVar2.f = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        puaVar2.c = ptzVar.b;
        if (!z || ptzVar.b <= 0) {
            return;
        }
        int size = this.d.size();
        int i = ptzVar.b;
        if (size > i) {
            ptv ptvVar = (ptv) this.d.get(i);
            r4.c--;
            this.m.d -= ptvVar.h;
        }
    }

    private static boolean bL(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private final boolean bM(View view, int i, int i2, we weVar) {
        return (!view.isLayoutRequested() && this.B && bL(view.getWidth(), i, weVar.width) && bL(view.getHeight(), i2, weVar.height)) ? false : true;
    }

    private final View bN(int i, int i2) {
        int i3 = i;
        int i4 = i2 > i3 ? 1 : -1;
        while (i3 != i2) {
            View az = az(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i5 = this.H;
            int paddingRight = getPaddingRight();
            int paddingBottom = this.I - getPaddingBottom();
            we weVar = (we) az.getLayoutParams();
            int bx = bx(az);
            int i6 = weVar.leftMargin;
            int bz = bz(az) - ((we) az.getLayoutParams()).topMargin;
            int by = by(az) + ((we) az.getLayoutParams()).rightMargin;
            int bw = bw(az) + ((we) az.getLayoutParams()).bottomMargin;
            boolean z = bx - i6 >= i5 - paddingRight || by >= paddingLeft;
            boolean z2 = bz >= paddingBottom || bw >= paddingTop;
            if (z && z2) {
                return az;
            }
            i3 += i4;
        }
        return null;
    }

    @Override // defpackage.wd
    public final int A(ws wsVar) {
        return Q(wsVar);
    }

    @Override // defpackage.wd
    public final int B(ws wsVar) {
        R(wsVar);
        return R(wsVar);
    }

    @Override // defpackage.wd
    public final int C(ws wsVar) {
        return U(wsVar);
    }

    @Override // defpackage.wd
    public final int D(ws wsVar) {
        return Q(wsVar);
    }

    @Override // defpackage.wd
    public final int E(ws wsVar) {
        return R(wsVar);
    }

    @Override // defpackage.wd
    public final int F(ws wsVar) {
        return U(wsVar);
    }

    @Override // defpackage.ptu
    public final void G(View view, int i, int i2, ptv ptvVar) {
        aF(view, g);
        if (K()) {
            int bl = bl(view) + bn(view);
            ptvVar.e += bl;
            ptvVar.f += bl;
        } else {
            int bo = bo(view) + bi(view);
            ptvVar.e += bo;
            ptvVar.f += bo;
        }
    }

    @Override // defpackage.ptu
    public final void H(ptv ptvVar) {
    }

    @Override // defpackage.ptu
    public final void I(List list) {
        this.d = list;
    }

    @Override // defpackage.ptu
    public final void J(int i, View view) {
        this.K.put(i, view);
    }

    @Override // defpackage.ptu
    public final boolean K() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final int L() {
        View bN = bN(0, aq());
        if (bN == null) {
            return -1;
        }
        return bm(bN);
    }

    public final int M() {
        View bN = bN(aq() - 1, -1);
        if (bN == null) {
            return -1;
        }
        return bm(bN);
    }

    public final void N(int i) {
        if (this.a != i) {
            aP();
            this.a = i;
            this.f = null;
            this.o = null;
            bC();
            aV();
        }
    }

    @Override // defpackage.wq
    public final PointF O(int i) {
        if (aq() == 0) {
            return null;
        }
        int i2 = i < bm(az(0)) ? -1 : 1;
        if (K()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // defpackage.wd
    public final Parcelable P() {
        SavedState savedState = this.p;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (aq() <= 0) {
            savedState2.a();
        } else {
            View bB = bB();
            savedState2.a = bm(bB);
            savedState2.b = this.f.d(bB) - this.f.j();
        }
        return savedState2;
    }

    @Override // defpackage.wd
    public final void W(RecyclerView recyclerView, wk wkVar) {
    }

    @Override // defpackage.wd
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.p = (SavedState) parcelable;
            aV();
        }
    }

    @Override // defpackage.wd
    public final void Z(int i) {
        this.q = i;
        this.r = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    @Override // defpackage.ptu
    public final int a() {
        return 5;
    }

    @Override // defpackage.wd
    public final void aM(RecyclerView recyclerView) {
        this.M = (View) recyclerView.getParent();
    }

    @Override // defpackage.wd
    public final boolean ad() {
        return !K() || this.H > this.M.getWidth();
    }

    @Override // defpackage.wd
    public final boolean ae() {
        return K() || this.I > this.M.getHeight();
    }

    @Override // defpackage.wd
    public final void ao(RecyclerView recyclerView, int i) {
        wr wrVar = new wr(recyclerView.getContext());
        wrVar.b = i;
        bd(wrVar);
    }

    @Override // defpackage.ptu
    public final int b() {
        return this.h;
    }

    @Override // defpackage.wd
    public final void bs() {
        aP();
    }

    @Override // defpackage.wd
    public final void bt(int i) {
        bI(i);
    }

    @Override // defpackage.ptu
    public final int c(int i, int i2, int i3) {
        return as(this.I, this.G, i2, i3, ae());
    }

    @Override // defpackage.wd
    public final int d(int i, wk wkVar, ws wsVar) {
        if (!K()) {
            int ac = ac(i, wkVar, wsVar);
            this.K.clear();
            return ac;
        }
        int ag = ag(i);
        this.n.d += ag;
        this.o.n(-ag);
        return ag;
    }

    @Override // defpackage.wd
    public final int e(int i, wk wkVar, ws wsVar) {
        if (K()) {
            int ac = ac(i, wkVar, wsVar);
            this.K.clear();
            return ac;
        }
        int ag = ag(i);
        this.n.d += ag;
        this.o.n(-ag);
        return ag;
    }

    @Override // defpackage.wd
    public final we f() {
        return new LayoutParams();
    }

    @Override // defpackage.ptu
    public final int g(int i, int i2, int i3) {
        return as(this.H, this.F, i2, i3, ad());
    }

    @Override // defpackage.wd
    public final we h(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // defpackage.ptu
    public final int i(View view) {
        int bl;
        int bn;
        if (K()) {
            bl = bo(view);
            bn = bi(view);
        } else {
            bl = bl(view);
            bn = bn(view);
        }
        return bl + bn;
    }

    @Override // defpackage.ptu
    public final int j(View view, int i, int i2) {
        int bo;
        int bi;
        if (K()) {
            bo = bl(view);
            bi = bn(view);
        } else {
            bo = bo(view);
            bi = bi(view);
        }
        return bo + bi;
    }

    @Override // defpackage.ptu
    public final int k() {
        return this.a;
    }

    @Override // defpackage.ptu
    public final int l() {
        return this.l.a();
    }

    @Override // defpackage.ptu
    public final int m() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0030, code lost:
    
        if (r5 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x003a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0038, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0033, code lost:
    
        if (r5 != 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0036, code lost:
    
        if (r5 == 1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022d  */
    @Override // defpackage.wd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.wk r19, defpackage.ws r20) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.n(wk, ws):void");
    }

    @Override // defpackage.wd
    public final void o(ws wsVar) {
        this.p = null;
        this.q = -1;
        this.r = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.N = -1;
        this.n.b();
        this.K.clear();
    }

    @Override // defpackage.ptu
    public final int p() {
        if (this.d.size() == 0) {
            return 0;
        }
        int size = this.d.size();
        int i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((ptv) this.d.get(i2)).e);
        }
        return i;
    }

    @Override // defpackage.ptu
    public final int q() {
        return this.i;
    }

    @Override // defpackage.ptu
    public final int r() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((ptv) this.d.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.wd
    public final boolean s(we weVar) {
        return weVar instanceof LayoutParams;
    }

    @Override // defpackage.ptu
    public final View t(int i) {
        View view = (View) this.K.get(i);
        return view != null ? view : this.k.c(i);
    }

    @Override // defpackage.ptu
    public final View u(int i) {
        return t(i);
    }

    @Override // defpackage.wd
    public final void v(int i, int i2) {
        bI(i);
    }

    @Override // defpackage.ptu
    public final List w() {
        return this.d;
    }

    @Override // defpackage.wd
    public final void x(int i, int i2) {
        bI(Math.min(i, i2));
    }

    @Override // defpackage.wd
    public final void y(int i, int i2) {
        bI(i);
    }

    @Override // defpackage.wd
    public final void z(int i, int i2) {
        bt(i);
        bI(i);
    }

    private final int aa(int i, wk wkVar, ws wsVar, boolean z) {
        int i2;
        int f;
        if (K() || !this.c) {
            int f2 = this.f.f() - i;
            if (f2 <= 0) {
                return 0;
            }
            i2 = -ac(-f2, wkVar, wsVar);
        } else {
            int j = i - this.f.j();
            if (j <= 0) {
                return 0;
            }
            i2 = ac(j, wkVar, wsVar);
        }
        int i3 = i + i2;
        if (!z || (f = this.f.f() - i3) <= 0) {
            return i2;
        }
        this.f.n(f);
        return f + i2;
    }

    private final int ab(int i, wk wkVar, ws wsVar, boolean z) {
        int i2;
        int j;
        if (K() || !this.c) {
            int j2 = i - this.f.j();
            if (j2 <= 0) {
                return 0;
            }
            i2 = -ac(j2, wkVar, wsVar);
        } else {
            int f = this.f.f() - i;
            if (f <= 0) {
                return 0;
            }
            i2 = ac(-f, wkVar, wsVar);
        }
        int i3 = i + i2;
        if (!z || (j = i3 - this.f.j()) <= 0) {
            return i2;
        }
        this.f.n(-j);
        return i2 - j;
    }
}
