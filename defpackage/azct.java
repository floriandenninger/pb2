package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azct extends azby {
    final ayrv b;
    final ayrv c;
    final Callable d;

    public azct(aypv aypvVar, ayrv ayrvVar, ayrv ayrvVar2, Callable callable) {
        super(aypvVar);
        this.b = ayrvVar;
        this.c = ayrvVar2;
        this.d = callable;
    }

    @Override // defpackage.ayps
    protected final void Z(aypt ayptVar) {
        this.a.Y(new azcs(ayptVar, this.b, this.c, this.d));
    }
}
