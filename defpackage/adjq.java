package defpackage;

import android.util.Pair;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adjq implements Comparator {
    final /* synthetic */ adjr a;

    public adjq(adjr adjrVar) {
        this.a = adjrVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        adjl adjlVar = (adjl) this.a.c.get(((Pair) obj).first);
        adjl adjlVar2 = (adjl) this.a.c.get(((Pair) obj2).first);
        if (adjlVar == null && adjlVar2 == null) {
            return 0;
        }
        if (adjlVar == null) {
            return 1;
        }
        if (adjlVar2 == null) {
            return -1;
        }
        return adjlVar2.b - adjlVar.b;
    }
}
