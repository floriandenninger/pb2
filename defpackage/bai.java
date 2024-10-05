package defpackage;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bai {
    public final String a;
    public final boolean b;
    public final boolean c;

    public bai(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == bai.class) {
            bai baiVar = (bai) obj;
            if (TextUtils.equals(this.a, baiVar.a) && this.b == baiVar.b && this.c == baiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true == this.c ? 1231 : 1237);
    }
}
