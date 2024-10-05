package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
@axmb(b = {4})
/* loaded from: classes2.dex */
public final class axlz extends axlx {
    private static final Logger k = Logger.getLogger(axlz.class.getName());
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public axma g;
    public axlw h;
    public final List i = new ArrayList();
    byte[] j;

    @Override // defpackage.axlx
    public final void a(ByteBuffer byteBuffer) {
        int c;
        this.a = did.aj(byteBuffer);
        int aj = did.aj(byteBuffer);
        this.b = aj >>> 2;
        this.c = (aj >> 1) & 1;
        this.d = did.ai(byteBuffer);
        this.e = did.ak(byteBuffer);
        this.f = did.ak(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            axlx a = axmg.a(this.a, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = k;
            Level level = Level.FINER;
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(a != null ? Integer.valueOf(a.c()) : null);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" - DecoderConfigDescr1 read: ");
            sb.append(position2);
            sb.append(", size: ");
            sb.append(valueOf2);
            logger.logp(level, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor", "parseDetail", sb.toString());
            if (a != null && position2 < (c = a.c())) {
                byte[] bArr = new byte[c - position2];
                this.j = bArr;
                byteBuffer.get(bArr);
            }
            if (a instanceof axma) {
                this.g = (axma) a;
            }
            if (a instanceof axlw) {
                this.h = (axlw) a;
            }
        }
        while (byteBuffer.remaining() > 2) {
            int position3 = byteBuffer.position();
            axlx a2 = axmg.a(this.a, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = k;
            Level level2 = Level.FINER;
            String valueOf3 = String.valueOf(a2);
            String valueOf4 = String.valueOf(a2 != null ? Integer.valueOf(a2.c()) : null);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 57 + String.valueOf(valueOf4).length());
            sb2.append(valueOf3);
            sb2.append(" - DecoderConfigDescr2 read: ");
            sb2.append(position4);
            sb2.append(", size: ");
            sb2.append(valueOf4);
            logger2.logp(level2, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor", "parseDetail", sb2.toString());
            if (a2 instanceof axmh) {
                this.i.add((axmh) a2);
            }
        }
    }

    public final int b() {
        int i;
        axlw axlwVar = this.h;
        if (axlwVar == null) {
            i = 0;
        } else {
            axlwVar.b();
            i = 4;
        }
        return i + 15;
    }

    @Override // defpackage.axlx
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.a);
        sb.append(", streamType=");
        sb.append(this.b);
        sb.append(", upStream=");
        sb.append(this.c);
        sb.append(", bufferSizeDB=");
        sb.append(this.d);
        sb.append(", maxBitRate=");
        sb.append(this.e);
        sb.append(", avgBitRate=");
        sb.append(this.f);
        sb.append(", decoderSpecificInfo=");
        sb.append(this.g);
        sb.append(", audioSpecificInfo=");
        sb.append(this.h);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.j;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(ddy.a(bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        sb.append(Arrays.asList(this.i).toString());
        sb.append('}');
        return sb.toString();
    }
}
