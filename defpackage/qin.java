package defpackage;

import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qin extends qip {
    final /* synthetic */ qio a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qin(qio qioVar) {
        super(null);
        this.a = qioVar;
    }

    @Override // defpackage.qip
    public final void a(int[] iArr) {
        List f = qko.f(iArr);
        if (this.a.d.equals(f)) {
            return;
        }
        this.a.e();
        this.a.f.evictAll();
        this.a.g.clear();
        qio qioVar = this.a;
        qioVar.d = f;
        qioVar.f();
        this.a.d();
        this.a.c();
    }

    @Override // defpackage.qip
    public final void b(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = this.a.d.size();
        } else {
            i2 = this.a.e.get(i, -1);
            if (i2 == -1) {
                this.a.g();
                return;
            }
        }
        this.a.e();
        this.a.d.addAll(i2, qko.f(iArr));
        this.a.f();
        Iterator it = this.a.k.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.c();
    }

    @Override // defpackage.qip
    public final void c(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        this.a.g.clear();
        for (MediaQueueItem mediaQueueItem : mediaQueueItemArr) {
            int i = mediaQueueItem.b;
            this.a.f.put(Integer.valueOf(i), mediaQueueItem);
            int i2 = this.a.e.get(i, -1);
            if (i2 != -1) {
                hashSet.add(Integer.valueOf(i2));
            } else {
                this.a.g();
                return;
            }
        }
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            int i3 = this.a.e.get(((Integer) it.next()).intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        this.a.g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.a.e();
        qio qioVar = this.a;
        qko.k(arrayList);
        qioVar.i();
        this.a.c();
    }

    @Override // defpackage.qip
    public final void d(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.a.f.remove(Integer.valueOf(i));
            int i2 = this.a.e.get(i, -1);
            if (i2 != -1) {
                this.a.e.delete(i);
                arrayList.add(Integer.valueOf(i2));
            } else {
                this.a.g();
                return;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        this.a.e();
        this.a.d.removeAll(qko.f(iArr));
        this.a.f();
        qio qioVar = this.a;
        qko.k(arrayList);
        Iterator it = qioVar.k.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.c();
    }

    @Override // defpackage.qip
    public final void e(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            this.a.d.size();
        } else if (list2.isEmpty()) {
            this.a.a.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
        } else if (this.a.e.get(i, -1) == -1) {
            this.a.e.get(((Integer) list2.get(0)).intValue(), -1);
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i2 = this.a.e.get(((Integer) it.next()).intValue(), -1);
            if (i2 != -1) {
                arrayList.add(Integer.valueOf(i2));
            } else {
                this.a.g();
                return;
            }
        }
        this.a.e();
        qio qioVar = this.a;
        qioVar.d = list;
        qioVar.f();
        for (qip qipVar : this.a.k) {
        }
        this.a.c();
    }

    @Override // defpackage.qip
    public final void f(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.a.f.remove(Integer.valueOf(i));
            int i2 = this.a.e.get(i, -1);
            if (i2 != -1) {
                arrayList.add(Integer.valueOf(i2));
            } else {
                this.a.g();
                return;
            }
        }
        Collections.sort(arrayList);
        this.a.e();
        qio qioVar = this.a;
        qko.k(arrayList);
        qioVar.i();
        this.a.c();
    }

    @Override // defpackage.qip
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.qip
    public final void h() {
        long a = this.a.a();
        qio qioVar = this.a;
        if (a != qioVar.b) {
            qioVar.b = a;
            qioVar.b();
            qio qioVar2 = this.a;
            if (qioVar2.b != 0) {
                qioVar2.g();
            }
        }
    }
}
