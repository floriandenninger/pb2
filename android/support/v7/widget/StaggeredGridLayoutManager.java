package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.bg;
import defpackage.lp;
import defpackage.up;
import defpackage.uv;
import defpackage.vo;
import defpackage.wc;
import defpackage.wd;
import defpackage.we;
import defpackage.wk;
import defpackage.wq;
import defpackage.wr;
import defpackage.ws;
import defpackage.xx;
import defpackage.xy;
import defpackage.xz;
import defpackage.ya;
import defpackage.yb;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends wd implements wq {
    private int[] K;
    yb[] a;
    public vo b;
    vo c;
    private int i;
    private int j;
    private int k;
    private final uv l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private SavedState q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    ya h = new ya();
    private int n = 2;
    private final Rect r = new Rect();
    private final xy s = new xy(this);

    /* renamed from: J, reason: collision with root package name */
    private boolean f73J = true;
    private final Runnable L = new xx(this);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new bg(20);
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List g;
        boolean h;
        boolean i;
        boolean j;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int readInt = parcel.readInt();
            this.c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }

        final void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        final void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        wc ax = ax(context, attributeSet, i, i2);
        int i3 = ax.a;
        if (i3 == 0 || i3 == 1) {
            T(null);
            if (i3 != this.j) {
                this.j = i3;
                vo voVar = this.b;
                this.b = this.c;
                this.c = voVar;
                aV();
            }
            int i4 = ax.b;
            T(null);
            if (i4 != this.i) {
                this.h.a();
                aV();
                this.i = i4;
                this.m = new BitSet(i4);
                this.a = new yb[this.i];
                for (int i5 = 0; i5 < this.i; i5++) {
                    this.a[i5] = new yb(this, i5);
                }
                aV();
            }
            G(ax.c);
            this.l = new uv();
            this.b = vo.q(this, this.j);
            this.c = vo.q(this, 1 - this.j);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    private final int K(int i) {
        if (aq() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int L(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        return lp.c(wsVar, this.b, q(!this.f73J), l(!this.f73J), this, this.f73J);
    }

    private final int M(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        return lp.d(wsVar, this.b, q(!this.f73J), l(!this.f73J), this, this.f73J, this.e);
    }

    private final int N(ws wsVar) {
        if (aq() == 0) {
            return 0;
        }
        return lp.e(wsVar, this.b, q(!this.f73J), l(!this.f73J), this, this.f73J);
    }

    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, boolean] */
    private final int Q(wk wkVar, uv uvVar, ws wsVar) {
        int i;
        int j;
        int R;
        yb ybVar;
        ?? r5;
        int f;
        int b;
        int j2;
        int b2;
        int i2;
        int i3;
        int i4;
        this.m.set(0, this.i, true);
        if (this.l.i) {
            i = uvVar.e == 1 ? Integer.MAX_VALUE : CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        } else if (uvVar.e == 1) {
            i = uvVar.g + uvVar.b;
        } else {
            i = uvVar.f - uvVar.b;
        }
        int i5 = uvVar.e;
        for (int i6 = 0; i6 < this.i; i6++) {
            if (!this.a[i6].a.isEmpty()) {
                bB(this.a[i6], i5, i);
            }
        }
        if (this.e) {
            j = this.b.f();
        } else {
            j = this.b.j();
        }
        boolean z = false;
        while (uvVar.a(wsVar) && (this.l.i || !this.m.isEmpty())) {
            View c = wkVar.c(uvVar.c);
            uvVar.c += uvVar.d;
            xz xzVar = (xz) c.getLayoutParams();
            int pL = xzVar.pL();
            int[] iArr = this.h.a;
            int i7 = (iArr == null || pL >= iArr.length) ? -1 : iArr[pL];
            if (i7 == -1) {
                boolean z2 = xzVar.b;
                if (bC(uvVar.e)) {
                    i3 = this.i - 1;
                    i2 = -1;
                    i4 = -1;
                } else {
                    i2 = this.i;
                    i3 = 0;
                    i4 = 1;
                }
                yb ybVar2 = null;
                if (uvVar.e == 1) {
                    int j3 = this.b.j();
                    int i8 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        yb ybVar3 = this.a[i3];
                        int d = ybVar3.d(j3);
                        int i9 = d < i8 ? d : i8;
                        if (d < i8) {
                            ybVar2 = ybVar3;
                        }
                        i3 += i4;
                        i8 = i9;
                    }
                } else {
                    int f2 = this.b.f();
                    int i10 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                    while (i3 != i2) {
                        yb ybVar4 = this.a[i3];
                        int f3 = ybVar4.f(f2);
                        int i11 = f3 > i10 ? f3 : i10;
                        if (f3 > i10) {
                            ybVar2 = ybVar4;
                        }
                        i3 += i4;
                        i10 = i11;
                    }
                }
                ybVar = ybVar2;
                ya yaVar = this.h;
                yaVar.b(pL);
                yaVar.a[pL] = ybVar.e;
            } else {
                ybVar = this.a[i7];
            }
            xzVar.a = ybVar;
            if (uvVar.e == 1) {
                aD(c);
                r5 = 0;
            } else {
                r5 = 0;
                aE(c, 0);
            }
            boolean z3 = xzVar.b;
            if (this.j != 1) {
                bD(c, as(this.H, this.F, getPaddingLeft() + getPaddingRight(), xzVar.width, true), as(this.k, this.G, 0, xzVar.height, false));
            } else {
                bD(c, as(this.k, this.F, r5, xzVar.width, r5), as(this.I, this.G, getPaddingTop() + getPaddingBottom(), xzVar.height, true));
            }
            if (uvVar.e == 1) {
                boolean z4 = xzVar.b;
                b = ybVar.d(j);
                f = this.b.b(c) + b;
                if (i7 == -1) {
                    boolean z5 = xzVar.b;
                }
            } else {
                boolean z6 = xzVar.b;
                f = ybVar.f(j);
                b = f - this.b.b(c);
                if (i7 == -1) {
                    boolean z7 = xzVar.b;
                }
            }
            boolean z8 = xzVar.b;
            if (uvVar.e == 1) {
                yb ybVar5 = xzVar.a;
                xz n = yb.n(c);
                n.a = ybVar5;
                ybVar5.a.add(c);
                ybVar5.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                if (ybVar5.a.size() == 1) {
                    ybVar5.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                }
                if (n.pN() || n.pM()) {
                    ybVar5.d += ybVar5.f.b.b(c);
                }
            } else {
                yb ybVar6 = xzVar.a;
                xz n2 = yb.n(c);
                n2.a = ybVar6;
                ybVar6.a.add(0, c);
                ybVar6.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                if (ybVar6.a.size() == 1) {
                    ybVar6.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                }
                if (n2.pN() || n2.pM()) {
                    ybVar6.d += ybVar6.f.b.b(c);
                }
            }
            if (!J() || this.j != 1) {
                boolean z9 = xzVar.b;
                j2 = this.c.j() + (ybVar.e * this.k);
                b2 = this.c.b(c) + j2;
            } else {
                boolean z10 = xzVar.b;
                b2 = this.c.f() - (((this.i - 1) - ybVar.e) * this.k);
                j2 = b2 - this.c.b(c);
            }
            if (this.j == 1) {
                bq(c, j2, b, b2, f);
            } else {
                bq(c, b, j2, f, b2);
            }
            boolean z11 = xzVar.b;
            bB(ybVar, this.l.e, i);
            ag(wkVar, this.l);
            if (this.l.h && c.hasFocusable()) {
                boolean z12 = xzVar.b;
                this.m.set(ybVar.e, false);
            }
            z = true;
        }
        if (!z) {
            ag(wkVar, this.l);
        }
        if (this.l.e == -1) {
            R = this.b.j() - U(this.b.j());
        } else {
            R = R(this.b.f()) - this.b.f();
        }
        if (R > 0) {
            return Math.min(uvVar.b, R);
        }
        return 0;
    }

    private final int R(int i) {
        int d = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int d2 = this.a[i2].d(i);
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    private final int U(int i) {
        int f = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int f2 = this.a[i2].f(i);
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    private final void V(wk wkVar, ws wsVar, boolean z) {
        int f;
        int R = R(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        if (R != Integer.MIN_VALUE && (f = this.b.f() - R) > 0) {
            int i = f - (-k(-f, wkVar, wsVar));
            if (!z || i <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void aa(wk wkVar, ws wsVar, boolean z) {
        int j;
        int U = U(Integer.MAX_VALUE);
        if (U != Integer.MAX_VALUE && (j = U - this.b.j()) > 0) {
            int k = j - k(j, wkVar, wsVar);
            if (!z || k <= 0) {
                return;
            }
            this.b.n(-k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ab(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.e
            if (r0 == 0) goto L9
            int r0 = r10.i()
            goto Ld
        L9:
            int r0 = r10.c()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1a
            if (r11 >= r12) goto L16
            int r2 = r12 + 1
            goto L1c
        L16:
            int r2 = r11 + 1
            r3 = r12
            goto L1d
        L1a:
            int r2 = r11 + r12
        L1c:
            r3 = r11
        L1d:
            ya r4 = r10.h
            int[] r5 = r4.a
            r6 = 1
            if (r5 != 0) goto L26
            goto L92
        L26:
            int r5 = r5.length
            if (r3 >= r5) goto L92
            java.util.List r5 = r4.b
            r7 = -1
            if (r5 != 0) goto L30
        L2e:
            r5 = -1
            goto L79
        L30:
            int r5 = r5.size()
            int r5 = r5 + r7
        L35:
            if (r5 < 0) goto L47
            java.util.List r8 = r4.b
            java.lang.Object r8 = r8.get(r5)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r8
            int r9 = r8.a
            if (r9 != r3) goto L44
            goto L48
        L44:
            int r5 = r5 + (-1)
            goto L35
        L47:
            r8 = 0
        L48:
            if (r8 == 0) goto L4f
            java.util.List r5 = r4.b
            r5.remove(r8)
        L4f:
            java.util.List r5 = r4.b
            int r5 = r5.size()
            r8 = 0
        L56:
            if (r8 >= r5) goto L67
            java.util.List r9 = r4.b
            java.lang.Object r9 = r9.get(r8)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r9 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r9
            int r9 = r9.a
            if (r9 >= r3) goto L68
            int r8 = r8 + 1
            goto L56
        L67:
            r8 = -1
        L68:
            if (r8 == r7) goto L2e
            java.util.List r5 = r4.b
            java.lang.Object r5 = r5.get(r8)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r5
            java.util.List r9 = r4.b
            r9.remove(r8)
            int r5 = r5.a
        L79:
            if (r5 != r7) goto L85
            int[] r5 = r4.a
            int r8 = r5.length
            java.util.Arrays.fill(r5, r3, r8, r7)
            int[] r4 = r4.a
            int r4 = r4.length
            goto L92
        L85:
            int[] r8 = r4.a
            int r8 = r8.length
            int r5 = r5 + r6
            int r5 = java.lang.Math.min(r5, r8)
            int[] r4 = r4.a
            java.util.Arrays.fill(r4, r3, r5, r7)
        L92:
            if (r13 == r6) goto Lab
            r4 = 2
            if (r13 == r4) goto La5
            if (r13 == r1) goto L9a
            goto Lb0
        L9a:
            ya r13 = r10.h
            r13.d(r11, r6)
            ya r11 = r10.h
            r11.c(r12, r6)
            goto Lb0
        La5:
            ya r13 = r10.h
            r13.d(r11, r12)
            goto Lb0
        Lab:
            ya r13 = r10.h
            r13.c(r11, r12)
        Lb0:
            if (r2 > r0) goto Lb3
            return
        Lb3:
            boolean r11 = r10.e
            if (r11 == 0) goto Lbc
            int r11 = r10.c()
            goto Lc0
        Lbc:
            int r11 = r10.i()
        Lc0:
            if (r3 > r11) goto Lc5
            r10.aV()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ab(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x03d7, code lost:
    
        if (I() != false) goto L233;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ac(defpackage.wk r12, defpackage.ws r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ac(wk, ws, boolean):void");
    }

    private final void ag(wk wkVar, uv uvVar) {
        int min;
        int min2;
        if (!uvVar.a || uvVar.i) {
            return;
        }
        if (uvVar.b == 0) {
            if (uvVar.e == -1) {
                ah(wkVar, uvVar.g);
                return;
            } else {
                al(wkVar, uvVar.f);
                return;
            }
        }
        int i = 1;
        if (uvVar.e == -1) {
            int i2 = uvVar.f;
            int f = this.a[0].f(i2);
            while (i < this.i) {
                int f2 = this.a[i].f(i2);
                if (f2 > f) {
                    f = f2;
                }
                i++;
            }
            int i3 = i2 - f;
            if (i3 < 0) {
                min2 = uvVar.g;
            } else {
                min2 = uvVar.g - Math.min(i3, uvVar.b);
            }
            ah(wkVar, min2);
            return;
        }
        int i4 = uvVar.g;
        int d = this.a[0].d(i4);
        while (i < this.i) {
            int d2 = this.a[i].d(i4);
            if (d2 < d) {
                d = d2;
            }
            i++;
        }
        int i5 = d - uvVar.g;
        if (i5 < 0) {
            min = uvVar.f;
        } else {
            min = Math.min(i5, uvVar.b) + uvVar.f;
        }
        al(wkVar, min);
    }

    private final void ah(wk wkVar, int i) {
        int aq = aq();
        while (true) {
            aq--;
            if (aq < 0) {
                return;
            }
            View az = az(aq);
            if (this.b.d(az) < i || this.b.m(az) < i) {
                return;
            }
            xz xzVar = (xz) az.getLayoutParams();
            boolean z = xzVar.b;
            if (xzVar.a.a.size() == 1) {
                return;
            }
            yb ybVar = xzVar.a;
            int size = ybVar.a.size();
            View view = (View) ybVar.a.remove(size - 1);
            xz n = yb.n(view);
            n.a = null;
            if (n.pN() || n.pM()) {
                ybVar.d -= ybVar.f.b.b(view);
            }
            if (size == 1) {
                ybVar.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            ybVar.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            aS(az, wkVar);
        }
    }

    private final void al(wk wkVar, int i) {
        while (aq() > 0) {
            View az = az(0);
            if (this.b.a(az) > i || this.b.l(az) > i) {
                return;
            }
            xz xzVar = (xz) az.getLayoutParams();
            boolean z = xzVar.b;
            if (xzVar.a.a.size() == 1) {
                return;
            }
            yb ybVar = xzVar.a;
            View view = (View) ybVar.a.remove(0);
            xz n = yb.n(view);
            n.a = null;
            if (ybVar.a.size() == 0) {
                ybVar.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            if (n.pN() || n.pM()) {
                ybVar.d -= ybVar.f.b.b(view);
            }
            ybVar.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            aS(az, wkVar);
        }
    }

    private final void am() {
        this.e = (this.j == 1 || !J()) ? this.d : !this.d;
    }

    private final void an(int i) {
        uv uvVar = this.l;
        uvVar.e = i;
        uvVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bA(int i, ws wsVar) {
        int i2;
        int i3;
        RecyclerView recyclerView;
        int i4;
        uv uvVar = this.l;
        boolean z = false;
        uvVar.b = 0;
        uvVar.c = i;
        if (!bf() || (i4 = wsVar.a) == -1) {
            i2 = 0;
        } else {
            if (this.e == (i4 < i)) {
                i2 = this.b.k();
            } else {
                i3 = this.b.k();
                i2 = 0;
                recyclerView = this.u;
                if (recyclerView != null || !recyclerView.i) {
                    this.l.g = this.b.e() + i2;
                    this.l.f = -i3;
                } else {
                    this.l.f = this.b.j() - i3;
                    this.l.g = this.b.f() + i2;
                }
                uv uvVar2 = this.l;
                uvVar2.h = false;
                uvVar2.a = true;
                if (this.b.h() == 0 && this.b.e() == 0) {
                    z = true;
                }
                uvVar2.i = z;
            }
        }
        i3 = 0;
        recyclerView = this.u;
        if (recyclerView != null) {
        }
        this.l.g = this.b.e() + i2;
        this.l.f = -i3;
        uv uvVar22 = this.l;
        uvVar22.h = false;
        uvVar22.a = true;
        if (this.b.h() == 0) {
            z = true;
        }
        uvVar22.i = z;
    }

    private final void bB(yb ybVar, int i, int i2) {
        int i3 = ybVar.d;
        if (i == -1) {
            if (ybVar.e() + i3 <= i2) {
                this.m.set(ybVar.e, false);
            }
        } else if (ybVar.c() - i3 >= i2) {
            this.m.set(ybVar.e, false);
        }
    }

    private final boolean bC(int i) {
        if (this.j == 0) {
            return (i == -1) != this.e;
        }
        return ((i == -1) == this.e) == J();
    }

    private final void bD(View view, int i, int i2) {
        aF(view, this.r);
        xz xzVar = (xz) view.getLayoutParams();
        int bE = bE(i, xzVar.leftMargin + this.r.left, xzVar.rightMargin + this.r.right);
        int bE2 = bE(i2, xzVar.topMargin + this.r.top, xzVar.bottomMargin + this.r.bottom);
        if (bh(view, bE, bE2, xzVar)) {
            view.measure(bE, bE2);
        }
    }

    private static final int bE(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.wd
    public final int A(ws wsVar) {
        return L(wsVar);
    }

    @Override // defpackage.wd
    public final int B(ws wsVar) {
        return M(wsVar);
    }

    @Override // defpackage.wd
    public final int C(ws wsVar) {
        return N(wsVar);
    }

    @Override // defpackage.wd
    public final int D(ws wsVar) {
        return L(wsVar);
    }

    @Override // defpackage.wd
    public final int E(ws wsVar) {
        return M(wsVar);
    }

    @Override // defpackage.wd
    public final int F(ws wsVar) {
        return N(wsVar);
    }

    public final void G(boolean z) {
        T(null);
        SavedState savedState = this.q;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.d = z;
        aV();
    }

    final void H(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean I() {
        int c;
        if (aq() != 0 && this.n != 0 && this.z) {
            if (this.e) {
                c = i();
                c();
            } else {
                c = c();
                i();
            }
            if (c == 0 && r() != null) {
                this.h.a();
                aW();
                aV();
                return true;
            }
        }
        return false;
    }

    final boolean J() {
        return au() == 1;
    }

    @Override // defpackage.wq
    public final PointF O(int i) {
        int K = K(i);
        PointF pointF = new PointF();
        if (K == 0) {
            return null;
        }
        if (this.j == 0) {
            pointF.x = K;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = K;
        }
        return pointF;
    }

    @Override // defpackage.wd
    public final Parcelable P() {
        int c;
        View q;
        int f;
        int j;
        int[] iArr;
        SavedState savedState = this.q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.h = this.d;
        savedState2.i = this.o;
        savedState2.j = this.p;
        ya yaVar = this.h;
        if (yaVar != null && (iArr = yaVar.a) != null) {
            savedState2.f = iArr;
            savedState2.e = savedState2.f.length;
            savedState2.g = yaVar.b;
        } else {
            savedState2.e = 0;
        }
        if (aq() > 0) {
            if (this.o) {
                c = i();
            } else {
                c = c();
            }
            savedState2.a = c;
            if (this.e) {
                q = l(true);
            } else {
                q = q(true);
            }
            savedState2.b = q != null ? bm(q) : -1;
            int i = this.i;
            savedState2.c = i;
            savedState2.d = new int[i];
            for (int i2 = 0; i2 < this.i; i2++) {
                if (this.o) {
                    f = this.a[i2].d(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                    if (f != Integer.MIN_VALUE) {
                        j = this.b.f();
                        f -= j;
                        savedState2.d[i2] = f;
                    } else {
                        savedState2.d[i2] = f;
                    }
                } else {
                    f = this.a[i2].f(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                    if (f != Integer.MIN_VALUE) {
                        j = this.b.j();
                        f -= j;
                        savedState2.d[i2] = f;
                    } else {
                        savedState2.d[i2] = f;
                    }
                }
            }
        } else {
            savedState2.a = -1;
            savedState2.b = -1;
            savedState2.c = 0;
        }
        return savedState2;
    }

    @Override // defpackage.wd
    public final void T(String str) {
        if (this.q == null) {
            super.T(str);
        }
    }

    @Override // defpackage.wd
    public final void W(RecyclerView recyclerView, wk wkVar) {
        bv(this.L);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.wd
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (aq() > 0) {
            View q = q(false);
            View l = l(false);
            if (q == null || l == null) {
                return;
            }
            int bm = bm(q);
            int bm2 = bm(l);
            if (bm < bm2) {
                accessibilityEvent.setFromIndex(bm);
                accessibilityEvent.setToIndex(bm2);
            } else {
                accessibilityEvent.setFromIndex(bm2);
                accessibilityEvent.setToIndex(bm);
            }
        }
    }

    @Override // defpackage.wd
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.f != -1) {
                savedState.a();
                this.q.b();
            }
            aV();
        }
    }

    @Override // defpackage.wd
    public final void Z(int i) {
        SavedState savedState = this.q;
        if (savedState != null && savedState.a != i) {
            savedState.a();
        }
        this.f = i;
        this.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        aV();
    }

    @Override // defpackage.wd
    public final void aK(int i) {
        super.aK(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.wd
    public final void aL(int i) {
        super.aL(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.wd
    public final void aO(int i) {
        if (i == 0) {
            I();
        }
    }

    @Override // defpackage.wd
    public final boolean ad() {
        return this.j == 0;
    }

    @Override // defpackage.wd
    public final boolean ae() {
        return this.j == 1;
    }

    @Override // defpackage.wd
    public final boolean af() {
        return this.n != 0;
    }

    @Override // defpackage.wd
    public final void aj(int i, int i2, ws wsVar, up upVar) {
        int d;
        int i3;
        if (1 == this.j) {
            i = i2;
        }
        if (aq() == 0 || i == 0) {
            return;
        }
        u(i, wsVar);
        int[] iArr = this.K;
        if (iArr == null || iArr.length < this.i) {
            this.K = new int[this.i];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.i; i5++) {
            uv uvVar = this.l;
            if (uvVar.d == -1) {
                d = uvVar.f;
                i3 = this.a[i5].f(d);
            } else {
                d = this.a[i5].d(uvVar.g);
                i3 = this.l.g;
            }
            int i6 = d - i3;
            if (i6 >= 0) {
                this.K[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.K, 0, i4);
        for (int i7 = 0; i7 < i4 && this.l.a(wsVar); i7++) {
            upVar.a(this.l.c, this.K[i7]);
            uv uvVar2 = this.l;
            uvVar2.c += uvVar2.d;
        }
    }

    @Override // defpackage.wd
    public final void ao(RecyclerView recyclerView, int i) {
        wr wrVar = new wr(recyclerView.getContext());
        wrVar.b = i;
        bd(wrVar);
    }

    @Override // defpackage.wd
    public final void bs() {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (aq() == 0) {
            return 0;
        }
        return bm(az(0));
    }

    @Override // defpackage.wd
    public final int d(int i, wk wkVar, ws wsVar) {
        return k(i, wkVar, wsVar);
    }

    @Override // defpackage.wd
    public final int e(int i, wk wkVar, ws wsVar) {
        return k(i, wkVar, wsVar);
    }

    @Override // defpackage.wd
    public final we f() {
        return this.j == 0 ? new xz(-2, -1) : new xz(-1, -2);
    }

    @Override // defpackage.wd
    public final we h(Context context, AttributeSet attributeSet) {
        return new xz(context, attributeSet);
    }

    final int i() {
        int aq = aq();
        if (aq == 0) {
            return 0;
        }
        return bm(az(aq - 1));
    }

    final int k(int i, wk wkVar, ws wsVar) {
        if (aq() == 0 || i == 0) {
            return 0;
        }
        u(i, wsVar);
        int Q = Q(wkVar, this.l, wsVar);
        if (this.l.b >= Q) {
            i = i < 0 ? -Q : Q;
        }
        this.b.n(-i);
        this.o = this.e;
        uv uvVar = this.l;
        uvVar.b = 0;
        ag(wkVar, uvVar);
        return i;
    }

    final View l(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        View view = null;
        for (int aq = aq() - 1; aq >= 0; aq--) {
            View az = az(aq);
            int d = this.b.d(az);
            int a = this.b.a(az);
            if (a > j && d < f) {
                if (a <= f || !z) {
                    return az;
                }
                if (view == null) {
                    view = az;
                }
            }
        }
        return view;
    }

    @Override // defpackage.wd
    public final void n(wk wkVar, ws wsVar) {
        ac(wkVar, wsVar, true);
    }

    @Override // defpackage.wd
    public final void o(ws wsVar) {
        this.f = -1;
        this.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.q = null;
        this.s.a();
    }

    @Override // defpackage.wd
    public final we pO(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new xz((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new xz(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x003a, code lost:
    
        if (r8.j == 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x003f, code lost:
    
        if (r8.j == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x004c, code lost:
    
        if (J() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0059, code lost:
    
        if (J() == false) goto L41;
     */
    @Override // defpackage.wd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View pP(android.view.View r9, int r10, defpackage.wk r11, defpackage.ws r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.pP(android.view.View, int, wk, ws):android.view.View");
    }

    @Override // defpackage.wd
    public final void pR(Rect rect, int i, int i2) {
        int ap;
        int ap2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            ap2 = ap(i2, rect.height() + paddingTop, av());
            ap = ap(i, (this.k * this.i) + paddingLeft, aw());
        } else {
            ap = ap(i, rect.width() + paddingLeft, aw());
            ap2 = ap(i2, (this.k * this.i) + paddingTop, av());
        }
        ba(ap, ap2);
    }

    @Override // defpackage.wd
    public final boolean pS() {
        return this.q == null;
    }

    @Override // defpackage.wd
    public final void pT() {
        this.h.a();
        aV();
    }

    final View q(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        int aq = aq();
        View view = null;
        for (int i = 0; i < aq; i++) {
            View az = az(i);
            int d = this.b.d(az);
            if (this.b.a(az) > j && d < f) {
                if (d >= j || !z) {
                    return az;
                }
                if (view == null) {
                    view = az;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.view.View r() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.r():android.view.View");
    }

    @Override // defpackage.wd
    public final boolean s(we weVar) {
        return weVar instanceof xz;
    }

    final void u(int i, ws wsVar) {
        int c;
        int i2;
        if (i > 0) {
            c = i();
            i2 = 1;
        } else {
            c = c();
            i2 = -1;
        }
        this.l.a = true;
        bA(c, wsVar);
        an(i2);
        uv uvVar = this.l;
        uvVar.c = c + uvVar.d;
        uvVar.b = Math.abs(i);
    }

    @Override // defpackage.wd
    public final void v(int i, int i2) {
        ab(i, i2, 1);
    }

    @Override // defpackage.wd
    public final void x(int i, int i2) {
        ab(i, i2, 8);
    }

    @Override // defpackage.wd
    public final void y(int i, int i2) {
        ab(i, i2, 2);
    }

    @Override // defpackage.wd
    public final void z(int i, int i2) {
        ab(i, i2, 4);
    }
}
