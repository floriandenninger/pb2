package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfn implements anhh {
    final /* synthetic */ amnv a;
    final /* synthetic */ amnv b;
    final /* synthetic */ sfp c;

    public sfn(sfp sfpVar, amnv amnvVar, amnv amnvVar2) {
        this.c = sfpVar;
        this.a = amnvVar;
        this.b = amnvVar2;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((amxh) ((amxh) sfp.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$1", "onSuccess", 46, "AssistantConnector.java")).q("Use gRPC connector");
            this.c.c.o(this.a.get());
            this.c.b = edt.APP_INTEGRATION_GRPC_MIC_TAP;
            return;
        }
        ((amxh) ((amxh) sfp.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$1", "onSuccess", 50, "AssistantConnector.java")).q("Use Maestro connector");
        this.c.c.o(this.b.get());
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ((amxh) ((amxh) ((amxh) sfp.a.f()).h(th)).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$1", "onFailure", '9', "AssistantConnector.java")).q("Couldn't read whether gRPC is supported from public value");
        ((amxh) ((amxh) sfp.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$1", "onFailure", 59, "AssistantConnector.java")).q("Fallback to Maestro connector");
        this.c.c.o(this.b.get());
    }
}
