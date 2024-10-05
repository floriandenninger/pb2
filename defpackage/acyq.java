package defpackage;

import java.net.MulticastSocket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acyq implements Runnable {
    final /* synthetic */ acys a;
    private final List b;
    private final MulticastSocket c;

    public acyq(acys acysVar, List list, MulticastSocket multicastSocket) {
        this.a = acysVar;
        this.b = list;
        this.c = multicastSocket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = 9400;
        for (Future future : this.b) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                future.get(j, TimeUnit.MILLISECONDS);
                j = Math.max(0L, j - (System.currentTimeMillis() - currentTimeMillis));
            } catch (InterruptedException e) {
                e = e;
                zga.f(acys.a, "Error waiting for reading device response task to complete", e);
            } catch (ExecutionException e2) {
                e = e2;
                zga.f(acys.a, "Error waiting for reading device response task to complete", e);
            } catch (TimeoutException e3) {
                zga.f(acys.a, "Timed out waiting for device response", e3);
                future.cancel(true);
            }
        }
        Iterator it = this.a.k.keySet().iterator();
        while (it.hasNext()) {
            if (!this.a.j.contains((String) it.next())) {
                it.remove();
            }
        }
        this.c.close();
        this.a.a();
        this.a.l = false;
    }
}
