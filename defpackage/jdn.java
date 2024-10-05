package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jdn implements aaha {
    private final Context a;
    private final adlt b;

    public jdn(Context context, adlt adltVar) {
        this.a = context;
        adltVar.getClass();
        this.b = adltVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String str = ((RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint) apxfVar.pX(RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.removeFromRemoteQueueEndpoint)).b;
        adlm g = this.b.g();
        if (g == null || g.a() != 1) {
            return;
        }
        g.P(str);
        whu.K(this.a, R.string.video_removed_from_tv_queue, 0);
    }
}
