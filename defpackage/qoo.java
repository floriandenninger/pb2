package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qoo implements qon {
    private final /* synthetic */ int a;

    public /* synthetic */ qoo(int i) {
        this.a = i;
    }

    @Override // defpackage.qon
    public final void a(qom qomVar) {
        if (this.a == 0) {
            throw null;
        }
        Status status = (Status) qomVar;
        if (status.c()) {
            return;
        }
        new ExecutionException(String.format("%s: %d", status.h, Integer.valueOf(status.g)), null);
    }
}
