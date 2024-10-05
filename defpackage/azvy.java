package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvy extends azxi implements azvx {
    public final azvz a;

    public azvy(azvz azvzVar) {
        this.a = azvzVar;
    }

    @Override // defpackage.aztu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return azsf.a;
    }

    @Override // defpackage.azwe
    public final void b(Throwable th) {
        this.a.f(e());
    }

    @Override // defpackage.azvx
    public final boolean c(Throwable th) {
        azxo e = e();
        if (th instanceof CancellationException) {
            return true;
        }
        return e.w(th) && e.sn();
    }
}
