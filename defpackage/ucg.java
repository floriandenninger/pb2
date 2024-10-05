package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucg {
    public boolean a;
    public Integer b;
    public Map c;
    public byte[] d;
    public Exception e;
    private byte[] f;

    public final Map b() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final uch a() {
        if (this.a) {
            this.f = this.d;
        } else {
            try {
                Map b = b();
                byte[] bArr = this.d;
                if (b.containsKey(ucd.a)) {
                    List list = (List) b.get(ucd.a);
                    if (!list.isEmpty() && amkq.e((CharSequence) list.get(0), "gzip")) {
                        bArr = anbt.c(new GZIPInputStream(new ByteArrayInputStream(bArr)));
                    }
                }
                this.f = bArr;
            } catch (IOException e) {
                this.e = e;
            }
        }
        Map map = this.c;
        if (map == null) {
            throw new IllegalStateException("Missing required properties: headers");
        }
        return new uch(this.b, map, this.d, this.f, this.e);
    }
}
