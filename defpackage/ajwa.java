package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajwa {
    public final ajpd a;
    public final ajox b;
    private final acqz c;
    private final ajnw d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ajos, java.lang.Object] */
    public ajwa(RecyclerView recyclerView, ajoy ajoyVar, ajvb ajvbVar, acqz acqzVar) {
        this.c = acqzVar;
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        ajox a = ajoyVar.a(ajvbVar.get());
        this.b = a;
        a.h(ajpdVar);
        ajnw ajnwVar = new ajnw();
        this.d = ajnwVar;
        a.rU(ajnwVar);
        recyclerView.ac(a);
    }

    public abstract void a(Object obj, ajpd ajpdVar);

    public final void b(List list) {
        this.d.a = this.c.mM();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), this.a);
        }
    }
}
