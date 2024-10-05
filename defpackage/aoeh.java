package defpackage;

import com.google.lens.sdk.LensApi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aoeh implements tdc {
    public final /* synthetic */ LensApi.LensAvailabilityCallback a;
    private final /* synthetic */ int b;

    public /* synthetic */ aoeh(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.b = i;
        this.a = lensAvailabilityCallback;
    }

    @Override // defpackage.tdc
    public final void a(int i) {
        if (this.b != 0) {
            LensApi.LensAvailabilityCallback lensAvailabilityCallback = this.a;
            int i2 = i - 2;
            int i3 = LensApi.c;
            if (i == 0) {
                throw null;
            }
            lensAvailabilityCallback.onAvailabilityStatusFetched(i2);
            return;
        }
        LensApi.LensAvailabilityCallback lensAvailabilityCallback2 = this.a;
        int i4 = i - 2;
        int i5 = LensApi.c;
        if (i == 0) {
            throw null;
        }
        lensAvailabilityCallback2.onAvailabilityStatusFetched(i4);
    }
}
