package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aloh {
    private static aloh b;
    public final Context a;

    public aloh(Context context) {
        this.a = context;
    }

    public aloh(Context context, byte[] bArr) {
        this.a = context;
    }

    public aloh(Context context, byte[] bArr, byte[] bArr2) {
        this.a = context;
    }

    public aloh(Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
    }

    public aloh(Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
    }

    public aloh(Context context, char[] cArr) {
        this.a = context;
    }

    public aloh(Context context, char[] cArr, byte[] bArr) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += a(file2);
            }
        }
        return j;
    }

    public static final void f(Activity activity) {
        vlu.j(activity, 42, vlu.i(vzn.a, new vzn[0]), "com.google.android.apps.wellbeing.action.REQUEST_ACCESS");
    }

    public static final void g(Activity activity) {
        vlu.j(activity, 43, vlu.i(vzn.a, new vzn[0]), "com.google.android.apps.wellbeing.action.WITHDRAW_ACCESS");
    }

    public static boolean i(ujb ujbVar) {
        return ujbVar.c;
    }

    public static synchronized void q() {
        synchronized (aloh.class) {
            b = null;
        }
    }

    public static synchronized aloh s(Context context) {
        aloh alohVar;
        synchronized (aloh.class) {
            Context f = rbd.f(context);
            aloh alohVar2 = b;
            if (alohVar2 == null || alohVar2.a != f) {
                aloh alohVar3 = null;
                try {
                    PackageInfo packageInfo = f.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    if (!qnn.b(f).c(packageInfo)) {
                        String valueOf = String.valueOf(packageInfo.packageName);
                        Log.e("InstantAppsApi", valueOf.length() != 0 ? "Incorrect signature for package ".concat(valueOf) : new String("Incorrect signature for package "));
                    } else {
                        PackageManager packageManager = f.getPackageManager();
                        String authority = raf.a.getAuthority();
                        qip.an(authority);
                        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(authority, 0);
                        if (resolveContentProvider != null) {
                            if (!resolveContentProvider.packageName.equals("com.google.android.gms")) {
                                String str = resolveContentProvider.packageName;
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85);
                                sb.append("Package ");
                                sb.append(str);
                                sb.append(" is invalid for instant apps content provider; instant apps will be disabled.");
                                Log.e("IAMetadataClient", sb.toString());
                            } else {
                                alohVar3 = new aloh(f, (char[]) null, (byte[]) null);
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                b = alohVar3;
            }
            alohVar = b;
        }
        return alohVar;
    }

    public final void b(boolean z, String str, aone aoneVar) {
        String valueOf = String.valueOf(this.a.getDir("youtube_upload", 0));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        String sb2 = sb.toString();
        if (z) {
            aoneVar.copyOnWrite();
            akzs akzsVar = (akzs) aoneVar.instance;
            akzs akzsVar2 = akzs.a;
            akzsVar.b |= 16777216;
            akzsVar.w = true;
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 12);
            sb3.append(sb2);
            sb3.append("working_dir/");
            String path = new File(sb3.toString()).getPath();
            aoneVar.copyOnWrite();
            akzs akzsVar3 = (akzs) aoneVar.instance;
            path.getClass();
            akzsVar3.d = 1 | akzsVar3.d;
            akzsVar3.al = path;
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 12);
            sb4.append(sb2);
            sb4.append("storage_dir/");
            String path2 = new File(sb4.toString()).getPath();
            aoneVar.copyOnWrite();
            akzs akzsVar4 = (akzs) aoneVar.instance;
            path2.getClass();
            akzsVar4.d |= 2;
            akzsVar4.am = path2;
            return;
        }
        String file = new File(sb2).toString();
        aoneVar.copyOnWrite();
        akzs akzsVar5 = (akzs) aoneVar.instance;
        akzs akzsVar6 = akzs.a;
        file.getClass();
        akzsVar5.d |= 1;
        akzsVar5.al = file;
    }

    public final void c(Bitmap bitmap, Bundle bundle, String str) {
        d(bitmap, bundle, str, null);
    }

    public final void d(Bitmap bitmap, Bundle bundle, String str, String str2) {
        qwk qwkVar = new qwk(this.a);
        qwkVar.e(new akri(bundle));
        if (bitmap != null) {
            qwkVar.d(bitmap);
        }
        if (str != null) {
            qwkVar.c = str;
        }
        if (str2 != null) {
            qwkVar.b = str2;
        }
        qwj.e(this.a).A(qwkVar.a());
    }

    public final pvg e() {
        return pvh.a(this.a);
    }

    public final Uri h(String str) {
        Context context = this.a;
        String format = String.format("%s.%s", context.getPackageName(), "photopicker_images");
        Context context2 = this.a;
        if (!context2.getCacheDir().exists()) {
            context2.getCacheDir().mkdirs();
        }
        File file = new File(context2.getCacheDir(), "photopicker_images");
        if (!file.exists()) {
            file.mkdirs();
        }
        return ev.a(context, format, new File(file, str));
    }

    public final rfp k() {
        return rgt.i(this.a).aF();
    }

    public final void l() {
        rgt i = rgt.i(this.a);
        rfp aF = i.aF();
        ansv ansvVar = i.z;
        aF.k.a("Local AppMeasurementService is starting up");
    }

    public final void m() {
        rgt i = rgt.i(this.a);
        rfp aF = i.aF();
        ansv ansvVar = i.z;
        aF.k.a("Local AppMeasurementService is shutting down");
    }

    public final void n(Intent intent) {
        if (intent == null) {
            k().c.a("onRebind called with null intent");
        } else {
            k().k.b("onRebind called. action", intent.getAction());
        }
    }

    public final void o(Runnable runnable) {
        rki q = rki.q(this.a);
        q.aG().g(new rjn(q, runnable));
    }

    public final void p(Intent intent) {
        if (intent == null) {
            k().c.a("onUnbind called with null intent");
        } else {
            k().k.b("onUnbind called for intent. action", intent.getAction());
        }
    }

    public final Intent r() {
        return new Intent(this.a, (Class<?>) WatchWhileActivity.class);
    }

    public final ammv j() {
        ammv j;
        ammv j2;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                int i = Settings.Global.getInt(this.a.getContentResolver(), "zen_mode");
                if (i == 0) {
                    j = ammv.j(uai.FILTER_ALL);
                } else if (i == 1) {
                    j = ammv.j(uai.FILTER_PRIORITY);
                } else if (i != 2) {
                    j = i != 3 ? amlr.a : ammv.j(uai.FILTER_ALARMS);
                } else {
                    j = ammv.j(uai.FILTER_NONE);
                }
                tzk.e("InterruptionFilterStateImpl", "Current is %s (SDK < M, zen_mode == %s).", j, Integer.valueOf(i));
                return j;
            } catch (Settings.SettingNotFoundException unused) {
                tzk.e("InterruptionFilterStateImpl", "Current unknown (SDK < M, zen_mode missing).", new Object[0]);
                return amlr.a;
            }
        }
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
        if (notificationManager == null) {
            tzk.e("InterruptionFilterStateImpl", "Current unknown (SDK >= M, NotificationManager missing).", new Object[0]);
            return amlr.a;
        }
        int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
        if (currentInterruptionFilter == 1) {
            j2 = ammv.j(uai.FILTER_ALL);
        } else if (currentInterruptionFilter == 2) {
            j2 = ammv.j(uai.FILTER_PRIORITY);
        } else if (currentInterruptionFilter != 3) {
            j2 = currentInterruptionFilter != 4 ? amlr.a : ammv.j(uai.FILTER_ALARMS);
        } else {
            j2 = ammv.j(uai.FILTER_NONE);
        }
        tzk.e("InterruptionFilterStateImpl", "Current is %s (SDK >= M, NotificationManager's interruption filter == %s).", j2, Integer.valueOf(currentInterruptionFilter));
        return j2;
    }
}
