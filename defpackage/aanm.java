package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aanm extends zgd {
    public aanm() {
        super("Set<CencAacAdaptiveAudioItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.bl));
        hashSet.add(Integer.valueOf(aaoq.bm));
        return Collections.unmodifiableSet(hashSet);
    }
}
