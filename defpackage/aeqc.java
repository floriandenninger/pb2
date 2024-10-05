package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeqc extends afvw {
    public final afsx a;
    public final aftj b;
    private final Context c;
    private final byte[] k;
    private final amru l;
    private final afwx m;
    private Map n;

    public aeqc(Context context, String str, byte[] bArr, amru amruVar, afsx afsxVar, aftj aftjVar, afwx afwxVar) {
        super(2, str, afwxVar);
        this.c = context;
        this.k = bArr;
        afki.a(afsxVar);
        this.a = afsxVar;
        this.b = aftjVar;
        this.m = afwxVar;
        this.l = amruVar;
        t();
        this.f = new aeqb(this);
    }

    private static aeqd x(Context context, cnh cnhVar) {
        try {
            String l = ach.l(cnhVar.c);
            byte[] bArr = cnhVar.b;
            String str = new String(bArr, l);
            if (!str.startsWith("GLS/1.")) {
                throw new IOException("Invalid response from server. Expected GLS/1.x");
            }
            int indexOf = str.indexOf("\r\n\r\n");
            if (indexOf == -1) {
                throw new IOException("Invalid response from server. Could not locate DRM message");
            }
            String[] split = str.substring(0, indexOf).split("\r\n");
            Matcher matcher = Pattern.compile("GLS/[0-9]+\\.[0-9]+ ([0-9]+) (.*)").matcher(split[0]);
            if (!matcher.find()) {
                throw new Exception("pattern not found.");
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            HashMap hashMap = new HashMap();
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].split(": ");
                hashMap.put(split2[0], split2[1]);
            }
            return new aeqd(context, parseInt, Arrays.copyOfRange(bArr, indexOf + 4, bArr.length), hashMap);
        } catch (Exception e) {
            throw new cnj(e);
        }
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final afsx e() {
        return this.a;
    }

    @Override // defpackage.yvo
    public final Map f() {
        return this.n;
    }

    @Override // defpackage.yvo
    public final boolean h() {
        return true;
    }

    @Override // defpackage.yvo
    public final yvn i() {
        return yvn.IMMEDIATE;
    }

    @Override // defpackage.yvo
    public final String m() {
        return Uri.parse(this.d).buildUpon().appendQueryParameter("rn", Integer.toString(this.f.a())).build().toString();
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        try {
            aeqd x = x(this.c, cnhVar);
            return x.a == 0 ? cnm.b(x, null) : cnm.a(new aeqe(x));
        } catch (cnj e) {
            return cnm.a(e);
        }
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
        ((anfm) this.m).o((aeqf) obj);
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.n = new HashMap();
        amru amruVar = this.l;
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            try {
                ((afvb) amruVar.get(i)).b(this.n, this);
            } catch (cnb e) {
                afsi.b(1, 6, "AuthFailure while initialization request headers.");
                afid.b(afic.DRM, "WindvineGlsRequest: AuthFailureError %s", e.toString());
            }
        }
    }

    @Override // defpackage.afvw
    public final List v() {
        byte[] bArr;
        StringBuilder sb = new StringBuilder("curl ");
        for (String str : this.n.keySet()) {
            sb.append("-H \"");
            sb.append(str);
            sb.append(":");
            sb.append((String) this.n.get(str));
            sb.append("\" ");
        }
        sb.append("--data-binary @<(echo '");
        try {
            bArr = this.k;
        } catch (cnb unused) {
            bArr = afvw.o;
        }
        sb.append(Base64.encodeToString(bArr, 2));
        sb.append("' | base64 -d - ) '");
        sb.append(m());
        sb.append("'");
        return Collections.singletonList(sb.toString());
    }

    @Override // defpackage.afvw
    public final synchronized List w(cnh cnhVar) {
        ArrayList arrayList;
        try {
            aeqd x = x(this.c, cnhVar);
            arrayList = new ArrayList();
            arrayList.add("GLS response logging with binary data converted into base64");
            int i = cnhVar.a;
            StringBuilder sb = new StringBuilder(20);
            sb.append("Status: ");
            sb.append(i);
            sb.append("\n");
            arrayList.add(sb.toString());
            for (String str : cnhVar.c.keySet()) {
                String str2 = (String) cnhVar.c.get(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
                sb2.append("Header:");
                sb2.append(str);
                sb2.append(":");
                sb2.append(str2);
                sb2.append("\n");
                arrayList.add(sb2.toString());
            }
            int i2 = x.a;
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("GLS Status: ");
            sb3.append(i2);
            sb3.append("\n");
            arrayList.add(sb3.toString());
            Map map = x.c;
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 13 + String.valueOf(str4).length());
                sb4.append("GLS Header:");
                sb4.append(str3);
                sb4.append(":");
                sb4.append(str4);
                sb4.append("\n");
                arrayList.add(sb4.toString());
            }
            byte[] bArr = x.b;
            if (bArr != null) {
                String valueOf = String.valueOf(Base64.encodeToString(bArr, 2));
                arrayList.addAll(zhq.q(valueOf.length() != 0 ? "GLS response in base64: ".concat(valueOf) : new String("GLS response in base64: ")));
            } else {
                arrayList.add("GLS Response had no data.");
            }
        } catch (cnj unused) {
            return super.w(cnhVar);
        }
        return arrayList;
    }
}
