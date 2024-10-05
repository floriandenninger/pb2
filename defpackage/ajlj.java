package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ajlj implements ylz {
    final cuk a;
    final aef b;

    public ajlj(cuk cukVar, aef aefVar) {
        this.a = cukVar;
        this.b = aefVar;
    }

    @Override // defpackage.ylz
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Uri uri = (Uri) obj;
        if (uri == null) {
            return null;
        }
        return g((ctd) this.a.f((cqi) this.b.c(uri)));
    }

    @Override // defpackage.ylz
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.ylz
    public final void c() {
        throw null;
    }

    @Override // defpackage.ylz
    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
        ctd f;
        Uri uri = (Uri) obj;
        if (uri == null || obj2 == null || (f = f((afpz) obj2)) == null) {
            return;
        }
        this.a.g((cqi) this.b.c(uri), f);
    }

    @Override // defpackage.ylz
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        throw null;
    }

    protected abstract ctd f(afpz afpzVar);

    public final afpz g(ctd ctdVar) {
        ajlo ajloVar = (ctdVar == null || !h(ctdVar)) ? null : (ajlo) ctdVar;
        if (ajloVar != null) {
            return ajloVar.g();
        }
        return null;
    }

    protected abstract boolean h(ctd ctdVar);
}
