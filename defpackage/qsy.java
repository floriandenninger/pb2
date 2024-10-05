package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsy implements qoh {
    final /* synthetic */ qoi a;
    final /* synthetic */ rpv b;
    final /* synthetic */ qsz c;

    public qsy(qoi qoiVar, rpv rpvVar, qsz qszVar) {
        this.a = qoiVar;
        this.b = rpvVar;
        this.c = qszVar;
    }

    @Override // defpackage.qoh
    public final void a(Status status) {
        if (status.c()) {
            this.b.b(this.c.a(this.a.h(TimeUnit.MILLISECONDS)));
        } else {
            this.b.a(qar.m(status));
        }
    }
}
