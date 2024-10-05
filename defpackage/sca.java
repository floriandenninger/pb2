package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sca implements anhh {
    final /* synthetic */ scb a;
    private final /* synthetic */ int b;

    public sca(scb scbVar, int i) {
        this.b = i;
        this.a = scbVar;
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.b != 0) {
            this.a.c.e(th);
        } else {
            ((amxh) ((amxh) ((amxh) scb.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/components/lifecycle/LifecycleController$2", "onFailure", (char) 127, "LifecycleController.java")).q("Failed to Load all Assets.");
        }
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            this.a.e.e.a.e(sex.ASSET_DOWNLOAD);
            ((amxh) ((amxh) scb.a.e()).i("com/google/android/libraries/ar/faceviewer/components/lifecycle/LifecycleController$2", "onSuccess", 122, "LifecycleController.java")).q("Loaded all Assets");
        } else {
            this.a.c.o((Boolean) obj);
        }
    }
}
