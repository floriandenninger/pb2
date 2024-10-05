package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaoe extends zgd {
    public aaoe() {
        super("Set<UltralowLqAudioItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.T));
        hashSet.add(Integer.valueOf(aaoq.aR));
        return Collections.unmodifiableSet(hashSet);
    }
}
