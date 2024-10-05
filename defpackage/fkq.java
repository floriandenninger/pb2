package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fkq implements ywl {
    public final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ int b;

    public /* synthetic */ fkq(SharedPreferences sharedPreferences, int i) {
        this.b = i;
        this.a = sharedPreferences;
    }

    @Override // defpackage.ywl
    public final Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return Long.valueOf(this.a.getLong((String) obj, ((Long) obj2).longValue()));
        }
        if (i != 1) {
            return this.a.getString((String) obj, (String) obj2);
        }
        return Boolean.valueOf(this.a.getBoolean((String) obj, ((Boolean) obj2).booleanValue()));
    }
}
