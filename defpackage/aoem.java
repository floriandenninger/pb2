package defpackage;

import com.google.lens.sdk.LensApi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoem implements tcx {
    private final LensApi.LensAvailabilityCallback a;
    private final int b;

    public aoem(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.a = lensAvailabilityCallback;
        this.b = i;
    }

    @Override // defpackage.tcx
    public final void a(tdm tdmVar) {
        int T;
        int i = 1;
        if (this.b == 0 ? (T = rwh.T(tdmVar.e)) != 0 : (T = rwh.T(tdmVar.f)) != 0) {
            i = T;
        }
        this.a.onAvailabilityStatusFetched(i - 2);
    }
}
