package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvo implements cqi {
    public URL b;
    private final cvp c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;
    private int h;

    public cvo(String str) {
        cvp cvpVar = cvp.a;
        this.d = null;
        did.ar(str);
        this.e = str;
        did.ap(cvpVar);
        this.c = cvpVar;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        URL url = this.d;
        did.ap(url);
        return url.toString();
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f)) {
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                URL url = this.d;
                did.ap(url);
                str = url.toString();
            }
            this.f = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f;
    }

    public final Map d() {
        cvp cvpVar = this.c;
        cvs cvsVar = (cvs) cvpVar;
        if (cvsVar.c == null) {
            synchronized (cvpVar) {
                if (((cvs) cvpVar).c == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((cvs) cvpVar).b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = ((cvr) list.get(i)).a;
                            if (!TextUtils.isEmpty(str)) {
                                sb.append(str);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(sb2)) {
                            hashMap.put((String) entry.getKey(), sb2);
                        }
                    }
                    ((cvs) cvpVar).c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return cvsVar.c;
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof cvo) {
            cvo cvoVar = (cvo) obj;
            if (b().equals(cvoVar.b()) && this.c.equals(cvoVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int hashCode = b().hashCode();
        this.h = hashCode;
        int hashCode2 = (hashCode * 31) + this.c.hashCode();
        this.h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return b();
    }

    public cvo(URL url) {
        cvp cvpVar = cvp.a;
        did.ap(url);
        this.d = url;
        this.e = null;
        did.ap(cvpVar);
        this.c = cvpVar;
    }
}
