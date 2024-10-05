package defpackage;

import java.nio.ByteBuffer;
import org.tensorflow.lite.NativeInterpreterWrapper;
import org.tensorflow.lite.NativeInterpreterWrapperExperimental;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baoa implements AutoCloseable {
    public NativeInterpreterWrapper a;

    public baoa(ByteBuffer byteBuffer) {
        this.a = new NativeInterpreterWrapperExperimental(byteBuffer);
        c();
        NativeInterpreterWrapper.getSignatureKeys(this.a.b);
    }

    public final int a() {
        c();
        return this.a.c.length;
    }

    public final baob b(int i) {
        c();
        return this.a.a(i);
    }

    public final void c() {
        if (this.a == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.a = null;
        }
    }

    protected final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
