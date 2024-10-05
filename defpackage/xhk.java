package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhk {
    private static final Pattern c = Pattern.compile("^NO_MATCH_REGEX$");
    public final Pattern a;
    public final afuh b;
    private final afuh d;
    private final shf e;

    public xhk(aadw aadwVar, afuh afuhVar, afuh afuhVar2, shf shfVar) {
        aadwVar.getClass();
        afuhVar.getClass();
        this.b = afuhVar;
        afuhVar2.getClass();
        this.d = afuhVar2;
        this.a = c;
        shfVar.getClass();
        this.e = shfVar;
    }

    public final void a(afug afugVar, cnk cnkVar) {
        if (afugVar.j.a(asuq.VISITOR_ID)) {
            this.b.a(afugVar, cnkVar);
        } else {
            b(afugVar, cnkVar);
        }
    }

    public final void b(afug afugVar, cnk cnkVar) {
        Uri build;
        Uri uri = afugVar.b;
        if (uri.getHost() != null && ((uri.getHost().endsWith(".doubleclick.net") || TextUtils.equals(uri.getHost(), "doubleclick.net")) && afugVar.d)) {
            Uri uri2 = afugVar.b;
            String valueOf = String.valueOf(this.e.c() / 1000);
            String encodedQuery = uri2.getEncodedQuery();
            if (encodedQuery == null || encodedQuery.length() == 0) {
                build = uri2.buildUpon().appendQueryParameter("ts", valueOf).build();
            } else {
                String encode = Uri.encode("ts", null);
                String encode2 = Uri.encode(valueOf, null);
                StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 1 + String.valueOf(encode2).length());
                sb.append(encode);
                sb.append("=");
                sb.append(encode2);
                String sb2 = sb.toString();
                Uri.Builder buildUpon = uri2.buildUpon();
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + encodedQuery.length());
                sb3.append(sb2);
                sb3.append("&");
                sb3.append(encodedQuery);
                build = buildUpon.encodedQuery(sb3.toString()).build();
            }
            afugVar.b(build);
        }
        this.d.a(afugVar, cnkVar);
    }

    public final afug c(Uri uri, afsx afsxVar) {
        afug d;
        if (this.a.matcher(uri.toString()).find()) {
            d = afuh.d("vastad");
        } else {
            d = afuh.d("vastad");
        }
        d.b(uri);
        d.g = afsxVar;
        return d;
    }

    public final afug d(Uri uri, byte[] bArr, afsx afsxVar) {
        afug c2;
        if (this.a.matcher(uri.toString()).find()) {
            c2 = afuh.c(bArr, "vastad");
        } else {
            c2 = afuh.c(bArr, "vastad");
        }
        c2.b(uri);
        c2.g = afsxVar;
        return c2;
    }
}
