package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaoc extends zgd {
    public aaoc() {
        super("Set<ProgressiveVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Collection) aaoq.bu.get());
        hashSet.add(Integer.valueOf(aaoq.e));
        hashSet.add(Integer.valueOf(aaoq.d));
        hashSet.add(Integer.valueOf(aaoq.c));
        return Collections.unmodifiableSet(hashSet);
    }
}
