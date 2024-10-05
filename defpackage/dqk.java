package defpackage;

import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dqk {
    public static final dqa b = new dqa(1, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, dpz.a, dpz.e, null, null, null);
    public static final vz a = new ub((byte[]) null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(dqr dqrVar) {
        dqrVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(dhe dheVar, dpt dptVar) {
        dpi dpiVar;
        int i = dqg.M;
        dha dhaVar = dheVar.f;
        if (dhaVar != null) {
        }
        synchronized (dptVar) {
            boolean z = dptVar.a;
            dpiVar = dptVar.c;
        }
        if (dpiVar == null) {
            return;
        }
        dptVar.f(dpiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dha c(dhe dheVar, dpi dpiVar, dha dhaVar, dha dhaVar2, dha dhaVar3, List list, boolean z, boolean z2, boolean z3, vz vzVar, int i, int i2, int i3, int i4, int i5, ajzj ajzjVar, wh whVar, boolean z4, dqa dqaVar, dsz dszVar, drm drmVar, dqi dqiVar, dqr dqrVar, dpt dptVar, wg wgVar) {
        int i6 = dqg.M;
        if (dheVar.f != null) {
            dlp dlpVar = new dlp(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, true);
            ComponentTree componentTree = dheVar.j;
            if (componentTree != null) {
                String str = dheVar.f.m;
                synchronized (componentTree) {
                    if (componentTree.s != null) {
                        componentTree.w.m(str, dlpVar, true);
                    }
                }
            }
        }
        synchronized (dptVar) {
            boolean z5 = dptVar.a;
            dpi dpiVar2 = dptVar.c;
            if (dpiVar2 == null || dpiVar2.f != dpiVar.f) {
                dpi dpiVar3 = dptVar.d;
                if (dpiVar3 == null || dpiVar3.f != dpiVar.f) {
                    dptVar.d = dpt.b(dpiVar, false);
                    dptVar.l(0, null, null);
                }
            }
        }
        boolean z6 = dqiVar == dqi.ERROR && dhaVar3 == null;
        if ((dqiVar == dqi.EMPTY && dhaVar2 == null) || z6) {
            return null;
        }
        boolean z7 = (dqaVar.a == 0 || z4) ? false : true;
        dru druVar = new dru();
        dru.c(druVar, dheVar, new drw());
        drw drwVar = druVar.a;
        drwVar.d = z;
        drwVar.w = i2;
        drwVar.H = i3;
        drwVar.f186J = i4;
        drwVar.b = i5;
        druVar.s(z2);
        drw drwVar2 = druVar.a;
        drwVar2.x = z3;
        drwVar2.I = 0;
        drwVar2.D = -1;
        drwVar2.A = i;
        drwVar2.C = dszVar;
        diy H = !z7 ? null : dqg.H(dqg.class, dheVar, -1873243140, new Object[]{dheVar, dptVar});
        drw drwVar3 = druVar.a;
        drwVar3.E = H;
        drwVar3.B = z7;
        drwVar3.O = null;
        drwVar3.g = false;
        drwVar3.K = false;
        drwVar3.f = druVar.b.a(0.0f);
        dqj dqjVar = new dqj(drmVar);
        if (druVar.a.z == Collections.EMPTY_LIST) {
            druVar.a.z = new ArrayList();
        }
        druVar.a.z.add(dqjVar);
        if (list != null) {
            if (druVar.a.z.isEmpty()) {
                druVar.a.z = list;
            } else {
                druVar.a.z.addAll(list);
            }
        }
        drw drwVar4 = druVar.a;
        drwVar4.F = null;
        drwVar4.G = -12425294;
        drwVar4.N = wgVar;
        drwVar4.M = ajzjVar;
        drwVar4.y = whVar;
        drwVar4.a = dqrVar;
        druVar.d.set(0);
        vz vzVar2 = vzVar;
        if (a == vzVar2) {
            vzVar2 = new ub((byte[]) null);
        }
        druVar.a.v = vzVar2;
        druVar.H(0.0f);
        druVar.Q(null);
        if (!dqrVar.f()) {
            dqd dqdVar = dqaVar.c;
            druVar.O(YogaPositionType.ABSOLUTE);
            druVar.N(YogaEdge.ALL, 0);
        }
        dgt a2 = dgu.a(dheVar);
        a2.H(0.0f);
        a2.d(YogaAlign.FLEX_START);
        a2.l(druVar);
        if (dqiVar == dqi.LOADING && dhaVar != null) {
            dnc a3 = dnd.a(dheVar);
            a3.e(dhaVar);
            a3.H(0.0f);
            a3.O(YogaPositionType.ABSOLUTE);
            a3.N(YogaEdge.ALL, 0);
            a2.l(a3);
        } else if (dqiVar == dqi.EMPTY) {
            dnc a4 = dnd.a(dheVar);
            a4.e(dhaVar2);
            a4.H(0.0f);
            a4.O(YogaPositionType.ABSOLUTE);
            a4.N(YogaEdge.ALL, 0);
            a2.l(a4);
        } else if (dqiVar == dqi.ERROR) {
            dnc a5 = dnd.a(dheVar);
            a5.e(dhaVar3);
            a5.H(0.0f);
            a5.O(YogaPositionType.ABSOLUTE);
            a5.N(YogaEdge.ALL, 0);
            a2.l(a5);
        }
        return a2.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(baql baqlVar, dqi dqiVar) {
        baqlVar.a = dqiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.dhe r9, defpackage.baql r10, defpackage.baql r11, defpackage.baql r12, defpackage.baql r13, defpackage.baql r14, defpackage.baql r15, defpackage.baql r16, defpackage.dpi r17, defpackage.dqa r18, defpackage.dsz r19, boolean r20, boolean r21) {
        /*
            r0 = r9
            r1 = r18
            dqd r2 = r1.c
            esv r3 = r1.f
            android.content.Context r3 = r0.b
            int r3 = r1.a
            drm r4 = new drm
            r4.<init>(r3)
            r3 = r16
            r3.a = r4
            dss r3 = new dss
            r3.<init>()
            r3.r = r4
            float r4 = r2.a
            r3.b = r4
            r4 = 0
            r3.g = r4
            dkb r5 = r2.i
            r3.s = r5
            boolean r5 = r2.c
            r3.d = r5
            boolean r5 = r2.h
            r3.q = r5
            r5 = r21
            r3.h = r5
            boolean r5 = r2.b
            r3.j = r5
            boolean r5 = r2.e
            r3.l = r5
            boolean r5 = r2.f
            r3.m = r5
            int r5 = r2.g
            dsx r3 = r3.a(r9)
            dql r5 = new dql
            boolean r2 = r2.d
            r5.<init>(r3, r2)
            dpj r2 = new dpj
            r2.<init>(r9)
            r3 = r13
            r3.a = r5
            int r3 = r1.b
            int r6 = r1.d
            int r7 = r1.e
            r8 = -1
            if (r3 == r8) goto L79
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r7) goto L67
            switch(r3) {
                case 2147483645: goto L73;
                case 2147483646: goto L6d;
                default: goto L64;
            }
        L64:
            r6 = r10
            r3 = r4
            goto L7f
        L67:
            vq r3 = new vq
            r3.<init>()
            goto L7e
        L6d:
            vb r3 = new vb
            r3.<init>()
            goto L7e
        L73:
            dqy r3 = new dqy
            r3.<init>(r6)
            goto L7e
        L79:
            dtk r3 = new dtk
            r3.<init>(r7)
        L7e:
            r6 = r10
        L7f:
            r6.a = r3
            dpp r3 = new dpp
            r3.<init>(r2, r5)
            r2 = r17
            java.lang.String r2 = r2.e
            r3.c = r2
            dpt r2 = new dpt
            r2.<init>(r3)
            r3 = r11
            r3.a = r2
            if (r19 == 0) goto L99
            r3 = r19
            goto L9e
        L99:
            dsz r3 = new dsz
            r3.<init>(r4)
        L9e:
            int r1 = r1.b
            r3.b = r1
            r1 = r15
            r1.a = r3
            doz r1 = new doz
            r1.<init>(r9, r3)
            r0 = r12
            r0.a = r1
            r2.e = r1
            dqh r0 = new dqh
            r0.<init>(r2)
            dsx r1 = r5.a
            duj r1 = r1.D
            r1.a(r0)
            dsx r0 = r5.a
            r1 = r20
            r0.q = r1
            dqi r0 = defpackage.dqi.LOADING
            r1 = r14
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqk.e(dhe, baql, baql, baql, baql, baql, baql, baql, dpi, dqa, dsz, boolean, boolean):void");
    }
}
