package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiwp implements aiwj {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private final azrw m;
    private final azrw n;
    private final azrw o;
    private final azrw p;
    private final azrw q;
    private final azrw r;
    private final azrw s;
    private final azrw t;

    public aiwp() {
    }

    @Override // defpackage.aiwj
    public final /* bridge */ /* synthetic */ aiwk a(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        String a;
        aiwq c = c();
        c.G();
        if (!aifk.B(c.e) || playbackStartDescriptor == null) {
            a = c.d.a();
        } else {
            a = playbackStartDescriptor.g(c.d);
        }
        if (!c.h.t() && playbackStartDescriptor != null && aigdVar != null && aifk.j(c.e)) {
            c.H(playbackStartDescriptor, aigdVar, a);
        }
        c.i = c.g(a, playbackStartDescriptor, aigdVar, false);
        c.b.f(c.i.a);
        c.m = c.i;
        if (c.h.t() && playbackStartDescriptor != null && aigdVar != null && aifk.j(c.e)) {
            c.H(playbackStartDescriptor, aigdVar, a);
        }
        if (playbackStartDescriptor != null) {
            c.R(playbackStartDescriptor.x());
            c.s().p().e = playbackStartDescriptor.c();
            owg a2 = owg.a(playbackStartDescriptor.a.w);
            if (a2 == null) {
                a2 = owg.AUDIO_ROUTE_UNSPECIFIED;
            }
            aifs aifsVar = c.c;
            aifsVar.r = a2;
            aifsVar.a.g.c(new ahcg(a2));
            if (c.n.c(aign.VIDEO_REQUESTED) && c.at()) {
                c.aA(true);
            }
        }
        c.z(0);
        c.x(false, 0, c.m.a);
        c.av(c.i.a, 4, 0);
        c.c.i();
        c.i.a.i().l();
        c.ag(aign.PLAYBACK_PENDING);
        if (aigdVar != null) {
            int i = aigdVar.j;
            if (i == -1) {
                if (aigdVar.i != avzr.VIDEO_QUALITY_SETTING_UNKNOWN) {
                    c.P(aigdVar.i);
                }
            } else {
                c.O(i);
            }
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    @Override // defpackage.aiwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.aiwk b(com.google.android.libraries.youtube.player.video.state.DirectorSavedState r21, defpackage.aigd r22) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwp.b(com.google.android.libraries.youtube.player.video.state.DirectorSavedState, aigd):aiwk");
    }

    public final aiwq c() {
        shf shfVar = (shf) this.a.get();
        shfVar.getClass();
        aemv aemvVar = (aemv) this.b.get();
        aemvVar.getClass();
        afjo afjoVar = (afjo) this.c.get();
        afjoVar.getClass();
        ajoy ajoyVar = (ajoy) this.d.get();
        ajoyVar.getClass();
        aigt aigtVar = (aigt) this.e.get();
        aigtVar.getClass();
        aiwl aiwlVar = (aiwl) this.f.get();
        aiwlVar.getClass();
        aifs aifsVar = (aifs) this.g.get();
        aifsVar.getClass();
        aigv aigvVar = (aigv) this.h.get();
        aigvVar.getClass();
        aaoz aaozVar = (aaoz) this.i.get();
        aaozVar.getClass();
        zgj zgjVar = (zgj) this.j.get();
        zgjVar.getClass();
        aoae aoaeVar = (aoae) this.k.get();
        aoaeVar.getClass();
        aiwt aiwtVar = (aiwt) this.l.get();
        aiwtVar.getClass();
        aaea aaeaVar = (aaea) this.m.get();
        aaeaVar.getClass();
        aadw aadwVar = (aadw) this.n.get();
        aadwVar.getClass();
        ajbk ajbkVar = (ajbk) this.o.get();
        ajbkVar.getClass();
        aiwx aiwxVar = (aiwx) this.p.get();
        aiwxVar.getClass();
        axpg axpgVar = ((axqv) this.q).get();
        axpgVar.getClass();
        airs airsVar = (airs) this.r.get();
        airsVar.getClass();
        aifk aifkVar = (aifk) this.s.get();
        aifkVar.getClass();
        afgb afgbVar = (afgb) this.t.get();
        afgbVar.getClass();
        return new aiwq(shfVar, aemvVar, afjoVar, ajoyVar, aigtVar, aiwlVar, aifsVar, aigvVar, aaozVar, zgjVar, aoaeVar, aiwtVar, aaeaVar, aadwVar, ajbkVar, aiwxVar, axpgVar, airsVar, aifkVar, afgbVar, null, null, null);
    }

    public aiwp(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17, azrw azrwVar18, azrw azrwVar19, azrw azrwVar20) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.d = azrwVar4;
        azrwVar5.getClass();
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        azrwVar9.getClass();
        this.i = azrwVar9;
        azrwVar10.getClass();
        this.j = azrwVar10;
        azrwVar11.getClass();
        this.k = azrwVar11;
        azrwVar12.getClass();
        this.l = azrwVar12;
        azrwVar13.getClass();
        this.m = azrwVar13;
        azrwVar14.getClass();
        this.n = azrwVar14;
        azrwVar15.getClass();
        this.o = azrwVar15;
        azrwVar16.getClass();
        this.p = azrwVar16;
        this.q = azrwVar17;
        azrwVar18.getClass();
        this.r = azrwVar18;
        azrwVar19.getClass();
        this.s = azrwVar19;
        azrwVar20.getClass();
        this.t = azrwVar20;
    }
}
