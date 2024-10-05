package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aoan {
    public static aoan a;

    public static aoan d() {
        if (a == null) {
            a = new aoap();
        }
        return a;
    }

    public abstract int a(CharSequence charSequence);

    public abstract String b(ByteBuffer byteBuffer, int i, int i2);

    public abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);
}
