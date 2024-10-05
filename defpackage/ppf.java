package defpackage;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppf {
    private final ByteArrayOutputStream a;
    private final DataOutputStream b;

    public ppf() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(EventMessage eventMessage) {
        this.a.reset();
        try {
            b(this.b, eventMessage.a);
            String str = eventMessage.b;
            if (str == null) {
                str = "";
            }
            b(this.b, str);
            this.b.writeLong(eventMessage.c);
            this.b.writeLong(eventMessage.d);
            this.b.write(eventMessage.e);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
