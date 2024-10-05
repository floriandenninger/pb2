package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class juc extends aasw {
    public final aasp a;
    public final jtt b;
    private final afsy c;

    public juc(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, jtt jttVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.c = afsyVar;
        this.b = jttVar;
        this.a = c(aswn.a, aarmVar, fkp.n, iom.c);
    }

    public final jub a() {
        return new jub(this.f, this.c.c(), null, null, null);
    }

    public final anhy b(jub jubVar, Executor executor) {
        return this.a.b(jubVar, executor);
    }
}
