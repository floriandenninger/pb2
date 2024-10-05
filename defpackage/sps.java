package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sps extends dha {

    @dnt(a = 5)
    List A;

    @dnt(a = 5)
    List B;

    @dnt(a = 5)
    List C;

    @dnt(a = 14)
    private spr D;

    @dnt(a = 10)
    dha a;

    @dnt(a = 5)
    List b;

    @dnt(a = 5)
    List c;

    @dnt(a = 5)
    List d;

    @dnt(a = 5)
    List e;

    @dnt(a = 5)
    List f;

    @dnt(a = 3)
    boolean g;

    @dnt(a = 3)
    boolean v;

    @dnt(a = 3)
    boolean w;

    @dnt(a = 5)
    List x;

    @dnt(a = 5)
    List y;

    @dnt(a = 5)
    List z;

    public sps() {
        super("ElementEventWithGesture");
        this.D = new spr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        baqlVar.a = new AtomicBoolean(true);
        spt sptVar = new spt();
        baqlVar3.a = sptVar;
        baqlVar2.a = new in(dheVar.b, new spv(sptVar), new Handler(Looper.getMainLooper()));
        baqlVar4.a = new AtomicReference(null);
        Object obj = baqlVar.a;
        if (obj != null) {
            this.D.b = (AtomicBoolean) obj;
        }
        Object obj2 = baqlVar2.a;
        if (obj2 != null) {
            this.D.c = (in) obj2;
        }
        Object obj3 = baqlVar3.a;
        if (obj3 != null) {
            this.D.a = (spt) obj3;
        }
        Object obj4 = baqlVar4.a;
        if (obj4 != null) {
            this.D.d = (AtomicReference) obj4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        spr sprVar = (spr) dlqVar;
        spr sprVar2 = (spr) dlqVar2;
        sprVar2.a = sprVar.a;
        sprVar2.b = sprVar.b;
        sprVar2.c = sprVar.c;
        sprVar2.d = sprVar.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean aa() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.dhk
    public final void ap() {
        spt sptVar = this.D.a;
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ssw) it.next()).c();
            }
        }
        sptVar.b = null;
        sptVar.c = null;
        sptVar.d = null;
        sptVar.e = null;
        sptVar.f = null;
        sptVar.g = null;
        sptVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        dha dhaVar = this.a;
        List list = this.d;
        List list2 = this.C;
        boolean z = this.w;
        List list3 = this.f;
        spr sprVar = this.D;
        spt sptVar = sprVar.a;
        in inVar = sprVar.c;
        List list4 = this.y;
        List list5 = this.A;
        List list6 = this.B;
        List list7 = this.c;
        List list8 = this.z;
        List list9 = this.x;
        boolean z2 = this.g;
        dnc a = dnd.a(dheVar);
        a.e(dhaVar);
        sptVar.b = list5;
        sptVar.c = list6;
        sptVar.d = list4;
        sptVar.e = list7;
        sptVar.f = list8;
        sptVar.g = list9;
        inVar.a.a.setOnDoubleTapListener(sptVar.b() ? new spu(sptVar) : null);
        if (sptVar.f() || sptVar.c()) {
            a.Q(H(sps.class, dheVar, -1336101728, new Object[]{dheVar}));
        }
        if (sptVar.f()) {
            a.c.C().D().h(H(sps.class, dheVar, -1270658234, new Object[]{dheVar}));
        }
        if (sptVar.c()) {
            a.c.C().D().e(true);
        }
        if (!sptVar.b()) {
            if (sptVar.e()) {
                a.r(H(sps.class, dheVar, -1351902487, new Object[]{dheVar}));
            }
            if (sptVar.d()) {
                a.c.C().D().l(H(sps.class, dheVar, 71235917, new Object[]{dheVar}));
            }
        }
        if (list2 != null || list != null) {
            if (!z) {
                a.R(H(sps.class, dheVar, 1803022739, new Object[]{dheVar}));
            } else {
                diy H = H(sps.class, dheVar, 1110660298, new Object[]{dheVar});
                dgw c = a.c.C().c();
                c.a |= 1073741824;
                c.c = H;
            }
        }
        if (list3 != null) {
            a.K(H(sps.class, dheVar, -1932591986, new Object[]{dheVar}));
        }
        if (z2) {
            a.c.C().D().m(H(sps.class, dheVar, 466811311, new Object[]{dheVar}));
        }
        return a.a();
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        sps spsVar = (sps) super.j();
        dha dhaVar = spsVar.a;
        spsVar.a = dhaVar != null ? dhaVar.j() : null;
        spsVar.D = new spr();
        return spsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.D;
    }

    @Override // defpackage.dhk, defpackage.dix
    public final Object K(diy diyVar, Object obj) {
        List list;
        boolean z = true;
        boolean z2 = false;
        switch (diyVar.b) {
            case -1974694341:
                djd djdVar = (djd) obj;
                dji djiVar = diyVar.a;
                View view = djdVar.a;
                boolean z3 = djdVar.b;
                List list2 = ((sps) djiVar).e;
                return null;
            case -1932591986:
                dji djiVar2 = diyVar.a;
                View view2 = ((djs) obj).a;
                List list3 = ((sps) djiVar2).f;
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        ((sxl) it.next()).a(view2);
                    }
                }
                return null;
            case -1351902487:
                dji djiVar3 = diyVar.a;
                View view3 = ((dgs) obj).a;
                sps spsVar = (sps) djiVar3;
                List list4 = spsVar.y;
                AtomicReference atomicReference = spsVar.D.d;
                if (list4 != null) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        ((sxn) it2.next()).a(view3, (szk) atomicReference.get());
                    }
                }
                return null;
            case -1336101728:
                dlw dlwVar = (dlw) obj;
                dji djiVar4 = diyVar.a;
                View view4 = dlwVar.a;
                MotionEvent motionEvent = dlwVar.b;
                spr sprVar = ((sps) djiVar4).D;
                in inVar = sprVar.c;
                spt sptVar = sprVar.a;
                AtomicReference atomicReference2 = sprVar.d;
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) {
                    atomicReference2.set(new szk(motionEvent.getX(), motionEvent.getY()));
                }
                sptVar.a(view4);
                inVar.a(motionEvent);
                if (motionEvent.getActionMasked() != 0 || sptVar.d() || sptVar.e() || sptVar.b() || (sptVar.c == null && sptVar.f == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case -1270658234:
                dip dipVar = (dip) obj;
                dji djiVar5 = diyVar.a;
                View view5 = dipVar.a;
                MotionEvent motionEvent2 = dipVar.b;
                spt sptVar2 = ((sps) djiVar5).D.a;
                int actionMasked = motionEvent2.getActionMasked();
                if (actionMasked == 0) {
                    List list5 = sptVar2.b;
                    if (list5 != null) {
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            ((sxp) it3.next()).a(view5, new szk(motionEvent2.getX(), motionEvent2.getY()));
                        }
                    }
                } else if (actionMasked == 1) {
                    List list6 = sptVar2.c;
                    if (list6 != null) {
                        Iterator it4 = list6.iterator();
                        while (it4.hasNext()) {
                            ((sxq) it4.next()).a(view5, new szk(motionEvent2.getX(), motionEvent2.getY()));
                        }
                    }
                } else if (actionMasked == 3 && (list = sptVar2.f) != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        ((sxo) it5.next()).a(view5);
                    }
                }
                return null;
            case -1048037474:
                N((dhe) diyVar.c[0], (diw) obj);
                return null;
            case 71235917:
                dji djiVar6 = diyVar.a;
                View view6 = ((dkr) obj).a;
                sps spsVar2 = (sps) djiVar6;
                List list7 = spsVar2.x;
                AtomicReference atomicReference3 = spsVar2.D.d;
                if (list7 != null) {
                    szk szkVar = (szk) atomicReference3.get();
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        ((sxm) it6.next()).a(view6, szkVar);
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 466811311:
                dle dleVar = (dle) obj;
                dji djiVar7 = diyVar.a;
                ic icVar = dleVar.c;
                View view7 = dleVar.a;
                ks ksVar = dleVar.b;
                sps spsVar3 = (sps) djiVar7;
                boolean z4 = spsVar3.g;
                boolean z5 = spsVar3.v;
                icVar.d(view7, ksVar);
                if (z4) {
                    ksVar.p(true);
                    ksVar.q(z5);
                }
                return null;
            case 1110660298:
                dkd dkdVar = (dkd) obj;
                dji djiVar8 = diyVar.a;
                View view8 = dkdVar.a;
                View view9 = dkdVar.b;
                sps spsVar4 = (sps) djiVar8;
                List list8 = spsVar4.C;
                List list9 = spsVar4.d;
                AtomicBoolean atomicBoolean = spsVar4.D.b;
                if (list9 != null && atomicBoolean.getAndSet(false)) {
                    Iterator it7 = list9.iterator();
                    while (it7.hasNext()) {
                        ((sxr) it7.next()).b(view8, view9);
                    }
                }
                if (list8 != null) {
                    Iterator it8 = list8.iterator();
                    while (it8.hasNext()) {
                        ((sxr) it8.next()).b(view8, view9);
                    }
                }
                return null;
            case 1803022739:
                dmy dmyVar = (dmy) obj;
                dji djiVar9 = diyVar.a;
                View view10 = dmyVar.a;
                View view11 = dmyVar.b;
                sps spsVar5 = (sps) djiVar9;
                List list10 = spsVar5.C;
                List list11 = spsVar5.d;
                AtomicBoolean atomicBoolean2 = spsVar5.D.b;
                if (list11 != null && atomicBoolean2.getAndSet(false)) {
                    Iterator it9 = list11.iterator();
                    while (it9.hasNext()) {
                        ((sxr) it9.next()).b(view10, view11);
                    }
                }
                if (list10 != null) {
                    Iterator it10 = list10.iterator();
                    while (it10.hasNext()) {
                        ((sxr) it10.next()).b(view10, view11);
                    }
                }
                return null;
            default:
                return null;
        }
    }
}
