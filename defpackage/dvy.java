package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dvy implements Runnable {
    private static final long f = TimeUnit.SECONDS.toMillis(3600);
    private static final long g = TimeUnit.SECONDS.toMillis(30);
    private static final Object h = new Object();
    private static dvy i;
    public long d;
    public final trp e;
    private final long j;
    private final long k;
    private final Context l;
    private final HandlerThread m;
    private final SharedPreferences n;
    private final Handler o;
    public final Object a = new Object();
    public final Map c = new HashMap();
    public final Set b = new HashSet();

    public dvy(Context context, long j, long j2, trp trpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.l = context;
        this.k = j;
        this.j = j2;
        this.e = trpVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("google_auto_usage", 0);
        this.n = sharedPreferences;
        if (this.d == 0) {
            this.d = sharedPreferences.getLong("end_of_interval", dwg.a() + j);
        }
        HandlerThread handlerThread = new HandlerThread("Google Conversion SDK", 10);
        this.m = handlerThread;
        handlerThread.start();
        this.o = new Handler(handlerThread.getLooper());
        d();
    }

    public static dvy a(Context context) {
        synchronized (h) {
            if (i == null) {
                try {
                    i = new dvy(context, f, g, new trp(context, (byte[]) null, (short[]) null), null, null, null);
                } catch (Exception e) {
                    Log.e("GoogleConversionReporter", "Error starting automated usage thread", e);
                }
            }
        }
        return i;
    }

    private final long c() {
        long a = dwg.a();
        long j = this.d;
        return j + ((a >= j ? ((a - j) / this.k) + 1 : 0L) * this.k);
    }

    private final void d() {
        synchronized (this.a) {
            b(c() - dwg.a());
        }
    }

    protected final void b(long j) {
        synchronized (this.a) {
            this.o.removeCallbacks(this);
            this.o.postDelayed(this, j);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager activityManager = (ActivityManager) this.l.getSystemService("activity");
        KeyguardManager keyguardManager = (KeyguardManager) this.l.getSystemService("keyguard");
        PowerManager powerManager = (PowerManager) this.l.getSystemService("power");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn()) {
                    synchronized (this.a) {
                        for (Map.Entry entry : this.c.entrySet()) {
                            String str = (String) entry.getKey();
                            long longValue = ((Long) entry.getValue()).longValue();
                            long j = this.d;
                            if (longValue < j) {
                                entry.setValue(Long.valueOf(j));
                                this.e.o(str, this.d);
                            }
                        }
                    }
                    d();
                    long c = c();
                    this.n.edit().putLong("end_of_interval", c).commit();
                    this.d = c;
                    return;
                }
            }
        }
        b(this.j);
    }
}
