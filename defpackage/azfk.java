package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfk extends azfc {
    final Callable b;

    public azfk(ayqb ayqbVar, Callable callable) {
        super(ayqbVar);
        this.b = callable;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        this.a.aE(new azfj(ayqdVar, this.b));
    }
}
