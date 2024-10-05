package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aanv extends zgd {
    public aanv() {
        super("Set<OpusAdaptiveAudioItagsWithOpusMed>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.T));
        hashSet.add(Integer.valueOf(aaoq.U));
        hashSet.add(Integer.valueOf(aaoq.W));
        return Collections.unmodifiableSet(hashSet);
    }
}
