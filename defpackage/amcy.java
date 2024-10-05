package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcy extends bzm {
    private static final amxj a = amxj.l("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final Map b;
    private final amiu c;

    public amcy(Map map, amiu amiuVar) {
        this.b = map;
        this.c = amiuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [amij, amir] */
    @Override // defpackage.bzm
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        azrw azrwVar;
        ?? c = this.c.c("WorkerFactory.createWorker()");
        try {
            if (str.equals(TikTokListenableWorker.class.getName())) {
                aeb aebVar = new aeb(workerParameters.c.size());
                for (String str2 : workerParameters.c) {
                    if (str2.startsWith("TikTokWorker#")) {
                        aebVar.add(str2.replace("TikTokWorker#", ""));
                    }
                }
                String str3 = (String) amkq.bk(aebVar);
                azrwVar = (azrw) this.b.get(str3);
                if (azrwVar == null) {
                    ((amxh) ((amxh) a.f()).i("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 59, "TikTokWorkerFactory.java")).s("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str3);
                }
            } else {
                azrwVar = (azrw) this.b.get(str);
                if (azrwVar != null) {
                    Set set = workerParameters.c;
                    String valueOf = String.valueOf(str);
                    set.add(valueOf.length() != 0 ? "TikTokWorker#".concat(valueOf) : new String("TikTokWorker#"));
                }
            }
            if (azrwVar == null) {
                amjw.i(c);
                return null;
            }
            TikTokListenableWorker tikTokListenableWorker = new TikTokListenableWorker(context, this.c, (amcu) azrwVar.get(), workerParameters);
            amjw.i(c);
            return tikTokListenableWorker;
        } catch (Throwable th) {
            try {
                amjw.i(c);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
