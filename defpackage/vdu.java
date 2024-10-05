package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdu extends vdx implements vdh, vdg, vdr {
    private final FileOutputStream a;
    private final File b;

    public vdu(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.vdr
    public final void a() {
        this.a.getFD().sync();
    }

    @Override // defpackage.vdg
    public final FileChannel b() {
        return this.a.getChannel();
    }

    @Override // defpackage.vdh
    public final File c() {
        return this.b;
    }
}
