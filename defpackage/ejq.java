package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejq {
    public final wou a;
    public final Set b = new HashSet();
    public ajox c;
    public js d;

    public ejq(wou wouVar) {
        this.a = wouVar;
    }

    public final void a(Object obj) {
        aoxc aoxcVar = aoxc.a;
        if ((obj instanceof ajds) && (aoxcVar = ((ajds) obj).b().f) == null) {
            aoxcVar = aoxc.a;
        }
        int i = aoxcVar.b;
        if (((i & 1) == 0 && (i & 2) == 0) || this.b.contains(aoxcVar)) {
            return;
        }
        wou wouVar = this.a;
        aoyn aoynVar = aoxcVar.c;
        if (aoynVar == null) {
            aoynVar = aoyn.a;
        }
        aowz aowzVar = aoxcVar.d;
        if (aowzVar == null) {
            aowzVar = aowz.a;
        }
        wouVar.a(aoynVar, aowzVar);
        this.b.add(aoxcVar);
    }
}
