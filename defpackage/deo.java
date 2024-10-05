package defpackage;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deo extends axks {
    public String a;
    public String b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private long g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        Collections.unmodifiableMap(hashMap);
    }

    public deo() {
        super("hdlr");
        this.b = null;
        this.f = true;
    }

    @Override // defpackage.axkq
    protected final long h() {
        return this.f ? did.S(this.b) + 25 : did.S(this.b) + 24;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.g = did.ak(byteBuffer);
        this.a = did.am(byteBuffer);
        this.c = did.ak(byteBuffer);
        this.d = did.ak(byteBuffer);
        this.e = did.ak(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.f = false;
            return;
        }
        String ao = did.ao(byteBuffer, byteBuffer.remaining());
        this.b = ao;
        if (!ao.endsWith("\u0000")) {
            this.f = false;
            return;
        }
        this.b = this.b.substring(0, r3.length() - 1);
        this.f = true;
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.g);
        byteBuffer.put(ddz.b(this.a));
        did.aa(byteBuffer, this.c);
        did.aa(byteBuffer, this.d);
        did.aa(byteBuffer, this.e);
        String str = this.b;
        if (str != null) {
            byteBuffer.put(did.U(str));
        }
        if (this.f) {
            byteBuffer.put((byte) 0);
        }
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        sb.append("HandlerBox[handlerType=");
        sb.append(str);
        sb.append(";name=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
