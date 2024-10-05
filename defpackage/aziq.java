package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aziq extends azfc {
    final tam b;

    public aziq(ayqb ayqbVar, tam tamVar) {
        super(ayqbVar);
        this.b = tamVar;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        try {
            tal talVar = new tal(this.b, ayqdVar);
            String.valueOf(String.valueOf(this.b)).length();
            this.a.aE(talVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
