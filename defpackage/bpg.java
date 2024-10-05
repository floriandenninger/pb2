package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpg {
    private ArrayList a;

    public bpg() {
    }

    public bpg(bph bphVar) {
        if (bphVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        bphVar.c();
        if (bphVar.c.isEmpty()) {
            return;
        }
        this.a = new ArrayList(bphVar.c);
    }

    public final bph a() {
        if (this.a == null) {
            return bph.a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new bph(bundle, this.a);
    }

    public final void c(String str) {
        if (str != null) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            if (this.a.contains(str)) {
                return;
            }
            this.a.add(str);
            return;
        }
        throw new IllegalArgumentException("category must not be null");
    }

    public final void b(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("categories must not be null");
        }
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((String) it.next());
        }
    }

    public final void d(bph bphVar) {
        if (bphVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b(bphVar.b());
    }
}
