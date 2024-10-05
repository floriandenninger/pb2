package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tur implements amml {
    private final /* synthetic */ int s;
    public static final /* synthetic */ tur r = new tur(20);
    public static final /* synthetic */ tur q = new tur(19);
    public static final /* synthetic */ tur p = new tur(18);
    public static final /* synthetic */ tur o = new tur(17);
    public static final /* synthetic */ tur n = new tur(16);
    public static final /* synthetic */ tur m = new tur(15);
    public static final /* synthetic */ tur l = new tur(14);
    public static final /* synthetic */ tur k = new tur(13);
    public static final /* synthetic */ tur j = new tur(12);
    public static final /* synthetic */ tur i = new tur(11);
    public static final /* synthetic */ tur h = new tur(10);
    public static final /* synthetic */ tur g = new tur(9);
    public static final /* synthetic */ tur f = new tur(8);
    public static final /* synthetic */ tur e = new tur(7);
    public static final /* synthetic */ tur d = new tur(6);
    public static final /* synthetic */ tur c = new tur(5);
    public static final /* synthetic */ tur b = new tur(4);
    public static final /* synthetic */ tur a = new tur(3);

    public /* synthetic */ tur(int i2) {
        this.s = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        Bitmap bitmap = null;
        switch (this.s) {
            case 0:
                return (aodx) obj;
            case 1:
                ammv ammvVar = (ammv) obj;
                ammvVar.h();
                return ammvVar;
            case 2:
                return (InputStream) obj;
            case 3:
                aodx aodxVar = ((tvb) obj).b;
                return aodxVar == null ? aodx.a : aodxVar;
            case 4:
                amrp f2 = amru.f();
                Iterator<E> it = ((amru) obj).iterator();
                while (it.hasNext()) {
                    f2.h(ugi.a.apply((uki) it.next()));
                }
                return f2.g();
            case 5:
                Log.e("OneGoogle", "Failed to load GoogleOwners.", (Exception) obj);
                return amru.q();
            case 6:
                return ((ukk) obj).a();
            case 7:
                return ((ukk) obj).b();
            case 8:
                return ulg.g(((tug) obj).a());
            case 9:
                return ((tug) obj).c();
            case 10:
                return ((ammv) obj).f();
            case 11:
                return null;
            case 12:
                InputStream inputStream = (InputStream) obj;
                if (inputStream != null) {
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return bitmap;
            case 13:
                return ((ukk) obj).a();
            case 14:
                return ((ukk) obj).b();
            case 15:
                int i2 = ulx.b;
                qrj c2 = ((rmt) obj).c();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = c2.iterator();
                while (it2.hasNext()) {
                    qrl qrlVar = (qrl) it2.next();
                    if (!qrlVar.a.b()) {
                        arrayList.add(uly.a.apply(qrlVar));
                    }
                }
                return amru.o(arrayList);
            case 16:
                int i3 = ulx.b;
                ParcelFileDescriptor c3 = ((rmu) obj).c();
                if (c3 != null) {
                    try {
                        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(c3);
                        try {
                            bitmap = BitmapFactory.decodeStream(autoCloseInputStream);
                            autoCloseInputStream.close();
                        } catch (Throwable th) {
                            try {
                                autoCloseInputStream.close();
                            } catch (Throwable unused2) {
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return bitmap;
            case 17:
                return anrs.a((String) obj);
            case 18:
                return uxp.a((uvu) obj);
            case 19:
                return new vlu();
            default:
                return Integer.valueOf(((vzn) obj).b);
        }
    }
}
