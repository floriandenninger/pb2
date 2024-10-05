package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apy implements aox {
    public final aqe a;
    public final apv b;
    public boolean c = false;

    public apy(aqe aqeVar, apv apvVar) {
        this.a = aqeVar;
        this.b = apvVar;
    }

    @Override // defpackage.aox
    public final void a(Object obj) {
        if (apw.b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  onLoadFinished in ");
            sb.append(this.a);
            sb.append(": ");
            sb.append(aqe.e(obj));
        }
        this.c = true;
        vac vacVar = (vac) this.b;
        vacVar.a.clear();
        vacVar.a.addAll((List) obj);
        vacVar.a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.b.toString();
    }
}
