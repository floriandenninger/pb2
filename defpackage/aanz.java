package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aanz extends zgd {
    public aanz() {
        super("Set<BaselineProgressiveVideoItagsWithout18>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.a));
        hashSet.add(Integer.valueOf(aaoq.f));
        hashSet.add(Integer.valueOf(aaoq.g));
        return Collections.unmodifiableSet(hashSet);
    }
}
