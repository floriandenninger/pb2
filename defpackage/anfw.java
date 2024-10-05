package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anfw extends anfu {
    @Override // defpackage.anfu
    public final int a(anfx anfxVar) {
        int i;
        synchronized (anfxVar) {
            i = anfxVar.remaining - 1;
            anfxVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.anfu
    public final void b(anfx anfxVar, Set set) {
        synchronized (anfxVar) {
            if (anfxVar.seenExceptions == null) {
                anfxVar.seenExceptions = set;
            }
        }
    }
}
