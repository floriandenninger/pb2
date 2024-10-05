package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agrs implements Comparator {
    final /* synthetic */ agrt a;

    public agrs(agrt agrtVar) {
        this.a = agrtVar;
    }

    private final int a(Object obj) {
        Integer num = (Integer) this.a.d.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return a(obj2) - a(obj);
    }
}
