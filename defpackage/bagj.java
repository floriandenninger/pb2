package defpackage;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagj implements Runnable {
    final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;

    public bagj(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener) {
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onStatus(-1);
    }
}
