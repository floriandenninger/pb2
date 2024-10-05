package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class epb implements eoa {
    public final Handler a;
    private final aaea d;
    private final azrw f;
    private final shf g;
    private final axpg h;
    private final aadw j;
    public epz c = epz.UNKNOWN;
    public final Runnable b = new Runnable() { // from class: eoz
        @Override // java.lang.Runnable
        public final void run() {
            epb epbVar = epb.this;
            epbVar.a.removeCallbacks(epbVar.b);
            epbVar.h();
        }
    };
    private enz i = enz.DISABLED;
    private final azrs e = azrh.aN(enz.DISABLED).aT();

    public epb(azrw azrwVar, aaea aaeaVar, aadw aadwVar, final axpg axpgVar, final axpg axpgVar2, Handler handler, final ayqi ayqiVar, Executor executor, shf shfVar) {
        this.f = azrwVar;
        this.d = aaeaVar;
        this.j = aadwVar;
        this.h = axpgVar;
        this.a = handler;
        this.g = shfVar;
        if (evr.az(aadwVar)) {
            executor.execute(new Runnable() { // from class: epa
                @Override // java.lang.Runnable
                public final void run() {
                    epb.this.i(axpgVar, axpgVar2, ayqiVar);
                }
            });
        } else {
            azrwVar.get();
            i(axpgVar, axpgVar2, ayqiVar);
        }
    }

    private final bajg l(bajg bajgVar, boolean z) {
        int i;
        if (z) {
            i = ((eow) this.h.get()).b().d;
        } else {
            i = ((eow) this.h.get()).b().e;
        }
        bajg j = bajgVar.b(i - bajgVar.b.o().a(bajgVar.a)).j();
        return j.a > bajk.b(bajgVar) ? j : j.i();
    }

    private final void m(apky apkyVar, apkz apkzVar) {
        arfd a = this.d.a();
        if (a != null) {
            aswb aswbVar = a.e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.ac) {
                apla a2 = aplb.a();
                a2.copyOnWrite();
                ((aplb) a2.instance).e(apkyVar);
                a2.copyOnWrite();
                ((aplb) a2.instance).f(apkzVar);
                aplb aplbVar = (aplb) a2.build();
                acpl acplVar = (acpl) this.f.get();
                arpn a3 = arpp.a();
                a3.copyOnWrite();
                ((arpp) a3.instance).cf(aplbVar);
                acplVar.c((arpp) a3.build());
            }
        }
    }

    private final boolean n(bajg bajgVar) {
        int i = ((eow) this.h.get()).b().d;
        int i2 = ((eow) this.h.get()).b().e;
        int a = bajj.t.a(bajgVar.b).a(bajgVar.a);
        return i < i2 ? a >= i && a < i2 : a >= i || a < i2;
    }

    private final boolean o() {
        return ((eow) this.h.get()).l() && this.c == epz.IN_BEDTIME;
    }

    @Override // defpackage.eoa
    public final enz a() {
        return this.i;
    }

    @Override // defpackage.eoa
    public final aypy b() {
        return this.e.B();
    }

    @Override // defpackage.eoa
    public final void c(apkz apkzVar) {
        boolean k;
        if (o()) {
            k = k(enz.SYSTEM_DISMISSED);
        } else {
            k = k(enz.DISMISSED);
        }
        if (k) {
            m(apky.BEDTIME_REMINDER_EVENT_TYPE_DISMISS, apkzVar);
        }
    }

    @Override // defpackage.eoa
    public final void d(apkz apkzVar) {
        m(apky.BEDTIME_REMINDER_EVENT_TYPE_IMPRESSION, apkzVar);
    }

    @Override // defpackage.eoa
    public final void e(apkz apkzVar) {
        if (k(enz.SNOOZED)) {
            m(apky.BEDTIME_REMINDER_EVENT_TYPE_SNOOZE, apkzVar);
        }
    }

    @Override // defpackage.eoa
    public final void f() {
        if (o()) {
            k(enz.SYSTEM_ACTIVE);
            return;
        }
        if (!((eow) this.h.get()).l() || o()) {
            if (n(new bajg(this.g.c()))) {
                k(enz.ACTIVE);
                return;
            } else {
                k(enz.INACTIVE);
                return;
            }
        }
        k(enz.SYSTEM_INACTIVE);
    }

    @Override // defpackage.eoa
    public final boolean g() {
        return this.i.equals(enz.ON_HOLD) || this.i.equals(enz.ACTIVE) || this.i.equals(enz.SYSTEM_ACTIVE) || this.i.equals(enz.SYSTEM_ON_HOLD);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r7 = this;
            axpg r0 = r7.h
            java.lang.Object r0 = r0.get()
            eow r0 = (defpackage.eow) r0
            boolean r0 = r0.l()
            if (r0 == 0) goto L16
            epz r0 = r7.c
            epz r1 = defpackage.epz.UNKNOWN
            if (r0 == r1) goto L15
            goto L16
        L15:
            return
        L16:
            boolean r0 = r7.j()
            if (r0 != 0) goto L20
            enz r0 = defpackage.enz.DISABLED
            goto L95
        L20:
            axpg r0 = r7.h
            java.lang.Object r0 = r0.get()
            eow r0 = (defpackage.eow) r0
            bajg r1 = new bajg
            shf r2 = r7.g
            long r2 = r2.c()
            r1.<init>(r2)
            boolean r2 = r0.l()
            if (r2 == 0) goto L42
            boolean r2 = r7.o()
            if (r2 != 0) goto L4b
            enz r0 = defpackage.enz.SYSTEM_INACTIVE
            goto L95
        L42:
            boolean r2 = r7.n(r1)
            if (r2 != 0) goto L4b
            enz r0 = defpackage.enz.INACTIVE
            goto L95
        L4b:
            eok r2 = r0.b()
            int r2 = r2.b
            r2 = r2 & 16
            if (r2 == 0) goto L78
            eok r2 = r0.b()
            boolean r2 = r2.h
            eok r3 = r0.b()
            long r3 = r3.g
            long r5 = r1.a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 >= 0) goto L78
            if (r2 == 0) goto L75
            boolean r0 = r0.l()
            if (r0 == 0) goto L72
            enz r0 = defpackage.enz.SYSTEM_DISMISSED
            goto L95
        L72:
            enz r0 = defpackage.enz.DISMISSED
            goto L95
        L75:
            enz r0 = defpackage.enz.SNOOZED
            goto L95
        L78:
            boolean r0 = r0.m()
            if (r0 == 0) goto L8a
            boolean r0 = r7.o()
            if (r0 == 0) goto L87
            enz r0 = defpackage.enz.SYSTEM_ON_HOLD
            goto L95
        L87:
            enz r0 = defpackage.enz.ON_HOLD
            goto L95
        L8a:
            boolean r0 = r7.o()
            if (r0 == 0) goto L93
            enz r0 = defpackage.enz.SYSTEM_ACTIVE
            goto L95
        L93:
            enz r0 = defpackage.enz.ACTIVE
        L95:
            r7.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epb.h():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(axpg axpgVar, axpg axpgVar2, ayqi ayqiVar) {
        h();
        final int i = 1;
        ((eow) axpgVar.get()).g().ab(ayqiVar).ax(new ayrs(this) { // from class: eoy
            public final /* synthetic */ epb a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    epb epbVar = this.a;
                    eok eokVar = (eok) obj;
                    if (!epbVar.j() || !eokVar.c) {
                        epbVar.k(enz.DISABLED);
                        return;
                    } else {
                        epbVar.h();
                        return;
                    }
                }
                epb epbVar2 = this.a;
                epz epzVar = (epz) obj;
                if (epbVar2.c == epzVar) {
                    return;
                }
                epbVar2.c = epzVar;
                epbVar2.h();
            }
        });
        aypy ab = ((eqa) axpgVar2.get()).a().ab(ayqiVar);
        final int i2 = 0;
        ab.ax(new ayrs(this) { // from class: eoy
            public final /* synthetic */ epb a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    epb epbVar = this.a;
                    eok eokVar = (eok) obj;
                    if (!epbVar.j() || !eokVar.c) {
                        epbVar.k(enz.DISABLED);
                        return;
                    } else {
                        epbVar.h();
                        return;
                    }
                }
                epb epbVar2 = this.a;
                epz epzVar = (epz) obj;
                if (epbVar2.c == epzVar) {
                    return;
                }
                epbVar2.c = epzVar;
                epbVar2.h();
            }
        });
    }

    public final boolean j() {
        return evr.K(this.d) && ((eow) this.h.get()).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(defpackage.enz r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epb.k(enz):boolean");
    }
}
