package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djt {
    static final boolean a = "robolectric".equals(Build.FINGERPRINT);

    public static djr b(dhe dheVar, dha dhaVar) {
        return d(dheVar, dhaVar, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static djr c(dhe dheVar, dha dhaVar, boolean z) {
        return d(dheVar, dhaVar, z, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static djr d(dhe dheVar, dha dhaVar, boolean z, boolean z2) {
        dha dhaVar2;
        djr c;
        try {
            dhaVar = a(dheVar, dhaVar, z2);
            dhe dheVar2 = dhaVar.q;
            if (!dha.A(dheVar2, dhaVar) || z) {
                if (dhaVar.d()) {
                    c = (djr) dhaVar.c(dheVar2);
                } else if (dha.y(dhaVar)) {
                    c = did.m(dheVar2);
                    c.bH(YogaFlexDirection.COLUMN);
                } else if (dha.w(dhaVar)) {
                    try {
                        dhaVar2 = dha.x(dhaVar) ? dhaVar.G(dheVar2, dheVar2.h, dheVar2.i) : dhaVar.b(dheVar2);
                    } catch (Exception e) {
                        dhk.ak(e);
                        dhaVar2 = null;
                    }
                    if (dhaVar2 == null || dhaVar2.k <= 0) {
                        dhaVar2 = null;
                    }
                    if (dhaVar2 == dhaVar) {
                        c = (djr) dhaVar2.c(dheVar2);
                    } else {
                        c = dhaVar2 != null ? c(dheVar2, dhaVar2, false) : null;
                    }
                } else {
                    String valueOf = String.valueOf(dhaVar.o());
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "component:".concat(valueOf) : new String("component:"));
                }
            } else {
                c = did.m(dheVar2);
                amsj amsjVar = dheVar2.m;
                ((dii) c).ah().a = true;
                ((dii) c).ah().f = amsj.E(amsjVar);
            }
            if (c == null || c == dhe.a) {
                return dhe.a;
            }
            if (c.W() == null && ((dhaVar.Z() && dha.y(dhaVar)) || (dha.A(dheVar2, dhaVar) && !z))) {
                c.aH(dhk.t);
            }
            dgx dgxVar = dhaVar.s;
            if (dgxVar != null && ((!dha.x(dhaVar) || !z) && c != dhe.a)) {
                dik dikVar = dgxVar.g;
                if (dikVar != null) {
                    dikVar.A(c.bc());
                }
                if ((dgxVar.a & 1) != 0) {
                    c.bg(dgxVar.c);
                }
                if ((dgxVar.a & 2) != 0) {
                    c.bx(dgxVar.d);
                }
                if (dgxVar.f || (dgxVar.a & 28) != 0) {
                    c.bF();
                }
                dgv dgvVar = dgxVar.h;
                if (dgvVar != null) {
                    if ((dgvVar.a & 1) != 0) {
                        c.A(dgvVar.b);
                    }
                    if ((dgvVar.a & 2) != 0) {
                        c.z(dgvVar.c);
                    }
                    if ((dgvVar.a & 4) != 0) {
                        c.t(dgvVar.d);
                    }
                    if ((dgvVar.a & 8) != 0) {
                        c.s(dgvVar.e);
                    }
                    if ((dgvVar.a & 16) != 0) {
                        c.p(dgvVar.f);
                    }
                    if ((dgvVar.a & 32) != 0) {
                        c.o(dgvVar.g);
                    }
                    if ((dgvVar.a & 64) != 0) {
                        c.kj(dgvVar.h);
                    }
                    if ((dgvVar.a & 128) != 0) {
                        c.ki(dgvVar.i);
                    }
                    if ((dgvVar.a & 256) != 0) {
                        c.r(dgvVar.j);
                    }
                    if ((dgvVar.a & 512) != 0) {
                        c.q(dgvVar.k);
                    }
                    if ((dgvVar.a & 1024) != 0) {
                        c.n(dgvVar.l);
                    }
                    if ((dgvVar.a & 2048) != 0) {
                        c.m(dgvVar.m);
                    }
                    if ((dgvVar.a & 4096) != 0) {
                        c.kk(dgvVar.s);
                    }
                    if ((dgvVar.a & 8192) != 0) {
                        c.kb(dgvVar.t);
                    }
                    if ((dgvVar.a & 16384) != 0) {
                        c.B();
                    }
                    if ((dgvVar.a & 32768) != 0) {
                        c.kg(dgvVar.n);
                    }
                    if ((dgvVar.a & 65536) != 0) {
                        c.kh(dgvVar.o);
                    }
                    if ((dgvVar.a & 131072) != 0) {
                        c.kf(dgvVar.p);
                    }
                    if ((dgvVar.a & 262144) != 0) {
                        c.ke(dgvVar.q);
                    }
                    if ((dgvVar.a & 524288) != 0) {
                        c.kc(dgvVar.r);
                    }
                    if ((dgvVar.a & 1048576) != 0) {
                        c.y(dgvVar.u);
                    }
                    if ((dgvVar.a & 2097152) != 0) {
                        for (int i = 0; i < diu.a; i++) {
                            float b = dgvVar.v.b(i);
                            if (!esv.T(b)) {
                                c.x(YogaEdge.a(i), (int) b);
                            }
                        }
                    }
                    if ((dgvVar.a & 4194304) != 0) {
                        for (int i2 = 0; i2 < diu.a; i2++) {
                            float b2 = dgvVar.A.b(i2);
                            if (!esv.T(b2)) {
                                c.w(YogaEdge.a(i2), b2);
                            }
                        }
                    }
                    if ((dgvVar.a & 8388608) != 0) {
                        for (int i3 = 0; i3 < diu.a; i3++) {
                            float b3 = dgvVar.y.b(i3);
                            if (!esv.T(b3)) {
                                c.v(YogaEdge.a(i3), (int) b3);
                            }
                        }
                    }
                    if ((dgvVar.a & 16777216) != 0) {
                        for (int i4 = 0; i4 < diu.a; i4++) {
                            float b4 = dgvVar.z.b(i4);
                            if (!esv.T(b4)) {
                                c.u(YogaEdge.a(i4), b4);
                            }
                        }
                    }
                    if ((dgvVar.a & 33554432) != 0) {
                        for (int i5 = 0; i5 < diu.a; i5++) {
                            float b5 = dgvVar.w.b(i5);
                            if (!esv.T(b5)) {
                                c.l(YogaEdge.a(i5), (int) b5);
                            }
                        }
                    }
                    if ((dgvVar.a & 67108864) != 0) {
                        for (int i6 = 0; i6 < diu.a; i6++) {
                            float b6 = dgvVar.x.b(i6);
                            if (!esv.T(b6)) {
                                c.k(YogaEdge.a(i6), b6);
                            }
                        }
                    }
                }
                dgw dgwVar = dgxVar.b;
                if (dgwVar != null) {
                    if ((1 & dgwVar.a) != 0) {
                        c.bq(dgwVar.e);
                    }
                    if ((dgwVar.a & 2) != 0) {
                        c.bG();
                    }
                    if ((dgwVar.a & 4) != 0) {
                        c.bI();
                    }
                    if ((dgwVar.a & 1024) != 0) {
                        c.bF();
                    }
                    if ((dgwVar.a & 8) != 0) {
                        c.bD(dgwVar.b);
                    }
                    if ((dgwVar.a & 1073741824) != 0) {
                        c.bt(dgwVar.c);
                    }
                    if ((dgwVar.a & 16) != 0) {
                        c.bk(null);
                    }
                    if ((dgwVar.a & 32) != 0) {
                        c.bl(null);
                    }
                    if ((dgwVar.a & 64) != 0) {
                        c.br(dgwVar.d);
                    }
                    if ((dgwVar.a & 128) != 0) {
                        c.bB(null);
                    }
                    if ((dgwVar.a & 65536) != 0) {
                        c.bC(null);
                    }
                    if ((dgwVar.a & 512) != 0) {
                        c.bz(dgwVar.h, dgwVar.g);
                    }
                    if ((dgwVar.a & 131072) != 0) {
                        c.bA(dgwVar.k);
                    }
                    if ((dgwVar.a & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                        c.ax(dgwVar.i);
                    }
                    if ((dgwVar.a & 256) != 0) {
                        for (int i7 = 0; i7 < diu.a; i7++) {
                            float b7 = dgwVar.f.b(i7);
                            if (!esv.T(b7)) {
                                c.by(YogaEdge.a(i7), (int) b7);
                            }
                        }
                    }
                    if ((dgwVar.a & 8192) != 0) {
                        c.bh(dgwVar.j);
                    }
                    if ((dgwVar.a & 16384) != 0) {
                        c.bv();
                    }
                    if ((dgwVar.a & 32768) != 0) {
                        c.bw();
                    }
                }
            }
            c.az(dhaVar);
            k(dheVar2);
            if (dha.y(dhaVar)) {
                dhaVar.V(dheVar2);
            }
            List list = dhaVar.j;
            if (list != null && !list.isEmpty()) {
                c.ay(dhaVar.j);
            }
            return c;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r6 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.djr e(defpackage.dhe r12, defpackage.djr r13, int r14, int r15) {
        /*
            dha r0 = r13.W()
            djr r1 = r13.aj()
            if (r0 == 0) goto Lc7
            if (r1 == 0) goto L24
            int r2 = r1.e()
            int r3 = r1.d()
            float r6 = r1.b()
            float r7 = r1.a()
            r4 = r14
            r5 = r15
            boolean r2 = l(r2, r3, r4, r5, r6, r7)
            if (r2 != 0) goto Laf
        L24:
            djx r2 = r12.e()
            if (r2 == 0) goto Lb3
            djr r3 = r2.d(r0)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L64
            r2.j(r0)
            boolean r2 = r3.aV()
            if (r2 != 0) goto L48
            com.facebook.yoga.YogaDirection r2 = r3.L()
            com.facebook.yoga.YogaDirection r6 = r13.L()
            if (r2 != r6) goto L46
            goto L48
        L46:
            r2 = 0
            goto L49
        L48:
            r2 = 1
        L49:
            int r6 = r3.e()
            int r7 = r3.d()
            float r10 = r3.b()
            float r11 = r3.a()
            r8 = r14
            r9 = r15
            boolean r6 = l(r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L64
            if (r6 == 0) goto L64
            goto L65
        L64:
            r3 = r4
        L65:
            if (r3 == 0) goto L69
            r1 = r3
            goto Lac
        L69:
            if (r1 == 0) goto L73
            boolean r1 = defpackage.doa.h
            if (r1 == 0) goto L73
            int r1 = r12.h
            int r1 = r12.i
        L73:
            boolean r1 = defpackage.djt.a
            if (r1 != 0) goto L79
            r1 = r12
            goto L7d
        L79:
            dhe r1 = r12.c()
        L7d:
            amsj r2 = r13.bN()
            r1.m = r2
            r1.h = r14
            r1.i = r15
            djr r0 = d(r1, r0, r5, r5)
            r13.kd(r0)
            din r1 = r13.Z()
            h(r12, r0, r14, r15, r1)
            r0.ko(r14)
            r0.kl(r15)
            int r12 = r0.C()
            float r12 = (float) r12
            r0.km(r12)
            int r12 = r0.H()
            float r12 = (float) r12
            r0.kn(r12)
            r1 = r0
        Lac:
            r13.aI(r1)
        Laf:
            r1.aB()
            return r1
        Lb3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = r0.o()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = ": Trying to access the cached InternalNode for a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."
            java.lang.String r13 = r13.concat(r14)
            r12.<init>(r13)
            throw r12
        Lc7:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "A component is required to resolve a nested tree."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djt.e(dhe, djr, int, int):djr");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static djr f(dhe dheVar, dha dhaVar, int i, int i2, djr djrVar, din dinVar, dlg dlgVar) {
        djr am;
        djx djxVar;
        if (dlgVar != null) {
            dlgVar.b(djrVar == null ? "start_create_layout" : "start_reconcile_layout");
        }
        dheVar.h = i;
        dheVar.i = i2;
        if (djrVar == null) {
            am = c(dheVar, dhaVar, true);
            if (dheVar.l()) {
                if (dlgVar != null) {
                    dlgVar.b("end_create_layout");
                }
                return am;
            }
            djw djwVar = dheVar.k;
            if (djwVar != null && (djxVar = djwVar.a) != null) {
                djxVar.w = false;
            }
        } else {
            am = djrVar.am(dheVar, a(dheVar, dhaVar, true));
        }
        if (dlgVar != null) {
            dlgVar.b(djrVar != null ? "end_reconcile_layout" : "end_create_layout");
        }
        if (dlgVar != null) {
            dlgVar.b("start_measure");
        }
        h(dheVar, am, i, i2, dinVar);
        if (dlgVar != null) {
            dlgVar.b("end_measure");
        }
        return am;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void g(defpackage.djr r5, defpackage.din r6) {
        /*
            djr r0 = r5.al()     // Catch: java.lang.Throwable -> L69
            dha r1 = r5.W()     // Catch: java.lang.Throwable -> L69
            boolean r1 = defpackage.dha.x(r1)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L15
            if (r0 != 0) goto L11
            goto L15
        L11:
            r5.aG(r6)     // Catch: java.lang.Throwable -> L69
            return
        L15:
            if (r6 != 0) goto L18
            goto L68
        L18:
            dha r0 = r5.W()     // Catch: java.lang.Throwable -> L69
            dha r1 = r6.f()     // Catch: java.lang.Throwable -> L69
            boolean r0 = defpackage.did.z(r0, r1)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L68
            r5.aG(r6)     // Catch: java.lang.Throwable -> L69
            int r0 = r5.c()     // Catch: java.lang.Throwable -> L69
            int r1 = r6.c()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L48
            if (r1 == 0) goto L48
            r2 = 0
        L36:
            if (r2 >= r0) goto L68
            if (r2 >= r1) goto L68
            djr r3 = r5.g(r2)     // Catch: java.lang.Throwable -> L69
            din r4 = r6.g(r2)     // Catch: java.lang.Throwable -> L69
            g(r3, r4)     // Catch: java.lang.Throwable -> L69
            int r2 = r2 + 1
            goto L36
        L48:
            dha r0 = r5.W()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L68
            dha r1 = r6.f()     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.ah(r0, r1)     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L68
            dha r0 = r5.W()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L65
            dha r6 = r6.f()     // Catch: java.lang.Throwable -> L69
            r0.p(r6)     // Catch: java.lang.Throwable -> L69
        L65:
            r5.bu()     // Catch: java.lang.Throwable -> L69
        L68:
            return
        L69:
            r6 = move-exception
            dha r5 = r5.W()
            if (r5 == 0) goto L76
            dhv r0 = new dhv
            r0.<init>(r5, r6)
            throw r0
        L76:
            goto L78
        L77:
            throw r6
        L78:
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djt.g(djr, din):void");
    }

    static void h(dhe dheVar, djr djrVar, int i, int i2, din dinVar) {
        if (djrVar.an() == YogaDirection.INHERIT) {
            Context context = dheVar.b;
            if ((context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
                djrVar.kk(YogaDirection.RTL);
            }
        }
        if (esv.T(djrVar.O())) {
            djrVar.aK(i);
        }
        if (esv.T(djrVar.N())) {
            djrVar.aJ(i2);
        }
        if (dinVar != null) {
            g(djrVar, dinVar);
        }
        djrVar.aD(View.MeasureSpec.getMode(i) == 0 ? Float.NaN : View.MeasureSpec.getSize(i), View.MeasureSpec.getMode(i2) != 0 ? View.MeasureSpec.getSize(i2) : Float.NaN);
    }

    static void i(djr djrVar) {
        List aw = djrVar.aw();
        if (aw != null) {
            int size = aw.size();
            for (int i = 0; i < size; i++) {
                djrVar.bi((dha) aw.get(i));
            }
            djrVar.aw().clear();
        }
        int c = djrVar.c();
        for (int i2 = 0; i2 < c; i2++) {
            i(djrVar.g(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(dhe dheVar, djr djrVar, int i, int i2, din dinVar, dlg dlgVar) {
        if (djrVar == dhe.a) {
            return;
        }
        i(djrVar);
        if (dlgVar != null) {
            dlgVar.b("start_measure");
        }
        h(dheVar, djrVar, i, i2, dinVar);
        if (dlgVar != null) {
            dlgVar.b("end_measure");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(dhe dheVar) {
        ComponentTree componentTree;
        return (dheVar == null || (componentTree = dheVar.j) == null) ? did.s(null) : componentTree.c;
    }

    public static boolean l(int i, int i2, int i3, int i4, float f, float f2) {
        return did.x(i, i3, (int) f) && did.x(i2, i4, (int) f2);
    }

    static dha a(dhe dheVar, dha dhaVar, boolean z) {
        AtomicBoolean atomicBoolean = dhaVar.p;
        dha j = (atomicBoolean != null && atomicBoolean.getAndSet(true)) ? dhaVar.j() : dhaVar;
        if (z) {
            j.m = dhaVar.m;
        }
        amsj amsjVar = dheVar.m;
        j.au(amsjVar);
        j.t(dheVar);
        dhe dheVar2 = j.q;
        dheVar2.m = j.at(dheVar2, amsjVar);
        if (doa.a) {
            dib dibVar = (dib) dic.a.get(dic.k(dheVar2, j));
            if (dibVar != null) {
                dibVar.a();
                j.m();
                dibVar.c();
            }
        }
        return j;
    }
}
