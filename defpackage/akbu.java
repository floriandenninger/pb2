package defpackage;

import android.util.Pair;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akbu implements akbv {
    public final aahd a;
    public final boolean b;
    public final Set c;
    public final Map d;
    public final ReferenceQueue e;
    public final gnn f;
    private final akch g;

    public akbu(akch akchVar, aahd aahdVar, gnn gnnVar, aadw aadwVar) {
        gnnVar.getClass();
        this.f = gnnVar;
        aahdVar.getClass();
        this.a = aahdVar;
        akchVar.getClass();
        this.g = akchVar;
        boolean z = false;
        if (aadwVar != null) {
            asvu asvuVar = aadwVar.b().e;
            if ((asvuVar == null ? asvu.a : asvuVar).bi) {
                z = true;
            }
        }
        this.b = z;
        this.c = new HashSet();
        this.d = new HashMap();
        this.e = new ReferenceQueue();
    }

    private static apmg g(ared aredVar) {
        apxf apxfVar;
        apxf apxfVar2 = null;
        if (aredVar == null) {
            return null;
        }
        aong aongVar = (aong) apmg.a.createBuilder();
        aqyg aqygVar = aredVar.f;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        aongVar.copyOnWrite();
        apmg apmgVar = (apmg) aongVar.instance;
        aqygVar.getClass();
        apmgVar.i = aqygVar;
        apmgVar.b |= 256;
        boolean z = aredVar.d;
        aongVar.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar.instance;
        apmgVar2.b |= 64;
        apmgVar2.h = z;
        arfs arfsVar = aredVar.e;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        aongVar.copyOnWrite();
        apmg apmgVar3 = (apmg) aongVar.instance;
        arfsVar.getClass();
        apmgVar3.g = arfsVar;
        apmgVar3.b |= 32;
        int i = 16;
        if ((aredVar.b & 16) != 0) {
            apxfVar = aredVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        if (apxfVar != null) {
            aongVar.copyOnWrite();
            apmg apmgVar4 = (apmg) aongVar.instance;
            apmgVar4.n = apxfVar;
            apmgVar4.b |= 8192;
        }
        if ((aredVar.b & 32) != 0 && (apxfVar2 = aredVar.h) == null) {
            apxfVar2 = apxf.a;
        }
        if (apxfVar2 != null) {
            aongVar.copyOnWrite();
            apmg apmgVar5 = (apmg) aongVar.instance;
            apmgVar5.o = apxfVar2;
            apmgVar5.b |= 16384;
        }
        aott aottVar = aredVar.i;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        aongVar.copyOnWrite();
        apmg apmgVar6 = (apmg) aongVar.instance;
        aottVar.getClass();
        apmgVar6.s = aottVar;
        apmgVar6.b |= 131072;
        aomf aomfVar = aredVar.j;
        aongVar.copyOnWrite();
        apmg apmgVar7 = (apmg) aongVar.instance;
        aomfVar.getClass();
        apmgVar7.b |= 1048576;
        apmgVar7.t = aomfVar;
        if ((aredVar.b & 1) != 0) {
            aree areeVar = aredVar.c;
            if (areeVar == null) {
                areeVar = aree.a;
            }
            int dV = amkq.dV(areeVar.b);
            if (dV != 0 && dV == 2) {
                i = 14;
            }
        }
        aongVar.copyOnWrite();
        apmg apmgVar8 = (apmg) aongVar.instance;
        apmgVar8.d = Integer.valueOf(i - 1);
        apmgVar8.c = 1;
        return (apmg) aongVar.build();
    }

    public final void a() {
        while (true) {
            Reference poll = this.e.poll();
            if (poll == null) {
                return;
            }
            synchronized (this.e) {
                this.d.remove(((akco) poll).a);
            }
        }
    }

    @Override // defpackage.akbv
    public final void b(arej arejVar, View view, Object obj, acra acraVar) {
        e(arejVar, view, obj, acraVar, this.b, false, null);
    }

    @Override // defpackage.akbv
    public final void c(arej arejVar, View view, Object obj, acra acraVar, akbl akblVar) {
        e(arejVar, view, obj, acraVar, this.b, false, akblVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.arej r12, android.view.View r13, java.lang.Object r14, defpackage.acra r15, boolean r16, boolean r17, defpackage.akbl r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbu.d(arej, android.view.View, java.lang.Object, acra, boolean, boolean, akbl):void");
    }

    public final void e(final arej arejVar, final View view, final Object obj, final acra acraVar, final boolean z, final boolean z2, final akbl akblVar) {
        long j;
        long j2;
        a();
        if (view == null || arejVar == null) {
            return;
        }
        if (!z2) {
            this.d.put(arejVar.c, new akbt(this, arejVar, view, acraVar, akblVar));
            if ((arejVar.b & 64) != 0) {
                aref arefVar = arejVar.i;
                if (arefVar == null) {
                    arefVar = aref.a;
                }
                int dU = amkq.dU(arefVar.b);
                if (dU != 0 && dU == 3) {
                    return;
                }
            }
            gnn gnnVar = this.f;
            if ((arejVar.b & 16) != 0) {
                arei areiVar = arejVar.g;
                if (areiVar == null) {
                    areiVar = arei.a;
                }
                j = areiVar.d;
            } else {
                j = 0;
            }
            if ((arejVar.b & 16) != 0) {
                arei areiVar2 = arejVar.g;
                if (areiVar2 == null) {
                    areiVar2 = arei.a;
                }
                j2 = areiVar2.c;
            } else {
                j2 = 0;
            }
            boolean d = gov.d(gnnVar.a, gnn.a(arejVar), TimeUnit.SECONDS.toMillis(j2), gnnVar.b.c());
            boolean z3 = false;
            if (d && gnnVar.a.getLong(gnn.b(arejVar), 0L) < j) {
                z3 = true;
            }
            if (this.c.contains(new Pair(arejVar, obj)) || !z3) {
                return;
            }
        }
        if (!view.isShown() || !view.isAttachedToWindow()) {
            view.post(new Runnable() { // from class: akbr
                @Override // java.lang.Runnable
                public final void run() {
                    akbu akbuVar = akbu.this;
                    View view2 = view;
                    arej arejVar2 = arejVar;
                    Object obj2 = obj;
                    acra acraVar2 = acraVar;
                    boolean z4 = z;
                    boolean z5 = z2;
                    akbl akblVar2 = akblVar;
                    if (view2.isShown() && view2.isAttachedToWindow()) {
                        akbuVar.d(arejVar2, view2, obj2, acraVar2, z4, z5, akblVar2);
                    }
                }
            });
        } else {
            d(arejVar, view, obj, acraVar, z, z2, akblVar);
        }
    }

    @Override // defpackage.akbv
    public final void f(arej arejVar, View view, acra acraVar) {
        e(arejVar, view, null, acraVar, this.b, true, null);
    }
}
