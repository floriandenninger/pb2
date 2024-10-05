package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class fqz {
    public final View a;
    protected final ajjz b;
    protected Object c;

    public fqz(View view, ajjz ajjzVar, fqy fqyVar) {
        view.getClass();
        this.a = view;
        ajjzVar.getClass();
        this.b = ajjzVar;
        if (fqyVar != null) {
            b(fqyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final ajjv f(int i) {
        fqx fqxVar = new fqx(i);
        ajju a = ajjv.a();
        a.d(true);
        a.c = fqxVar;
        return a.a();
    }

    public abstract void b(fqy fqyVar);

    public abstract void c(Object obj);

    public void d() {
        this.a.setVisibility(8);
        e(true);
        this.c = null;
    }

    public final void e(boolean z) {
        this.a.setClickable(z);
    }
}
