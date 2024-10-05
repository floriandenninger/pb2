package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aejh extends RequestFinishedInfo.Listener {
    private final aeig a;
    private final afjo b;
    private final boolean c;

    public aejh(Executor executor, aeig aeigVar, afjo afjoVar, boolean z) {
        super(executor);
        afki.a(aeigVar);
        this.a = aeigVar;
        this.b = afjoVar;
        this.c = z;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        UrlResponseInfo responseInfo;
        Uri parse;
        String path;
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics != null && (responseInfo = requestFinishedInfo.getResponseInfo()) != null && responseInfo.getHttpStatusCode() >= 200 && responseInfo.getHttpStatusCode() < 300 && (path = (parse = Uri.parse(responseInfo.getUrl())).getPath()) != null && path.contains("initplayback")) {
            Date sendingStart = metrics.getSendingStart();
            Date requestStart = metrics.getRequestStart();
            Long ttfbMs = metrics.getTtfbMs();
            if (sendingStart == null || requestStart == null || ttfbMs == null) {
                return;
            }
            long longValue = ttfbMs.longValue() - (sendingStart.getTime() - requestStart.getTime());
            this.a.d(parse.getHost(), longValue);
            if (!this.c || this.b == null || parse.getBooleanQueryParameter("owc", false) || parse.getQueryParameter("psid") != null) {
                return;
            }
            if (metrics.getSocketReused()) {
                this.b.aT(new aebo());
            }
            this.b.aT(new aebg(longValue));
        }
    }
}
