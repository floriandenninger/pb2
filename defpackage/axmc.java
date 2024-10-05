package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
@axmb(b = {3})
/* loaded from: classes2.dex */
public final class axmc extends axlx {
    private static final Logger m = Logger.getLogger(axmc.class.getName());
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String g;
    public int h;
    public int i;
    public axlz j;
    public axmi k;
    public int f = 0;
    public final List l = new ArrayList();

    @Override // defpackage.axlx
    public final void a(ByteBuffer byteBuffer) {
        axmc axmcVar = this;
        axmcVar.a = did.ah(byteBuffer);
        int aj = did.aj(byteBuffer);
        int i = aj >>> 7;
        axmcVar.b = i;
        axmcVar.c = (aj >>> 6) & 1;
        axmcVar.d = (aj >>> 5) & 1;
        axmcVar.e = aj & 31;
        if (i == 1) {
            axmcVar.h = did.ah(byteBuffer);
        }
        if (axmcVar.c == 1) {
            int aj2 = did.aj(byteBuffer);
            axmcVar.f = aj2;
            axmcVar.g = did.ao(byteBuffer, aj2);
        }
        if (axmcVar.d == 1) {
            axmcVar.i = did.ah(byteBuffer);
        }
        int i2 = axmcVar.V + 4 + (1 != axmcVar.b ? 0 : 2) + (axmcVar.c == 1 ? axmcVar.f + 1 : 0) + (1 == axmcVar.d ? 2 : 0);
        int position = byteBuffer.position();
        if (c() > i2 + 2) {
            axlx a = axmg.a(-1, byteBuffer);
            long position2 = byteBuffer.position() - position;
            Logger logger = m;
            Level level = Level.FINER;
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(a != null ? Integer.valueOf(a.c()) : null);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" - ESDescriptor1 read: ");
            sb.append(position2);
            sb.append(", size: ");
            sb.append(valueOf2);
            logger.logp(level, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb.toString());
            if (a != null) {
                int c = a.c();
                byteBuffer.position(position + c);
                i2 += c;
            } else {
                i2 = (int) (i2 + position2);
            }
            if (a instanceof axlz) {
                axmcVar.j = (axlz) a;
            }
        }
        int position3 = byteBuffer.position();
        if (c() > i2 + 2) {
            axlx a2 = axmg.a(-1, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = m;
            Level level2 = Level.FINER;
            String valueOf3 = String.valueOf(a2);
            String valueOf4 = String.valueOf(a2 != null ? Integer.valueOf(a2.c()) : null);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 51 + String.valueOf(valueOf4).length());
            sb2.append(valueOf3);
            sb2.append(" - ESDescriptor2 read: ");
            sb2.append(position4);
            sb2.append(", size: ");
            sb2.append(valueOf4);
            logger2.logp(level2, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb2.toString());
            if (a2 != null) {
                int c2 = a2.c();
                byteBuffer.position(position3 + c2);
                i2 += c2;
            } else {
                i2 = (int) (i2 + position4);
            }
            if (a2 instanceof axmi) {
                axmcVar = this;
                axmcVar.k = (axmi) a2;
            } else {
                axmcVar = this;
            }
        } else {
            m.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", "SLConfigDescriptor is missing!");
        }
        while (c() - i2 > 2) {
            int position5 = byteBuffer.position();
            axlx a3 = axmg.a(-1, byteBuffer);
            long position6 = byteBuffer.position() - position5;
            Logger logger3 = m;
            Level level3 = Level.FINER;
            String valueOf5 = String.valueOf(a3);
            String valueOf6 = String.valueOf(a3 != null ? Integer.valueOf(a3.c()) : null);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 51 + String.valueOf(valueOf6).length());
            sb3.append(valueOf5);
            sb3.append(" - ESDescriptor3 read: ");
            sb3.append(position6);
            sb3.append(", size: ");
            sb3.append(valueOf6);
            logger3.logp(level3, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb3.toString());
            if (a3 != null) {
                int c3 = a3.c();
                byteBuffer.position(position5 + c3);
                i2 += c3;
            } else {
                i2 = (int) (i2 + position6);
            }
            axmcVar.l.add(a3);
        }
    }

    public final int b() {
        int i = 1 != this.b ? 5 : 7;
        if (this.c > 0) {
            i += this.f + 1;
        }
        if (this.d > 0) {
            i += 2;
        }
        return i + this.j.b() + 3;
    }

    public final ByteBuffer d() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        did.ab(allocate, 3);
        did.ab(allocate, b() - 2);
        did.Y(allocate, this.a);
        did.ab(allocate, (this.b << 7) | (this.c << 6) | (this.d << 5) | this.e);
        if (this.b > 0) {
            did.Y(allocate, this.h);
        }
        if (this.c > 0) {
            did.ab(allocate, this.f);
            allocate.put(did.U(this.g));
            did.ab(allocate, 0);
        }
        if (this.d > 0) {
            did.Y(allocate, this.i);
        }
        axlz axlzVar = this.j;
        ByteBuffer allocate2 = ByteBuffer.allocate(axlzVar.b());
        did.ab(allocate2, 4);
        did.ab(allocate2, axlzVar.b() - 2);
        did.ab(allocate2, axlzVar.a);
        int i = axlzVar.b;
        int i2 = axlzVar.c;
        did.ab(allocate2, (i << 2) | (i2 + i2) | 1);
        did.Z(allocate2, axlzVar.d);
        did.aa(allocate2, axlzVar.e);
        did.aa(allocate2, axlzVar.f);
        axlw axlwVar = axlzVar.h;
        if (axlwVar != null) {
            axlwVar.b();
            ByteBuffer allocate3 = ByteBuffer.allocate(4);
            did.ab(allocate3, 5);
            axlwVar.b();
            did.ab(allocate3, 2);
            axly axlyVar = new axly(allocate3);
            axlyVar.a(axlwVar.d, 5);
            axlyVar.a(axlwVar.e, 4);
            if (axlwVar.e == 15) {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
            axlyVar.a(axlwVar.g, 4);
            allocate2.put(allocate3.array());
        }
        axmi axmiVar = this.k;
        ByteBuffer allocate4 = ByteBuffer.allocate(3);
        did.ab(allocate4, 6);
        did.ab(allocate4, 1);
        did.ab(allocate4, axmiVar.a);
        allocate.put(allocate2.array());
        allocate.put(allocate4.array());
        return allocate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axmc axmcVar = (axmc) obj;
            if (this.c != axmcVar.c || this.f != axmcVar.f || this.h != axmcVar.h || this.a != axmcVar.a || this.i != axmcVar.i || this.d != axmcVar.d || this.b != axmcVar.b || this.e != axmcVar.e) {
                return false;
            }
            String str = this.g;
            if (str == null ? axmcVar.g != null : !str.equals(axmcVar.g)) {
                return false;
            }
            axlz axlzVar = this.j;
            if (axlzVar == null ? axmcVar.j != null : !axlzVar.equals(axmcVar.j)) {
                return false;
            }
            if (this.l.equals(axmcVar.l)) {
                axmi axmiVar = this.k;
                return axmiVar == null ? axmcVar.k == null : axmiVar.equals(axmcVar.k);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31;
        String str = this.g;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 961) + this.h) * 31) + this.i) * 31;
        axlz axlzVar = this.j;
        int hashCode2 = (hashCode + (axlzVar != null ? axlzVar.hashCode() : 0)) * 31;
        axmi axmiVar = this.k;
        return ((hashCode2 + (axmiVar != null ? axmiVar.a : 0)) * 31) + this.l.hashCode();
    }

    @Override // defpackage.axlx
    public final String toString() {
        return "ESDescriptor{esId=" + this.a + ", streamDependenceFlag=" + this.b + ", URLFlag=" + this.c + ", oCRstreamFlag=" + this.d + ", streamPriority=" + this.e + ", URLLength=" + this.f + ", URLString='" + this.g + "', remoteODFlag=0, dependsOnEsId=" + this.h + ", oCREsId=" + this.i + ", decoderConfigDescriptor=" + this.j + ", slConfigDescriptor=" + this.k + '}';
    }
}
