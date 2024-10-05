package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnn extends rmz {
    final /* synthetic */ rms a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnn(qof qofVar, rms rmsVar) {
        super(qofVar);
        this.a = rmsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qom a(Status status) {
        return new rnm(status);
    }

    @Override // defpackage.qpb
    protected final /* bridge */ /* synthetic */ void c(qnq qnqVar) {
        ((rnk) qnqVar).o(this, this.a.a);
    }
}
