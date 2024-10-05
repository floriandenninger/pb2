package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aenh implements bex {
    public final bew a = new bew();
    private Handler b;
    private bey c;

    public final void a(bey beyVar) {
        bey beyVar2 = this.c;
        if (beyVar != beyVar2) {
            if (beyVar2 != null) {
                beyVar2.g(this);
            }
            if (beyVar != null) {
                if (this.b == null) {
                    this.b = pts.y();
                }
                beyVar.f(this.b, this);
            }
            this.c = beyVar;
        }
    }

    @Override // defpackage.bex
    public final void l(int i, long j, long j2) {
        this.a.b(i, j, j2);
    }
}
