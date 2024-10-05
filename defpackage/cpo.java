package defpackage;

import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpo extends cpr {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ cpp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpo(cpp cppVar, cof cofVar, UrlResponseInfo urlResponseInfo) {
        super(cofVar);
        this.b = cppVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a, null, true, null);
    }
}
