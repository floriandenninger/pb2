package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axml {
    public abstract String a();

    public abstract ByteBuffer b();

    public abstract void c(ByteBuffer byteBuffer);

    public int d() {
        return b().limit();
    }
}
