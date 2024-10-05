package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CancelTimeDelayedEndpoint;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gut implements aaha {
    public final aahd a;
    public final Map b = new HashMap();
    private final Handler c;

    public gut(Context context, aahd aahdVar) {
        this.a = aahdVar;
        this.c = new Handler(context.getMainLooper());
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Runnable runnable;
        if (apxfVar.pY(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint)) {
            TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint = (TimeDelayedEndpoint$CreateTimeDelayedEndpoint) apxfVar.pX(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint);
            gus gusVar = new gus(this, timeDelayedEndpoint$CreateTimeDelayedEndpoint, map, timeDelayedEndpoint$CreateTimeDelayedEndpoint.c);
            if ((timeDelayedEndpoint$CreateTimeDelayedEndpoint.b & 1) != 0) {
                this.b.put(timeDelayedEndpoint$CreateTimeDelayedEndpoint.c, gusVar);
            }
            this.c.postDelayed(gusVar, timeDelayedEndpoint$CreateTimeDelayedEndpoint.d);
            return;
        }
        if (apxfVar.pY(TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint)) {
            TimeDelayedEndpoint$CancelTimeDelayedEndpoint timeDelayedEndpoint$CancelTimeDelayedEndpoint = (TimeDelayedEndpoint$CancelTimeDelayedEndpoint) apxfVar.pX(TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint);
            if ((timeDelayedEndpoint$CancelTimeDelayedEndpoint.b & 1) == 0 || (runnable = (Runnable) this.b.remove(timeDelayedEndpoint$CancelTimeDelayedEndpoint.c)) == null) {
                return;
            }
            this.c.removeCallbacks(runnable);
        }
    }
}
