package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afba {
    public final /* synthetic */ VideoStreamingData a;
    public final /* synthetic */ aeqr b;
    public final /* synthetic */ String c;
    public final /* synthetic */ PlayerConfigModel d;
    public final /* synthetic */ afjf e;
    public final /* synthetic */ afbs f;

    public afba(afbs afbsVar, VideoStreamingData videoStreamingData, aeqr aeqrVar, String str, PlayerConfigModel playerConfigModel, afjf afjfVar) {
        this.f = afbsVar;
        this.a = videoStreamingData;
        this.b = aeqrVar;
        this.c = str;
        this.d = playerConfigModel;
        this.e = afjfVar;
    }

    public final void a(Exception exc) {
        Future future = this.f.z;
        if (future != null) {
            future.cancel(true);
            this.f.z = null;
        }
        afbs afbsVar = this.f;
        afih afihVar = new afih(afif.MANIFEST, "net.connect", this.f.g(), exc);
        afihVar.f();
        afbsVar.V(afihVar);
    }
}
