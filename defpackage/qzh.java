package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qzh extends qzl {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ long c;
    final /* synthetic */ GoogleHelp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzh(qof qofVar, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(qofVar);
        this.a = feedbackOptions;
        this.b = bundle;
        this.c = j;
        this.d = googleHelp;
    }

    @Override // defpackage.qzk
    protected final void b(qzq qzqVar) {
        try {
            FeedbackOptions feedbackOptions = this.a;
            Bundle bundle = this.b;
            long j = this.c;
            GoogleHelp googleHelp = this.d;
            qzg qzgVar = new qzg(this);
            Parcel pn = qzqVar.pn();
            ecr.g(pn, feedbackOptions);
            ecr.g(pn, bundle);
            pn.writeLong(j);
            ecr.g(pn, googleHelp);
            ecr.i(pn, qzgVar);
            qzqVar.pq(10, pn);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            l(qzm.a);
        }
    }
}
