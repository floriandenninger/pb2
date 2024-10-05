package defpackage;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adev extends ader implements addp {
    public AdapterView.OnItemClickListener m;
    public final ypa n;
    public final azrw o;
    public final adcu p;
    public final acra q;
    public final Map r;
    private final adcj s;
    private final adeg t;
    private final acwr u;
    private final boolean v;
    private final acxi w;
    private final acwp x;

    public adev(Context context, adlj adljVar, adbu adbuVar, boolean z, ypa ypaVar, azrw azrwVar, azrw azrwVar2, adcu adcuVar, adeg adegVar, acwr acwrVar, acwp acwpVar, acxi acxiVar, acun acunVar, acra acraVar, Executor executor, adee adeeVar) {
        super(context, null);
        this.s = new adcj(adljVar, adbuVar, z, this, azrwVar2 != null ? (String) azrwVar2.get() : null, executor, adeeVar);
        this.n = ypaVar;
        this.o = azrwVar;
        this.p = adcuVar;
        this.t = adegVar;
        this.v = acunVar.ah;
        this.u = acwrVar;
        this.x = acwpVar;
        this.w = acxiVar;
        this.q = acraVar;
        this.r = new HashMap();
    }

    @Override // defpackage.bnp
    public final void a(List list) {
        this.s.b(list);
        if (this.q.c() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bpv bpvVar = (bpv) it.next();
                if (this.r.containsKey(bpvVar.c)) {
                    this.q.u((acsa) this.r.get(bpvVar.c), p(bpvVar));
                } else {
                    acsa acsaVar = new acsa(this.q.c(), acrb.MEDIA_ROUTE_CONNECT_BUTTON);
                    this.q.D(acsaVar);
                    this.q.u(acsaVar, p(bpvVar));
                    this.r.put(bpvVar.c, acsaVar);
                }
            }
            return;
        }
        zga.c(adew.ae, "No screen attached to interaction logger yet.");
    }

    @Override // defpackage.ader
    protected final void j(rpi rpiVar) {
        rpt c;
        acwp acwpVar = this.x;
        acwv acwvVar = acwpVar.a;
        if (acwvVar.c.h(acwvVar.b, 211500000) != 0) {
            c = rqr.c(2);
        } else {
            qob qobVar = acwpVar.b;
            rpv rpvVar = new rpv();
            qrd b = qre.b();
            b.c = 8417;
            b.a = new qes(3);
            rpt t = qobVar.t(b.a());
            t.r(new qyh(rpvVar, 1));
            t.n(new qyg(rpvVar, 1));
            c = rpvVar.a;
        }
        c.q(rpiVar);
    }

    @Override // defpackage.ader
    protected final void m() {
        ListView listView = this.c;
        this.m = listView.getOnItemClickListener();
        listView.setOnItemClickListener(new adeu(this));
    }

    @Override // defpackage.ader
    protected final boolean n() {
        return this.v;
    }

    @Override // defpackage.ader
    protected final boolean o() {
        acxi acxiVar = this.w;
        return acxiVar != null && acxiVar.c.equals("cl");
    }

    public final asht p(bpv bpvVar) {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashu.a.createBuilder();
        adeg adegVar = this.t;
        int i = adegVar.f(bpvVar) ? 4 : adegVar.e(bpvVar) ? 5 : adeg.h(bpvVar) ? 2 : adeg.i(bpvVar) ? 3 : 1;
        createBuilder2.copyOnWrite();
        ashu ashuVar = (ashu) createBuilder2.instance;
        ashuVar.c = i - 1;
        ashuVar.b |= 1;
        ashu ashuVar2 = (ashu) createBuilder2.build();
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashuVar2.getClass();
        ashtVar.e = ashuVar2;
        ashtVar.b |= 4;
        return (asht) createBuilder.build();
    }

    @Override // defpackage.addp
    public final boolean ra(bpv bpvVar) {
        acsa acsaVar;
        if (this.u.e() || !this.t.f(bpvVar)) {
            return i(bpvVar);
        }
        if (this.q.c() == null) {
            return false;
        }
        if (this.r.containsKey(bpvVar.c)) {
            acsaVar = (acsa) this.r.get(bpvVar.c);
        } else {
            acsaVar = new acsa(this.q.c(), acrb.MEDIA_ROUTE_CONNECT_BUTTON);
            this.q.D(acsaVar);
            this.r.put(bpvVar.c, acsaVar);
        }
        this.q.q(acsaVar, p(bpvVar));
        return false;
    }
}
