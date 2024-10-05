package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afee extends afcp {
    public final ozv a;

    public afee(ozv ozvVar) {
        this.a = ozvVar;
    }

    @Override // defpackage.afcp
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.afcp
    public final int b() {
        return this.a.e;
    }

    @Override // defpackage.afcp
    public final int c() {
        return this.a.d;
    }

    @Override // defpackage.afcp
    public final String d() {
        return ammx.d(this.a.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afee) && this.a.equals(((afee) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
