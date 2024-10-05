package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bar implements bbr {
    private Looper e;
    private pou f;
    private final ArrayList d = new ArrayList(1);
    public final HashSet a = new HashSet(1);
    public final bbx b = new bbx();
    public final bbx c = new bbx(null);

    @Override // defpackage.bbr
    public final void b(Handler handler, bby bbyVar) {
        pse.c(bbyVar);
        this.b.a(handler, bbyVar);
    }

    @Override // defpackage.bbr
    public final void j(bbq bbqVar) {
        this.d.remove(bbqVar);
        if (this.d.isEmpty()) {
            this.e = null;
            this.f = null;
            this.a.clear();
            k();
            return;
        }
        rr(bbqVar);
    }

    @Override // defpackage.bbr
    public final void jI(Handler handler, aym aymVar) {
        pse.c(aymVar);
        this.c.o(handler, aymVar);
    }

    protected abstract void k();

    /* JADX INFO: Access modifiers changed from: protected */
    public final bbx n(ash ashVar) {
        return this.b.i(0, ashVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bbx q(ash ashVar) {
        return this.c.v(0, ashVar);
    }

    @Override // defpackage.bbr
    public final /* synthetic */ void rA() {
    }

    protected abstract void rq(att attVar);

    @Override // defpackage.bbr
    public final void rr(bbq bbqVar) {
        boolean isEmpty = this.a.isEmpty();
        this.a.remove(bbqVar);
        if ((!isEmpty) && this.a.isEmpty()) {
            rs();
        }
    }

    protected void rs() {
    }

    @Override // defpackage.bbr
    public final void rt(bbq bbqVar) {
        pse.c(this.e);
        boolean isEmpty = this.a.isEmpty();
        this.a.add(bbqVar);
        if (isEmpty) {
            ru();
        }
    }

    protected void ru() {
    }

    @Override // defpackage.bbr
    public final void rv(bbq bbqVar, att attVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        pse.e(z);
        pou pouVar = this.f;
        this.d.add(bbqVar);
        if (this.e == null) {
            this.e = myLooper;
            this.a.add(bbqVar);
            rq(attVar);
        } else if (pouVar != null) {
            rt(bbqVar);
            bbqVar.a(this, pouVar);
        }
    }

    public final void rw(pou pouVar) {
        this.f = pouVar;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bbq) arrayList.get(i)).a(this, pouVar);
        }
    }

    @Override // defpackage.bbr
    public final void rx(aym aymVar) {
        bbx bbxVar = this.c;
        Iterator it = bbxVar.b.iterator();
        while (it.hasNext()) {
            ayl aylVar = (ayl) it.next();
            if (aylVar.b == aymVar) {
                bbxVar.b.remove(aylVar);
            }
        }
    }

    @Override // defpackage.bbr
    public final void ry(bby bbyVar) {
        bbx bbxVar = this.b;
        Iterator it = bbxVar.b.iterator();
        while (it.hasNext()) {
            bbw bbwVar = (bbw) it.next();
            if (bbwVar.b == bbyVar) {
                bbxVar.b.remove(bbwVar);
            }
        }
    }

    @Override // defpackage.bbr
    public final /* synthetic */ void rz() {
    }
}
