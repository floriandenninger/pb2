package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wij implements afte {
    public static final /* synthetic */ int c = 0;
    private static final long e = TimeUnit.MINUTES.toSeconds(90);
    public final wgv a;
    public final acpk b;
    private final boolean f;
    private final axpg g;
    private final axpg h;
    private final ypa i;
    private final Set j = new HashSet();
    private final SharedPreferences k;
    private final abep l;
    private final shf m;

    public wij(axpg axpgVar, axpg axpgVar2, ypa ypaVar, SharedPreferences sharedPreferences, wgv wgvVar, abep abepVar, shf shfVar, acpk acpkVar, aadw aadwVar) {
        this.g = axpgVar;
        this.h = axpgVar2;
        this.i = ypaVar;
        this.k = sharedPreferences;
        this.a = wgvVar;
        this.l = abepVar;
        this.m = shfVar;
        this.b = acpkVar;
        this.f = whu.e(aadwVar);
    }

    public final long a() {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(this.m.c()));
    }

    @Override // defpackage.afte
    public final anhy b() {
        anhy O;
        wgv wgvVar = this.a;
        final String str = wgvVar.b;
        if (str == null) {
            return anaf.O(false);
        }
        if (!wgv.e(wgvVar.c)) {
            O = anaf.O(Boolean.valueOf(((SharedPreferences) wgvVar.a.get()).getBoolean(str.length() != 0 ? "incognito_promotion_already_shown".concat(str) : new String("incognito_promotion_already_shown"), false)));
        } else {
            O = anfq.h(wgvVar.d.a(), new wgs(str, 0), angq.a);
        }
        return anfq.h(O, new amml() { // from class: wii
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                anhy anhyVar;
                wij wijVar = wij.this;
                String str2 = str;
                if (((Boolean) obj).booleanValue()) {
                    return false;
                }
                wgv wgvVar2 = wijVar.a;
                if (!wgv.e(wgvVar2.c)) {
                    ((SharedPreferences) wgvVar2.a.get()).edit().putBoolean(str2.length() != 0 ? "incognito_promotion_already_shown".concat(str2) : new String("incognito_promotion_already_shown"), true).apply();
                    anhyVar = anhv.a;
                } else {
                    anhyVar = wgvVar2.d.b(new wgs(str2, 4), angq.a);
                }
                ynm.i(anhyVar, llr.j);
                return true;
            }
        }, angq.a);
    }

    @Override // defpackage.afte
    public final synchronized void c() {
        long j = this.k.getLong("incognito_LACT", 0L);
        if (j != 0 && TimeUnit.MILLISECONDS.toSeconds(this.m.d() - j) <= e && this.m.d() - j >= 0) {
            h();
            return;
        }
        k(null, null, true);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((aftf) it.next()).l();
        }
    }

    @Override // defpackage.afte
    public final synchronized void d(String str) {
        if (this.f) {
            aone createBuilder = aouu.a.createBuilder();
            createBuilder.copyOnWrite();
            aouu aouuVar = (aouu) createBuilder.instance;
            aouuVar.c = 6;
            aouuVar.b |= 1;
            aouu aouuVar2 = (aouu) createBuilder.build();
            arpn a = arpp.a();
            a.copyOnWrite();
            ((arpp) a.instance).bW(aouuVar2);
            this.b.b((arpp) a.build(), a());
        }
        ((wdd) this.g.get()).p(str);
        ((wdm) this.h.get()).i();
        this.i.f(new afto());
        this.i.d(new wjc(wjb.FINISHED, true));
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((aftf) it.next()).j();
        }
        if (this.f) {
            aone createBuilder2 = aouv.a.createBuilder();
            createBuilder2.copyOnWrite();
            aouv aouvVar = (aouv) createBuilder2.instance;
            aouvVar.c = 6;
            aouvVar.b |= 1;
            aouv aouvVar2 = (aouv) createBuilder2.build();
            arpn a2 = arpp.a();
            a2.copyOnWrite();
            ((arpp) a2.instance).bX(aouvVar2);
            this.b.a((arpp) a2.build());
        }
    }

    @Override // defpackage.afte
    public final synchronized void e(afsp afspVar) {
        k(afspVar, null, false);
    }

    @Override // defpackage.afte
    public final void f(afsp afspVar, apxf apxfVar) {
        k(afspVar, apxfVar, false);
    }

    @Override // defpackage.afte
    public final synchronized void h() {
        this.k.edit().putLong("incognito_LACT", this.m.d()).apply();
    }

    @Override // defpackage.afte
    public final void i(aftf aftfVar) {
        this.j.add(aftfVar);
    }

    @Override // defpackage.afte
    public final void j(aftf aftfVar) {
        this.j.remove(aftfVar);
    }

    private final synchronized void k(afsp afspVar, apxf apxfVar, boolean z) {
        if (this.f) {
            aone createBuilder = aouv.a.createBuilder();
            createBuilder.copyOnWrite();
            aouv aouvVar = (aouv) createBuilder.instance;
            aouvVar.c = 7;
            aouvVar.b |= 1;
            if (z) {
                createBuilder.copyOnWrite();
                aouv aouvVar2 = (aouv) createBuilder.instance;
                aouvVar2.d = 8;
                aouvVar2.b |= 2;
            }
            arpn a = arpp.a();
            a.copyOnWrite();
            ((arpp) a.instance).bX((aouv) createBuilder.build());
            this.b.a((arpp) a.build());
        }
        this.i.d(new wjc(wjb.STARTED, false));
        ((wdd) this.g.get()).k();
        this.k.edit().putLong("incognito_LACT", 0L).apply();
        this.i.d(new wjc(wjb.FINISHED, true, apxfVar));
        this.i.f(new aftm(((wdd) this.g.get()).c()));
        if (afspVar != null) {
            afspVar.a();
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((aftf) it.next()).k();
        }
        if (this.f) {
            final aone createBuilder2 = aouu.a.createBuilder();
            createBuilder2.copyOnWrite();
            aouu aouuVar = (aouu) createBuilder2.instance;
            aouuVar.c = 7;
            aouuVar.b |= 1;
            if (z) {
                createBuilder2.copyOnWrite();
                aouu aouuVar2 = (aouu) createBuilder2.instance;
                aouuVar2.d = 8;
                aouuVar2.b |= 2;
            }
            abeo a2 = this.l.a();
            ((abet) a2).b = new amml() { // from class: wih
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    wij wijVar = wij.this;
                    aone aoneVar = createBuilder2;
                    apgh apghVar = (apgh) obj;
                    if (!apgh.a.equals(apghVar)) {
                        aoneVar.copyOnWrite();
                        aouu aouuVar3 = (aouu) aoneVar.instance;
                        aouu aouuVar4 = aouu.a;
                        apghVar.getClass();
                        aouuVar3.e = apghVar;
                        aouuVar3.b |= 8;
                    }
                    arpn a3 = arpp.a();
                    a3.copyOnWrite();
                    ((arpp) a3.instance).bW((aouu) aoneVar.build());
                    wijVar.b.b((arpp) a3.build(), wijVar.a());
                    return apgh.a;
                }
            };
            ynm.m(a2.a(), lra.j);
        }
    }
}
