package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class airc implements afrs {
    static final int a = (int) TimeUnit.DAYS.toHours(30);
    static final asuq[] b = {asuq.USER_AUTH, asuq.VISITOR_ID, asuq.PLUS_PAGE_ID};
    public final aqjd c;
    public asuu d;
    public final akfq e;
    private final afsy f;
    private afqq g;
    private final aayb h;

    public airc(afsy afsyVar, aayb aaybVar, akfq akfqVar, aadw aadwVar, byte[] bArr, byte[] bArr2) {
        afsyVar.getClass();
        this.f = afsyVar;
        aaybVar.getClass();
        this.h = aaybVar;
        this.e = akfqVar;
        aadwVar.getClass();
        this.c = aiqy.e(aadwVar);
    }

    public static /* synthetic */ void d(Throwable th) {
        zga.d("Request failed for attestation challenge", th);
    }

    @Override // defpackage.afrs
    public final afqq a() {
        if (this.g == null) {
            aone createBuilder = aqjg.a.createBuilder();
            aqjd aqjdVar = this.c;
            if (aqjdVar != null && (aqjdVar.b & 8) != 0) {
                aqjg aqjgVar = aqjdVar.e;
                if (aqjgVar == null) {
                    aqjgVar = aqjg.a;
                }
                int i = aqjgVar.c;
                createBuilder.copyOnWrite();
                aqjg aqjgVar2 = (aqjg) createBuilder.instance;
                aqjgVar2.b |= 1;
                aqjgVar2.c = i;
                aqjg aqjgVar3 = this.c.e;
                if (aqjgVar3 == null) {
                    aqjgVar3 = aqjg.a;
                }
                int i2 = aqjgVar3.d;
                createBuilder.copyOnWrite();
                aqjg aqjgVar4 = (aqjg) createBuilder.instance;
                aqjgVar4.b |= 2;
                aqjgVar4.d = i2;
            } else {
                int i3 = a;
                createBuilder.copyOnWrite();
                aqjg aqjgVar5 = (aqjg) createBuilder.instance;
                aqjgVar5.b |= 1;
                aqjgVar5.c = i3;
                createBuilder.copyOnWrite();
                aqjg aqjgVar6 = (aqjg) createBuilder.instance;
                aqjgVar6.b |= 2;
                aqjgVar6.d = 30;
            }
            this.g = new airb(createBuilder);
        }
        return this.g;
    }

    @Override // defpackage.afrs
    public final String b() {
        return "attestation";
    }

    @Override // defpackage.afrs
    public final void c(String str, afrm afrmVar, List list) {
        final afsx d = this.f.d(str);
        if (d == null) {
            d = afsw.a;
            zga.l("Cannot resolve Identity from identityId. Dispatching as Identities.PSEUDONYMOUS.");
        }
        afsg afsgVar = afrmVar.a;
        aatw a2 = this.h.a(d, afsgVar.a, afsgVar.b);
        a2.b = 2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aone aoneVar = (aone) it.next();
            aone createBuilder = apge.a.createBuilder();
            try {
                createBuilder.m22mergeFrom(((ovz) aoneVar.instance).e, aomw.b());
                a2.a.add((apge) createBuilder.build());
            } catch (aoob unused) {
                afsi.b(2, 12, "AttestationDelayedEventDispatcher.dispatchEvents() could not deserialize AttestationObjectId");
            }
        }
        if (a2.d()) {
            return;
        }
        ynm.k(this.h.b(a2, angq.a), angq.a, ailg.d, new ynl() { // from class: aira
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                airc aircVar = airc.this;
                final afsx afsxVar = d;
                arjd arjdVar = (arjd) obj;
                if (arjdVar == null || (arjdVar.b & 2) == 0) {
                    afsi.b(2, 12, "AttestationDelayedEventDispatcher.dispatchEvents() response from AttestationChallengeService is null");
                    return;
                }
                akfq akfqVar = aircVar.e;
                String str2 = arjdVar.d;
                aone createBuilder2 = atxz.a.createBuilder();
                createBuilder2.copyOnWrite();
                atxz atxzVar = (atxz) createBuilder2.instance;
                str2.getClass();
                atxzVar.b |= 1;
                atxzVar.c = str2;
                atxz atxzVar2 = (atxz) createBuilder2.build();
                if (aircVar.d == null) {
                    aqjd aqjdVar = aircVar.c;
                    if (aqjdVar != null) {
                        asuu asuuVar = aqjdVar.d;
                        if (asuuVar == null) {
                            asuuVar = asuu.a;
                        }
                        if (!asuuVar.c.isEmpty()) {
                            asuu asuuVar2 = aircVar.c.d;
                            if (asuuVar2 == null) {
                                asuuVar2 = asuu.a;
                            }
                            aircVar.d = asuuVar2;
                        }
                    }
                    aone createBuilder3 = asuu.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    asuu asuuVar3 = (asuu) createBuilder3.instance;
                    asuuVar3.b |= 1;
                    asuuVar3.c = "https://m.youtube.com/api/stats/atr?ns=yt&ver=2";
                    asuq[] asuqVarArr = airc.b;
                    int length = asuqVarArr.length;
                    for (int i = 0; i < 3; i++) {
                        asuq asuqVar = asuqVarArr[i];
                        aone createBuilder4 = asur.a.createBuilder();
                        createBuilder4.copyOnWrite();
                        asur asurVar = (asur) createBuilder4.instance;
                        asurVar.c = asuqVar.g;
                        asurVar.b |= 1;
                        createBuilder3.copyOnWrite();
                        asuu asuuVar4 = (asuu) createBuilder3.instance;
                        asur asurVar2 = (asur) createBuilder4.build();
                        asurVar2.getClass();
                        aony aonyVar = asuuVar4.e;
                        if (!aonyVar.c()) {
                            asuuVar4.e = aonm.mutableCopy(aonyVar);
                        }
                        asuuVar4.e.add(asurVar2);
                    }
                    aircVar.d = (asuu) createBuilder3.build();
                }
                TrackingUrlModel trackingUrlModel = new TrackingUrlModel(aircVar.d);
                afuh afuhVar = (afuh) akfqVar.h.get();
                afuhVar.getClass();
                Executor executor = (Executor) akfqVar.c.get();
                executor.getClass();
                ((Context) akfqVar.b.get()).getClass();
                qtv qtvVar = (qtv) akfqVar.d.get();
                qtvVar.getClass();
                afsy afsyVar = (afsy) akfqVar.f.get();
                afsyVar.getClass();
                ysy ysyVar = (ysy) akfqVar.g.get();
                ysyVar.getClass();
                afrw afrwVar = (afrw) akfqVar.a.get();
                afrwVar.getClass();
                aadw aadwVar = (aadw) akfqVar.e.get();
                aadwVar.getClass();
                atxzVar2.getClass();
                final aiqy aiqyVar = new aiqy(afuhVar, executor, qtvVar, afsyVar, ysyVar, afrwVar, aadwVar, atxzVar2, trackingUrlModel);
                aiqyVar.a.execute(new Runnable() { // from class: aiqw
                    @Override // java.lang.Runnable
                    public final void run() {
                        aiqy.this.c(afsxVar);
                    }
                });
            }
        });
    }
}
