package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aang extends zgd {
    public aang() {
        super("Set<ClearAdaptiveVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aaoq.m());
        hashSet.addAll(aaoq.n());
        hashSet.addAll(aaoq.o());
        hashSet.addAll(aaoq.k());
        hashSet.addAll(aaoq.l());
        return Collections.unmodifiableSet(hashSet);
    }
}
