package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aylq implements ayip {
    public final ayoa e;
    public boolean f;
    public int g;
    public long i;
    public ayfb j;
    private final aylp k;
    public int a = -1;
    public ayac b = ayaa.a;
    public final aylo c = new aylo(this);
    public final ByteBuffer d = ByteBuffer.allocate(5);
    public int h = -1;

    public aylq(aylp aylpVar, ayoa ayoaVar) {
        this.k = aylpVar;
        this.e = ayoaVar;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        ayok ayokVar = (ayok) inputStream;
        aooy aooyVar = ayokVar.a;
        if (aooyVar != null) {
            int serializedSize = aooyVar.getSerializedSize();
            ayokVar.a.writeTo(outputStream);
            ayokVar.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = ayokVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a = (int) ayom.a(byteArrayInputStream, outputStream);
        ayokVar.c = null;
        return a;
    }

    public final void b(boolean z, boolean z2) {
        ayfb ayfbVar = this.j;
        this.j = null;
        this.k.w(ayfbVar, z, z2);
        this.g = 0;
    }

    public final void c(ayln aylnVar, boolean z) {
        Iterator it = aylnVar.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ayfb) it.next()).a();
        }
        this.d.put(z ? (byte) 1 : (byte) 0).putInt(i);
        ayfb a = ayeq.a(5);
        a.c(this.d.array(), 0, this.d.position());
        if (i == 0) {
            this.j = a;
            return;
        }
        this.k.w(a, false, false);
        this.g = 1;
        List list = aylnVar.a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            this.k.w((ayfb) list.get(i2), false, false);
        }
        this.j = (ayfb) list.get(list.size() - 1);
        this.i = i;
    }

    public final void d(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            ayfb ayfbVar = this.j;
            if (ayfbVar != null && ayfbVar.b() == 0) {
                b(false, false);
            }
            if (this.j == null) {
                this.j = ayeq.a(i2);
            }
            int min = Math.min(i2, this.j.b());
            this.j.c(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
