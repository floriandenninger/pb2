package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdt extends vdw implements vdh, vdg, vdq {
    private final FileInputStream a;
    private final File b;

    public vdt(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.vdq
    public final Long a() {
        return Long.valueOf(this.a.getChannel().size());
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
