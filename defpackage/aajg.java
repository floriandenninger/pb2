package defpackage;

import java.io.File;
import java.io.FileFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aajg implements FileFilter {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ aajg(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public aajg(String str, int i, byte[] bArr) {
        this.b = i;
        this.a = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (this.b == 0) {
            return file.getName().contains(this.a);
        }
        String name = file.getName();
        return (name.startsWith(this.a) || name.equals("MultiDex.lock")) ? false : true;
    }
}
