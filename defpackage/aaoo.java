package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaoo extends zgd {
    public aaoo() {
        super("Set<Av1AdaptiveVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aaoq.k());
        return Collections.unmodifiableSet(hashSet);
    }
}
