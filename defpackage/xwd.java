package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwd extends xuz implements ypd {
    public final xng k;
    public WeakReference l;
    public aulm m;
    private final ypa n;
    private final yaq o;
    private final aahd p;

    public xwd(Context context, ajjz ajjzVar, ajvb ajvbVar, ajoy ajoyVar, xoh xohVar, xng xngVar, ypa ypaVar, aahd aahdVar, yaq yaqVar, ajoy ajoyVar2, akcy akcyVar, gnn gnnVar, aadw aadwVar, acra acraVar, ajun ajunVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context, ajjzVar, ajvbVar, ajoyVar, xohVar, ajoyVar2, akcyVar, aahdVar, gnnVar, aadwVar, acraVar, ajunVar, null, null, null);
        xngVar.getClass();
        this.k = xngVar;
        ypaVar.getClass();
        this.n = ypaVar;
        aahdVar.getClass();
        this.p = aahdVar;
        yaqVar.getClass();
        this.o = yaqVar;
    }

    @Override // defpackage.xuz, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.g();
        this.n.m(this);
        this.l = null;
        this.m = null;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        WeakReference weakReference;
        ajud ajudVar;
        aulm aulmVar;
        if (i == -1) {
            return new Class[]{wap.class};
        }
        if (i == 0) {
            if (!((wap) obj).a() || (weakReference = this.l) == null || (ajudVar = (ajud) weakReference.get()) == null || (aulmVar = this.m) == null) {
                return null;
            }
            ajudVar.F(new ajuh(ahbj.o(aulmVar)));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [ajos, java.lang.Object] */
    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        final aqab aqabVar;
        final apjf apjfVar;
        auwh auwhVar;
        amru q;
        HashMap hashMap;
        aqab aqabVar2;
        avgg avggVar;
        aqyg aqygVar3;
        aqyg aqygVar4;
        apzy apzyVar = (apzy) obj;
        this.n.g(this);
        if (!apzyVar.l) {
            ajokVar.a.u(new acqx(apzyVar.e), null);
        } else {
            ajokVar.a.H(apzyVar, apzyVar.e, this.e);
        }
        if ((apzyVar.b & 128) != 0) {
            aqygVar = apzyVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((apzyVar.b & 256) != 0) {
            aqygVar2 = apzyVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        e(b, b2);
        aahd aahdVar = this.p;
        TextView textView = this.h;
        aqyg aqygVar5 = apzyVar.j;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        whu.G(textView, aahk.a(aqygVar5, aahdVar, false));
        whu.I(this.i, (apzyVar.b & 262144) != 0);
        ajvc ajvcVar = (ajvc) ajokVar.c("sectionController");
        final xqb xqbVar = new xqb(ajvcVar);
        apzz apzzVar = apzyVar.c;
        if (apzzVar == null) {
            apzzVar = apzz.a;
        }
        if ((apzzVar.b & 1) != 0) {
            apzz apzzVar2 = apzyVar.c;
            if (apzzVar2 == null) {
                apzzVar2 = apzz.a;
            }
            aqabVar = apzzVar2.c;
            if (aqabVar == null) {
                aqabVar = aqab.a;
            }
        } else {
            aqabVar = null;
        }
        this.l = null;
        this.m = null;
        if (aqabVar != null) {
            final ajvc ajvcVar2 = (ajvc) ajokVar.c("sectionController");
            awkb awkbVar = aqabVar.i;
            if (awkbVar == null) {
                awkbVar = awkb.a;
            }
            awjz awjzVar = awkbVar.c;
            if (awjzVar == null) {
                awjzVar = awjz.a;
            }
            awka awkaVar = awjzVar.e;
            if (awkaVar == null) {
                awkaVar = awka.a;
            }
            if ((awkaVar.b & 1) != 0) {
                awkb awkbVar2 = aqabVar.i;
                if (awkbVar2 == null) {
                    awkbVar2 = awkb.a;
                }
                awjz awjzVar2 = awkbVar2.c;
                if (awjzVar2 == null) {
                    awjzVar2 = awjz.a;
                }
                awka awkaVar2 = awjzVar2.e;
                if (awkaVar2 == null) {
                    awkaVar2 = awka.a;
                }
                aulm aulmVar = awkaVar2.c;
                if (aulmVar == null) {
                    aulmVar = aulm.a;
                }
                this.m = aulmVar;
                if (ajvcVar2 instanceof ajud) {
                    this.l = new WeakReference((ajud) ajvcVar2);
                }
            }
            avgg avggVar2 = aqabVar.e;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            int bo = aobq.bo(aqabVar.d);
            if (bo == 0) {
                bo = 1;
            }
            if ((aqabVar.b & 16) != 0) {
                aqygVar4 = aqabVar.f;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            i(avggVar2, bo, ajcq.b(aqygVar4), new View.OnClickListener() { // from class: xwc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xwd xwdVar = xwd.this;
                    xwdVar.b.f(aqabVar, ajvcVar2);
                }
            });
        }
        boolean z = TextUtils.isEmpty(b) && TextUtils.isEmpty(b2);
        apzz apzzVar3 = apzyVar.c;
        if (apzzVar3 == null) {
            apzzVar3 = apzz.a;
        }
        if ((apzzVar3.b & 2) != 0) {
            apzz apzzVar4 = apzyVar.c;
            if (apzzVar4 == null) {
                apzzVar4 = apzz.a;
            }
            apjfVar = apzzVar4.d;
            if (apjfVar == null) {
                apjfVar = apjf.a;
            }
        } else {
            apjfVar = null;
        }
        int i = true != z ? 2 : 4;
        if (apjfVar != null) {
            if ((2 & apjfVar.b) != 0) {
                avggVar = apjfVar.e;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
            } else {
                avggVar = null;
            }
            if ((apjfVar.b & 8) != 0) {
                aqygVar3 = apjfVar.g;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            i(avggVar, i, ajcq.b(aqygVar3), new View.OnClickListener() { // from class: xwb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xwd xwdVar = xwd.this;
                    xwdVar.k.a(apjfVar, xqbVar);
                }
            });
            xxr xxrVar = this.k.e;
            Dialog dialog = xxrVar != null ? xxrVar.d : null;
            if (dialog != null && dialog.isShowing()) {
                this.k.d.b = xqbVar;
            }
        }
        if ((apzyVar.b & 4) != 0) {
            apzt apztVar = apzyVar.d;
            if (apztVar == null) {
                apztVar = apzt.a;
            }
            if (apztVar.b == 76818770) {
                auwhVar = (auwh) apztVar.c;
            } else {
                auwhVar = auwh.a;
            }
        } else {
            auwhVar = null;
        }
        d(ajokVar, auwhVar);
        Boolean bool = (Boolean) this.o.b.get(apzyVar);
        if (bool == null ? apzyVar.h : bool.booleanValue()) {
            xoh xohVar = this.b;
            apzz apzzVar5 = apzyVar.c;
            if (apzzVar5 == null) {
                apzzVar5 = apzz.a;
            }
            if ((apzzVar5.b & 1) != 0) {
                apzz apzzVar6 = apzyVar.c;
                if (apzzVar6 == null) {
                    apzzVar6 = apzz.a;
                }
                aqabVar2 = apzzVar6.c;
                if (aqabVar2 == null) {
                    aqabVar2 = aqab.a;
                }
            } else {
                aqabVar2 = null;
            }
            xohVar.f(aqabVar2, ajvcVar);
            this.o.b.put(apzyVar, false);
        }
        if (this.o.a(apzyVar)) {
            aahd aahdVar2 = this.p;
            if (this.o.a(apzyVar)) {
                q = amru.o(apzyVar.i);
            } else {
                q = amru.q();
            }
            ajvc ajvcVar3 = (ajvc) ajokVar.c("sectionController");
            if (ajvcVar3 != null) {
                hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.comment.comment_thread_created_callback", new xqb(ajvcVar3));
            } else {
                hashMap = null;
            }
            aahdVar2.d(q, hashMap);
            this.o.a.put(apzyVar, true);
        }
        if ((apzyVar.b & 2097152) != 0) {
            aulq aulqVar = apzyVar.k;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                aulq aulqVar2 = apzyVar.k;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aqrf aqrfVar = (aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer);
                this.j.af(new LinearLayoutManager());
                RecyclerView recyclerView = this.j;
                ajpd ajpdVar = new ajpd();
                ajox a = this.c.a(this.d.get());
                a.h(ajpdVar);
                ajds a2 = ajds.a(aqrfVar);
                recyclerView.ac(a);
                ajpdVar.add(a2);
                whu.I(this.j, true);
            }
        }
    }
}
