package defpackage;

import android.os.Handler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktd {
    public final long a;
    public final long b;
    public final long c;
    public final akst d;
    public final Handler e;
    public final AtomicReference f;
    final AtomicReference g;
    public final aktg h;
    public ScheduledExecutorService i;

    public aktd(aktg aktgVar, akst akstVar, yxx yxxVar, azrw azrwVar, azrw azrwVar2) {
        this.h = aktgVar;
        yyy yyyVar = aktgVar.e;
        this.a = yyyVar.b();
        this.b = yyyVar.a(yyy.f, 50, 50);
        this.c = Math.max(yyyVar.a(yyy.g, 50, 50), 50L);
        this.d = akstVar;
        this.i = aktgVar.a;
        int f = (int) yxxVar.f(yxx.Q);
        if (f == 1) {
            this.i = (ScheduledExecutorService) azrwVar2.get();
        } else if (f == 2) {
            this.i = (ScheduledExecutorService) azrwVar.get();
        } else if (f == 3) {
            this.i = Executors.newScheduledThreadPool(1, new yna(-1, "anrV2"));
        } else if (f == 5) {
            this.i = Executors.newScheduledThreadPool(1, new yna(0, "anrV2Critical"));
        } else if (f == 6) {
            this.i = Executors.newScheduledThreadPool(1, new yna(1, "anrV2Background"));
        }
        this.e = new Handler(aktgVar.b.getMainLooper());
        this.f = new AtomicReference();
        this.g = new AtomicReference(new aksx(aktgVar.d.g(), false));
    }
}
