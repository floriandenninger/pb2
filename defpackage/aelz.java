package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelz {
    public static final amsx a = amvs.a;

    static {
        ammr.b(",");
    }

    public static Uri a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
    }

    public static arxh b(arxj arxjVar, aelb aelbVar, String str) {
        aekz a2 = aelbVar.a(arxjVar.toByteArray());
        aone createBuilder = arxh.a.createBuilder();
        createBuilder.copyOnWrite();
        arxh arxhVar = (arxh) createBuilder.instance;
        str.getClass();
        arxhVar.b |= 64;
        arxhVar.i = str;
        aone createBuilder2 = arnb.a.createBuilder();
        aone createBuilder3 = armz.a.createBuilder();
        createBuilder3.copyOnWrite();
        armz armzVar = (armz) createBuilder3.instance;
        armzVar.b |= 1048576;
        armzVar.l = "0";
        army armyVar = army.ANDROID;
        createBuilder3.copyOnWrite();
        armz armzVar2 = (armz) createBuilder3.instance;
        armzVar2.p = armyVar.ay;
        armzVar2.b |= 16777216;
        createBuilder3.copyOnWrite();
        armz armzVar3 = (armz) createBuilder3.instance;
        armzVar3.b |= 67108864;
        armzVar3.r = "10.29";
        createBuilder3.copyOnWrite();
        armz armzVar4 = (armz) createBuilder3.instance;
        armzVar4.b |= 1;
        armzVar4.e = "zz";
        createBuilder3.copyOnWrite();
        armz armzVar5 = (armz) createBuilder3.instance;
        armzVar5.b |= 8;
        armzVar5.h = "ZZ";
        createBuilder2.copyOnWrite();
        arnb arnbVar = (arnb) createBuilder2.instance;
        armz armzVar6 = (armz) createBuilder3.build();
        armzVar6.getClass();
        arnbVar.c = armzVar6;
        arnbVar.b |= 1;
        arnb arnbVar2 = (arnb) createBuilder2.build();
        createBuilder.copyOnWrite();
        arxh arxhVar2 = (arxh) createBuilder.instance;
        arnbVar2.getClass();
        arxhVar2.c = arnbVar2;
        arxhVar2.b |= 1;
        aomf aomfVar = a2.a;
        createBuilder.copyOnWrite();
        arxh arxhVar3 = (arxh) createBuilder.instance;
        arxhVar3.b |= 2;
        arxhVar3.d = aomfVar;
        aomf aomfVar2 = a2.b;
        createBuilder.copyOnWrite();
        arxh arxhVar4 = (arxh) createBuilder.instance;
        arxhVar4.b |= 8;
        arxhVar4.f = aomfVar2;
        aomf aomfVar3 = a2.c;
        createBuilder.copyOnWrite();
        arxh arxhVar5 = (arxh) createBuilder.instance;
        arxhVar5.b |= 4;
        arxhVar5.e = aomfVar3;
        aomf aomfVar4 = a2.d;
        createBuilder.copyOnWrite();
        arxh arxhVar6 = (arxh) createBuilder.instance;
        arxhVar6.b |= 16;
        arxhVar6.g = aomfVar4;
        createBuilder.copyOnWrite();
        arxh arxhVar7 = (arxh) createBuilder.instance;
        arxhVar7.b |= 32;
        arxhVar7.h = true;
        return (arxh) createBuilder.build();
    }

    public static String c(String str) {
        zhq.m(str);
        anbp anbpVar = anbp.e;
        ammc ammcVar = ammc.b;
        String charSequence = str.toString();
        int c = ammcVar.c(charSequence, 0);
        if (c != -1) {
            char[] charArray = charSequence.toCharArray();
            int i = 1;
            loop0: while (true) {
                c++;
                while (c != charArray.length) {
                    if (ammcVar.b(charArray[c])) {
                        break;
                    }
                    charArray[c - i] = charArray[c];
                    c++;
                }
                i++;
            }
            charSequence = new String(charArray, 0, c - i);
        }
        byte[] j = anbpVar.j(charSequence);
        StringBuilder sb = new StringBuilder();
        for (byte b : j) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static String d(zhy zhyVar, aely aelyVar, List list) {
        zhyVar.g("por", "yes");
        int i = aelyVar.b;
        if (i > 0) {
            zhyVar.g("ohrtt", Integer.toString(i));
        }
        f(list, aelyVar.c, zhyVar);
        return aelyVar.a;
    }

    public static String e(String str) {
        return (str.equals("redirector.googlevideo.com") || !str.endsWith(".googlevideo.com") || str.endsWith(".a1.googlevideo.com")) ? str : str.replaceFirst(".googlevideo.com", ".a1.googlevideo.com");
    }

    public static void f(List list, Uri uri, zhy zhyVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String queryParameter = uri == null ? null : uri.getQueryParameter(str);
            if (queryParameter == null) {
                zhyVar.j(str);
            } else {
                zhyVar.g(str, queryParameter);
            }
        }
    }

    public static void g(String str) {
        j(str, new Exception());
    }

    public static arxi[] h(Map map, String str) {
        arxi[] arxiVarArr = new arxi[map.size() + 1];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            aone createBuilder = arxi.a.createBuilder();
            String str2 = (String) entry.getKey();
            createBuilder.copyOnWrite();
            arxi arxiVar = (arxi) createBuilder.instance;
            str2.getClass();
            arxiVar.b |= 1;
            arxiVar.c = str2;
            String str3 = (String) entry.getValue();
            createBuilder.copyOnWrite();
            arxi arxiVar2 = (arxi) createBuilder.instance;
            str3.getClass();
            arxiVar2.b |= 2;
            arxiVar2.d = str3;
            arxiVarArr[i] = (arxi) createBuilder.build();
            i++;
        }
        aone createBuilder2 = arxi.a.createBuilder();
        createBuilder2.copyOnWrite();
        arxi arxiVar3 = (arxi) createBuilder2.instance;
        arxiVar3.b |= 1;
        arxiVar3.c = "User-Agent";
        String concat = String.valueOf(str).concat(" gzip");
        createBuilder2.copyOnWrite();
        arxi arxiVar4 = (arxi) createBuilder2.instance;
        concat.getClass();
        arxiVar4.b |= 2;
        arxiVar4.d = concat;
        arxiVarArr[i] = (arxi) createBuilder2.build();
        return arxiVarArr;
    }

    public static aelc i(aaea aaeaVar, aadw aadwVar, shf shfVar) {
        aarh aarhVar = (aarh) aaeaVar.c;
        long j = aarhVar.i() ? aarhVar.h.b : aarhVar.g;
        long c = shfVar.c() - j;
        atcl atclVar = aaeaVar.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atsh atshVar = atclVar.d;
        if (atshVar == null) {
            atshVar = atsh.a;
        }
        if ((atshVar.b & 1) != 0) {
            atsh atshVar2 = atclVar.d;
            if (atshVar2 == null) {
                atshVar2 = atsh.a;
            }
            if ((atshVar2.b & 2) != 0) {
                atsh atshVar3 = atclVar.d;
                if (atshVar3 == null) {
                    atshVar3 = atsh.a;
                }
                if (atshVar3.e > 0) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    atsh atshVar4 = atclVar.d;
                    if (atshVar4 == null) {
                        atshVar4 = atsh.a;
                    }
                    long millis = timeUnit.toMillis(atshVar4.e);
                    if (j < 0 || c >= millis) {
                        throw new aelx(2);
                    }
                    atsh atshVar5 = atclVar.d;
                    if (atshVar5 == null) {
                        atshVar5 = atsh.a;
                    }
                    byte[] I = atshVar5.c.I();
                    atsh atshVar6 = atclVar.d;
                    if (atshVar6 == null) {
                        atshVar6 = atsh.a;
                    }
                    return new aelc(I, atshVar6.d.I());
                }
            }
        }
        atej atejVar = aadwVar.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        aadwVar.c();
        aarh aarhVar2 = (aarh) aadwVar.a;
        long j2 = aarhVar2.i() ? aarhVar2.i.c : aarhVar2.f;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        long convert = TimeUnit.SECONDS.convert(shfVar.c() - j2, TimeUnit.MILLISECONDS);
        if ((atejVar.b & 1073741824) == 0) {
            throw new aelx(1);
        }
        atse atseVar = atejVar.s;
        if (atseVar == null) {
            atseVar = atse.b;
        }
        if (convert < 0 || convert > atseVar.f) {
            throw new aelx(2);
        }
        return new aelc(atseVar.d.I(), atseVar.e.I());
    }

    public static void j(String str, Exception exc) {
        String format = String.format(Locale.ENGLISH, "%.2f", Double.valueOf(0.01d));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(format).length());
        sb.append(str);
        sb.append(" [sample rate: ");
        sb.append(format);
        sb.append("]");
        afsi.d(1, 8, sb.toString(), exc, 0.01d);
        afid.c(afic.ONESIE, exc, "Warning message: %s", str);
    }

    public static List k(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            Uri uri = formatStreamModel.d;
            if (uri != null && !TextUtils.isEmpty(uri.getHost())) {
                arrayList.add(uri.toString());
            } else {
                String str = true != TextUtils.isEmpty(formatStreamModel.a.e) ? "url is not empty" : "url is empty";
                int e = formatStreamModel.e();
                StringBuilder sb = new StringBuilder(str.length() + 35);
                sb.append("Invalid URL for itag ");
                sb.append(e);
                sb.append(" : ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return arrayList;
    }
}
