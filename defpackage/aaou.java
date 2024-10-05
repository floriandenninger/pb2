package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaou extends zgd {
    public aaou() {
        super("Set<SupportedVideoMimeTypes>");
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add("video/3gpp");
        hashSet.add("video/mp4");
        hashSet.add("video/webm");
        return Collections.unmodifiableSet(hashSet);
    }
}
