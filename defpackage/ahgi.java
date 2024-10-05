package defpackage;

import com.google.vr.sdk.base.GvrView;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahgi implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ ahgl b;

    public ahgi(ahgl ahglVar, CountDownLatch countDownLatch) {
        this.b = ahglVar;
        this.a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GvrView.StereoRenderer stereoRenderer;
        ahgk ahgkVar = this.b.b;
        if (ahgkVar.b && (stereoRenderer = ahgkVar.a) != null) {
            stereoRenderer.onRendererShutdown();
        }
        this.b.a.onDestroy();
        this.a.countDown();
    }
}
