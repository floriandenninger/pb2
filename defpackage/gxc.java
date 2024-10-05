package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxc implements anhh {
    final /* synthetic */ acsx a;
    final /* synthetic */ gxd b;

    public gxc(gxd gxdVar, acsx acsxVar) {
        this.b = gxdVar;
        this.a = acsxVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        sfl sflVar = (sfl) obj;
        boolean contains = sflVar.b.contains(0);
        ((amxh) ((amxh) sfl.a.d()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "isAvailable", 60, "AssistantConfig.java")).B(contains);
        acsx acsxVar = this.a;
        if (acsxVar != null) {
            acsxVar.c("as_ok");
        }
        this.b.a(contains, sflVar.c);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        int i = gxd.b;
        acsx acsxVar = this.a;
        if (acsxVar != null) {
            acsxVar.c("as_fail");
        }
        this.b.a(false, amlr.a);
    }
}
