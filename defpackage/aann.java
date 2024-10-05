package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aann extends zgd {
    public aann() {
        super("Set<CencAdaptiveAudioItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.bl));
        hashSet.add(Integer.valueOf(aaoq.bm));
        return Collections.unmodifiableSet(hashSet);
    }
}
