package defpackage;

import android.util.Pair;
import android.view.View;
import com.google.android.youtube.R;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcp implements ajpb, ajvr {
    private final akcy a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final ReferenceQueue d = new ReferenceQueue();

    public akcp(akcy akcyVar, aoae aoaeVar, aoae aoaeVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = akcyVar;
        aoaeVar.b.add(this);
        aoaeVar2.b.add(this);
        akcn akcnVar = new akcn(this);
        akcyVar.a.add(akcnVar);
        akcj akcjVar = akcyVar.d;
        if (akcjVar != null) {
            akcnVar.lj(akcjVar);
        }
    }

    public static String c(View view) {
        if (view == null) {
            return null;
        }
        return (String) view.getTag(R.id.tooltip_registry_id);
    }

    private final void h(avhy avhyVar, View view) {
        if (avhyVar == null || view == null) {
            return;
        }
        akcy akcyVar = this.a;
        akci k = akcyVar.k(avhyVar);
        k.a = view;
        k.l();
        akcyVar.c(k.a());
    }

    private final void i() {
        akco akcoVar = (akco) this.d.poll();
        while (akcoVar != null) {
            akco akcoVar2 = (akco) this.c.get(akcoVar.a);
            if (akcoVar2 != null && akcoVar2.get() == null) {
                this.c.remove(akcoVar.a);
            }
            akcoVar = (akco) this.d.poll();
        }
    }

    @Override // defpackage.ajpb
    public final void a(Object obj, View view) {
        String bB = evr.bB(obj);
        if (bB == null || bB.isEmpty()) {
            return;
        }
        d(bB, view);
    }

    @Override // defpackage.ajvr
    public final void b(Object obj, View view) {
        String bB = evr.bB(obj);
        if (bB == null || bB.isEmpty()) {
            return;
        }
        d(bB, view);
    }

    public final void d(String str, View view) {
        avhy avhyVar;
        akco akcoVar;
        String c = c(view);
        if (c != null && !c.equals(str) && (akcoVar = (akco) this.c.get(c)) != null && view.equals(akcoVar.get())) {
            this.c.remove(c);
        }
        view.setTag(R.id.tooltip_registry_id, str);
        if (str != null && !str.isEmpty()) {
            this.c.put(str, new akco(view, this.d, str));
            Pair pair = (Pair) this.b.get(str);
            if (pair == null || !((ammy) pair.second).a((avhy) pair.first)) {
                this.b.remove(str);
                avhyVar = null;
            } else {
                avhyVar = (avhy) pair.first;
            }
            h(avhyVar, view);
        }
        i();
    }

    public final void e(avhy avhyVar, ammy ammyVar) {
        f(avhyVar, ammyVar, true);
    }

    public final void f(avhy avhyVar, ammy ammyVar, boolean z) {
        String str = avhyVar.d;
        WeakReference weakReference = (WeakReference) this.c.get(str);
        View view = null;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            if (view2 == null || !str.equals(c(view2))) {
                this.c.remove(str);
            } else if (jw.aj(view2)) {
                view = view2;
            }
        }
        if (!z || view == null || view.isDirty() || !ammyVar.a(avhyVar)) {
            this.b.put(avhyVar.d, new Pair(avhyVar, ammyVar));
        } else {
            h(avhyVar, view);
        }
        i();
    }

    public final void g(String str) {
        this.b.remove(str);
        i();
    }
}
