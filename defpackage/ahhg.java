package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahhg {
    final int[] a;
    int b = 0;

    public ahhg(int i) {
        int i2 = i + 1;
        this.a = new int[i2 + i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        int[] iArr = this.a;
        int i3 = this.b;
        int i4 = i3 + 1;
        this.b = i4;
        iArr[i3] = i;
        this.b = i4 + 1;
        iArr[i4] = i2;
    }
}
