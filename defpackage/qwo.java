package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwo implements Runnable {
    private final Context a;
    private final long b;

    public qwo(Context context, long j) {
        this.a = context;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle(1);
        try {
            zsd zsdVar = new zsd(null);
            zsdVar.c();
            this.a.getCacheDir();
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(zsdVar.a()));
        } catch (Exception e) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        long j = this.b;
        qar.i(qwj.a(qwj.e(this.a).D, FeedbackOptions.a(), bundle, j));
    }
}
