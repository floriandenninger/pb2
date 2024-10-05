package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iff implements aaha {
    private final ing a;
    private final zgj b;
    private final amnv c;
    private final hav d;

    public iff(ing ingVar, zgj zgjVar, amnv amnvVar, hav havVar) {
        this.a = ingVar;
        this.b = zgjVar;
        this.c = amnvVar;
        this.d = havVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        amkq.E(apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        aifz d = PlaybackStartDescriptor.d();
        d.a = apxfVar;
        PlaybackStartDescriptor a = d.a();
        Object obj = this.c.get();
        if (obj != null && ((aujz) obj).j) {
            this.a.d(apxfVar, a.h(this.b), false, false, false, afxb.a);
        }
        apxf b = this.d.b();
        if (b == null || !b.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            hav havVar = this.d;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", a);
            havVar.e(apxfVar, bundle);
        }
    }
}
