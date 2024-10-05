package defpackage;

import android.media.projection.MediaProjection;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acav extends MediaProjection.Callback {
    final /* synthetic */ acay a;

    public acav(acay acayVar) {
        this.a = acayVar;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        super.onStop();
        yjk.e();
        if (this.a.d) {
            Log.e("VirtualDisplaySource", "Media projection stopped unexpectedly");
            this.a.l(6);
        }
    }
}
