package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwh extends qwi {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwh(qof qofVar, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        super(qofVar);
        this.a = feedbackOptions;
        this.b = bundle;
        this.c = j;
    }

    @Override // defpackage.qpb
    protected final /* bridge */ /* synthetic */ void c(qnq qnqVar) {
        qwn qwnVar = (qwn) qnqVar;
        try {
            FeedbackOptions feedbackOptions = this.a;
            Bundle bundle = this.b;
            long j = this.c;
            oba.L(bundle);
            oba.M(feedbackOptions);
            qwq qwqVar = (qwq) qwnVar.D();
            Parcel pn = qwqVar.pn();
            ecr.g(pn, feedbackOptions);
            ecr.g(pn, bundle);
            pn.writeLong(j);
            qwqVar.pp(5, pn);
            n(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psbd failed!", e);
            l(qwj.a);
        }
    }
}
