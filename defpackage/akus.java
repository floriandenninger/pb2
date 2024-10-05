package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akus implements ynk {
    public final /* synthetic */ akux a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ akus(akux akuxVar, String str, int i) {
        this.c = i;
        this.a = akuxVar;
        this.b = str;
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            b((Throwable) obj);
        } else if (i != 1) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ynk
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            akux akuxVar = this.a;
            String str = this.b;
            avtk avtkVar = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED;
            akuxVar.n.c(str);
            if (th instanceof TimeoutException) {
                avtkVar = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_TIMED_OUT;
            }
            akuxVar.D(str, avtkVar, "Failed to create upload job.", th);
            return;
        }
        if (i == 1) {
            akux akuxVar2 = this.a;
            String str2 = this.b;
            avtk avtkVar2 = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_FAILED;
            if (th instanceof TimeoutException) {
                avtkVar2 = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_TIMED_OUT;
            }
            akuxVar2.D(str2, avtkVar2, "Failed to cancel the upload.", th);
            akuxVar2.x(str2, false);
            return;
        }
        akux akuxVar3 = this.a;
        String str3 = this.b;
        avtk avtkVar3 = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED;
        akuxVar3.n.c(str3);
        if (th instanceof TimeoutException) {
            avtkVar3 = avtk.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_TIMED_OUT;
        }
        akuxVar3.D(str3, avtkVar3, "Failed to create upload jobs.", th);
    }
}
