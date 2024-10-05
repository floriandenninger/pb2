package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uxk implements anfz {
    public final /* synthetic */ uwl a;
    private final /* synthetic */ int b;

    public /* synthetic */ uxk(uwl uwlVar, int i) {
        this.b = i;
        this.a = uwlVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.b == 0) {
            uwl uwlVar = this.a;
            return uxp.e(uwlVar.b, uwlVar.c, uwlVar.d, (uxq) obj, uwlVar.g, uwlVar.h);
        }
        uwl uwlVar2 = this.a;
        uvw uvwVar = (uvw) obj;
        if (uvwVar.a == 29501) {
            String str = uwlVar2.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
            sb.append("Failed to commit due to stale snapshot for ");
            sb.append(str);
            sb.append(", triggering flag update.");
            Log.w("ProtoDataStoreFlagStore", sb.toString(), uvwVar);
            uwlVar2.d();
        }
        return anaf.N(uvwVar);
    }
}
