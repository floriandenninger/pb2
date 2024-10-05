package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbq {
    private final String a;
    private final shf b;
    private final wzp c;

    public xbq(wni wniVar, shf shfVar, wzp wzpVar) {
        this.a = wniVar.e;
        this.b = shfVar;
        this.c = wzpVar;
        wzpVar.a();
    }

    public final xbs a() {
        return new xbs(this.a, new Random(this.b.c()), this.c);
    }
}
