package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iju implements iip {
    private final azrw a;
    private final /* synthetic */ int b;

    public iju(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    @Override // defpackage.iip
    public final Optional a() {
        if (this.b == 0) {
            return Optional.ofNullable(((gje) this.a.get()).f()).map(ham.t).filter(ghv.i).map(ham.s);
        }
        return Optional.ofNullable(((hav) this.a.get()).a()).filter(ghv.f).map(ham.f);
    }
}
