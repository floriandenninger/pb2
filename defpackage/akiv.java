package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akiv implements akhm, ajdg, ypd {
    private final ajos A;
    private final ajox B;
    private final ajox C;
    private final SharedPreferences D;
    private boolean E;
    private final aoae F;
    public final apxf a;
    public final aavj b;
    public final zaw c;
    public final ExecutorService d;
    public final ypa e;
    public final apet f;
    public final Context g;
    public final akiu h;
    public final List i;
    public final akkz j;
    public final cnd k;
    public final ajdh l;
    public final akig m;
    public Future n;
    public boolean o;
    public arej p;
    public View q;
    public boolean r;
    private final Executor s;
    private final anib t;
    private final acra u;
    private final ajjz v;
    private final aahd w;
    private final ajut x;
    private final akhn y;
    private final ajos z;

    public akiv(apxf apxfVar, aavj aavjVar, acra acraVar, zaw zawVar, ExecutorService executorService, ypa ypaVar, ajjz ajjzVar, apet apetVar, Context context, aahd aahdVar, ajut ajutVar, akiu akiuVar, akhn akhnVar, akkz akkzVar, cnd cndVar, ajdh ajdhVar, akig akigVar, SharedPreferences sharedPreferences, ajoy ajoyVar, aoae aoaeVar, int i, int i2, Executor executor, anib anibVar, byte[] bArr) {
        apxfVar.getClass();
        this.a = apxfVar;
        executor.getClass();
        this.s = executor;
        this.t = anibVar;
        amkq.E(apxfVar.pY(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint));
        aavjVar.getClass();
        this.b = aavjVar;
        acraVar.getClass();
        this.u = acraVar;
        zawVar.getClass();
        this.c = zawVar;
        executorService.getClass();
        this.d = executorService;
        ypaVar.getClass();
        this.e = ypaVar;
        ajjzVar.getClass();
        this.v = ajjzVar;
        apetVar.getClass();
        this.f = apetVar;
        context.getClass();
        this.g = context;
        aahdVar.getClass();
        this.w = aahdVar;
        ajutVar.getClass();
        this.x = ajutVar;
        this.h = akiuVar;
        this.y = akhnVar;
        akkzVar.getClass();
        this.j = akkzVar;
        cndVar.getClass();
        this.k = cndVar;
        aoaeVar.getClass();
        this.F = aoaeVar;
        this.i = new ArrayList();
        ajnq ajnqVar = new ajnq();
        this.z = ajnqVar;
        this.B = ajoyVar.a(ajnqVar);
        ajnq ajnqVar2 = new ajnq();
        this.A = ajnqVar2;
        ajox a = ajoyVar.a(ajnqVar2);
        this.C = a;
        a.rU(new ajns(i, i2));
        new akis(this);
        ajdhVar.getClass();
        this.l = ajdhVar;
        akigVar.getClass();
        this.m = akigVar;
        sharedPreferences.getClass();
        this.D = sharedPreferences;
        yjk.f();
        akkzVar.a.clear();
        Iterator it = akkzVar.c.iterator();
        while (it.hasNext()) {
            akkzVar.b((akky) it.next());
        }
    }

    public final List b() {
        try {
            return (List) this.n.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            zga.d("Error retrieving share-capable activities.", e);
            return new ArrayList();
        }
    }

    public final void c() {
        arej arejVar;
        View view;
        if (!this.r || (arejVar = this.p) == null || (view = this.q) == null) {
            return;
        }
        this.y.a(arejVar, view, this.j);
    }

    public final void d(aavq aavqVar) {
        Iterator it;
        akii akimVar;
        apmg apmgVar;
        aong aongVar;
        avmn avmnVar;
        avma avmaVar;
        if (this.o) {
            return;
        }
        if (aavqVar.b == null) {
            aqfz aqfzVar = aavqVar.a.d;
            if (aqfzVar == null) {
                aqfzVar = aqfz.a;
            }
            if ((aqfzVar.b & 1) != 0) {
                aqfz aqfzVar2 = aavqVar.a.d;
                if (aqfzVar2 == null) {
                    aqfzVar2 = aqfz.a;
                }
                avmt avmtVar = aqfzVar2.c;
                if (avmtVar == null) {
                    avmtVar = avmt.a;
                }
                aavqVar.b = new aavt(avmtVar);
            }
        }
        aavt aavtVar = aavqVar.b;
        if (aavtVar == null) {
            zga.b("Unified share panel not returned.");
            this.c.c(R.string.common_error_generic);
            this.h.h();
            return;
        }
        aavtVar.b();
        avmb avmbVar = aavtVar.a.e;
        if (avmbVar == null) {
            avmbVar = avmb.a;
        }
        this.E = avmbVar.b == 133836655;
        this.u.d(acsb.b(21760), this.a, null);
        ((acqq) this.u).D(new acqx(aavqVar.a()));
        if (aavqVar.a() != null) {
            this.u.u(new acqx(aavqVar.a()), null);
        }
        avmg a = aavtVar.a();
        if (a != null) {
            akih akihVar = new akih(a, this.g, this.w);
            this.i.add(akihVar);
            akihVar.c(this.z);
            this.B.h(akihVar.a);
        }
        ajoc ajocVar = new ajoc();
        if (aavtVar.b == null) {
            aavtVar.b = new ArrayList();
            avmj avmjVar = aavtVar.a.h;
            if (avmjVar == null) {
                avmjVar = avmj.a;
            }
            if ((avmjVar.b & 1) != 0) {
                List list = aavtVar.b;
                avmj avmjVar2 = aavtVar.a.h;
                if (avmjVar2 == null) {
                    avmjVar2 = avmj.a;
                }
                avmi avmiVar = avmjVar2.c;
                if (avmiVar == null) {
                    avmiVar = avmi.a;
                }
                list.add(avmiVar);
            }
            for (avmk avmkVar : aavtVar.a.d) {
                int i = avmkVar.b;
                if ((i & 2) != 0) {
                    List list2 = aavtVar.b;
                    avlx avlxVar = avmkVar.c;
                    if (avlxVar == null) {
                        avlxVar = avlx.a;
                    }
                    aavtVar.b();
                    list2.add(new adyu(avlxVar));
                } else if ((i & 4) != 0) {
                    List list3 = aavtVar.b;
                    avmc avmcVar = avmkVar.d;
                    if (avmcVar == null) {
                        avmcVar = avmc.a;
                    }
                    list3.add(avmcVar);
                } else if ((i & 8) != 0) {
                    List list4 = aavtVar.b;
                    avmq avmqVar = avmkVar.e;
                    if (avmqVar == null) {
                        avmqVar = avmq.a;
                    }
                    list4.add(avmqVar);
                } else if ((i & 64) != 0) {
                    List list5 = aavtVar.b;
                    avlt avltVar = avmkVar.g;
                    if (avltVar == null) {
                        avltVar = avlt.a;
                    }
                    list5.add(avltVar);
                } else if ((i & 16) != 0) {
                    List list6 = aavtVar.b;
                    avmp avmpVar = avmkVar.f;
                    if (avmpVar == null) {
                        avmpVar = avmp.a;
                    }
                    list6.add(avmpVar);
                }
            }
            avmb avmbVar2 = aavtVar.a.e;
            if (avmbVar2 == null) {
                avmbVar2 = avmb.a;
            }
            if (avmbVar2.b == 133836655) {
                List list7 = aavtVar.b;
                avmb avmbVar3 = aavtVar.a.e;
                if (avmbVar3 == null) {
                    avmbVar3 = avmb.a;
                }
                if (avmbVar3.b == 133836655) {
                    avmaVar = (avma) avmbVar3.c;
                } else {
                    avmaVar = avma.a;
                }
                list7.add(avmaVar);
            }
        }
        List list8 = aavtVar.b;
        avmg a2 = aavtVar.a();
        if (a2 != null) {
            avmm avmmVar = a2.c;
            if (avmmVar == null) {
                avmmVar = avmm.a;
            }
            if (avmmVar.b == 133737618) {
                avmm avmmVar2 = a2.c;
                if (avmmVar2 == null) {
                    avmmVar2 = avmm.a;
                }
                if (avmmVar2.b == 133737618) {
                    avmnVar = (avmn) avmmVar2.c;
                } else {
                    avmnVar = avmn.a;
                }
                list8.add(0, avmnVar);
            }
            avmf avmfVar = a2.b;
            if (avmfVar == null) {
                avmfVar = avmf.a;
            }
            if ((avmfVar.b & 1) != 0) {
                avmf avmfVar2 = a2.b;
                if (avmfVar2 == null) {
                    avmfVar2 = avmf.a;
                }
                avlv avlvVar = avmfVar2.c;
                if (avlvVar == null) {
                    avlvVar = avlv.a;
                }
                list8.add(0, avlvVar);
            }
        }
        Iterator it2 = list8.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof avmq) {
                it = it2;
                akimVar = new akiq((avmq) next, this.g, this.w, this.f, b(), this.h, this.e, this.v, this.j, this.u, this.E, this.s, this.t);
            } else {
                it = it2;
                if (next instanceof avmn) {
                    akimVar = new akik((avmn) next, this.g, this.w);
                } else if (next instanceof avmi) {
                    akimVar = new akib((avmi) next, this.g, this.v, this.w, this.x, this.D);
                } else if (next instanceof avlv) {
                    akimVar = new akho((avlv) next, this.g, this.w, this.F, this.u, this.h, this, null);
                } else {
                    akimVar = next instanceof avmp ? new akim((avmp) next, this.g, this.h, this.x, this.w) : null;
                }
            }
            if (akimVar != null) {
                this.i.add(akimVar);
                akimVar.c(this.A);
                ajocVar.m(akimVar.lC());
            } else if (next instanceof avma) {
                avma avmaVar2 = (avma) next;
                akkz akkzVar = this.j;
                apmh apmhVar = avmaVar2.b;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                if ((apmhVar.b & 1) != 0) {
                    apmh apmhVar2 = avmaVar2.b;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmgVar = apmhVar2.c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                } else {
                    apmgVar = null;
                }
                if (apmgVar != null && (apmgVar.b & 8192) != 0) {
                    apxf apxfVar = apmgVar.n;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aongVar = (aong) apxfVar.toBuilder();
                } else if (akkzVar.d == null) {
                    aongVar = (aong) apxf.a.createBuilder();
                    aongVar.e(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, SendShareEndpoint$SendShareToContactsEndpoint.a);
                }
                aone builder = ((SendShareEndpoint$SendShareToContactsEndpoint) aongVar.pX(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint)).toBuilder();
                if ((((SendShareEndpoint$SendShareToContactsEndpoint) builder.instance).b & 1) == 0) {
                    arlh arlhVar = arlh.a;
                    builder.copyOnWrite();
                    SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint) builder.instance;
                    arlhVar.getClass();
                    sendShareEndpoint$SendShareToContactsEndpoint.c = arlhVar;
                    sendShareEndpoint$SendShareToContactsEndpoint.b |= 1;
                }
                if ((((SendShareEndpoint$SendShareToContactsEndpoint) builder.instance).b & 2) == 0) {
                    arlg arlgVar = arlg.a;
                    builder.copyOnWrite();
                    SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint2 = (SendShareEndpoint$SendShareToContactsEndpoint) builder.instance;
                    arlgVar.getClass();
                    sendShareEndpoint$SendShareToContactsEndpoint2.d = arlgVar;
                    sendShareEndpoint$SendShareToContactsEndpoint2.b |= 2;
                }
                aongVar.e(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (SendShareEndpoint$SendShareToContactsEndpoint) builder.build());
                akkzVar.d = (apxf) aongVar.build();
            }
            it2 = it;
        }
        this.C.h(ajocVar);
        ypa ypaVar = this.e;
        this.C.b();
        ypaVar.d(new fbs());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        arrayList.addAll(this.i);
        Iterator it3 = this.i.iterator();
        while (it3.hasNext()) {
            ((akii) it3.next()).b(arrayList);
        }
        akig akigVar = this.m;
        for (Object obj : arrayList) {
            if (obj instanceof aklj) {
                akigVar.b.add((aklj) obj);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        Iterator it4 = aavtVar.a.g.iterator();
        while (it4.hasNext()) {
            this.w.c((apxf) it4.next(), hashMap);
        }
        this.h.d(this.B, this.C);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aaci.class, akiw.class};
        }
        if (i == 0) {
            this.h.k((aaci) obj);
            return null;
        }
        if (i == 1) {
            this.h.h();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajdg
    public final void lP() {
        this.h.h();
    }
}
