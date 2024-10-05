package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axle implements deb {
    List a;
    List b = new ArrayList();
    deg c;
    long d;

    public axle(axlf axlfVar, axkz axkzVar, Map map, long j) {
        this.d = j;
        this.a = axkzVar.d;
        for (int i = 0; i < ((int[]) map.values().iterator().next()).length; i++) {
            for (axlc axlcVar : this.a) {
                int[] iArr = (int[]) map.get(axlcVar);
                long j2 = 0;
                for (int i2 = 0; i2 < i; i2++) {
                    j2 += iArr[i2];
                }
                this.b.add(((List) axlfVar.c.get(axlcVar)).subList(awxt.g(j2), awxt.g(j2 + iArr[i])));
            }
        }
    }

    private static final boolean h(long j) {
        return j + 8 < 4294967296L;
    }

    @Override // defpackage.deb
    public final long a() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    @Override // defpackage.deb
    public final long b() {
        return this.d + 16;
    }

    @Override // defpackage.deb
    public final deg c() {
        return this.c;
    }

    @Override // defpackage.deb
    public final String d() {
        return "mdat";
    }

    @Override // defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        long b = b();
        if (h(b)) {
            did.aa(allocate, b);
        } else {
            did.aa(allocate, 1L);
        }
        allocate.put(ddz.b("mdat"));
        if (!h(b)) {
            allocate.putLong(b);
        } else {
            allocate.put(new byte[8]);
        }
        allocate.rewind();
        writableByteChannel.write(allocate);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((axlb) it2.next()).b(writableByteChannel);
            }
        }
    }

    @Override // defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
    }

    @Override // defpackage.deb
    public final void g(deg degVar) {
        this.c = degVar;
    }
}
