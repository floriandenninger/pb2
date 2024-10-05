package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ncd implements ngy {
    public nck a;
    public apxf b;
    public List c;

    public final void a(apxf apxfVar, List list) {
        this.b = apxfVar;
        this.c = list;
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ ngw b(Object obj) {
        ngw ngwVar = new ngw();
        augp augpVar = augp.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        int ordinal = ((augp) obj).ordinal();
        final int i = 1;
        if (ordinal == 1) {
            ngwVar.c = new Runnable(this) { // from class: ncc
                public final /* synthetic */ ncd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i != 0) {
                        ncd ncdVar = this.a;
                        ncdVar.a.e(ncdVar.c, true);
                    } else {
                        ncd ncdVar2 = this.a;
                        ncdVar2.a.q(ncdVar2.b);
                    }
                }
            };
            ngwVar.a = true;
            ngwVar.b = true;
        } else if (ordinal == 2) {
            final int i2 = 0;
            ngwVar.c = new Runnable(this) { // from class: ncc
                public final /* synthetic */ ncd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i2 != 0) {
                        ncd ncdVar = this.a;
                        ncdVar.a.e(ncdVar.c, true);
                    } else {
                        ncd ncdVar2 = this.a;
                        ncdVar2.a.q(ncdVar2.b);
                    }
                }
            };
            ngwVar.a = true;
        }
        return ngwVar;
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ Integer c(Object obj) {
        augu auguVar = (augu) obj;
        if (auguVar == null || (auguVar.b & 2) == 0) {
            return null;
        }
        return Integer.valueOf(auguVar.d);
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        augu auguVar = (augu) obj;
        if (auguVar == null || (auguVar.b & 4) == 0) {
            return augp.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        augp b = augp.b(auguVar.e);
        return b == null ? augp.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN : b;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object e() {
        return augp.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object f() {
        return augp.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object g() {
        return augp.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ void h(Map map, Object[] objArr) {
        for (augu auguVar : (augu[]) objArr) {
            augq b = augq.b(auguVar.c);
            if (b == null) {
                b = augq.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(b, auguVar);
        }
    }

    @Override // defpackage.ngy
    public final void i() {
        this.a.q(this.b);
    }

    @Override // defpackage.ngy
    public final void j(nck nckVar) {
        this.a = nckVar;
    }
}
