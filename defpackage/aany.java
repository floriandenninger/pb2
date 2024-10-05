package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aany extends zgd {
    public aany() {
        super("Set<AdaptiveAudioItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aaoq.a());
        hashSet.addAll(aaoq.t());
        hashSet.addAll(aaoq.x());
        return Collections.unmodifiableSet(hashSet);
    }
}
