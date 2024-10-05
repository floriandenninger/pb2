package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class albz {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final Map b;
    private final akyk c;
    private final akxh d;
    private final alcw e;

    public albz(Map map, akyk akykVar, akxh akxhVar, alcw alcwVar) {
        this.b = map;
        this.c = akykVar;
        this.d = akxhVar;
        this.e = alcwVar;
    }

    public final void a(akyc akycVar) {
        akzs akzsVar = akycVar.a;
        akzs akzsVar2 = akycVar.b;
        if (akzsVar == null && akzsVar2 == null) {
            return;
        }
        if (akzsVar == null || !akzsVar.equals(akzsVar2)) {
            if (akzsVar == null) {
                akzsVar2.getClass();
                boolean i = this.c.i();
                boolean h = this.c.h();
                if (i || h) {
                    aone builder = akzsVar2.toBuilder();
                    if ((((akzs) builder.instance).c & 128) == 0) {
                        akzp akzpVar = akzp.a;
                        builder.copyOnWrite();
                        akzs akzsVar3 = (akzs) builder.instance;
                        akzpVar.getClass();
                        akzsVar3.f65J = akzpVar;
                        akzsVar3.c |= 128;
                    }
                    akzp akzpVar2 = ((akzs) builder.instance).f65J;
                    if (akzpVar2 == null) {
                        akzpVar2 = akzp.a;
                    }
                    avtq b = avtq.b(akzpVar2.d);
                    if (b == null) {
                        b = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
                    }
                    if (b == avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN) {
                        aone createBuilder = akzp.a.createBuilder();
                        if (i) {
                            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI;
                            createBuilder.copyOnWrite();
                            akzp akzpVar3 = (akzp) createBuilder.instance;
                            akzpVar3.d = avtqVar.aB;
                            akzpVar3.b |= 2;
                        } else {
                            avtq avtqVar2 = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK;
                            createBuilder.copyOnWrite();
                            akzp akzpVar4 = (akzp) createBuilder.instance;
                            akzpVar4.d = avtqVar2.aB;
                            akzpVar4.b |= 2;
                        }
                        builder.copyOnWrite();
                        akzs akzsVar4 = (akzs) builder.instance;
                        akzp akzpVar5 = (akzp) createBuilder.build();
                        akzpVar5.getClass();
                        akzsVar4.f65J = akzpVar5;
                        akzsVar4.c |= 128;
                    }
                    akzsVar2 = (akzs) builder.build();
                }
                this.d.h(akzsVar2);
                return;
            }
            String str = akzsVar.e;
            String str2 = akzsVar.k;
            if (akzsVar2 == null) {
                this.d.k(str2, akzsVar.ae);
                this.e.c(str2);
                return;
            }
            if (TextUtils.equals(akzsVar2.e, str)) {
                if (!TextUtils.equals(akzsVar2.k, str2)) {
                    throw new AssertionError("Frontend upload id of an upload job must not change");
                }
                if (!b(akzsVar2)) {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((alby) it.next()).y(akzsVar2.k);
                    }
                }
                akzp akzpVar6 = akzsVar.f65J;
                if (akzpVar6 == null) {
                    akzpVar6 = akzp.a;
                }
                long j = akzpVar6.g;
                akzp akzpVar7 = akzsVar2.f65J;
                if (akzpVar7 == null) {
                    akzpVar7 = akzp.a;
                }
                if (j != akzpVar7.g) {
                    akxh akxhVar = this.d;
                    akzp akzpVar8 = akzsVar2.f65J;
                    if (akzpVar8 == null) {
                        akzpVar8 = akzp.a;
                    }
                    akxhVar.g(str2, akzpVar8);
                }
                if (!TextUtils.equals(akzsVar.Y, akzsVar2.Y)) {
                    this.d.m(str2, akzsVar2.Y);
                }
                avuh avuhVar = akzsVar.ab;
                if (avuhVar == null) {
                    avuhVar = avuh.a;
                }
                avuh avuhVar2 = akzsVar2.ab;
                if (avuhVar2 == null) {
                    avuhVar2 = avuh.a;
                }
                if (!avuhVar.equals(avuhVar2)) {
                    akxh akxhVar2 = this.d;
                    avuh avuhVar3 = akzsVar2.ab;
                    if (avuhVar3 == null) {
                        avuhVar3 = avuh.a;
                    }
                    akxhVar2.l(str2, avuhVar3);
                }
                akzr a = akzr.a(akzsVar.Z);
                if (a == null) {
                    a = akzr.UNKNOWN;
                }
                akzr a2 = akzr.a(akzsVar2.Z);
                if (a2 == null) {
                    a2 = akzr.UNKNOWN;
                }
                if (a != a2) {
                    akxh akxhVar3 = this.d;
                    akzr a3 = akzr.a(akzsVar2.Z);
                    if (a3 == null) {
                        a3 = akzr.UNKNOWN;
                    }
                    akxhVar3.n(str2, a3);
                }
                if (alep.a(akzsVar) != alep.a(akzsVar2)) {
                    this.d.o(str2, alep.l(akzsVar2));
                }
                boolean z = akzsVar.ae;
                boolean z2 = akzsVar2.ae;
                if (z != z2) {
                    this.d.a(str2, z2, false);
                } else if (z && !akzsVar.af && akzsVar2.af) {
                    this.d.a(str2, true, true);
                }
                boolean z3 = akzsVar.af;
                boolean z4 = akzsVar2.af;
                if (z3 != z4 && z4) {
                    this.d.j(str2);
                }
                akzw akzwVar = akzsVar.i;
                if (akzwVar == null) {
                    akzwVar = akzw.a;
                }
                akzw akzwVar2 = akzsVar2.i;
                if (akzwVar2 == null) {
                    akzwVar2 = akzw.a;
                }
                if (amkq.b(akzwVar, akzwVar2)) {
                    return;
                }
                this.d.c(str2, akzwVar2);
                return;
            }
            throw new AssertionError("Identity associated with an upload job must not change");
        }
    }

    public final boolean b(akzs akzsVar) {
        akzq a = akzq.a(akzsVar.l);
        if (a == null) {
            a = akzq.UNKNOWN_UPLOAD;
        }
        alde aldeVar = (alde) this.b.get(Integer.valueOf(a.g));
        return aldeVar != null && aldeVar.a(akzsVar);
    }
}
