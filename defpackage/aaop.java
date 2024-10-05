package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaop extends zgd {
    public aaop() {
        super("Set<clearAv1HdrAdaptiveVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.r));
        hashSet.add(Integer.valueOf(aaoq.s));
        hashSet.add(Integer.valueOf(aaoq.t));
        hashSet.add(Integer.valueOf(aaoq.u));
        hashSet.add(Integer.valueOf(aaoq.v));
        hashSet.add(Integer.valueOf(aaoq.w));
        hashSet.add(Integer.valueOf(aaoq.x));
        hashSet.add(Integer.valueOf(aaoq.y));
        hashSet.add(Integer.valueOf(aaoq.z));
        hashSet.add(Integer.valueOf(aaoq.A));
        return Collections.unmodifiableSet(hashSet);
    }
}
