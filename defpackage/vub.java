package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vub {
    public vua a;
    private final ByteArrayOutputStream b;
    private final DataOutputStream c;
    private final List d;
    private final vty e;
    private long f;
    private final vtz g;
    private final long h;
    private final int i;

    public vub(vty vtyVar, long j, vtz vtzVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.b = byteArrayOutputStream;
        this.c = new DataOutputStream(byteArrayOutputStream);
        this.d = new ArrayList();
        this.a = vua.NOT_STARTED;
        this.f = Long.MAX_VALUE;
        vcp.c(true, "Invalid samplesPerSec (%s)", 48000);
        this.i = vlu.b(2);
        this.e = vtyVar;
        long j2 = (j * 7056000) / 1000000;
        this.h = j2;
        this.f = j2;
        this.g = vtzVar;
    }

    static float a(vuc vucVar, long j) {
        return 1.0f - Math.min(1.0f, Math.max(0.0f, ((float) (j - (vucVar.c - 705600))) / 705600.0f));
    }

    private static final short d(float f) {
        return (short) Math.round(Math.max(-32768.0f, Math.min(32767.0f, f)));
    }

    public final vuc b(long j, float f, long j2) {
        vcp.f(this.a == vua.NOT_STARTED, "Invalid mixer status (%s)", this.a);
        vuc vucVar = new vuc(this, f, j2);
        vucVar.c((j * 7056000) / 1000000);
        this.d.add(vucVar);
        return vucVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        while (true) {
            if (this.a != vua.FINISHED) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    vuc vucVar = (vuc) it.next();
                    if (vucVar.d) {
                        if (vucVar.a.d() < r2.a) {
                            it.remove();
                            int size = this.d.size();
                            StringBuilder sb = new StringBuilder(47);
                            sb.append("Removed finished source, ");
                            sb.append(size);
                            sb.append(" remaining.");
                            vtv.a(sb.toString());
                        }
                    }
                }
                if (this.f < 147) {
                    this.e.a();
                    vtz vtzVar = this.g;
                    if (vtzVar != null) {
                        vtzVar.a(1.0d);
                    }
                    this.a = vua.FINISHED;
                }
            }
            if (this.a != vua.STARTED) {
                break;
            }
            long min = Math.min(this.f, 602112L);
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                min = Math.min(min, ((vuc) it2.next()).a.d());
            }
            int i = (int) (min / 147);
            if (i <= 0) {
                break;
            }
            try {
                if (vlu.c(this.i)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        float f = 0.0f;
                        float f2 = 0.0f;
                        for (int i3 = 0; i3 < this.d.size(); i3++) {
                            vuc vucVar2 = (vuc) this.d.get(i3);
                            float a = a(vucVar2, (this.h - this.f) + (i2 * 147));
                            f += vucVar2.d(1) * a;
                            f2 += vucVar2.d(2) * a;
                            vucVar2.c(147L);
                        }
                        this.c.writeShort(d(f));
                        this.c.writeShort(d(f2));
                    }
                } else {
                    for (int i4 = 0; i4 < i; i4++) {
                        float f3 = 0.0f;
                        for (int i5 = 0; i5 < this.d.size(); i5++) {
                            vuc vucVar3 = (vuc) this.d.get(i5);
                            f3 += vucVar3.a.a() * vucVar3.b * a(vucVar3, (this.h - this.f) + (i4 * 147));
                            vucVar3.c(147L);
                        }
                        this.c.writeShort(d(f3));
                    }
                }
                long j = this.f - (i * 147);
                this.f = j;
                vtz vtzVar2 = this.g;
                if (vtzVar2 != null) {
                    double d = j;
                    double d2 = this.h;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    vtzVar2.a(1.0d - (d / d2));
                }
                try {
                    this.c.flush();
                } catch (IOException e) {
                    vtv.c("Exception while flushing mixed audio", e);
                }
                if (this.b.size() > 0) {
                    this.e.b(ByteBuffer.wrap(this.b.toByteArray()).asShortBuffer(), 48000, this.i);
                    this.b.reset();
                }
            } catch (IOException e2) {
                vtv.c("Exception while mixing audio", e2);
            }
        }
    }
}
