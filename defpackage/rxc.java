package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxc {
    final int[] a;
    final int b;

    public rxc(int[] iArr, int i) {
        sbt.g(iArr, "pixelValues");
        sbt.a(iArr.length >= i, "Claiming to use more elements than provided");
        this.a = iArr;
        this.b = i;
    }
}
