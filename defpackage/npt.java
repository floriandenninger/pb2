package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class npt {
    public final /* synthetic */ npw a;

    public /* synthetic */ npt(npw npwVar) {
        this.a = npwVar;
    }

    public final void a(long j) {
        npw npwVar = this.a;
        if (j <= 0) {
            fsg fsgVar = npwVar.g;
            fsgVar.a.setVisibility(0);
            fsgVar.b.setVisibility(0);
            fsgVar.d.afterTextChanged(fsgVar.c.getText());
            npwVar.d();
            return;
        }
        fsg fsgVar2 = npwVar.g;
        fsgVar2.a.setVisibility(8);
        fsgVar2.b.setVisibility(8);
        npwVar.j = j;
        npwVar.i.setEnabled(true);
    }
}
