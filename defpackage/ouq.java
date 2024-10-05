package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.apps.youtube.embeddedplayer.service.EmbedsBackgroundTaskWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ouq extends bzm {
    @Override // defpackage.bzm
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        if (amkq.e(str, EmbedsBackgroundTaskWorker.f)) {
            return new EmbedsBackgroundTaskWorker(context, workerParameters);
        }
        return null;
    }
}
