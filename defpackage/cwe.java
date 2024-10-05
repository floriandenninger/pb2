package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwe implements cvz {
    public static final cwe a = new cwe(2, null);
    private final /* synthetic */ int b;

    public cwe(int i) {
        this.b = i;
    }

    @Deprecated
    public cwe(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.cvz
    public final boolean b(Object obj) {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            return true;
        }
        return obj.toString().startsWith("data:image");
    }

    @Override // defpackage.cvz
    public final cvy a(Object obj, int i, int i2, cqn cqnVar) {
        int i3 = this.b;
        if (i3 != 0) {
            return i3 != 1 ? new cvy(new dcz(obj), new cwk(obj)) : new cvy(new dcz(obj), new cvh(obj.toString()));
        }
        return null;
    }
}
