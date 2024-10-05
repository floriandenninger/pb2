package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.libraries.youtube.common.backgroundtask.workmanager.BackgroundTaskWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ylc extends bzm {
    private final azrw a;

    public ylc(azrw azrwVar) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    @Override // defpackage.bzm
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        if (amkq.e(str, BackgroundTaskWorker.g)) {
            return new BackgroundTaskWorker(context, workerParameters, this.a);
        }
        return null;
    }
}
