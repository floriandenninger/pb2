package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class axsr implements uvo {
    private final /* synthetic */ int d;
    public static final /* synthetic */ axsr c = new axsr(2);
    public static final /* synthetic */ axsr b = new axsr(1);
    public static final /* synthetic */ axsr a = new axsr(0);

    private /* synthetic */ axsr(int i) {
        this.d = i;
    }

    @Override // defpackage.uvo
    public final Object a(byte[] bArr) {
        int i = this.d;
        if (i == 0) {
            return (aors) aonm.parseFrom(aors.a, bArr);
        }
        if (i == 1) {
            return (axko) aonm.parseFrom(axko.a, bArr);
        }
        return (aors) aonm.parseFrom(aors.a, bArr);
    }
}
