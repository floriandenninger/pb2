package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gnn {
    public final SharedPreferences a;
    public final shf b;

    public gnn(SharedPreferences sharedPreferences, shf shfVar) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        shfVar.getClass();
        this.b = shfVar;
    }

    public static final String a(arej arejVar) {
        String valueOf = String.valueOf(arejVar.c);
        return valueOf.length() != 0 ? fav.HINT_LAST_SHOWN.concat(valueOf) : new String(fav.HINT_LAST_SHOWN);
    }

    public static final String b(arej arejVar) {
        String valueOf = String.valueOf(arejVar.c);
        return valueOf.length() != 0 ? fav.HINT_ID_PREFIX.concat(valueOf) : new String(fav.HINT_ID_PREFIX);
    }
}
