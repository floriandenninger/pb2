package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjc extends BasePendingResult {
    public qjc() {
        super((qof) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final qjh b(Status status) {
        return new qjf(status, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qom a(Status status) {
        return b(status);
    }
}
