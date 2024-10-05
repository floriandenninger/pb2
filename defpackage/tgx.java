package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgx implements tgr {
    final /* synthetic */ tgy a;

    public tgx(tgy tgyVar) {
        this.a = tgyVar;
    }

    @Override // defpackage.tgr
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tgb tgbVar = (tgb) obj;
        aong aongVar = tgbVar.c;
        long c = this.a.c.c();
        aongVar.copyOnWrite();
        tgf tgfVar = (tgf) aongVar.instance;
        tgf tgfVar2 = tgf.a;
        tgfVar.b |= 4;
        tgfVar.f = c * 1000;
        thb thbVar = this.a.b;
        boolean z = thbVar.g;
        Collection collection = (Collection) thbVar.e.remove(obj);
        if (collection != null) {
            collection.clear();
            thbVar.f = collection;
        }
        if (tgbVar.d()) {
            Object c2 = tgbVar.a.c();
            if (tgbVar.a.n() || (c2 != null && ((tgb) c2).d())) {
                Collection collection2 = (Collection) thbVar.e.get(c2);
                if (collection2 != null) {
                    collection2.add(tgbVar.a());
                } else {
                    Collection collection3 = thbVar.f;
                    if (collection3 != null) {
                        thbVar.f = null;
                    } else {
                        collection3 = new ArrayList();
                    }
                    collection3.add(tgbVar.a());
                    thbVar.e.put(c2, collection3);
                }
            }
        }
        thbVar.a.remove(obj);
        thbVar.b.remove(obj);
        if (thbVar.e.isEmpty()) {
            return;
        }
        this.a.b();
    }

    @Override // defpackage.tgr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tgb tgbVar = (tgb) obj;
        aong aongVar = tgbVar.c;
        long c = this.a.c.c();
        aongVar.copyOnWrite();
        tgf tgfVar = (tgf) aongVar.instance;
        tgf tgfVar2 = tgf.a;
        tgfVar.b |= 4;
        tgfVar.f = c * 1000;
        tgt tgtVar = tgbVar.a;
        if (tgtVar instanceof tgj) {
            tgj tgjVar = (tgj) tgtVar;
            if (tgbVar.c.pY(tin.a)) {
                if (!tgtVar.n()) {
                    tgjVar.p(true);
                }
            } else {
                tgjVar.p(false);
            }
        }
        thb thbVar = this.a.b;
        tgt tgtVar2 = tgbVar.a;
        aong aongVar2 = tgbVar.c;
        ando andoVar = ((tgf) aongVar2.instance).d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        if ((andoVar.b & 2048) == 0) {
            thbVar.a.add(obj);
        } else {
            int r = tgtVar2.r();
            int r2 = anaf.r(((tgf) aongVar2.instance).e);
            if ((r2 != 0 ? r2 : 1) == r) {
                return;
            }
            int i = ((tgf) aongVar2.instance).e;
            if (!thbVar.d(tgbVar, r)) {
                return;
            }
        }
        this.a.b();
    }

    @Override // defpackage.tgr
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        uqq.j();
        tgy tgyVar = this.a;
        if (tgyVar.f != null) {
            if (tgyVar.e > 0 || ((tgb) obj).a.n()) {
                uqq.m(this.a.f);
                this.a.a();
            }
        }
    }

    @Override // defpackage.tgr
    public final /* synthetic */ void d(Object obj) {
        ((tgb) obj).e();
    }

    @Override // defpackage.tgr
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.tgr
    public final /* synthetic */ void f() {
        uqq.j();
    }

    @Override // defpackage.tgr
    public final /* bridge */ /* synthetic */ void g(Object obj, int i) {
        tgb tgbVar = (tgb) obj;
        aong aongVar = tgbVar.c;
        long c = this.a.c.c();
        aongVar.copyOnWrite();
        tgf tgfVar = (tgf) aongVar.instance;
        tgf tgfVar2 = tgf.a;
        tgfVar.b |= 4;
        tgfVar.f = c * 1000;
        if (this.a.b.d(tgbVar, i)) {
            this.a.b();
        }
    }
}
