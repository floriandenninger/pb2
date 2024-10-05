package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aanq extends zgd {
    public aanq() {
        super("Set<LowQualityAdaptiveAudioItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.aS));
        hashSet.add(Integer.valueOf(aaoq.bl));
        hashSet.add(Integer.valueOf(aaoq.U));
        hashSet.add(Integer.valueOf(aaoq.V));
        return Collections.unmodifiableSet(hashSet);
    }
}
