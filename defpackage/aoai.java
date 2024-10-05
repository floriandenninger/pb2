package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoai extends aoah {
    public static final aoai a = new aoai();

    @Override // defpackage.aoah
    public final ByteBuffer a(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }
}
