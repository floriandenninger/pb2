package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adot implements adlm {
    private static final String a = zga.a("MDX.BaseMdxSession");
    public static final /* synthetic */ int at = 0;
    protected final adpf ai;
    public adle aj;
    protected final int am;
    protected final acun an;
    public final adln ao;
    protected adlp aq;
    protected adot ar;
    public final atbj as;
    private final Context b;
    private final zaw c;
    private Integer e;
    private adll g;
    private final List d = new ArrayList();
    private atbi f = atbi.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
    protected int ak = 0;
    protected int al = 0;
    protected aibu ap = aibu.DEFAULT;

    /* JADX INFO: Access modifiers changed from: protected */
    public adot(Context context, adpf adpfVar, adln adlnVar, zaw zawVar, acun acunVar, atbj atbjVar) {
        this.b = context;
        this.ai = adpfVar;
        this.ao = adlnVar;
        this.c = zawVar;
        this.am = acunVar.G;
        this.an = acunVar;
        this.as = atbjVar;
    }

    @Override // defpackage.adlm
    public void A(adlq adlqVar) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.A(adlqVar);
        } else {
            this.d.add(adlqVar);
        }
    }

    @Override // defpackage.adlm
    public void B(String str) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.B(str);
        }
    }

    @Override // defpackage.adlm
    public void C() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.C();
        }
    }

    @Override // defpackage.adlm
    public final void D() {
        aP(atbi.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER, Optional.empty());
    }

    @Override // defpackage.adlm
    public void E() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.E();
        }
    }

    @Override // defpackage.adlm
    public void F(String str) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.F(str);
        }
    }

    @Override // defpackage.adlm
    public void G(String str) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.G(str);
        }
    }

    @Override // defpackage.adlm
    public void H() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.H();
        }
    }

    @Override // defpackage.adlm
    public void I() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.I();
        }
    }

    @Override // defpackage.adlm
    public void J() {
        if (this.aq.i != 2) {
            zga.h(a, String.format("Session type %s does not support media transfer.", amkq.cT(this.aq.i)));
            return;
        }
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.J();
        }
    }

    @Override // defpackage.adlm
    public void K() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.K();
        }
    }

    @Override // defpackage.adlm
    public void L() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.L();
        }
    }

    @Override // defpackage.adlm
    public void M(adle adleVar) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.M(adleVar);
        } else {
            this.aj = adleVar;
        }
    }

    @Override // defpackage.adlm
    public void N() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.N();
        }
    }

    @Override // defpackage.adlm
    public void O(adlq adlqVar) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.O(adlqVar);
        } else {
            this.d.remove(adlqVar);
        }
    }

    @Override // defpackage.adlm
    public void P(String str) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.P(str);
        }
    }

    @Override // defpackage.adlm
    public void Q(long j) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.Q(j);
        }
    }

    @Override // defpackage.adlm
    public void R(int i, String str, String str2) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.R(i, str, str2);
        }
    }

    @Override // defpackage.adlm
    public void S(String str) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.S(str);
        }
    }

    @Override // defpackage.adlm
    public void T(boolean z) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.T(z);
        }
    }

    @Override // defpackage.adlm
    public void U(boolean z) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.U(z);
        }
    }

    @Override // defpackage.adlm
    public void V(SubtitleTrack subtitleTrack) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.V(subtitleTrack);
        }
    }

    @Override // defpackage.adlm
    public void W(int i) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.W(i);
        }
    }

    @Override // defpackage.adlm
    public void X() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.X();
        }
    }

    @Override // defpackage.adlm
    public void Y() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.Y();
        }
    }

    @Override // defpackage.adlm
    public void Z(int i, int i2) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.Z(i, i2);
        }
    }

    @Override // defpackage.adlm
    public int a() {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.a() : this.ak;
    }

    public boolean aI() {
        return this.al > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final adpf aM() {
        return new adpf() { // from class: ador
            @Override // defpackage.adpf
            public final void a(adlm adlmVar) {
                adot adotVar = adot.this;
                if (adotVar.ar.a() != 0) {
                    adotVar.ai.a(adotVar);
                }
            }
        };
    }

    public final Integer aO() {
        Integer num = this.e;
        if (num != null) {
            return num;
        }
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.aO();
        }
        return null;
    }

    public final void aP(final atbi atbiVar, Optional optional) {
        ynm.i(q(atbiVar, optional), new ynl() { // from class: adoq
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                atbi atbiVar2 = atbi.this;
                int i = adot.at;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                String.valueOf(String.valueOf(atbiVar2)).length();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aQ(adkw adkwVar) {
        this.c.d(this.b.getString(adkwVar.i, k().c()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aR(adot adotVar) {
        this.ar = adotVar;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            this.ar.A((adlq) it.next());
        }
        this.d.clear();
        adotVar.ri(this.aj);
    }

    @Override // defpackage.adlm
    public boolean aa() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.aa();
        }
        return false;
    }

    @Override // defpackage.adlm
    public boolean ab() {
        return false;
    }

    @Override // defpackage.adlm
    public boolean ac() {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.a() == 0 : this.ak == 0;
    }

    @Override // defpackage.adlm
    public boolean ad() {
        adot adotVar = this.ar;
        return adotVar != null && ((adnd) adotVar).R;
    }

    @Override // defpackage.adlm
    public boolean ae() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.ae();
        }
        return false;
    }

    @Override // defpackage.adlm
    public boolean af() {
        adot adotVar = this.ar;
        return adotVar != null && ((adnd) adotVar).S;
    }

    @Override // defpackage.adlm
    public boolean ag(String str) {
        adot adotVar = this.ar;
        return adotVar != null && adotVar.ag(str);
    }

    @Override // defpackage.adlm
    public boolean ah(adlk adlkVar) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.ah(adlkVar);
        }
        return false;
    }

    @Override // defpackage.adlm
    public boolean ai(String str, String str2) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.ai(str, str2);
        }
        return true;
    }

    @Override // defpackage.adlm
    public boolean aj() {
        return this.aq.h > 0;
    }

    @Override // defpackage.adlm
    public int ak() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return ((adnd) adotVar).ah;
        }
        return 1;
    }

    @Override // defpackage.adlm
    public void al(int i) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.al(i);
        }
    }

    @Override // defpackage.adlm
    public void am() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.am();
        }
    }

    public abstract void at();

    public void au(adfu adfuVar) {
        if (this.aq.i != 2) {
            zga.h(a, String.format("Session type %s does not support media transfer.", amkq.cT(this.aq.i)));
        }
    }

    public abstract boolean aw();

    public abstract void ax(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public void ay(adle adleVar) {
        this.ak = 0;
        this.aj = adleVar;
        at();
        this.ai.a(this);
    }

    @Override // defpackage.adlm
    public int b() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return ((adnd) adotVar).ab;
        }
        return 30;
    }

    @Override // defpackage.adlm
    public long c() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.c();
        }
        return 0L;
    }

    @Override // defpackage.adlm
    public long d() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.d();
        }
        return -1L;
    }

    @Override // defpackage.adlm
    public long e() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.e();
        }
        return 0L;
    }

    @Override // defpackage.adlm
    public long g() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.g();
        }
        return -1L;
    }

    @Override // defpackage.adlm
    public RemoteVideoAd h() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return ((adnd) adotVar).N;
        }
        return null;
    }

    @Override // defpackage.adlm
    public ykm i() {
        adot adotVar = this.ar;
        if (adotVar == null) {
            return null;
        }
        return ((adnd) adotVar).O;
    }

    @Override // defpackage.adlm
    public final adgb j() {
        adot adotVar = this.ar;
        if (adotVar == null) {
            return null;
        }
        return ((adnd) adotVar).x;
    }

    @Override // defpackage.adlm
    public final ScreenId l() {
        if (k() instanceof adfw) {
            return ((adfw) k()).f;
        }
        adot adotVar = this.ar;
        if (adotVar == null) {
            return null;
        }
        adfw adfwVar = ((adnd) adotVar).x;
        if (adfwVar instanceof adfw) {
            return adfwVar.f;
        }
        return null;
    }

    @Override // defpackage.adlm
    public adlf m() {
        adot adotVar = this.ar;
        return adotVar != null ? ((adnd) adotVar).L : adlf.UNSTARTED;
    }

    @Override // defpackage.adlm
    public adll n() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return ((adnd) adotVar).E;
        }
        if (this.g == null) {
            this.g = new ados();
        }
        return this.g;
    }

    @Override // defpackage.adlm
    public final adlp o() {
        return this.aq;
    }

    @Override // defpackage.adlm
    public aibu p() {
        return this.ap;
    }

    @Override // defpackage.adlm
    public anhy q(atbi atbiVar, Optional optional) {
        if (this.f == atbi.MDX_SESSION_DISCONNECT_REASON_UNKNOWN) {
            this.f = atbiVar;
            if (optional.isPresent()) {
                this.e = (Integer) optional.get();
            }
        }
        rh();
        return anaf.O(true);
    }

    @Override // defpackage.adlm
    public anhy r(String str) {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.r(str) : anaf.O(false);
    }

    public int re() {
        return 0;
    }

    public String rf() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.rf();
        }
        return null;
    }

    public String rg() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.rg();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void rh() {
        if (this.ak == 2) {
            return;
        }
        this.ak = 2;
        atbi s = s();
        boolean z = false;
        if (s == atbi.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER) {
            if (ae()) {
                z = true;
            }
        } else {
            String str = a;
            String valueOf = String.valueOf(s());
            String valueOf2 = String.valueOf(aO());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
            sb.append("Disconnecting without user initiation, reason: ");
            sb.append(valueOf);
            sb.append(", code: ");
            sb.append(valueOf2);
            zga.o(str, sb.toString(), new Throwable());
        }
        ax(z);
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.ap = this.ap;
            adotVar.aP(s, Optional.empty());
        } else {
            this.ai.a(this);
            this.ap = aibu.DEFAULT;
        }
    }

    public void ri(adle adleVar) {
        this.f = atbi.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
        this.e = null;
        this.al = 0;
        this.ap = aibu.DEFAULT;
        ay(adleVar);
    }

    public boolean rj() {
        return a() == 2 && !this.an.ap.contains(Integer.valueOf(s().D));
    }

    @Override // defpackage.adlm
    public final atbi s() {
        adot adotVar;
        if (this.f == atbi.MDX_SESSION_DISCONNECT_REASON_UNKNOWN && (adotVar = this.ar) != null) {
            return adotVar.s();
        }
        return this.f;
    }

    @Override // defpackage.adlm
    public String t() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            return adotVar.t();
        }
        return null;
    }

    @Override // defpackage.adlm
    public String u() {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.u() : adle.a.e;
    }

    @Override // defpackage.adlm
    public String v() {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.v() : "";
    }

    @Override // defpackage.adlm
    public String w() {
        adot adotVar = this.ar;
        return adotVar != null ? ((adnd) adotVar).Q : adle.a.b;
    }

    @Override // defpackage.adlm
    public String x() {
        adot adotVar = this.ar;
        return adotVar != null ? ((adnd) adotVar).P : adle.a.e;
    }

    @Override // defpackage.adlm
    public String y() {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.y() : adle.a.b;
    }

    @Override // defpackage.adlm
    public void z(String str) {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.z(str);
        }
    }

    public final anhy aN() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adnd adndVar = (adnd) adotVar;
            if (adndVar.an.aw <= 0 || !adndVar.aJ()) {
                return anaf.O(false);
            }
            adndVar.aA(adgf.GET_RECEIVER_STATUS, new adgj());
            ania aniaVar = adndVar.ag;
            if (aniaVar != null) {
                aniaVar.cancel(false);
            }
            adndVar.ag = adndVar.v.schedule(aein.b, adndVar.an.aw, TimeUnit.MILLISECONDS);
            return aney.h(aney.h(anfq.h(anht.q(adndVar.ag), aczu.q, angq.a), CancellationException.class, aczu.s, angq.a), Exception.class, aczu.r, angq.a);
        }
        return anaf.O(false);
    }
}
