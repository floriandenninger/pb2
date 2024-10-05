package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ent implements ylb {
    private final agcf a;
    private final agaf b;
    private final ysy c;
    private final cnd d;

    public ent(agcf agcfVar, agaf agafVar, ysy ysyVar, cnd cndVar) {
        this.a = agcfVar;
        this.b = agafVar;
        this.c = ysyVar;
        this.d = cndVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        if (this.c.o()) {
            this.a.b(agce.LOCALE_CHANGED);
        } else {
            try {
                ynm.d(this.b.r(true), ens.a);
            } catch (Exception unused) {
                return 1;
            }
        }
        this.d.b();
        return 0;
    }
}
