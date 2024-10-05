package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaoi extends zgd {
    public aaoi() {
        super("Set<EncUhdItags>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aaoq.aw));
        hashSet.add(Integer.valueOf(aaoq.ax));
        hashSet.add(Integer.valueOf(aaoq.ay));
        hashSet.add(Integer.valueOf(aaoq.az));
        return Collections.unmodifiableSet(hashSet);
    }
}
