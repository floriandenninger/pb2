package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bajo extends bakh implements Serializable, bajz {
    public static final bajo a = new bajo(0);
    private static final long serialVersionUID = 2471658376918L;

    public bajo(long j) {
        super(j);
    }

    public static bajo b(long j) {
        return j == 0 ? a : new bajo(j);
    }

    public static bajo c(long j) {
        return j == 0 ? a : new bajo(aynu.y(j, 1000));
    }

    public final long a() {
        return this.b / 3600000;
    }
}
