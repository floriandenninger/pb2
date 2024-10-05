package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaog extends zgd {
    public aaog() {
        super("Set<HfrVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aaoq.z());
        hashSet.addAll(aaoq.e());
        return Collections.unmodifiableSet(hashSet);
    }
}
