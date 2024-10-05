package defpackage;

import j$.util.OptionalLong;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wqa {
    public final Set a = new HashSet();
    public OptionalLong b = OptionalLong.empty();
    public final wok c;
    public final whu d;

    public wqa(aypn aypnVar, wxx wxxVar, whu whuVar, byte[] bArr, byte[] bArr2) {
        this.c = wxxVar;
        this.d = whuVar;
        final int i = 1;
        aypnVar.n().M(suj.i).X(new ayrs(this) { // from class: wpz
            public final /* synthetic */ wqa a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    wqa wqaVar = this.a;
                    aheg ahegVar = (aheg) obj;
                    if (wqaVar.b.isPresent()) {
                        long e = ahegVar.e() - wqaVar.b.getAsLong();
                        if (e < 0) {
                            whu.n("Expected current position after ad video start time");
                        }
                        Iterator it = wqaVar.a.iterator();
                        while (it.hasNext()) {
                            ((wok) it.next()).j(e);
                        }
                        return;
                    }
                    return;
                }
                wqa wqaVar2 = this.a;
                ahdx ahdxVar = (ahdx) obj;
                if (!ahdxVar.i()) {
                    wqaVar2.b = OptionalLong.empty();
                    return;
                }
                if (wqaVar2.b.isPresent()) {
                    whu.n("Unexpected update to expectedAdStartTimeMs");
                }
                if (ahdxVar.a() < 0 && !ahdxVar.d().equals(ahdxVar.e())) {
                    whu.n("Expected valid expectedAdStartTimeMs");
                }
                wqaVar2.b = OptionalLong.of(ahdxVar.a());
                ((wxx) wqaVar2.c).l(ahdxVar.e());
                Iterator it2 = wqaVar2.a.iterator();
                while (it2.hasNext()) {
                    ((wok) it2.next()).i(ahdxVar.e());
                }
            }
        });
        final int i2 = 0;
        aypnVar.n().M(suj.j).X(new ayrs(this) { // from class: wpz
            public final /* synthetic */ wqa a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    wqa wqaVar = this.a;
                    aheg ahegVar = (aheg) obj;
                    if (wqaVar.b.isPresent()) {
                        long e = ahegVar.e() - wqaVar.b.getAsLong();
                        if (e < 0) {
                            whu.n("Expected current position after ad video start time");
                        }
                        Iterator it = wqaVar.a.iterator();
                        while (it.hasNext()) {
                            ((wok) it.next()).j(e);
                        }
                        return;
                    }
                    return;
                }
                wqa wqaVar2 = this.a;
                ahdx ahdxVar = (ahdx) obj;
                if (!ahdxVar.i()) {
                    wqaVar2.b = OptionalLong.empty();
                    return;
                }
                if (wqaVar2.b.isPresent()) {
                    whu.n("Unexpected update to expectedAdStartTimeMs");
                }
                if (ahdxVar.a() < 0 && !ahdxVar.d().equals(ahdxVar.e())) {
                    whu.n("Expected valid expectedAdStartTimeMs");
                }
                wqaVar2.b = OptionalLong.of(ahdxVar.a());
                ((wxx) wqaVar2.c).l(ahdxVar.e());
                Iterator it2 = wqaVar2.a.iterator();
                while (it2.hasNext()) {
                    ((wok) it2.next()).i(ahdxVar.e());
                }
            }
        });
    }

    public final void a(wok wokVar) {
        this.a.add(wokVar);
    }

    public final void b(wok wokVar) {
        this.a.remove(wokVar);
    }
}
