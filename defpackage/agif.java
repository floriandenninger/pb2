package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agif implements agit {
    final /* synthetic */ agii a;

    public agif(agii agiiVar) {
        this.a = agiiVar;
    }

    @Override // defpackage.agit
    public final void a(agng agngVar) {
        agnb agnbVar = agngVar.c;
        if (agnbVar != null) {
            this.a.a(agnbVar.a);
        }
        agmm.x(this.a.a.g(agngVar.a));
    }

    @Override // defpackage.agit
    public final void b(Collection collection) {
        this.a.b(collection);
    }

    @Override // defpackage.agit
    public final void c(agng agngVar, Collection collection, HashSet hashSet, atrx atrxVar, int i, byte[] bArr, Set set, agno agnoVar) {
    }
}
