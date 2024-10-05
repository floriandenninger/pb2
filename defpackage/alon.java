package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alon extends alot {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alon(alop alopVar, alsf alsfVar) {
        super(alopVar, alsfVar);
        new ammr("OnCompleteUpdateCallback", (char[]) null);
    }

    @Override // defpackage.alot
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (alop.a(bundle) != 0) {
            this.b.a(new aloy(alop.a(bundle)));
        } else {
            this.b.b(null);
        }
    }
}
