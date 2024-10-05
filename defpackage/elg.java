package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.ConditionVariable;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class elg implements elf {
    private final Context c;
    private final Object d = new Object();
    private final ConditionVariable e = new ConditionVariable();
    private final ConditionVariable f = new ConditionVariable();
    int a = 0;
    int b = 0;

    public elg(Context context) {
        this.c = context;
    }

    private final boolean d(Intent intent, String str, Class cls) {
        String name = cls.getName();
        if (name.equals(str)) {
            return true;
        }
        ResolveInfo resolveActivity = this.c.getPackageManager().resolveActivity(intent, 65536);
        return (resolveActivity == null || resolveActivity.activityInfo == null || !name.equals(resolveActivity.activityInfo.targetActivity)) ? false : true;
    }

    @Override // defpackage.elf
    public final int a() {
        ActivityManager.RecentTaskInfo taskInfo;
        Intent intent;
        ComponentName component;
        String className;
        if (this.a == 0) {
            synchronized (this.d) {
                if (this.a == 0) {
                    ActivityManager activityManager = (ActivityManager) this.c.getSystemService("activity");
                    List<ActivityManager.AppTask> appTasks = activityManager == null ? null : activityManager.getAppTasks();
                    int i = 0;
                    if (appTasks != null) {
                        if (appTasks.isEmpty()) {
                            i = 3;
                        } else {
                            ActivityManager.AppTask appTask = appTasks.get(0);
                            if (appTask != null && (taskInfo = appTask.getTaskInfo()) != null && taskInfo.baseIntent != null && (intent = taskInfo.baseIntent) != null && (component = intent.getComponent()) != null && (className = component.getClassName()) != null) {
                                if (d(intent, className, Shell_HomeActivity.class)) {
                                    i = 1;
                                } else {
                                    i = d(intent, className, Shell_UrlActivity.class) ? 2 : 5;
                                }
                            }
                        }
                    }
                    this.a = i;
                    this.e.open();
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.elf
    public final void b(int i) {
        synchronized (this.d) {
            if (this.b == 0) {
                this.b = i;
                String.format(Locale.US, "Startup earlyDetected:%d detected:%d", Integer.valueOf(this.a), Integer.valueOf(this.b));
                int i2 = this.a;
                if (i2 != 0 && i2 != this.b) {
                    afsi.b(1, 18, String.format(Locale.US, "ColdStartTypeDetector mismatch earlyDetected:%d detected:%d", Integer.valueOf(this.a), Integer.valueOf(this.b)));
                }
            }
            this.f.open();
        }
    }

    @Override // defpackage.acsn
    public final void c() {
        b(3);
    }
}
