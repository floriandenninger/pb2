package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhx implements fxi, agae {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public anhy b;
    private final Context c;
    private final afyt d;
    private final Executor e;

    public fhx(Context context, Executor executor, agaf agafVar, afyt afytVar) {
        this.c = context;
        this.d = afytVar;
        this.e = executor;
        this.b = afytVar.b(context);
        agafVar.b(this);
    }

    private final void e() {
        final anhy b = this.d.b(this.c);
        ynm.k(anaf.I(b, this.b).a(new Callable() { // from class: fhv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fhx fhxVar = fhx.this;
                anhy anhyVar = b;
                afys afysVar = (afys) ynm.h(fhxVar.b, null);
                afys afysVar2 = (afys) ynm.h(anhyVar, null);
                if (afysVar2 == null || afysVar2.equals(afysVar)) {
                    return null;
                }
                fhxVar.b = anhyVar;
                return afysVar2;
            }
        }, angq.a), this.e, egw.l, new ynl() { // from class: fhu
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                fhx fhxVar = fhx.this;
                afys afysVar = (afys) obj;
                if (afysVar != null) {
                    ArrayList arrayList = new ArrayList(fhxVar.a);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((fhw) arrayList.get(i)).b(afysVar);
                    }
                }
            }
        });
    }

    @Override // defpackage.fxi
    public final void a() {
    }

    @Override // defpackage.fxi
    public final void b() {
        e();
    }

    @Override // defpackage.agae
    public final void d() {
        e();
    }
}
