package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oew implements ajng {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public ofa c;

    @Override // defpackage.ajng
    public final int a() {
        return this.c != null ? 1 : 0;
    }

    @Override // defpackage.ajng
    public final long b(int i) {
        return 0L;
    }

    @Override // defpackage.ajng
    public final Object c(int i) {
        ofa ofaVar = this.c;
        if (i == (ofaVar != null ? 0 : -1)) {
            return ofaVar;
        }
        return null;
    }

    @Override // defpackage.ajng
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ajng
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.ajng
    public final void lX(ajnf ajnfVar) {
        this.a.add(ajnfVar);
    }

    @Override // defpackage.ajng
    public final void mK(ajol ajolVar) {
    }

    @Override // defpackage.ajng
    public final void mL(ajok ajokVar, int i) {
    }

    @Override // defpackage.ajng
    public final void pf(ajnf ajnfVar) {
        this.a.remove(ajnfVar);
    }
}
