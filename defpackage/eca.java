package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eca extends ecl {
    public eca(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "Md0NasjzX5Dv6RV9gbRrdbbQw799E9EBpEgmAwiNqi/RiG7V51y0yTZI5hLTRiUF", "4FqMwpBmkecZ5KuntXganMUU8jtWDsP5C5fiOE4sCtY=", aoneVar, i, 73);
    }

    @Override // defpackage.ecl
    protected final void a() {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.d.invoke(null, this.a.a)).booleanValue();
            aone aoneVar = this.g;
            if (true == booleanValue) {
                i = 2;
            }
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.Z = i - 1;
            dvoVar.d |= 8;
        } catch (InvocationTargetException unused) {
            aone aoneVar2 = this.g;
            aoneVar2.copyOnWrite();
            dvo dvoVar3 = (dvo) aoneVar2.instance;
            dvo dvoVar4 = dvo.a;
            dvoVar3.Z = 2;
            dvoVar3.d |= 8;
        }
    }
}
