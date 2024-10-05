package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class atb implements ate {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private ath d;

    /* JADX INFO: Access modifiers changed from: protected */
    public atb(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ate
    public /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        pse.c(attVar);
        if (this.b.contains(attVar)) {
            return;
        }
        this.b.add(attVar);
        this.c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i) {
        ath athVar = this.d;
        int i2 = pts.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((att) this.b.get(i3)).a(this, athVar, this.a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        ath athVar = this.d;
        int i = pts.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((att) this.b.get(i2)).b(this, athVar, this.a);
        }
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(ath athVar) {
        for (int i = 0; i < this.c; i++) {
            ((att) this.b.get(i)).c(this, athVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(ath athVar) {
        this.d = athVar;
        for (int i = 0; i < this.c; i++) {
            ((att) this.b.get(i)).d(this, athVar, this.a);
        }
    }
}
