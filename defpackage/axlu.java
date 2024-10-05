package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axlu extends axks {
    private static final Logger c = Logger.getLogger(axlu.class.getName());
    public axlx a;
    public ByteBuffer b;

    public axlu() {
        super("esds");
    }

    @Override // defpackage.axkq
    protected final long h() {
        return this.b.limit() + 4;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.b = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.b.rewind();
            this.a = axmg.a(-1, this.b);
        } catch (IOException e) {
            c.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "_parseDetails", "Error parsing ObjectDescriptor", (Throwable) e);
        } catch (IndexOutOfBoundsException e2) {
            c.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "_parseDetails", "Error parsing ObjectDescriptor", (Throwable) e2);
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.b.rewind();
        byteBuffer.put(this.b);
    }
}
