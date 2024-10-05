package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Range;
import android.util.Size;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uo implements Comparator {
    private final /* synthetic */ int c;
    public static final uo b = new uo(12);
    public static final uo a = new uo(5);

    public uo(int i) {
        this.c = i;
    }

    public static final int a(afcp afcpVar, afcp afcpVar2) {
        int b2;
        int b3;
        if (afcpVar2.b() == afcpVar.b()) {
            b2 = afcpVar2.a();
            b3 = afcpVar.a();
        } else {
            b2 = afcpVar2.b();
            b3 = afcpVar.b();
        }
        return b2 - b3;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int a2;
        int a3;
        int d;
        int d2;
        switch (this.c) {
            case 0:
                uq uqVar = (uq) obj;
                uq uqVar2 = (uq) obj2;
                RecyclerView recyclerView = uqVar.d;
                if ((recyclerView == null) != (uqVar2.d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z = uqVar.a;
                if (z != uqVar2.a) {
                    return z ? -1 : 1;
                }
                int i = uqVar2.b - uqVar.b;
                if (i != 0) {
                    return i;
                }
                int i2 = uqVar.c - uqVar2.c;
                if (i2 == 0) {
                    return 0;
                }
                return i2;
            case 1:
                return ((dkb) obj).b - ((dkb) obj2).b;
            case 2:
                return ((aff) obj).c - ((aff) obj2).c;
            case 3:
                float b2 = jw.b((View) obj);
                float b3 = jw.b((View) obj2);
                if (b2 > b3) {
                    return -1;
                }
                return b2 < b3 ? 1 : 0;
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b4 = bArr[i3];
                    byte b5 = bArr2[i3];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
            case 5:
                return ((bpv) obj).d.compareToIgnoreCase(((bpv) obj2).d);
            case 6:
                a2 = ((brd) obj2).a();
                a3 = ((brd) obj).a();
                break;
            case 7:
                return ((byd) obj).b - ((byd) obj2).b;
            case 8:
                Object obj3 = ((dup) obj).a;
                Object obj4 = ((dup) obj2).a;
                dju djuVar = (dju) obj3;
                int i4 = djuVar.c.top;
                dju djuVar2 = (dju) obj4;
                int i5 = djuVar2.c.top;
                return i4 == i5 ? djuVar.i - djuVar2.i : i4 - i5;
            case 9:
                Object obj5 = ((dup) obj).a;
                Object obj6 = ((dup) obj2).a;
                dju djuVar3 = (dju) obj5;
                int i6 = djuVar3.c.bottom;
                dju djuVar4 = (dju) obj6;
                int i7 = djuVar4.c.bottom;
                return i6 == i7 ? djuVar4.i - djuVar3.i : i6 - i7;
            case 10:
                a2 = ((fwn) obj2).c();
                a3 = ((fwn) obj).c();
                break;
            case 11:
                a2 = ((ozv) obj2).c;
                a3 = ((ozv) obj).c;
                break;
            case 12:
                return ((rvj) obj).a() - ((rvj) obj2).a();
            case 13:
                a2 = ((FormatStreamModel) obj2).f;
                a3 = ((FormatStreamModel) obj).f;
                break;
            case 14:
                int intValue = ((Integer) ((Range) obj).getLower()).intValue();
                int intValue2 = ((Integer) ((Range) obj2).getLower()).intValue();
                if (intValue == intValue2) {
                    return 0;
                }
                return intValue >= intValue2 ? 1 : -1;
            case 15:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 16:
                FormatStreamModel formatStreamModel = (FormatStreamModel) obj;
                FormatStreamModel formatStreamModel2 = (FormatStreamModel) obj2;
                if (formatStreamModel2.d() == formatStreamModel.d()) {
                    d = formatStreamModel2.f;
                    d2 = formatStreamModel.f;
                } else {
                    d = formatStreamModel2.d();
                    d2 = formatStreamModel.d();
                }
                return d - d2;
            case 17:
                a2 = ((FormatStreamModel) obj2).f;
                a3 = ((FormatStreamModel) obj).f;
                break;
            case 18:
                int i8 = ((aenz) obj).a;
                int i9 = ((aenz) obj2).a;
                if (i8 > i9) {
                    return 1;
                }
                return i8 >= i9 ? 0 : -1;
            case 19:
                return Float.compare(((aenz) obj).b, ((aenz) obj2).b);
            default:
                return a((afcp) obj, (afcp) obj2);
        }
        return a2 - a3;
    }
}
