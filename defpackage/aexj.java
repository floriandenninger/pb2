package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexj extends bar implements aewk {
    public volatile aexl d;
    private final afhf e;
    private final ayr f;
    private final aexh g;
    private final affc h;
    private final PlayerConfigModel i;
    private final VideoStreamingData j;
    private final aesm k;
    private final String l;
    private final pnd m;
    private final aezm n;
    private att o;
    private final ysy p;
    private final aevc[] q;
    private final afhs r;

    public aexj(afhf afhfVar, ayr ayrVar, Handler handler, Handler handler2, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aesm aesmVar, affc affcVar, aewj aewjVar, String str, Object obj, aezm aezmVar, aevc[] aevcVarArr, ysy ysyVar, afhs afhsVar) {
        afki.b(!videoStreamingData.p.isEmpty());
        this.e = afhfVar;
        this.f = ayrVar;
        this.g = new aexh(this, handler, aewjVar, handler2);
        this.i = playerConfigModel;
        this.j = videoStreamingData;
        this.k = aesmVar;
        this.h = affcVar;
        this.l = str;
        this.n = aezmVar;
        pmx pmxVar = new pmx();
        pmxVar.b("ManifestlessLiveMediaSource");
        pmxVar.a = Uri.EMPTY;
        pmxVar.c = obj;
        this.m = pmxVar.a();
        this.q = aevcVarArr;
        this.p = ysyVar;
        this.r = afhsVar;
    }

    @Override // defpackage.aewk
    public final long A(long j) {
        if (this.d != null) {
            return this.d.A(j);
        }
        return -1L;
    }

    @Override // defpackage.bar
    protected final void k() {
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return this.m;
    }

    @Override // defpackage.bar
    protected final void rq(att attVar) {
        this.o = attVar;
        rw(new aexi(this.j.G(), this.m));
    }

    @Override // defpackage.bbr
    public final synchronized void s() {
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
        if (bbpVar instanceof aexf) {
            ((aexf) bbpVar).n();
        }
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        bbx i = this.b.i(0, ashVar);
        return new aexf(this.e, this.f, q(ashVar), this.o, i, bfgVar, this.i, this.j, this.k, this.h, this.g, this.l, this.m, this.n, this.q, this.p, this.r, null);
    }
}
