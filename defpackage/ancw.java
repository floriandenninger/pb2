package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancw implements aonr {
    private final /* synthetic */ int a;

    public ancw(int i) {
        this.a = i;
    }

    @Override // defpackage.aonr
    public final /* synthetic */ aonq findValueByNumber(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            return ancy.a(i);
        }
        if (i2 == 1) {
            return edt.a(i);
        }
        if (i2 == 2) {
            return asno.b(i);
        }
        if (i2 == 3) {
            return asvs.b(i);
        }
        if (i2 != 4) {
            return i2 != 5 ? bacq.b(i) : avbu.b(i);
        }
        return avbt.b(i);
    }
}
