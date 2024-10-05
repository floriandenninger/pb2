package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmo {
    public final File a;
    public File b;
    public File c;
    private File d;

    public agmo(Context context, String str) {
        zhq.m(str);
        File filesDir = context.getFilesDir();
        String str2 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str).length());
        sb.append("offline");
        sb.append(str2);
        sb.append(str);
        this.a = new File(new File(filesDir, sb.toString()), "data");
    }

    public final File a(String str) {
        zhq.m(str);
        if (this.d == null) {
            this.d = new File(this.a, "videos");
        }
        return new File(this.d, str);
    }
}
