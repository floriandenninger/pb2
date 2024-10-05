package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aanx extends zgd {
    public aanx() {
        super("Set<AacAdaptiveAudioItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Set) aaoq.bq.get());
        hashSet.addAll(aaoq.g());
        return Collections.unmodifiableSet(hashSet);
    }
}
