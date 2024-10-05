package defpackage;

import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcm implements anhh {
    final /* synthetic */ ParcelableFuture a;

    public amcm(ParcelableFuture parcelableFuture) {
        this.a = parcelableFuture;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        ParcelableFuture parcelableFuture = this.a;
        parcelableFuture.d = obj;
        parcelableFuture.b = true;
        parcelableFuture.a();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ParcelableFuture parcelableFuture = this.a;
        parcelableFuture.e = th;
        parcelableFuture.b = true;
        parcelableFuture.a();
    }
}
