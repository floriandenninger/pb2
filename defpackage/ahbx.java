package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import j$.net.URLEncoder;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahbx {

    @Backup
    public static final String QUICK_SEEK_PREFERENCE_STRING = "double_tap_skip_duration";

    public static void A(ruv ruvVar) {
        dsm dsmVar = new dsm(0, (byte[]) null);
        rwd rwdVar = ruvVar.D;
        rwe.E(dsmVar);
        rwdVar.h = dsmVar;
        dsm dsmVar2 = new dsm(0, (byte[]) null);
        rwd rwdVar2 = ruvVar.D;
        rwe.E(dsmVar2);
        rwdVar2.g = dsmVar2;
        dsm dsmVar3 = new dsm(0, (byte[]) null);
        rwd rwdVar3 = ruvVar.D;
        rwe.E(dsmVar3);
        rwdVar3.d = dsmVar3;
        dsm dsmVar4 = new dsm(0, (byte[]) null);
        rwd rwdVar4 = ruvVar.D;
        rwe.E(dsmVar4);
        rwdVar4.c = dsmVar4;
    }

    public static List B(List list, List list2) {
        ArrayList aO = amkq.aO();
        for (int i = 0; i < list.size(); i++) {
            aO.add(Double.valueOf(((Double) list.get(i)).doubleValue() - ((Double) list2.get(i)).doubleValue()));
        }
        return aO;
    }

    public static boolean C(sba sbaVar, final List list, final awtm awtmVar) {
        awtf awtfVar;
        final NumberFormat D;
        awte awteVar;
        final int i = 0;
        if (list.size() == sbaVar.a() && (awtmVar.b != 2 || ((awtf) awtmVar.c).b.size() == sbaVar.a())) {
            int i2 = awtmVar.d;
            if (i2 != 4) {
                if (i2 == 4) {
                    awtfVar = (awtf) awtmVar.e;
                } else {
                    awtfVar = awtf.a;
                }
                if (awtfVar.b.size() == sbaVar.a()) {
                    sbb sbbVar = sbb.c;
                    String str = awtmVar.f;
                    ajun ajunVar = sbaVar.c;
                    sbt.g(sbbVar, "key");
                    ajunVar.a.put(sbbVar, str);
                    int i3 = awtmVar.b;
                    final int i4 = 1;
                    if (i3 == 2) {
                        sbaVar.f(sax.f, new saw() { // from class: akol
                            @Override // defpackage.saw
                            public final Object a(Object obj, int i5, sba sbaVar2) {
                                awtf awtfVar2;
                                awtf awtfVar3;
                                if (i4 == 0) {
                                    awtm awtmVar2 = awtmVar;
                                    if (awtmVar2.d == 4) {
                                        awtfVar2 = (awtf) awtmVar2.e;
                                    } else {
                                        awtfVar2 = awtf.a;
                                    }
                                    return (String) awtfVar2.b.get(i5);
                                }
                                awtm awtmVar3 = awtmVar;
                                if (awtmVar3.b == 2) {
                                    awtfVar3 = (awtf) awtmVar3.c;
                                } else {
                                    awtfVar3 = awtf.a;
                                }
                                return (String) awtfVar3.b.get(i5);
                            }
                        });
                    } else {
                        int i5 = i3 != 0 ? i3 != 5 ? i3 != 2 ? i3 != 3 ? 0 : 2 : 1 : 3 : 4;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i6 == 1) {
                            D = akbc.D();
                        } else if (i6 == 2) {
                            if (i3 == 5) {
                                awteVar = (awte) awtmVar.c;
                            } else {
                                awteVar = awte.a;
                            }
                            D = akbc.C(awteVar.b);
                        } else {
                            D = DecimalFormat.getInstance(Locale.getDefault());
                        }
                        sbaVar.f(sax.f, new saw() { // from class: akom
                            @Override // defpackage.saw
                            public final Object a(Object obj, int i7, sba sbaVar2) {
                                return D.format(list.get(i7));
                            }
                        });
                    }
                    sbaVar.f(sax.g, new saw() { // from class: akol
                        @Override // defpackage.saw
                        public final Object a(Object obj, int i52, sba sbaVar2) {
                            awtf awtfVar2;
                            awtf awtfVar3;
                            if (i == 0) {
                                awtm awtmVar2 = awtmVar;
                                if (awtmVar2.d == 4) {
                                    awtfVar2 = (awtf) awtmVar2.e;
                                } else {
                                    awtfVar2 = awtf.a;
                                }
                                return (String) awtfVar2.b.get(i52);
                            }
                            awtm awtmVar3 = awtmVar;
                            if (awtmVar3.b == 2) {
                                awtfVar3 = (awtf) awtmVar3.c;
                            } else {
                                awtfVar3 = awtf.a;
                            }
                            return (String) awtfVar3.b.get(i52);
                        }
                    });
                    return true;
                }
            }
        }
        return false;
    }

    public static void D(rve rveVar) {
        rveVar.setImportantForAccessibility(2);
    }

    public static void E(dd ddVar, ce ceVar) {
        dn k = ddVar.k();
        k.w(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        k.y(R.id.element_fragment, ceVar);
        k.s(null);
        k.a();
    }

    public static String F(akne akneVar) {
        String str = File.separator;
        String valueOf = String.valueOf(akneVar.b);
        String concat = valueOf.length() != 0 ? "BLOB_STORAGE.".concat(valueOf) : new String("BLOB_STORAGE.");
        try {
            concat = URLEncoder.encode(concat, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        String str2 = File.separator;
        String str3 = akneVar.c;
        try {
            String str4 = akneVar.a;
            try {
                str4 = URLEncoder.encode(str4, "UTF-8");
            } catch (UnsupportedEncodingException unused2) {
            }
            String encode = URLEncoder.encode(str3, "UTF-8");
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(encode).length());
            sb.append(str4);
            sb.append(".");
            sb.append(encode);
            str3 = sb.toString();
        } catch (UnsupportedEncodingException unused3) {
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(concat);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static void G(shf shfVar, final Snackbar snackbar, aaci aaciVar, long j, aahd aahdVar, Integer num) {
        apmg apmgVar;
        Spanned spanned = (Spanned) aaciVar.f().b(akpw.b).b(aipq.u).f();
        String str = null;
        aqyg aqygVar = null;
        if (TextUtils.isEmpty(spanned) || !aaciVar.f().h()) {
            if (!aaciVar.e().h()) {
                return;
            }
            atnc atncVar = (atnc) aaciVar.e().c();
            aqyg aqygVar2 = atncVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar2);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            apmh apmhVar = atncVar.d;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) != 0) {
                apmh apmhVar2 = atncVar.d;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmgVar = apmhVar2.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            } else {
                apmgVar = null;
            }
            if (apmgVar != null) {
                if ((apmgVar.b & 256) != 0) {
                    aqyg aqygVar3 = apmgVar.i;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    str = ajcq.b(aqygVar3).toString();
                }
                apxf apxfVar = apmgVar.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                snackbar.e(b, str, K(aaciVar, snackbar, aahdVar, apxfVar));
            } else {
                snackbar.d(b);
            }
        } else {
            atnz atnzVar = (atnz) aaciVar.f().c();
            int i = atnzVar.b;
            if ((i & 4) != 0) {
                if ((i & 2) != 0 && (aqygVar = atnzVar.d) == null) {
                    aqygVar = aqyg.a;
                }
                String obj = ajcq.b(aqygVar).toString();
                apxf apxfVar2 = atnzVar.e;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                snackbar.e(spanned, obj, K(aaciVar, snackbar, aahdVar, apxfVar2));
                if (num != null) {
                    snackbar.c.setTextColor(num.intValue());
                }
            } else {
                snackbar.d(spanned);
            }
        }
        Handler handler = snackbar.getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(snackbar);
            uyr uyrVar = snackbar.a;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(snackbar, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", snackbar.getHeight(), 0.0f));
            ofPropertyValuesHolder.addListener(new uza(snackbar));
            uyrVar.a();
            if (uyrVar.a.b()) {
                uyrVar.b = ofPropertyValuesHolder;
                uyrVar.b.start();
            }
            snackbar.getClass();
            handler.postAtTime(new Runnable() { // from class: akmt
                @Override // java.lang.Runnable
                public final void run() {
                    Snackbar.this.c();
                }
            }, snackbar, shfVar.g() + j);
        }
    }

    public static auru H(auru auruVar, ResolveInfo resolveInfo) {
        apxf apxfVar = auruVar.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (!apxfVar.pY(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)) {
            return auruVar;
        }
        aone builder = auruVar.toBuilder();
        apxf apxfVar2 = ((auru) builder.instance).f;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aone builder2 = ((SendShareEndpoint$SendShareExternallyEndpoint) apxfVar2.pX(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).toBuilder();
        String str = resolveInfo.activityInfo.applicationInfo.packageName;
        String str2 = resolveInfo.activityInfo.name;
        arlf arlfVar = ((SendShareEndpoint$SendShareExternallyEndpoint) builder2.instance).d;
        if (arlfVar == null) {
            arlfVar = arlf.a;
        }
        aone builder3 = arlfVar.toBuilder();
        if (builder3 != null) {
            arlf arlfVar2 = (arlf) builder3.instance;
            if ((arlfVar2.b & 1) != 0) {
                aurn aurnVar = arlfVar2.c;
                if (aurnVar == null) {
                    aurnVar = aurn.a;
                }
                aone builder4 = aurnVar.toBuilder();
                builder4.copyOnWrite();
                aurn aurnVar2 = (aurn) builder4.instance;
                str.getClass();
                aurnVar2.b |= 2;
                aurnVar2.d = str;
                builder4.copyOnWrite();
                aurn aurnVar3 = (aurn) builder4.instance;
                str2.getClass();
                aurnVar3.b |= 4;
                aurnVar3.e = str2;
                builder3.copyOnWrite();
                arlf arlfVar3 = (arlf) builder3.instance;
                aurn aurnVar4 = (aurn) builder4.build();
                aurnVar4.getClass();
                arlfVar3.c = aurnVar4;
                arlfVar3.b |= 1;
            }
        }
        builder2.copyOnWrite();
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint) builder2.instance;
        arlf arlfVar4 = (arlf) builder3.build();
        arlfVar4.getClass();
        sendShareEndpoint$SendShareExternallyEndpoint.d = arlfVar4;
        sendShareEndpoint$SendShareExternallyEndpoint.b |= 2;
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint) builder2.instance;
        if ((sendShareEndpoint$SendShareExternallyEndpoint2.b & 4) != 0) {
            arle arleVar = sendShareEndpoint$SendShareExternallyEndpoint2.e;
            if (arleVar == null) {
                arleVar = arle.a;
            }
            if ((arleVar.b & 2) != 0) {
                apxf apxfVar3 = arleVar.d;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                if (apxfVar3.pY(AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
                    apxf apxfVar4 = arleVar.d;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    aong aongVar = (aong) apxfVar4.toBuilder();
                    aone builder5 = ((apcn) aongVar.pX(AndroidApplicationEndpointOuterClass.androidAppEndpoint)).toBuilder();
                    builder5.copyOnWrite();
                    apcn apcnVar = (apcn) builder5.instance;
                    str.getClass();
                    apcnVar.b |= 1;
                    apcnVar.c = str;
                    builder5.copyOnWrite();
                    apcn apcnVar2 = (apcn) builder5.instance;
                    str2.getClass();
                    apcnVar2.b |= 2;
                    apcnVar2.d = str2;
                    apcn apcnVar3 = (apcn) builder5.build();
                    aone builder6 = arleVar.toBuilder();
                    aongVar.e(AndroidApplicationEndpointOuterClass.androidAppEndpoint, apcnVar3);
                    builder6.copyOnWrite();
                    arle arleVar2 = (arle) builder6.instance;
                    apxf apxfVar5 = (apxf) aongVar.build();
                    apxfVar5.getClass();
                    arleVar2.d = apxfVar5;
                    arleVar2.b |= 2;
                    arle arleVar3 = (arle) builder6.build();
                    builder2.copyOnWrite();
                    SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint3 = (SendShareEndpoint$SendShareExternallyEndpoint) builder2.instance;
                    arleVar3.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint3.e = arleVar3;
                    sendShareEndpoint$SendShareExternallyEndpoint3.b |= 4;
                }
            }
        }
        apxf apxfVar6 = ((auru) builder.instance).f;
        if (apxfVar6 == null) {
            apxfVar6 = apxf.a;
        }
        aong aongVar2 = (aong) apxfVar6.toBuilder();
        aongVar2.e(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (SendShareEndpoint$SendShareExternallyEndpoint) builder2.build());
        builder.copyOnWrite();
        auru auruVar2 = (auru) builder.instance;
        apxf apxfVar7 = (apxf) aongVar2.build();
        apxfVar7.getClass();
        auruVar2.f = apxfVar7;
        auruVar2.b |= 16;
        return (auru) builder.build();
    }

    public static Integer I(String str, apet apetVar) {
        if (apetVar != null && !TextUtils.isEmpty(str)) {
            for (apeu apeuVar : apetVar.b) {
                if (TextUtils.equals(str, apeuVar.c)) {
                    return Integer.valueOf(apeuVar.b);
                }
            }
        }
        return null;
    }

    public static List J(Collection collection, apet apetVar) {
        if (collection == null || apetVar == null || apetVar.b.size() == 0) {
            return Collections.emptyList();
        }
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.applicationInfo.packageName;
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList(hashSet.size());
        for (apeu apeuVar : apetVar.b) {
            if (hashSet.contains(apeuVar.c)) {
                arrayList.add(Integer.valueOf(apeuVar.b));
            }
        }
        return arrayList;
    }

    private static View.OnClickListener K(final aaci aaciVar, final Snackbar snackbar, final aahd aahdVar, final apxf apxfVar) {
        return new View.OnClickListener() { // from class: akms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aaci aaciVar2 = aaci.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar2 = apxfVar;
                Snackbar snackbar2 = snackbar;
                HashMap hashMap = new HashMap();
                if (aaciVar2.g() != null) {
                    hashMap.putAll(aaciVar2.g());
                }
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ((ammv) aaciVar2.h()).f());
                if (aahdVar2 != null) {
                    aahdVar2.c(apxfVar2, hashMap);
                }
                snackbar2.c();
            }
        };
    }

    public static void c(ahvc ahvcVar) {
        ahvcVar.nf();
    }

    public static void d(ahvc ahvcVar, atyq atyqVar, boolean z) {
        aqyg aqygVar = atyqVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        ahvcVar.nh(ajcq.b(aqygVar).toString(), z);
    }

    public static int e(int i, String str) {
        return i == 0 ? !TextUtils.isEmpty(str) ? 0 : -1 : i;
    }

    public static apih f(aryi aryiVar) {
        apii apiiVar;
        apii apiiVar2;
        if (!j(aryiVar) && aryiVar != null && (aryiVar.b & 1024) != 0) {
            arxz arxzVar = aryiVar.j;
            if (arxzVar == null) {
                arxzVar = arxz.a;
            }
            if (arxzVar.b == 64657230) {
                apiiVar = (apii) arxzVar.c;
            } else {
                apiiVar = apii.a;
            }
            if ((apiiVar.b & 2) != 0) {
                arxz arxzVar2 = aryiVar.j;
                if (arxzVar2 == null) {
                    arxzVar2 = arxz.a;
                }
                if (arxzVar2.b == 64657230) {
                    apiiVar2 = (apii) arxzVar2.c;
                } else {
                    apiiVar2 = apii.a;
                }
                apih apihVar = apiiVar2.d;
                return apihVar == null ? apih.a : apihVar;
            }
        }
        return null;
    }

    public static aqdt g(aryi aryiVar) {
        if ((aryiVar.b & 32) != 0) {
            aryh aryhVar = aryiVar.g;
            if (aryhVar == null) {
                aryhVar = aryh.a;
            }
            if (aryhVar.b == 64099105) {
                aryh aryhVar2 = aryiVar.g;
                if (aryhVar2 == null) {
                    aryhVar2 = aryh.a;
                }
                if (aryhVar2.b == 64099105) {
                    return (aqdt) aryhVar2.c;
                }
                return aqdt.a;
            }
        }
        return null;
    }

    public static atsb h(aryi aryiVar) {
        if (aryiVar == null) {
            return null;
        }
        aryd arydVar = aryiVar.l;
        if (arydVar == null) {
            arydVar = aryd.a;
        }
        if (arydVar.b != 60572968) {
            return null;
        }
        aryd arydVar2 = aryiVar.l;
        if (arydVar2 == null) {
            arydVar2 = aryd.a;
        }
        if (arydVar2.b == 60572968) {
            return (atsb) arydVar2.c;
        }
        return atsb.a;
    }

    public static atyt i(aryi aryiVar) {
        atyt atytVar;
        if (aryiVar != null && (aryiVar.b & 32) != 0) {
            aryh aryhVar = aryiVar.g;
            if (aryhVar == null) {
                aryhVar = aryh.a;
            }
            if (aryhVar.b == 73238862) {
                aryh aryhVar2 = aryiVar.g;
                if (aryhVar2 == null) {
                    aryhVar2 = aryh.a;
                }
                if (aryhVar2.b == 73238862) {
                    atytVar = (atyt) aryhVar2.c;
                } else {
                    atytVar = atyt.a;
                }
            } else {
                atytVar = null;
            }
            if (atytVar != null && !atytVar.c.isEmpty()) {
                int i = atytVar.b;
                if ((i & 4) != 0 && (i & 2) != 0) {
                    return atytVar;
                }
            }
        }
        return null;
    }

    public static boolean j(aryi aryiVar) {
        apii apiiVar;
        if (aryiVar != null && (aryiVar.b & 1024) != 0) {
            arxz arxzVar = aryiVar.j;
            if (arxzVar == null) {
                arxzVar = arxz.a;
            }
            if (arxzVar.b == 64657230) {
                arxz arxzVar2 = aryiVar.j;
                if (arxzVar2 == null) {
                    arxzVar2 = arxz.a;
                }
                if (arxzVar2.b == 64657230) {
                    apiiVar = (apii) arxzVar2.c;
                } else {
                    apiiVar = apii.a;
                }
            } else {
                apiiVar = null;
            }
            if (apiiVar != null && apiiVar.c) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(aryi aryiVar) {
        int bG;
        return (aryiVar == null || (aryiVar.b & 131072) == 0 || (bG = anaf.bG(aryiVar.c)) == 0 || bG != 7) ? false : true;
    }

    public static boolean l(aryi aryiVar) {
        if (aryiVar == null) {
            return false;
        }
        int bG = anaf.bG(aryiVar.c);
        return bG == 0 || bG == 1;
    }

    public static boolean m(aryi aryiVar) {
        if (aryiVar == null) {
            return false;
        }
        int bG = anaf.bG(aryiVar.c);
        if (bG == 0) {
            bG = 1;
        }
        return bG == 1 || bG == 4 || bG == 5 || bG == 6 || bG == 10;
    }

    public static boolean n(aryi aryiVar) {
        if (aryiVar == null || (aryiVar.b & 131072) == 0) {
            return false;
        }
        aryc arycVar = aryiVar.n;
        if (arycVar == null) {
            arycVar = aryc.a;
        }
        asti astiVar = arycVar.c;
        if (astiVar == null) {
            astiVar = asti.a;
        }
        return astiVar.h;
    }

    public static int o(int i) {
        switch (i) {
            case 0:
                return 9;
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 17;
            case 4:
                return 18;
            case 5:
                return 20;
            case 6:
                return 33;
            case 7:
            default:
                return 34;
            case 8:
                return 36;
        }
    }

    public static int p(Attributes attributes, int i, String... strArr) {
        for (String str : strArr) {
            String value = attributes.getValue(str);
            if (value != null) {
                return zhq.b(value, i);
            }
        }
        return i;
    }

    public static int q(float f) {
        return (int) (f * 1000.0f);
    }

    public static long r(Attributes attributes, long j, String... strArr) {
        for (int i = 0; i <= 0; i++) {
            String value = attributes.getValue(strArr[i]);
            if (value != null) {
                return zhq.c(value, j);
            }
        }
        return j;
    }

    public static String s(Attributes attributes, String... strArr) {
        for (String str : strArr) {
            String value = attributes.getValue(str);
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public static String t(Attributes attributes, String str, String... strArr) {
        for (int i = 0; i <= 0; i++) {
            String value = attributes.getValue(strArr[i]);
            if (value != null) {
                return value;
            }
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ boolean u(Attributes attributes, String[] strArr) {
        return p(attributes, 0, strArr) != 0;
    }

    public static Uri v(Context context) {
        return whl.s(context, "player", "backed_up_player_settings.pb");
    }

    public static ajun w() {
        HashMap hashMap = new HashMap();
        hashMap.put("/transcript", new aisr());
        hashMap.put("/transcript/text", new aisq());
        hashMap.put("/timedtext", new aisp());
        hashMap.put("/timedtext/window", new aiso());
        hashMap.put("/timedtext/text", new aisy());
        hashMap.put("/timedtext/head/pen", new aisx());
        hashMap.put("/timedtext/head/ws", new aisw());
        hashMap.put("/timedtext/head/wp", new aisv());
        hashMap.put("/timedtext/body/w", new aisu());
        hashMap.put("/timedtext/body/p", new aist());
        hashMap.put("/timedtext/body/p/s", new aiss());
        return wbs.P(hashMap);
    }

    public static int x(Context context) {
        return wbs.Q(context, R.attr.ytTextDisabled);
    }

    public static int y(Context context) {
        return wbs.Q(context, R.attr.yt10PercentLayer);
    }

    public static void z(ruv ruvVar, final akos akosVar) {
        Context context = ruvVar.getContext();
        rzu rzuVar = new rzu() { // from class: akot
            @Override // defpackage.rzu
            public final View a(List list) {
                akos akosVar2 = akos.this;
                akosVar2.g.removeAllViews();
                int i = 0;
                while (i < list.size()) {
                    rzt rztVar = (rzt) list.get(i);
                    String str = (akosVar2.i.size() <= i || ((List) akosVar2.i.get(i)).size() <= rztVar.b) ? "" : (String) ((List) akosVar2.i.get(i)).get(rztVar.b);
                    if (!str.isEmpty()) {
                        TextView textView = (TextView) akosVar2.h.inflate(R.layout.chart_touch_tooltip_value_item, (ViewGroup) akosVar2.g, false);
                        textView.setVisibility(0);
                        textView.setText(str);
                        akosVar2.g.addView(textView);
                    }
                    i++;
                }
                return akosVar2;
            }
        };
        rzy rzyVar = new rzy(context);
        rzyVar.c = rzuVar;
        ajbh ajbhVar = new ajbh((int[]) null);
        ajbhVar.i = 1;
        rzyVar.e = ajbhVar;
        rzz rzzVar = rzyVar.a;
        rzzVar.a = context.getResources().getDimensionPixelSize(R.dimen.touch_tooltip_corner_radius);
        rzzVar.b = context.getResources().getDimensionPixelSize(R.dimen.touch_tooltip_arrow_base_size);
        rzzVar.c = context.getResources().getDimensionPixelSize(R.dimen.touch_tooltip_arrow_height);
        rzzVar.e = wbs.Q(context, R.attr.yt10PercentLayer);
        rzzVar.d = wbs.Q(context, R.attr.ytBrandBackgroundSolid);
        rzyVar.g.a(rzyVar.a);
        ruvVar.u(rzyVar, "touch_card_behavior");
        rzh rzhVar = new rzh();
        ruvVar.y = true;
        rzk rzkVar = ruvVar.x;
        if (rzkVar != null) {
            rzkVar.d(ruvVar.r());
        }
        ruvVar.x = rzhVar;
        ruvVar.x.c(ruvVar.r());
        if (ruvVar.n) {
            return;
        }
        ruvVar.n = true;
        ruvVar.y(new rur(ruvVar));
    }

    public Uri a(Uri uri) {
        return uri;
    }

    public boolean b(Uri uri) {
        return false;
    }
}
