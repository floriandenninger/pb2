package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agfa implements ykl {
    final /* synthetic */ agff a;

    public agfa(agff agffVar) {
        this.a = agffVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        List list = (List) obj2;
        if (list == null || list.isEmpty()) {
            return;
        }
        ((agtq) this.a.f.get()).e(this.a.c);
    }
}
