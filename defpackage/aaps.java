package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aaps implements aapu, ynu {
    protected final List a;
    protected final axpg b;
    private final Object c;

    public aaps(axpg axpgVar) {
        axpgVar.getClass();
        this.b = axpgVar;
        this.a = new ArrayList();
        this.c = new Object();
    }

    @Override // defpackage.aapu
    public final void a(Object obj) {
        ynv a;
        if (d(obj) && (a = ((aapt) this.b.get()).a(obj, this)) != null) {
            synchronized (this.c) {
                this.a.add(a);
            }
            a.d();
        }
    }

    @Override // defpackage.ynu
    public final void b(ynv ynvVar) {
        synchronized (this.c) {
            this.a.remove(ynvVar);
        }
    }

    public final void c() {
        int size;
        ynv[] ynvVarArr;
        synchronized (this.c) {
            size = this.a.size();
            ynvVarArr = new ynv[size];
            this.a.toArray(ynvVarArr);
            this.a.clear();
        }
        for (int i = 0; i < size; i++) {
            ynvVarArr[i].c();
        }
    }

    protected abstract boolean d(Object obj);
}
