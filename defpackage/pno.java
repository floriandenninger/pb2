package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pno implements pnk {
    public final bbm a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public pno(bbr bbrVar, boolean z) {
        this.a = new bbm(bbrVar, z);
    }

    @Override // defpackage.pnk
    public final pou a() {
        return this.a.d;
    }

    @Override // defpackage.pnk
    public final Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}
