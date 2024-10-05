package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qwi extends qpb {
    public qwi(qof qofVar) {
        super(qwj.b, qofVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qom a(Status status) {
        return status == null ? Status.c : status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qpb, defpackage.qpc
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        super.n(obj);
    }
}
