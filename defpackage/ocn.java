package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ocn extends odc {
    private final Context b;
    private final int c;
    private int k;

    public ocn(Context context, int i, obp obpVar, obp obpVar2) {
        super(obpVar, obpVar2);
        this.b = context;
        this.c = i;
        b();
    }

    @Override // defpackage.odc
    public final void b() {
        obp obpVar = this.d;
        obpVar.getClass();
        this.b.getClass();
        this.g.set(obpVar.v());
        this.f.set(this.d.t());
        this.h.set(this.d.r());
        this.j.set(this.d.s());
        int i = this.c;
        int i2 = (i == 16 || i == 8) ? this.k - this.j.top : 0;
        this.g.offset(0, i2);
        this.f.offset(0, i2);
        this.h.offset(0, i2);
        this.j.offset(0, i2);
    }

    @Override // defpackage.ocy, defpackage.obp
    public final void z(int i, int i2) {
        this.k = i2;
        b();
    }
}
