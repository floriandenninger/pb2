package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sks implements skk {
    private final skm a;
    private final aorg b;
    private final sjw c;

    public sks(skm skmVar, aorg aorgVar, sjw sjwVar) {
        this.a = skmVar;
        this.b = aorgVar;
        this.c = sjwVar;
    }

    private final boolean b(aore aoreVar) {
        int i = 0;
        while (true) {
            if (i < aoreVar.b.size()) {
                int a = aord.a(aoreVar.b.d(i));
                if (!this.a.a(a != 0 ? a : 1, this.c).a()) {
                    return false;
                }
                i++;
            } else {
                Iterator it = aoreVar.c.iterator();
                while (it.hasNext()) {
                    if (!c((aorf) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    private final boolean c(aorf aorfVar) {
        for (int i = 0; i < aorfVar.b.size(); i++) {
            int a = aord.a(aorfVar.b.d(i));
            if (a == 0) {
                a = 1;
            }
            if (this.a.a(a, this.c).a()) {
                return true;
            }
        }
        Iterator it = aorfVar.c.iterator();
        while (it.hasNext()) {
            if (b((aore) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.skk
    public final boolean a() {
        Boolean valueOf;
        int a;
        aorg aorgVar = this.b;
        int i = aorgVar.b;
        if (i == 2) {
            valueOf = Boolean.valueOf(b((aore) aorgVar.c));
        } else if (i != 3) {
            skm skmVar = this.a;
            int i2 = 1;
            if (i == 1 && (a = aord.a(((Integer) aorgVar.c).intValue())) != 0) {
                i2 = a;
            }
            valueOf = Boolean.valueOf(skmVar.a(i2, this.c).a());
        } else {
            valueOf = Boolean.valueOf(c((aorf) aorgVar.c));
        }
        return valueOf.booleanValue();
    }
}
