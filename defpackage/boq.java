package defpackage;

import android.media.MediaRouter2;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class boq extends MediaRouter2.RouteCallback {
    final /* synthetic */ bos a;

    public boq(bos bosVar) {
        this.a = bosVar;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesAdded(List list) {
        this.a.e();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesChanged(List list) {
        this.a.e();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesRemoved(List list) {
        this.a.e();
    }
}
