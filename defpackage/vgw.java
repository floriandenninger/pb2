package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vgw implements anfy {
    public List a;
    final /* synthetic */ vgz b;

    public vgw(vgz vgzVar) {
        this.b = vgzVar;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        vgz vgzVar = this.b;
        amhy amhyVar = vgzVar.e;
        String valueOf = String.valueOf(vgzVar.a);
        amil b = amhyVar.b(valueOf.length() != 0 ? "Initialize ".concat(valueOf) : new String("Initialize "));
        try {
            synchronized (this.b.d) {
                if (this.a == null) {
                    vgz vgzVar2 = this.b;
                    this.a = vgzVar2.f;
                    vgzVar2.f = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            vgy vgyVar = new vgy(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((anfz) it.next()).a(vgyVar));
                } catch (Exception e) {
                    arrayList.add(anaf.N(e));
                }
            }
            anhy a = anaf.J(arrayList).a(new Callable() { // from class: vgv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    vgw vgwVar = vgw.this;
                    synchronized (vgwVar.b.d) {
                        vgwVar.a = null;
                    }
                    return null;
                }
            }, angq.a);
            b.a(a);
            b.close();
            return a;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
