package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddContactsEndpointOuterClass$AddContactsEndpoint;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akjs extends akjx implements View.OnClickListener, ypd {
    public static final long ae = TimeUnit.SECONDS.toMillis(10);
    public acra af;
    public ajvb ag;
    public ajoy ah;
    public ypa ai;
    public aahd aj;
    public shf ak;
    public zim al;
    private apxf am;
    private View an;
    private RecyclerView ao;
    private ajpd ap;
    private Toolbar aq;
    private Snackbar ar;

    public static akjs aF(apxf apxfVar) {
        amkq.E(apxfVar.pY(AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint));
        akjs akjsVar = new akjs();
        Bundle bundle = new Bundle();
        amkq.cn(bundle, "add_contacts_endpoint", apxfVar);
        akjsVar.af(bundle);
        return akjsVar;
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.ai.m(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aaci.class};
        }
        if (i == 0) {
            ahbx.G(this.ak, this.ar, (aaci) obj, ae, this.aj, Integer.valueOf(wbs.W(qR(), R.attr.ytStaticBlue).orElse(0)));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, this.al.a);
        this.ai.g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [ajos, java.lang.Object] */
    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aozr aozrVar;
        byte[] I;
        aozn aoznVar;
        View inflate = layoutInflater.inflate(R.layout.add_contacts, viewGroup, false);
        this.an = inflate;
        this.ao = (RecyclerView) inflate.findViewById(R.id.add_contacts_choice_list);
        this.aq = (Toolbar) this.an.findViewById(R.id.toolbar);
        this.ar = (Snackbar) this.an.findViewById(R.id.snackbar);
        this.ag.a(aozp.class);
        this.ao.af(new LinearLayoutManager());
        this.ap = new ajpd();
        ajox a = this.ah.a(this.ag.get());
        a.h(this.ap);
        a.rU(new ajnw(this.af));
        this.ao.ac(a);
        this.aq.r(this);
        this.aq.o(R.string.accessibility_back);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("add_contacts_endpoint")) {
            this.am = apxf.a;
        } else {
            try {
                this.am = (apxf) amkq.cj(bundle2, "add_contacts_endpoint", apxf.a, aomw.b());
            } catch (aoob unused) {
                this.am = apxf.a;
            }
        }
        String str = this.am.pY(AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint) ? ((AddContactsEndpointOuterClass$AddContactsEndpoint) this.am.pX(AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint)).b : null;
        arix arixVar = TextUtils.isEmpty(str) ? null : (arix) adyu.dv(str, arix.a.getParserForType());
        if (arixVar != null) {
            if ((arixVar.b & 8) != 0) {
                ((acqq) this.af).D(new acqx(arixVar.d));
            }
            this.af.d(acsb.b(26926), this.am, null);
            if ((arixVar.b & 8) != 0) {
                this.af.u(new acqx(arixVar.d), null);
            }
            ariw ariwVar = arixVar.c;
            if (ariwVar == null) {
                ariwVar = ariw.a;
            }
            if ((ariwVar.b & 1) != 0) {
                ariw ariwVar2 = arixVar.c;
                if (ariwVar2 == null) {
                    ariwVar2 = ariw.a;
                }
                auov auovVar = ariwVar2.c;
                if (auovVar == null) {
                    auovVar = auov.a;
                }
                if (auovVar.d.size() > 0 && (((auoy) auovVar.d.get(0)).c & 1) != 0) {
                    aozp aozpVar = ((auoy) auovVar.d.get(0)).L;
                    if (aozpVar == null) {
                        aozpVar = aozp.a;
                    }
                    if (aozpVar.b.size() != 0) {
                        for (aozq aozqVar : aozpVar.b) {
                            int i = aozqVar.b;
                            if (i == 105876287) {
                                aozn aoznVar2 = (aozn) aozqVar.c;
                                I = aoznVar2.b.I();
                                aoznVar = aoznVar2;
                            } else if (i == 79129962) {
                                aqbs aqbsVar = (aqbs) aozqVar.c;
                                I = aqbsVar.n.I();
                                aoznVar = aqbsVar;
                            } else if (i == 154581033) {
                                aozm aozmVar = (aozm) aozqVar.c;
                                I = aozmVar.b.I();
                                aoznVar = aozmVar;
                            }
                            this.ap.add(aoznVar);
                            ((acqq) this.af).D(new acqx(I));
                        }
                    }
                }
                auou auouVar = auovVar.g;
                if (auouVar == null) {
                    auouVar = auou.a;
                }
                if (auouVar.b == 128619045) {
                    Toolbar toolbar = this.aq;
                    auou auouVar2 = auovVar.g;
                    if (auouVar2 == null) {
                        auouVar2 = auou.a;
                    }
                    if (auouVar2.b == 128619045) {
                        aozrVar = (aozr) auouVar2.c;
                    } else {
                        aozrVar = aozr.a;
                    }
                    aqyg aqygVar = aozrVar.b;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    toolbar.x(ajcq.b(aqygVar));
                }
            }
        }
        return this.an;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
    }
}
