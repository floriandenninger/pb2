package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxi {
    public final List a;
    public final float[] b;
    public final int c;

    public rxi(List list, float[] fArr, int i) {
        sbt.g(list, "domainValues");
        sbt.g(fArr, "pixelValues");
        sbt.a(list.size() == i, "domain and target must be the same length");
        sbt.a(fArr.length >= i, "Claiming to use more elements than provided");
        this.a = list;
        this.b = fArr;
        this.c = i;
    }
}
