package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebv extends ecl {
    public ebv(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "Mx1UeFqV1fjeaaqnMs31Cpnz92KBTGXH/Fg2ftteXVEThFuI1yrtq0+LdsZyqokl", "Yj2yffKjPUt0Mx1uRMPIz4KPVLEfX/KYQGpvpNjX0eY=", aoneVar, i, 76);
    }

    @Override // defpackage.ecl
    protected final void a() {
        boolean booleanValue = ((Boolean) this.d.invoke(null, this.a.a)).booleanValue();
        aone aoneVar = this.g;
        int i = true == booleanValue ? 2 : 1;
        aoneVar.copyOnWrite();
        dvo dvoVar = (dvo) aoneVar.instance;
        dvo dvoVar2 = dvo.a;
        dvoVar.aa = i - 1;
        dvoVar.d |= 16;
    }
}
