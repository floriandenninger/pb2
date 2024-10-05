package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axls extends axks {
    protected int a;
    protected int b;
    public byte[] c;
    public List d;

    public axls() {
        super("senc");
        this.a = -1;
        this.b = -1;
        this.c = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.d = Collections.emptyList();
    }

    private final List l(ByteBuffer byteBuffer, long j, int i) {
        axnw axnuVar;
        ArrayList arrayList = new ArrayList();
        long j2 = j;
        while (true) {
            long j3 = (-1) + j2;
            if (j2 <= 0) {
                return arrayList;
            }
            try {
                axob axobVar = new axob();
                axobVar.a = new byte[i];
                byteBuffer.get(axobVar.a);
                if ((r() & 2) > 0) {
                    axobVar.b = new axnw[did.ah(byteBuffer)];
                    int i2 = 0;
                    while (true) {
                        axnw[] axnwVarArr = axobVar.b;
                        if (i2 >= axnwVarArr.length) {
                            break;
                        }
                        int ah = did.ah(byteBuffer);
                        long ak = did.ak(byteBuffer);
                        if (ah <= 127) {
                            if (ak <= 127) {
                                axnuVar = new axno(ah, ak);
                            } else if (ak <= 32767) {
                                axnuVar = new axnr(ah, ak);
                            } else if (ak <= 2147483647L) {
                                axnuVar = new axnp(ah, ak);
                            } else {
                                axnuVar = new axnq(ah, ak);
                            }
                        } else if (ah <= 32767) {
                            if (ak <= 127) {
                                axnuVar = new axnx(ah, ak);
                            } else if (ak <= 32767) {
                                axnuVar = new axoa(ah, ak);
                            } else if (ak <= 2147483647L) {
                                axnuVar = new axny(ah, ak);
                            } else {
                                axnuVar = new axnz(ah, ak);
                            }
                        } else if (ak <= 127) {
                            axnuVar = new axns(ah, ak);
                        } else if (ak <= 32767) {
                            axnuVar = new axnv(ah, ak);
                        } else if (ak <= 2147483647L) {
                            axnuVar = new axnt(ah, ak);
                        } else {
                            axnuVar = new axnu(ah, ak);
                        }
                        axnwVarArr[i2] = axnuVar;
                        i2++;
                    }
                }
                arrayList.add(axobVar);
                j2 = j3;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axls axlsVar = (axls) obj;
        if (this.a != axlsVar.a || this.b != axlsVar.b) {
            return false;
        }
        List list = this.d;
        if (list == null ? axlsVar.d == null : list.equals(axlsVar.d)) {
            return Arrays.equals(this.c, axlsVar.c);
        }
        return false;
    }

    @Override // defpackage.axkq
    protected final long h() {
        long j;
        if (k()) {
            int length = this.c.length;
            j = 24;
        } else {
            j = 4;
        }
        long j2 = j + 4;
        while (this.d.iterator().hasNext()) {
            j2 += ((axob) r0.next()).a();
        }
        return j2;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        byte[] bArr = this.c;
        int hashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List list = this.d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if ((r() & 1) > 0) {
            this.a = did.ai(byteBuffer);
            this.b = did.aj(byteBuffer);
            byte[] bArr = new byte[16];
            this.c = bArr;
            byteBuffer.get(bArr);
        }
        long ak = did.ak(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        List l = l(duplicate, ak, 8);
        this.d = l;
        if (l == null) {
            this.d = l(duplicate2, ak, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate.remaining());
        }
        if (this.d == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (k()) {
            did.Z(byteBuffer, this.a);
            did.ab(byteBuffer, this.b);
            byteBuffer.put(this.c);
        }
        did.aa(byteBuffer, this.d.size());
        for (axob axobVar : this.d) {
            if (axobVar.a() > 0) {
                byte[] bArr = axobVar.a;
                int length = bArr.length;
                if (length == 8 || length == 16) {
                    byteBuffer.put(bArr);
                    if ((r() & 2) > 0) {
                        did.Y(byteBuffer, axobVar.b.length);
                        for (axnw axnwVar : axobVar.b) {
                            did.Y(byteBuffer, axnwVar.a());
                            did.aa(byteBuffer, axnwVar.b());
                        }
                    }
                } else {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
            }
        }
    }

    public final boolean k() {
        return (r() & 1) > 0;
    }
}
