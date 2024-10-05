package defpackage;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajtz implements zfk, ajvz {
    public ajce A;
    public ajce B;
    public ajce C;
    public final HashMap D;
    public ajtt E;
    public ajtu F;
    private ajug a;
    private final aasm b;
    private final zaw c;
    private final ypa d;
    private final aasl e;
    public final Executor u;
    public final Object v;
    public final HashMap w;
    public final acra x;
    public final List y;
    public final Queue z;

    public ajtz(aasm aasmVar, ypa ypaVar, zaw zawVar, acra acraVar) {
        this(aasmVar, ypaVar, null, zawVar, acraVar);
    }

    private final void k(Object obj) {
        Object obj2 = this.v;
        if (obj2 != null) {
            this.d.e(obj2, obj);
        } else {
            this.d.d(obj);
        }
    }

    private final void l(ajce ajceVar, boolean z, apxf apxfVar, zfi zfiVar, ajug ajugVar, ajts ajtsVar, asht ashtVar) {
        k(new ajtw(ajceVar));
        if (lq() && ajceVar.d() != null && ajceVar.d().length > 0) {
            this.x.I(3, new acqx(ajceVar.d()), ashtVar);
        }
        this.A = ajceVar;
        aaru a = this.b.a(ajceVar);
        if (zfiVar != null) {
            zfiVar.a(a);
        }
        if ((ajcd.INVALIDATION.a(ajceVar) || z) && a.q()) {
            a.s(2);
        }
        ls(a, ajtsVar);
        this.b.b(a, this.e, new ajtq(this, ajceVar, z, apxfVar, ajugVar));
    }

    public void B() {
        this.w.clear();
        this.A = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ajsn U() {
        return null;
    }

    public ajce W(ajcd ajcdVar) {
        return (ajce) this.w.get(ajcdVar);
    }

    public final ajug X() {
        if (this.a == null) {
            this.a = new ajtp(this);
        }
        return this.a;
    }

    public Object Y() {
        return this.v;
    }

    public final void Z(Object obj) {
        if (this.D.containsKey(obj)) {
            ((Timer) this.D.remove(obj)).cancel();
        }
    }

    public final void aa() {
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            ((Timer) it.next()).cancel();
        }
        this.D.clear();
    }

    public final void ab(ajce ajceVar, ajug ajugVar) {
        ad(ajceVar, null, adpt.j, ajugVar, ajts.a());
    }

    public final void ac(ajce ajceVar, apxf apxfVar) {
        ad(ajceVar, apxfVar, adpt.l, X(), ajts.a());
    }

    public final void ad(ajce ajceVar, apxf apxfVar, zfi zfiVar, ajug ajugVar, ajts ajtsVar) {
        ae(ajceVar, apxfVar, zfiVar, ajugVar, ajtsVar, asht.a);
    }

    public final void ae(ajce ajceVar, apxf apxfVar, zfi zfiVar, ajug ajugVar, ajts ajtsVar, asht ashtVar) {
        ajugVar.getClass();
        if (ajceVar == null || ajceVar == this.A) {
            return;
        }
        l(ajceVar, false, apxfVar, zfiVar, ajugVar, ajtsVar, ashtVar);
    }

    public final void af() {
        ajce ajceVar = this.C;
        if (ajceVar == null || ajceVar == this.A) {
            return;
        }
        l(ajceVar, true, null, adpt.m, X(), ajts.a(), asht.a);
    }

    public final void ag(ajce ajceVar, Timer timer) {
        if (ajceVar != null) {
            ah(ajceVar, ajceVar, timer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ah(java.lang.Object r6, defpackage.ajce r7, java.util.Timer r8) {
        /*
            r5 = this;
            defpackage.yjk.f()
            if (r7 != 0) goto L6
            return
        L6:
            java.lang.Class<avgs> r0 = defpackage.avgs.class
            java.lang.Object r0 = defpackage.ahbj.p(r7, r0)
            avgs r0 = (defpackage.avgs) r0
            r1 = 0
            if (r0 == 0) goto L16
            int r0 = r0.c
        L14:
            long r3 = (long) r0
            goto L24
        L16:
            java.lang.Class<asjj> r0 = defpackage.asjj.class
            java.lang.Object r0 = defpackage.ahbj.p(r7, r0)
            asjj r0 = (defpackage.asjj) r0
            if (r0 == 0) goto L23
            int r0 = r0.d
            goto L14
        L23:
            r3 = r1
        L24:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2c
            r5.lt(r7)
            return
        L2c:
            java.util.HashMap r0 = r5.D
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L3f
            java.util.HashMap r0 = r5.D
            java.lang.Object r0 = r0.get(r6)
            java.util.Timer r0 = (java.util.Timer) r0
            r0.cancel()
        L3f:
            java.util.HashMap r0 = r5.D
            r0.put(r6, r8)
            ajtn r0 = new ajtn
            r0.<init>(r5, r6, r7)
            r8.schedule(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtz.ah(java.lang.Object, ajce, java.util.Timer):void");
    }

    public boolean ai(ajcd ajcdVar) {
        return (ajcdVar == ajcd.RELOAD && this.C != null) || this.w.containsKey(ajcdVar);
    }

    @Override // defpackage.zfk
    public void j() {
        this.E = null;
        this.F = null;
        aa();
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lB(Object obj, ajcd ajcdVar) {
        if (obj == null && ajcdVar == ajcd.NEXT) {
            B();
        }
        k(new ajtr(ajcdVar, obj != null));
    }

    public void lF(ajcd ajcdVar) {
        ajce ajceVar = (ajce) this.w.get(ajcdVar);
        if (ajceVar != null) {
            lt(ajceVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lm(cnq cnqVar, ajce ajceVar) {
        Intent intent;
        zfl a = this.c.a(cnqVar);
        Throwable th = cnqVar;
        while (true) {
            if (th == null) {
                intent = null;
                break;
            } else if (!(th instanceof cnb)) {
                th = th.getCause();
            } else {
                intent = ((cnb) th).a;
                break;
            }
        }
        k(new ajtv(a, true, intent, ajceVar));
        ajtt ajttVar = this.E;
        if (ajttVar != null) {
            ajttVar.a(cnqVar, ajceVar);
        }
    }

    protected boolean lq() {
        return true;
    }

    protected void ls(aaqh aaqhVar, ajts ajtsVar) {
    }

    public void lt(ajce ajceVar) {
        ab(ajceVar, X());
    }

    public void lu(List list) {
        B();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajce ajceVar = (ajce) it.next();
            this.w.put(ajceVar.a(), ajceVar);
            if (ajceVar.a() == ajcd.RELOAD) {
                this.C = ajceVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object nn(aulp aulpVar);

    public ajxe ph() {
        return new ajty(new HashMap(this.w), this.C, this.A, this.y);
    }

    public ajtz(aasm aasmVar, ypa ypaVar, Object obj, zaw zawVar, acra acraVar) {
        this(null, aasmVar, ypaVar, obj, zawVar, acraVar, new qmq(4));
    }

    public ajtz(ajxe ajxeVar, aasm aasmVar, ypa ypaVar, Object obj, zaw zawVar, acra acraVar, Executor executor) {
        this(ajxeVar, aasmVar, ypaVar, obj, zawVar, acraVar, executor, new ArrayDeque());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ajtz(ajxe ajxeVar, aasm aasmVar, ypa ypaVar, Object obj, zaw zawVar, acra acraVar, Executor executor, Queue queue) {
        aasmVar.getClass();
        this.b = aasmVar;
        ypaVar.getClass();
        this.d = ypaVar;
        zawVar.getClass();
        this.c = zawVar;
        acraVar.getClass();
        this.x = acraVar;
        this.v = obj;
        this.D = new HashMap();
        this.u = executor;
        this.z = queue;
        this.e = new ajtl(this);
        if (ajxeVar instanceof ajty) {
            ajty ajtyVar = (ajty) ajxeVar;
            this.w = ajtyVar.a;
            this.C = ajtyVar.b;
            this.y = ajtyVar.c;
            this.B = ajtyVar.d;
        } else {
            this.w = new HashMap();
            this.y = new ArrayList();
            this.B = null;
        }
        for (byte[] bArr : this.y) {
            if (bArr != null) {
                acraVar.D(new acqx(bArr));
            }
        }
    }
}
