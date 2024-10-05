package defpackage;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfl extends axks {
    static final Map a = new WeakHashMap();
    public List b;

    public dfl() {
        super("stts");
        this.b = Collections.emptyList();
    }

    public static synchronized long[] k(List list) {
        long[] jArr;
        synchronized (dfl.class) {
            SoftReference softReference = (SoftReference) a.get(list);
            if (softReference != null && (jArr = (long[]) softReference.get()) != null) {
                return jArr;
            }
            Iterator it = list.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((dfk) it.next()).a;
            }
            long[] jArr2 = new long[(int) j];
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                dfk dfkVar = (dfk) it2.next();
                int i2 = 0;
                while (i2 < dfkVar.a) {
                    jArr2[i] = dfkVar.b;
                    i2++;
                    i++;
                }
            }
            a.put(list, new SoftReference(jArr2));
            return jArr2;
        }
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (this.b.size() * 8) + 8;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int g = awxt.g(did.ak(byteBuffer));
        this.b = new ArrayList(g);
        for (int i = 0; i < g; i++) {
            this.b.add(new dfk(did.ak(byteBuffer), did.ak(byteBuffer)));
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.b.size());
        for (dfk dfkVar : this.b) {
            did.aa(byteBuffer, dfkVar.a);
            did.aa(byteBuffer, dfkVar.b);
        }
    }

    public final String toString() {
        int size = this.b.size();
        StringBuilder sb = new StringBuilder(39);
        sb.append("TimeToSampleBox[entryCount=");
        sb.append(size);
        sb.append("]");
        return sb.toString();
    }
}
