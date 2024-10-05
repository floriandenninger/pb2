package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afcm extends afap {
    public aeqq A;
    public boolean B;
    afeb C;
    public final afhs D;
    private int E;
    public final adyl b;
    public final ysy c;
    public final Handler d;
    public final shf e;
    public aeru f;
    public aeru g;
    aerv h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public afih y;
    public afih z;

    public afcm(afec afecVar, adyl adylVar, ysy ysyVar, afhs afhsVar, Handler handler, shf shfVar) {
        super(afecVar);
        this.f = aeru.c;
        this.g = aeru.c;
        afki.a(adylVar);
        this.b = adylVar;
        afki.a(ysyVar);
        this.c = ysyVar;
        afki.a(afhsVar);
        this.D = afhsVar;
        afki.a(handler);
        this.d = handler;
        afki.a(shfVar);
        this.e = shfVar;
    }

    public static final afih T(afih afihVar, String str) {
        if ("qoe.livewindow".equals(afihVar.i())) {
            return new afih("qoe.restart.livewindow", afihVar.a());
        }
        String i = afihVar.i();
        String k = afihVar.k();
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 11 + str.length() + String.valueOf(k).length());
        sb.append("w.");
        sb.append(i);
        sb.append(";action.");
        sb.append(str);
        sb.append(";");
        sb.append(k);
        return new afih("qoe.restart", afihVar.a(), sb.toString());
    }

    public static final boolean U(afih afihVar) {
        if (afihVar.i().equals("net.badstatus") && afihVar.n()) {
            return true;
        }
        return afihVar.i().equals("net.retryexhausted") && afihVar.k().contains("net.badstatus");
    }

    public final void A() {
        if (this.D.R() && !this.D.aE() && this.i > 0 && this.E > 0 && this.u && !this.v) {
            this.D.ax();
        }
        this.h = null;
        this.C = null;
        this.g = aeru.c;
        this.i = 0;
        this.E = 0;
        this.k = false;
        this.j = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.q = false;
        this.p = false;
        this.r = false;
        this.s = false;
        this.t = 0;
        this.w = false;
        this.x = false;
        this.y = null;
        this.A = null;
        this.z = null;
        this.u = false;
        this.v = false;
        this.B = false;
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void C(float f) {
        aerv aervVar = this.h;
        if (aervVar != null) {
            aervVar.t(Float.valueOf(f));
        }
        super.C(f);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void D(float f) {
        aerv aervVar = this.h;
        if (aervVar != null) {
            aervVar.u(Float.valueOf(f));
        }
        super.D(f);
    }

    public final void E(final Runnable runnable, final aeru aeruVar, final afih afihVar) {
        this.d.post(new Runnable() { // from class: afci
            @Override // java.lang.Runnable
            public final void run() {
                afcm afcmVar = afcm.this;
                aeru aeruVar2 = aeruVar;
                afih afihVar2 = afihVar;
                Runnable runnable2 = runnable;
                if (afcmVar.h == null || aeruVar2 != afcmVar.f) {
                    aeruVar2.g(afihVar2.d());
                } else {
                    runnable2.run();
                }
            }
        });
    }

    @Override // defpackage.afap, defpackage.afec
    public final void F(boolean z) {
        A();
        super.F(z);
    }

    public final void H(final afih afihVar, final PlayerConfigModel playerConfigModel, final VideoStreamingData videoStreamingData, final String str) {
        if (this.h == null) {
            return;
        }
        E(new Runnable() { // from class: afch
            @Override // java.lang.Runnable
            public final void run() {
                afcm afcmVar = afcm.this;
                PlayerConfigModel playerConfigModel2 = playerConfigModel;
                afih afihVar2 = afihVar;
                String str2 = str;
                VideoStreamingData videoStreamingData2 = videoStreamingData;
                afcmVar.u(playerConfigModel2, afihVar2, str2);
                aerv aervVar = afcmVar.h;
                aervVar.e = playerConfigModel2;
                aervVar.b = videoStreamingData2;
                aervVar.c = new aeqr(afihVar2.a());
                aervVar.r(2);
                afcmVar.a.K(afcmVar.h);
            }
        }, this.f, afihVar);
    }

    @Override // defpackage.afap, defpackage.afec
    public final boolean J(afeb afebVar) {
        afeb a = afebVar.a(new afcl(this, afebVar.b.a()));
        if (this.C != null || !super.J(a)) {
            return false;
        }
        this.g = afebVar.b.a();
        this.C = a;
        return true;
    }

    @Override // defpackage.afap, defpackage.afec
    public final afqu K(aerv aervVar) {
        A();
        this.f = aervVar.a();
        aerv aervVar2 = new aerv(aervVar);
        aervVar2.g = new afcl(this, aervVar.a());
        this.h = aervVar2;
        return this.a.K(this.h);
    }

    public final void L(final PlayerConfigModel playerConfigModel, final afih afihVar, final aerv aervVar, final afky afkyVar) {
        this.E++;
        E(new Runnable() { // from class: afcg
            @Override // java.lang.Runnable
            public final void run() {
                afcm afcmVar = afcm.this;
                PlayerConfigModel playerConfigModel2 = playerConfigModel;
                afih afihVar2 = afihVar;
                afky afkyVar2 = afkyVar;
                aerv aervVar2 = aervVar;
                afcmVar.u(playerConfigModel2, afihVar2, "newsurface");
                afkyVar2.o();
                aervVar2.e = playerConfigModel2;
                aervVar2.c = new aeqr(afihVar2.a());
                aervVar2.r(2);
                afcmVar.a.y();
                afcmVar.a.K(aervVar2);
            }
        }, this.f, afihVar);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void M() {
        A();
        super.M();
    }

    public final boolean O(PlayerConfigModel playerConfigModel, afih afihVar) {
        Set p;
        if (this.D.U() && U(afihVar)) {
            return true;
        }
        if (afihVar.c().equals(afif.LIBVPX)) {
            return false;
        }
        if (playerConfigModel.d == null) {
            aumk aumkVar = playerConfigModel.c.D;
            if (aumkVar == null) {
                aumkVar = aumk.a;
            }
            if (aumkVar.c.size() == 0) {
                p = amvs.a;
            } else {
                aumk aumkVar2 = playerConfigModel.c.D;
                if (aumkVar2 == null) {
                    aumkVar2 = aumk.a;
                }
                p = amsx.p(aumkVar2.c);
            }
            playerConfigModel.d = p;
        }
        return playerConfigModel.d.contains(afihVar.i());
    }

    public final boolean P() {
        aerv aervVar = this.h;
        if (aervVar == null) {
            return false;
        }
        return (this.a.c(aervVar.b, this.h.e) & 4) != 0;
    }

    public final boolean Q() {
        return !this.w;
    }

    public final boolean R(PlayerConfigModel playerConfigModel, afih afihVar) {
        atyi atyiVar = playerConfigModel.c;
        if ((atyiVar.c & 2048) == 0) {
            return false;
        }
        aumk aumkVar = atyiVar.D;
        if (aumkVar == null) {
            aumkVar = aumk.a;
        }
        return aumkVar.o && !this.r && !this.j && "fmt.decode".equals(afihVar.i()) && (afihVar.h() instanceof afhn) && ((afhn) afihVar.h()).a != null;
    }

    public final boolean S(PlayerConfigModel playerConfigModel, afky afkyVar, afih afihVar) {
        if (afkyVar == null || this.j) {
            return false;
        }
        int i = this.E;
        aumk aumkVar = playerConfigModel.c.D;
        if (aumkVar == null) {
            aumkVar = aumk.a;
        }
        return i < aumkVar.g && O(playerConfigModel, afihVar);
    }

    @Override // defpackage.afap, defpackage.afec
    public final void p(afky afkyVar) {
        aerv aervVar = this.h;
        if (aervVar != null) {
            aervVar.f = afkyVar;
        }
        super.p(afkyVar);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void q() {
        this.C = null;
        this.g = aeru.c;
        super.q();
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void s() {
        aerv aervVar = this.h;
        if (aervVar != null) {
            aervVar.f = null;
        }
        super.s();
    }

    public final void u(PlayerConfigModel playerConfigModel, afih afihVar, String str) {
        this.w = true;
        aeru aeruVar = this.f;
        afih afihVar2 = new afih(afihVar.c(), afihVar.j(), afihVar.a(), afihVar.k());
        afihVar2.g();
        aeruVar.g(afihVar2);
        this.f.g(T(afihVar, str));
        if (playerConfigModel.aN()) {
            this.a.F(false);
        } else {
            this.x = false;
            this.a.M();
        }
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void w() {
        this.f.i("tntnxt", new afcj(this.e.d()));
        this.g.i("tntprv", new aeqs("1"));
        super.w();
    }
}
