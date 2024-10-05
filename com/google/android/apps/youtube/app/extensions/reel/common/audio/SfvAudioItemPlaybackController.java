package com.google.android.apps.youtube.app.extensions.reel.common.audio;

import android.content.Context;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import defpackage.aahu;
import defpackage.aahv;
import defpackage.aaih;
import defpackage.aaio;
import defpackage.aalt;
import defpackage.aaxn;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acra;
import defpackage.acsx;
import defpackage.acsy;
import defpackage.aifp;
import defpackage.aifq;
import defpackage.ainl;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.amkq;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.any;
import defpackage.aok;
import defpackage.aomf;
import defpackage.aone;
import defpackage.asht;
import defpackage.asig;
import defpackage.asii;
import defpackage.asil;
import defpackage.aurb;
import defpackage.aure;
import defpackage.aurg;
import defpackage.aute;
import defpackage.autf;
import defpackage.ayph;
import defpackage.ayqi;
import defpackage.ayqw;
import defpackage.azrw;
import defpackage.ggc;
import defpackage.ggk;
import defpackage.hbm;
import defpackage.hbp;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SfvAudioItemPlaybackController implements any {
    public static final long a = TimeUnit.SECONDS.toMillis(15);
    public final ainy b;
    public final ainl c;
    public final ayqi d;
    public final PlayerView e;
    public final Executor g;
    public final Executor h;
    public final acsy i;
    public SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand l;
    public autf m;
    public acsx n;
    public final aaxn o;
    private final aioc p;
    private final azrw q;
    private final acqz u;
    private final ayqw r = new ayqw();
    private final hbp s = new hbp(this);
    private final Set t = new HashSet();
    public ammv j = amlr.a;
    public ammv k = amlr.a;
    public final aifp f = new aifp(new hbm(), aifq.a, aifq.a, aifq.a);

    public SfvAudioItemPlaybackController(Context context, aioc aiocVar, azrw azrwVar, ayqi ayqiVar, aaxn aaxnVar, Executor executor, Executor executor2, acsy acsyVar, acqz acqzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.p = aiocVar;
        this.b = aiocVar.E();
        this.c = aiocVar.D();
        this.q = azrwVar;
        this.d = ayqiVar;
        this.o = aaxnVar;
        this.g = executor;
        this.h = executor2;
        this.i = acsyVar;
        this.u = acqzVar;
        this.e = new PlayerView(context);
    }

    public final ayph g(ammv ammvVar, ammv ammvVar2, aurg aurgVar) {
        String f = aalt.f(186, "sfv_currently_playing_audio_item_key");
        aahu c = ((aahv) this.q.get()).c();
        if (ammvVar2.h()) {
            f.getClass();
            amkq.O(!f.isEmpty(), "key cannot be empty");
            aone createBuilder = aure.a.createBuilder();
            createBuilder.copyOnWrite();
            aure aureVar = (aure) createBuilder.instance;
            aureVar.b |= 1;
            aureVar.c = f;
            aurb aurbVar = new aurb(createBuilder);
            String str = (String) ammvVar.c();
            aone aoneVar = aurbVar.a;
            aoneVar.copyOnWrite();
            aure aureVar2 = (aure) aoneVar.instance;
            aureVar2.b |= 2;
            aureVar2.d = str;
            aone aoneVar2 = aurbVar.a;
            aoneVar2.copyOnWrite();
            aure aureVar3 = (aure) aoneVar2.instance;
            aureVar3.e = aurgVar.f;
            aureVar3.b |= 4;
            String str2 = (String) ammvVar2.c();
            aone aoneVar3 = aurbVar.a;
            aoneVar3.copyOnWrite();
            aure aureVar4 = (aure) aoneVar3.instance;
            aureVar4.b |= 8;
            aureVar4.f = str2;
            aaio c2 = ((aaih) c).c();
            c2.k(aurbVar);
            return c2.b();
        }
        aaio c3 = ((aaih) c).c();
        c3.g(f);
        return c3.b();
    }

    public final void h(aomf aomfVar, autf autfVar) {
        asht ashtVar;
        acsx acsxVar = this.n;
        if (acsxVar != null) {
            acsxVar.c("aft");
        }
        acra mM = this.u.mM();
        acqx acqxVar = new acqx(aomfVar);
        if (autfVar == null) {
            ashtVar = null;
        } else {
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = asil.a.createBuilder();
            aone createBuilder3 = asig.a.createBuilder();
            aone createBuilder4 = asii.a.createBuilder();
            aute auteVar = autfVar.c;
            if (auteVar == null) {
                auteVar = aute.a;
            }
            long j = auteVar.c;
            createBuilder4.copyOnWrite();
            asii asiiVar = (asii) createBuilder4.instance;
            asiiVar.b |= 1;
            asiiVar.c = j;
            asii asiiVar2 = (asii) createBuilder4.build();
            createBuilder3.copyOnWrite();
            asig asigVar = (asig) createBuilder3.instance;
            asiiVar2.getClass();
            asigVar.c = asiiVar2;
            asigVar.b |= 1;
            asig asigVar2 = (asig) createBuilder3.build();
            createBuilder2.copyOnWrite();
            asil asilVar = (asil) createBuilder2.instance;
            asigVar2.getClass();
            asilVar.f = asigVar2;
            asilVar.b |= 16;
            asil asilVar2 = (asil) createBuilder2.build();
            createBuilder.copyOnWrite();
            asht ashtVar2 = (asht) createBuilder.instance;
            asilVar2.getClass();
            ashtVar2.B = asilVar2;
            ashtVar2.c |= 262144;
            ashtVar = (asht) createBuilder.build();
        }
        mM.I(3, acqxVar, ashtVar);
    }

    public final void i() {
        this.b.a();
    }

    public final void j() {
        if (this.b.d()) {
            this.b.J();
        }
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        i();
        this.t.remove(aokVar);
        if (this.t.isEmpty()) {
            this.r.c();
        }
        g(amlr.a, amlr.a, aurg.SFV_AUDIO_ITEM_PLAYBACK_STATE_UNKNOWN).S(ggc.g, ggk.q);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        if (this.t.isEmpty()) {
            this.r.g(this.s.kI(this.p));
        }
        this.t.add(aokVar);
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (this.t.isEmpty()) {
            this.b.s();
        }
        this.j = amlr.a;
        this.k = amlr.a;
        this.l = null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
