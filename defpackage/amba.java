package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amba {
    public static final amxj a = amxj.l("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final Context b;
    public final anib c;
    public final anic d;
    public final Map e;
    public final uyg f;
    private final PowerManager g;
    private final anic h;
    private boolean i;

    public amba(Context context, PowerManager powerManager, anib anibVar, Map map, anic anicVar, anic anicVar2, uyg uygVar) {
        amkq.x(new amnv() { // from class: amau
            @Override // defpackage.amnv
            public final Object get() {
                amba ambaVar = amba.this;
                String a2 = uye.a(ambaVar.b);
                String substring = ambaVar.f.a() ? "main_process_service_key" : a2.substring(a2.lastIndexOf(":") + 1);
                substring.getClass();
                amkq.Q(ambaVar.e.containsKey(substring), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", substring);
                return new Intent(ambaVar.b, (Class<?>) ((azrw) ambaVar.e.get(substring)).get());
            }
        });
        this.i = false;
        this.b = context;
        this.g = powerManager;
        this.c = anibVar;
        this.d = anicVar;
        this.h = anicVar2;
        this.e = map;
        this.f = uygVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(anhy anhyVar, String str, Object[] objArr) {
        try {
            anaf.W(anhyVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((amxh) ((amxh) ((amxh) a.f()).h(e.getCause())).i("com/google/apps/tiktok/concurrent/AndroidFutures", "lambda$logOnFailure$3", 324, "AndroidFutures.java")).w(str, objArr);
        }
    }

    public static void b(final anhy anhyVar, final String str, final Object... objArr) {
        anhyVar.d(amjk.f(new Runnable() { // from class: amax
            @Override // java.lang.Runnable
            public final void run() {
                amba.a(anhy.this, str, objArr);
            }
        }), angq.a);
    }

    public final void c(anhy anhyVar) {
        amir a2 = amjw.a();
        String g = a2 == null ? "<no trace>" : amjw.g(a2);
        if (anhyVar.isDone()) {
            return;
        }
        try {
            final PowerManager.WakeLock newWakeLock = this.g.newWakeLock(1, g);
            newWakeLock.acquire();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            anhy P = anaf.P(anhyVar);
            anaf.Y(anaf.V(P, 45L, timeUnit, this.d), amjk.e(new amaz(P, g)), angq.a);
            anhy V = anaf.V(anaf.P(anhyVar), 3600L, TimeUnit.SECONDS, this.h);
            newWakeLock.getClass();
            V.d(new Runnable() { // from class: amav
                @Override // java.lang.Runnable
                public final void run() {
                    newWakeLock.release();
                }
            }, angq.a);
        } catch (SecurityException e) {
            if (this.i) {
                return;
            }
            try {
                PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String str : packageInfo.requestedPermissions) {
                        if ("android.permission.WAKE_LOCK".equals(str)) {
                            this.i = true;
                            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", (char) 154, "AndroidFutures.java")).q("Failed to acquire wakelock");
                            return;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            throw e;
        }
    }
}
