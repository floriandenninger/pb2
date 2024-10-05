package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafk implements bafn {
    final /* synthetic */ File a;

    public bafk(File file) {
        this.a = file;
    }

    @Override // defpackage.bafn
    public final FileChannel a() {
        return new FileInputStream(this.a).getChannel();
    }
}
