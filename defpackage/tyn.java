package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyn implements Application.ActivityLifecycleCallbacks {
    public final axpg a;
    public final axpg b;
    public final axpg c;
    public final axpg d;
    private final axpg e;

    public tyn(axpg axpgVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4, axpg axpgVar5) {
        this.e = axpgVar;
        this.a = axpgVar2;
        this.b = axpgVar3;
        this.c = axpgVar4;
        this.d = axpgVar5;
    }

    private final void a(Activity activity, Intent intent) {
        if (intent.getBooleanExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", false)) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", true);
        tyo.j(activity.getApplicationContext());
        final String x = tyo.x(intent);
        final String A = tyo.A(intent);
        final String z = tyo.z(intent);
        final aokw w = tyo.w(intent);
        final aohq v = tyo.v(intent);
        if (A != null || z != null) {
            final int J2 = tyo.J(intent);
            String y = tyo.y(intent);
            if (y.startsWith("com.google.android.libraries.notifications.ACTION_ID:")) {
                y = y.replaceFirst("com.google.android.libraries.notifications.ACTION_ID:", "");
            }
            final String str = y;
            ((tyu) this.e.get()).b(new Runnable() { // from class: tym
                @Override // java.lang.Runnable
                public final void run() {
                    List b;
                    tyn tynVar = tyn.this;
                    String str2 = x;
                    String str3 = A;
                    String str4 = z;
                    int i = J2;
                    String str5 = str;
                    aokw aokwVar = w;
                    aohq aohqVar = v;
                    int threadPriority = Process.getThreadPriority(0);
                    try {
                        Process.setThreadPriority(10);
                        twu b2 = str2 == null ? null : ((twx) tynVar.b.get()).b(str2);
                        if (str3 != null) {
                            b = ((txq) tynVar.a.get()).c(str2, str3);
                        } else {
                            b = ((txq) tynVar.a.get()).b(str2, str4);
                        }
                        for (ucp ucpVar : (Set) tynVar.d.get()) {
                            amru.o(b);
                            ucpVar.g();
                        }
                        tzt tztVar = (tzt) tynVar.c.get();
                        tyq l = tyr.l();
                        l.f(tys.SYSTEM_TRAY);
                        l.h(i);
                        l.a = str5;
                        l.b = b2;
                        l.b(b);
                        l.g(aokwVar);
                        l.e(aohqVar);
                        l.c(true);
                        tztVar.b(l.a());
                    } catch (tww e) {
                        tzk.c("ThreadUpdateActivityLifecycleCallback", e, "Failed to update notification. Account not found: [%s].", str2);
                    } finally {
                        Process.setThreadPriority(threadPriority);
                    }
                }
            });
            tzk.e("ThreadUpdateActivityLifecycleCallback", "Scheduled job to handle thread update.", new Object[0]);
        }
        tzk.e("ThreadUpdateActivityLifecycleCallback", "Marking thread update as handled.", new Object[0]);
    }

    private static boolean b(Intent intent) {
        return tyo.y(intent) != null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        tyo.j(activity);
        Intent intent = activity.getIntent();
        if (intent != null && b(intent) && intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) == 1) {
            a(activity, intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && b(intent) && intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) == 0) {
            a(activity, intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
