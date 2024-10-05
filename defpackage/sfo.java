package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfo implements anhh {
    final /* synthetic */ String a;

    public sfo(String str) {
        this.a = str;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        ((amxh) ((amxh) sfp.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$2", "onSuccess", 193, "AssistantConnector.java")).s("Future [%s] SUCCESS", this.a);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ((amxh) ((amxh) ((amxh) sfp.a.g()).h(th)).i("com/google/android/libraries/assistant/appintegration/AssistantConnector$2", "onFailure", 198, "AssistantConnector.java")).s("Future [%s] FAILED", this.a);
    }
}
