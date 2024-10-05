package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pdh implements pde {
    private final pgx a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public pdh(pdb pdbVar) {
        pgx pgxVar = pdbVar.a;
        this.a = pgxVar;
        pgxVar.z(12);
        this.c = pgxVar.j() & PrivateKeyType.INVALID;
        this.b = pgxVar.j();
    }

    @Override // defpackage.pde
    public final int a() {
        return this.b;
    }

    @Override // defpackage.pde
    public final int b() {
        int i = this.c;
        if (i == 8) {
            return this.a.h();
        }
        if (i == 16) {
            return this.a.k();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int h = this.a.h();
        this.e = h;
        return (h & 240) >> 4;
    }

    @Override // defpackage.pde
    public final boolean c() {
        return false;
    }
}
