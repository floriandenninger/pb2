package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qim extends LruCache {
    final /* synthetic */ qio a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qim(qio qioVar) {
        super(20);
        this.a = qioVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            this.a.g.add(num);
        }
    }
}
