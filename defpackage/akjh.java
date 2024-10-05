package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akjh implements afwx {
    final /* synthetic */ Map a;
    final /* synthetic */ akjj b;

    public akjh(akjj akjjVar, Map map) {
        this.b = akjjVar;
        this.a = map;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.a.e(cnqVar);
        akji akjiVar = (akji) yjj.u(this.a, "com.google.android.libraries.youtube.innertube.endpoint.tag", akji.class);
        if (akjiVar != null) {
            akjiVar.h();
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        this.b.b(this.a, (arle) obj);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
