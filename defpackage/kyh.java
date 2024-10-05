package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyh {
    public final String a;
    public int d;
    private final abaz e;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    private final kyd f = new kyd(this, Looper.getMainLooper());

    public kyh(abaz abazVar, String str) {
        this.e = abazVar;
        this.a = str;
    }

    public static final void e(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList.isEmpty()) {
            arrayList.add((kye) arrayList2.remove(0));
        }
        if (((kye) amkq.bj(arrayList)).c()) {
            while (!arrayList2.isEmpty() && ((kye) arrayList2.get(0)).c()) {
                arrayList.add((kye) arrayList2.remove(0));
            }
        }
    }

    private final boolean f() {
        if (this.b.isEmpty()) {
            return false;
        }
        if (amkq.bm(this.b, juz.h)) {
            return true;
        }
        kyd kydVar = this.f;
        return (kydVar.hasMessages(1) || kydVar.hasMessages(2)) ? false : true;
    }

    public final void a(kye kyeVar) {
        if (kyeVar.c() && (amkq.bm(this.b, juz.g) || amkq.bm(this.c, juz.g))) {
            return;
        }
        kye kyeVar2 = (kye) amkq.bq(this.b);
        if (kyeVar2 != null && kyeVar2.b(kyeVar)) {
            this.b.remove(r0.size() - 1);
        }
        boolean f = f();
        this.b.add(kyeVar);
        if (!kyeVar.c() || this.b.size() > 6) {
            d();
        } else {
            if (f) {
                return;
            }
            if (this.b.size() == 1) {
                this.f.a(1, 8000);
            }
            this.f.a(2, 3000);
        }
    }

    public final void b() {
        this.c.clear();
        if (f()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        abaw a = this.e.a();
        kye kyeVar = (kye) arrayList.get(0);
        a.a = kyeVar.f.a;
        a.c = kyeVar.c;
        if (!kyeVar.d.H()) {
            a.l(kyeVar.d);
        } else {
            a.k();
        }
        kyeVar.a(a);
        for (int i = 1; i < arrayList.size(); i++) {
            ((kye) arrayList.get(i)).a(a);
        }
        this.e.b(a, new kyf(this, kyeVar.e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.f.removeCallbacksAndMessages(null);
        if (this.c.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            e(arrayList, this.b);
            c(arrayList);
            this.c.addAll(arrayList);
        }
    }
}
