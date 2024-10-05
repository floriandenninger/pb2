package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbc implements saw {
    private final /* synthetic */ int a;

    public sbc(int i) {
        this.a = i;
    }

    @Override // defpackage.saw
    public final /* synthetic */ Object a(Object obj, int i, sba sbaVar) {
        int i2 = this.a;
        if (i2 == 0) {
            return ((sbd) obj).b();
        }
        if (i2 == 1) {
            return ((sbd) obj).a();
        }
        if (i2 == 2) {
            sbe sbeVar = (sbe) obj;
            return (String) sbeVar.b.get(sbeVar.c);
        }
        sbe sbeVar2 = (sbe) obj;
        return (Double) sbeVar2.a.get(sbeVar2.c);
    }
}
