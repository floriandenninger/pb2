package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ibu implements ykl {
    final /* synthetic */ axcg a;
    final /* synthetic */ ibw b;

    public ibu(ibw ibwVar, axcg axcgVar) {
        this.b = ibwVar;
        this.a = axcgVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        afsi.b(2, 24, "VideoFX: Secondary sticker load failed");
        this.b.b.aT(this.a.toBuilder());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ibw ibwVar = this.b;
        axcg axcgVar = this.a;
        axdj c = ibw.c(axcgVar.c(), (Uri) obj);
        aone builder = axcgVar.toBuilder();
        axdk axdkVar = (axdk) c.build();
        builder.copyOnWrite();
        ((axcg) builder.instance).e(axdkVar);
        ibwVar.b.aT(builder);
    }
}
