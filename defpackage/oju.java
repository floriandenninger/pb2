package defpackage;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oju implements fhb {
    public final SparseArray b = new SparseArray();
    public final Context c;
    public final obp d;
    public final obp e;
    public final obp f;

    public oju(Context context, obp obpVar, obp obpVar2, obp obpVar3) {
        this.c = context;
        this.d = obpVar;
        this.e = obpVar2;
        this.f = obpVar3;
    }

    @Override // defpackage.fhb
    public final fha a(int i) {
        return ((ojt) this.b.get(i)).b;
    }

    public final void b(int i, int i2, obp obpVar, int i3, int i4) {
        ojt ojtVar = new ojt(i2);
        obpVar.z(i3, i4);
        ojtVar.b(obpVar);
        this.b.put(i, ojtVar);
    }
}
