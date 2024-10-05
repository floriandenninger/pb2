package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rtj implements anhh {
    final /* synthetic */ rtk a;

    public rtj(rtk rtkVar) {
        this.a = rtkVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((amyf) rtk.e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment$1", "onSuccess", 227, "StreamlineFragment.java")).q("StreamlinedFragment: webView starts loading url");
        rtk rtkVar = this.a;
        rtkVar.ah.loadUrl(rtkVar.af);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ((amyf) ((amyf) ((amyf) rtk.e.g()).h(th)).i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment$1", "onFailure", 233, "StreamlineFragment.java")).q("StreamlinedFragment: Failed to setup cookies.");
        this.a.ag.a(rtc.b(202));
    }
}
