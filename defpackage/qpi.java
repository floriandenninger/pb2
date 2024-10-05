package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qpi {
    final /* synthetic */ BasePendingResult a;

    public qpi(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() {
        BasePendingResult basePendingResult = this.a;
        ThreadLocal threadLocal = BasePendingResult.e;
        BasePendingResult.m(basePendingResult.h);
        super.finalize();
    }
}
