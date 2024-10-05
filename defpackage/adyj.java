package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyj implements adxo {
    public final ylz a = new ymh(20);

    @Override // defpackage.adxo
    public final boolean a(String str, String str2, long j) {
        int a = ozv.a(str2);
        Set set = (Set) this.a.a(str);
        if (set == null || set.isEmpty()) {
            return true;
        }
        return set.contains(Integer.valueOf(a));
    }

    public final void b(String str, Set set) {
        this.a.d(str, set);
    }
}
