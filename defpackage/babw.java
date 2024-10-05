package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class babw implements aons {
    private final /* synthetic */ int h;
    static final aons g = new babw(6);
    static final aons f = new babw(5);
    static final aons e = new babw(4);
    static final aons d = new babw(3);
    static final aons c = new babw(2);
    static final aons b = new babw(1);
    static final aons a = new babw(0);

    private babw(int i) {
        this.h = i;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i) {
        int i2 = this.h;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? badf.d(i) != 0 : bacq.b(i) != null : badf.e(i) != 0 : i == 0 || i == 1 || i == 2 || i == 3 || i == 4 : badf.f(i) != 0 : babu.b(i) != null : i == 0 || i == 1 || i == 2 || i == 3;
    }
}
