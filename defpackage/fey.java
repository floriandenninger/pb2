package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fey implements few {
    private final Context a;
    private final shf b;

    public fey(Context context, shf shfVar) {
        this.a = context;
        this.b = shfVar;
    }

    @Override // defpackage.few
    public final ynz a() {
        List<ActivityManager.AppTask> appTasks;
        ActivityManager.RecentTaskInfo taskInfo;
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null || appTasks.isEmpty() || (taskInfo = appTasks.get(0).getTaskInfo()) == null) {
            return null;
        }
        try {
            Field declaredField = taskInfo.getClass().getDeclaredField("firstActiveTime");
            declaredField.setAccessible(true);
            long j = declaredField.getLong(taskInfo);
            if (j <= 0 || j >= this.b.c()) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("valueInCurrentMillis bad value: ");
                sb.append(j);
                throw new yoa(sb.toString());
            }
            return new fex(this.b.d() + (j - this.b.c()));
        } catch (Exception e) {
            afsi.c(2, 18, "Failed to obtain process fork time using RecentTaskInfo", e);
            return null;
        }
    }

    @Override // defpackage.few
    public final void b(actg actgVar) {
        if (c()) {
            actgVar.h(fex.class, "proc_tt");
        }
    }

    @Override // defpackage.few
    public final boolean c() {
        return Build.VERSION.SDK_INT < 29;
    }
}
