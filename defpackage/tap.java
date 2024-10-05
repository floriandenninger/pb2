package defpackage;

import j$.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tap extends aoan {
    private final syd d;
    private static final aoan c = new aoap();
    private static final Charset b = StandardCharsets.UTF_8;

    public tap(syd sydVar) {
        this.d = sydVar;
    }

    @Override // defpackage.aoan
    public final int a(CharSequence charSequence) {
        try {
            return aoap.e(charSequence);
        } catch (IllegalArgumentException e) {
            this.d.d(22, "Failed to encode UTF-8 string length", e);
            return 0;
        }
    }

    @Override // defpackage.aoan
    public final String b(ByteBuffer byteBuffer, int i, int i2) {
        try {
            if (byteBuffer.hasArray()) {
                return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2, b);
            }
            return c.b(byteBuffer, i, i2);
        } catch (IllegalArgumentException e) {
            this.d.d(22, "Failed to decode UTF-8 string", e);
            return "";
        }
    }

    @Override // defpackage.aoan
    public final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        try {
            c.c(charSequence, byteBuffer);
        } catch (IllegalArgumentException e) {
            this.d.d(22, "Failed to encode UTF-8 string", e);
        }
    }
}
