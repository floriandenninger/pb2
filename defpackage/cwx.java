package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwx implements cvz {
    private final cvz a;
    private final /* synthetic */ int b;

    public cwx(cvz cvzVar, int i) {
        this.b = i;
        this.a = cvzVar;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean b(Object obj) {
        if (this.b != 0) {
            return true;
        }
        return true;
    }

    @Override // defpackage.cvz
    public final /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        Uri c;
        if (this.b == 0) {
            return this.a.a(new cvo((URL) obj), i, i2, cqnVar);
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            c = null;
        } else if (str.charAt(0) == '/') {
            c = c(str);
        } else {
            Uri parse = Uri.parse(str);
            c = parse.getScheme() == null ? c(str) : parse;
        }
        if (c == null || !this.a.b(c)) {
            return null;
        }
        return this.a.a(c, i, i2, cqnVar);
    }
}
