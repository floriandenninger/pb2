package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lsv extends zi {
    final /* synthetic */ lsz a;
    private ajom b;
    private int c;
    private int d;

    public lsv(lsz lszVar) {
        this.a = lszVar;
    }

    @Override // defpackage.zi
    public final int d(RecyclerView recyclerView, wv wvVar) {
        if (this.a.i(recyclerView) && this.a.j(wvVar)) {
            return n(3);
        }
        return 0;
    }

    @Override // defpackage.zi
    public final boolean h(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        if (this.a.i(recyclerView) && this.a.k(wvVar, wvVar2)) {
            lsz lszVar = this.a;
            ajoo ajooVar = lszVar.c.g;
            ajpd ajpdVar = (ajpd) lszVar.b.get(lsz.b(wvVar));
            if (ajpdVar.contains(ajooVar.getItem(wvVar.b())) && ajpdVar.contains(ajooVar.getItem(wvVar2.b()))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zi
    public final boolean j() {
        return false;
    }

    @Override // defpackage.zi
    public final boolean k(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        ajpd ajpdVar;
        if (this.a.i(recyclerView) && this.a.k(wvVar, wvVar2)) {
            lsz lszVar = this.a;
            ajoo ajooVar = lszVar.c.g;
            ajpd ajpdVar2 = (ajpd) lszVar.b.get(lsz.b(wvVar));
            int a = lsz.a(wvVar, ajpdVar2, ajooVar);
            int a2 = lsz.a(wvVar2, ajpdVar2, ajooVar);
            if (a != -1 && a2 != -1) {
                this.d = a2;
                yjk.f();
                yjj.B(a, ajpdVar2.size() - 1);
                yjj.B(a2, ajpdVar2.size() - 1);
                if (a2 != a) {
                    ajpdVar2.b.add(a2, ajpdVar2.b.remove(a));
                    Iterator it = ajpdVar2.c.a.iterator();
                    while (it.hasNext()) {
                        ((yoq) it.next()).e(a, a2);
                    }
                }
                lsz lszVar2 = this.a;
                ajom b = lsz.b(wvVar);
                if (lszVar2.f == null || (ajpdVar = (ajpd) lszVar2.b.get(b)) == null) {
                    return true;
                }
                Iterator it2 = lszVar2.f.iterator();
                while (it2.hasNext()) {
                    ((lsx) it2.next()).b(b, ajpdVar, a, a2);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zi
    public final void m() {
    }

    @Override // defpackage.zi
    public final void p() {
    }

    @Override // defpackage.zi
    public final void g(wv wvVar, int i) {
        ajpd ajpdVar;
        ajpd ajpdVar2;
        ajom ajomVar = this.b;
        if (ajomVar != null) {
            lsz lszVar = this.a;
            int i2 = this.c;
            int i3 = this.d;
            if (lszVar.g != null && (ajpdVar2 = (ajpd) lszVar.b.get(ajomVar)) != null) {
                Iterator it = lszVar.g.iterator();
                while (it.hasNext()) {
                    ((lsw) it.next()).oD(ajomVar, ajpdVar2, i2, i3);
                }
            }
            this.b = null;
        }
        if (this.a.j(wvVar)) {
            ajom b = lsz.b(wvVar);
            this.b = b;
            if (b == null) {
                return;
            }
            int a = lsz.a(wvVar, (ajpd) this.a.b.get(b), this.a.c.g);
            this.c = a;
            this.d = a;
            lsz lszVar2 = this.a;
            ajom ajomVar2 = this.b;
            if (lszVar2.e == null || (ajpdVar = (ajpd) lszVar2.b.get(ajomVar2)) == null) {
                return;
            }
            Iterator it2 = lszVar2.e.iterator();
            while (it2.hasNext()) {
                ((lsy) it2.next()).c(ajomVar2, ajpdVar, a);
            }
        }
    }
}
