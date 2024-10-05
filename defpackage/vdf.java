package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdf {
    public OutputStream a;
    public vdr b;

    public final void a() {
        if (this.b == null) {
            throw new vds("Cannot sync underlying stream");
        }
        this.a.flush();
        this.b.a();
    }
}
