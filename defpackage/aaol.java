package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaol extends zgd {
    public aaol() {
        super("Set<Vp9AdaptiveVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aaoq.n());
        hashSet.addAll(aaoq.j());
        return Collections.unmodifiableSet(hashSet);
    }
}
