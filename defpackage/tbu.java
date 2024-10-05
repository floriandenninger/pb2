package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tbu extends js {
    final /* synthetic */ tby a;

    public tbu(tby tbyVar) {
        this.a = tbyVar;
    }

    private final void l(int i) {
        int size = this.a.j.size();
        int i2 = size > 0 ? ((tbw) this.a.j.get(size - 1)).a : -1;
        Object item = ((ajox) this.a.p.a).getItem(i);
        ajdt ajdtVar = item != null ? (ajdt) this.a.a.get(item.getClass()) : null;
        if (i <= i2) {
            int b = this.a.b(i);
            for (int i3 = b; i3 < this.a.j.size(); i3++) {
                ((tbw) this.a.j.get(i3)).a++;
            }
            if (ajdtVar != null) {
                this.a.j.add(b, new tbw(i, ajdtVar, item));
            }
        } else if (ajdtVar != null) {
            this.a.j.add(new tbw(i, ajdtVar, item));
        }
        this.a.s = true;
        tby tbyVar = this.a;
        int i4 = tbyVar.n;
        if (i <= i4) {
            tbyVar.n = i4 + 1;
        }
        int i5 = tbyVar.o;
        if (i <= i5) {
            tbyVar.o = i5 + 1;
        }
    }

    private final void m(int i) {
        this.a.s = true;
        tby tbyVar = this.a;
        int i2 = tbyVar.n;
        if (i < i2) {
            tbyVar.n = i2 - 1;
        }
        int i3 = tbyVar.o;
        if (i < i3) {
            tbyVar.o = i3 - 1;
        }
        int size = tbyVar.j.size();
        if (i > (size > 0 ? ((tbw) this.a.j.get(size - 1)).a : -1)) {
            return;
        }
        int b = this.a.b(i);
        tbw tbwVar = (tbw) this.a.j.get(b);
        if (tbwVar.a == i) {
            this.a.j.remove(b);
            if (tbwVar.b) {
                tbwVar.c.b();
            }
        }
        while (b < this.a.j.size()) {
            tbw tbwVar2 = (tbw) this.a.j.get(b);
            tbwVar2.a--;
            b++;
        }
    }

    @Override // defpackage.js
    public final void c() {
        ArrayList arrayList = this.a.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tbw tbwVar = (tbw) arrayList.get(i);
            if (tbwVar.b) {
                tbwVar.c.b();
                tbwVar.b = false;
            }
        }
        this.a.j.clear();
        f(0, this.a.b.b());
        tby tbyVar = this.a;
        tbyVar.n = -1;
        tbyVar.o = -1;
        tbyVar.c();
    }

    @Override // defpackage.js
    public final void d(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            m(i4);
            l(i4);
        }
        this.a.c();
    }

    @Override // defpackage.js
    public final void e(int i, int i2, Object obj) {
        d(i, i2);
    }

    @Override // defpackage.js
    public final void f(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            l(i + i3);
        }
        this.a.c();
    }

    @Override // defpackage.js
    public final void g(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            m(i);
        }
        this.a.c();
    }

    @Override // defpackage.js
    public final void h(int i, int i2) {
        for (int i3 = 0; i3 <= 0; i3++) {
            m(i);
        }
        for (int i4 = 0; i4 <= 0; i4++) {
            l(i2 + i4);
        }
        this.a.c();
    }
}
