package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aanu extends zgd {
    public aanu() {
        super("Set<OpusAdaptiveAudioItagsWithOpusMed>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.T));
        hashSet.add(Integer.valueOf(aaoq.V));
        hashSet.add(Integer.valueOf(aaoq.W));
        return Collections.unmodifiableSet(hashSet);
    }
}
