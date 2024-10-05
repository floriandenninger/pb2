package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atv extends UrlRequest.StatusListener {
    final /* synthetic */ int[] a;
    final /* synthetic */ eun b;

    public atv(int[] iArr, eun eunVar, byte[] bArr) {
        this.a = iArr;
        this.b = eunVar;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a[0] = i;
        this.b.e();
    }
}
