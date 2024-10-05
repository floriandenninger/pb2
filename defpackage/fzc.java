package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.youtube.R;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzc {
    private final ml a;
    private final SparseArray b = new SparseArray();
    private int c;
    private boolean d;

    public fzc(ml mlVar) {
        this.a = mlVar;
    }

    public final synchronized void a(fze fzeVar) {
        fzeVar.getClass();
        int g = fzeVar.g();
        if (this.b.get(g) != fzeVar) {
            this.b.put(g, fzeVar);
            this.a.supportInvalidateOptionsMenu();
        }
    }

    public final synchronized void b(Menu menu) {
        for (int i = 0; i < menu.size(); i++) {
            fze fzeVar = (fze) this.b.get(menu.getItem(i).getItemId());
            if (fzeVar != null) {
                fzeVar.j();
            }
        }
    }

    public final synchronized void c(Collection collection) {
        this.b.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fze fzeVar = (fze) it.next();
            this.b.put(fzeVar.g(), fzeVar);
        }
        this.a.supportInvalidateOptionsMenu();
    }

    public final void d(int i) {
        boolean z = this.d;
        if (z && this.c == i) {
            return;
        }
        this.c = i;
        if (z) {
            this.a.supportInvalidateOptionsMenu();
        }
        this.d = true;
    }

    public final synchronized boolean e(MenuItem menuItem) {
        fze fzeVar = (fze) this.b.get(menuItem.getItemId());
        if (fzeVar == null) {
            return false;
        }
        return fzeVar.m();
    }

    public final synchronized void f(Menu menu, MenuInflater menuInflater, zau zauVar) {
        lu supportActionBar = this.a.getSupportActionBar();
        supportActionBar.getClass();
        Context b = supportActionBar.b();
        b.getClass();
        if (!this.d) {
            d(wbs.W(b, R.attr.colorButtonNormal).orElse(0));
        }
        gfw.h(menu, menuInflater, zauVar, this.b, this.c);
    }
}
