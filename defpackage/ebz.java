package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebz extends ecl {
    public ebz(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "0nCS1/lIiwmVLmY4a37W/6SChW3s76Q3PykiLxRk0eA7B+gs2O43l0EwWtwdYppM", "NOQ7v89FdlqbWITe5fQxaJU2MeOCrxMPjMVtpwyCEdc=", aoneVar, i, 3);
    }

    @Override // defpackage.ecl
    protected final void a() {
        ear earVar = new ear((String) this.d.invoke(null, this.a.a, Boolean.valueOf(((Boolean) pyi.o.e()).booleanValue())));
        synchronized (this.g) {
            aone aoneVar = this.g;
            long j = earVar.a;
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.b |= 4;
            dvoVar.g = j;
            aone aoneVar2 = this.g;
            long j2 = earVar.b;
            aoneVar2.copyOnWrite();
            dvo dvoVar3 = (dvo) aoneVar2.instance;
            dvoVar3.c |= 4194304;
            dvoVar3.T = j2;
        }
    }
}
