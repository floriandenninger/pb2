package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaom extends zgd {
    public aaom() {
        super("Set<Vp9HdrAdaptiveVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aaoq.o());
        return Collections.unmodifiableSet(hashSet);
    }
}
