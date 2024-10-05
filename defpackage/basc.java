package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class basc extends barx {
    public final basb a;

    public basc(basb basbVar) {
        this.a = basbVar;
    }

    @Override // defpackage.barx
    public final anhy a(int i, byte[] bArr) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void b(int i, byte[] bArr) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void c() {
    }

    @Override // defpackage.barx
    public final byte[] d(int i, byte[] bArr) {
        if (i == -1127349984) {
            basb basbVar = this.a;
            aone createBuilder = awmg.a.createBuilder();
            aoqa cg = amkq.cg(basbVar.c.a());
            createBuilder.copyOnWrite();
            awmg awmgVar = (awmg) createBuilder.instance;
            cg.getClass();
            awmgVar.c = cg;
            awmgVar.b |= 1;
            return ((awmg) createBuilder.build()).toByteArray();
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void e(int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final anhy f(int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
