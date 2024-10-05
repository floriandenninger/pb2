package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qau extends qvh {
    public qau() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // defpackage.qvh
    protected final /* synthetic */ Object c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof qav) {
            return (qav) queryLocalInterface;
        }
        return new qav(iBinder);
    }
}
