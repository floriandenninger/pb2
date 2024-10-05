package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ijf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ijo a;

    public ijf(ijo ijoVar) {
        this.a = ijoVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        int bc;
        if (this.a.bg()) {
            this.a.aj.c("r_fge");
        }
        ijo ijoVar = this.a;
        if (ijoVar.at()) {
            if (!ijoVar.bd()) {
                ijoVar.av.f(new fem());
                ijoVar.aD.r(ijoVar.bi);
                ijoVar.aD.s(ijoVar.aI());
            }
            ainy ainyVar = ijoVar.aq;
            yjk.f();
            aint aintVar = ainyVar.k;
            if (aintVar != null) {
                aintVar.b = false;
            }
            ijoVar.aq.x(ijoVar.bc.d, new aifp(aifq.a, ijoVar.c, aifq.a, aifq.a));
            ijoVar.aq.E(true);
            ijoVar.aq.I(1.0f);
            if (ijoVar.bf != null) {
                apxf apxfVar = (apxf) Optional.ofNullable(ijoVar.m).filter(ghv.g).map(ham.l).orElse(ijoVar.bf.b);
                ijoVar.aW.a = acsh.b(apxfVar);
                PlaybackStartDescriptor playbackStartDescriptor = ijoVar.bf;
                atmc p = gfw.p(apxfVar);
                ijoVar.bf = gfw.n(playbackStartDescriptor, p == null ? -1 : p.d);
                if (!TextUtils.isEmpty(ijoVar.be)) {
                    aujs aujsVar = ijoVar.aS.a().u;
                    if (aujsVar == null) {
                        aujsVar = aujs.a;
                    }
                    if (aujsVar.m) {
                        PlaybackStartDescriptor playbackStartDescriptor2 = ijoVar.bf;
                        String str = ijoVar.be;
                        apxf apxfVar2 = playbackStartDescriptor2.b;
                        if (apxfVar2 != null) {
                            aone r = gfw.r(apxfVar2);
                            r.copyOnWrite();
                            atmc atmcVar = (atmc) r.instance;
                            atmc atmcVar2 = atmc.a;
                            str.getClass();
                            atmcVar.b |= 32;
                            atmcVar.f = str;
                            aifz e = playbackStartDescriptor2.e();
                            aong aongVar = (aong) apxfVar2.toBuilder();
                            aongVar.e(atmb.b, (atmc) r.build());
                            e.a = (apxf) aongVar.build();
                            e.f = playbackStartDescriptor2.s();
                            e.e = playbackStartDescriptor2.r();
                            PlaybackStartDescriptor a = e.a();
                            a.o(playbackStartDescriptor2);
                            playbackStartDescriptor2 = a;
                        }
                        ijoVar.bf = playbackStartDescriptor2;
                    }
                }
                PlaybackStartDescriptor playbackStartDescriptor3 = ijoVar.bf;
                ijoVar.bn = playbackStartDescriptor3.b;
                ijoVar.aj.e(playbackStartDescriptor3.l());
                z = ijoVar.aJ().k;
                if (!z) {
                    ijoVar.aO();
                }
                if (ijoVar.ae.r()) {
                    Bundle bundle = ijoVar.bd;
                    if (bundle != null) {
                        iij iijVar = ijoVar.ae.b;
                        iijVar.l = bundle.getBoolean("ReelSequenceController.IS_INITIALIZED_KEY");
                        iijVar.h = (ReelSequenceController$PendingContinuation) bundle.getParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY");
                        iijVar.i = (ReelSequenceController$PendingContinuation) bundle.getParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY");
                        iijVar.k = bundle.getBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY");
                    } else {
                        iij iijVar2 = ijoVar.ae.b;
                        ReelWatchEndpointOuterClass$ReelWatchEndpoint aa = etx.aa(ijoVar.bf);
                        if (!iijVar2.l && (bc = anaf.bc(aa.m)) != 0 && bc == 3 && (aa.b & 4096) != 0) {
                            iijVar2.l = true;
                            ioo a2 = iijVar2.a.a();
                            a2.b = aa.n;
                            iijVar2.a(iijVar2.i, a2, 2);
                        }
                    }
                }
            } else {
                z = false;
            }
            ijoVar.ae.l(false);
            if (!z) {
                ijoVar.aY();
                ijoVar.bf = null;
            }
        }
        this.a.bc.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
