package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gld implements ahxe {
    public ahxd c;
    public boolean a = false;
    public boolean b = false;
    public final azqy d = azqy.ap();

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        this.a = z;
        this.d.c(Boolean.TRUE);
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        this.b = z;
        this.d.c(Boolean.TRUE);
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        this.c = ahxdVar;
    }
}
