package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aani extends zgd {
    public aani() {
        super("Set<H264AdaptiveVideoItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aaoq.m());
        hashSet.addAll(aaoq.i());
        return Collections.unmodifiableSet(hashSet);
    }
}
