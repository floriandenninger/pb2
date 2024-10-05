package defpackage;

import android.view.TextureView;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ztr {
    public final String a;
    public final ztq b;
    public final ztj c;

    public ztr(String str, ztq ztqVar, ztj ztjVar) {
        this.a = str;
        this.b = ztqVar;
        this.c = ztjVar;
    }

    public final TextureView a() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ztr)) {
            if (this == obj) {
                return true;
            }
            ztr ztrVar = (ztr) obj;
            if (amkq.b(this.a, ztrVar.a) && amkq.b(this.b, ztrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
