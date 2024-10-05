package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aipn {
    public final aipd a;
    public final Executor b;
    public final Executor c;
    public final aaea d;
    private final aapf e;
    private final aild f;
    private final aiih g;
    private final aifk h;
    private ykn i;
    private final aimx j;
    private final ahbg k;
    private final ahbg l;

    public aipn(aapf aapfVar, aimx aimxVar, aild aildVar, aipd aipdVar, Executor executor, Executor executor2, aaea aaeaVar, ahbg ahbgVar, aiih aiihVar, aifk aifkVar, ahbg ahbgVar2, byte[] bArr) {
        this.e = aapfVar;
        this.j = aimxVar;
        aildVar.getClass();
        this.f = aildVar;
        this.a = aipdVar;
        this.b = executor;
        this.c = executor2;
        this.d = aaeaVar;
        this.l = ahbgVar;
        this.g = aiihVar;
        this.h = aifkVar;
        this.k = ahbgVar2;
    }

    public final void a(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, aipm aipmVar, acsx acsxVar) {
        synchronized (this.a) {
            if (this.a.a == null) {
                return;
            }
            if (playerResponseModel == null) {
                return;
            }
            ykn yknVar = this.i;
            if (yknVar != null) {
                yknVar.d();
            }
            ykn c = ykn.c(new aipl(this, playerResponseModel, aipmVar, playbackStartDescriptor, acsxVar));
            this.i = c;
            this.f.k(playerResponseModel.q(), c, playerResponseModel.y());
        }
    }

    public final void b() {
        ykn yknVar = this.i;
        if (yknVar != null) {
            yknVar.d();
            this.i = null;
        }
    }

    public final void c(PlayerResponseModel playerResponseModel, aigr aigrVar, aiwk aiwkVar) {
        if (this.l.b() == 2) {
            return;
        }
        this.g.l(aigk.VIDEO_PLAYBACK_ERROR);
        if (aigrVar != null) {
            aiwkVar.B(playerResponseModel, aigrVar);
        }
    }

    public final void d(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, acsx acsxVar, aiwk aiwkVar) {
        yjk.f();
        this.j.j.c(new ahcy());
        if (acsxVar != null) {
            acsxVar.c("pc");
        }
        if (!(this.h.v() && this.k.a(playerResponseModel) == 2) && aiwkVar.Y()) {
            aiwkVar.C(playerResponseModel, playbackStartDescriptor);
        }
    }

    public final void e() {
        this.f.c = false;
        b();
    }

    public final boolean f(final PlayerResponseModel playerResponseModel, final aiwk aiwkVar, final aipm aipmVar) {
        if (aifk.i(this.d)) {
            yjk.e();
            final aapj j = playerResponseModel.j(this.e);
            if (j == null) {
                return false;
            }
            if (!ahbx.k(playerResponseModel.q())) {
                this.j.h.c(new aheb(j.b()));
            }
            if (aiwkVar.Z()) {
                this.c.execute(new Runnable() { // from class: aipf
                    @Override // java.lang.Runnable
                    public final void run() {
                        aiwk.this.C(playerResponseModel, null);
                    }
                });
            } else if (aipmVar != null) {
                if (ahbx.k(playerResponseModel.q())) {
                    this.c.execute(new Runnable() { // from class: aipg
                        @Override // java.lang.Runnable
                        public final void run() {
                            aiwk aiwkVar2 = aiwk.this;
                            PlayerResponseModel playerResponseModel2 = playerResponseModel;
                            aapj aapjVar = j;
                            if (aiwkVar2.Y()) {
                                aiwkVar2.A(playerResponseModel2, aapjVar.a);
                            }
                        }
                    });
                } else {
                    this.c.execute(new Runnable() { // from class: aipe
                        @Override // java.lang.Runnable
                        public final void run() {
                            aipm.this.b(j);
                        }
                    });
                }
            }
            return true;
        }
        aapj j2 = playerResponseModel.j(this.e);
        if (j2 == null) {
            return false;
        }
        this.j.h.c(new aheb(j2.b()));
        if (aiwkVar.Z()) {
            aiwkVar.C(playerResponseModel, null);
        } else if (aipmVar != null) {
            aipmVar.b(j2);
        }
        return true;
    }
}
