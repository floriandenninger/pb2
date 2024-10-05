package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahd implements bahy {
    final /* synthetic */ boolean a;
    final /* synthetic */ bahe b;
    private final /* synthetic */ int c;

    public bahd(bahe baheVar, boolean z, int i) {
        this.c = i;
        this.b = baheVar;
        this.a = z;
    }

    @Override // defpackage.bahy
    public final void a() {
        if (this.c == 0) {
            bahe baheVar = this.b;
            baheVar.d = baheVar.b.getLength();
            bahe baheVar2 = this.b;
            long j = baheVar2.d;
            if (j == 0) {
                baheVar2.e();
                return;
            }
            if (j <= 0 || j >= 8192) {
                baheVar2.c = ByteBuffer.allocateDirect(8192);
            } else {
                baheVar2.c = ByteBuffer.allocateDirect(((int) j) + 1);
            }
            bahe baheVar3 = this.b;
            long j2 = baheVar3.d;
            if (j2 > 0 && j2 <= 2147483647L) {
                baheVar3.f.setFixedLengthStreamingMode((int) j2);
            } else if (j2 <= 2147483647L) {
                baheVar3.f.setChunkedStreamingMode(8192);
            } else {
                baheVar3.f.setFixedLengthStreamingMode(j2);
            }
            if (this.a) {
                this.b.b();
                return;
            }
            this.b.a.set(1);
            bahe baheVar4 = this.b;
            baheVar4.b.rewind(baheVar4);
            return;
        }
        this.b.c.flip();
        bahe baheVar5 = this.b;
        long j3 = baheVar5.d;
        if (j3 == -1 || j3 - baheVar5.e >= baheVar5.c.remaining()) {
            bahe baheVar6 = this.b;
            ByteBuffer byteBuffer = baheVar6.c;
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                i += baheVar6.g.write(byteBuffer);
            }
            baheVar6.h.flush();
            baheVar6.e += i;
            bahe baheVar7 = this.b;
            long j4 = baheVar7.e;
            long j5 = baheVar7.d;
            if (j4 < j5 || (j5 == -1 && !this.a)) {
                baheVar7.c.clear();
                this.b.a.set(0);
                this.b.a(new baha(this, null));
                return;
            } else if (j5 == -1) {
                baheVar7.e();
                return;
            } else if (j5 == j4) {
                baheVar7.e();
                return;
            } else {
                baheVar7.f(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.b.e), Long.valueOf(this.b.d))));
                return;
            }
        }
        this.b.f(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.b.e + r6.c.remaining()), Long.valueOf(this.b.d))));
    }
}
