package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecd extends ecl {
    private final StackTraceElement[] h;

    public ecd(ebe ebeVar, aone aoneVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(ebeVar, "FW/4CvJE7gSaOIcNy9aPqAkZHcIOptuimuYgHtkFyrZcR+XexyybvWr2/z62L/0t", "gw9HX1g5D/FveKxEJmgn0Xdlo8h06mYt4u8/nHkUo04=", aoneVar, i, 45);
        this.h = stackTraceElementArr;
    }

    @Override // defpackage.ecl
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            eax eaxVar = new eax((String) this.d.invoke(null, stackTraceElementArr));
            synchronized (this.g) {
                aone aoneVar = this.g;
                long longValue = eaxVar.a.longValue();
                aoneVar.copyOnWrite();
                dvo dvoVar = (dvo) aoneVar.instance;
                dvo dvoVar2 = dvo.a;
                dvoVar.c |= 64;
                dvoVar.G = longValue;
                if (eaxVar.b.booleanValue()) {
                    aone aoneVar2 = this.g;
                    int i = true != eaxVar.c.booleanValue() ? 2 : 1;
                    aoneVar2.copyOnWrite();
                    dvo dvoVar3 = (dvo) aoneVar2.instance;
                    dvoVar3.O = i - 1;
                    dvoVar3.c |= 131072;
                } else {
                    aone aoneVar3 = this.g;
                    aoneVar3.copyOnWrite();
                    dvo dvoVar4 = (dvo) aoneVar3.instance;
                    dvoVar4.O = 2;
                    dvoVar4.c |= 131072;
                }
            }
        }
    }
}
