package defpackage;

import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baif extends RequestFinishedInfo {
    private final String a;
    private final Collection b;
    private final RequestFinishedInfo.Metrics c;
    private final int d;
    private final UrlResponseInfo e;
    private final CronetException f;

    public baif(String str, Collection collection, RequestFinishedInfo.Metrics metrics, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a = str;
        this.b = collection;
        this.c = metrics;
        this.d = i;
        this.e = urlResponseInfo;
        this.f = cronetException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final Collection getAnnotations() {
        Collection collection = this.b;
        return collection == null ? Collections.emptyList() : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final CronetException getException() {
        return this.f;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final int getFinishedReason() {
        return this.d;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        return this.c;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final UrlResponseInfo getResponseInfo() {
        return this.e;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final String getUrl() {
        return this.a;
    }
}
