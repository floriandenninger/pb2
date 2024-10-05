package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aabo implements aabn {
    private final Map a;

    public aabo(Map map) {
        this.a = map;
    }

    @Override // defpackage.aabn
    public final wv a(Context context, ViewGroup viewGroup, zzz zzzVar, boolean z) {
        return ((aabn) this.a.get(zzzVar)).a(context, viewGroup, zzzVar, z);
    }

    @Override // defpackage.aabn
    public final void b(Context context, aaaa aaaaVar, wv wvVar, aabq aabqVar) {
        ((aabn) this.a.get(aaaaVar.b)).b(context, aaaaVar, wvVar, aabqVar);
    }
}
