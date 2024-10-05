package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azkb extends azfc {
    final ayro b;
    final Callable c;

    public azkb(ayqb ayqbVar, Callable callable, ayro ayroVar) {
        super(ayqbVar);
        this.b = ayroVar;
        this.c = callable;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        try {
            Object obj = ((aysq) this.c).a;
            aysw.b(obj, "The seed supplied is null");
            this.a.aE(new azka(ayqdVar, this.b, obj));
        } catch (Throwable th) {
            aynu.c(th);
            aysa.h(th, ayqdVar);
        }
    }
}
