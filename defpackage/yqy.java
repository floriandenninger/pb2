package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yqy implements yst {
    private final ypa a;
    private final ynz b;
    private final ynz c;
    private final ynz d;
    private final ynz e;

    public yqy(ypa ypaVar, ynz ynzVar, ynz ynzVar2, ynz ynzVar3, ynz ynzVar4) {
        this.a = ypaVar;
        this.b = ynzVar;
        this.c = ynzVar2;
        this.d = ynzVar3;
        this.e = ynzVar4;
    }

    @Override // defpackage.yst
    public final void a() {
        this.a.d(this.c);
    }

    @Override // defpackage.yst
    public final void b() {
        this.a.d(this.b);
    }

    @Override // defpackage.yst
    public final void c() {
        ynz ynzVar = this.e;
        if (ynzVar != null) {
            this.a.d(ynzVar);
        }
    }

    @Override // defpackage.yst
    public final void d() {
        ynz ynzVar = this.d;
        if (ynzVar != null) {
            this.a.d(ynzVar);
        }
    }
}
