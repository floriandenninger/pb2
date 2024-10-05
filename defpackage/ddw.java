package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddw implements ddx {
    private static final Logger b = Logger.getLogger(ddw.class.getName());
    final ThreadLocal a = new ddv();

    @Override // defpackage.ddx
    public final deb a(axkv axkvVar, deg degVar) {
        int a;
        long c;
        long b2 = axkvVar.b();
        ((ByteBuffer) this.a.get()).rewind().limit(8);
        do {
            a = axkvVar.a((ByteBuffer) this.a.get());
            if (a == 8) {
                ((ByteBuffer) this.a.get()).rewind();
                long ak = did.ak((ByteBuffer) this.a.get());
                byte[] bArr = null;
                if (ak >= 8 || ak <= 1) {
                    String am = did.am((ByteBuffer) this.a.get());
                    if (ak == 1) {
                        ((ByteBuffer) this.a.get()).limit(16);
                        axkvVar.a((ByteBuffer) this.a.get());
                        ((ByteBuffer) this.a.get()).position(8);
                        c = did.al((ByteBuffer) this.a.get()) - 16;
                    } else {
                        c = ak == 0 ? axkvVar.c() - axkvVar.b() : ak - 8;
                    }
                    if ("uuid".equals(am)) {
                        ((ByteBuffer) this.a.get()).limit(((ByteBuffer) this.a.get()).limit() + 16);
                        axkvVar.a((ByteBuffer) this.a.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.a.get()).position() - 16; position < ((ByteBuffer) this.a.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.a.get()).position() - 16)] = ((ByteBuffer) this.a.get()).get(position);
                        }
                        c -= 16;
                    }
                    long j = c;
                    if (degVar instanceof deb) {
                        ((deb) degVar).d();
                    }
                    deb b3 = b(am, bArr);
                    b3.g(degVar);
                    ((ByteBuffer) this.a.get()).rewind();
                    b3.f(axkvVar, (ByteBuffer) this.a.get(), j, this);
                    return b3;
                }
                Logger logger = b;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(ak);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (a >= 0);
        axkvVar.f(b2);
        throw new EOFException();
    }

    public abstract deb b(String str, byte[] bArr);
}
