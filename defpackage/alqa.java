package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqa {
    private static final Map m = new HashMap();
    public final Context a;
    public boolean e;
    public final Intent f;
    public final alpw g;
    public ServiceConnection j;
    public IInterface k;
    public final ammr l;
    private final String n;
    public final List b = new ArrayList();
    public final Set c = new HashSet();
    public final Object d = new Object();
    public final IBinder.DeathRecipient i = new IBinder.DeathRecipient() { // from class: alpr
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            alqa alqaVar = alqa.this;
            alpv alpvVar = (alpv) alqaVar.h.get();
            if (alpvVar == null) {
                Iterator it = alqaVar.b.iterator();
                while (it.hasNext()) {
                    ((alpq) it.next()).b(alqaVar.a());
                }
                alqaVar.b.clear();
            } else {
                alpvVar.a();
            }
            alqaVar.c();
        }
    };
    private final AtomicInteger o = new AtomicInteger(0);
    public final WeakReference h = new WeakReference(null);

    public alqa(Context context, ammr ammrVar, String str, Intent intent, alpw alpwVar, byte[] bArr) {
        this.a = context;
        this.l = ammrVar;
        this.n = str;
        this.f = intent;
        this.g = alpwVar;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.n).concat(" : Binder has died."));
    }

    public final void b(alpq alpqVar, alsf alsfVar) {
        synchronized (this.d) {
            this.c.add(alsfVar);
            alsc alscVar = alsfVar.a;
            alps alpsVar = new alps(this, alsfVar);
            alscVar.b.a(new alrt(alsh.a, alpsVar));
            alscVar.b();
        }
        synchronized (this.d) {
            this.o.getAndIncrement();
        }
        d(new alpt(this, alpqVar.d, alpqVar));
    }

    public final void c() {
        synchronized (this.d) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((alsf) it.next()).a(a());
            }
            this.c.clear();
        }
    }

    public final void d(alpq alpqVar) {
        Handler handler;
        Map map = m;
        synchronized (map) {
            if (!map.containsKey(this.n)) {
                HandlerThread handlerThread = new HandlerThread(this.n, 10);
                handlerThread.start();
                map.put(this.n, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.n);
        }
        handler.post(alpqVar);
    }

    public final void e() {
        synchronized (this.d) {
            if (this.o.decrementAndGet() > 0) {
                return;
            }
            d(new alpu(this));
        }
    }

    public final void f(alsf alsfVar) {
        synchronized (this.d) {
            this.c.remove(alsfVar);
        }
        e();
    }
}
