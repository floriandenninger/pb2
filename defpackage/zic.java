package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zic implements Comparable {
    public static final zic a = new zic(null);
    private final String b;
    private String[] c;
    private int[] d;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zic zicVar) {
        int[] b = b();
        int[] b2 = zicVar.b();
        int min = Math.min(b.length, b2.length);
        for (int i = 0; i < min; i++) {
            int i2 = b[i] - b2[i];
            if (i2 != 0) {
                return i2;
            }
        }
        return b.length - b2.length;
    }

    public final int[] b() {
        int[] iArr;
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.d;
            length = iArr.length;
            if (i >= length) {
                break;
            }
            if (iArr[i] != 0) {
                i2 = i;
            }
            i++;
        }
        int i3 = i2 + 1;
        return i3 == length ? iArr : Arrays.copyOfRange(iArr, 0, i3);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zic) && Arrays.equals(b(), ((zic) obj).b());
    }

    public final int hashCode() {
        return Arrays.hashCode(b()) + 527;
    }

    public final String toString() {
        return this.b;
    }

    public zic(String str) {
        String replaceAll = str == null ? "" : str.replaceAll("\\.?[^0-9.].*", "");
        String[] split = TextUtils.split(replaceAll, "\\.");
        this.c = split;
        this.d = new int[split.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.c;
            if (i2 >= strArr.length) {
                break;
            }
            this.d[i2] = Integer.parseInt(strArr[i2]);
            i2++;
        }
        String substring = str != null ? str.substring(replaceAll.length()) : "";
        String[] strArr2 = new String[3];
        while (i < 3) {
            String[] strArr3 = this.c;
            strArr2[i] = i < strArr3.length ? strArr3[i] : "0";
            i++;
        }
        String valueOf = String.valueOf(TextUtils.join(".", strArr2));
        String valueOf2 = String.valueOf(substring);
        this.b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
