package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ura implements uoc, uob, uoj {
    private final Window.OnFrameMetricsAvailableListener a;
    private Activity b;
    private boolean c;
    private Handler d;

    public ura(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        this.a = onFrameMetricsAvailableListener;
    }

    private final void e() {
        Activity activity = this.b;
        if (activity != null) {
            Window window = activity.getWindow();
            Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.a;
            if (this.d == null) {
                HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                handlerThread.start();
                this.d = new Handler(handlerThread.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.d);
        }
    }

    private final void f() {
        amxj amxjVar;
        Activity activity = this.b;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
            } catch (RuntimeException e) {
                amxjVar = urb.a;
                ((amxh) ((amxh) ((amxh) amxjVar.c()).h(e)).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl$OnResumedBasedActivityTracker", "detachFromCurrentActivity", (char) 134, "FrameMetricServiceImpl.java")).q("remove frame metrics listener failed");
            }
        }
    }

    @Override // defpackage.uoc
    public void a(Activity activity) {
        synchronized (this) {
            this.b = activity;
            if (this.c) {
                e();
            }
        }
    }

    @Override // defpackage.uob
    public void b(Activity activity) {
        synchronized (this) {
            if (this.c) {
                f();
            }
            this.b = null;
        }
    }

    public void d() {
        synchronized (this) {
            this.c = false;
            f();
        }
    }

    public void c() {
        amxj amxjVar;
        synchronized (this) {
            this.c = true;
            if (this.b != null) {
                e();
            } else {
                amxjVar = urb.a;
                ((amxh) ((amxh) amxjVar.c()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl$OnResumedBasedActivityTracker", "startCollecting", 166, "FrameMetricServiceImpl.java")).q("No activity");
            }
        }
    }
}
