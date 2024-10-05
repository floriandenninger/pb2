package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amat extends Service {
    private anhy a = anaf.O(null);
    private int b = -1;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = ((amas) axfq.n(getApplicationContext(), amas.class)).gO().e.entrySet().iterator();
        while (it.hasNext()) {
            printWriter.println((String) ((Map.Entry) it.next()).getValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        if (this.a.isDone()) {
            return;
        }
        ambb gO = ((amas) axfq.n(getApplicationContext(), amas.class)).gO();
        int i = this.b;
        int a = ambb.a(gO.c.get());
        if (i != a) {
            return;
        }
        do {
            j = gO.c.get();
            if (ambb.a(j) != a) {
                return;
            }
        } while (!gO.c.compareAndSet(j, ambb.a(r1 + 1)));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, final int i2) {
        anhy O;
        if ((i & 2) == 0 && intent != null) {
            ambb gO = ((amas) axfq.n(getApplicationContext(), amas.class)).gO();
            amkq.J(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            amkq.J(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            amkq.J(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            if (gO.h.getMostSignificantBits() != longExtra || gO.h.getLeastSignificantBits() != longExtra2) {
                ((amxh) ((amxh) ambb.a.g()).i("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 222, "AndroidFuturesServiceCounter.java")).A(intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                O = anaf.O(null);
            } else {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (gO.d) {
                    O = (SettableFuture) gO.f.get(intExtra);
                    O.getClass();
                    if (O != ambb.b) {
                        gO.g.put(intExtra, O);
                    }
                    gO.f.remove(intExtra);
                }
            }
            this.a = O;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.d(new Runnable() { // from class: amar
            @Override // java.lang.Runnable
            public final void run() {
                amat.this.stopSelf(i2);
            }
        }, angq.a);
        return 2;
    }
}
