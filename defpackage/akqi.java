package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqi implements ysb {
    private final acrt a;
    private final ynx b;
    private final shf c;
    private final zgi d;

    public akqi(acrt acrtVar, ynx ynxVar, shf shfVar, zgi zgiVar) {
        this.a = acrtVar;
        this.b = ynxVar;
        this.c = shfVar;
        this.d = zgiVar;
    }

    @Override // defpackage.ysb
    public final void a(ysa ysaVar) {
        InteractionLoggingScreen c;
        avdw avdwVar = this.b.e().e;
        if (avdwVar == null) {
            avdwVar = avdw.a;
        }
        boolean z = avdwVar.g;
        avdw avdwVar2 = this.b.e().e;
        if (avdwVar2 == null) {
            avdwVar2 = avdw.a;
        }
        boolean z2 = avdwVar2.p;
        Integer num = ysaVar.k;
        if (num != null) {
            ArrayList arrayList = new ArrayList();
            Collection collection = ysaVar.m;
            if (collection != null && !collection.isEmpty()) {
                for (Object obj : collection) {
                    if (obj instanceof aaqv) {
                        arrayList.addAll(((aaqv) obj).d);
                    }
                }
            }
            this.d.a(ysaVar.o, ysaVar.a, String.format(Locale.US, "Request failure captured by PRIMES. Failed reason: %d. Annotations: %s", ysaVar.k, TextUtils.join(",", arrayList)), ysaVar.n);
        }
        if (z || (z2 && num != null)) {
            Long l = ysaVar.e;
            usc d = usc.d(uns.a, ysaVar.a, l == null ? this.c.c() : l.longValue());
            String str = ysaVar.i;
            if (str != null) {
                d.i(str);
            }
            String str2 = ysaVar.b;
            if (str2 != null) {
                d.f(str2);
            }
            Long l2 = ysaVar.c;
            int intValue = l2 != null ? l2.intValue() : 0;
            Long l3 = ysaVar.d;
            d.e(intValue, l3 != null ? l3.intValue() : 0);
            Integer num2 = ysaVar.h;
            if (num2 != null) {
                d.g(num2.intValue());
            }
            Long l4 = ysaVar.f;
            if (l4 != null) {
                d.o(uns.a, l4.longValue());
            }
            Long l5 = ysaVar.g;
            if (l5 != null) {
                d.n(uns.a, l5.longValue());
            }
            babu b = babu.b(ysaVar.j);
            if (b != null) {
                d.l(b);
            }
            Integer num3 = ysaVar.k;
            if (num3 != null) {
                d.k(num3.intValue());
            }
            Integer num4 = ysaVar.l;
            if (num4 != null) {
                d.j(num4.intValue());
            }
            aone createBuilder = babh.a.createBuilder();
            avdw avdwVar3 = this.b.e().e;
            if (avdwVar3 == null) {
                avdwVar3 = avdw.a;
            }
            if (avdwVar3.k && (c = this.a.c()) != null) {
                int i = c.c().a;
                createBuilder.copyOnWrite();
                babh babhVar = (babh) createBuilder.instance;
                babhVar.b |= 4;
                babhVar.f = i;
            }
            avdw avdwVar4 = this.b.e().e;
            if (avdwVar4 == null) {
                avdwVar4 = avdw.a;
            }
            if (avdwVar4.g) {
                createBuilder.copyOnWrite();
                babh babhVar2 = (babh) createBuilder.instance;
                babhVar2.g = 1;
                babhVar2.b |= 8;
            } else {
                createBuilder.copyOnWrite();
                babh babhVar3 = (babh) createBuilder.instance;
                babhVar3.g = 2;
                babhVar3.b |= 8;
            }
            Collection collection2 = ysaVar.m;
            if (collection2 != null && !collection2.isEmpty()) {
                for (Object obj2 : collection2) {
                    if (obj2 instanceof aaqv) {
                        aaqv aaqvVar = (aaqv) obj2;
                        d.m(aaqvVar.c);
                        long longValue = aaqvVar.a.longValue();
                        createBuilder.copyOnWrite();
                        babh babhVar4 = (babh) createBuilder.instance;
                        babhVar4.b |= 1;
                        babhVar4.c = longValue;
                        int i2 = aaqvVar.b;
                        createBuilder.copyOnWrite();
                        babh babhVar5 = (babh) createBuilder.instance;
                        babhVar5.b |= 2;
                        babhVar5.d = i2;
                        amru amruVar = aaqvVar.d;
                        createBuilder.copyOnWrite();
                        babh babhVar6 = (babh) createBuilder.instance;
                        aony aonyVar = babhVar6.e;
                        if (!aonyVar.c()) {
                            babhVar6.e = aonm.mutableCopy(aonyVar);
                        }
                        aolo.addAll((Iterable) amruVar, (List) babhVar6.e);
                        aarx aarxVar = aaqvVar.e;
                        if (aarxVar != null) {
                            int i3 = aarxVar.a;
                            createBuilder.copyOnWrite();
                            babh babhVar7 = (babh) createBuilder.instance;
                            babhVar7.b |= 16;
                            babhVar7.h = i3;
                            amru amruVar2 = aarxVar.b;
                            createBuilder.copyOnWrite();
                            babh babhVar8 = (babh) createBuilder.instance;
                            aony aonyVar2 = babhVar8.i;
                            if (!aonyVar2.c()) {
                                babhVar8.i = aonm.mutableCopy(aonyVar2);
                            }
                            aolo.addAll((Iterable) amruVar2, (List) babhVar8.i);
                        }
                    }
                }
            }
            babh babhVar9 = (babh) createBuilder.build();
            if (!amkq.b(babhVar9, babh.a)) {
                aong aongVar = (aong) babg.a.createBuilder();
                aonk aonkVar = babi.b;
                aone createBuilder2 = babi.a.createBuilder();
                createBuilder2.copyOnWrite();
                babi babiVar = (babi) createBuilder2.instance;
                babhVar9.getClass();
                babiVar.d = babhVar9;
                babiVar.c |= 1;
                aongVar.e(aonkVar, (babi) createBuilder2.build());
                d.h((babg) aongVar.build());
            }
            unf.a().a.a(d);
        }
    }
}
