package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ytk extends ytj {
    public ytk(ysb ysbVar, Executor executor) {
        super(ysbVar, executor);
    }

    @Override // defpackage.ytj, org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo.getUrl().contains("initplayback")) {
            super.onRequestFinished(requestFinishedInfo);
        }
    }
}
