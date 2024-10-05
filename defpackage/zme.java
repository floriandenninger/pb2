package defpackage;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ShortBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zme implements vty {
    public Uri a;
    public oxk b;
    public final oxj c = new zmc(this);
    public final ByteArrayOutputStream d;
    public DataOutputStream e;
    public zmd f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    private final int l;
    private final int m;

    public zme() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.d = byteArrayOutputStream;
        this.e = new DataOutputStream(byteArrayOutputStream);
        this.l = 250;
        this.m = 4;
    }

    private final long e(int i, int i2) {
        return (i * i2) / this.l;
    }

    @Override // defpackage.vty
    public final void a() {
    }

    @Override // defpackage.vty
    public final void b(ShortBuffer shortBuffer, int i, int i2) {
        amkq.E(i > 0);
        amkq.E(i2 > 0);
        amkq.E(shortBuffer.remaining() % i2 == 0);
        try {
            long e = e(this.j + 1, i);
            int position = shortBuffer.position();
            int i3 = this.i;
            while (true) {
                position += i3;
                if (position >= shortBuffer.limit()) {
                    break;
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    this.g = Math.max(this.g, Math.abs((int) shortBuffer.get(position + i4)));
                }
                this.h += this.m;
                while (this.h >= e) {
                    this.e.writeShort(Math.min(32767, this.g));
                    this.g = 0;
                    int i5 = this.j + 1;
                    this.j = i5;
                    e = e(i5 + 1, i);
                }
                i3 = this.m * i2;
            }
            this.i = position - shortBuffer.limit();
            zmd zmdVar = this.f;
            if (zmdVar != null) {
                ((zmb) zmdVar).d();
            }
            this.e.flush();
        } catch (IOException e2) {
            zga.d("Error writing to maxValueStream", e2);
        }
    }

    public final int c() {
        return this.d.size() / 2;
    }

    public final long d() {
        return 1000000 / this.l;
    }
}
