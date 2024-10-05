package defpackage;

import android.os.Bundle;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class exb implements aaha {
    private final ci a;
    private final iip b;
    private final exa c;

    public exb(ci ciVar, iip iipVar, exa exaVar) {
        this.a = ciVar;
        this.b = iipVar;
        this.c = exaVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.a.isFinishing()) {
            return;
        }
        dd supportFragmentManager = this.a.getSupportFragmentManager();
        if (supportFragmentManager.Y()) {
            return;
        }
        bv a = this.c.a(apxfVar);
        Bundle bundle = (Bundle) Optional.ofNullable(a.m).orElseGet(ghx.b);
        bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        a.af(bundle);
        Optional map2 = this.b.a().map(evy.c);
        final aom aomVar = a.X;
        aomVar.getClass();
        map2.ifPresent(new Consumer() { // from class: ewz
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                aof.this.b((aoj) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        dn k = supportFragmentManager.k();
        k.r(a, "DialogFragmentFromNavigation");
        k.k();
    }
}
