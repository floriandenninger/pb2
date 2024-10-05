package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvm implements cvl {
    private final /* synthetic */ int a;

    public cvm(int i) {
        this.a = i;
    }

    @Override // defpackage.cvl
    public final Class a() {
        return this.a != 0 ? ParcelFileDescriptor.class : InputStream.class;
    }

    @Override // defpackage.cvl
    public final /* synthetic */ Object b(File file) {
        return this.a != 0 ? ParcelFileDescriptor.open(file, 268435456) : new FileInputStream(file);
    }

    @Override // defpackage.cvl
    public final /* synthetic */ void c(Object obj) {
        if (this.a == 0) {
            ((InputStream) obj).close();
        } else {
            ((ParcelFileDescriptor) obj).close();
        }
    }
}
