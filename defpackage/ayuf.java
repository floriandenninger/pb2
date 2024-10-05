package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayuf extends ayph {
    final aypj a;

    public ayuf(aypj aypjVar) {
        this.a = aypjVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        ayue ayueVar = new ayue(aypiVar);
        aypiVar.se(ayueVar);
        try {
            this.a.a(ayueVar);
        } catch (Throwable th) {
            aynu.c(th);
            ayueVar.c(th);
        }
    }
}
