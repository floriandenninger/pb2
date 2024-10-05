package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fok implements wl {
    public final ArrayList a = new ArrayList(2);

    @Override // defpackage.wl
    public final void a(wv wvVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wl) arrayList.get(i)).a(wvVar);
        }
    }
}
