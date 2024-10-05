package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqw implements adqo, adrf {
    private static final String d = zga.a("MDX.transport");
    private static final long e = TimeUnit.SECONDS.toMillis(2);
    int b;
    Handler c;
    private final adqo f;
    private HandlerThread g;
    private final acpl h;
    final Map a = new HashMap(100);
    private final AtomicInteger i = new AtomicInteger(0);
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);

    public adqw(adqo adqoVar, acpl acplVar) {
        this.f = adqoVar;
        this.h = acplVar;
    }

    private final synchronized void e() {
        aone createBuilder = atad.a.createBuilder();
        int andSet = this.j.getAndSet(0);
        createBuilder.copyOnWrite();
        atad atadVar = (atad) createBuilder.instance;
        atadVar.b |= 2;
        atadVar.d = andSet;
        int andSet2 = this.l.getAndSet(0);
        createBuilder.copyOnWrite();
        atad atadVar2 = (atad) createBuilder.instance;
        atadVar2.b |= 8;
        atadVar2.f = andSet2;
        int andSet3 = this.i.getAndSet(0);
        createBuilder.copyOnWrite();
        atad atadVar3 = (atad) createBuilder.instance;
        atadVar3.b |= 1;
        atadVar3.c = andSet3;
        int andSet4 = this.k.getAndSet(0);
        createBuilder.copyOnWrite();
        atad atadVar4 = (atad) createBuilder.instance;
        atadVar4.b |= 4;
        atadVar4.e = andSet4;
        atad atadVar5 = (atad) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cY(atadVar5);
        this.h.c((arpp) a.build());
    }

    private final synchronized void f() {
        if (j(this.b)) {
            int i = this.b + 1;
            this.b = i;
            String.format("Now expected MSN(%d)", Integer.valueOf(i));
            f();
        }
    }

    private final synchronized void g(adqz adqzVar) {
        if (this.g == null) {
            this.b = adqzVar.a();
            HandlerThread handlerThread = new HandlerThread(getClass().getName(), 10);
            this.g = handlerThread;
            handlerThread.start();
            this.c = new Handler(this.g.getLooper());
            String.format("Starting with MSN(%d): %s", Integer.valueOf(this.b), adqzVar);
            b(adqzVar);
        }
    }

    private final synchronized boolean h(adqz adqzVar) {
        Runnable runnable;
        if (this.a.size() == 100) {
            String.format("Queue too big, dropping message: %s", adqzVar);
            this.i.incrementAndGet();
            return false;
        }
        final int a = adqzVar.a();
        if (a >= this.b) {
            Map map = this.a;
            Integer valueOf = Integer.valueOf(a);
            if (!map.containsKey(valueOf)) {
                String.format("Queueing MSN(%d): %s", valueOf, adqzVar);
                Runnable runnable2 = new Runnable() { // from class: adqt
                    @Override // java.lang.Runnable
                    public final void run() {
                        adqw.this.c(a);
                    }
                };
                Map map2 = this.a;
                adqu adquVar = new adqu();
                adquVar.b = runnable2;
                if (adqzVar != null) {
                    adquVar.a = adqzVar;
                    adqz adqzVar2 = adquVar.a;
                    if (adqzVar2 != null && (runnable = adquVar.b) != null) {
                        map2.put(valueOf, new adqv(adqzVar2, runnable));
                        this.j.incrementAndGet();
                        Handler handler = this.c;
                        if (handler != null) {
                            handler.postDelayed(runnable2, e);
                        }
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (adquVar.a == null) {
                        sb.append(" message");
                    }
                    if (adquVar.b == null) {
                        sb.append(" timeoutRunnable");
                    }
                    String valueOf2 = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf2);
                    throw new IllegalStateException(sb2.toString());
                }
                throw new NullPointerException("Null message");
            }
        }
        this.l.incrementAndGet();
        String.format("Dropping MSN(%d): %s", Integer.valueOf(a), adqzVar);
        return false;
    }

    private final synchronized boolean i() {
        return this.g != null;
    }

    private final synchronized boolean j(int i) {
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
        adqv adqvVar = (adqv) map.remove(valueOf);
        if (adqvVar == null) {
            return false;
        }
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacks(adqvVar.b);
        }
        String.format("Processing deduped message MSN(%d): %s", valueOf, adqvVar.a);
        this.f.b(adqvVar.a);
        return true;
    }

    @Override // defpackage.adrf
    public final void a(adqz adqzVar) {
        try {
            g(adqzVar);
        } catch (JSONException unused) {
            zga.c(d, String.format("Invalid format for Session Status: %s", adqzVar));
        }
    }

    @Override // defpackage.adqo
    public final void b(adqz adqzVar) {
        if (!i() || !adqzVar.b.has("senderMsn")) {
            this.f.b(adqzVar);
        } else if (h(adqzVar)) {
            f();
        }
    }

    public final synchronized void c(int i) {
        this.k.incrementAndGet();
        String.format("Cleaning MSN(%d)", Integer.valueOf(i));
        for (int i2 = this.b; i2 <= i; i2++) {
            try {
                j(i2);
            } catch (JSONException e2) {
                zga.f(d, String.format("Problem cleaning MSN(%d)", Integer.valueOf(i2)), e2);
            }
        }
        int i3 = i + 1;
        this.b = i3;
        String.format("Now expected MSN(%d)", Integer.valueOf(i3));
        try {
            f();
        } catch (JSONException e3) {
            zga.f(d, "Problem processing the queue", e3);
        }
    }

    public final synchronized void d() {
        HandlerThread handlerThread = this.g;
        if (handlerThread != null) {
            handlerThread.quit();
            this.g = null;
            this.c = null;
            this.a.clear();
            e();
        }
    }
}
