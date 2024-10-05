package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpt {
    private static volatile Looper f;
    public volatile boolean a;
    public final dkf b;
    public dpi c;
    public dpi d;
    public doz e;
    private final dpj g;
    private final dpa h;
    private final dpf i;
    private final String j;
    private final boolean l;
    private final dpq m;
    private final dpq n;
    private boolean o;
    private int p;
    private final dpr q;
    private final List r;
    private final AtomicBoolean s;
    private final aoae v;
    private final Map k = new HashMap();
    private final amsj u = new amsj((byte[]) null, (byte[]) null, (char[]) null);
    private final dja t = new dja();

    public dpt(dpp dppVar) {
        dke dkeVar = new dke(Looper.getMainLooper());
        djg djgVar = did.l;
        this.b = dkeVar;
        aoae aoaeVar = new aoae((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.v = aoaeVar;
        this.a = false;
        String str = dppVar.c;
        this.j = str;
        dpa dpaVar = new dpa(dppVar.b, aoaeVar, str, null, null, null, null, null);
        this.h = dpaVar;
        this.l = ((dql) dpaVar.b).b;
        this.i = new dpf();
        dpj dpjVar = new dpj(dppVar.a);
        dpjVar.n = this;
        dpjVar.p = new dpu(this);
        this.g = dpjVar;
        this.r = new ArrayList();
        this.q = dpv.a();
        dke dkeVar2 = new dke(a());
        djg djgVar2 = did.l;
        this.n = new dpq(this, dkeVar2);
        this.m = new dpq(this, dkeVar);
        this.s = new AtomicBoolean(false);
    }

    public static synchronized Looper a() {
        Looper looper;
        synchronized (dpt.class) {
            if (f == null) {
                HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
                handlerThread.start();
                f = handlerThread.getLooper();
            }
            looper = f;
        }
        return looper;
    }

    public static dpi b(dpi dpiVar, boolean z) {
        if (dpiVar != null) {
            return dpiVar.a(z);
        }
        return null;
    }

    public static String c(dpt dptVar) {
        String sb;
        synchronized (dptVar) {
            boolean z = dptVar.a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("tag: ");
            sb2.append(dptVar.j);
            sb2.append(", currentSection.size: ");
            dpi dpiVar = dptVar.c;
            sb2.append(dpiVar != null ? Integer.valueOf(dpiVar.g) : null);
            sb2.append(", currentSection.name: ");
            dpi dpiVar2 = dptVar.c;
            sb2.append(dpiVar2 != null ? dpiVar2.e : null);
            sb2.append(", nextSection.size: ");
            dpi dpiVar3 = dptVar.d;
            sb2.append(dpiVar3 != null ? Integer.valueOf(dpiVar3.g) : null);
            sb2.append(", nextSection.name: ");
            dpi dpiVar4 = dptVar.d;
            sb2.append(dpiVar4 != null ? dpiVar4.e : null);
            sb2.append(", pendingChangeSets.size: ");
            sb2.append(dptVar.r.size());
            sb2.append(", pendingStateUpdates.size: ");
            sb2.append(dptVar.q.a.size());
            sb2.append(", pendingNonLazyStateUpdates.size: ");
            sb2.append(dptVar.q.b.size());
            sb2.append("\n");
            sb = sb2.toString();
        }
        return sb;
    }

    private final void n(dpi dpiVar) {
        this.u.x(dpiVar.c, dpiVar, dpiVar.i);
        if (dpiVar.g()) {
            return;
        }
        List list = dpiVar.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n((dpi) list.get(i));
        }
    }

    private final synchronized void o(dpi dpiVar) {
        List list = dpiVar.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o((dpi) list.get(i));
            }
        }
    }

    private final void p() {
        this.o = false;
        this.p = 0;
    }

    private final void q(dpi dpiVar) {
        dpj dpjVar = dpiVar.c;
        if (dpiVar.g()) {
            return;
        }
        List list = dpiVar.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q((dpi) list.get(i));
        }
    }

    private final synchronized boolean r(dpr dprVar) {
        return dprVar.b.equals(this.q.b);
    }

    private final synchronized void s(String str, dlp dlpVar) {
        if (this.c == null && this.d == null) {
            throw new IllegalStateException("State set with no attached Section");
        }
        dpr dprVar = this.q;
        dpr.b(str, dlpVar, dprVar.a);
        dpr.b(str, dlpVar, dprVar.b);
        if (this.o) {
            int i = this.p + 1;
            this.p = i;
            if (i == 50) {
                dhz.a(3, "SectionTree:StateUpdatesFromInsideChangeSetCalculateExceedsThreshold", "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
            }
        }
        dpi dpiVar = this.d;
        if (dpiVar == null) {
            this.d = b(this.c, false);
        } else {
            this.d = b(dpiVar, false);
        }
    }

    private final void t(dpi dpiVar, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        for (int i8 = 0; i8 < size; i8++) {
            dpd dpdVar = (dpd) list.get(i8);
            if (dpdVar.a() > 0) {
                int a = dpdVar.a();
                int i9 = 0;
                while (i9 < a) {
                    dpb b = dpdVar.b(i9);
                    int i10 = b.a;
                    if (i10 == 0) {
                        dpa dpaVar = this.h;
                        int i11 = b.b;
                        int i12 = b.c;
                        dpaVar.a();
                        dps dpsVar = dpaVar.b;
                        if (((dql) dpsVar).b) {
                            dsx dsxVar = ((dql) dpsVar).a;
                            dsxVar.u();
                            if (dth.a) {
                                dsxVar.hashCode();
                            }
                            dso dsoVar = new dso(i11, i12, null);
                            synchronized (dsxVar) {
                                dsxVar.z = true;
                                List list2 = dsxVar.c;
                                list2.add(i12, (dqx) list2.remove(i11));
                                dsxVar.r(dsoVar);
                            }
                        } else {
                            ((dql) dpsVar).a.D(i11, i12);
                        }
                        if (dpa.a) {
                            dpaVar.h.R(dpaVar.d, i11, i12, Thread.currentThread().getName());
                        }
                    } else if (i10 == 1) {
                        dpa dpaVar2 = this.h;
                        int i13 = b.b;
                        dte dteVar = b.e;
                        if (dpaVar2.e != 1 || i13 < (i = dpaVar2.f) || i13 > (i3 = i + (i2 = dpaVar2.g)) || i13 < i3) {
                            dpaVar2.a();
                            dpaVar2.f = i13;
                            dpaVar2.g = 1;
                            dpaVar2.e = 1;
                            dpaVar2.c.put(i13, dteVar);
                        } else {
                            dpaVar2.g = i2 + 1;
                            dpaVar2.f = Math.min(i13, i);
                            dpaVar2.c.put(i13, dteVar);
                        }
                    } else if (i10 != 2) {
                        dpa dpaVar3 = this.h;
                        int i14 = b.b;
                        if (dpaVar3.e != 3 || (i7 = dpaVar3.f) < i14 || i7 > i14 + 1) {
                            dpaVar3.a();
                            dpaVar3.f = i14;
                            dpaVar3.g = 1;
                            dpaVar3.e = 3;
                        } else {
                            dpaVar3.g++;
                            dpaVar3.f = i14;
                        }
                    } else {
                        dpa dpaVar4 = this.h;
                        int i15 = b.b;
                        dte dteVar2 = b.e;
                        if (dpaVar4.e != 2 || i15 > (i5 = dpaVar4.g + (i4 = dpaVar4.f)) || (i6 = i15 + 1) < i4) {
                            dpaVar4.a();
                            dpaVar4.f = i15;
                            dpaVar4.g = 1;
                            dpaVar4.e = 2;
                            dpaVar4.c.put(i15, dteVar2);
                        } else {
                            dpaVar4.f = Math.min(i15, i4);
                            dpaVar4.g = Math.max(i5, i6) - dpaVar4.f;
                            dpaVar4.c.put(i15, dteVar2);
                        }
                    }
                    i9++;
                    z = true;
                }
                this.h.a();
            }
            arrayList.addAll(dpdVar.a);
        }
        did didVar = new did(arrayList);
        dpa dpaVar5 = this.h;
        dpo dpoVar = new dpo(this, didVar, z, dpiVar, null, null);
        dps dpsVar2 = dpaVar5.b;
        if (((dql) dpsVar2).b) {
            dsx dsxVar2 = ((dql) dpsVar2).a;
            if (dth.a) {
                dsxVar2.hashCode();
            }
            dsxVar2.z = true;
            dsxVar2.u();
            dsxVar2.O(z, dpoVar);
            if (did.t()) {
                dsxVar2.s();
                if (z) {
                    if (dkl.b(null)) {
                        throw null;
                    }
                    dsxVar2.B();
                }
            } else if (dsxVar2.i.get()) {
                dnz.a.a(dsxVar2.p);
            }
            if (doa.a || doa.e) {
                dsxVar2.l.set(-1L);
                return;
            }
            return;
        }
        ((dql) dpsVar2).a.P(z, dpoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[Catch: all -> 0x0185, TryCatch #0 {, blocks: (B:7:0x0008, B:9:0x0010, B:10:0x0014, B:12:0x001a, B:14:0x001e, B:15:0x0029, B:17:0x0037, B:19:0x003d, B:21:0x004d, B:22:0x0051, B:23:0x0057, B:26:0x005c, B:29:0x0063, B:30:0x006a, B:32:0x007c, B:33:0x0084, B:36:0x008a, B:37:0x008d, B:39:0x0096, B:41:0x00a7, B:43:0x00b3, B:44:0x00bd, B:46:0x00c9, B:48:0x00d5, B:50:0x00db, B:51:0x00e2, B:53:0x00ea, B:54:0x00f8, B:56:0x011c, B:60:0x0139, B:62:0x0140, B:65:0x012f, B:66:0x00b8, B:68:0x0150, B:69:0x017d, B:71:0x017e, B:73:0x0182, B:76:0x0082), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: all -> 0x0185, TryCatch #0 {, blocks: (B:7:0x0008, B:9:0x0010, B:10:0x0014, B:12:0x001a, B:14:0x001e, B:15:0x0029, B:17:0x0037, B:19:0x003d, B:21:0x004d, B:22:0x0051, B:23:0x0057, B:26:0x005c, B:29:0x0063, B:30:0x006a, B:32:0x007c, B:33:0x0084, B:36:0x008a, B:37:0x008d, B:39:0x0096, B:41:0x00a7, B:43:0x00b3, B:44:0x00bd, B:46:0x00c9, B:48:0x00d5, B:50:0x00db, B:51:0x00e2, B:53:0x00ea, B:54:0x00f8, B:56:0x011c, B:60:0x0139, B:62:0x0140, B:65:0x012f, B:66:0x00b8, B:68:0x0150, B:69:0x017d, B:71:0x017e, B:73:0x0182, B:76:0x0082), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182 A[Catch: all -> 0x0185, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0008, B:9:0x0010, B:10:0x0014, B:12:0x001a, B:14:0x001e, B:15:0x0029, B:17:0x0037, B:19:0x003d, B:21:0x004d, B:22:0x0051, B:23:0x0057, B:26:0x005c, B:29:0x0063, B:30:0x006a, B:32:0x007c, B:33:0x0084, B:36:0x008a, B:37:0x008d, B:39:0x0096, B:41:0x00a7, B:43:0x00b3, B:44:0x00bd, B:46:0x00c9, B:48:0x00d5, B:50:0x00db, B:51:0x00e2, B:53:0x00ea, B:54:0x00f8, B:56:0x011c, B:60:0x0139, B:62:0x0140, B:65:0x012f, B:66:0x00b8, B:68:0x0150, B:69:0x017d, B:71:0x017e, B:73:0x0182, B:76:0x0082), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082 A[Catch: all -> 0x0185, TryCatch #0 {, blocks: (B:7:0x0008, B:9:0x0010, B:10:0x0014, B:12:0x001a, B:14:0x001e, B:15:0x0029, B:17:0x0037, B:19:0x003d, B:21:0x004d, B:22:0x0051, B:23:0x0057, B:26:0x005c, B:29:0x0063, B:30:0x006a, B:32:0x007c, B:33:0x0084, B:36:0x008a, B:37:0x008d, B:39:0x0096, B:41:0x00a7, B:43:0x00b3, B:44:0x00bd, B:46:0x00c9, B:48:0x00d5, B:50:0x00db, B:51:0x00e2, B:53:0x00ea, B:54:0x00f8, B:56:0x011c, B:60:0x0139, B:62:0x0140, B:65:0x012f, B:66:0x00b8, B:68:0x0150, B:69:0x017d, B:71:0x017e, B:73:0x0182, B:76:0x0082), top: B:6:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void v(defpackage.dpj r17, defpackage.dpi r18, defpackage.dpi r19, java.util.Map r20, defpackage.aoae r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpt.v(dpj, dpi, dpi, java.util.Map, aoae, java.lang.String):void");
    }

    public final void d(dpi dpiVar) {
        dpj dpjVar = dpiVar.c;
        if (dpiVar.g()) {
            return;
        }
        List list = dpiVar.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d((dpi) list.get(i));
        }
    }

    public final void e() {
        if (this.i.a != null) {
            dpg dpgVar = dpg.INITIAL_LOAD;
        }
    }

    public final void f(dpi dpiVar) {
        dpj dpjVar = dpiVar.c;
        if (dpiVar.g()) {
            return;
        }
        List list = dpiVar.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            f((dpi) list.get(i));
        }
    }

    public final void g(dpg dpgVar) {
        dpg dpgVar2 = dpg.INITIAL_LOAD;
        this.i.a = dpgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h(String str, dlp dlpVar, String str2) {
        this.m.b();
        s(str, dlpVar);
        this.m.c(2, str2);
        dqm.h.addAndGet(1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(String str, dlp dlpVar, String str2) {
        this.n.b();
        s(str, dlpVar);
        this.n.c(3, str2);
        dqm.i.addAndGet(1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.dpi r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r17 = this;
            r7 = r17
            r0 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            java.util.Map r1 = r7.k
            java.lang.String r2 = r0.i
            java.lang.Object r1 = r1.get(r2)
            axln r1 = (defpackage.axln) r1
            int r2 = r0.g
            if (r1 != 0) goto L29
            axln r1 = new axln
            r1.<init>()
            java.util.Map r3 = r7.k
            java.lang.String r4 = r0.i
            r3.put(r4, r1)
        L26:
            r12 = r23
            goto L43
        L29:
            int r3 = r1.e
            if (r3 != r8) goto L26
            int r3 = r1.a
            if (r3 != r9) goto L26
            int r3 = r1.d
            if (r3 != r10) goto L26
            int r3 = r1.b
            if (r3 != r11) goto L26
            int r3 = r1.c
            if (r3 != r2) goto L26
            r3 = 1
            r12 = r23
            if (r12 == r3) goto L43
            return
        L43:
            r1.a = r9
            r1.e = r8
            r1.d = r10
            r1.b = r11
            r1.c = r2
            dpj r1 = r0.c
            boolean r1 = r18.g()
            if (r1 != 0) goto Lad
            java.util.List r13 = r0.h
            int r14 = r13.size()
            r0 = 0
            r6 = 0
        L5d:
            if (r6 >= r14) goto Lad
            java.lang.Object r1 = r13.get(r6)
            dpi r1 = (defpackage.dpi) r1
            int r2 = r8 - r0
            int r3 = r9 - r0
            int r4 = r10 - r0
            int r5 = r11 - r0
            int r15 = r1.g
            r16 = -1
            if (r2 >= r15) goto L84
            if (r3 >= 0) goto L76
            goto L84
        L76:
            r15 = 0
            int r2 = java.lang.Math.max(r2, r15)
            int r15 = r1.g
            int r15 = r15 + (-1)
            int r3 = java.lang.Math.min(r3, r15)
            goto L86
        L84:
            r2 = -1
            r3 = -1
        L86:
            int r15 = r1.g
            if (r4 >= r15) goto L9b
            if (r5 >= 0) goto L8d
            goto L9b
        L8d:
            r15 = 0
            int r4 = java.lang.Math.max(r4, r15)
            int r15 = r1.g
            int r15 = r15 + (-1)
            int r5 = java.lang.Math.min(r5, r15)
            goto L9d
        L9b:
            r4 = -1
            r5 = -1
        L9d:
            int r15 = r1.g
            int r15 = r15 + r0
            r0 = r17
            r16 = r6
            r6 = r23
            r0.j(r1, r2, r3, r4, r5, r6)
            int r6 = r16 + 1
            r0 = r15
            goto L5d
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpt.j(dpi, int, int, int, int, int):void");
    }

    public final void k() {
        ArrayList arrayList;
        dpi dpiVar;
        if (!this.l) {
            synchronized (this) {
                arrayList = new ArrayList(this.r);
                this.r.clear();
                dpiVar = this.c;
            }
            t(dpiVar, arrayList);
            e();
            return;
        }
        throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
    }

    public final void l(int i, String str, dlv dlvVar) {
        dpi b;
        dpi b2;
        taz tazVar;
        dpr a;
        dlg Z;
        boolean z;
        taz tazVar2;
        dpe dpeVar;
        boolean z2;
        dpi b3;
        String str2;
        String str3 = str == null ? this.j : str;
        if (dth.a) {
            synchronized (this) {
                dpi dpiVar = this.d;
                str2 = dpiVar != null ? dpiVar.e : "<null>";
            }
            hashCode();
            esv.aa(i).length();
            str2.length();
        }
        try {
            synchronized (this) {
                b = b(this.c, true);
                b2 = b(this.d, false);
                tazVar = this.g.l;
                a = this.q.a();
                this.o = true;
            }
            Z = esv.Z(this.g, 15, b, b2);
            z = (tazVar == null || Z == null || !taz.c(Z)) ? false : true;
            if (Z != null) {
                Z.a("attribution", str3);
                Z.a("section_set_root_source", esv.aa(i));
                did.t();
            }
            this.t.a();
        } finally {
        }
        while (b2 != null) {
            dpj dpjVar = this.g;
            Map map = a.a;
            aoae aoaeVar = this.v;
            String str4 = this.j;
            b2.i = b2.j;
            taz tazVar3 = dpjVar.l;
            dlg Z2 = esv.Z(dpjVar, 11, b, b2);
            v(dpjVar, b, b2, map, aoaeVar, str4);
            if (tazVar3 != null && Z2 != null) {
                taz.d(Z2);
            }
            dpe dpeVar2 = new dpe();
            taz tazVar4 = dpjVar.l;
            dlg Z3 = esv.Z(dpjVar, 13, b, b2);
            if (b != null && !b.e.equals(b2.e)) {
                tazVar2 = tazVar4;
                dpeVar = dpeVar2;
                dpeVar.a = dpd.e(dpe.a(dpjVar, b, null, dpeVar2.b, aoaeVar, str4, "", "", Thread.currentThread().getName(), z), dpe.a(dpjVar, null, b2, dpeVar.b, aoaeVar, str4, "", "", Thread.currentThread().getName(), z));
            } else {
                tazVar2 = tazVar4;
                dpeVar = dpeVar2;
                dpeVar.a = dpe.a(dpjVar, b, b2, dpeVar.b, aoaeVar, str4, "", "", Thread.currentThread().getName(), z);
            }
            if (tazVar2 != null && Z3 != null) {
                dpeVar.a.a();
                dpd dpdVar = dpeVar.a;
                int i2 = dpdVar.d;
                dpc dpcVar = dpdVar.c;
                taz.d(Z3);
            }
            if ((b != null && b.g < 0) || b2.g < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Changet count is below 0! Current section: ");
                if (b == null) {
                    sb.append("null; ");
                } else {
                    String str5 = b.e;
                    String str6 = b.i;
                    int i3 = b.g;
                    int size = b.h.size();
                    StringBuilder sb2 = new StringBuilder(str5.length() + 54 + String.valueOf(str6).length());
                    sb2.append(str5);
                    sb2.append(" , key=");
                    sb2.append(str6);
                    sb2.append(", count=");
                    sb2.append(i3);
                    sb2.append(", childrenSize=");
                    sb2.append(size);
                    sb2.append("; ");
                    sb.append(sb2.toString());
                }
                sb.append("Next section: ");
                String str7 = b2.e;
                String str8 = b2.i;
                int i4 = b2.g;
                int size2 = b2.h.size();
                StringBuilder sb3 = new StringBuilder(str7.length() + 54 + String.valueOf(str8).length());
                sb3.append(str7);
                sb3.append(" , key=");
                sb3.append(str8);
                sb3.append(", count=");
                sb3.append(i4);
                sb3.append(", childrenSize=");
                sb3.append(size2);
                sb3.append("; ");
                sb.append(sb3.toString());
                sb.append("Changes: [");
                dpd dpdVar2 = dpeVar.a;
                for (int i5 = 0; i5 < dpdVar2.d; i5++) {
                    dpb b4 = dpdVar2.b(i5);
                    int i6 = b4.a;
                    int i7 = b4.b;
                    int i8 = b4.c;
                    StringBuilder sb4 = new StringBuilder(35);
                    sb4.append(i6);
                    sb4.append(" ");
                    sb4.append(i7);
                    sb4.append(" ");
                    sb4.append(i8);
                    sb.append(sb4.toString());
                    sb.append(", ");
                }
                sb.append("]");
                throw new IllegalStateException(sb.toString());
            }
            synchronized (this) {
                dpi dpiVar2 = this.c;
                boolean z3 = !(b == null || dpiVar2 == null || b.f != dpiVar2.f) || (b == null && dpiVar2 == null);
                dpi dpiVar3 = this.d;
                z2 = z3 && (dpiVar3 != null && b2.f == dpiVar3.f) && r(a);
                if (z2) {
                    dpi dpiVar4 = this.c;
                    this.c = b2;
                    this.d = null;
                    p();
                    dpr dprVar = this.q;
                    if (!a.a.isEmpty()) {
                        for (String str9 : a.a.keySet()) {
                            if (!dprVar.a.containsKey(str9)) {
                                break;
                            }
                            dpr.c(dprVar.a, a.a, str9);
                            dpr.c(dprVar.b, a.b, str9);
                        }
                    }
                    this.r.add(dpeVar.a);
                    if (dpiVar4 != null) {
                        q(dpiVar4);
                    }
                    o(b2);
                } else {
                    b2 = null;
                }
            }
            if (z2) {
                n(b2);
                List list = dpeVar.b;
                int size3 = list.size();
                for (int i9 = 0; i9 < size3; i9++) {
                }
                this.u.y();
                u(dlvVar);
            }
            synchronized (this) {
                dpv.b(a);
                b = b(this.c, true);
                b3 = b(this.d, false);
                if (b3 != null) {
                    dpr a2 = this.q.a();
                    this.o = true;
                    a = a2;
                } else {
                    p();
                }
            }
            b2 = b3;
            dqm.a();
            if (did.t()) {
                dqm.b();
            }
        }
        amsj amsjVar = this.g.m;
        if (dkl.b(amsjVar == null ? null : (dkl) amsjVar.v(dkl.class))) {
            throw null;
        }
        if (tazVar != null && Z != null) {
            taz.d(Z);
        }
    }

    public final void m(dpi dpiVar, boolean z, boolean z2, long j, did didVar, int i) {
        if (dpiVar.g()) {
            return;
        }
        dpj dpjVar = dpiVar.c;
        List list = dpiVar.h;
        int size = list.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            dpi dpiVar2 = (dpi) list.get(i3);
            m(dpiVar2, z, z2, j, didVar, i2);
            i2 += dpiVar2.g;
        }
    }

    private final void u(dlv dlvVar) {
        if (this.l) {
            synchronized (this) {
                t(this.c, this.r);
                this.r.clear();
            }
            if (!did.t()) {
                ((dke) this.b).post(new dpn(this, dlvVar));
                return;
            }
            e();
            return;
        }
        if (did.t()) {
            try {
                k();
                return;
            } catch (IndexOutOfBoundsException e) {
                String c = c(this);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 169 + String.valueOf(message).length());
                sb.append("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ");
                sb.append(c);
                sb.append(message);
                throw new RuntimeException(sb.toString(), e);
            }
        }
        dpm dpmVar = new dpm(this, dlvVar);
        if (this.s.compareAndSet(true, false)) {
            ((dke) this.b).postAtFrontOfQueue(dpmVar);
        } else {
            ((dke) this.b).post(dpmVar);
        }
    }
}
