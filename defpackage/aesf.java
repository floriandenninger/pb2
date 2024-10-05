package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aesf extends IOException {
    private final Handler a;
    private boolean b;
    private final Set c;
    private final Runnable d;

    public aesf(int i) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = handler;
        this.b = true;
        this.c = new HashSet();
        Runnable runnable = new Runnable() { // from class: aese
            @Override // java.lang.Runnable
            public final void run() {
                aesf.this.b();
            }
        };
        this.d = runnable;
        handler.postDelayed(runnable, i);
    }

    public final synchronized void a(Runnable runnable) {
        if (this.b) {
            this.c.add(runnable);
        } else {
            this.a.post(runnable);
        }
    }

    public final synchronized void b() {
        this.b = false;
        this.a.removeCallbacks(this.d);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            this.a.post((Runnable) it.next());
        }
    }

    public final synchronized boolean c() {
        return this.b;
    }
}
