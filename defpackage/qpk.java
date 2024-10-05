package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qpk implements qoh {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ qpm b;

    public qpk(qpm qpmVar, BasePendingResult basePendingResult) {
        this.b = qpmVar;
        this.a = basePendingResult;
    }

    @Override // defpackage.qoh
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
