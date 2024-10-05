package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiwb implements aiwh {
    private final /* synthetic */ int a;

    public aiwb(int i) {
        this.a = i;
    }

    @Override // defpackage.aiwh
    public final long b() {
        return this.a != 0 ? 8192L : 0L;
    }

    @Override // defpackage.aiwh
    public final long c(long j) {
        return this.a != 0 ? j | 8321 : j;
    }

    @Override // defpackage.aiwh
    public final long d() {
        return this.a != 0 ? 8192L : 0L;
    }

    @Override // defpackage.aiwh
    public final void e() {
    }

    @Override // defpackage.aiwh
    public final void g() {
    }

    @Override // defpackage.aiwh
    public final List a() {
        return this.a != 0 ? amru.q() : amru.q();
    }

    @Override // defpackage.aiwh
    public final Bundle f() {
        return this.a != 0 ? new Bundle() : new Bundle();
    }
}
