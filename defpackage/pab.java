package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pab implements Runnable {
    final /* synthetic */ oyw a;
    final /* synthetic */ pag b;

    public pab(pag pagVar, oyw oywVar) {
        this.b = pagVar;
        this.a = oywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aaos aaosVar;
        pag pagVar = this.b;
        pac pacVar = pagVar.a;
        int i = pagVar.b;
        oyw oywVar = this.a;
        afbs afbsVar = (afbs) pacVar;
        VideoStreamingData videoStreamingData = afbsVar.t;
        boolean z = (videoStreamingData == null || (aaosVar = videoStreamingData.k) == null || aaosVar.l == null) ? false : true;
        if (i == afbsVar.u() && z) {
            try {
                VideoStreamingData videoStreamingData2 = ((afbs) pacVar).t;
                PlayerConfigModel playerConfigModel = ((afbs) pacVar).x;
                long[] b = oywVar.b();
                b[1] = Math.max(b[0], b[1] - (((pao) videoStreamingData2.k.l).c ? afbs.A(videoStreamingData2) : 0L));
                ((afbs) pacVar).f.k(b[0], b[1]);
            } catch (afbh unused) {
                afbsVar.V(new afih("manifest.unparseable", afbsVar.g()));
            }
        }
    }
}
