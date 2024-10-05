package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.MessageRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abht implements abgd, abjo, afwx, abgq, abgm, zfk, abgl {
    private final ypa A;
    private final ajsa B;
    private final abjk C;
    private final Handler D;
    private boolean E;
    private boolean F;
    private ypc G;
    private String H;
    public final afzu a;
    public final abgk b;
    abgg c;
    public final abha d;
    public abjp e;
    public List f;
    public abgf g;
    public abpe h;
    public abhs i;
    public final aazc j;
    public final abhf k;
    public final abia l;
    public final abhq m;
    public final zaw n;
    public final ainy o;
    public final acra p;
    public final acqz q;
    public abhm r;
    public boolean s;
    public long t;
    public boolean u;
    public boolean v;
    public abhu w;
    private final abge x;
    private final aazg y;
    private final abhm z;

    public abht(aazg aazgVar, aazc aazcVar, afzq afzqVar, ypa ypaVar, ainy ainyVar, zaw zawVar, Handler handler, ajsa ajsaVar, abjk abjkVar, abhf abhfVar, abia abiaVar, aahv aahvVar, axze axzeVar, abge abgeVar, acra acraVar, acqz acqzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.y = aazgVar;
        this.j = aazcVar;
        this.n = zawVar;
        this.A = ypaVar;
        this.o = ainyVar;
        this.B = ajsaVar;
        this.C = abjkVar;
        this.D = handler;
        this.x = abgeVar;
        this.k = abhfVar;
        this.l = abiaVar;
        this.p = acraVar;
        this.q = acqzVar;
        this.c = new abgg(abgeVar, this);
        this.b = new abgk(aahvVar.c());
        abhm abhmVar = new abhm(this, aazgVar, ypaVar, zawVar, acraVar);
        this.z = abhmVar;
        this.r = abhmVar;
        this.m = new abhq(this, aazcVar, ypaVar, zawVar, acraVar);
        this.d = new abha(handler, axzeVar, null, null, null, null);
        this.a = new afzu(abhmVar, afzqVar, new abhr(this));
    }

    private final void F(asra asraVar) {
        boolean z = false;
        if (asraVar.f.size() > 0 && ((apxf) asraVar.f.get(0)).pY(LiveChatAction.ReplayChatItemAction.replayChatItemAction)) {
            z = true;
        }
        if (asraVar.l || z) {
            this.c = new abgr(this.D, this.x, this, this);
        } else {
            this.c = new abgv(this.D, this.x, this);
        }
        this.c.mW();
    }

    private final void G(boolean z) {
        this.f = null;
        this.r.aa();
        abhm abhmVar = this.r;
        abhmVar.a = false;
        abhmVar.b = false;
        afzu afzuVar = this.a;
        if (afzuVar != null) {
            afzuVar.c();
        }
        this.c.mX();
        this.b.q();
        this.d.mX();
        abjp abjpVar = this.e;
        if (abjpVar != null) {
            abjpVar.mX();
        }
        this.F = false;
        this.s = false;
        if (!z) {
            this.t = 0L;
            this.E = false;
        }
        H();
    }

    private final synchronized void H() {
        ypc ypcVar = this.G;
        if (ypcVar != null) {
            this.A.l(ypcVar);
            this.G = null;
        }
        if (this.s && this.r == this.m) {
            this.G = this.A.a(this, aheg.class, new ypb() { // from class: abhi
                @Override // defpackage.ypb
                public final void a(Object obj) {
                    abht abhtVar = abht.this;
                    aheg ahegVar = (aheg) obj;
                    if (abhtVar.o.Q()) {
                        return;
                    }
                    long e = ahegVar.e();
                    abhtVar.t = e;
                    abgg abggVar = abhtVar.c;
                    if (abggVar instanceof abgr) {
                        ((abgr) abggVar).g(e);
                    }
                }
            });
        }
    }

    public final synchronized void A(apxf apxfVar) {
        if (apxfVar.pY(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)) {
            aazg aazgVar = this.y;
            aayy e = aazgVar.e();
            e.a = ((LiveChatEndpointOuterClass$LiveChatEndpoint) apxfVar.pX(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)).c.I();
            e.l(apxfVar.c);
            aazgVar.b.e(e, this);
            this.F = true;
            this.d.mW();
            this.s = true;
            abjp o = o();
            if (o != null) {
                o.A();
            }
            H();
        }
    }

    public final synchronized void B(asra asraVar) {
        if (adyu.cY(asraVar)) {
            F(asraVar);
            if (asraVar.l) {
                abgf abgfVar = this.g;
                if (abgfVar != null) {
                    abgfVar.b();
                }
                this.r = this.m;
            } else {
                this.r = this.z;
            }
            aulm aulmVar = ((asrc) asraVar.d.get(0)).c;
            if (aulmVar == null) {
                aulmVar = aulm.a;
            }
            ajce o = ahbj.o(aulmVar);
            this.u = !((ajch) o).a.equals(this.H);
            this.H = ((ajch) o).a;
            this.v = true;
            z(o);
        }
    }

    public final synchronized void C() {
        G(false);
    }

    public final synchronized boolean D() {
        return this.s;
    }

    public final synchronized void E(abhu abhuVar) {
        this.w = abhuVar;
    }

    @Override // defpackage.abgd
    public final abgi e() {
        return this.k;
    }

    @Override // defpackage.abgd
    public final abgk f() {
        return this.b;
    }

    @Override // defpackage.abgd
    public final abgm g() {
        return this;
    }

    @Override // defpackage.abgd
    public final abgo h() {
        return this.l;
    }

    @Override // defpackage.abgd
    public final abgs i() {
        return this.e;
    }

    @Override // defpackage.zfk
    public final synchronized void j() {
        throw null;
    }

    @Override // defpackage.abgd
    public final abha k() {
        return this.d;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.n.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* synthetic */ void kZ(Object obj) {
        arul arulVar = (arul) obj;
        arum arumVar = arulVar.d;
        if (arumVar == null) {
            arumVar = arum.a;
        }
        if ((arumVar.b & 1) != 0) {
            arum arumVar2 = arulVar.d;
            if (arumVar2 == null) {
                arumVar2 = arum.a;
            }
            asra asraVar = arumVar2.c;
            if (asraVar == null) {
                asraVar = asra.a;
            }
            t(asraVar);
            ((acqq) this.p).D(new acqx(arulVar.f));
        }
    }

    @Override // defpackage.abgd
    public final Object l(String str) {
        return null;
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }

    @Override // defpackage.abgl
    public final void m(ajce ajceVar) {
        abjp abjpVar = this.e;
        if (abjpVar != null) {
            abjpVar.A();
        }
        G(true);
        z(ajceVar);
    }

    @Override // defpackage.abgq
    public final boolean n() {
        List list = this.f;
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((asrc) it.next()).b & 8) != 0) {
                return true;
            }
        }
        return false;
    }

    public final synchronized abjp o() {
        return this.e;
    }

    public final void p() {
        this.b.q();
    }

    public final synchronized void q() {
        this.r.B();
    }

    @Override // defpackage.abgd
    public final abgf qL() {
        return this.g;
    }

    public final synchronized void r() {
        this.r.aa();
        afzu afzuVar = this.a;
        if (afzuVar != null) {
            afzuVar.c();
        }
        this.c.mU();
        this.d.mU();
        abjp abjpVar = this.e;
        if (abjpVar != null) {
            abjpVar.mU();
        }
    }

    final void s(List list) {
        afzu afzuVar;
        boolean containsKey;
        if (list == null) {
            return;
        }
        this.f = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            asrc asrcVar = (asrc) it.next();
            int i = asrcVar.b;
            if ((i & 2) != 0) {
                afzu afzuVar2 = this.a;
                if (afzuVar2 != null) {
                    afzuVar2.c();
                }
                abhm abhmVar = this.r;
                avgs avgsVar = asrcVar.d;
                if (avgsVar == null) {
                    avgsVar = avgs.a;
                }
                abhmVar.ag(ahbj.o(avgsVar), new Timer());
            } else if ((i & 4) != 0 && (afzuVar = this.a) != null) {
                asjj asjjVar = asrcVar.e;
                if (asjjVar == null) {
                    asjjVar = asjj.a;
                }
                ajce o = ahbj.o(asjjVar);
                synchronized (afzuVar.b) {
                    asjj asjjVar2 = (asjj) ahbj.p(o, asjj.class);
                    asjjVar2.getClass();
                    asjl asjlVar = asjjVar2.c;
                    if (asjlVar == null) {
                        asjlVar = asjl.a;
                    }
                    containsKey = afzuVar.b.containsKey(afzu.a(asjlVar));
                }
                if (!containsKey) {
                    this.a.c();
                }
                this.r.aa();
                afzu afzuVar3 = this.a;
                asjj asjjVar3 = asrcVar.e;
                if (asjjVar3 == null) {
                    asjjVar3 = asjj.a;
                }
                afzuVar3.b(ahbj.o(asjjVar3));
            }
            int i2 = asrcVar.b;
            if ((i2 & 1) != 0) {
                aulm aulmVar = asrcVar.c;
                if (aulmVar == null) {
                    aulmVar = aulm.a;
                }
                arrayList.add(ahbj.o(aulmVar));
            } else if ((i2 & 2) != 0) {
                avgs avgsVar2 = asrcVar.d;
                if (avgsVar2 == null) {
                    avgsVar2 = avgs.a;
                }
                arrayList.add(ahbj.o(avgsVar2));
            } else if ((i2 & 4) != 0) {
                asjj asjjVar4 = asrcVar.e;
                if (asjjVar4 == null) {
                    asjjVar4 = asjj.a;
                }
                arrayList.add(ahbj.o(asjjVar4));
            } else if ((i2 & 8) != 0) {
                asrd asrdVar = asrcVar.f;
                if (asrdVar == null) {
                    asrdVar = asrd.a;
                }
                arrayList.add(ahbj.o(asrdVar));
            } else if ((i2 & 16) != 0) {
                auah auahVar = asrcVar.g;
                if (auahVar == null) {
                    auahVar = auah.a;
                }
                arrayList.add(ahbj.o(auahVar));
            }
        }
        this.r.lu(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(asra asraVar) {
        long j;
        int i;
        aspi aspiVar;
        atdn atdnVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aspi aspiVar2;
        this.r.b = false;
        if (asraVar == null) {
            return;
        }
        if (!this.E) {
            F(asraVar);
            this.C.a(asraVar.k);
        } else if (this.F) {
            this.c.mW();
        }
        if (asraVar.i.size() > 0) {
            this.B.g(asraVar.i);
        }
        abhu abhuVar = this.w;
        if (abhuVar != null) {
            asqz asqzVar = asraVar.g;
            if (asqzVar == null) {
                asqzVar = asqz.a;
            }
            if (asqzVar.b == 130037640) {
                aspiVar = (aspi) asqzVar.c;
            } else {
                aspiVar = aspi.a;
            }
            aulq aulqVar = aspiVar.b;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(MessageRendererOuterClass.messageRenderer)) {
                asqz asqzVar2 = asraVar.g;
                if (asqzVar2 == null) {
                    asqzVar2 = asqz.a;
                }
                if (asqzVar2.b == 130037640) {
                    aspiVar2 = (aspi) asqzVar2.c;
                } else {
                    aspiVar2 = aspi.a;
                }
                aulq aulqVar2 = aspiVar2.b;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                atdnVar = (atdn) aulqVar2.pX(MessageRendererOuterClass.messageRenderer);
            } else {
                atdnVar = null;
            }
            if (atdnVar != null && abhuVar.a != null) {
                abpd abpdVar = abhuVar.b;
                abpdVar.b = false;
                Context context = abpdVar.c.getContext();
                if ((atdnVar.b & 1) != 0) {
                    aqygVar = atdnVar.e;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ajcq.b(aqygVar));
                for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
                    if (styleSpan.getStyle() == 1) {
                        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, abpdVar.a.a(6)), spannableStringBuilder.getSpanStart(styleSpan), spannableStringBuilder.getSpanEnd(styleSpan), 33);
                    }
                }
                abpdVar.d.setText(spannableStringBuilder);
                atdq atdqVar = atdnVar.f;
                if (atdqVar == null) {
                    atdqVar = atdq.a;
                }
                if ((atdqVar.b & 1) != 0) {
                    abpdVar.b = true;
                    TextView textView = abpdVar.e;
                    atdq atdqVar2 = atdnVar.f;
                    if (atdqVar2 == null) {
                        atdqVar2 = atdq.a;
                    }
                    atdp atdpVar = atdqVar2.c;
                    if (atdpVar == null) {
                        atdpVar = atdp.a;
                    }
                    if ((atdpVar.b & 1) != 0) {
                        atdq atdqVar3 = atdnVar.f;
                        if (atdqVar3 == null) {
                            atdqVar3 = atdq.a;
                        }
                        atdp atdpVar2 = atdqVar3.c;
                        if (atdpVar2 == null) {
                            atdpVar2 = atdp.a;
                        }
                        aqygVar2 = atdpVar2.c;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    textView.setText(ajcq.b(aqygVar2));
                }
                abhuVar.b.a(abhuVar.a.b.isEmpty());
            }
        }
        this.E = true;
        this.f = null;
        if (asraVar.d.size() != 0) {
            s(asraVar.d);
        }
        if (asraVar.f.size() > 0) {
            apxf apxfVar = (apxf) asraVar.f.get(asraVar.f.size() - 1);
            if (this.F && (this.c instanceof abgr) && apxfVar.pY(LiveChatAction.ReplayChatItemAction.replayChatItemAction)) {
                long j2 = ((LiveChatAction.ReplayChatItemAction) apxfVar.pX(LiveChatAction.ReplayChatItemAction.replayChatItemAction)).c;
                long j3 = this.t;
                if (j2 < j3) {
                    ((abgr) this.c).f(j3);
                }
            }
            abgg abggVar = this.c;
            aony aonyVar = asraVar.f;
            for (asrc asrcVar : asraVar.d) {
                int i2 = asrcVar.b;
                if ((i2 & 2) != 0) {
                    avgs avgsVar = asrcVar.d;
                    if (avgsVar == null) {
                        avgsVar = avgs.a;
                    }
                    i = avgsVar.c;
                } else if ((i2 & 4) != 0 && this.a != null) {
                    asjj asjjVar = asrcVar.e;
                    if (asjjVar == null) {
                        asjjVar = asjj.a;
                    }
                    i = asjjVar.d;
                }
                j = i;
                abggVar.a(aonyVar, j);
            }
            j = 0;
            abggVar.a(aonyVar, j);
        }
        abgf abgfVar = this.g;
        if (abgfVar != null && (asraVar.c & 16) != 0) {
            asqx asqxVar = asraVar.h;
            if (asqxVar == null) {
                asqxVar = asqx.a;
            }
            abgfVar.a(asqxVar);
            this.r.a = false;
        }
        abpe abpeVar = this.h;
        if (abpeVar != null && (asraVar.c & 2) != 0) {
            asqy asqyVar = asraVar.e;
            if (asqyVar == null) {
                asqyVar = asqy.a;
            }
            abpeVar.h(asqyVar);
        }
        abjp o = o();
        if (o != null) {
            o.y();
        }
        this.F = false;
    }

    public final synchronized void u() {
        this.c.mV();
        this.d.mV();
        abjp abjpVar = this.e;
        if (abjpVar != null) {
            abjpVar.mV();
        }
        s(this.f);
        abjp o = o();
        if (o != null) {
            o.y();
        }
    }

    public final synchronized void v(asra asraVar) {
        if (D()) {
            u();
        } else {
            B(asraVar);
        }
    }

    public final synchronized void w(abjp abjpVar) {
        abjp abjpVar2 = this.e;
        if (abjpVar == abjpVar2) {
            return;
        }
        if (abjpVar == null) {
            abjk abjkVar = this.C;
            abjkVar.a = null;
            abjkVar.b = null;
            if (abjpVar2 != null) {
                abjpVar2.r();
                this.e = null;
                return;
            }
            return;
        }
        if (abjpVar2 != null) {
            abjpVar.u(abjpVar2.o(), this.e.p());
            abjpVar.w(this.e.n());
        }
        this.e = abjpVar;
        abjpVar.q();
        abjp abjpVar3 = this.e;
        abgk abgkVar = this.b;
        abjpVar3.t(abgkVar, abgkVar.b);
        abha abhaVar = this.d;
        ajpd ajpdVar = abhaVar.b;
        this.e.x(ajpdVar, abhaVar.d);
        this.e.v(this);
        if (this.h != null) {
            this.e.B();
        }
        this.e.h();
        ajpdVar.i(new abhj(this, ajpdVar));
    }

    public final synchronized void x(abpe abpeVar) {
        this.h = abpeVar;
    }

    public final synchronized void y(abgf abgfVar) {
        this.g = abgfVar;
    }

    public final synchronized void z(ajce ajceVar) {
        this.r.lu(Collections.singletonList(ajceVar));
        this.d.mW();
        abjp abjpVar = this.e;
        if (abjpVar != null) {
            abjpVar.mW();
            this.e.A();
        }
        this.s = true;
        this.r.lt(ajceVar);
        this.F = true;
        H();
    }
}
