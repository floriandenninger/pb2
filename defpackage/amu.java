package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amu extends InputStream implements DataInput {
    private static final ByteOrder d = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder e = ByteOrder.BIG_ENDIAN;
    final DataInputStream a;
    public ByteOrder b;
    int c;
    private byte[] f;

    public amu(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public final long a() {
        return readInt() & 4294967295L;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    public final void b(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int skip = (int) this.a.skip(i3);
            if (skip <= 0) {
                if (this.f == null) {
                    this.f = new byte[8192];
                }
                skip = this.a.read(this.f, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                }
            }
            i2 += skip;
        }
        this.c += i2;
    }

    public final void c(long j) {
        long j2 = this.c;
        if (j2 > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= j2;
        }
        b((int) j);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.c++;
        return this.a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.c++;
        return this.a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.c++;
        int read = this.a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.c += 2;
        return this.a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.c += bArr.length;
        this.a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.c += 4;
        int read = this.a.read();
        int read2 = this.a.read();
        int read3 = this.a.read();
        int read4 = this.a.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == d) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == e) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.c += 8;
        int read = this.a.read();
        int read2 = this.a.read();
        int read3 = this.a.read();
        int read4 = this.a.read();
        int read5 = this.a.read();
        int read6 = this.a.read();
        int read7 = this.a.read();
        int read8 = this.a.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == d) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == e) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.c += 2;
        int read = this.a.read();
        int read2 = this.a.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == d) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == e) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.b);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.c += 2;
        return this.a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.c++;
        return this.a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.c += 2;
        int read = this.a.read();
        int read2 = this.a.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == d) {
                return (read2 << 8) + read;
            }
            if (byteOrder == e) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public amu(InputStream inputStream, ByteOrder byteOrder) {
        this.b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.a = dataInputStream;
        dataInputStream.mark(0);
        this.c = 0;
        this.b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        this.c += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.c += i2;
        this.a.readFully(bArr, i, i2);
    }

    public amu(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public amu(InputStream inputStream, byte[] bArr) {
        this(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.a.mark(Integer.MAX_VALUE);
    }

    public amu(byte[] bArr, byte[] bArr2) {
        this(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }
}
