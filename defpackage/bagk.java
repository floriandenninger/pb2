package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagk implements Runnable {
    final /* synthetic */ baij a;
    final /* synthetic */ String b;
    final /* synthetic */ CronetUrlRequest c;

    public bagk(CronetUrlRequest cronetUrlRequest, baij baijVar, String str) {
        this.c = cronetUrlRequest;
        this.a = baijVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b();
        synchronized (this.c.c) {
            if (this.c.j()) {
                return;
            }
            this.c.b = true;
            try {
                CronetUrlRequest cronetUrlRequest = this.c;
                cronetUrlRequest.d.onRedirectReceived(cronetUrlRequest, this.a, this.b);
            } catch (Exception e) {
                this.c.e(e);
            }
        }
    }
}
