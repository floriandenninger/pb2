package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public /* synthetic */ class akbc {
    public static boolean A(ynx ynxVar) {
        avdy e = ynxVar.e();
        if (e.c) {
            avdw avdwVar = e.e;
            if (avdwVar == null) {
                avdwVar = avdw.a;
            }
            if (avdwVar.b) {
                avdw avdwVar2 = e.e;
                if (avdwVar2 == null) {
                    avdwVar2 = avdw.a;
                }
                if (avdwVar2.g) {
                    return true;
                }
                avdw avdwVar3 = e.e;
                if (avdwVar3 == null) {
                    avdwVar3 = avdw.a;
                }
                return avdwVar3.p;
            }
        }
        return false;
    }

    public static NumberFormat C(String str) {
        Currency currency = Currency.getInstance(str);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.getDefault());
        decimalFormat.setCurrency(currency);
        decimalFormat.setMaximumFractionDigits(0);
        return decimalFormat;
    }

    public static NumberFormat D() {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getPercentInstance(Locale.getDefault());
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setMaximumFractionDigits(1);
        decimalFormat.setMultiplier(1);
        return decimalFormat;
    }

    private static void E(amrp amrpVar, atda atdaVar) {
        if (atdaVar != null) {
            amrpVar.h(atdaVar);
        }
    }

    private static amru F(atda atdaVar, Object obj, lru lruVar, aalw aalwVar) {
        amrp amrpVar = new amrp();
        if (l(atdaVar) == 1) {
            apxf dl = adyu.dl(atdaVar);
            if (dl == null || !dl.pY(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
                apxf dl2 = adyu.dl(atdaVar);
                if (dl2 == null || !dl2.pY(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
                    apxf dl3 = adyu.dl(atdaVar);
                    if (dl3 == null || !dl3.pY(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)) {
                        E(amrpVar, atdaVar);
                    }
                } else if (aalwVar != null) {
                    E(amrpVar, aalwVar.b(atdaVar, obj));
                }
            } else if (aalwVar != null) {
                amrpVar.j(aalwVar.a(atdaVar, obj));
            }
        } else if (lruVar != null) {
            int l = l(atdaVar) - 1;
            if (l == 1) {
                if (lruVar.a.g() != null) {
                    E(amrpVar, atdaVar);
                }
            } else {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Unknown menu visibility condition: ");
                sb.append(l);
                zga.l(sb.toString());
            }
        }
        return amrpVar.g();
    }

    public static akbf b(Context context) {
        context.getClass();
        return d(context) + (-1) != 0 ? akbe.a : akbe.b;
    }

    public static final String c() {
        String language = Locale.getDefault().getLanguage();
        return (language == null || language.length() != 2) ? "en" : language;
    }

    public static int d(Context context) {
        try {
            int Z = wbs.Z(context);
            if (Z == 0) {
                return 1;
            }
            if (Z == 1) {
                return 2;
            }
            throw new akbi(Z);
        } catch (Resources.NotFoundException e) {
            throw new akbh(e);
        }
    }

    public static View.OnLayoutChangeListener e(final TextView textView, final int i) {
        return new View.OnLayoutChangeListener() { // from class: ajyh
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                TextView textView2 = textView;
                int i10 = i;
                Drawable drawable = textView2.getCompoundDrawablesRelative()[0];
                if (drawable != null) {
                    drawable.setBounds(0, 0, i10, i10);
                    textView2.setCompoundDrawablesRelative(drawable, null, null, null);
                    yny.z(textView2, yny.n(i10 + textView2.getPaddingTop() + textView2.getPaddingBottom()), ViewGroup.LayoutParams.class);
                }
            }
        };
    }

    public static int f(arfa arfaVar) {
        int i;
        int i2;
        if (arfaVar != null && (i2 = arfaVar.e) > 0) {
            return i2;
        }
        if (arfaVar == null || (i = arfaVar.d) == 0) {
            return 3;
        }
        return i;
    }

    public static int g(avvq avvqVar) {
        int i;
        if (avvqVar == null || (i = avvqVar.d) == 0) {
            return 3;
        }
        return i;
    }

    public static arfa h(ausu ausuVar) {
        ausw auswVar = ausuVar.r;
        if (auswVar == null) {
            auswVar = ausw.a;
        }
        if ((auswVar.b & 4) == 0) {
            return null;
        }
        ausw auswVar2 = ausuVar.r;
        if (auswVar2 == null) {
            auswVar2 = ausw.a;
        }
        arfa arfaVar = auswVar2.e;
        return arfaVar == null ? arfa.a : arfaVar;
    }

    public static avvq i(ausu ausuVar) {
        ausw auswVar = ausuVar.r;
        if (auswVar == null) {
            auswVar = ausw.a;
        }
        if ((auswVar.b & 8) == 0) {
            return null;
        }
        ausw auswVar2 = ausuVar.r;
        if (auswVar2 == null) {
            auswVar2 = ausw.a;
        }
        avvq avvqVar = auswVar2.f;
        return avvqVar == null ? avvq.a : avvqVar;
    }

    public static amru j(atdc atdcVar, Object obj, lru lruVar, aalw aalwVar) {
        amrp amrpVar = new amrp();
        Iterator it = atdcVar.c.iterator();
        while (it.hasNext()) {
            amrpVar.j(F((atda) it.next(), obj, lruVar, aalwVar));
        }
        return amrpVar.g();
    }

    public static boolean k(atdc atdcVar, Object obj, lru lruVar, aalw aalwVar) {
        Iterator it = atdcVar.c.iterator();
        while (it.hasNext()) {
            if (!F((atda) it.next(), obj, lruVar, aalwVar).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static int l(atda atdaVar) {
        int i = atdaVar.b;
        if ((i & 16) != 0) {
            atcw atcwVar = atdaVar.g;
            if (atcwVar == null) {
                atcwVar = atcw.a;
            }
            int cn = anaf.cn(atcwVar.g);
            if (cn == 0) {
                return 1;
            }
            return cn;
        }
        if ((i & 32) == 0) {
            return 1;
        }
        atcx atcxVar = atdaVar.h;
        if (atcxVar == null) {
            atcxVar = atcx.a;
        }
        int cn2 = anaf.cn(atcxVar.g);
        if (cn2 == 0) {
            return 1;
        }
        return cn2;
    }

    public static Object m(ammv ammvVar, Object obj) {
        return ammvVar.h() ? ((ajtk) ammvVar.c()).a(obj) : obj;
    }

    static File n(Context context, akth akthVar) {
        return new File(context.getCacheDir(), akthVar.e);
    }

    static File o(aktg aktgVar, akth akthVar) {
        File n = n(aktgVar.b, akthVar);
        long j = aktgVar.c;
        String str = akthVar.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append(j);
        sb.append("_");
        sb.append(str);
        return new File(n, sb.toString());
    }

    public static List p(aktg aktgVar, akth akthVar) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File n = n(aktgVar.b, akthVar);
        try {
            fileArr = n.listFiles();
        } catch (SecurityException e) {
            r(String.format("TerminationJournal !journals '%s'", n), e);
            fileArr = null;
        }
        if (fileArr != null) {
            File o = o(aktgVar, akthVar);
            for (File file : fileArr) {
                if (!file.getName().equals(o.getName())) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public static void q(File file) {
        yjk.x(file, aarc.c);
    }

    public static void r(String str, Throwable th) {
        String d = ammx.d(str);
        if (th == null) {
            afsi.b(1, 27, d);
        } else {
            afsi.c(1, 27, d, th);
        }
    }

    public static void s(aktg aktgVar, aooy aooyVar, akth akthVar) {
        File o = o(aktgVar, akthVar);
        try {
            OutputStream w = yjk.w(o);
            try {
                aooyVar.writeTo(w);
                w.close();
            } catch (Throwable th) {
                try {
                    w.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e) {
            q(o);
            r(String.format("TerminationJournal !write '%s'", o), e);
        }
    }

    public static File t(aktg aktgVar) {
        return o(aktgVar, akth.ANR);
    }

    public static void u(aktg aktgVar, apfe apfeVar) {
        s(aktgVar, apfeVar, akth.ANR);
    }

    public static usb v(int i, usj usjVar) {
        usa c = usb.c();
        c.c(true);
        if (usjVar != null) {
            c.a = usjVar;
        }
        if (i > 0) {
            c.b(i);
        }
        return c.a();
    }

    public static void w(String str, Bundle bundle) {
        int dataSize;
        if (bundle == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj == null) {
                dataSize = 0;
            } else {
                Parcel obtain = Parcel.obtain();
                obtain.writeValue(obj);
                dataSize = obtain.dataSize();
                obtain.recycle();
            }
            Locale locale = Locale.US;
            Integer valueOf = Integer.valueOf(dataSize);
            String.format(locale, "onSaveInstanceState entry: class: %s, key: %s, size: %d", str, str2, valueOf);
            if (dataSize > 512000) {
                String valueOf2 = String.valueOf(str2);
                afsi.c(1, 27, valueOf2.length() != 0 ? "Bundle value size (on N+) too large for key:".concat(valueOf2) : new String("Bundle value size (on N+) too large for key:"), new Exception(String.format(Locale.US, "class:%s,size:%d", str, valueOf)));
            }
        }
    }

    public static ysb x(ynx ynxVar, azrw azrwVar) {
        if (A(ynxVar)) {
            return (ysb) azrwVar.get();
        }
        return null;
    }

    public static ywp y(Context context, anib anibVar, String str, vfg vfgVar) {
        vda a = vdb.a(context);
        a.e("systemhealth");
        a.f("system_health.pb");
        Uri a2 = a.a();
        vfk d = vfn.d(context, anibVar);
        d.b();
        d.c = str;
        d.d((String[]) amkq.bo(amqp.e(aksi.values()).f(akpw.a).h(), String.class));
        d.e(adgt.j);
        vfn a3 = d.a();
        vfe a4 = vff.a();
        a4.f(a2);
        a4.e(awwt.a);
        a4.b(a3);
        return new ywp(agcm.e(vfgVar.a(a4.a())), awwt.a);
    }

    public static Executor z(ynx ynxVar, azrw azrwVar) {
        if (A(ynxVar)) {
            return (Executor) azrwVar.get();
        }
        return null;
    }

    public String a() {
        String country = Locale.getDefault().getCountry();
        if (country == null || country.length() != 2) {
            country = "us";
        }
        return country.toLowerCase(Locale.ENGLISH);
    }

    public static rxu B(final awtk awtkVar) {
        awte awteVar;
        int i = awtkVar.b;
        final int i2 = 0;
        int i3 = 3;
        final int i4 = 1;
        final int i5 = 2;
        if (i == 0) {
            i3 = 4;
        } else if (i == 2) {
            i3 = 1;
        } else if (i == 3) {
            i3 = 2;
        } else if (i != 4) {
            i3 = 0;
        }
        int i6 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i6 == 0) {
            return new rxu() { // from class: akov
                @Override // defpackage.rxu
                public final List a(List list) {
                    awtk awtkVar2 = awtk.this;
                    return (awtkVar2.b == 2 ? (awtf) awtkVar2.c : awtf.a).b;
                }
            };
        }
        if (i6 == 1) {
            final NumberFormat D = D();
            return new rxu() { // from class: akow
                @Override // defpackage.rxu
                public final List a(List list) {
                    int i7 = i4;
                    if (i7 == 0) {
                        awtk awtkVar2 = awtkVar;
                        final NumberFormat numberFormat = D;
                        final int i8 = 2;
                        return (List) Collection.EL.stream(awtkVar2.d).map(new Function() { // from class: akox
                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function andThen(Function function) {
                                int i9 = i8;
                                if (i9 != 0) {
                                    return i9 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                                }
                                return Function.CC.$default$andThen(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function compose(Function function) {
                                int i9 = i8;
                                if (i9 != 0) {
                                    return i9 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                                }
                                return Function.CC.$default$compose(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final Object apply(Object obj) {
                                int i9 = i8;
                                if (i9 == 0) {
                                    return numberFormat.format(((Double) obj).doubleValue() * 100.0d);
                                }
                                if (i9 == 1) {
                                    return numberFormat.format((Double) obj);
                                }
                                return numberFormat.format(((Double) obj).doubleValue() / 1000.0d);
                            }
                        }).collect(Collectors.toList());
                    }
                    final int i9 = 1;
                    if (i7 == 1) {
                        awtk awtkVar3 = awtkVar;
                        final NumberFormat numberFormat2 = D;
                        final int i10 = 0;
                        return (List) Collection.EL.stream(awtkVar3.d).map(new Function() { // from class: akox
                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function andThen(Function function) {
                                int i92 = i10;
                                if (i92 != 0) {
                                    return i92 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                                }
                                return Function.CC.$default$andThen(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function compose(Function function) {
                                int i92 = i10;
                                if (i92 != 0) {
                                    return i92 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                                }
                                return Function.CC.$default$compose(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final Object apply(Object obj) {
                                int i92 = i10;
                                if (i92 == 0) {
                                    return numberFormat2.format(((Double) obj).doubleValue() * 100.0d);
                                }
                                if (i92 == 1) {
                                    return numberFormat2.format((Double) obj);
                                }
                                return numberFormat2.format(((Double) obj).doubleValue() / 1000.0d);
                            }
                        }).collect(Collectors.toList());
                    }
                    awtk awtkVar4 = awtkVar;
                    final NumberFormat numberFormat3 = D;
                    Stream stream = Collection.EL.stream(awtkVar4.d);
                    numberFormat3.getClass();
                    return (List) stream.map(new Function() { // from class: akox
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            int i92 = i9;
                            if (i92 != 0) {
                                return i92 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                            }
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            int i92 = i9;
                            if (i92 != 0) {
                                return i92 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                            }
                            return Function.CC.$default$compose(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            int i92 = i9;
                            if (i92 == 0) {
                                return numberFormat3.format(((Double) obj).doubleValue() * 100.0d);
                            }
                            if (i92 == 1) {
                                return numberFormat3.format((Double) obj);
                            }
                            return numberFormat3.format(((Double) obj).doubleValue() / 1000.0d);
                        }
                    }).collect(Collectors.toList());
                }
            };
        }
        if (i6 == 2) {
            if (i == 4) {
                awteVar = (awte) awtkVar.c;
            } else {
                awteVar = awte.a;
            }
            final NumberFormat C = C(awteVar.b);
            return new rxu() { // from class: akow
                @Override // defpackage.rxu
                public final List a(List list) {
                    int i7 = i2;
                    if (i7 == 0) {
                        awtk awtkVar2 = awtkVar;
                        final NumberFormat numberFormat = C;
                        final int i8 = 2;
                        return (List) Collection.EL.stream(awtkVar2.d).map(new Function() { // from class: akox
                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function andThen(Function function) {
                                int i92 = i8;
                                if (i92 != 0) {
                                    return i92 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                                }
                                return Function.CC.$default$andThen(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function compose(Function function) {
                                int i92 = i8;
                                if (i92 != 0) {
                                    return i92 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                                }
                                return Function.CC.$default$compose(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final Object apply(Object obj) {
                                int i92 = i8;
                                if (i92 == 0) {
                                    return numberFormat.format(((Double) obj).doubleValue() * 100.0d);
                                }
                                if (i92 == 1) {
                                    return numberFormat.format((Double) obj);
                                }
                                return numberFormat.format(((Double) obj).doubleValue() / 1000.0d);
                            }
                        }).collect(Collectors.toList());
                    }
                    final int i9 = 1;
                    if (i7 == 1) {
                        awtk awtkVar3 = awtkVar;
                        final NumberFormat numberFormat2 = C;
                        final int i10 = 0;
                        return (List) Collection.EL.stream(awtkVar3.d).map(new Function() { // from class: akox
                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function andThen(Function function) {
                                int i92 = i10;
                                if (i92 != 0) {
                                    return i92 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                                }
                                return Function.CC.$default$andThen(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function compose(Function function) {
                                int i92 = i10;
                                if (i92 != 0) {
                                    return i92 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                                }
                                return Function.CC.$default$compose(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final Object apply(Object obj) {
                                int i92 = i10;
                                if (i92 == 0) {
                                    return numberFormat2.format(((Double) obj).doubleValue() * 100.0d);
                                }
                                if (i92 == 1) {
                                    return numberFormat2.format((Double) obj);
                                }
                                return numberFormat2.format(((Double) obj).doubleValue() / 1000.0d);
                            }
                        }).collect(Collectors.toList());
                    }
                    awtk awtkVar4 = awtkVar;
                    final NumberFormat numberFormat3 = C;
                    Stream stream = Collection.EL.stream(awtkVar4.d);
                    numberFormat3.getClass();
                    return (List) stream.map(new Function() { // from class: akox
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            int i92 = i9;
                            if (i92 != 0) {
                                return i92 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                            }
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            int i92 = i9;
                            if (i92 != 0) {
                                return i92 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                            }
                            return Function.CC.$default$compose(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            int i92 = i9;
                            if (i92 == 0) {
                                return numberFormat3.format(((Double) obj).doubleValue() * 100.0d);
                            }
                            if (i92 == 1) {
                                return numberFormat3.format((Double) obj);
                            }
                            return numberFormat3.format(((Double) obj).doubleValue() / 1000.0d);
                        }
                    }).collect(Collectors.toList());
                }
            };
        }
        final NumberFormat decimalFormat = DecimalFormat.getInstance(Locale.getDefault());
        return new rxu() { // from class: akow
            @Override // defpackage.rxu
            public final List a(List list) {
                int i7 = i5;
                if (i7 == 0) {
                    awtk awtkVar2 = awtkVar;
                    final NumberFormat numberFormat = decimalFormat;
                    final int i8 = 2;
                    return (List) Collection.EL.stream(awtkVar2.d).map(new Function() { // from class: akox
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            int i92 = i8;
                            if (i92 != 0) {
                                return i92 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                            }
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            int i92 = i8;
                            if (i92 != 0) {
                                return i92 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                            }
                            return Function.CC.$default$compose(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            int i92 = i8;
                            if (i92 == 0) {
                                return numberFormat.format(((Double) obj).doubleValue() * 100.0d);
                            }
                            if (i92 == 1) {
                                return numberFormat.format((Double) obj);
                            }
                            return numberFormat.format(((Double) obj).doubleValue() / 1000.0d);
                        }
                    }).collect(Collectors.toList());
                }
                final int i9 = 1;
                if (i7 == 1) {
                    awtk awtkVar3 = awtkVar;
                    final NumberFormat numberFormat2 = decimalFormat;
                    final int i10 = 0;
                    return (List) Collection.EL.stream(awtkVar3.d).map(new Function() { // from class: akox
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            int i92 = i10;
                            if (i92 != 0) {
                                return i92 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                            }
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            int i92 = i10;
                            if (i92 != 0) {
                                return i92 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                            }
                            return Function.CC.$default$compose(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            int i92 = i10;
                            if (i92 == 0) {
                                return numberFormat2.format(((Double) obj).doubleValue() * 100.0d);
                            }
                            if (i92 == 1) {
                                return numberFormat2.format((Double) obj);
                            }
                            return numberFormat2.format(((Double) obj).doubleValue() / 1000.0d);
                        }
                    }).collect(Collectors.toList());
                }
                awtk awtkVar4 = awtkVar;
                final NumberFormat numberFormat3 = decimalFormat;
                Stream stream = Collection.EL.stream(awtkVar4.d);
                numberFormat3.getClass();
                return (List) stream.map(new Function() { // from class: akox
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        int i92 = i9;
                        if (i92 != 0) {
                            return i92 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                        }
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        int i92 = i9;
                        if (i92 != 0) {
                            return i92 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                        }
                        return Function.CC.$default$compose(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        int i92 = i9;
                        if (i92 == 0) {
                            return numberFormat3.format(((Double) obj).doubleValue() * 100.0d);
                        }
                        if (i92 == 1) {
                            return numberFormat3.format((Double) obj);
                        }
                        return numberFormat3.format(((Double) obj).doubleValue() / 1000.0d);
                    }
                }).collect(Collectors.toList());
            }
        };
    }
}
