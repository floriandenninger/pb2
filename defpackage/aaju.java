package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaju implements anhh {
    final /* synthetic */ aajv a;

    public aaju(aajv aajvVar) {
        this.a = aajvVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List<aakz> list = (List) obj;
        if (list != null) {
            aajv aajvVar = this.a;
            for (aakz aakzVar : list) {
                aajvVar.o(aakzVar.a).c(aakzVar);
                aajvVar.n(((aakt) amkq.Z(aakzVar.c, aakzVar.b)).getClass()).c(aakzVar);
            }
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        aals aalsVar = this.a.e;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("commit failed:");
        sb.append(valueOf);
        aalsVar.a("ISPES", sb.toString());
    }
}
