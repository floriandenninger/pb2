package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vvj {
    protected final DataInputStream a;
    protected final long b;
    protected long c;
    protected vvj d;
    protected vvj e;
    protected boolean f;

    private vvj(DataInputStream dataInputStream, long j, vvj vvjVar) {
        this.c = 0L;
        this.d = null;
        this.e = null;
        this.f = false;
        amkq.E(j >= 0);
        this.a = dataInputStream;
        this.b = j;
        this.d = vvjVar;
    }

    public final int a() {
        h(4L);
        int readInt = this.a.readInt();
        i(4L);
        return readInt;
    }

    public final long b() {
        return this.b - this.c;
    }

    public final long c() {
        amkq.N(this.e == null);
        amkq.N(!this.f);
        long j = this.c;
        for (vvj vvjVar = this.d; vvjVar != null; vvjVar = vvjVar.d) {
            j += vvjVar.c;
        }
        return j;
    }

    public final long d() {
        return a() & 4294967295L;
    }

    public final long e() {
        h(8L);
        long readLong = this.a.readLong();
        if (readLong < 0) {
            throw new vvu("Uint64 values larger than int64 are not supported.");
        }
        i(8L);
        return readLong;
    }

    public final vvj f(long j) {
        amkq.N(!this.f);
        amkq.N(this.e == null);
        amkq.E(j >= 0);
        if (j > b()) {
            throw new vvu("Cannot create a reader with a readLimit that exceeds its parent.");
        }
        vvj vvjVar = new vvj(this.a, j, this);
        this.e = vvjVar;
        return vvjVar;
    }

    public final String g() {
        h(4L);
        byte[] bArr = new byte[4];
        long read = this.a.read(bArr);
        i(read);
        if (read == 4) {
            return new String(bArr, 0, 4, amme.b);
        }
        throw new vvu("Did not consumed the expected number of bytes");
    }

    public final void h(long j) {
        amkq.N(this.e == null);
        amkq.N(!this.f);
        if (j > b()) {
            throw new vvu("Attempt to read past the end of the box.");
        }
    }

    public final void i(long j) {
        this.c += j;
    }

    public final void j(vvj vvjVar) {
        vvjVar.getClass();
        amkq.E(this.e == vvjVar);
        amkq.E(vvjVar.d == this);
        amkq.N(!vvjVar.f);
        this.c += this.e.c;
        vvjVar.d = null;
        vvjVar.f = true;
        this.e = null;
    }

    public final void k(long j) {
        h(j);
        anbt.b(this.a, j);
        i(j);
    }

    public final byte[] l(int i) {
        long j = i;
        h(j);
        byte[] bArr = new byte[i];
        anbt.a(this.a, bArr);
        i(j);
        return bArr;
    }

    public final void m() {
        h(2L);
        this.a.readShort();
        i(2L);
    }

    public vvj(InputStream inputStream, long j) {
        this(new DataInputStream(inputStream), j, null);
    }
}
