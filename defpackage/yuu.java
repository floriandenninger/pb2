package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yuu extends ytj {
    final /* synthetic */ yuv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuu(yuv yuvVar, String str, ysb ysbVar, Executor executor) {
        super(ysbVar, executor);
        this.b = yuvVar;
        this.a = str;
    }

    @Override // defpackage.ytj, org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        String str;
        if (this.b.a.b()) {
            super.onRequestFinished(requestFinishedInfo);
            str = "RequestFinishedListener is notified by Cronet. Notified wrapped listener.";
        } else {
            this.b.f = requestFinishedInfo;
            str = "RequestFinishedListener is notified by Cronet. Cached requestFinishedInfo.";
        }
        yuv yuvVar = this.b;
        yuvVar.e.a(yuvVar.d, requestFinishedInfo.getUrl(), str, requestFinishedInfo.getException());
    }
}
