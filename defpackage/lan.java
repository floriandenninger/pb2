package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lan extends lbb {
    public final zaw a;
    public final ajpd b;
    public final axzg c;
    private final Executor d;
    private final agsn e;
    private final tru f;

    public lan(azrw azrwVar, aild aildVar, tru truVar, azrw azrwVar2, ajoy ajoyVar, Executor executor, zaw zawVar, aadw aadwVar, aaea aaeaVar, azrw azrwVar3, jsg jsgVar, mna mnaVar, axzg axzgVar, RecyclerView recyclerView, LoadingFrameLayout loadingFrameLayout, Activity activity, acra acraVar, Bundle bundle, ajxe ajxeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(loadingFrameLayout, activity, acraVar, aadwVar, aaeaVar, bundle, ajxeVar);
        this.f = truVar;
        this.d = executor;
        this.a = zawVar;
        this.e = ((agof) azrwVar.get()).a();
        this.c = axzgVar;
        aildVar.d = new aila(activity, null);
        recyclerView.af(new LinearLayoutManager());
        ajnq ajnqVar = new ajnq();
        ajnqVar.f(agnp.class, jsgVar);
        ajnqVar.f(agng.class, mnaVar);
        ajnqVar.f(atdn.class, new ajou(azrwVar2));
        ajnqVar.f(apib.class, new ajou(azrwVar3));
        ajpd ajpdVar = new ajpd();
        this.b = ajpdVar;
        ajox a = ajoyVar.a(ajnqVar);
        if (axzgVar.y()) {
            a.rU(new mdu(acraVar, 1));
        }
        a.h(ajpdVar);
        recyclerView.ac(a);
    }

    public static /* synthetic */ boolean f(Object obj) {
        return ((obj instanceof agnv) && ((agnv) obj).s()) ? false : true;
    }

    @Override // defpackage.lbb
    public final void a() {
    }

    @Override // defpackage.lbb
    public final void b(String str, String str2) {
    }

    @Override // defpackage.lbb
    public final void c(Configuration configuration) {
    }

    @Override // defpackage.lbb
    public final void d(final String str) {
        this.B.c();
        tru truVar = this.f;
        final agsn agsnVar = this.e;
        final yko c = yko.c(this.d, new lam(this));
        agsnVar.getClass();
        truVar.a.execute(new Runnable() { // from class: agrr
            @Override // java.lang.Runnable
            public final void run() {
                ykl yklVar = ykl.this;
                agsn agsnVar2 = agsnVar;
                agrt agrtVar = new agrt(str);
                Iterator it = agsnVar2.m().j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    agnv agnvVar = (agnv) it.next();
                    if (lan.f(agnvVar)) {
                        agnp agnpVar = agnvVar.a;
                        if (!agrtVar.d.containsKey(agnpVar)) {
                            aeg aegVar = agrtVar.d;
                            String str2 = agrtVar.a;
                            String j = agnpVar.j();
                            agnb agnbVar = agnpVar.a;
                            aegVar.put(agnpVar, Integer.valueOf(aedn.x(str2, j, agnbVar != null ? agnbVar.b : "")));
                            agrtVar.b.add(agnpVar);
                        }
                    }
                }
                for (agng agngVar : agsnVar2.i().m()) {
                    if (lan.f(agngVar) && !agrtVar.d.containsKey(agngVar)) {
                        aeg aegVar2 = agrtVar.d;
                        String str3 = agrtVar.a;
                        String str4 = agngVar.b;
                        agnb agnbVar2 = agngVar.c;
                        aegVar2.put(agngVar, Integer.valueOf(aedn.x(str3, str4, agnbVar2 != null ? agnbVar2.b : "")));
                        agrtVar.c.add(agngVar);
                    }
                }
                ArrayList arrayList = new ArrayList(agrtVar.b.size() + agrtVar.c.size());
                ArrayList arrayList2 = agrtVar.b;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    agnp agnpVar2 = (agnp) arrayList2.get(i);
                    Integer num = (Integer) agrtVar.d.get(agnpVar2);
                    if (num != null && num.intValue() > 0) {
                        arrayList.add(agnpVar2);
                    }
                }
                ArrayList arrayList3 = agrtVar.c;
                int size2 = arrayList3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    agng agngVar2 = (agng) arrayList3.get(i2);
                    Integer num2 = (Integer) agrtVar.d.get(agngVar2);
                    if (num2 != null && num2.intValue() > 0) {
                        arrayList.add(agngVar2);
                    }
                }
                arrayList.trimToSize();
                Collections.sort(arrayList, agrtVar.e);
                yklVar.b(null, arrayList);
            }
        });
    }

    @Override // defpackage.lbb
    public final boolean oa() {
        return false;
    }
}
