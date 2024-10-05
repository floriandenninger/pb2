package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aano extends zgd {
    public aano() {
        super("Set<UltralowQualityAdaptiveAudioItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.aR));
        hashSet.add(Integer.valueOf(aaoq.T));
        return Collections.unmodifiableSet(hashSet);
    }
}
