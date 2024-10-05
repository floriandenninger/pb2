package defpackage;

import com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrr implements acry {
    private final acre a;
    private final acrq b;
    private final acrz c;
    private final ConcurrentHashMap d;

    public acrr(acre acreVar, acrq acrqVar, acrz acrzVar) {
        this.a = acreVar;
        acrqVar.getClass();
        this.b = acrqVar;
        acrzVar.getClass();
        this.c = acrzVar;
        acrzVar.b(this);
        this.d = new ConcurrentHashMap();
    }

    private final void e() {
        InteractionLoggingScreen c;
        if (this.c.a() && (c = this.b.c()) != null) {
            synchronized (this.d) {
                for (GelVisibilityUpdate gelVisibilityUpdate : this.d.values()) {
                    if (gelVisibilityUpdate instanceof GelVisibilityUpdate.ShownVisibilityUpdate) {
                        acre acreVar = this.a;
                        GelVisibilityUpdate.ShownVisibilityUpdate shownVisibilityUpdate = (GelVisibilityUpdate.ShownVisibilityUpdate) gelVisibilityUpdate;
                        if (acreVar.q(shownVisibilityUpdate) && !c.h(shownVisibilityUpdate.c)) {
                            c.e(shownVisibilityUpdate);
                            aone createBuilder = asgt.a.createBuilder();
                            String str = c.a;
                            createBuilder.copyOnWrite();
                            asgt asgtVar = (asgt) createBuilder.instance;
                            str.getClass();
                            asgtVar.b |= 1;
                            asgtVar.c = str;
                            int i = shownVisibilityUpdate.e;
                            createBuilder.copyOnWrite();
                            asgt asgtVar2 = (asgt) createBuilder.instance;
                            asgtVar2.f = i - 1;
                            asgtVar2.b |= 8;
                            awav awavVar = shownVisibilityUpdate.c;
                            createBuilder.copyOnWrite();
                            asgt asgtVar3 = (asgt) createBuilder.instance;
                            awavVar.getClass();
                            asgtVar3.d = awavVar;
                            asgtVar3.b |= 2;
                            asht ashtVar = shownVisibilityUpdate.d;
                            if (ashtVar != null) {
                                createBuilder.copyOnWrite();
                                asgt asgtVar4 = (asgt) createBuilder.instance;
                                asgtVar4.e = ashtVar;
                                asgtVar4.b |= 4;
                            }
                            asgt asgtVar5 = (asgt) createBuilder.build();
                            amru amruVar = shownVisibilityUpdate.b;
                            int size = amruVar.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                asum asumVar = (asum) amruVar.get(i2);
                                if (acreVar.d.containsKey(asumVar)) {
                                    ((acru) acreVar.d.get(asumVar)).a(asgtVar5);
                                }
                            }
                            arpn a = arpp.a();
                            a.copyOnWrite();
                            ((arpp) a.instance).ef(asgtVar5);
                            acreVar.d((arpp) a.build(), c);
                            acreVar.e.d(asgtVar5);
                        }
                    } else if (gelVisibilityUpdate instanceof GelVisibilityUpdate.HiddenVisibilityUpdate) {
                        this.a.i(c, (GelVisibilityUpdate.HiddenVisibilityUpdate) gelVisibilityUpdate);
                    }
                }
                this.d.clear();
            }
        }
    }

    private final void f(GelVisibilityUpdate.ShownVisibilityUpdate shownVisibilityUpdate) {
        InteractionLoggingScreen c = this.b.c();
        if (this.c.a() || !c.h(shownVisibilityUpdate.c)) {
            synchronized (this.d) {
                this.d.put(shownVisibilityUpdate.c, shownVisibilityUpdate);
            }
            e();
            return;
        }
        synchronized (this.d) {
            this.d.remove(shownVisibilityUpdate.c);
        }
    }

    @Override // defpackage.acry
    public final void a() {
        InteractionLoggingScreen c;
        if (!this.c.a() && (c = this.b.c()) != null) {
            HashSet<GelVisibilityUpdate> hashSet = new HashSet();
            for (GelVisibilityUpdate gelVisibilityUpdate : c.g.values()) {
                if (gelVisibilityUpdate.e == 5) {
                    hashSet.add(gelVisibilityUpdate);
                }
            }
            synchronized (this.d) {
                for (GelVisibilityUpdate gelVisibilityUpdate2 : hashSet) {
                    this.a.i(c, new GelVisibilityUpdate.HiddenVisibilityUpdate(gelVisibilityUpdate2.f, gelVisibilityUpdate2.b, gelVisibilityUpdate2.c, null));
                }
                for (GelVisibilityUpdate gelVisibilityUpdate3 : hashSet) {
                    f(new GelVisibilityUpdate.ShownVisibilityUpdate(gelVisibilityUpdate3.f, gelVisibilityUpdate3.b, gelVisibilityUpdate3.c, null));
                }
            }
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        synchronized (this.d) {
            this.d.clear();
        }
    }

    public final void c(GelVisibilityUpdate.HiddenVisibilityUpdate hiddenVisibilityUpdate) {
        InteractionLoggingScreen c = this.b.c();
        if (this.c.a() || c.h(hiddenVisibilityUpdate.c)) {
            synchronized (this.d) {
                this.d.put(hiddenVisibilityUpdate.c, hiddenVisibilityUpdate);
            }
            e();
            return;
        }
        synchronized (this.d) {
            this.d.remove(hiddenVisibilityUpdate.c);
        }
    }

    public final void d(acsa acsaVar, asht ashtVar) {
        awav awavVar = acsaVar.a;
        if (awavVar != null) {
            if (acsaVar.b != null) {
                f(new GelVisibilityUpdate.ShownVisibilityUpdate(acsaVar, ashtVar));
            } else {
                f(new GelVisibilityUpdate.ShownVisibilityUpdate(acre.a(awavVar), GelVisibilityUpdate.a, ashtVar));
            }
        }
    }
}
