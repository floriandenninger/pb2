package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsh {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String b;
    public final String c;
    public final ComponentName d;
    public final int e;
    public final boolean f;

    public qsh(ComponentName componentName) {
        this.b = null;
        this.c = null;
        qip.an(componentName);
        this.d = componentName;
        this.e = 4225;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsh)) {
            return false;
        }
        qsh qshVar = (qsh) obj;
        if (qar.j(this.b, qshVar.b) && qar.j(this.c, qshVar.c) && qar.j(this.d, qshVar.d)) {
            int i = qshVar.e;
            if (this.f == qshVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, 4225, Boolean.valueOf(this.f)});
    }

    public final String toString() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        qip.an(this.d);
        return this.d.flattenToString();
    }

    public qsh(String str, boolean z) {
        qip.ax(str);
        this.b = str;
        qip.ax("com.google.android.gms");
        this.c = "com.google.android.gms";
        this.d = null;
        this.e = 4225;
        this.f = z;
    }
}
