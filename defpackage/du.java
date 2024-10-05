package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class du {
    public ArrayList a;
    private final IconCompat b;
    private final CharSequence c;
    private final PendingIntent d;
    private boolean e;
    private final Bundle f;
    private boolean g;

    public du(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat f = i == 0 ? null : IconCompat.f(i);
        Bundle bundle = new Bundle();
        this.e = true;
        this.g = true;
        this.b = f;
        this.c = dy.d(charSequence);
        this.d = pendingIntent;
        this.f = bundle;
        this.a = null;
        this.e = true;
        this.g = true;
    }

    public final dv a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.a;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                ei eiVar = (ei) arrayList3.get(i);
                boolean z = eiVar.c;
                arrayList2.add(eiVar);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new dv(this.b, this.c, this.d, this.f, arrayList2.isEmpty() ? null : (ei[]) arrayList2.toArray(new ei[arrayList2.size()]), this.e, this.g);
    }
}
