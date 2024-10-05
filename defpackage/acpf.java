package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpf {
    public static final String a = "acpf";
    public final shf b;
    public final azrw c;
    private final Context d;

    public acpf(Context context, shf shfVar, azrw azrwVar) {
        this.d = context;
        this.b = shfVar;
        this.c = azrwVar;
    }

    public final Map a(afqj afqjVar) {
        HashMap hashMap = new HashMap();
        Map b = afqjVar.b();
        hashMap.put("client.device.brand", (String) b.get("cbrand"));
        hashMap.put("client.device.model", (String) b.get("cmodel"));
        hashMap.put("client.device.os", (String) b.get("cos"));
        hashMap.put("client.device.os_version", (String) b.get("cosver"));
        hashMap.put("client.device.platform", (String) b.get("cplatform"));
        hashMap.put("client.name", ((String) b.get("c")).toUpperCase(Locale.getDefault()));
        hashMap.put("client.version", (String) b.get("cver"));
        PackageManager packageManager = this.d.getPackageManager();
        String packageName = this.d.getPackageName();
        int i = 0;
        try {
            hashMap.put("client.versionCode", Integer.toString(packageManager.getPackageInfo(packageName, 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            zga.f(a, "Failed to look up PackageInfo; unable to determine app versionCode", e);
        }
        try {
            i = packageManager.getApplicationInfo(packageName, 128).metaData.getInt("com.google.android.apps.youtube.config.BuildChangelist");
        } catch (PackageManager.NameNotFoundException e2) {
            zga.f(a, "Failed to look up ApplicationInfo; unable to determine build changelist", e2);
        }
        if (i != 0) {
            hashMap.put("client.build.changelist", Integer.toString(i));
        }
        return hashMap;
    }

    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(new acpe(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    public final void d(Executor executor) {
        ynm.i(anfq.h(((ywr) this.c.get()).a(), new aard(18), executor), new ynl() { // from class: acpb
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                acpf acpfVar = acpf.this;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    zga.j(acpf.a, "Sending Crash from last run...", th);
                    afsi.c(2, 2, th.getMessage(), th);
                }
                ynm.m(((ywr) acpfVar.c.get()).b(aard.p), abbr.c);
            }
        });
    }
}
