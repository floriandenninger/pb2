package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class nve implements nvg {
    protected final Set a = new HashSet();
    protected Object b;
    protected boolean c;

    @Override // defpackage.nvg
    public void j(ajol ajolVar) {
        if (ajolVar == null) {
            return;
        }
        this.a.add(ajolVar);
    }

    @Override // defpackage.nvg
    public void k(Object obj, boolean z) {
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.ajwo
    public final /* synthetic */ void lr(String str) {
        throw null;
    }

    @Override // defpackage.nrg
    public final /* synthetic */ void oX() {
    }
}
