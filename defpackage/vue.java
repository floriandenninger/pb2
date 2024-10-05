package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vue {
    public final OutputStream a;
    public final ByteArrayOutputStream b;
    public Exception c;
    public final Date d;
    public final vxe e;

    public vue(OutputStream outputStream, Date date, vxe vxeVar) {
        this.e = vxeVar;
        outputStream.getClass();
        this.a = outputStream;
        this.d = date;
        this.b = new ByteArrayOutputStream();
    }

    public static long a(long j, int i, int i2) {
        return (j << i) | (((-1) >>> (64 - i)) & i2);
    }
}
