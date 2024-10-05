package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvh {
    qmt a;
    boolean b;
    final Object c = new Object();
    pvf d;
    final long e;
    pvi f;
    private final Context g;

    public pvh(Context context, long j, boolean z) {
        Context applicationContext;
        qip.an(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.g = context;
        this.b = false;
        this.e = j;
    }

    public static pvg a(Context context) {
        pvh pvhVar = new pvh(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            pvhVar.c(false);
            pvg d = pvhVar.d();
            e(d, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return d;
        } finally {
        }
    }

    static final void e(pvg pvgVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (pvgVar != null) {
                hashMap.put("limit_ad_tracking", true != pvgVar.b ? "0" : "1");
                String str = pvgVar.a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new pve(hashMap).start();
        }
    }

    private final void f() {
        synchronized (this.c) {
            pvf pvfVar = this.d;
            if (pvfVar != null) {
                pvfVar.a.countDown();
                try {
                    this.d.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.e;
            if (j > 0) {
                this.d = new pvf(this, j);
            }
        }
    }

    public final void b() {
        qip.au("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.g == null || this.a == null) {
                return;
            }
            try {
                if (this.b) {
                    qtj.a().b(this.g, this.a);
                }
            } catch (Throwable unused) {
            }
            this.b = false;
            this.f = null;
            this.a = null;
        }
    }

    public final void c(boolean z) {
        qip.au("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.b) {
                b();
            }
            Context context = this.g;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h = qmz.d.h(context, 12451000);
                if (h != 0 && h != 2) {
                    throw new IOException("Google Play services not available");
                }
                qmt qmtVar = new qmt(0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!qtj.a().c(context, intent, qmtVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.a = qmtVar;
                    try {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        qip.au("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                        if (qmtVar.a) {
                            throw new IllegalStateException("Cannot call get on this connection more than once");
                        }
                        qmtVar.a = true;
                        IBinder iBinder = (IBinder) qmtVar.b.poll(10000L, timeUnit);
                        if (iBinder == null) {
                            throw new TimeoutException("Timed out waiting for the service connection");
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.f = queryLocalInterface instanceof pvi ? (pvi) queryLocalInterface : new pvi(iBinder);
                        this.b = true;
                        if (z) {
                            f();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new qnk(9);
            }
        }
    }

    public final pvg d() {
        pvg pvgVar;
        qip.au("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.b) {
                synchronized (this.c) {
                    pvf pvfVar = this.d;
                    if (pvfVar == null || !pvfVar.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    c(false);
                    if (!this.b) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            qip.an(this.a);
            qip.an(this.f);
            try {
                pvi pviVar = this.f;
                Parcel po = pviVar.po(1, pviVar.pn());
                String readString = po.readString();
                po.recycle();
                pvi pviVar2 = this.f;
                Parcel pn = pviVar2.pn();
                ecr.e(pn, true);
                Parcel po2 = pviVar2.po(2, pn);
                boolean j = ecr.j(po2);
                po2.recycle();
                pvgVar = new pvg(readString, j);
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        f();
        return pvgVar;
    }

    protected final void finalize() {
        b();
        super.finalize();
    }
}
