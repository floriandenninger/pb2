package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecb extends ecl {
    private List h;

    public ecb(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "6LxD9DBfXSlooSx7/LozL06rdHrjyh7Q8PNFejLJXxiRhvgA5vOTtEhIRp3pKXIi", "yXdkchwXd7KBwiPBiUydLTG3hsBC8U5EW7urXPkQrKc=", aoneVar, i, 31);
        this.h = null;
    }

    @Override // defpackage.ecl
    protected final void a() {
        aone aoneVar = this.g;
        aoneVar.copyOnWrite();
        dvo dvoVar = (dvo) aoneVar.instance;
        dvo dvoVar2 = dvo.a;
        dvoVar.b |= 33554432;
        dvoVar.u = -1L;
        aone aoneVar2 = this.g;
        aoneVar2.copyOnWrite();
        dvo dvoVar3 = (dvo) aoneVar2.instance;
        dvoVar3.b |= 67108864;
        dvoVar3.v = -1L;
        if (this.h == null) {
            this.h = (List) this.d.invoke(null, this.a.a);
        }
        List list = this.h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.g) {
            aone aoneVar3 = this.g;
            long longValue = ((Long) this.h.get(0)).longValue();
            aoneVar3.copyOnWrite();
            dvo dvoVar4 = (dvo) aoneVar3.instance;
            dvoVar4.b = 33554432 | dvoVar4.b;
            dvoVar4.u = longValue;
            aone aoneVar4 = this.g;
            long longValue2 = ((Long) this.h.get(1)).longValue();
            aoneVar4.copyOnWrite();
            dvo dvoVar5 = (dvo) aoneVar4.instance;
            dvoVar5.b |= 67108864;
            dvoVar5.v = longValue2;
        }
    }
}
