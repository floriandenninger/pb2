package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbv extends afap {
    VideoStreamingData b;
    PlayerConfigModel c;
    boolean d;
    afbu e;
    private int f;
    private int g;
    private final afbu h;
    private final afbu[] i;
    private afky j;
    private final afhs k;

    public afbv(afbu afbuVar, afhs afhsVar, afbu... afbuVarArr) {
        super(afbuVarArr[0]);
        this.f = 0;
        this.g = 0;
        this.k = afhsVar;
        this.h = afbuVar;
        this.i = afbuVarArr;
    }

    final synchronized boolean A(afbu afbuVar) {
        afec afecVar = this.a;
        this.f += afecVar.b() - afbuVar.b();
        this.g += afecVar.e() - afbuVar.e();
        if (afbuVar == afecVar) {
            return false;
        }
        afecVar.F(false);
        if (this.k.Y()) {
            afecVar.N(false, 19);
            afbuVar.N(true, 19);
        }
        if (this.j != null) {
            afecVar.s();
            afbuVar.p(this.j);
        }
        this.a = afbuVar;
        return true;
    }

    @Override // defpackage.afap, defpackage.afec
    public final afqu K(aerv aervVar) {
        amnp b = amnp.b(amlo.a);
        afbt u = u(aervVar.b, aervVar.e, aedn.h(aervVar, 8));
        boolean A = A(u.a);
        if (u.b) {
            aervVar.a().i("adpf", new aeqs("0"));
        }
        if (A) {
            aervVar.a().i("lsp", new aeqs(Long.toString(b.a(TimeUnit.MILLISECONDS))));
        }
        this.j = aervVar.b();
        afbu afbuVar = (afbu) this.a;
        afic aficVar = afic.ABR;
        afbuVar.getClass().getSimpleName();
        afqu K = afbuVar.K(aervVar);
        aervVar.a().i("llv", new aeqs(Long.toString(b.a(TimeUnit.MILLISECONDS))));
        return K;
    }

    @Override // defpackage.afap, defpackage.afcx
    public final int b() {
        return this.f + ((afbu) this.a).b();
    }

    @Override // defpackage.afap, defpackage.afec
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        return u(videoStreamingData, playerConfigModel, false).a.c(videoStreamingData, playerConfigModel);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final int e() {
        return this.g + ((afbu) this.a).e();
    }

    @Override // defpackage.afap, defpackage.afec
    public final aeeu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aees aeesVar, int i) {
        boolean z2 = false;
        if (z || (aeesVar != null && aeesVar.a())) {
            z2 = true;
        }
        return u(videoStreamingData, playerConfigModel, z2).a.m(videoStreamingData, playerConfigModel, z, aeesVar, i);
    }

    @Override // defpackage.afap, defpackage.afec
    public final void p(afky afkyVar) {
        this.j = afkyVar;
        super.p(afkyVar);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void s() {
        this.j = null;
        super.s();
    }

    @Override // defpackage.afap, defpackage.afec
    public final void t(aaox aaoxVar, aeru aeruVar) {
        if (this.k.q().k) {
            synchronized (this) {
                if (!aaoxVar.j) {
                    this.a = this.h;
                }
                this.h.t(aaoxVar, aeruVar);
            }
            return;
        }
        synchronized (this) {
            super.t(aaoxVar, aeruVar);
        }
    }

    final afbt u(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        afbu afbuVar = this.e;
        if (afbuVar == null || this.b != videoStreamingData || this.c != playerConfigModel || this.d != z) {
            afbu[] afbuVarArr = this.i;
            for (int i = 0; i < 4; i++) {
                afbu afbuVar2 = afbuVarArr[i];
                if (afbuVar2.H(videoStreamingData, playerConfigModel, z)) {
                    this.b = videoStreamingData;
                    this.c = playerConfigModel;
                    this.d = z;
                    this.e = afbuVar2;
                    return afbt.a(afbuVar2, false);
                }
            }
            return afbt.a(this.i[0], true);
        }
        return afbt.a(afbuVar, false);
    }

    @Override // defpackage.afap, defpackage.afec
    public final void y() {
        ((afbu) this.a).y();
    }
}
