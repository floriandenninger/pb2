package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rkm extends rhg {
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private Integer f;
    private static final String[] b = {"firebase_", "google_", "ga_"};
    public static final String[] a = {"_err"};

    static {
        Pattern.compile("^([^\\s@]+)@([^\\s@]+\\.[^\\s@]+)$");
        Pattern.compile("^(gmail|googlemail)\\.");
        Pattern.compile("[\\s-()/.]+");
        Pattern.compile("^\\+\\d{11,15}$");
        Pattern.compile("[0-9`~!@#$%^&*()_\\-+=:;<>,.?|/\\\\\\[\\]]+");
        Pattern.compile("\\s+");
    }

    public rkm(rgt rgtVar) {
        super(rgtVar);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    public static ArrayList B(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = (ConditionalUserPropertyParcel) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", conditionalUserPropertyParcel.a);
            bundle.putString("origin", conditionalUserPropertyParcel.b);
            bundle.putLong("creation_timestamp", conditionalUserPropertyParcel.d);
            bundle.putString("name", conditionalUserPropertyParcel.c.b);
            rqr.t(bundle, conditionalUserPropertyParcel.c.a());
            bundle.putBoolean("active", conditionalUserPropertyParcel.e);
            String str = conditionalUserPropertyParcel.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            EventParcel eventParcel = conditionalUserPropertyParcel.g;
            if (eventParcel != null) {
                bundle.putString("timed_out_event_name", eventParcel.a);
                EventParams eventParams = conditionalUserPropertyParcel.g.b;
                if (eventParams != null) {
                    bundle.putBundle("timed_out_event_params", eventParams.a());
                }
            }
            bundle.putLong("trigger_timeout", conditionalUserPropertyParcel.h);
            EventParcel eventParcel2 = conditionalUserPropertyParcel.i;
            if (eventParcel2 != null) {
                bundle.putString("triggered_event_name", eventParcel2.a);
                EventParams eventParams2 = conditionalUserPropertyParcel.i.b;
                if (eventParams2 != null) {
                    bundle.putBundle("triggered_event_params", eventParams2.a());
                }
            }
            bundle.putLong("triggered_timestamp", conditionalUserPropertyParcel.c.c);
            bundle.putLong("time_to_live", conditionalUserPropertyParcel.j);
            EventParcel eventParcel3 = conditionalUserPropertyParcel.k;
            if (eventParcel3 != null) {
                bundle.putString("expired_event_name", eventParcel3.a);
                EventParams eventParams3 = conditionalUserPropertyParcel.k.b;
                if (eventParams3 != null) {
                    bundle.putBundle("expired_event_params", eventParams3.a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void D(rij rijVar, Bundle bundle, boolean z) {
        if (bundle != null && rijVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = rijVar.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = rijVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", rijVar.c);
                return;
            }
            z = false;
        }
        if (bundle != null && rijVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    private final int aB(String str) {
        if ("_ldl".equals(str)) {
            J();
            return 2048;
        }
        if ("_id".equals(str)) {
            J();
            return 256;
        }
        if (!J().o(rfd.ac) || !"_lgclid".equals(str)) {
            J();
            return 36;
        }
        J();
        return 100;
    }

    private final Object aC(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return z(String.valueOf(obj), i, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle v = v((Bundle) parcelable);
                if (!v.isEmpty()) {
                    arrayList.add(v);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean aD(String str, String[] strArr) {
        qip.an(strArr);
        for (String str2 : strArr) {
            if (ap(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean aE(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ak(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean am(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean an(String str) {
        qip.ax(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ao(Context context) {
        ActivityInfo receiverInfo;
        qip.an(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean ap(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean aq(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    static final boolean au(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest aw() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ay(Context context) {
        qip.an(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return aE(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return aE(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static final boolean az(String str) {
        qip.an(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long p(byte[] bArr) {
        qip.an(bArr);
        int length = bArr.length;
        int i = 0;
        qip.av(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static Bundle s(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserAttributeParcel userAttributeParcel = (UserAttributeParcel) it.next();
            String str = userAttributeParcel.e;
            if (str != null) {
                bundle.putString(userAttributeParcel.b, str);
            } else {
                Long l = userAttributeParcel.d;
                if (l != null) {
                    bundle.putLong(userAttributeParcel.b, l.longValue());
                } else {
                    Double d = userAttributeParcel.g;
                    if (d != null) {
                        bundle.putDouble(userAttributeParcel.b, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static Bundle u(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SecureRandom A() {
        n();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            aF().f.b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                N().R(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(rfq rfqVar, int i) {
        int i2 = 0;
        for (String str : new TreeSet(rfqVar.d.keySet())) {
            if (an(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                aF().e.c(sb.toString(), L().c(rfqVar.a), L().b(rfqVar.d));
                au(rfqVar.d, 5);
                rfqVar.d.remove(str);
            }
        }
    }

    public final void G(rkl rklVar, int i, String str, String str2, int i2) {
        H(rklVar, null, i, str, str2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(rkl rklVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        au(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        rklVar.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            aF().h.c("Not putting event parameter. Invalid value type. name, type", L().d(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void S(rci rciVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            rciVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aF().f.b("Error returning boolean value to wrapper", e);
        }
    }

    public final void T(rci rciVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            rciVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aF().f.b("Error returning bundle list to wrapper", e);
        }
    }

    public final void U(rci rciVar, Bundle bundle) {
        try {
            rciVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aF().f.b("Error returning bundle value to wrapper", e);
        }
    }

    public final void V(rci rciVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            rciVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aF().f.b("Error returning byte array to wrapper", e);
        }
    }

    public final void W(rci rciVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            rciVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aF().f.b("Error returning int value to wrapper", e);
        }
    }

    public final void X(rci rciVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            rciVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aF().f.b("Error returning long value to wrapper", e);
        }
    }

    public final void Y(rci rciVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            rciVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aF().f.b("Error returning string value to wrapper", e);
        }
    }

    final void Z(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int g;
        String str4;
        int a2;
        if (bundle == null) {
            return;
        }
        J();
        int i = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                g = !z ? g(str5) : 0;
                if (g == 0) {
                    g = e(str5);
                }
            } else {
                g = 0;
            }
            if (g != 0) {
                at(bundle, g, str5, g == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (aj(bundle.get(str5))) {
                    aF().h.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    a2 = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    a2 = a(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (a2 == 0 || "_ev".equals(str4)) {
                    if (an(str4) && !aD(str4, rhj.d) && (i = i + 1) > 0) {
                        aF().e.c("Item cannot contain custom parameters", L().c(str2), L().b(bundle));
                        au(bundle, 23);
                        bundle.remove(str4);
                    }
                } else {
                    at(bundle, a2, str4, bundle.get(str4));
                    bundle.remove(str4);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkm.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final URL aA(String str, String str2, long j) {
        try {
            qip.ax(str2);
            qip.ax(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 44000L, Integer.valueOf(o())), str2, str, Long.valueOf(j));
            if (str.equals(J().x("debug.deferred.deeplink"))) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            aF().c.b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // defpackage.rhg
    protected final void aH() {
        n();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                aF().f.a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aa(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (az(str)) {
                return true;
            }
            if (this.w.x()) {
                aF().e.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", rfp.a(str));
            }
            return false;
        }
        axve.b();
        if (J().o(rfd.ae) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (az(str2)) {
                return true;
            }
            aF().e.b("Invalid admob_app_id. Analytics disabled.", rfp.a(str2));
            return false;
        }
        if (this.w.x()) {
            aF().e.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ab(String str, int i, String str2) {
        if (str2 == null) {
            aF().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        aF().e.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ac(String str, String[] strArr, String str2) {
        return ad(str, strArr, null, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ad(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            aF().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = b;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                aF().e.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !aD(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && aD(str2, strArr2)) {
            return true;
        }
        aF().e.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ae(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                aF().h.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean af(String str, String str2) {
        if (str2 == null) {
            aF().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            aF().e.b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (Character.isLetter(codePointAt) || codePointAt == 95) {
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    aF().e.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
        aF().e.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ag(String str, String str2) {
        if (str2 == null) {
            aF().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            aF().e.b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            aF().e.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                charCount += Character.charCount(codePointAt2);
            } else {
                aF().e.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ah(String str) {
        n();
        if (qtu.b(I()).a(str) == 0) {
            return true;
        }
        aF().j.b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ai(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String k = J().k();
        P();
        return k.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aj(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean al(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d = qtu.b(context).d(str, 64);
            if (d == null || d.signatures == null || d.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(d.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            aF().c.b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            aF().c.b("Error obtaining certificate", e2);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ar(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            qip.an(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] as(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    final void at(Bundle bundle, int i, String str, Object obj) {
        if (au(bundle, i)) {
            J();
            bundle.putString("_ev", z(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EventParcel av(String str, String str2, Bundle bundle, String str3, long j, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (c(str2) != 0) {
            aF().c.b("Invalid conditional property event name", L().e(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle w = w(str, str2, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            w = v(w);
        }
        qip.an(w);
        return new EventParcel(str2, new EventParams(w), str3, j);
    }

    public final int ax() {
        return qmz.d.h(I(), 12451000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(String str, Object obj) {
        boolean ae;
        if ("_ldl".equals(str)) {
            ae = ae("user property referrer", str, aB(str), obj);
        } else {
            ae = ae("user property", str, aB(str), obj);
        }
        return ae ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(String str) {
        if (!af("event", str)) {
            return 2;
        }
        if (!ad("event", rhi.a, rhi.b, str)) {
            return 13;
        }
        J();
        return !ab("event", 40, str) ? 2 : 0;
    }

    final int e(String str) {
        if (!af("event param", str)) {
            return 3;
        }
        if (!ac("event param", null, str)) {
            return 14;
        }
        J();
        return !ab("event param", 40, str) ? 3 : 0;
    }

    @Override // defpackage.rhg
    protected final boolean f() {
        return true;
    }

    final int g(String str) {
        if (!ag("event param", str)) {
            return 3;
        }
        if (!ac("event param", null, str)) {
            return 14;
        }
        J();
        return !ab("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int i(String str) {
        if (!af("user property", str)) {
            return 6;
        }
        if (!ac("user property", rhk.a, str)) {
            return 15;
        }
        J();
        return !ab("user property", 24, str) ? 6 : 0;
    }

    public final int o() {
        if (this.f == null) {
            int i = qmz.c;
            this.f = Integer.valueOf(qnm.a(I()) / 1000);
        }
        return this.f.intValue();
    }

    public final long q() {
        long andIncrement;
        long j;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nanoTime = System.nanoTime();
                Q();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.e + 1;
                this.e = i;
                j = nextLong + i;
            }
            return j;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1L, 1L);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    public final long r(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle t(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                aF().f.b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle v(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object x = x(str, bundle.get(str));
                if (x == null) {
                    aF().h.b("Param value can't be null", L().d(str));
                } else {
                    R(bundle2, str, x);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle w(String str, String str2, Bundle bundle, List list, boolean z) {
        int g;
        int i;
        List list2 = list;
        boolean aD = aD(str2, rhi.d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int b2 = J().b();
        int i2 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                g = !z ? g(str3) : 0;
                if (g == 0) {
                    g = e(str3);
                }
            } else {
                g = 0;
            }
            if (g != 0) {
                at(bundle2, g, str3, g == 3 ? str3 : null);
                bundle2.remove(str3);
                i = b2;
            } else {
                i = b2;
                int a2 = a(str, str2, str3, bundle.get(str3), bundle2, list, z, aD);
                if (a2 == 17) {
                    at(bundle2, 17, str3, false);
                } else if (a2 != 0 && !"_ev".equals(str3)) {
                    at(bundle2, a2, a2 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (an(str3)) {
                    int i3 = i2 + 1;
                    if (i3 > i) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(i);
                        sb.append(" params");
                        aF().e.c(sb.toString(), L().c(str2), L().b(bundle));
                        au(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i2 = i3;
                }
            }
            b2 = i;
            list2 = list;
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object x(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            J();
            return aC(256, obj, true, true);
        }
        if (am(str)) {
            J();
        } else {
            J();
            i = 100;
        }
        return aC(i, obj, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object y(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return aC(aB(str), obj, true, false);
        }
        return aC(aB(str), obj, false, false);
    }

    public final String z(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }
}
