package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azxo implements azxg, azvz, azxu {
    public final azvm c = azth.o(azxp.f);
    private final azvm a = azth.o(null);

    public static final azvy A(azzt azztVar) {
        while (azztVar.sr()) {
            azztVar = azztVar.i();
        }
        while (true) {
            azztVar = azztVar.h();
            if (!azztVar.sr()) {
                if (azztVar instanceof azvy) {
                    return (azvy) azztVar;
                }
                if (azztVar instanceof azxr) {
                    return null;
                }
            }
        }
    }

    private final azxr B(azxe azxeVar) {
        azxr sp = azxeVar.sp();
        if (sp != null) {
            return sp;
        }
        if (azxeVar instanceof azwx) {
            return new azxr();
        }
        if (azxeVar instanceof azxk) {
            E((azxk) azxeVar);
            return null;
        }
        throw new IllegalStateException(azul.a("State should have list: ", azxeVar).toString());
    }

    private final void C(azxe azxeVar, Object obj) {
        azwf azwfVar;
        azvx t = t();
        if (t != null) {
            t.d();
            v(azxs.a);
        }
        azwc azwcVar = obj instanceof azwc ? (azwc) obj : null;
        Throwable th = azwcVar == null ? null : azwcVar.b;
        if (azxeVar instanceof azxk) {
            try {
                ((azxk) azxeVar).b(th);
                return;
            } catch (Throwable th2) {
                c(new azwf("Exception in completion handler " + azxeVar + " for " + this, th2));
                return;
            }
        }
        azxr sp = azxeVar.sp();
        if (sp == null) {
            return;
        }
        azwf azwfVar2 = null;
        for (azzt azztVar = (azzt) sp.g(); !azul.c(azztVar, sp); azztVar = azztVar.h()) {
            if (azztVar instanceof azxk) {
                azxk azxkVar = (azxk) azztVar;
                try {
                    azxkVar.b(th);
                } catch (Throwable th3) {
                    if (azwfVar2 == null) {
                        azwfVar = null;
                    } else {
                        aynu.g(azwfVar2, th3);
                        azwfVar = azwfVar2;
                    }
                    if (azwfVar == null) {
                        azwfVar2 = new azwf("Exception in completion handler " + azxkVar + " for " + this, th3);
                    }
                }
            }
        }
        if (azwfVar2 != null) {
            c(azwfVar2);
        }
    }

    private final void D(azxr azxrVar, Throwable th) {
        azwf azwfVar;
        azwf azwfVar2 = null;
        for (azzt azztVar = (azzt) azxrVar.g(); !azul.c(azztVar, azxrVar); azztVar = azztVar.h()) {
            if (azztVar instanceof azxi) {
                azxk azxkVar = (azxk) azztVar;
                try {
                    azxkVar.b(th);
                } catch (Throwable th2) {
                    if (azwfVar2 == null) {
                        azwfVar = null;
                    } else {
                        aynu.g(azwfVar2, th2);
                        azwfVar = azwfVar2;
                    }
                    if (azwfVar == null) {
                        azwfVar2 = new azwf("Exception in completion handler " + azxkVar + " for " + this, th2);
                    }
                }
            }
        }
        if (azwfVar2 != null) {
            c(azwfVar2);
        }
        G(th);
    }

    private final void E(azxk azxkVar) {
        azxr azxrVar = new azxr();
        azxrVar.d.b(azxkVar);
        azxrVar.c.b(azxkVar);
        while (true) {
            if (azxkVar.g() != azxkVar) {
                break;
            } else if (azxkVar.c.c(azxkVar, azxrVar)) {
                azxrVar.k(azxkVar);
                break;
            }
        }
        this.c.c(azxkVar, azxkVar.h());
    }

    private final boolean F(Object obj, azxr azxrVar, azxk azxkVar) {
        int f;
        azxn azxnVar = new azxn(azxkVar, this, obj);
        do {
            f = azxrVar.i().f(azxkVar, azxrVar, azxnVar);
            if (f == 1) {
                return true;
            }
        } while (f != 2);
        return false;
    }

    private final boolean G(Throwable th) {
        z();
        boolean z = th instanceof CancellationException;
        azvx t = t();
        return (t == null || t == azxs.a) ? z : t.c(th) || z;
    }

    private static final Throwable H(Object obj) {
        return obj instanceof Throwable ? (Throwable) obj : ((azxu) obj).r();
    }

    private static final String I(Object obj) {
        if (!(obj instanceof azxm)) {
            return obj instanceof azxe ? ((azxe) obj).sq() ? "Active" : "New" : obj instanceof azwc ? "Cancelled" : "Completed";
        }
        azxm azxmVar = (azxm) obj;
        return azxmVar.g() ? "Cancelling" : azxmVar.h() ? "Completing" : "Active";
    }

    protected String a() {
        return "Job was cancelled";
    }

    public String b() {
        return azth.g(this);
    }

    public void c(Throwable th) {
        throw th;
    }

    protected void d(Object obj) {
    }

    @Override // defpackage.azvz
    public final void f(azxu azxuVar) {
        w(azxuVar);
    }

    @Override // defpackage.azsv
    public final Object fold(Object obj, azty aztyVar) {
        return azth.a(this, obj, aztyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
    }

    @Override // defpackage.azss, defpackage.azsv
    public final azss get(azst azstVar) {
        azstVar.getClass();
        return azth.b(this, azstVar);
    }

    @Override // defpackage.azss
    public final azst getKey() {
        return azxg.b;
    }

    @Override // defpackage.azxg
    public final CancellationException h() {
        Object p = p();
        if (p instanceof azxm) {
            Throwable d = ((azxm) p).d();
            if (d != null) {
                return s(d, azul.a(azth.g(this), " is cancelling"));
            }
            throw new IllegalStateException(azul.a("Job is still new or active: ", this).toString());
        }
        if (p instanceof azxe) {
            throw new IllegalStateException(azul.a("Job is still new or active: ", this).toString());
        }
        if (p instanceof azwc) {
            return s(((azwc) p).b, null);
        }
        return new azxh(azul.a(azth.g(this), " has completed normally"), null, this);
    }

    @Override // defpackage.azxg
    public final azvx i(azvz azvzVar) {
        return (azvx) azuj.g(this, true, new azvy(azvzVar), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [aztu] */
    /* JADX WARN: Type inference failed for: r5v3, types: [azxd] */
    @Override // defpackage.azxg
    public final azww j(boolean z, boolean z2, aztu aztuVar) {
        azxi azxiVar;
        Throwable th;
        if (z) {
            azxiVar = aztuVar instanceof azxi ? (azxi) aztuVar : null;
            if (azxiVar == null) {
                azxiVar = new azxf(aztuVar);
            }
        } else {
            boolean z3 = azwq.a;
            azxiVar = aztuVar;
        }
        azxi azxiVar2 = azxiVar;
        azxiVar2.b = this;
        while (true) {
            Object p = p();
            if (p instanceof azwx) {
                azwx azwxVar = (azwx) p;
                if (azwxVar.a) {
                    if (this.c.c(p, azxiVar)) {
                        return azxiVar;
                    }
                } else {
                    azxr azxrVar = new azxr();
                    if (!azwxVar.a) {
                        azxrVar = new azxd(azxrVar);
                    }
                    this.c.c(azwxVar, azxrVar);
                }
            } else {
                if (!(p instanceof azxe)) {
                    if (z2) {
                        azwc azwcVar = p instanceof azwc ? (azwc) p : null;
                        aztuVar.a(azwcVar != null ? azwcVar.b : null);
                    }
                    return azxs.a;
                }
                azxr sp = ((azxe) p).sp();
                if (sp != null) {
                    azww azwwVar = azxs.a;
                    if (z && (p instanceof azxm)) {
                        synchronized (p) {
                            azxm azxmVar = (azxm) p;
                            th = azxmVar.d();
                            if (th == null || ((aztuVar instanceof azvy) && !azxmVar.h())) {
                                if (F(p, sp, azxiVar)) {
                                    if (th == null) {
                                        return azxiVar;
                                    }
                                    azwwVar = azxiVar;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th == null) {
                        if (F(p, sp, azxiVar2)) {
                            return azxiVar;
                        }
                    } else {
                        if (z2) {
                            aztuVar.a(th);
                        }
                        return azwwVar;
                    }
                } else if (p != null) {
                    E((azxk) p);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                }
            }
        }
    }

    @Override // defpackage.azxg
    public final void k(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new azxh(a(), null, this);
        }
        w(cancellationException);
    }

    @Override // defpackage.azxg
    public final boolean l() {
        Object p = p();
        return (p instanceof azxe) && ((azxe) p).sq();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if (r5.c.c(r0, ((defpackage.azxd) r0).a) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r5.c.c(r0, defpackage.azxp.f) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        r2 = 1;
     */
    @Override // defpackage.azxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.p()
            boolean r1 = r0 instanceof defpackage.azwx
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            r1 = r0
            azwx r1 = (defpackage.azwx) r1
            boolean r1 = r1.a
            if (r1 == 0) goto L13
            goto L32
        L13:
            azvm r1 = r5.c
            azwx r3 = defpackage.azxp.f
            boolean r0 = r1.c(r0, r3)
            if (r0 != 0) goto L30
            goto L33
        L1e:
            boolean r1 = r0 instanceof defpackage.azxd
            if (r1 == 0) goto L32
            azvm r1 = r5.c
            r3 = r0
            azxd r3 = (defpackage.azxd) r3
            azxr r3 = r3.a
            boolean r0 = r1.c(r0, r3)
            if (r0 != 0) goto L30
            goto L33
        L30:
            r2 = 1
            goto L33
        L32:
            r2 = 0
        L33:
            if (r2 == 0) goto L38
            if (r2 == r4) goto L38
            goto L0
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxo.m():void");
    }

    @Override // defpackage.azsv
    public final azsv minusKey(azst azstVar) {
        azstVar.getClass();
        return azth.c(this, azstVar);
    }

    public boolean n() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4 A[Catch: all -> 0x013e, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001c, B:11:0x0034, B:13:0x003b, B:15:0x0040, B:17:0x0046, B:18:0x0049, B:20:0x0055, B:22:0x005b, B:25:0x00ac, B:28:0x00b3, B:31:0x00ca, B:32:0x00ce, B:34:0x00d4, B:36:0x00de, B:41:0x00e6, B:44:0x00ea, B:47:0x00f0, B:55:0x00c6, B:72:0x0066, B:73:0x006a, B:75:0x0070, B:79:0x007e, B:81:0x0082, B:83:0x008c, B:84:0x0090, B:86:0x0096, B:89:0x009f, B:93:0x00a4, B:104:0x0021, B:106:0x0025, B:107:0x002e, B:109:0x0032, B:110:0x012e, B:111:0x013d), top: B:7:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6 A[Catch: all -> 0x013e, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001c, B:11:0x0034, B:13:0x003b, B:15:0x0040, B:17:0x0046, B:18:0x0049, B:20:0x0055, B:22:0x005b, B:25:0x00ac, B:28:0x00b3, B:31:0x00ca, B:32:0x00ce, B:34:0x00d4, B:36:0x00de, B:41:0x00e6, B:44:0x00ea, B:47:0x00f0, B:55:0x00c6, B:72:0x0066, B:73:0x006a, B:75:0x0070, B:79:0x007e, B:81:0x0082, B:83:0x008c, B:84:0x0090, B:86:0x0096, B:89:0x009f, B:93:0x00a4, B:104:0x0021, B:106:0x0025, B:107:0x002e, B:109:0x0032, B:110:0x012e, B:111:0x013d), top: B:7:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.azxm r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxo.o(azxm, java.lang.Object):java.lang.Object");
    }

    public final Object p() {
        azvm azvmVar = this.c;
        while (true) {
            Object obj = azvmVar.a;
            if (!(obj instanceof azzy)) {
                return obj;
            }
            ((azzy) obj).c(this);
        }
    }

    @Override // defpackage.azsv
    public final azsv plus(azsv azsvVar) {
        azsvVar.getClass();
        return azth.d(this, azsvVar);
    }

    public final Object q(Object obj, Object obj2) {
        if (!(obj instanceof azxe)) {
            return azxp.a;
        }
        if ((!(obj instanceof azwx) && !(obj instanceof azxk)) || (obj instanceof azvy) || (obj2 instanceof azwc)) {
            azxe azxeVar = (azxe) obj;
            azxr B = B(azxeVar);
            if (B == null) {
                return azxp.c;
            }
            azvy azvyVar = null;
            azxm azxmVar = azxeVar instanceof azxm ? (azxm) azxeVar : null;
            if (azxmVar == null) {
                azxmVar = new azxm(B, null);
            }
            synchronized (azxmVar) {
                if (azxmVar.h()) {
                    return azxp.a;
                }
                azxmVar.b.c();
                if (azxmVar != azxeVar && !this.c.c(azxeVar, azxmVar)) {
                    return azxp.c;
                }
                boolean z = azwq.a;
                boolean g = azxmVar.g();
                azwc azwcVar = obj2 instanceof azwc ? (azwc) obj2 : null;
                if (azwcVar != null) {
                    azxmVar.e(azwcVar.b);
                }
                Throwable d = azxmVar.d();
                if (true == g) {
                    d = null;
                }
                if (d != null) {
                    D(B, d);
                }
                azvy azvyVar2 = azxeVar instanceof azvy ? (azvy) azxeVar : null;
                if (azvyVar2 == null) {
                    azxr sp = azxeVar.sp();
                    if (sp != null) {
                        azvyVar = A(sp);
                    }
                } else {
                    azvyVar = azvyVar2;
                }
                return (azvyVar == null || !y(azxmVar, azvyVar, obj2)) ? o(azxmVar, obj2) : azxp.b;
            }
        }
        azxe azxeVar2 = (azxe) obj;
        boolean z2 = azwq.a;
        if (!this.c.c(azxeVar2, azxp.a(obj2))) {
            return azxp.c;
        }
        d(obj2);
        C(azxeVar2, obj2);
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    @Override // defpackage.azxu
    public final CancellationException r() {
        CancellationException cancellationException;
        Object p = p();
        if (p instanceof azxm) {
            cancellationException = ((azxm) p).d();
        } else if (p instanceof azwc) {
            cancellationException = ((azwc) p).b;
        } else {
            if (p instanceof azxe) {
                throw new IllegalStateException(azul.a("Cannot be cancelling child in this state: ", p).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new azxh(azul.a("Parent job is ", I(p)), cancellationException, this) : cancellationException2;
    }

    protected final CancellationException s(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = a();
            }
            cancellationException = new azxh(str, th, this);
        }
        return cancellationException;
    }

    public boolean sn() {
        return true;
    }

    public final azvx t() {
        return (azvx) this.a.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b() + '{' + I(p()) + '}');
        sb.append('@');
        sb.append(azth.h(this));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(azxg azxgVar) {
        boolean z = azwq.a;
        if (azxgVar == null) {
            v(azxs.a);
            return;
        }
        azxgVar.m();
        azvx i = azxgVar.i(this);
        v(i);
        if (p() instanceof azxe) {
            return;
        }
        i.d();
        v(azxs.a);
    }

    public final void v(azvx azvxVar) {
        azvm azvmVar = this.a;
        int i = azvn.a;
        azvmVar.a = azvxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r0 = defpackage.azxp.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r0 == defpackage.azxp.b) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        r0 = q(r0, new defpackage.azwc(H(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 == defpackage.azxp.c) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != defpackage.azxp.a) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r3 = p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r3 instanceof defpackage.azxm) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if ((r3 instanceof defpackage.azxe) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        r1 = H(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r4 = (defpackage.azxe) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (n() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r4.sq() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        r4 = q(r3, new defpackage.azwc(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r4 == defpackage.azxp.a) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (r4 != defpackage.azxp.c) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r0 = p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.azul.a("Cannot happen in ", r3).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        r3 = defpackage.azwq.a;
        r3 = B(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (r7.c.c(r4, new defpackage.azxm(r3, r1)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if ((r0 instanceof defpackage.azxe) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        D(r3, r1);
        r0 = defpackage.azxp.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
    
        r0 = defpackage.azxp.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0047, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        r4 = (defpackage.azxm) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0051, code lost:
    
        if (r4.c() != defpackage.azxp.e) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0053, code lost:
    
        r0 = defpackage.azxp.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0055, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0058, code lost:
    
        r5 = r4.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005e, code lost:
    
        r1 = H(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0062, code lost:
    
        r4.e(r1);
        r8 = r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0069, code lost:
    
        if (true != r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006c, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006d, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006e, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if ((r0 instanceof defpackage.azxm) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0070, code lost:
    
        D(((defpackage.azxm) r3).a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0077, code lost:
    
        r0 = defpackage.azxp.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d5, code lost:
    
        if (r0 != defpackage.azxp.a) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00da, code lost:
    
        if (r0 != defpackage.azxp.b) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00df, code lost:
    
        if (r0 != defpackage.azxp.d) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e3, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (((defpackage.azxm) r0).h() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxo.w(java.lang.Object):boolean");
    }

    protected boolean x(Throwable th) {
        return false;
    }

    public final boolean y(azxm azxmVar, azvy azvyVar, Object obj) {
        while (azuj.g(azvyVar.a, false, new azxl(this, azxmVar, azvyVar, obj), 1) == azxs.a) {
            azvyVar = A(azvyVar);
            if (azvyVar == null) {
                return false;
            }
        }
        return true;
    }

    protected void z() {
    }
}
