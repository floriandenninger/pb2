package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpn extends cpr {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ CronetException b;
    final /* synthetic */ cpp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpn(cpp cppVar, cof cofVar, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(cofVar);
        this.c = cppVar;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b, false, null);
    }
}
