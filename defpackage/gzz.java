package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gzz implements ylb {
    private final ysy a;
    private final akmu b;
    private final acpl c;

    public gzz(ysy ysyVar, akmu akmuVar, acpl acplVar) {
        this.a = ysyVar;
        this.b = akmuVar;
        this.c = acplVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        aone createBuilder = aqjv.a.createBuilder();
        aqjw f = this.a.f();
        createBuilder.copyOnWrite();
        aqjv aqjvVar = (aqjv) createBuilder.instance;
        aqjvVar.c = f.B;
        aqjvVar.b |= 1;
        atmk b = this.b.b();
        createBuilder.copyOnWrite();
        aqjv aqjvVar2 = (aqjv) createBuilder.instance;
        aqjvVar2.d = b.g;
        aqjvVar2.b |= 2;
        aqjv aqjvVar3 = (aqjv) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cp(aqjvVar3);
        this.c.c((arpp) a.build());
        return 0;
    }
}
