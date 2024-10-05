package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaob extends zgd {
    public aaob() {
        super("Set<BaselineProgressiveVideoItagsWith18>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.a));
        hashSet.add(Integer.valueOf(aaoq.bn));
        hashSet.add(Integer.valueOf(aaoq.f));
        hashSet.add(Integer.valueOf(aaoq.b));
        hashSet.add(Integer.valueOf(aaoq.g));
        return Collections.unmodifiableSet(hashSet);
    }
}
