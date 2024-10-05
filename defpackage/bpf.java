package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpf {
    final List a;
    final boolean b;

    public bpf(List list, boolean z) {
        this.a = list == null ? Collections.emptyList() : list;
        this.b = z;
    }

    public static bpf a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(bou.l((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new bpf(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final boolean b() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            bou bouVar = (bou) this.a.get(i);
            if (bouVar == null || !bouVar.u()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.a.toArray()) + ", isValid=" + b() + " }";
    }
}
