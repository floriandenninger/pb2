package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class apf implements bub {
    final /* synthetic */ aph a;

    public apf(aph aphVar) {
        this.a = aphVar;
    }

    @Override // defpackage.bub
    public final Bundle a() {
        for (Map.Entry entry : new HashMap(this.a.c).entrySet()) {
            Bundle a = ((bub) entry.getValue()).a();
            aph aphVar = this.a;
            String str = (String) entry.getKey();
            if (a != null) {
                Class[] clsArr = aph.a;
                for (int i = 0; i < 29; i++) {
                    if (!clsArr[i].isInstance(a)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a.getClass() + " into saved state");
            }
            aow aowVar = (aow) aphVar.d.get(str);
            if (aowVar != null) {
                aowVar.l(a);
            } else {
                aphVar.b.put(str, a);
            }
        }
        Set<String> keySet = this.a.b.keySet();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
        for (String str2 : keySet) {
            arrayList.add(str2);
            arrayList2.add(this.a.b.get(str2));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("keys", arrayList);
        bundle.putParcelableArrayList("values", arrayList2);
        return bundle;
    }
}
