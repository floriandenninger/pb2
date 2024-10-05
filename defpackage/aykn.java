package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aykn extends axzp {
    final /* synthetic */ aykt a;

    public aykn(aykt ayktVar) {
        this.a = ayktVar;
    }

    @Override // defpackage.axzp
    public final axzr a(aych aychVar, axzo axzoVar) {
        Executor d = this.a.c.d(axzoVar);
        aykx aykxVar = this.a.c;
        aygc aygcVar = new aygc(aychVar, d, axzoVar, aykxVar.V, aykxVar.D ? null : this.a.c.j.b(), this.a.c.E);
        aygcVar.g = this.a.c.p;
        return aygcVar;
    }

    @Override // defpackage.axzp
    public final String b() {
        return this.a.b;
    }
}
