package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sdl implements anhh {
    final /* synthetic */ aogf a;

    public sdl(aogf aogfVar) {
        this.a = aogfVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aweh awehVar = ((awev) obj).c;
        if (awehVar == null) {
            awehVar = aweh.a;
        }
        float f = awehVar.c;
        aogf aogfVar = this.a;
        aogfVar.e = 0.5f;
        aogfVar.f = 1.0f - f;
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ((amxh) ((amxh) ((amxh) sdo.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/components/rendering/GLViewManager$2", "onFailure", 's', "GLViewManager.java")).q("Failed to set alignment.");
    }
}
