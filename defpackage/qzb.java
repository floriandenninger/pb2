package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qzb implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;

    public qzb(Context context, GoogleHelp googleHelp, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = j;
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
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
        }
        FeedbackOptions a = FeedbackOptions.a();
        qzn b = qza.b(this.a);
        GoogleHelp googleHelp = this.b;
        long j = this.c;
        qof qofVar = b.D;
        qzh qzhVar = new qzh(qofVar, a, bundle, j, googleHelp);
        qofVar.a(qzhVar);
        qar.i(qzhVar);
    }
}
