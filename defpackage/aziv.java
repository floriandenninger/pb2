package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aziv extends azfc {
    final ayqi b;
    final int c;

    public aziv(ayqb ayqbVar, ayqi ayqiVar, int i) {
        super(ayqbVar);
        this.b = ayqiVar;
        this.c = i;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        ayqi ayqiVar = this.b;
        if (ayqiVar instanceof azpo) {
            this.a.aE(ayqdVar);
        } else {
            this.a.aE(new aziu(ayqdVar, ayqiVar.a(), this.c));
        }
    }
}
