package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sdx implements anhh {
    final /* synthetic */ List a;
    final /* synthetic */ sdy b;

    public sdx(sdy sdyVar, List list) {
        this.b = sdyVar;
        this.a = list;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.k.e.a.e(sex.RENDER_INIT);
        this.b.k.e.a.d();
        sci sciVar = this.b.k.e.a;
        sciVar.d = (String) this.a.get(0);
        sciVar.e++;
        sciVar.e(sex.ASSET_SWITCH);
        sciVar.f(sex.ASSET);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ((amxh) ((amxh) ((amxh) sdy.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/components/rendering/RenderingManager$1", "onFailure", (char) 266, "RenderingManager.java")).q("Failed to activate effect.");
    }
}
