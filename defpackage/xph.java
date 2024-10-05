package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xph extends ajvj implements xpt, xpz, xrp, ypd {
    private final vak G;
    public final acra a;
    public String b;
    private final List c;
    private final xom d;
    private final ajwt e;
    private final ypa f;
    private final ajfh g;
    private final xnm n;
    private final xpu o;
    private final xqa p;
    private final xro q;
    private askb r;
    private Object s;
    private int t;

    public xph(ajvb ajvbVar, ypa ypaVar, zaw zawVar, xom xomVar, ajfh ajfhVar, ajun ajunVar, vak vakVar, xnm xnmVar, xpu xpuVar, xqa xqaVar, xro xroVar, aasm aasmVar, acra acraVar, ajxe ajxeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aasmVar, ajvbVar, ypaVar, zawVar, acraVar, ajxe.a(ajxeVar));
        this.c = new ArrayList();
        this.d = xomVar;
        this.g = ajfhVar;
        this.G = vakVar;
        this.f = ypaVar;
        this.a = acraVar;
        this.n = xnmVar;
        this.o = xpuVar;
        this.p = xqaVar;
        this.q = xroVar;
        amsv i = amsx.i();
        i.k(xpuVar.b.listIterator());
        i.c(this);
        xpuVar.b = i.g();
        amsv i2 = amsx.i();
        i2.k(xqaVar.a.listIterator());
        i2.c(this);
        xqaVar.a = i2.g();
        if (ajxeVar instanceof xpg) {
            this.b = ((xpg) ajxeVar).a;
        }
        this.i.mK(new xon(xomVar));
        ajwt ajwtVar = new ajwt();
        this.e = ajwtVar;
        ajwtVar.b(new ajvh());
        if (ajfhVar != null) {
            L(ajfhVar);
            ajwtVar.b(ajfhVar);
        }
        vakVar.a.add(this);
        ajunVar.a.clear();
    }

    private final void Q(List list) {
        R(list, 0);
    }

    private final void R(List list, int i) {
        B();
        int i2 = this.r == null ? 0 : 1;
        int size = this.i.size() - i2;
        int min = Math.min(size, i);
        int max = Math.max(0, size - min);
        int min2 = Math.min(max, list.size());
        int min3 = Math.min(min + i2, this.i.size());
        for (int i3 = 0; i3 < min2; i3++) {
            I(this.i.get(min3 + i3), list.get(i3));
        }
        if (max < list.size()) {
            D(list.subList(max, list.size()));
        } else if (max > list.size()) {
            int size2 = list.size() + min3;
            ajpd ajpdVar = this.i;
            ajpdVar.h(size2, ajpdVar.size() - size2);
        }
    }

    private final void S(aalz aalzVar) {
        askb askbVar = aalzVar.a.d;
        if (askbVar == null) {
            askbVar = askb.a;
        }
        int i = askbVar.b;
        if ((i & 64) != 0) {
            aqrf aqrfVar = askbVar.i;
            if (aqrfVar == null) {
                aqrfVar = aqrf.a;
            }
            x(aqrfVar);
            return;
        }
        if ((i & 4) != 0) {
            apzy apzyVar = askbVar.e;
            if (apzyVar == null) {
                apzyVar = apzy.a;
            }
            w(apzyVar);
        }
    }

    public static final boolean y(aalz aalzVar) {
        if (aalzVar.a.i.equals("comment-item-section")) {
            return true;
        }
        askb askbVar = aalzVar.a.d;
        if (askbVar == null) {
            askbVar = askb.a;
        }
        return (askbVar.b & 4) != 0;
    }

    @Override // defpackage.ajvj
    public final void i(aalz aalzVar) {
        ypa ypaVar = this.f;
        if (ypaVar != null) {
            ypaVar.k(this.c);
            this.c.clear();
            String str = aalzVar.a.i;
            if (str.startsWith("community-tab")) {
                final int i = 1;
                this.c.add(this.f.b(this, aach.class, str, new ypb(this) { // from class: xpe
                    public final /* synthetic */ xph a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ypb
                    public final void a(Object obj) {
                        if (i == 0) {
                            xph xphVar = this.a;
                            aacn aacnVar = (aacn) obj;
                            if ((aacnVar.a().b & 64) == 0) {
                                if ((aacnVar.a().b & 4) != 0) {
                                    apzy apzyVar = aacnVar.a().e;
                                    if (apzyVar == null) {
                                        apzyVar = apzy.a;
                                    }
                                    xphVar.a.D(new acqx(apzyVar.e.I()));
                                    xphVar.w(apzyVar);
                                    return;
                                }
                                return;
                            }
                            aqrf aqrfVar = aacnVar.a().i;
                            if (aqrfVar == null) {
                                aqrfVar = aqrf.a;
                            }
                            xphVar.a.D(new acqx(aqrfVar.e.I()));
                            xphVar.x(aqrfVar);
                            return;
                        }
                        aach aachVar = (aach) obj;
                        this.a.ly(aachVar.b(), aachVar.a());
                    }
                }));
                final int i2 = 0;
                this.c.add(this.f.b(this, aacn.class, str, new ypb(this) { // from class: xpe
                    public final /* synthetic */ xph a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ypb
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            xph xphVar = this.a;
                            aacn aacnVar = (aacn) obj;
                            if ((aacnVar.a().b & 64) == 0) {
                                if ((aacnVar.a().b & 4) != 0) {
                                    apzy apzyVar = aacnVar.a().e;
                                    if (apzyVar == null) {
                                        apzyVar = apzy.a;
                                    }
                                    xphVar.a.D(new acqx(apzyVar.e.I()));
                                    xphVar.w(apzyVar);
                                    return;
                                }
                                return;
                            }
                            aqrf aqrfVar = aacnVar.a().i;
                            if (aqrfVar == null) {
                                aqrfVar = aqrf.a;
                            }
                            xphVar.a.D(new acqx(aqrfVar.e.I()));
                            xphVar.x(aqrfVar);
                            return;
                        }
                        aach aachVar = (aach) obj;
                        this.a.ly(aachVar.b(), aachVar.a());
                    }
                }));
            }
        }
        this.q.a.c(this);
        this.b = aalzVar.a.i;
        this.d.b();
        S(aalzVar);
        Q(this.e.a(aalzVar.a.e));
        lu(aalzVar.a());
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.zfk
    public final void j() {
        super.j();
        this.G.a.remove(this);
        xpu xpuVar = this.o;
        amsv i = amsx.i();
        amxd listIterator = xpuVar.b.listIterator();
        while (listIterator.hasNext()) {
            xpt xptVar = (xpt) listIterator.next();
            if (xptVar != this) {
                i.c(xptVar);
            }
        }
        xpuVar.b = i.g();
        xqa xqaVar = this.p;
        amsv i2 = amsx.i();
        amxd listIterator2 = xqaVar.a.listIterator();
        while (listIterator2.hasNext()) {
            xpz xpzVar = (xpz) listIterator2.next();
            if (xpzVar != this) {
                i2.c(xpzVar);
            }
        }
        xqaVar.a = i2.g();
    }

    @Override // defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != xph.class) {
            return super.kz(cls, obj, i);
        }
        if (i == -1) {
            return new Class[]{xrn.class, aacj.class, aacl.class, aaxa.class, ajvf.class};
        }
        if (i != 0) {
            if (i == 1) {
                nl((aacj) obj);
                return null;
            }
            if (i == 2) {
                nm((aacl) obj);
                return null;
            }
            if (i == 3) {
                N((aaxa) obj);
                return null;
            }
            if (i == 4) {
                M((ajvf) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint) ((xrn) obj).h();
        if (!TextUtils.equals(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.e, this.b)) {
            return null;
        }
        if ((commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.b & 16) != 0 && commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.g) {
            return null;
        }
        int ax = aobq.ax(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.d);
        if (ax == 0) {
            ax = 1;
        }
        int i2 = ax - 1;
        if (i2 == 1) {
            aqan aqanVar = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
            if (aqanVar == null) {
                aqanVar = aqan.a;
            }
            aulm aulmVar = aqanVar.c;
            if (aulmVar == null) {
                aulmVar = aulm.a;
            }
            lz(aulmVar, null);
            return null;
        }
        if (i2 != 2) {
            aqan aqanVar2 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
            if (aqanVar2 == null) {
                aqanVar2 = aqan.a;
            }
            aulm aulmVar2 = aqanVar2.c;
            if (aulmVar2 == null) {
                aulmVar2 = aulm.a;
            }
            lt(ahbj.o(aulmVar2));
            return null;
        }
        aqan aqanVar3 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
        if (aqanVar3 == null) {
            aqanVar3 = aqan.a;
        }
        aulm aulmVar3 = aqanVar3.c;
        if (aulmVar3 == null) {
            aulmVar3 = aulm.a;
        }
        r(aulmVar3, Math.max(0, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.f));
        return null;
    }

    @Override // defpackage.ajud
    public final void lD() {
        super.lD();
        this.r = null;
        this.s = null;
        this.t = 0;
        this.q.a.d(this);
    }

    @Override // defpackage.ajvj, defpackage.ajus
    public final String lx() {
        return this.b;
    }

    @Override // defpackage.ajvj, defpackage.ajst
    public final void ly(Object obj, int i) {
        C(obj, i + (this.r == null ? 0 : 1));
    }

    @Override // defpackage.ajvj, defpackage.ajth
    public final void lz(aulm aulmVar, apxf apxfVar) {
        B();
        if (this.i.size() != 0) {
            this.t = 0;
            Q(amru.q());
        }
        lt(ahbj.o(aulmVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajvj
    public final void nk(aalz aalzVar) {
        S(aalzVar);
        super.nk(aalzVar);
    }

    @Override // defpackage.ajvj, defpackage.ajud, defpackage.ajtz, defpackage.ajvz
    public final ajxe ph() {
        return new xpg(super.ph(), this.b);
    }

    public final void r(aulm aulmVar, int i) {
        if (this.t == 0) {
            amkq.N(true);
            xom xomVar = this.d;
            xomVar.b();
            xomVar.c = -1L;
            LinkedList linkedList = new LinkedList();
            for (int i2 = 0; i2 < 10; i2++) {
                linkedList.add(new xyu(i2));
            }
            R(linkedList, i);
            this.t = 10;
        }
        ab(ahbj.o(aulmVar), new xpf(this, i));
    }

    @Override // defpackage.xpz
    public final void s(List list) {
        xpx xpxVar = new xpx(this);
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            aulq aulqVar = (aulq) list.get(size);
            if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                xpxVar.a(ajds.a((aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer)), false);
            }
        }
    }

    @Override // defpackage.xpt
    public final void t(armb armbVar) {
        arlj arljVar;
        aqrf aqrfVar;
        armc armcVar = armbVar.d;
        if (armcVar == null) {
            armcVar = armc.a;
        }
        if (armcVar.b != 153515154 || this.g == null) {
            return;
        }
        xnm xnmVar = this.n;
        if ((armbVar.b & 4) != 0) {
            arljVar = armbVar.f;
            if (arljVar == null) {
                arljVar = arlj.a;
            }
        } else {
            arljVar = null;
        }
        xnmVar.b(arljVar, amrz.k("sectionController", this), R.string.reply_added);
        armc armcVar2 = armbVar.d;
        if (armcVar2 == null) {
            armcVar2 = armc.a;
        }
        if (armcVar2.b == 153515154) {
            aqrfVar = (aqrf) armcVar2.c;
        } else {
            aqrfVar = aqrf.a;
        }
        if ((aqrfVar.b & 8) != 0) {
            this.a.D(new acqx(aqrfVar.e.I()));
        }
        new xpx(this).a(ajds.a(aqrfVar), false);
    }

    @Override // defpackage.xrp
    public final void u(aacm aacmVar) {
        for (int i = this.r == null ? 0 : 1; i < this.i.size(); i++) {
            if (aacmVar.a().a(this.i.get(i))) {
                G(this.i.get(i));
                C(aacmVar.b(), i);
            }
        }
    }

    public final void v(int i) {
        if (this.t == 0) {
            return;
        }
        int i2 = i + (this.r == null ? 0 : 1);
        amkq.N(i2 < this.i.size() && (this.i.get(i2) instanceof xyu));
        this.i.h(i2, Math.min(this.t, this.i.size() - i2));
        this.t = 0;
    }

    public final void w(apzy apzyVar) {
        if (this.r == null) {
            C(apzyVar, 0);
        } else {
            I(P(), apzyVar);
        }
        aone createBuilder = askb.a.createBuilder();
        createBuilder.copyOnWrite();
        askb askbVar = (askb) createBuilder.instance;
        apzyVar.getClass();
        askbVar.e = apzyVar;
        askbVar.b |= 4;
        this.r = (askb) createBuilder.build();
        this.s = apzyVar;
    }

    public final void x(aqrf aqrfVar) {
        if (this.r == null) {
            C(aqrfVar, 0);
        } else {
            I(P(), aqrfVar);
        }
        aone createBuilder = askb.a.createBuilder();
        createBuilder.copyOnWrite();
        askb askbVar = (askb) createBuilder.instance;
        aqrfVar.getClass();
        askbVar.i = aqrfVar;
        askbVar.b |= 64;
        this.r = (askb) createBuilder.build();
        this.s = aqrfVar;
    }

    private final Object P() {
        Object obj = this.s;
        if (obj != null) {
            return obj;
        }
        askb askbVar = this.r;
        if (askbVar == null) {
            return null;
        }
        int i = askbVar.b;
        if ((i & 64) != 0) {
            aqrf aqrfVar = askbVar.i;
            return aqrfVar == null ? aqrf.a : aqrfVar;
        }
        if ((i & 4) == 0) {
            return null;
        }
        apzy apzyVar = askbVar.e;
        return apzyVar == null ? apzy.a : apzyVar;
    }
}
