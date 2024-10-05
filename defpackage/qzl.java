package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class qzl extends qzk {
    public qzl(qof qofVar) {
        super(qofVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qom a(Status status) {
        return status == null ? Status.c : status;
    }
}
