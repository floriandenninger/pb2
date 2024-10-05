package defpackage;

import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagm implements Runnable {
    final /* synthetic */ RequestFinishedInfo a;
    final /* synthetic */ CronetUrlRequest b;

    public bagm(CronetUrlRequest cronetUrlRequest, RequestFinishedInfo requestFinishedInfo) {
        this.b = cronetUrlRequest;
        this.a = requestFinishedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.onRequestFinished(this.a);
    }
}
