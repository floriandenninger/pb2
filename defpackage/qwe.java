package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwe extends qwi {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Context b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwe(qof qofVar, FeedbackOptions feedbackOptions, Context context, long j) {
        super(qofVar);
        this.a = feedbackOptions;
        this.b = context;
        this.c = j;
    }

    @Override // defpackage.qpb
    protected final /* bridge */ /* synthetic */ void c(qnq qnqVar) {
        qwn qwnVar = (qwn) qnqVar;
        FeedbackOptions feedbackOptions = this.a;
        oba obaVar = feedbackOptions.q;
        if (obaVar == null) {
            oba.M(feedbackOptions);
            qwnVar.k(feedbackOptions);
            qwq qwqVar = (qwq) qwnVar.D();
            ErrorReport errorReport = new ErrorReport(feedbackOptions, qwnVar.a.getCacheDir());
            Parcel pn = qwqVar.pn();
            ecr.g(pn, errorReport);
            Parcel po = qwqVar.po(1, pn);
            ecr.j(po);
            po.recycle();
            n(Status.a);
            return;
        }
        Context context = this.b;
        long j = this.c;
        oba.N(new qwo(context, j));
        oba.N(new qwp(context, obaVar, j, null, null, null));
        FeedbackOptions feedbackOptions2 = this.a;
        long j2 = this.c;
        oba.M(feedbackOptions2);
        qwnVar.k(feedbackOptions2);
        qwq qwqVar2 = (qwq) qwnVar.D();
        ErrorReport errorReport2 = new ErrorReport(feedbackOptions2, qwnVar.a.getCacheDir());
        Parcel pn2 = qwqVar2.pn();
        ecr.g(pn2, errorReport2);
        pn2.writeLong(j2);
        qwqVar2.pq(6, pn2);
        n(Status.a);
    }
}
