package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uuu implements uuq {
    private static final amxj c = amxj.l("com/google/android/libraries/performance/primes/transmitter/impl/HashedNamesTransmitter");
    final /* synthetic */ aktn a;
    final /* synthetic */ akqk b;

    public uuu() {
    }

    public uuu(akqk akqkVar, aktn aktnVar) {
        this.b = akqkVar;
        this.a = aktnVar;
    }

    @Override // defpackage.uuq
    public final /* synthetic */ uup a() {
        return uup.a;
    }

    @Override // defpackage.uuq
    public final void b(bact bactVar) {
        ((amxh) ((amxh) c.d()).i("com/google/android/libraries/performance/primes/transmitter/impl/HashedNamesTransmitter", "send", 20, "HashedNamesTransmitter.java")).s("unhashed: %s", bactVar);
        aone builder = bactVar.toBuilder();
        uut.b(uut.a, builder);
        baax baaxVar = ((bact) builder.instance).k;
        if (baaxVar == null) {
            baaxVar = baax.a;
        }
        if ((baaxVar.b & 1) != 0) {
            baax baaxVar2 = ((bact) builder.instance).k;
            if (baaxVar2 == null) {
                baaxVar2 = baax.a;
            }
            baaw baawVar = baaxVar2.c;
            if (baawVar == null) {
                baawVar = baaw.a;
            }
            aone builder2 = baawVar.toBuilder();
            uut.b(uut.b, builder2);
            baax baaxVar3 = ((bact) builder.instance).k;
            if (baaxVar3 == null) {
                baaxVar3 = baax.a;
            }
            aone builder3 = baaxVar3.toBuilder();
            builder3.copyOnWrite();
            baax baaxVar4 = (baax) builder3.instance;
            baaw baawVar2 = (baaw) builder2.build();
            baawVar2.getClass();
            baaxVar4.c = baawVar2;
            baaxVar4.b |= 1;
            builder.copyOnWrite();
            bact bactVar2 = (bact) builder.instance;
            baax baaxVar5 = (baax) builder3.build();
            baaxVar5.getClass();
            bactVar2.k = baaxVar5;
            bactVar2.b |= 512;
        }
        bach bachVar = ((bact) builder.instance).h;
        if (bachVar == null) {
            bachVar = bach.a;
        }
        if ((bachVar.b & 256) != 0) {
            bach bachVar2 = ((bact) builder.instance).h;
            if (bachVar2 == null) {
                bachVar2 = bach.a;
            }
            andu anduVar = bachVar2.i;
            if (anduVar == null) {
                anduVar = andu.a;
            }
            aone builder4 = anduVar.toBuilder();
            andt andtVar = ((andu) builder4.instance).c;
            if (andtVar == null) {
                andtVar = andt.a;
            }
            aone builder5 = andtVar.toBuilder();
            String str = ((andt) builder5.instance).d;
            if (!str.isEmpty()) {
                long longValue = anrs.a(str).longValue();
                builder5.copyOnWrite();
                andt andtVar2 = (andt) builder5.instance;
                andtVar2.b |= 4;
                andtVar2.e = longValue;
                builder5.copyOnWrite();
                andt andtVar3 = (andt) builder5.instance;
                andtVar3.b &= -3;
                andtVar3.d = andt.a.d;
            }
            andt andtVar4 = (andt) builder5.build();
            builder4.copyOnWrite();
            andu anduVar2 = (andu) builder4.instance;
            andtVar4.getClass();
            anduVar2.c = andtVar4;
            anduVar2.b |= 1;
            List unmodifiableList = Collections.unmodifiableList(anduVar2.d);
            builder4.copyOnWrite();
            ((andu) builder4.instance).d = andu.emptyProtobufList();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                aone builder6 = ((andt) it.next()).toBuilder();
                String str2 = ((andt) builder6.instance).d;
                if (!str2.isEmpty()) {
                    long longValue2 = anrs.a(str2).longValue();
                    builder6.copyOnWrite();
                    andt andtVar5 = (andt) builder6.instance;
                    andtVar5.b |= 4;
                    andtVar5.e = longValue2;
                    builder6.copyOnWrite();
                    andt andtVar6 = (andt) builder6.instance;
                    andtVar6.b &= -3;
                    andtVar6.d = andt.a.d;
                }
                andt andtVar7 = (andt) builder6.build();
                builder4.copyOnWrite();
                andu anduVar3 = (andu) builder4.instance;
                andtVar7.getClass();
                anduVar3.a();
                anduVar3.d.add(andtVar7);
            }
            bach bachVar3 = ((bact) builder.instance).h;
            if (bachVar3 == null) {
                bachVar3 = bach.a;
            }
            aone builder7 = bachVar3.toBuilder();
            andu anduVar4 = (andu) builder4.build();
            builder7.copyOnWrite();
            bach bachVar4 = (bach) builder7.instance;
            anduVar4.getClass();
            bachVar4.i = anduVar4;
            bachVar4.b |= 256;
            bach bachVar5 = (bach) builder7.build();
            builder.copyOnWrite();
            bact bactVar3 = (bact) builder.instance;
            bachVar5.getClass();
            bactVar3.h = bachVar5;
            bactVar3.b |= 64;
        }
        bacn bacnVar = ((bact) builder.instance).j;
        if (bacnVar == null) {
            bacnVar = bacn.a;
        }
        if (bacnVar.k.size() != 0) {
            bacn bacnVar2 = ((bact) builder.instance).j;
            if (bacnVar2 == null) {
                bacnVar2 = bacn.a;
            }
            aone builder8 = bacnVar2.toBuilder();
            for (int i = 0; i < ((bacn) builder8.instance).k.size(); i++) {
                aone builder9 = ((bacm) ((bacn) builder8.instance).k.get(i)).toBuilder();
                if (!TextUtils.isEmpty(((bacm) builder9.instance).c)) {
                    builder9.copyOnWrite();
                    ((bacm) builder9.instance).d = bacm.emptyLongList();
                    List a = uut.a(((bacm) builder9.instance).c);
                    builder9.copyOnWrite();
                    bacm bacmVar = (bacm) builder9.instance;
                    aonx aonxVar = bacmVar.d;
                    if (!aonxVar.c()) {
                        bacmVar.d = aonm.mutableCopy(aonxVar);
                    }
                    aolo.addAll((Iterable) a, (List) bacmVar.d);
                }
                builder9.copyOnWrite();
                bacm bacmVar2 = (bacm) builder9.instance;
                bacmVar2.b &= -2;
                bacmVar2.c = bacm.a.c;
                builder8.copyOnWrite();
                bacn bacnVar3 = (bacn) builder8.instance;
                bacm bacmVar3 = (bacm) builder9.build();
                bacmVar3.getClass();
                aony aonyVar = bacnVar3.k;
                if (!aonyVar.c()) {
                    bacnVar3.k = aonm.mutableCopy(aonyVar);
                }
                bacnVar3.k.set(i, bacmVar3);
            }
            builder.copyOnWrite();
            bact bactVar4 = (bact) builder.instance;
            bacn bacnVar4 = (bacn) builder8.build();
            bacnVar4.getClass();
            bactVar4.j = bacnVar4;
            bactVar4.b |= 256;
        }
        babs babsVar = ((bact) builder.instance).g;
        if (babsVar == null) {
            babsVar = babs.a;
        }
        if (babsVar.b.size() != 0) {
            babs babsVar2 = ((bact) builder.instance).g;
            if (babsVar2 == null) {
                babsVar2 = babs.a;
            }
            aone builder10 = babsVar2.toBuilder();
            for (int i2 = 0; i2 < ((babs) builder10.instance).b.size(); i2++) {
                aone builder11 = ((babr) ((babs) builder10.instance).b.get(i2)).toBuilder();
                if (!TextUtils.isEmpty(((babr) builder11.instance).v)) {
                    builder11.copyOnWrite();
                    ((babr) builder11.instance).w = babr.emptyLongList();
                    List a2 = uut.a(((babr) builder11.instance).v);
                    builder11.copyOnWrite();
                    babr babrVar = (babr) builder11.instance;
                    aonx aonxVar2 = babrVar.w;
                    if (!aonxVar2.c()) {
                        babrVar.w = aonm.mutableCopy(aonxVar2);
                    }
                    aolo.addAll((Iterable) a2, (List) babrVar.w);
                }
                builder11.copyOnWrite();
                babr babrVar2 = (babr) builder11.instance;
                babrVar2.b &= -524289;
                babrVar2.v = babr.a.v;
                builder10.copyOnWrite();
                babs babsVar3 = (babs) builder10.instance;
                babr babrVar3 = (babr) builder11.build();
                babrVar3.getClass();
                babsVar3.a();
                babsVar3.b.set(i2, babrVar3);
            }
            builder.copyOnWrite();
            bact bactVar5 = (bact) builder.instance;
            babs babsVar4 = (babs) builder10.build();
            babsVar4.getClass();
            bactVar5.g = babsVar4;
            bactVar5.b |= 32;
        }
        babx babxVar = ((bact) builder.instance).n;
        if (babxVar == null) {
            babxVar = babx.a;
        }
        if (babxVar.e.size() != 0) {
            babx babxVar2 = ((bact) builder.instance).n;
            if (babxVar2 == null) {
                babxVar2 = babx.a;
            }
            aone builder12 = babxVar2.toBuilder();
            for (int i3 = 0; i3 < ((babx) builder12.instance).e.size(); i3++) {
                aone builder13 = ((baby) ((babx) builder12.instance).e.get(i3)).toBuilder();
                uut.b(uut.c, builder13);
                builder12.copyOnWrite();
                babx babxVar3 = (babx) builder12.instance;
                baby babyVar = (baby) builder13.build();
                babyVar.getClass();
                aony aonyVar2 = babxVar3.e;
                if (!aonyVar2.c()) {
                    babxVar3.e = aonm.mutableCopy(aonyVar2);
                }
                babxVar3.e.set(i3, babyVar);
            }
            builder.copyOnWrite();
            bact bactVar6 = (bact) builder.instance;
            babx babxVar4 = (babx) builder12.build();
            babxVar4.getClass();
            bactVar6.n = babxVar4;
            bactVar6.b |= 16384;
        }
        bact bactVar7 = (bact) builder.build();
        akrb akrbVar = new akrb(this.a.b, bactVar7, (bactVar7 == null || (bactVar7.b & 64) == 0) ? false : true);
        bach bachVar6 = bactVar7.h;
        if (bachVar6 == null) {
            bachVar6 = bach.a;
        }
        int e = badf.e(bachVar6.g);
        if (e == 0 || e != 6) {
            if (akrbVar.c()) {
                this.b.a.f(akrbVar);
                return;
            } else {
                this.b.a.d(akrbVar);
                return;
            }
        }
        avdw avdwVar = this.b.b.get().e;
        if (avdwVar == null) {
            avdwVar = avdw.a;
        }
        if (avdwVar.r) {
            this.b.c.c(akrbVar);
        }
    }
}
