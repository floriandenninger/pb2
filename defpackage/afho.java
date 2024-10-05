package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afho implements FilenameFilter {
    private final /* synthetic */ int c;
    public static final /* synthetic */ afho b = new afho(3);
    public static final /* synthetic */ afho a = new afho(1);

    public afho(int i) {
        this.c = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.c;
        if (i == 0) {
            return afhp.a.matcher(str).matches() || afhp.b.matcher(str).matches();
        }
        if (i != 1) {
            return i != 2 ? str.endsWith(".tmp") || str.endsWith(".rm") : (str.equals("cached_content_index.exi") || afhp.a.matcher(str).matches() || afhp.b.matcher(str).matches() || afhp.c.matcher(str).matches()) ? false : true;
        }
        int i2 = ymk.b;
        return str.endsWith(".cache");
    }
}
