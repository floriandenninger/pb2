package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rtg implements anhh {
    final /* synthetic */ String a;
    final /* synthetic */ rth b;

    public rtg(rth rthVar, String str) {
        this.b = rthVar;
        this.a = str;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((amyf) rth.e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment$1", "onSuccess", 251, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: webview starts loading url.");
        this.b.ai.loadUrl(this.a);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ((amyf) ((amyf) rth.e.k().h(th)).i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment$1", "onFailure", 257, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: Failed to set up cookies.");
        this.b.ah.a(rtc.c(1, 402));
    }
}
