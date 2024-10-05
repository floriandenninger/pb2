package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aanj extends zgd {
    public aanj() {
        super("Set<WebmItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet(aaoq.y());
        hashSet.addAll(aaoq.z());
        hashSet.add(Integer.valueOf(aaoq.Y));
        hashSet.add(Integer.valueOf(aaoq.X));
        hashSet.add(Integer.valueOf(aaoq.T));
        hashSet.add(Integer.valueOf(aaoq.U));
        hashSet.add(Integer.valueOf(aaoq.V));
        hashSet.add(Integer.valueOf(aaoq.W));
        return Collections.unmodifiableSet(hashSet);
    }
}
