package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ks;
import defpackage.kw;
import defpackage.up;
import defpackage.us;
import defpackage.ut;
import defpackage.uu;
import defpackage.uy;
import defpackage.va;
import defpackage.wd;
import defpackage.we;
import defpackage.wk;
import defpackage.ws;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public uu g;
    final Rect h;

    public GridLayoutManager(int i, byte[] bArr) {
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new us();
        this.h = new Rect();
        q(i);
    }

    private final int bA(wk wkVar, ws wsVar, int i) {
        if (!wsVar.g) {
            return this.g.c(i, this.b);
        }
        int a = wkVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.g.c(a, this.b);
    }

    private final int bB(wk wkVar, ws wsVar, int i) {
        if (!wsVar.g) {
            return this.g.a(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = wkVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.g.a(a, this.b);
    }

    private final int bC(wk wkVar, ws wsVar, int i) {
        if (!wsVar.g) {
            return this.g.b(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = wkVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.g.b(a);
    }

    private final void bD(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        if (iArr == null || (length = iArr.length) != i3 + 1 || iArr[length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    private final void bE() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    private final void bF(View view, int i, boolean z) {
        int i2;
        int i3;
        ut utVar = (ut) view.getLayoutParams();
        Rect rect = utVar.d;
        int i4 = rect.top + rect.bottom + utVar.topMargin + utVar.bottomMargin;
        int i5 = rect.left + rect.right + utVar.leftMargin + utVar.rightMargin;
        int c = c(utVar.a, utVar.b);
        if (this.i == 1) {
            i3 = as(c, i, i5, utVar.width, false);
            i2 = as(this.j.k(), this.G, i4, utVar.height, true);
        } else {
            int as = as(c, i, i4, utVar.height, false);
            int as2 = as(this.j.k(), this.F, i5, utVar.width, true);
            i2 = as;
            i3 = as2;
        }
        bG(view, i3, i2, z);
    }

    private final void bG(View view, int i, int i2, boolean z) {
        we weVar = (we) view.getLayoutParams();
        boolean z2 = true;
        if (z) {
            if (this.B && wd.be(view.getMeasuredWidth(), i, weVar.width) && wd.be(view.getMeasuredHeight(), i2, weVar.height)) {
                z2 = false;
            }
        } else {
            z2 = bh(view, i, i2, weVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    final int c(int i, int i2) {
        if (this.i != 1 || !ag()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final int d(int i, wk wkVar, ws wsVar) {
        bH();
        bE();
        return super.d(i, wkVar, wsVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final int e(int i, wk wkVar, ws wsVar) {
        bH();
        bE();
        return super.e(i, wkVar, wsVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final we f() {
        return this.i == 0 ? new ut(-2, -1) : new ut(-1, -2);
    }

    @Override // defpackage.wd
    public final we h(Context context, AttributeSet attributeSet) {
        return new ut(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(wk wkVar, ws wsVar, boolean z, boolean z2) {
        int i;
        int i2;
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
        V();
        int j = this.j.j();
        int f = this.j.f();
        View view = null;
        View view2 = null;
        while (i != i3) {
            View az = az(i);
            int bm = bm(az);
            if (bm >= 0 && bm < a && bB(wkVar, wsVar, bm) == 0) {
                if (((we) az.getLayoutParams()).pN()) {
                    if (view2 == null) {
                        view2 = az;
                    }
                } else {
                    if (this.j.d(az) < f && this.j.a(az) >= j) {
                        return az;
                    }
                    if (view == null) {
                        view = az;
                    }
                }
            }
            i += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x023b, code lost:
    
        java.util.Arrays.fill(r17.d, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0241, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01aa, code lost:
    
        r10 = r20.b;
        r2 = r10 + r7;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b6, code lost:
    
        if (r20.f != (-1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b8, code lost:
    
        r10 = r20.b;
        r3 = r10 - r7;
        r1 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c0, code lost:
    
        r10 = r20.b;
        r3 = r10;
        r2 = 0;
        r10 = r10 + r7;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0097, code lost:
    
        r13 = r12 - 1;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r9 != 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r14 = r12;
        r13 = 0;
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r13 == r14) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r8 = r17.d[r13];
        r7 = (defpackage.ut) r8.getLayoutParams();
        r8 = bC(r18, r19, bm(r8));
        r7.b = r8;
        r7.a = r10;
        r10 = r10 + r8;
        r13 = r13 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        r1 = 0.0f;
        r2 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r2 >= r12) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        r8 = r17.d[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (r20.l != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        if (r9 != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        aD(r8);
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        aF(r8, r17.h);
        bF(r8, r5, r10);
        r10 = r17.j.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        if (r10 <= r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        r8 = r17.j.c(r8) / ((defpackage.ut) r8.getLayoutParams()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0102, code lost:
    
        if (r8 <= r1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        r10 = false;
        aE(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        if (r9 != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        aB(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
    
        aC(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0108, code lost:
    
        r2 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010a, code lost:
    
        if (r5 == 1073741824) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
    
        bD(java.lang.Math.max(java.lang.Math.round(r1 * r17.b), r6));
        r7 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
    
        if (r10 >= r12) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        r1 = r17.d[r10];
        bF(r1, r2, true);
        r1 = r17.j.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012d, code lost:
    
        if (r1 <= r7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012f, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        r10 = r10 + 1;
        r2 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0136, code lost:
    
        if (r10 >= r12) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0138, code lost:
    
        r1 = r17.d[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0142, code lost:
    
        if (r17.j.b(r1) == r7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        r2 = (defpackage.ut) r1.getLayoutParams();
        r5 = r2.d;
        r6 = ((r5.top + r5.bottom) + r2.topMargin) + r2.bottomMargin;
        r8 = ((r5.left + r5.right) + r2.leftMargin) + r2.rightMargin;
        r5 = c(r2.a, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
    
        if (r17.i != 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016e, code lost:
    
        r2 = as(r5, 1073741824, r8, r2.width, false);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r6, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018e, code lost:
    
        bG(r1, r2, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017e, code lost:
    
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r8, 1073741824);
        r5 = as(r5, 1073741824, r6, r2.height, false);
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0198, code lost:
    
        r21.a = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        if (r17.i != 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        if (r20.f != (-1)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a4, code lost:
    
        r10 = r20.b;
        r1 = r10 - r7;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r3 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c8, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c9, code lost:
    
        if (r7 >= r12) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cb, code lost:
    
        r5 = r17.d[r7];
        r6 = (defpackage.ut) r5.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d7, code lost:
    
        if (r17.i != 1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dd, code lost:
    
        if (ag() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01df, code lost:
    
        r3 = getPaddingLeft() + r17.c[r17.b - r6.a];
        r10 = r3;
        r3 = r3 - r17.j.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021e, code lost:
    
        bq(r5, r3, r1, r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0225, code lost:
    
        if (r6.pN() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022b, code lost:
    
        if (r6.pM() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022f, code lost:
    
        r21.d = r5.hasFocusable() | r21.d;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022d, code lost:
    
        r21.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f8, code lost:
    
        r3 = getPaddingLeft() + r17.c[r6.a];
        r10 = r17.j.c(r5) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020c, code lost:
    
        r1 = getPaddingTop() + r17.c[r6.a];
        r2 = r17.j.c(r5) + r1;
     */
    @Override // android.support.v7.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.wk r18, defpackage.ws r19, defpackage.va r20, defpackage.uz r21) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.k(wk, ws, va, uz):void");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(wk wkVar, ws wsVar, uy uyVar, int i) {
        bH();
        if (wsVar.a() > 0 && !wsVar.g) {
            int bB = bB(wkVar, wsVar, uyVar.b);
            if (i == 1) {
                while (bB > 0) {
                    int i2 = uyVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    uyVar.b = i3;
                    bB = bB(wkVar, wsVar, i3);
                }
            } else {
                int a = wsVar.a() - 1;
                int i4 = uyVar.b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int bB2 = bB(wkVar, wsVar, i5);
                    if (bB2 <= bB) {
                        break;
                    }
                    i4 = i5;
                    bB = bB2;
                }
                uyVar.b = i4;
            }
        }
        bE();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void n(wk wkVar, ws wsVar) {
        if (wsVar.g) {
            int aq = aq();
            for (int i = 0; i < aq; i++) {
                ut utVar = (ut) az(i).getLayoutParams();
                int pL = utVar.pL();
                this.e.put(pL, utVar.b);
                this.f.put(pL, utVar.a);
            }
        }
        super.n(wkVar, wsVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void o(ws wsVar) {
        super.o(wsVar);
        this.a = false;
    }

    @Override // defpackage.wd
    public final int ox(wk wkVar, ws wsVar) {
        if (this.i == 1) {
            return this.b;
        }
        if (wsVar.a() <= 0) {
            return 0;
        }
        return bA(wkVar, wsVar, wsVar.a() - 1) + 1;
    }

    @Override // defpackage.wd
    public final int oy(wk wkVar, ws wsVar) {
        if (this.i == 0) {
            return this.b;
        }
        if (wsVar.a() <= 0) {
            return 0;
        }
        return bA(wkVar, wsVar, wsVar.a() - 1) + 1;
    }

    @Override // defpackage.wd
    public final we pO(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ut((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ut(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
    
        if (r13 != (r2 > r15)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ea, code lost:
    
        if (r13 != (r2 > r8)) goto L75;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View pP(android.view.View r23, int r24, defpackage.wk r25, defpackage.ws r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.pP(android.view.View, int, wk, ws):android.view.View");
    }

    @Override // defpackage.wd
    public final void pQ(wk wkVar, ws wsVar, View view, ks ksVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ut)) {
            super.aN(view, ksVar);
            return;
        }
        ut utVar = (ut) layoutParams;
        int bA = bA(wkVar, wsVar, utVar.pL());
        if (this.i != 0) {
            ksVar.u(kw.d(bA, 1, utVar.a, utVar.b, false));
        } else {
            ksVar.u(kw.d(utVar.a, utVar.b, bA, 1, false));
        }
    }

    @Override // defpackage.wd
    public final void pR(Rect rect, int i, int i2) {
        int ap;
        int ap2;
        if (this.c == null) {
            super.pR(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.i == 1) {
            ap2 = ap(i2, rect.height() + paddingTop, av());
            ap = ap(i, this.c[r7.length - 1] + paddingLeft, aw());
        } else {
            ap = ap(i, rect.width() + paddingLeft, aw());
            ap2 = ap(i2, this.c[r5.length - 1] + paddingTop, av());
        }
        ba(ap, ap2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final boolean pS() {
        return this.r == null && !this.a;
    }

    @Override // defpackage.wd
    public final void pT() {
        this.g.e();
        this.g.d();
    }

    public final void q(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i <= 0) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
        this.b = i;
        this.g.e();
        aV();
    }

    @Override // defpackage.wd
    public final boolean s(we weVar) {
        return weVar instanceof ut;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void u(ws wsVar, va vaVar, up upVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && vaVar.d(wsVar) && i > 0; i2++) {
            int i3 = vaVar.d;
            upVar.a(i3, Math.max(0, vaVar.g));
            i -= this.g.b(i3);
            vaVar.d += vaVar.e;
        }
    }

    @Override // defpackage.wd
    public final void v(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.wd
    public final void x(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.wd
    public final void y(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.wd
    public final void z(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    private final void bH() {
        int paddingBottom;
        int paddingTop;
        if (this.i == 1) {
            paddingBottom = this.H - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.I - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        bD(paddingBottom - paddingTop);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void r(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.r(false);
    }

    public GridLayoutManager(int i) {
        super(0);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new us();
        this.h = new Rect();
        q(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new us();
        this.h = new Rect();
        q(ax(context, attributeSet, i, i2).b);
    }
}
