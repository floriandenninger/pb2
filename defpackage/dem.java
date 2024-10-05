package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dem implements deb {
    private deg c;
    private long d;
    final List b = new LinkedList();
    ByteBuffer a = ByteBuffer.wrap(new byte[0]);

    @Override // defpackage.deb
    public final long a() {
        return this.d;
    }

    @Override // defpackage.deb
    public final long b() {
        Iterator it = this.b.iterator();
        long j = 8;
        while (it.hasNext()) {
            j += ((deb) it.next()).b();
        }
        return j + this.a.limit();
    }

    @Override // defpackage.deb
    public final deg c() {
        return this.c;
    }

    @Override // defpackage.deb
    public final String d() {
        return "free";
    }

    @Override // defpackage.deb
    public final void e(WritableByteChannel writableByteChannel) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((deb) it.next()).e(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        did.aa(allocate, this.a.limit() + 8);
        allocate.put("free".getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.a.rewind();
        writableByteChannel.write(this.a);
        this.a.rewind();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dem demVar = (dem) obj;
        return h() == null ? demVar.h() == null : h().equals(demVar.h());
    }

    @Override // defpackage.deb
    public final void f(axkv axkvVar, ByteBuffer byteBuffer, long j, ddx ddxVar) {
        this.d = axkvVar.b() - byteBuffer.remaining();
        if (j > 1048576) {
            this.a = axkvVar.e(axkvVar.b(), j);
            axkvVar.f(axkvVar.b() + j);
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(awxt.g(j));
            this.a = allocate;
            axkvVar.a(allocate);
        }
    }

    @Override // defpackage.deb
    public final void g(deg degVar) {
        this.c = degVar;
    }

    public final ByteBuffer h() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return (ByteBuffer) byteBuffer.duplicate().rewind();
        }
        return null;
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
