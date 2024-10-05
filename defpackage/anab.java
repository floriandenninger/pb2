package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anab extends anaf {
    public static final anab a = new anab(anah.a);
    public final AtomicReference b;

    public anab(anaf anafVar) {
        this.b = new AtomicReference(anafVar);
    }

    @Override // defpackage.anaf
    public final amyt a() {
        return ((anaf) this.b.get()).a();
    }

    @Override // defpackage.anaf
    public final anam b() {
        return ((anaf) this.b.get()).b();
    }

    @Override // defpackage.anaf
    public final void c(String str, Level level, boolean z) {
        ((anaf) this.b.get()).c(str, level, z);
    }
}
