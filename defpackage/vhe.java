package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vhe extends vep {
    private final aooy a;

    public vhe(aooy aooyVar) {
        this.a = aooyVar;
    }

    @Override // defpackage.vep
    public final anhy a(final IOException iOException, veq veqVar) {
        if (!(iOException.getCause() instanceof aoob)) {
            return anaf.N(iOException);
        }
        return aney.i(veqVar.a(anaf.O(this.a)), IOException.class, new anfz() { // from class: vhd
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                throw iOException;
            }
        }, angq.a);
    }
}
