package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aanl extends zgd {
    public aanl() {
        super("Set<ClearAacAdaptiveAudioItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.aR));
        hashSet.add(Integer.valueOf(aaoq.aS));
        hashSet.add(Integer.valueOf(aaoq.aT));
        hashSet.add(Integer.valueOf(aaoq.aU));
        return Collections.unmodifiableSet(hashSet);
    }
}
