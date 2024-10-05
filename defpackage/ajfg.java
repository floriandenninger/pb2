package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.chromium.base.ApplicationStatus;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajfg implements Runnable {
    private final /* synthetic */ int j;
    public static final ajfg i = new ajfg(18);
    public static final /* synthetic */ ajfg h = new ajfg(14);
    public static final /* synthetic */ ajfg g = new ajfg(13);
    public static final /* synthetic */ ajfg f = new ajfg(12);
    public static final /* synthetic */ ajfg e = new ajfg(11);
    public static final /* synthetic */ ajfg d = new ajfg(9);
    public static final /* synthetic */ ajfg c = new ajfg(8);
    public static final /* synthetic */ ajfg b = new ajfg(2);
    public static final /* synthetic */ ajfg a = new ajfg(0);

    public /* synthetic */ ajfg(int i2) {
        this.j = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.j) {
            case 0:
                int i2 = ajfh.a;
                aoes.c("yoga", new String[0]);
                return;
            case 1:
                Looper.myLooper().quit();
                return;
            case 2:
                ajku.a.d();
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return;
            case 11:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            case 12:
                return;
            case 13:
                amjw.h = null;
                return;
            case 14:
                Object remove = amjw.b.remove();
                if (remove == amjw.d) {
                    amjw.c.pop();
                    return;
                } else {
                    amjw.c.push((amir) remove);
                    return;
                }
            case 15:
            case 16:
                return;
            case 17:
                ArrayList arrayList = new ArrayList(azph.d.keySet());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) arrayList.get(i3);
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        azph.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            case 18:
                return;
            case 19:
                if (ApplicationStatus.a != null) {
                    return;
                }
                ApplicationStatus.a = new badm();
                ApplicationStatus.a(ApplicationStatus.a);
                return;
            default:
                new baen();
                return;
        }
    }
}
