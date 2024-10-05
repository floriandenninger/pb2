package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tat implements swy {
    private final String b;
    private final tbt c;
    private final Executor d;
    private final ajfv e;
    private final ahbn f;

    public tat(ahbn ahbnVar, tbt tbtVar, Executor executor, ajfv ajfvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f = ahbnVar;
        this.c = tbtVar;
        this.d = executor;
        String b = tbtVar.b();
        this.b = b;
        this.e = ajfvVar;
        tbtVar.d(b);
    }

    @Override // defpackage.swy
    public final sxa a(int i) {
        return new tav(this.b, i, this.c, this.d);
    }

    @Override // defpackage.swy
    public final boolean b() {
        return this.e.a(tbp.COMMAND_EXECUTION);
    }
}
