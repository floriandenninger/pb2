package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ijd implements ayrs {
    public final /* synthetic */ ijm a;
    private final /* synthetic */ int b;

    public /* synthetic */ ijd(ijm ijmVar, int i) {
        this.b = i;
        this.a = ijmVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        long j;
        String str;
        PlaybackStartDescriptor g;
        apxf apxfVar;
        arsd arsdVar;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint;
        ajbl a;
        PlaybackStartDescriptor g2;
        apxf apxfVar2;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2;
        int i = this.b;
        if (i == 0) {
            ijm ijmVar = this.a;
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
            String y = playerResponseModel != null ? playerResponseModel.y() : "";
            ijo ijoVar = ijmVar.b;
            if (ijoVar.bn != null && !TextUtils.isEmpty(y) && ijoVar.bn.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) ijoVar.bn.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                if (!reelWatchEndpointOuterClass$ReelWatchEndpoint3.d.isEmpty() && !reelWatchEndpointOuterClass$ReelWatchEndpoint3.d.equals(y)) {
                    return;
                }
            }
            ihn ihnVar = ijmVar.b.aj;
            synchronized (ihnVar.a) {
                if (ihnVar.c == null || ihnVar.e || !ihnVar.h(y)) {
                    j = 0;
                } else {
                    long c = ihnVar.b.c();
                    ihnVar.c.c("r_tr");
                    ihnVar.e = true;
                    j = c - ihnVar.d;
                }
            }
            ijo ijoVar2 = ijmVar.b;
            FormatStreamModel formatStreamModel = ijoVar2.bs.a;
            if (formatStreamModel != null) {
                ihn ihnVar2 = ijoVar2.aj;
                int e = formatStreamModel.e();
                synchronized (ihnVar2.a) {
                    if (ihnVar2.c != null && ihnVar2.h(y)) {
                        aone createBuilder = asmd.a.createBuilder();
                        createBuilder.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder.instance;
                        asmdVar.b |= 1;
                        asmdVar.c = e;
                        asmd asmdVar2 = (asmd) createBuilder.build();
                        aone createBuilder2 = asmb.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder2.instance;
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c |= 524288;
                        ihnVar2.c.a((asmb) createBuilder2.build());
                    }
                }
            }
            ily aG = ijmVar.b.aG();
            if (aG != null) {
                aG.f.e();
            }
            ijmVar.b.bb.e(j);
            if (ijmVar.b.bb.h()) {
                zga.g(String.format(Locale.US, "Reels[%s] Playback Time: %d ms", y, Long.valueOf(j)));
                return;
            }
            return;
        }
        if (i != 1) {
            if (i == 2) {
                ijm ijmVar2 = this.a;
                ahds ahdsVar = (ahds) obj;
                synchronized (ijmVar2.b.bo) {
                    ijmVar2.b.bq = ahdsVar.b().ordinal() >= aigj.PLAYBACK_LOADED.ordinal();
                    ijmVar2.b.aP();
                }
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    this.a.b((aheg) obj);
                    return;
                } else if (i == 5) {
                    this.a.c((ahej) obj);
                    return;
                } else {
                    this.a.a((aigr) obj);
                    return;
                }
            }
            ijm ijmVar3 = this.a;
            ahdv ahdvVar = (ahdv) obj;
            synchronized (ijmVar3.b.bo) {
                if (ahdvVar.c().a(aigk.VIDEO_PLAYBACK_ERROR)) {
                    ijo ijoVar3 = ijmVar3.b;
                    ijoVar3.br = true;
                    ijoVar3.aP();
                }
            }
            return;
        }
        ijm ijmVar4 = this.a;
        ahel ahelVar = (ahel) obj;
        synchronized (ijmVar4.b.bo) {
            ijo ijoVar4 = ijmVar4.b;
            ijoVar4.bq = false;
            ijoVar4.br = false;
            str = null;
            if (ijoVar4.bp != null) {
                gfw.v(1, "Last delayed ReelItemPlayback not processed during root change");
                ijmVar4.b.bp = null;
            }
        }
        ily aG2 = ijmVar4.b.aG();
        if (aG2 != null) {
            aG2.q = false;
        }
        if (ijmVar4.b.aJ().h && (arsdVar = ijmVar4.b.ba) != null && (arsdVar.b & 8) != 0) {
            apxf apxfVar3 = arsdVar.f;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            if (apxfVar3.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && (reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar3.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) != null && (g2 = (a = ahelVar.a()).g()) != null && (apxfVar2 = g2.b) != null && apxfVar2.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && (reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar2.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) != null && reelWatchEndpointOuterClass$ReelWatchEndpoint2.d.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint.d) && reelWatchEndpointOuterClass$ReelWatchEndpoint2.e.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint.e)) {
                zih b = a.b();
                ijmVar4.b.ba(apxfVar2, 5, b != null ? (acsx) b.a() : null);
            }
        }
        ihz ihzVar = ijmVar4.b.bi;
        if (ahelVar != null && ahelVar.a() != null) {
            String Z = ahelVar.a().Z();
            ihzVar.a = ihzVar.b;
            ihzVar.b = Z;
        }
        ijo ijoVar5 = ijmVar4.b;
        String str2 = ijoVar5.bk;
        if (ahelVar != null && ahelVar.a() != null) {
            str = ahelVar.a().Z();
        }
        ijoVar5.bk = str;
        if (ijmVar4.b.bd()) {
            ijo ijoVar6 = ijmVar4.b;
            if (ijoVar6.bn == null || amkq.b(str2, ijoVar6.bk) || (g = ahelVar.a().g()) == null || (apxfVar = g.b) == null || !apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                return;
            }
            acra aI = ijmVar4.b.aI();
            ijmVar4.b.bj.b(aI);
            ijo ijoVar7 = ijmVar4.b;
            ijoVar7.bj.a(Optional.of(ijoVar7.ae), aI, apxfVar, str2, ijmVar4.b.bk, true, g.e);
        }
    }
}
