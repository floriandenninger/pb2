package defpackage;

import com.google.android.libraries.elements.interfaces.PbToFb;
import com.youtube.android.libraries.elements.StatusOr;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axod {
    public static final AtomicBoolean a;

    static {
        sgf.D();
        a = new AtomicBoolean(false);
    }

    public static int a(byte[] bArr, aoam aoamVar, boolean z, boolean z2) {
        StatusOr convert = PbToFb.convert(ByteBuffer.wrap(bArr), a.get(), z, z2);
        if (convert.hasValue) {
            aoam.aH(ByteBuffer.wrap((byte[]) convert.value), aoamVar);
            return convert.status.getCode().value();
        }
        String valueOf = String.valueOf(convert.status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("status: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
