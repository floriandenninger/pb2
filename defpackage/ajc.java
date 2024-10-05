package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajc implements hw {
    final /* synthetic */ String a;

    public ajc(String str) {
        this.a = str;
    }

    @Override // defpackage.hw
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ajd ajdVar = (ajd) obj;
        synchronized (aje.c) {
            ArrayList arrayList = (ArrayList) aje.d.get(this.a);
            if (arrayList == null) {
                return;
            }
            aje.d.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((hw) arrayList.get(i)).accept(ajdVar);
            }
        }
    }
}
