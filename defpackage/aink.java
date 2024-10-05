package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aink implements aioo {
    private aimg a;
    private final azrw b;

    public aink(azrw azrwVar) {
        this.b = azrwVar;
    }

    @Override // defpackage.aioo
    public final /* synthetic */ aimk a() {
        return this.a;
    }

    @Override // defpackage.aioo
    public final aion b(aims aimsVar) {
        acsx acsxVar;
        yjk.f();
        aimg aimgVar = this.a;
        if (aimgVar == null) {
            return null;
        }
        aiey aieyVar = aimsVar.e.g;
        if (!aimgVar.a.f()) {
            aiey[] aieyVarArr = {aiey.NEXT, aiey.PREVIOUS, aiey.AUTOPLAY, aiey.AUTONAV};
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                if (aieyVar == aieyVarArr[i]) {
                    aimgVar.d.i.c(new ahdj());
                    break;
                }
                i++;
            }
        }
        aigd aigdVar = aimsVar.g;
        if (aigdVar != null && (acsxVar = aigdVar.b) != null) {
            acsxVar.e();
        }
        aimgVar.d(aieyVar);
        PlaybackStartDescriptor playbackStartDescriptor = aimsVar.f;
        if (playbackStartDescriptor != null) {
            String k = playbackStartDescriptor.k();
            String c = aimgVar.e.c();
            if ((!TextUtils.isEmpty(k) || !TextUtils.isEmpty(c)) && !TextUtils.equals(k, c)) {
                aimgVar.d.d.c(new aiex(k));
            }
        }
        boolean z = (aimgVar.b.i() || aimsVar.e == aimr.AUTOPLAY) ? false : true;
        PlaybackStartDescriptor a = aimgVar.b.a(aimsVar);
        if (!aimgVar.g(aimsVar) || a == null) {
            String valueOf = String.valueOf(aimsVar.e);
            String valueOf2 = String.valueOf(aimgVar.c.l);
            String.valueOf(valueOf).length();
            String.valueOf(valueOf2).length();
            a = null;
        } else {
            aimgVar.b.f(aimsVar, a);
            a.o(aimsVar.f);
        }
        if (a == null) {
            return null;
        }
        aigd aigdVar2 = aimsVar.g;
        if (aigdVar2 == null) {
            aigdVar2 = aimgVar.b.b(aimsVar);
        }
        return new aion(a, aigdVar2, z);
    }

    @Override // defpackage.aioo
    public final void c() {
        aimg aimgVar = this.a;
        if (aimgVar != null) {
            aimgVar.f();
            this.a = null;
        }
    }

    @Override // defpackage.aioo
    public final boolean d(ainy ainyVar, amml ammlVar, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        aims c;
        aigd aigdVar2;
        acsx acsxVar;
        if (this.a == null) {
            return false;
        }
        if (playbackStartDescriptor.v() && ((Boolean) ammlVar.apply(playbackStartDescriptor)).booleanValue() && this.a != null) {
            if (((aiml) this.b.get()).f(playbackStartDescriptor, this.a)) {
                c();
                h(playbackStartDescriptor);
                aimg aimgVar = this.a;
                if (aimgVar != null) {
                    aimgVar.b();
                    aimgVar.e();
                } else {
                    afsi.b(2, 10, "Initializing a PlaybackSequencer for playback continuation, but it does not exist");
                }
            }
            aiwk aiwkVar = ainyVar.p.a;
            aiih aiihVar = ainyVar.n;
            String u = aiwkVar != null ? aiwkVar.u() : null;
            aiiy c2 = ainyVar.r.c();
            yjk.f();
            playbackStartDescriptor.getClass();
            aiihVar.o = playbackStartDescriptor;
            aiihVar.l(aigk.NEW);
            aiihVar.s.d.c(new aiex(playbackStartDescriptor.k()));
            aiihVar.j(playbackStartDescriptor, 1, u, c2, aigd.a);
            return true;
        }
        aimg aimgVar2 = this.a;
        if (aimgVar2 == null || (c = aimgVar2.b.c(playbackStartDescriptor, aigdVar)) == null) {
            return false;
        }
        if (c.e.equals(aimr.JUMP) && (aigdVar2 = c.g) != null && (acsxVar = aigdVar2.b) != null) {
            aone createBuilder = asmb.a.createBuilder();
            aone createBuilder2 = asmd.a.createBuilder();
            createBuilder2.copyOnWrite();
            asmd asmdVar = (asmd) createBuilder2.instance;
            asmdVar.d = 6;
            asmdVar.b |= 8;
            createBuilder.copyOnWrite();
            asmb asmbVar = (asmb) createBuilder.instance;
            asmd asmdVar2 = (asmd) createBuilder2.build();
            asmdVar2.getClass();
            asmbVar.w = asmdVar2;
            asmbVar.c |= 524288;
            acsxVar.a((asmb) createBuilder.build());
        }
        aion b = b(c);
        if (b == null) {
            return false;
        }
        ainyVar.m.a(b.a, b.b, b.c);
        return true;
    }

    @Override // defpackage.aioo
    public final boolean e(aims aimsVar) {
        aimg aimgVar = this.a;
        return aimgVar != null && aimgVar.g(aimsVar);
    }

    @Override // defpackage.aioo
    public final boolean f() {
        return this.a != null;
    }

    @Override // defpackage.aioo
    public final int g(aims aimsVar) {
        aimg aimgVar = this.a;
        if (aimgVar == null) {
            return 1;
        }
        return aimgVar.i(aimsVar);
    }

    @Override // defpackage.aioo
    public final void h(PlaybackStartDescriptor playbackStartDescriptor) {
        c();
        this.a = (aimg) ((aiml) this.b.get()).b(playbackStartDescriptor);
    }

    @Override // defpackage.aioo
    public final void i(PlaybackServiceState playbackServiceState) {
        this.a = (aimg) ((aiml) this.b.get()).c(playbackServiceState.d);
    }
}
