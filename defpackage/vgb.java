package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vgb extends vhb {
    public static final vhb a = new vgb();

    private vgb() {
    }

    @Override // defpackage.vhb
    public final /* synthetic */ vha a(vff vffVar, String str, Executor executor, vcw vcwVar) {
        aomw a2;
        amkq.E(vffVar.e instanceof vfp);
        if (vffVar.f) {
            a2 = aomw.b();
        } else {
            a2 = aomw.a();
        }
        return new vgd(str, anaf.O(vffVar.a), vhg.a(vffVar.b, a2), executor, vcwVar, ((vfp) vffVar.e).a, vffVar.c, vffVar.h ? amhy.d() : amhy.c());
    }

    @Override // defpackage.vhb
    public final String b() {
        return "signal";
    }
}
