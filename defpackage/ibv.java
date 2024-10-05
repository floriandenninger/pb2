package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ibv implements ykl {
    final /* synthetic */ axdk a;
    final /* synthetic */ ibw b;

    public ibv(ibw ibwVar, axdk axdkVar) {
        this.b = ibwVar;
        this.a = axdkVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        afsi.b(2, 24, "VideoFX: Secondary sticker load failed");
        this.b.b.aI((axdj) this.a.toBuilder());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ibw ibwVar = this.b;
        ibwVar.b.aI(ibw.c(this.a, (Uri) obj));
    }
}
