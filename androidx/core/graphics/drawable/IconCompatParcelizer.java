package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import defpackage.bxx;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x006e. Please report as an issue. */
    public static IconCompat read(bxx bxxVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.b = bxxVar.a(iconCompat.b, 1);
        byte[] bArr = iconCompat.d;
        if (bxxVar.s(2)) {
            int readInt = bxxVar.d.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                bArr = new byte[readInt];
                bxxVar.d.readByteArray(bArr);
            }
        }
        iconCompat.d = bArr;
        iconCompat.e = bxxVar.b(iconCompat.e, 3);
        iconCompat.f = bxxVar.a(iconCompat.f, 4);
        iconCompat.g = bxxVar.a(iconCompat.g, 5);
        iconCompat.h = (ColorStateList) bxxVar.b(iconCompat.h, 6);
        iconCompat.j = bxxVar.e(iconCompat.j, 7);
        iconCompat.k = bxxVar.e(iconCompat.k, 8);
        iconCompat.i = PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.b) {
            case -1:
                parcelable = iconCompat.e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.c = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.e;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.d;
                    iconCompat.c = bArr2;
                    iconCompat.b = 3;
                    iconCompat.f = 0;
                    iconCompat.g = bArr2.length;
                    return iconCompat;
                }
                iconCompat.c = parcelable;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.c = new String(iconCompat.d, Charset.forName("UTF-16"));
                if (iconCompat.b == 2 && iconCompat.k == null) {
                    iconCompat.k = ((String) iconCompat.c).split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.c = iconCompat.d;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, bxx bxxVar) {
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.b) {
            case -1:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 1:
            case 5:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 2:
                iconCompat.d = ((String) iconCompat.c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.d = (byte[]) iconCompat.c;
                break;
            case 4:
            case 6:
                iconCompat.d = iconCompat.c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.b;
        if (i != -1) {
            bxxVar.h(i, 1);
        }
        byte[] bArr = iconCompat.d;
        if (bArr != null) {
            bxxVar.p(2);
            bxxVar.d.writeInt(bArr.length);
            bxxVar.d.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            bxxVar.i(parcelable, 3);
        }
        int i2 = iconCompat.f;
        if (i2 != 0) {
            bxxVar.h(i2, 4);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            bxxVar.h(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            bxxVar.i(colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            bxxVar.j(str, 7);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            bxxVar.j(str2, 8);
        }
    }
}
