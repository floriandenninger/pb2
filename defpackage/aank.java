package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aank extends zgd {
    public aank() {
        super("Set<AdaptiveVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Set) aaoq.bo.get());
        hashSet.addAll(aaoq.h());
        return Collections.unmodifiableSet(hashSet);
    }
}
