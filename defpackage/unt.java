package defpackage;

import android.service.notification.StatusBarNotification;
import android.text.Spanned;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class unt implements Comparator {
    private final /* synthetic */ int u;
    public static final /* synthetic */ unt t = new unt(20);
    public static final /* synthetic */ unt s = new unt(19);
    public static final /* synthetic */ unt r = new unt(18);
    public static final /* synthetic */ unt q = new unt(17);
    public static final /* synthetic */ unt p = new unt(16);
    public static final /* synthetic */ unt o = new unt(15);
    public static final /* synthetic */ unt n = new unt(14);
    public static final /* synthetic */ unt m = new unt(13);
    public static final /* synthetic */ unt l = new unt(12);
    public static final /* synthetic */ unt k = new unt(11);
    public static final /* synthetic */ unt j = new unt(10);
    public static final /* synthetic */ unt i = new unt(9);
    public static final /* synthetic */ unt h = new unt(8);
    public static final /* synthetic */ unt g = new unt(6);
    public static final /* synthetic */ unt f = new unt(5);
    public static final /* synthetic */ unt e = new unt(4);
    public static final /* synthetic */ unt d = new unt(3);
    public static final /* synthetic */ unt c = new unt(2);
    public static final /* synthetic */ unt b = new unt(1);
    public static final /* synthetic */ unt a = new unt(0);

    public /* synthetic */ unt(int i2) {
        this.u = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.u) {
            case 0:
                return (((unv) obj).a.e() > ((unv) obj2).a.e() ? 1 : (((unv) obj).a.e() == ((unv) obj2).a.e() ? 0 : -1));
            case 1:
                txb txbVar = (txb) obj2;
                int e2 = aocz.e(((txb) obj).d.l);
                if (e2 == 0) {
                    e2 = 1;
                }
                int g2 = ubt.g(e2);
                int e3 = aocz.e(txbVar.d.l);
                return g2 - ubt.g(e3 != 0 ? e3 : 1);
            case 2:
                uuq uuqVar = (uuq) obj;
                uuq uuqVar2 = (uuq) obj2;
                uuqVar.a();
                int i2 = uuqVar.a().b;
                uuqVar2.a();
                int i3 = uuqVar2.a().b;
                if (i2 == i3) {
                    return 0;
                }
                return i2 <= i3 ? 1 : -1;
            case 3:
                int i4 = wmg.al;
                return ((Spanned) obj).toString().compareTo(((Spanned) obj2).toString());
            case 4:
                return ((aoye) obj).d - ((aoye) obj2).d;
            case 5:
                throw null;
            case 6:
                amru amruVar = zoj.c;
                return -Long.valueOf(((DeviceLocalFile) obj).d()).compareTo(Long.valueOf(((DeviceLocalFile) obj2).d()));
            case 7:
                return ((String) ((zwv) obj).e.c()).compareTo((String) ((zwv) obj2).e.c());
            case 8:
                int i5 = ((aadj) obj).f;
                int i6 = ((aadj) obj2).f;
                if (i5 == i6) {
                    return 0;
                }
                return i5 >= i6 ? 1 : -1;
            case 9:
                Map.Entry entry = (Map.Entry) obj2;
                long j2 = acyc.a;
                awuy awuyVar = ((awux) ((Map.Entry) obj).getValue()).d;
                if (awuyVar == null) {
                    awuyVar = awuy.a;
                }
                long j3 = awuyVar.h;
                awuy awuyVar2 = ((awux) entry.getValue()).d;
                if (awuyVar2 == null) {
                    awuyVar2 = awuy.a;
                }
                return j3 < awuyVar2.h ? 1 : -1;
            case 10:
                long j4 = acyc.a;
                return ((awvb) ((Map.Entry) obj).getValue()).e < ((awvb) ((Map.Entry) obj2).getValue()).e ? 1 : -1;
            case 11:
                return ((bpv) obj).d.compareTo(((bpv) obj2).d);
            case 12:
                int i7 = aflm.a;
                return ((awtx) obj2).c - ((awtx) obj).c;
            case 13:
                int i8 = afzp.c;
                return ((afzn) obj).c - ((afzn) obj2).c;
            case 14:
                return (int) (((StatusBarNotification) obj).getPostTime() - ((StatusBarNotification) obj2).getPostTime());
            case 15:
                return ((agcw) obj).b.compareTo(((agcw) obj2).b);
            case 16:
                return ((Long) ((Map.Entry) obj2).getValue()).compareTo((Long) ((Map.Entry) obj).getValue());
            case 17:
                return ((avgf) obj).d - ((avgf) obj2).d;
            case 18:
                return ahab.a.compare(((agnc) obj).a, ((agnc) obj2).a);
            case 19:
                return ahab.b.compare(((agnc) obj).a, ((agnc) obj2).a);
            default:
                aqll aqllVar = (aqll) obj2;
                Comparator comparator = ahab.a;
                atrx b2 = atrx.b(((aqll) obj).d);
                if (b2 == null) {
                    b2 = atrx.UNKNOWN_FORMAT_TYPE;
                }
                atrx b3 = atrx.b(aqllVar.d);
                if (b3 == null) {
                    b3 = atrx.UNKNOWN_FORMAT_TYPE;
                }
                return comparator.compare(b2, b3);
        }
    }
}
