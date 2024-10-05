package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqf {
    public sqe[] a = null;

    public final boolean a() {
        sqe[] sqeVarArr = this.a;
        if (sqeVarArr != null) {
            for (sqe sqeVar : sqeVarArr) {
                if (sqeVar.f()) {
                    return true;
                }
            }
        }
        return false;
    }
}
