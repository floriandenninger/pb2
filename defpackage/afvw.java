package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afvw extends yvo implements afvp {
    public static final byte[] o = new byte[0];
    public static final cnf p = new cnf("x-youtube-fut-processed", "true");

    public afvw(int i, String str, cnk cnkVar) {
        super(i, str, cnkVar);
    }

    public static boolean B(cnh cnhVar) {
        List list = cnhVar.d;
        return list != null && list.contains(p);
    }

    public afsx e() {
        return afsw.a;
    }

    @Override // defpackage.afvp
    public final String g() {
        return m();
    }

    public String u() {
        return null;
    }

    public List v() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basic CURL command:");
        try {
            Map f = f();
            for (String str : f.keySet()) {
                if (!str.equals("Content-Type")) {
                    sb.append("-H \"");
                    sb.append(str);
                    sb.append(":");
                    sb.append((String) f.get(str));
                    sb.append("\" ");
                }
            }
            sb.append("'");
            sb.append(m());
            sb.append("'");
            return Collections.singletonList(sb.toString());
        } catch (cnb e) {
            zga.d("Auth failure.", e);
            return amru.r("Received exception while trying to get logs.");
        }
    }

    public synchronized List w(cnh cnhVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.add("Default response logging.");
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
        byte[] bArr = cnhVar.b;
        if (bArr != null) {
            int length = bArr.length;
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Actual data length: ");
            sb3.append(length);
            arrayList.add(sb3.toString());
            arrayList.addAll(zhq.q(new String(cnhVar.b)));
        } else {
            arrayList.add("Response had no data.");
        }
        return arrayList;
    }

    public boolean z() {
        return false;
    }

    public afvw(String str, yvn yvnVar, cnk cnkVar) {
        super(1, str, yvnVar, cnkVar, false);
    }

    public afvw(yvn yvnVar, cnk cnkVar, boolean z) {
        super(2, "", yvnVar, cnkVar, z);
    }
}
