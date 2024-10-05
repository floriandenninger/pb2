package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aetp extends afcp {
    public volatile pms a;
    public volatile pms b;

    public aetp(pms pmsVar) {
        this.a = pmsVar;
    }

    @Override // defpackage.afcp
    public final int a() {
        return this.a.j;
    }

    @Override // defpackage.afcp
    public final int b() {
        return this.a.t;
    }

    @Override // defpackage.afcp
    public final int c() {
        return this.a.s;
    }

    @Override // defpackage.afcp
    public final String d() {
        return ammx.d(this.a.c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aetp) && this.a.equals(((aetp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
