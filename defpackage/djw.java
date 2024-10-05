package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djw {
    public djx a;
    public dhr b;

    public djw(djx djxVar, dhr dhrVar) {
        this.a = djxVar;
        this.b = dhrVar;
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        dhr dhrVar = this.b;
        boolean z = (dhrVar == null || did.t() || !dhrVar.g) ? false : true;
        djx djxVar = this.a;
        return djxVar != null && djxVar.w && z;
    }
}
