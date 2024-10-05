package defpackage;

import com.google.vr.sdk.base.GvrView;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahgo implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ ahgq b;

    public ahgo(ahgq ahgqVar, CountDownLatch countDownLatch) {
        this.b = ahgqVar;
        this.a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GvrView.Renderer renderer = this.b.d;
        if (renderer != null) {
            renderer.onRendererShutdown();
        }
        this.a.countDown();
    }
}
