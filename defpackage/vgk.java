package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vgk extends vhb {
    public static final vhb a = new vgk();

    private vgk() {
    }

    @Override // defpackage.vhb
    public final /* bridge */ /* synthetic */ vha a(vff vffVar, String str, Executor executor, vcw vcwVar) {
        return new vgm(str, anaf.O(vffVar.a), vhg.a(vffVar.b, vffVar.f ? aomw.b() : aomw.a()), executor, vcwVar, vffVar.c, vffVar.h ? amhy.d() : amhy.c());
    }

    @Override // defpackage.vhb
    public final String b() {
        return "singleproc";
    }
}
