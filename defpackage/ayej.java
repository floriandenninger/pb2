package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayej extends ayek {
    private final aych b;
    private final aycd c;
    private final ayoa d;

    public ayej(aydz aydzVar, int i, aych aychVar, aycd aycdVar, ayoa ayoaVar) {
        super(aydzVar, i, ayoaVar);
        this.b = aychVar;
        this.c = aycdVar;
        this.d = ayoaVar;
    }

    @Override // defpackage.ayek
    protected final int a(Parcel parcel) {
        int length;
        int read;
        parcel.writeString(this.b.b);
        aycd aycdVar = this.c;
        int a = aybe.a(aycdVar);
        if (a == 0) {
            parcel.writeInt(0);
        } else {
            Object[] e = aybe.e(aycdVar);
            parcel.writeInt(a);
            for (int i = 0; i < a; i++) {
                int i2 = i + i;
                byte[] bArr = (byte[]) e[i2];
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                Object obj = e[i2 + 1];
                if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(bArr2);
                } else if (!(obj instanceof ayel)) {
                    byte[] b = ayeb.b();
                    try {
                        InputStream inputStream = (InputStream) obj;
                        int i3 = 0;
                        while (true) {
                            length = b.length;
                            if (i3 >= length || (read = inputStream.read(b, i3, length - i3)) == -1) {
                                break;
                            }
                            i3 += read;
                        }
                        if (i3 != length) {
                            parcel.writeInt(i3);
                            if (i3 > 0) {
                                parcel.writeByteArray(b, 0, i3);
                            }
                        } else {
                            throw Status.j.withDescription("Metadata value too large").asException();
                        }
                    } finally {
                        ayeb.a(b);
                    }
                } else {
                    parcel.writeInt(-1);
                    throw null;
                }
            }
        }
        this.d.c();
        aycg aycgVar = this.b.a;
        return (aycgVar == aycg.UNARY || aycgVar == aycg.CLIENT_STREAMING) ? 16 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ayaj ayajVar) {
        this.c.d(ayiu.a);
        this.c.f(ayiu.a, Long.valueOf(Math.max(0L, ayajVar.b(TimeUnit.NANOSECONDS))));
    }
}
