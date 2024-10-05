package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbi implements oxv {
    Set b;
    Set c;
    boolean d;
    aeev e;
    private int f;

    public final void b(int i, Set set, Set set2, boolean z, aeev aeevVar) {
        this.f = i;
        this.b = set;
        this.c = set2;
        this.d = z;
        this.e = aeevVar;
    }

    @Override // defpackage.oxv
    public final oxf a(String str, boolean z) {
        Set emptySet = this.f == 3 ? this.b : Collections.emptySet();
        int i = aeev.NONE.d;
        if (this.d && psz.l(str)) {
            i = this.e.d;
        }
        return adyu.M(str, z, this.c, emptySet, i);
    }
}
