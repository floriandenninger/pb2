package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ofn implements ohk {
    private final ajwx a;
    private final ajvc b;

    public ofn(ajwx ajwxVar, ajvc ajvcVar) {
        ajwxVar.getClass();
        this.a = ajwxVar;
        ajvcVar.getClass();
        this.b = ajvcVar;
    }

    @Override // defpackage.ohk
    public final void a() {
        HashSet hashSet;
        ajwx ajwxVar = this.a;
        ajvc ajvcVar = this.b;
        ajng r = ajwxVar.r();
        if (r == null) {
            hashSet = new HashSet();
        } else {
            ajoc ajocVar = (ajoc) r;
            int i = ajocVar.i(ajvcVar.lC());
            int h = ajocVar.h() - 1;
            HashSet hashSet2 = new HashSet();
            for (int i2 = i + 1; i2 <= h; i2++) {
                ajob k = ajocVar.k(i2);
                if (k != null) {
                    for (int i3 = 0; i3 < k.a.a(); i3++) {
                        hashSet2.add(k.a.c(i3));
                    }
                }
            }
            hashSet = hashSet2;
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.a.z(new afiq(hashSet, 1));
    }

    @Override // defpackage.ohk
    public final void b() {
        this.a.I();
    }
}
