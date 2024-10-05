package defpackage;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akiq extends ajsu implements akii, aklj, akma, akji, akky {
    public final PackageManager a;
    public final aahd b;
    public final akiu c;
    public final ypa d;
    public final acra e;
    public final Map f;
    public final Map g;
    public final Executor h;
    public final anib i;
    public boolean j;
    public String k;
    private final Context l;
    private final ajpd m;
    private final int n;
    private final List o;
    private final ajjz p;
    private final akkz q;
    private final boolean r;
    private final int s;

    public akiq(avmq avmqVar, Context context, aahd aahdVar, apet apetVar, List list, akiu akiuVar, ypa ypaVar, ajjz ajjzVar, akkz akkzVar, acra acraVar, boolean z, Executor executor, anib anibVar) {
        auru auruVar;
        this.l = context;
        this.b = aahdVar;
        this.c = akiuVar;
        this.d = ypaVar;
        this.p = ajjzVar;
        this.q = akkzVar;
        this.e = acraVar;
        this.r = z;
        this.s = true != akiuVar.l() ? 4 : 1;
        this.h = executor;
        anibVar.getClass();
        this.i = anibVar;
        this.f = new HashMap();
        this.g = new HashMap();
        this.m = new ajpd();
        this.n = context.getResources().getInteger(R.integer.share_panel_third_party_columns);
        this.a = context.getPackageManager();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            yjj.w(hashMap, ahbx.I(resolveInfo.activityInfo.applicationInfo.packageName, apetVar), resolveInfo);
        }
        this.o = new ArrayList();
        this.j = true;
        for (aurv aurvVar : avmqVar.c) {
            if ((aurvVar.b & 2) != 0) {
                auru auruVar2 = aurvVar.d;
                auruVar2 = auruVar2 == null ? auru.a : auruVar2;
                Set set = (Set) hashMap.get(Integer.valueOf(auruVar2.c));
                if (set == null || set.isEmpty()) {
                    this.o.add(auruVar2);
                } else {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ResolveInfo resolveInfo2 = (ResolveInfo) it2.next();
                        auru H = ahbx.H(auruVar2, resolveInfo2);
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo != null && activityInfo.exported) {
                            this.f.put(H, resolveInfo2);
                            this.o.add(H);
                        }
                        it2.remove();
                    }
                }
            }
        }
        for (aurn aurnVar : avmqVar.e) {
            if (aurnVar != null) {
                hashMap.remove(Integer.valueOf(aurnVar.c));
            }
        }
        if ((avmqVar.b & 2) != 0) {
            Iterator it3 = hashMap.values().iterator();
            while (it3.hasNext()) {
                for (ResolveInfo resolveInfo3 : (Set) it3.next()) {
                    aurw aurwVar = avmqVar.d;
                    if (((aurwVar == null ? aurw.a : aurwVar).b & 1) != 0) {
                        aurw aurwVar2 = avmqVar.d;
                        auruVar = (aurwVar2 == null ? aurw.a : aurwVar2).c;
                        if (auruVar == null) {
                            auruVar = auru.a;
                        }
                    } else {
                        auruVar = null;
                    }
                    auru H2 = ahbx.H(auruVar, resolveInfo3);
                    this.f.put(H2, resolveInfo3);
                    this.o.add(H2);
                }
            }
        }
        m();
        akkzVar.a(this);
    }

    public static final asht k(auru auruVar) {
        apxf apxfVar = auruVar.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        arlf arlfVar = ((SendShareEndpoint$SendShareExternallyEndpoint) apxfVar.pX(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).d;
        if (arlfVar == null) {
            arlfVar = arlf.a;
        }
        aurn aurnVar = arlfVar.c;
        if (aurnVar == null) {
            aurnVar = aurn.a;
        }
        if (aurnVar.d.isEmpty() || aurnVar.e.isEmpty()) {
            return null;
        }
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashy.a.createBuilder();
        String format = String.format("%s/%s", aurnVar.d, aurnVar.e);
        createBuilder2.copyOnWrite();
        ashy ashyVar = (ashy) createBuilder2.instance;
        format.getClass();
        ashyVar.b = 1 | ashyVar.b;
        ashyVar.c = format;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashy ashyVar2 = (ashy) createBuilder2.build();
        ashyVar2.getClass();
        ashtVar.i = ashyVar2;
        ashtVar.b |= 32;
        return (asht) createBuilder.build();
    }

    private final void m() {
        if (!this.r || this.j) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((acqq) this.e).D(new acqx(((auru) it.next()).g));
            }
            akip akipVar = new akip(this.o, this.n);
            this.m.clear();
            boolean z = !this.c.l();
            for (int i = 0; i < akipVar.size(); i++) {
                List list = akipVar.get(i);
                if (i < this.s) {
                    this.m.add(new akku(this.n, list));
                } else {
                    ajpd ajpdVar = this.m;
                    ajnh a = ajni.a();
                    a.a = this.n;
                    a.b = list;
                    ajpdVar.add(a.a());
                    z = false;
                }
            }
            this.c.i(z);
            return;
        }
        this.m.clear();
    }

    @Override // defpackage.akky
    public final void a(akkz akkzVar) {
        boolean z = false;
        if (TextUtils.isEmpty(null) && akkzVar.a.isEmpty()) {
            z = true;
        }
        this.j = z;
        if (this.r) {
            m();
        } else {
            this.m.l();
        }
    }

    @Override // defpackage.akii
    public final void b(List list) {
    }

    @Override // defpackage.akii
    public final void c(ajos ajosVar) {
        jgc jgcVar = new jgc(2);
        ajosVar.f(auru.class, new aklz(this.l, this, this.p));
        ajnt ajntVar = new ajnt(this.l, jgcVar, ajosVar);
        ajosVar.f(ajni.class, ajntVar);
        ajosVar.f(akku.class, ajntVar);
    }

    @Override // defpackage.aklj
    public final void d(String str) {
        this.k = str;
    }

    @Override // defpackage.aklj
    public final void f() {
    }

    @Override // defpackage.akji
    public final void h() {
        this.c.b(false);
    }

    @Override // defpackage.akji
    public final void i() {
        this.c.b(false);
        this.c.h();
        this.d.d(new akiw());
    }

    @Override // defpackage.ajsu, defpackage.zfk
    public final void j() {
        this.q.c(this);
    }

    @Override // defpackage.aklj
    public final void l() {
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.m;
    }

    @Override // defpackage.ajsu, defpackage.ajvc
    public final void lE(Configuration configuration) {
        m();
    }
}
