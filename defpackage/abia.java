package defpackage;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.LiveChatActionPanelRendererOuterClass;
import com.google.protos.youtube.api.innertube.PollRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abia implements abgo {
    public abpo a;
    private final Handler b;

    public abia(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.abgo
    public final void a(apxf apxfVar) {
        final int i = 1;
        if (apxfVar.pY(LiveChatAction.ShowLiveChatActionPanelAction.showLiveChatActionPanelAction)) {
            final LiveChatAction.ShowLiveChatActionPanelAction showLiveChatActionPanelAction = (LiveChatAction.ShowLiveChatActionPanelAction) apxfVar.pX(LiveChatAction.ShowLiveChatActionPanelAction.showLiveChatActionPanelAction);
            if ((showLiveChatActionPanelAction.b & 1) != 0) {
                aulq aulqVar = showLiveChatActionPanelAction.c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer)) {
                    this.b.post(new Runnable() { // from class: abhy
                        @Override // java.lang.Runnable
                        public final void run() {
                            abia abiaVar = abia.this;
                            aulq aulqVar2 = showLiveChatActionPanelAction.c;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            asop asopVar = (asop) aulqVar2.pX(LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer);
                            abpo abpoVar = abiaVar.a;
                            if (abpoVar == null || abpoVar.s) {
                                return;
                            }
                            abpoVar.l.removeAllViews();
                            if ((asopVar.b & 4) != 0) {
                                aulq aulqVar3 = asopVar.d;
                                if (aulqVar3 == null) {
                                    aulqVar3 = aulq.a;
                                }
                                if (aulqVar3.pY(PollRendererOuterClass.pollRenderer)) {
                                    audq audqVar = (audq) aulqVar3.pX(PollRendererOuterClass.pollRenderer);
                                    abpoVar.o = audqVar;
                                    abpoVar.q = audqVar.l;
                                    if ((audqVar.b & 2) != 0) {
                                        aulq aulqVar4 = audqVar.e;
                                        if (aulqVar4 == null) {
                                            aulqVar4 = aulq.a;
                                        }
                                        if (aulqVar4.pY(PollRendererOuterClass.pollHeaderRenderer)) {
                                            abpoVar.h((audp) aulqVar4.pX(PollRendererOuterClass.pollHeaderRenderer), true);
                                        }
                                    }
                                    if (audqVar.f.size() > 0) {
                                        for (audo audoVar : audqVar.f) {
                                            abph abphVar = new abph(abpoVar.a, new abpj(abpoVar), null);
                                            abphVar.a(audoVar, Boolean.valueOf(abpoVar.q));
                                            abpoVar.l.addView(abphVar.a);
                                            abpoVar.f.add(abphVar);
                                        }
                                    }
                                    abpoVar.g(audqVar);
                                    abpoVar.e.u(new acqx(audqVar.g), null);
                                }
                            }
                            abpoVar.n = asopVar;
                            if (!abpoVar.s) {
                                abpoVar.s = true;
                                ObjectAnimator objectAnimator = abpoVar.p;
                                if (objectAnimator == null || !objectAnimator.isRunning()) {
                                    abpoVar.d.b(abpoVar);
                                }
                            }
                            abpoVar.t.c(asopVar, abpoVar.i);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (apxfVar.pY(LiveChatAction.CloseLiveChatActionPanelAction.closeLiveChatActionPanelAction)) {
            final LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction = (LiveChatAction.CloseLiveChatActionPanelAction) apxfVar.pX(LiveChatAction.CloseLiveChatActionPanelAction.closeLiveChatActionPanelAction);
            if ((closeLiveChatActionPanelAction.b & 1) != 0) {
                final boolean z = closeLiveChatActionPanelAction.e;
                if (closeLiveChatActionPanelAction.d > 0) {
                    this.b.postDelayed(new Runnable(this) { // from class: abhv
                        public final /* synthetic */ abia a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (i != 0) {
                                abia abiaVar = this.a;
                                LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction2 = closeLiveChatActionPanelAction;
                                abiaVar.b(closeLiveChatActionPanelAction2.c, z);
                                return;
                            }
                            abia abiaVar2 = this.a;
                            LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction3 = closeLiveChatActionPanelAction;
                            abiaVar2.b(closeLiveChatActionPanelAction3.c, z);
                        }
                    }, closeLiveChatActionPanelAction.d);
                    return;
                } else {
                    final int i2 = 0;
                    this.b.post(new Runnable(this) { // from class: abhv
                        public final /* synthetic */ abia a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (i2 != 0) {
                                abia abiaVar = this.a;
                                LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction2 = closeLiveChatActionPanelAction;
                                abiaVar.b(closeLiveChatActionPanelAction2.c, z);
                                return;
                            }
                            abia abiaVar2 = this.a;
                            LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction3 = closeLiveChatActionPanelAction;
                            abiaVar2.b(closeLiveChatActionPanelAction3.c, z);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (apxfVar.pY(LiveChatAction.replaceLiveChatRendererAction)) {
            final ason asonVar = (ason) apxfVar.pX(LiveChatAction.replaceLiveChatRendererAction);
            if ((asonVar.b & 2) != 0) {
                aulq aulqVar2 = asonVar.d;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                if (aulqVar2.pY(LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer)) {
                    this.b.post(new Runnable() { // from class: abhx
                        @Override // java.lang.Runnable
                        public final void run() {
                            asop asopVar;
                            abia abiaVar = abia.this;
                            aulq aulqVar3 = asonVar.d;
                            if (aulqVar3 == null) {
                                aulqVar3 = aulq.a;
                            }
                            asop asopVar2 = (asop) aulqVar3.pX(LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer);
                            abpo abpoVar = abiaVar.a;
                            if (abpoVar == null || !abpoVar.s || (asopVar = abpoVar.n) == null || !TextUtils.equals(asopVar2.c, asopVar.c) || (asopVar2.b & 4) == 0) {
                                return;
                            }
                            aulq aulqVar4 = asopVar2.d;
                            if (aulqVar4 == null) {
                                aulqVar4 = aulq.a;
                            }
                            if (aulqVar4.pY(PollRendererOuterClass.pollRenderer)) {
                                audq audqVar = (audq) aulqVar4.pX(PollRendererOuterClass.pollRenderer);
                                if (abpoVar.k(audqVar)) {
                                    abpoVar.j(audqVar);
                                    abpoVar.n = asopVar2;
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (apxfVar.pY(LiveChatAction.UpdateLiveChatPollAction.updateLiveChatPollAction)) {
            final LiveChatAction.UpdateLiveChatPollAction updateLiveChatPollAction = (LiveChatAction.UpdateLiveChatPollAction) apxfVar.pX(LiveChatAction.UpdateLiveChatPollAction.updateLiveChatPollAction);
            if ((updateLiveChatPollAction.b & 1) != 0) {
                aulq aulqVar3 = updateLiveChatPollAction.c;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                if (aulqVar3.pY(PollRendererOuterClass.pollRenderer)) {
                    this.b.post(new Runnable() { // from class: abhz
                        @Override // java.lang.Runnable
                        public final void run() {
                            abia abiaVar = abia.this;
                            aulq aulqVar4 = updateLiveChatPollAction.c;
                            if (aulqVar4 == null) {
                                aulqVar4 = aulq.a;
                            }
                            audq audqVar = (audq) aulqVar4.pX(PollRendererOuterClass.pollRenderer);
                            abpo abpoVar = abiaVar.a;
                            if (abpoVar == null || !abpoVar.s) {
                                return;
                            }
                            abpoVar.j(audqVar);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (apxfVar.pY(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
            final LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = (LiveChatAction.MarkChatItemAsDeletedAction) apxfVar.pX(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
            if ((markChatItemAsDeletedAction.b & 4) != 0) {
                this.b.post(new Runnable() { // from class: abhw
                    @Override // java.lang.Runnable
                    public final void run() {
                        abia.this.b(markChatItemAsDeletedAction.e, false);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, boolean z) {
        abpo abpoVar = this.a;
        if (abpoVar == null || !abpoVar.s) {
            return;
        }
        asop asopVar = abpoVar.n;
        if (TextUtils.equals(str, asopVar != null ? asopVar.c : null)) {
            this.a.e(true, true, z);
        }
    }
}
