package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.youtube.R;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wbs {
    public static boolean A(aadw aadwVar) {
        apbn z = z(aadwVar);
        return z != null && z.q;
    }

    public static boolean B(aadw aadwVar) {
        apbn z = z(aadwVar);
        return z != null && z.l;
    }

    public static ywp C(Context context, azrw azrwVar, String str, anic anicVar) {
        vda a = vdb.a(context);
        a.e("ads");
        a.f("ads.pb");
        Uri a2 = a.a();
        vfe a3 = vff.a();
        a3.e(awum.a);
        a3.f(a2);
        vfk d = vfn.d(context, anicVar);
        d.c = str;
        d.b();
        d.d("last_ad_time", "last_ad_signals_adid", "last_ad_signals_lat", "last_ad_signals_identity", "last_ad_signals_timestamp");
        d.e(fkm.l);
        a3.b(d.a());
        return new ywp(agcm.e(((vfg) azrwVar.get()).a(a3.a())), awum.a);
    }

    public static boolean D(xjq xjqVar, int i) {
        boolean z = xjqVar.a;
        return i == 2 ? z && !xjqVar.d.a : z && xjqVar.d.a;
    }

    public static apfc E(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apey apeyVar = (apey) it.next();
            if (apeyVar != null && apeyVar.b == 49483894) {
                return (apfc) apeyVar.c;
            }
        }
        return null;
    }

    public static void H(Throwable th) {
        throw new zje(th);
    }

    public static anhy I(ayqj ayqjVar) {
        zjd zjdVar = new zjd();
        ayqjVar.Z(new zjc(zjdVar));
        return zjdVar;
    }

    public static ayqj J(final anhy anhyVar) {
        return ayqj.p(new ayql() { // from class: zja
            @Override // defpackage.ayql
            public final void a(azmi azmiVar) {
                anhy anhyVar2 = anhy.this;
                anaf.Y(anhyVar2, new zjb(azmiVar), angq.a);
                ayrz.f(azmiVar, new ayrx(new ziv(anhyVar2, 2)));
            }
        });
    }

    public static ayqc K(final ayph ayphVar) {
        return new ayqc() { // from class: zix
            @Override // defpackage.ayqc
            public final ayqb a(aypy aypyVar) {
                azks azksVar = new azks(aypyVar, ayph.this.P(new Object()).l());
                ayrv ayrvVar = aynu.l;
                return azksVar;
            }
        };
    }

    public static ayps L(final anhy anhyVar) {
        return ayps.i(new aypu() { // from class: zit
            @Override // defpackage.aypu
            public final void a(azcc azccVar) {
                anhy anhyVar2 = anhy.this;
                anaf.Y(anhyVar2, new ziw(azccVar), angq.a);
                ayrz.f(azccVar, new ayrx(new ziv(anhyVar2, 0)));
            }
        });
    }

    public static aypr M(final ayph ayphVar) {
        return new aypr() { // from class: zis
            @Override // defpackage.aypr
            public final banv a(aypn aypnVar) {
                return aypnVar.P(ayph.this.P(new Object()).g());
            }
        };
    }

    public static anhy N(final ayph ayphVar) {
        return aci.c(new aeu() { // from class: zin
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                ayph ayphVar2 = ayph.this;
                ayphVar2.U(new zir(aesVar));
                return ayphVar2;
            }
        });
    }

    public static ayph O(final anhy anhyVar) {
        return ayph.j(new aypj() { // from class: zio
            @Override // defpackage.aypj
            public final void a(ayue ayueVar) {
                anhy anhyVar2 = anhy.this;
                anaf.Y(anhyVar2, new zip(ayueVar), angq.a);
                ayueVar.d(new ziv(anhyVar2, 1));
            }
        });
    }

    public static ajun P(HashMap hashMap) {
        return new ajun(hashMap, (byte[]) null);
    }

    public static int Q(Context context, int i) {
        context.getClass();
        aJ(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw aI(i);
        }
        if (typedValue.type < 28 || typedValue.type > 31) {
            if (typedValue.type == 3) {
                try {
                    return context.getResources().getColor(typedValue.resourceId);
                } catch (Resources.NotFoundException e) {
                    throw new UnsupportedOperationException(String.format("Type of attribute is not a color (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)), e);
                }
            }
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)));
        }
        return typedValue.data;
    }

    public static int R(Context context, int i) {
        context.getClass();
        aJ(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw aI(i);
        }
        if (typedValue.type == 1) {
            return typedValue.resourceId;
        }
        throw new UnsupportedOperationException(String.format("Type of attribute is not a resource ID (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()));
    }

    public static ColorStateList S(Context context, int i) {
        context.getClass();
        aJ(i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{i});
        try {
            try {
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList != null) {
                    return colorStateList;
                }
                throw aI(i);
            } catch (Resources.NotFoundException e) {
                throw new UnsupportedOperationException(String.format("Type of attribute is not a color state list (attr = %d, value = %s)", Integer.valueOf(i), obtainStyledAttributes.getString(0)), e);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable T(Context context, int i) {
        context.getClass();
        aJ(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw aI(i);
        }
        if (typedValue.type < 28 || typedValue.type > 31) {
            if (typedValue.type == 3) {
                try {
                    return fk.f(context.getResources(), typedValue.resourceId, context.getTheme());
                } catch (Resources.NotFoundException e) {
                    throw new UnsupportedOperationException(String.format("Type of attribute is not a reference to a drawable (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()), e);
                }
            }
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color or a reference to a drawable (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()));
        }
        return new ColorDrawable(typedValue.data);
    }

    public static Optional U(Context context, int i) {
        context.getClass();
        aJ(i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{i});
        try {
            return Optional.ofNullable(obtainStyledAttributes.getColorStateList(0));
        } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            return Optional.empty();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Optional V(Context context, int i) {
        context.getClass();
        aJ(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return Optional.empty();
        }
        if (typedValue.type < 28 || typedValue.type > 31) {
            if (typedValue.type == 3) {
                try {
                    return Optional.ofNullable(fk.f(context.getResources(), typedValue.resourceId, context.getTheme()));
                } catch (Resources.NotFoundException unused) {
                    return Optional.empty();
                }
            }
            return Optional.empty();
        }
        return Optional.of(new ColorDrawable(typedValue.data));
    }

    public static OptionalInt W(Context context, int i) {
        context.getClass();
        return X(context.getResources(), context.getTheme(), i);
    }

    public static OptionalInt X(Resources resources, Resources.Theme theme, int i) {
        aJ(i);
        TypedValue typedValue = new TypedValue();
        if (!theme.resolveAttribute(i, typedValue, true)) {
            return OptionalInt.empty();
        }
        if (typedValue.type < 28 || typedValue.type > 31) {
            if (typedValue.type == 3) {
                try {
                    return OptionalInt.of(fk.a(resources, typedValue.resourceId, theme));
                } catch (Resources.NotFoundException unused) {
                    return OptionalInt.empty();
                }
            }
            return OptionalInt.empty();
        }
        return OptionalInt.of(typedValue.data);
    }

    public static OptionalInt Y(Context context, int i) {
        aJ(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return OptionalInt.empty();
        }
        if (typedValue.type == 1) {
            return OptionalInt.of(typedValue.resourceId);
        }
        return OptionalInt.empty();
    }

    public static int Z(Context context) {
        aJ(R.attr.ytThemeType);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.ytThemeType, typedValue, true)) {
            throw aI(R.attr.ytThemeType);
        }
        if (typedValue.type < 16 || typedValue.type > 31) {
            throw new UnsupportedOperationException(String.format("Type of attribute is not an integer (attr = %d, value = %s)", Integer.valueOf(R.attr.ytThemeType), typedValue.coerceToString()));
        }
        return typedValue.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r17, int r18, java.lang.String r19, android.content.SharedPreferences r20, defpackage.wdd r21, defpackage.wdm r22, defpackage.wco r23, defpackage.wkk r24, defpackage.wgv r25, defpackage.wiz r26, defpackage.ypa r27, defpackage.azrw r28) {
        /*
            r1 = r18
            r2 = r19
            r15 = r24
            android.content.Context r3 = r15.e
            java.lang.String r0 = "accountName must be provided"
            defpackage.qip.ay(r2, r0)
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            defpackage.qip.au(r0)
            r0 = 8400000(0x802c80, float:1.1770907E-38)
            defpackage.qde.h(r3, r0)
            com.google.android.gms.auth.AccountChangeEventsRequest r4 = new com.google.android.gms.auth.AccountChangeEventsRequest
            r4.<init>()
            r4.c = r2
            r14 = r17
            r4.b = r14
            defpackage.uvr.g(r3)
            boolean r0 = defpackage.axst.b()
            if (r0 == 0) goto L6b
            boolean r0 = defpackage.qde.j(r3)
            if (r0 == 0) goto L6b
            qdk r0 = defpackage.prh.G(r3)
            qrd r5 = defpackage.qre.b()
            r6 = 1
            com.google.android.gms.common.Feature[] r6 = new com.google.android.gms.common.Feature[r6]
            r7 = 0
            com.google.android.gms.common.Feature r8 = defpackage.qcv.c
            r6[r7] = r8
            r5.b = r6
            qdq r6 = new qdq
            r6.<init>()
            r5.a = r6
            r6 = 1515(0x5eb, float:2.123E-42)
            r5.c = r6
            qre r5 = r5.a()
            qob r0 = (defpackage.qob) r0
            rpt r0 = r0.w(r5)
            java.lang.String r5 = "account change events retrieval"
            java.lang.Object r0 = defpackage.qde.d(r0, r5)     // Catch: defpackage.qnx -> L67
            com.google.android.gms.auth.AccountChangeEventsResponse r0 = (com.google.android.gms.auth.AccountChangeEventsResponse) r0     // Catch: defpackage.qnx -> L67
            defpackage.qde.k(r0)     // Catch: defpackage.qnx -> L67
            java.util.List r0 = r0.b     // Catch: defpackage.qnx -> L67
            goto L78
        L67:
            r0 = move-exception
            defpackage.qde.i(r0, r5)
        L6b:
            qdb r0 = new qdb
            r0.<init>(r4)
            android.content.ComponentName r4 = defpackage.qde.c
            java.lang.Object r0 = defpackage.qde.c(r3, r4, r0)
            java.util.List r0 = (java.util.List) r0
        L78:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            int r4 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r4)
        L89:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto La3
            java.lang.Object r4 = r0.previous()
            com.google.android.gms.auth.AccountChangeEvent r4 = (com.google.android.gms.auth.AccountChangeEvent) r4
            r5 = -1
            if (r1 == r5) goto L9f
            int r5 = r4.b()
            if (r5 < r1) goto L9f
            goto La3
        L9f:
            r3.add(r4)
            goto L89
        La3:
            java.util.Iterator r0 = r3.iterator()
            r1 = r14
        La8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lea
            java.lang.Object r1 = r0.next()
            com.google.android.gms.auth.AccountChangeEvent r1 = (com.google.android.gms.auth.AccountChangeEvent) r1
            int r16 = r1.b()
            int r3 = r1.a()
            r4 = 3
            if (r3 != r4) goto Le3
            java.lang.String r1 = r1.c()
            r3 = r17
            r4 = r16
            r5 = r1
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r21
            r3.n(r1, r2)
            goto Le5
        Le3:
            r3 = r21
        Le5:
            r14 = r17
            r1 = r16
            goto La8
        Lea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbs.a(int, int, java.lang.String, android.content.SharedPreferences, wdd, wdm, wco, wkk, wgv, wiz, ypa, azrw):int");
    }

    public static long aA(long j, apwy apwyVar) {
        long j2;
        if ((apwyVar.b & 262144) != 0) {
            atfq atfqVar = apwyVar.o;
            if (atfqVar == null) {
                atfqVar = atfq.a;
            }
            j2 = atfqVar.c;
        } else {
            j2 = 52428800;
        }
        return Math.max(0L, j - j2);
    }

    public static long aB(apwy apwyVar, File file) {
        return aA(yjk.G(file), apwyVar);
    }

    public static Intent aC() {
        return new Intent().setAction("android.intent.action.SEND").setType("text/plain").setFlags(524288);
    }

    public static Intent aD(Context context, String str, Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent createChooser = Intent.createChooser(aM(context, str, uri), context.getText(R.string.send_playlist));
        createChooser.addFlags(268435456);
        createChooser.addFlags(262144);
        return createChooser;
    }

    public static Intent aE(Context context, String str, Uri uri) {
        String p = zhq.p(str);
        Uri ak = ak(uri);
        if (ak == null) {
            return null;
        }
        Intent createChooser = Intent.createChooser(aM(context, p, ak), context.getText(R.string.send_video));
        createChooser.addFlags(268435456);
        createChooser.addFlags(262144);
        return createChooser;
    }

    public static List aF(PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(aC(), 65536)) {
            if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.applicationInfo != null && resolveInfo.activityInfo.applicationInfo.packageName != null) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public static void aG(Context context, String str, Uri uri) {
        Intent aD = aD(context, str, uri);
        if (aD != null) {
            context.startActivity(aD);
        } else {
            zga.l("Share playlist error: empty playlist url");
        }
    }

    public static void aH(Context context, String str, Uri uri) {
        Intent aE = aE(context, str, uri);
        if (aE != null) {
            context.startActivity(aE);
        } else {
            zga.l("Share video error: null watch uri");
        }
    }

    private static Resources.NotFoundException aI(int i) {
        return new Resources.NotFoundException(String.format("Attribute not defined by theme (attr = %d)", Integer.valueOf(i)));
    }

    private static void aJ(int i) {
        if (i == 0) {
            throw new IllegalArgumentException(String.format("Invalid attribute resource ID (%d)", 0));
        }
    }

    private static String aK(String str) {
        try {
            new URI(str);
            return str;
        } catch (URISyntaxException unused) {
            Uri parse = Uri.parse(str);
            try {
                try {
                    String encode = Uri.encode(parse.getEncodedAuthority(), "%,;:$&+=@[]");
                    String encode2 = Uri.encode(parse.getEncodedPath(), "%,;:$&+=/@");
                    String uri = parse.buildUpon().encodedAuthority(encode).encodedPath(encode2).encodedQuery(Uri.encode(parse.getEncodedQuery(), "%,;:$&+=/[]@?")).build().toString();
                    new URI(uri);
                    return uri;
                } catch (URISyntaxException unused2) {
                    return Uri.encode(str, ":/");
                }
            } catch (URISyntaxException unused3) {
                String encode3 = Uri.encode(parse.getEncodedAuthority(), ",;:$&+=@[]");
                String encode4 = Uri.encode(parse.getEncodedPath(), ",;:$&+=/@");
                String uri2 = parse.buildUpon().encodedAuthority(encode3).encodedPath(encode4).encodedQuery(Uri.encode(parse.getEncodedQuery(), ",;:$&+=/@[]?")).build().toString();
                new URI(uri2);
                return uri2;
            }
        }
    }

    private static String aL(Resources resources, String str, int i) {
        int parseInt;
        if (str != null) {
            try {
                parseInt = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
            int abs = Math.abs(parseInt);
            return resources.getQuantityString(i, abs, Integer.valueOf(abs));
        }
        parseInt = 0;
        int abs2 = Math.abs(parseInt);
        return resources.getQuantityString(i, abs2, Integer.valueOf(abs2));
    }

    private static Intent aM(Context context, String str, Uri uri) {
        if (str == null) {
            str = context.getString(R.string.share_untitled);
        }
        String b = ajm.a().b(str);
        Intent aC = aC();
        String string = context.getString(R.string.share_subject, b);
        String string2 = context.getString(R.string.share_text, b, uri);
        aC.putExtra("android.intent.extra.SUBJECT", string);
        aC.putExtra("android.intent.extra.TEXT", string2);
        return aC;
    }

    public static long aa(long j, long j2) {
        return j != 0 ? j : j2;
    }

    public static String ab(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(str);
        sb.append("(Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str3 = Build.MODEL;
        if (str3.length() > 0) {
            sb.append("; ");
            sb.append(str3);
        }
        String str4 = Build.ID;
        if (str4.length() > 0) {
            sb.append(" Build/");
            sb.append(str4);
        }
        sb.append(')');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(' ');
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String ac(byte[] bArr) {
        Scanner scanner = new Scanner(new GZIPInputStream(new ByteArrayInputStream(bArr)));
        scanner.useDelimiter("\\A");
        try {
            return scanner.hasNext() ? scanner.next() : "";
        } finally {
            scanner.close();
        }
    }

    public static String ad(TelephonyManager telephonyManager) {
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (true == TextUtils.isEmpty(networkCountryIso)) {
            networkCountryIso = "";
        }
        String replace = networkCountryIso.trim().replace(",", "");
        if (replace.length() > 2) {
            replace = replace.substring(0, 2);
        }
        return zhq.l(replace);
    }

    public static boolean ae(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle)) {
                if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
                    if (!obj.equals(obj2)) {
                        return false;
                    }
                } else if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if (!ae((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
        }
        return true;
    }

    public static synchronized byte[] af(byte[] bArr) {
        byte[] digest;
        synchronized (wbs.class) {
            synchronized (zib.class) {
                digest = zib.a.digest(bArr);
            }
        }
        return digest;
    }

    public static byte[] ag(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static Uri ah(String str) {
        return ao(str, "", -1, 0L);
    }

    public static Uri ai(String str) {
        Uri parse = Uri.parse(aK(str));
        if (parse.isAbsolute()) {
            return parse;
        }
        throw new MalformedURLException("Uri must have an absolute scheme");
    }

    public static Uri aj(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return parse.buildUpon().scheme("https").build();
        }
        if (str.contains("://") || !str.contains(":")) {
            return parse;
        }
        if (!str.startsWith("//")) {
            str = str.length() != 0 ? "//".concat(str) : new String("//");
        }
        String valueOf = String.valueOf(str);
        return Uri.parse(valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:"));
    }

    public static Uri ak(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("v");
            return (host == null || !host.contains("youtube.com") || TextUtils.isEmpty(queryParameter)) ? uri : new Uri.Builder().scheme(uri.getScheme()).authority("youtu.be").appendPath(queryParameter).build();
        } catch (UnsupportedOperationException unused) {
            return uri;
        }
    }

    public static boolean al(Uri uri) {
        uri.getClass();
        return "https".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean am(String str) {
        return al(Uri.parse(str));
    }

    public static boolean an(Uri uri) {
        return "127.0.0.1".equals(uri.getHost()) || "localhost".equals(uri.getHost());
    }

    public static Uri ao(String str, String str2, int i, long j) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("www.youtube.com").appendPath("watch").appendQueryParameter("v", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("list", str2);
            if (i != -1) {
                appendQueryParameter.appendQueryParameter("index", String.valueOf(i));
            }
        }
        if (j != 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("t=");
            sb.append(j);
            appendQueryParameter.encodedFragment(sb.toString());
        }
        return appendQueryParameter.build();
    }

    static int ap(int i) {
        return (1 << i) - 1;
    }

    public static int aq(int i, int i2) {
        return i | (i2 << 6);
    }

    public static int ar(long j) {
        return (int) (j & 4294967295L);
    }

    public static int as(int i) {
        return ap(i >> 6);
    }

    public static int at(int i) {
        return i & ap(6);
    }

    public static int au(int i, int i2) {
        return (i >> at(i2)) & as(i2);
    }

    public static int av(int i, int i2, int i3) {
        int at = at(i2);
        int as = as(i2);
        return (i & ((as << at) ^ (-1))) | ((as & Math.max(0, Math.min(i3, as))) << at);
    }

    public static long aw(int i, int i2) {
        return i | (i2 << 32);
    }

    public static boolean ax(long j, int i) {
        return au((int) (j >> 32), i) != au(ar(j), i);
    }

    public static CharSequence ay(Resources resources, CharSequence charSequence) {
        String str;
        int i;
        Object obj;
        resources.getClass();
        charSequence.getClass();
        List h = amnm.b(':').h(charSequence.toString());
        if (h.size() >= 3) {
            str = aL(resources, (String) h.get(0), R.plurals.accessibility_duration_description_hours);
            i = 1;
        } else {
            str = null;
            i = 0;
        }
        if (i < h.size()) {
            obj = aL(resources, (String) h.get(i), R.plurals.accessibility_duration_description_minutes);
            i++;
        } else {
            obj = null;
        }
        Object aL = i < h.size() ? aL(resources, (String) h.get(i), R.plurals.accessibility_duration_description_seconds) : null;
        if (!TextUtils.isEmpty(str)) {
            return resources.getString(R.string.accessibility_duration_hour, str, obj, aL);
        }
        return resources.getString(R.string.accessibility_duration_minutes, obj, aL);
    }

    public static String az(long j) {
        if (j < 0) {
            return "";
        }
        long seconds = j / Duration.ofHours(1L).toSeconds();
        long seconds2 = j - (Duration.ofHours(1L).toSeconds() * seconds);
        long seconds3 = seconds2 / Duration.ofMinutes(1L).toSeconds();
        long seconds4 = seconds2 - (Duration.ofMinutes(1L).toSeconds() * seconds3);
        StringBuilder sb = new StringBuilder();
        if (seconds > 0) {
            sb.append(seconds);
            sb.append(":");
            if (seconds3 < 10) {
                sb.append('0');
            }
        }
        sb.append(seconds3);
        sb.append(":");
        if (seconds4 < 10) {
            sb.append('0');
        }
        sb.append(seconds4);
        return sb.toString();
    }

    public static anhy b(final afsx afsxVar, final wkk wkkVar, Executor executor) {
        return anaf.S(new Callable() { // from class: vzt
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            
                if (r1.d(r2) != false) goto L15;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r5 = this;
                    afsx r0 = defpackage.afsx.this
                    wkk r1 = r2
                    boolean r2 = r0 instanceof com.google.android.libraries.youtube.account.identity.AccountIdentity
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L2f
                    boolean r2 = r0.z()
                    if (r2 == 0) goto L11
                    goto L2f
                L11:
                    r2 = r0
                    com.google.android.libraries.youtube.account.identity.AccountIdentity r2 = (com.google.android.libraries.youtube.account.identity.AccountIdentity) r2     // Catch: java.lang.Exception -> L2f
                    java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L2f
                    android.accounts.Account r2 = r1.b(r2)     // Catch: java.lang.Exception -> L2f
                    boolean r0 = defpackage.wbs.d(r0)     // Catch: java.lang.Exception -> L2f
                    if (r0 != 0) goto L2f
                    boolean r0 = r1.e(r2)     // Catch: java.lang.Exception -> L2f
                    if (r0 != 0) goto L30
                    boolean r0 = r1.d(r2)     // Catch: java.lang.Exception -> L2f
                    if (r0 == 0) goto L2f
                    goto L30
                L2f:
                    r3 = 0
                L30:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vzt.call():java.lang.Object");
            }
        }, executor);
    }

    public static boolean c(afsx afsxVar) {
        if (!(afsxVar instanceof AccountIdentity)) {
            return false;
        }
        AccountIdentity accountIdentity = (AccountIdentity) afsxVar;
        return accountIdentity.j() || accountIdentity.f();
    }

    public static boolean d(afsx afsxVar) {
        if (afsxVar instanceof AccountIdentity) {
            AccountIdentity accountIdentity = (AccountIdentity) afsxVar;
            if ((accountIdentity.j() || accountIdentity.f()) && !accountIdentity.i()) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(afsx afsxVar) {
        return (afsxVar instanceof AccountIdentity) && c(afsxVar) && ((AccountIdentity) afsxVar).l() == 3;
    }

    public static afvb f(Context context, afqb afqbVar, aftj aftjVar) {
        return new afvm(context, afqbVar, aftjVar);
    }

    public static afvb g(Context context, afqb afqbVar, aftj aftjVar) {
        return new afvm(context, afqbVar, aftjVar);
    }

    public static void h(dd ddVar, afsp afspVar, apxf apxfVar) {
        waa waaVar = (waa) ddVar.f("INCOGNITO_BOTTOM_SHEET_FRAGMENT");
        if (waaVar != null) {
            waaVar.ah = apxfVar;
            if (waaVar.ar()) {
                return;
            }
            waaVar.qi(ddVar, "INCOGNITO_BOTTOM_SHEET_FRAGMENT");
            return;
        }
        waa waaVar2 = new waa();
        Bundle bundle = new Bundle();
        if (apxfVar != null) {
            bundle.putByteArray("endpoint", apxfVar.toByteArray());
        }
        waaVar2.af(bundle);
        waaVar2.ag = afspVar;
        waaVar2.qi(ddVar, "INCOGNITO_BOTTOM_SHEET_FRAGMENT");
    }

    public static void i(ylf ylfVar, aadw aadwVar) {
        aotz aotzVar = aadwVar.b().i;
        if (aotzVar == null) {
            aotzVar = aotz.a;
        }
        long j = (aotzVar.b & 512) != 0 ? aotzVar.f : 0L;
        if (j > 0) {
            ylfVar.d("AccountsRemovedTask", j, 0L, true, 0, false, null, null);
        }
        ylfVar.e("IdentityStoreBackfillTask", 0L, true, 0, null, null, false);
    }

    public static int j(PlayerConfigModel playerConfigModel) {
        int i;
        atyi atyiVar = playerConfigModel.c;
        if ((atyiVar.b & 16777216) != 0) {
            aoym aoymVar = atyiVar.q;
            if (aoymVar == null) {
                aoymVar = aoym.a;
            }
            i = aoymVar.b;
        } else {
            i = -1;
        }
        int convert = i >= 0 ? (int) TimeUnit.SECONDS.convert(i, TimeUnit.MILLISECONDS) : -1;
        if (convert < 0) {
            return 5000;
        }
        return (int) TimeUnit.MILLISECONDS.convert(convert, TimeUnit.SECONDS);
    }

    public static apbs k(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null) {
            return apbs.a;
        }
        apbs apbsVar = aaeaVar.a().o;
        return apbsVar == null ? apbs.a : apbsVar;
    }

    public static boolean l(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.v;
    }

    public static boolean m(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.j;
    }

    public static boolean n(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.n;
    }

    public static boolean o(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.i;
    }

    public static boolean p(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.x;
    }

    public static boolean q(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.t;
    }

    public static boolean r(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.m;
    }

    public static boolean s(aaea aaeaVar) {
        return k(aaeaVar).f;
    }

    public static boolean t(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.q;
    }

    public static boolean u(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.p;
    }

    public static boolean v(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.u;
    }

    public static boolean w(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.o;
    }

    public static boolean x(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.e;
    }

    public static boolean y(aaea aaeaVar) {
        apbs k = k(aaeaVar);
        return k != null && k.d;
    }

    public static apbn z(aadw aadwVar) {
        if (aadwVar == null || aadwVar.b() == null) {
            return apbn.b;
        }
        apbn apbnVar = aadwVar.b().f;
        return apbnVar == null ? apbn.b : apbnVar;
    }

    public void F(Deque deque, Attributes attributes, String str) {
    }

    public void G(Deque deque, Attributes attributes) {
    }
}
