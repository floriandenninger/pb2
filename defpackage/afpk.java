package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afpk extends LruCache {
    public afpk(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((cnc) obj2).a.length;
    }
}
