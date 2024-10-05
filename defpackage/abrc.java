package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abrc implements abrr {
    final /* synthetic */ abrd a;

    public abrc(abrd abrdVar) {
        this.a = abrdVar;
    }

    @Override // defpackage.abrr
    public final void qQ(boolean z, int i, int i2, Set set) {
        abrd abrdVar = this.a;
        abrr abrrVar = abrdVar.b;
        if (abrdVar.a) {
            i = -i;
        }
        abrrVar.qQ(z, i, i2, set);
    }
}
