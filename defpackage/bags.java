package defpackage;

import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bags implements Runnable {
    final /* synthetic */ baip a;
    final /* synthetic */ RequestFinishedInfo b;

    public bags(baip baipVar, RequestFinishedInfo requestFinishedInfo) {
        this.a = baipVar;
        this.b = requestFinishedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onRequestFinished(this.b);
    }
}
