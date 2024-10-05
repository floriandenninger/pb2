package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aeoi implements akoa {
    private final /* synthetic */ int c;
    public static final /* synthetic */ aeoi b = new aeoi(1);
    public static final /* synthetic */ aeoi a = new aeoi(0);

    private /* synthetic */ aeoi(int i) {
        this.c = i;
    }

    @Override // defpackage.akoa
    public final Object a(byte[] bArr) {
        if (this.c == 0) {
            return bArr;
        }
        return (auqe) aonm.parseFrom(auqe.a, bArr, aomw.b());
    }
}
