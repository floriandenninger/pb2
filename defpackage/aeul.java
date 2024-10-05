package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeul implements plq {
    final /* synthetic */ aeut a;

    public aeul(aeut aeutVar) {
        this.a = aeutVar;
    }

    @Override // defpackage.plq
    public final void a(boolean z) {
        aeut aeutVar = this.a;
        aeutVar.L = z;
        afic aficVar = afic.ABR;
        aezf aezfVar = aeutVar.i.n;
        if (aezfVar != null) {
            String bL = adyu.bL(z);
            String bL2 = adyu.bL(this.a.M);
            long g = this.a.g();
            StringBuilder sb = new StringBuilder(bL.length() + 33 + bL2.length());
            sb.append("sfo.");
            sb.append(bL);
            sb.append(";po.");
            sb.append(bL2);
            sb.append(";pos.");
            sb.append(g);
            aezfVar.b.w("esfo", sb.toString());
        }
    }

    @Override // defpackage.plq
    public final /* synthetic */ void b() {
    }
}
