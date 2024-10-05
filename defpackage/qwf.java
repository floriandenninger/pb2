package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwf extends qwi {
    final /* synthetic */ FeedbackOptions a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwf(qof qofVar, FeedbackOptions feedbackOptions) {
        super(qofVar);
        this.a = feedbackOptions;
    }

    @Override // defpackage.qpb
    protected final /* synthetic */ void c(qnq qnqVar) {
        qwn qwnVar = (qwn) qnqVar;
        FeedbackOptions feedbackOptions = this.a;
        oba.M(feedbackOptions);
        if (((Boolean) qwr.a.a()).booleanValue()) {
            qwq qwqVar = (qwq) qwnVar.D();
            Parcel pn = qwqVar.pn();
            ecr.g(pn, feedbackOptions);
            Parcel po = qwqVar.po(7, pn);
            ecr.j(po);
            po.recycle();
        } else {
            qwq qwqVar2 = (qwq) qwnVar.D();
            ErrorReport errorReport = new ErrorReport(feedbackOptions, qwnVar.a.getCacheDir());
            Parcel pn2 = qwqVar2.pn();
            ecr.g(pn2, errorReport);
            Parcel po2 = qwqVar2.po(3, pn2);
            ecr.j(po2);
            po2.recycle();
        }
        n(Status.a);
    }
}
