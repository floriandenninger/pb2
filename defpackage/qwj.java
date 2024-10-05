package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwj {
    public static final Status a = new Status(13);
    public static final qnw b;
    private static final pse c;
    private static final qar d;

    static {
        pse pseVar = new pse();
        c = pseVar;
        qwd qwdVar = new qwd();
        d = qwdVar;
        b = new qnw("Feedback.API", qwdVar, pseVar, null, null, null, null);
    }

    public static qoi a(qof qofVar, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        qwh qwhVar = new qwh(qofVar, feedbackOptions, bundle, j);
        qofVar.a(qwhVar);
        return qwhVar;
    }

    public static qoi b(qof qofVar, Bundle bundle, long j) {
        qwg qwgVar = new qwg(qofVar, bundle, j);
        qofVar.a(qwgVar);
        return qwgVar;
    }

    @Deprecated
    public static qoi c(qof qofVar, FeedbackOptions feedbackOptions) {
        qwf qwfVar = new qwf(qofVar, feedbackOptions);
        qofVar.a(qwfVar);
        return qwfVar;
    }

    @Deprecated
    public static qoi d(qof qofVar, FeedbackOptions feedbackOptions) {
        qwe qweVar = new qwe(qofVar, feedbackOptions, ((qpz) qofVar).a.w, System.nanoTime());
        qofVar.a(qweVar);
        return qweVar;
    }

    public static qob e(Context context) {
        return new qob(context);
    }
}
