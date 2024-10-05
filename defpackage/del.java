package defpackage;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class del extends axkq {
    public String a;
    public List b;
    private long c;

    public del() {
        super("ftyp");
        this.b = Collections.emptyList();
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (this.b.size() * 4) + 8;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        this.a = did.am(byteBuffer);
        this.c = did.ak(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.b = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.b.add(did.am(byteBuffer));
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        byteBuffer.put(ddz.b(this.a));
        did.aa(byteBuffer, this.c);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            byteBuffer.put(ddz.b((String) it.next()));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FileTypeBox[majorBrand=");
        sb.append(this.a);
        sb.append(";minorVersion=");
        sb.append(this.c);
        for (String str : this.b) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }

    public del(String str, long j, List list) {
        super("ftyp");
        Collections.emptyList();
        this.a = str;
        this.c = j;
        this.b = list;
    }
}
