package defpackage;

import java.util.Date;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagh extends RequestFinishedInfo.Metrics {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final boolean n;
    private final Long o;
    private final Long p;
    private final Long q;
    private final Long r;

    public bagh(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = z;
        this.q = Long.valueOf(j14);
        this.r = Long.valueOf(j15);
        if (j != -1 && j12 != -1) {
            this.o = Long.valueOf(j12 - j);
        } else {
            this.o = null;
        }
        if (j == -1 || j13 == -1) {
            this.p = null;
        } else {
            this.p = Long.valueOf(j13 - j);
        }
    }

    private static Date a(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectEnd() {
        return a(this.e);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectStart() {
        return a(this.d);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsEnd() {
        return a(this.c);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsStart() {
        return a(this.b);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushEnd() {
        return a(this.k);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushStart() {
        return a(this.j);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getReceivedByteCount() {
        return this.r;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestEnd() {
        return a(this.m);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestStart() {
        return a(this.a);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getResponseStart() {
        return a(this.l);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingEnd() {
        return a(this.i);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingStart() {
        return a(this.h);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getSentByteCount() {
        return this.q;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final boolean getSocketReused() {
        return this.n;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslEnd() {
        return a(this.g);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslStart() {
        return a(this.f);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTotalTimeMs() {
        return this.p;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTtfbMs() {
        return this.o;
    }
}
