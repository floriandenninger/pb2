package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class onc extends emt {
    final AtomicBoolean b;
    private final ajjz c;
    private final ajzi d;
    private final azrj e;

    public onc(aadw aadwVar, ajjz ajjzVar, ajzi ajziVar, azrj azrjVar) {
        super(aadwVar);
        this.b = new AtomicBoolean(false);
        this.c = ajjzVar;
        this.d = ajziVar;
        this.e = azrjVar;
    }

    @Override // defpackage.emt
    public final void a() {
        this.e.sh();
        ajjz ajjzVar = this.c;
        ajzi ajziVar = this.d;
        ajjzVar.o(this);
        ajziVar.b(this);
    }

    @Override // defpackage.emt
    public final boolean b() {
        return this.b.compareAndSet(false, true);
    }
}
