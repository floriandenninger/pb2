package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jnb implements Callable {
    public final /* synthetic */ jmt a;
    private final /* synthetic */ int b;

    public /* synthetic */ jnb(jmt jmtVar, int i) {
        this.b = i;
        this.a = jmtVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        atre atreVar;
        switch (this.b) {
            case 0:
                return jne.f((asxs) this.a.b());
            case 1:
                return jne.f((asxs) this.a.b());
            case 2:
                return jne.f((asxs) this.a.b());
            case 3:
                return jne.f((asxs) this.a.b());
            case 4:
                return jne.e((awil) this.a.b());
            case 5:
                return jne.e((awil) this.a.b());
            case 6:
                return jne.e((awil) this.a.b());
            case 7:
                return jne.e((awil) this.a.b());
            case 8:
                asxn b = ((asxs) this.a.b()).b();
                if (b != null) {
                    atxb b2 = b.b();
                    r1 = b2;
                    atreVar = b2 != null ? b2.f() : null;
                } else {
                    atreVar = null;
                }
                return ammw.a(Optional.ofNullable(r1), Optional.ofNullable(atreVar));
            default:
                awil awilVar = (awil) this.a.b();
                return ammw.a(Optional.ofNullable(awilVar.f()), Optional.ofNullable(awilVar.b()));
        }
    }
}
