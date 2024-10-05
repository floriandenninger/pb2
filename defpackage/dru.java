package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dru extends dgy {
    public drw a;
    private final String[] e = {"binder"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void c(dru druVar, dhe dheVar, drw drwVar) {
        super.w(dheVar, drwVar);
        druVar.a = drwVar;
        druVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (drw) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void s(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ void t(CharSequence charSequence) {
        super.t(charSequence);
        this.a.e = charSequence;
    }
}
