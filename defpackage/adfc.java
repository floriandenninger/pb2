package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfc {
    private final azrw a;
    private final boolean b;

    public adfc(azrw azrwVar, acxi acxiVar) {
        this.a = azrwVar;
        this.b = acxiVar.c.equals("m");
    }

    public final boolean a(dd ddVar) {
        aixh o;
        VideoStreamingData videoStreamingData;
        if (this.b && (o = ((ainy) this.a.get()).o()) != null && o.c() != null) {
            PlayerResponseModel c = o.c();
            if (c.y().isEmpty() && c.q() != null && (videoStreamingData = c.c) != null && videoStreamingData.F()) {
                adfe adfeVar = new adfe();
                adfeVar.qh(ddVar, adfeVar.getClass().getCanonicalName());
                return true;
            }
        }
        return false;
    }
}
