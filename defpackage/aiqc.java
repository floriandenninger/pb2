package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.stats.PlaybackClientManager$State;
import com.google.android.libraries.youtube.player.stats.VideoStats2Client$VideoStats2ClientState;
import com.google.android.libraries.youtube.player.stats.VideoStats3Client$VideoStats3ClientState;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiqc implements ypd {
    public final aipw a;
    public aiqm b;
    public aiqs c;
    public aiqy d;
    public boolean e;
    public boolean f;
    private aipz g;
    private final aiqf h;
    private aiqg i;
    private final aiqn j;
    private final aaea k;
    private String l;
    private PlaybackClientManager$State m;
    private boolean n;
    private boolean o;
    private boolean p;
    private ahdy q;
    private final akfq r;
    private final akfq s;

    public aiqc(aipw aipwVar, aiqf aiqfVar, aiqn aiqnVar, akfq akfqVar, akfq akfqVar2, aaea aaeaVar, byte[] bArr, byte[] bArr2) {
        aipwVar.getClass();
        this.a = aipwVar;
        aiqfVar.getClass();
        this.h = aiqfVar;
        this.j = aiqnVar;
        this.r = akfqVar;
        this.s = akfqVar2;
        this.k = aaeaVar;
        this.f = true;
    }

    private final void m() {
        ahdy ahdyVar;
        aiqm aiqmVar = this.b;
        if (aiqmVar == null || !this.f || (ahdyVar = this.q) == null) {
            return;
        }
        aiqmVar.e(ahdyVar);
    }

    private final void o() {
        aiqm aiqmVar = this.b;
        if (aiqmVar != null) {
            aiqmVar.r();
        }
        this.b = null;
        aiqs aiqsVar = this.c;
        if (aiqsVar != null) {
            aiqsVar.g();
        }
        this.c = null;
        this.d = null;
        this.g = null;
        this.i = null;
    }

    private static boolean p(PlayerResponseModel playerResponseModel) {
        return playerResponseModel.f().j != null;
    }

    private final boolean q(String str) {
        PlaybackClientManager$State playbackClientManager$State = this.m;
        boolean z = false;
        if (playbackClientManager$State != null && playbackClientManager$State.a.equals(str)) {
            z = true;
        }
        String.valueOf(str).length();
        return z;
    }

    public final PlaybackClientManager$State a() {
        VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState;
        aiqc aiqcVar;
        PlaybackClientManager$State playbackClientManager$State = this.m;
        String str = this.l;
        if (playbackClientManager$State != null) {
            return playbackClientManager$State;
        }
        if (str == null) {
            return null;
        }
        aiqm aiqmVar = this.b;
        if (aiqmVar != null) {
            aiqcVar = this;
            videoStats2Client$VideoStats2ClientState = new VideoStats2Client$VideoStats2ClientState(aiqmVar.a, aiqmVar.b, aiqmVar.c, aiqmVar.d, aiqmVar.e, aiqmVar.r, aiqmVar.D, aiqmVar.f, aiqmVar.g, aiqmVar.h, aiqmVar.i, aiqmVar.j, aiqmVar.t, aiqmVar.s, aiqmVar.k, aiqmVar.l, aiqmVar.u, aiqmVar.v, aiqmVar.w, aiqmVar.y, aiqmVar.H, aiqmVar.x, aiqmVar.z, aiqmVar.A, aiqmVar.B, aiqmVar.C, aiqmVar.o, aiqmVar.p, aiqmVar.q, aiqmVar.G, aiqmVar.E, aiqmVar.F, aiqmVar.K, aiqmVar.L);
        } else {
            videoStats2Client$VideoStats2ClientState = null;
            aiqcVar = this;
        }
        aiqs aiqsVar = aiqcVar.c;
        VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState = aiqsVar != null ? new VideoStats3Client$VideoStats3ClientState(aiqsVar.m, aiqsVar.l, aiqsVar.p, aiqsVar.o, aiqsVar.r, aiqsVar.j, aiqsVar.n, aiqsVar.s, aiqsVar.t, aiqsVar.q, aiqsVar.u, aiqsVar.v, aiqsVar.y, aiqsVar.c, aiqsVar.z, aiqsVar.e, aiqsVar.E, aiqsVar.D, aiqsVar.b, aiqsVar.f, aiqsVar.A, aiqsVar.B, aiqsVar.C) : null;
        aiqy aiqyVar = aiqcVar.d;
        aipz aipzVar = aiqcVar.g;
        aiqg aiqgVar = aiqcVar.i;
        return new PlaybackClientManager$State(str, aipzVar == null ? null : aipzVar.a(), aiqgVar == null ? null : aiqgVar.a(), videoStats2Client$VideoStats2ClientState, aiqyVar == null ? null : new AttestationClient$AttestationClientState(aiqyVar.b, aiqyVar.c, aiqyVar.d, aiqyVar.e, aiqyVar.i), videoStats3Client$VideoStats3ClientState);
    }

    public final void b(PlaybackClientManager$State playbackClientManager$State) {
        this.m = playbackClientManager$State;
        if (this.n) {
            return;
        }
        zga.b("ERROR initFromState called without reset being called. Clients in incorrect state");
    }

    public final void c(aeqq aeqqVar) {
        if (adyu.bP(aeqqVar.b())) {
            aipz aipzVar = this.g;
            if (aipzVar != null) {
                aipzVar.b();
            }
            aiqm aiqmVar = this.b;
            if (aiqmVar == null || !this.f) {
                return;
            }
            aiqmVar.g(aeqqVar);
        }
    }

    public final void d(String str, PlayerResponseModel playerResponseModel, String str2, int i) {
        if (this.p) {
            return;
        }
        if (!this.n) {
            zga.b("ERROR onPlayAd called for new ad without reset being called. Clients in incorrect state");
        }
        this.p = true;
        this.n = false;
        if (q(playerResponseModel.y())) {
            if (!playerResponseModel.y().equals(this.l)) {
                n();
            }
        } else if (!TextUtils.isEmpty(playerResponseModel.y())) {
            PlaybackTrackingModel f = playerResponseModel.f();
            if (f.e == null || f.b == null) {
                zga.l("Missing QoE or Vss base url");
            } else {
                if (!playerResponseModel.c().ba()) {
                    this.i = this.h.a(f.f, f.g, str2);
                }
                this.b = this.j.a(str, playerResponseModel, str2, i);
                m();
                if (aifk.q(this.k) && p(playerResponseModel)) {
                    this.c = this.s.c(str2, i, playerResponseModel);
                }
                if (playerResponseModel.s() != null && f.a != null) {
                    this.d = this.r.b(playerResponseModel.s(), f.a, str2, playerResponseModel.a());
                }
            }
        }
        this.m = null;
        this.l = playerResponseModel.y();
    }

    public final void e(String str, PlayerResponseModel playerResponseModel, int i) {
        if (this.o) {
            return;
        }
        if (!this.n) {
            zga.b("ERROR reset onPlayVideo called for new video with out reset being called. Clients in correct state");
        }
        zhq.m(str);
        this.o = true;
        this.n = false;
        String y = playerResponseModel.y();
        if (!TextUtils.equals(y, this.l)) {
            if (q(y)) {
                n();
            } else if (!this.e) {
                PlaybackTrackingModel f = playerResponseModel.f();
                this.e = false;
                if (!playerResponseModel.y().isEmpty()) {
                    VideoStreamingData videoStreamingData = playerResponseModel.c;
                    boolean z = videoStreamingData != null && videoStreamingData.v;
                    aipw aipwVar = this.a;
                    aryb p = playerResponseModel.p();
                    byte[] G = playerResponseModel.G();
                    String y2 = playerResponseModel.y();
                    aipwVar.i.getClass();
                    zhq.m(y2);
                    this.g = (aipwVar.j.d && p != null && aipw.a(p) && aipw.b(G) && (!z || p.h) && i != 3 && !aipwVar.g.u()) ? new aipz(aipwVar.a, aipwVar.b, aipwVar.c, aipwVar.d, aipwVar.e, aipwVar.f, aipwVar.i, p, G, y2, aipwVar.h) : null;
                }
                if (!playerResponseModel.c().ba()) {
                    this.i = this.h.a(f.f, f.g, str);
                }
                if (this.b == null) {
                    this.b = this.j.a(null, playerResponseModel, str, i);
                    m();
                }
                if (aifk.q(this.k) && this.c == null && p(playerResponseModel)) {
                    this.c = this.s.c(str, i, playerResponseModel);
                }
                if (playerResponseModel.s() != null) {
                    List list = f.f;
                    this.d = this.r.b(playerResponseModel.s(), f.a, str, playerResponseModel.a());
                }
            }
        }
        this.l = y;
        this.m = null;
    }

    public final void g() {
        aiqm aiqmVar = this.b;
        if (aiqmVar != null && this.f) {
            aiqmVar.h();
        }
        aiqy aiqyVar = this.d;
        if (aiqyVar != null) {
            aiqyVar.b();
        }
        aiqs aiqsVar = this.c;
        if (aiqsVar != null) {
            aiqsVar.b(true, aiqsVar.d.d());
            aiqsVar.z = true;
        }
        o();
    }

    public final void i() {
        aiqm aiqmVar = this.b;
        if (aiqmVar != null && this.f) {
            aiqmVar.o();
        }
        aiqy aiqyVar = this.d;
        if (aiqyVar != null) {
            aiqyVar.b();
        }
        aiqs aiqsVar = this.c;
        if (aiqsVar != null) {
            aiqsVar.f();
        }
    }

    public final void j(long j) {
        aiqm aiqmVar = this.b;
        if (aiqmVar != null && this.f) {
            aiqmVar.l(j);
        }
        aiqs aiqsVar = this.c;
        if (aiqsVar != null) {
            aiqsVar.d(j);
        }
    }

    public final void k(aheg ahegVar) {
        aipz aipzVar = this.g;
        if (aipzVar != null) {
            aipzVar.c(ahegVar);
        }
        aiqg aiqgVar = this.i;
        if (aiqgVar != null) {
            aiqgVar.c(ahegVar);
        }
        aiqm aiqmVar = this.b;
        if (aiqmVar != null && this.f) {
            aiqmVar.q(ahegVar);
        }
        aiqy aiqyVar = this.d;
        if (aiqyVar != null && ahegVar.j() && ahegVar.e() >= aiqyVar.c.b(5) * 1000) {
            aiqyVar.b();
        }
        aiqs aiqsVar = this.c;
        if (aiqsVar != null) {
            if (ahegVar.f() > 0) {
                aiqsVar.l = ahegVar.f();
            }
            if (!ahegVar.j()) {
                if (ahegVar.j()) {
                    return;
                }
                String valueOf = String.valueOf(ahegVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
                sb.append("Video time event received with event.hasPlaybackStarted=false. event: ");
                sb.append(valueOf);
                zga.l(sb.toString());
                return;
            }
            long e = ahegVar.e();
            long j = aiqsVar.m;
            if (e < (-5000) + j || e > 5000 + j) {
                StringBuilder sb2 = new StringBuilder(109);
                sb2.append("Warning: unexpected playback progress ");
                sb2.append(e);
                sb2.append(" for current playback position ");
                sb2.append(j);
                zga.l(sb2.toString());
                aiqsVar.d(e);
                return;
            }
            if (e < j || !aiqsVar.i) {
                return;
            }
            aiqsVar.r += e - j;
            aiqsVar.m = e;
            aiqsVar.y = ahegVar.b() - ahegVar.e();
            long j2 = aiqsVar.r;
            int a = aiqsVar.a.a();
            if (a != aiqsVar.s && !aiqsVar.j()) {
                aiqsVar.s = a;
                aiqsVar.t = j2;
            }
            long j3 = j2 - aiqsVar.t;
            if (aiqsVar.j() && j3 > 2000) {
                aiqsVar.t = -1L;
                aiqsVar.s = a;
                aiqsVar.b(false, aiqsVar.d.d());
                aiqsVar.h(aiqsVar.d.d());
            }
            if (aiqsVar.h != null || aiqsVar.z) {
                return;
            }
            aiqsVar.e(aiqsVar.m);
        }
    }

    public final void l() {
        this.n = true;
        this.e = false;
        this.o = false;
        this.p = false;
        this.l = null;
        this.m = null;
        this.q = null;
        o();
    }

    public final void h(long j, String str, PlayerResponseModel playerResponseModel, int i) {
        if (this.b == null) {
            PlaybackTrackingModel f = playerResponseModel.f();
            if (f.e == null || f.b == null) {
                zga.l("Missing QoE or Vss base url");
            } else {
                this.b = this.j.a(null, playerResponseModel, str, i);
                m();
            }
        }
        if (!p(playerResponseModel)) {
            zga.l("Missing Vss3Config");
        } else if (aifk.q(this.k) && this.c == null) {
            this.c = this.s.c(str, i, playerResponseModel);
        }
        aiqm aiqmVar = this.b;
        if (aiqmVar != null && this.f) {
            aiqmVar.m(j);
        }
        aiqs aiqsVar = this.c;
        if (aiqsVar != null) {
            aiqsVar.e(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqc.n():void");
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{yro.class, ahcr.class, ahcx.class, ahdy.class, ahed.class, aifa.class};
            case 0:
                aiqm aiqmVar = this.b;
                if (aiqmVar != null && this.f) {
                    aiqmVar.b();
                }
                aiqs aiqsVar = this.c;
                if (aiqsVar == null) {
                    return null;
                }
                aiqsVar.b(false, aiqsVar.d.d());
                aiqsVar.h(aiqsVar.d.d());
                return null;
            case 1:
                ahcr ahcrVar = (ahcr) obj;
                aiqm aiqmVar2 = this.b;
                if (aiqmVar2 != null && this.f) {
                    aiqmVar2.c(ahcrVar);
                }
                aiqs aiqsVar2 = this.c;
                if (aiqsVar2 == null || aiqsVar2.n == ahcrVar.a()) {
                    return null;
                }
                aiqsVar2.b(false, aiqsVar2.d.d());
                aiqsVar2.n = ahcrVar.a();
                aiqsVar2.h(aiqsVar2.d.d());
                return null;
            case 2:
                ahcx ahcxVar = (ahcx) obj;
                aiqm aiqmVar3 = this.b;
                if (aiqmVar3 != null && this.f) {
                    aiqmVar3.d(ahcxVar);
                }
                aiqs aiqsVar3 = this.c;
                if (aiqsVar3 == null) {
                    return null;
                }
                ahcx ahcxVar2 = aiqsVar3.x;
                if (ahcxVar2 != null && ahcxVar2.d() == ahcxVar.d() && aiqsVar3.x.e() == ahcxVar.e()) {
                    return null;
                }
                aiqsVar3.b(false, aiqsVar3.d.d());
                aiqsVar3.x = ahcxVar;
                aiqsVar3.h(aiqsVar3.d.d());
                return null;
            case 3:
                ahdy ahdyVar = (ahdy) obj;
                if (ahdyVar != null) {
                    this.q = ahdyVar;
                }
                aiqm aiqmVar4 = this.b;
                if (aiqmVar4 != null && this.f) {
                    aiqmVar4.e(ahdyVar);
                }
                aiqs aiqsVar4 = this.c;
                if (aiqsVar4 == null || TextUtils.equals(aiqsVar4.q, ahdyVar.b())) {
                    return null;
                }
                if (aiqsVar4.k) {
                    aiqsVar4.b(false, aiqsVar4.d.d());
                    aiqsVar4.h(aiqsVar4.d.d());
                }
                aiqsVar4.q = ahdyVar.b();
                return null;
            case 4:
                ahed ahedVar = (ahed) obj;
                aiqm aiqmVar5 = this.b;
                if (aiqmVar5 != null && this.f) {
                    aiqmVar5.f(ahedVar);
                }
                aiqs aiqsVar5 = this.c;
                if (aiqsVar5 == null || aiqsVar5.w == ahedVar.a()) {
                    return null;
                }
                aiqsVar5.b(false, aiqsVar5.d.d());
                aiqsVar5.w = ahedVar.a();
                aiqsVar5.h(aiqsVar5.d.d());
                return null;
            case 5:
                this.e = true;
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
