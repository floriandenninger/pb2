package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bph {
    public static final bph a = new bph(new Bundle(), null);
    public final Bundle b;
    List c;

    public bph(Bundle bundle, List list) {
        this.b = bundle;
        this.c = list;
    }

    public static bph a(Bundle bundle) {
        if (bundle != null) {
            return new bph(bundle, null);
        }
        return null;
    }

    public final List b() {
        c();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.c == null) {
            ArrayList<String> stringArrayList = this.b.getStringArrayList("controlCategories");
            this.c = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.c = Collections.emptyList();
            }
        }
    }

    public final boolean d() {
        c();
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bph)) {
            return false;
        }
        bph bphVar = (bph) obj;
        c();
        bphVar.c();
        return this.c.equals(bphVar.c);
    }

    public final int hashCode() {
        c();
        return this.c.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
