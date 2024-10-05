package defpackage;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwl extends qwk {
    public String f;

    public qwl() {
        this.e = new ApplicationErrorReport();
        throw null;
    }

    @Override // defpackage.qwk
    public final FeedbackOptions a() {
        qip.an(this.e.crashInfo.exceptionClassName);
        qip.an(this.e.crashInfo.throwClassName);
        qip.an(this.e.crashInfo.throwMethodName);
        qip.an(this.e.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.e.crashInfo.throwFileName)) {
            this.e.crashInfo.throwFileName = "unknown";
        }
        FeedbackOptions a = super.a();
        a.d.crashInfo = this.e.crashInfo;
        a.g = this.f;
        return a;
    }

    public qwl(Throwable th) {
        this.e = new ApplicationErrorReport();
        this.e.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.e.crashInfo.throwLineNumber = -1;
        this.e.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }
}
