package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaod extends zgd {
    public aaod() {
        super("Set<UltralowLqVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.B));
        hashSet.add(Integer.valueOf(aaoq.aA));
        return Collections.unmodifiableSet(hashSet);
    }
}
