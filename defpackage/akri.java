package defpackage;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akri extends oba {
    final /* synthetic */ Bundle a;

    public akri(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.oba
    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a.keySet()) {
            arrayList.add(Pair.create(str, this.a.getString(str, "")));
        }
        return arrayList;
    }
}
