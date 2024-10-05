package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyk implements Iterable {
    public final TreeMap a = new TreeMap();
    private final VideoMetaData b;

    public vyk(VideoMetaData videoMetaData) {
        videoMetaData.getClass();
        this.b = videoMetaData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if ((r6.b.l(((java.lang.Integer) r1.getKey()).intValue()) - r7) > (r7 - r6.b.l(((java.lang.Integer) r0.getKey()).intValue()))) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        r7 = r1.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        return (defpackage.vya) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        r7 = r0.getValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vya a(long r7, boolean r9) {
        /*
            r6 = this;
            com.google.android.libraries.video.media.VideoMetaData r0 = r6.b
            int r0 = r0.g(r7)
            java.util.TreeMap r1 = r6.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.util.Map$Entry r1 = r1.ceilingEntry(r2)
        L10:
            r2 = 2
            if (r9 == 0) goto L2e
            if (r1 == 0) goto L2e
            java.lang.Object r3 = r1.getValue()
            vya r3 = (defpackage.vya) r3
            int r3 = r3.f()
            if (r3 == r2) goto L2e
            java.util.TreeMap r2 = r6.a
            java.lang.Object r1 = r1.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Map$Entry r1 = r2.higherEntry(r1)
            goto L10
        L2e:
            java.util.TreeMap r3 = r6.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Map$Entry r0 = r3.floorEntry(r0)
        L38:
            if (r9 == 0) goto L55
            if (r0 == 0) goto L55
            java.lang.Object r3 = r0.getValue()
            vya r3 = (defpackage.vya) r3
            int r3 = r3.f()
            if (r3 == r2) goto L55
            java.util.TreeMap r3 = r6.a
            java.lang.Object r0 = r0.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.util.Map$Entry r0 = r3.lowerEntry(r0)
            goto L38
        L55:
            if (r1 == 0) goto L8b
            if (r0 == 0) goto L8b
            com.google.android.libraries.video.media.VideoMetaData r9 = r6.b
            java.lang.Object r2 = r1.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = r9.l(r2)
            long r2 = r2 - r7
            com.google.android.libraries.video.media.VideoMetaData r9 = r6.b
            java.lang.Object r4 = r0.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r4 = r9.l(r4)
            long r7 = r7 - r4
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 > 0) goto L84
            java.lang.Object r7 = r1.getValue()
            goto L88
        L84:
            java.lang.Object r7 = r0.getValue()
        L88:
            vya r7 = (defpackage.vya) r7
            return r7
        L8b:
            if (r1 == 0) goto L94
            java.lang.Object r7 = r1.getValue()
            vya r7 = (defpackage.vya) r7
            return r7
        L94:
            if (r0 == 0) goto L9d
            java.lang.Object r7 = r0.getValue()
            vya r7 = (defpackage.vya) r7
            return r7
        L9d:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyk.a(long, boolean):vya");
    }

    public final vya b(int i) {
        return (vya) this.a.get(Integer.valueOf(i));
    }

    public final vya c(vya vyaVar) {
        return (vya) this.a.put(Integer.valueOf(vyaVar.a), vyaVar);
    }

    public final void d() {
        this.a.clear();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.values().iterator();
    }
}
