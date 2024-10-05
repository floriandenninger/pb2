package defpackage;

import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahp implements bahy {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ String b;
    final /* synthetic */ bahu c;

    public bahp(bahu bahuVar, UrlResponseInfo urlResponseInfo, String str) {
        this.c = bahuVar;
        this.a = urlResponseInfo;
        this.b = str;
    }

    @Override // defpackage.bahy
    public final void a() {
        bahu bahuVar = this.c;
        bahuVar.a.onRedirectReceived(bahuVar.d, this.a, this.b);
    }
}
