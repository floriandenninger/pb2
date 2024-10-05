package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ayio extends aybv {
    public final aybv a;

    public ayio(aybv aybvVar) {
        this.a = aybvVar;
    }

    @Override // defpackage.axzp
    public final axzr a(aych aychVar, axzo axzoVar) {
        return this.a.a(aychVar, axzoVar);
    }

    @Override // defpackage.axzp
    public final String b() {
        return this.a.b();
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("delegate", this.a);
        return Y.toString();
    }
}
