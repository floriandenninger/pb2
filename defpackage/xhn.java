package defpackage;

import android.net.Uri;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhn implements xhi, ykl {
    public final afsy a;
    public final Executor b;
    public final afxf c;
    public final xhk d;
    public final aamp e;

    public xhn(afsy afsyVar, Executor executor, afxf afxfVar, xhk xhkVar, aamp aampVar) {
        afsyVar.getClass();
        this.a = afsyVar;
        executor.getClass();
        this.b = executor;
        afxfVar.getClass();
        this.c = afxfVar;
        xhkVar.getClass();
        this.d = xhkVar;
        this.e = aampVar;
    }

    public static final Uri j(aoye aoyeVar) {
        try {
            return wbs.ai(aoyeVar.c);
        } catch (MalformedURLException unused) {
            zga.l(String.format("Badly formed uri in ABR path: %s", aoyeVar.c));
            return null;
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((afvl) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Ping failed ");
        sb.append(valueOf);
        zga.d(sb.toString(), exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
    }

    @Override // defpackage.xhi
    public final void c(aoye aoyeVar, afxe... afxeVarArr) {
        d(aoyeVar, Collections.emptyList(), true, afxeVarArr);
    }

    @Override // defpackage.xhi
    public final void d(aoye aoyeVar, List list, boolean z, afxe... afxeVarArr) {
        Uri j = j(aoyeVar);
        if (j == null || Uri.EMPTY.equals(j)) {
            return;
        }
        Uri g = g(j, afxeVarArr);
        i(g, aoyeVar, h(g, list, z));
    }

    @Override // defpackage.xhi
    public final boolean e(List list, afxe... afxeVarArr) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((aoye) it.next(), afxeVarArr);
        }
        return true;
    }

    @Override // defpackage.xhi
    public final void f(List list) {
        e(list, afxe.f);
    }

    public final Uri g(Uri uri, afxe... afxeVarArr) {
        try {
            return this.c.a(uri, afxeVarArr);
        } catch (zjg e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Failed to substitute URI macros ");
            sb.append(valueOf);
            zga.l(sb.toString());
            return null;
        }
    }

    public final void i(final Uri uri, final aoye aoyeVar, final afug afugVar) {
        this.b.execute(new Runnable() { // from class: xhl
            @Override // java.lang.Runnable
            public final void run() {
                xhn xhnVar = xhn.this;
                Uri uri2 = uri;
                afug afugVar2 = afugVar;
                aoye aoyeVar2 = aoyeVar;
                String.valueOf(String.valueOf(uri2)).length();
                afugVar2.a(new xhj(aoyeVar2.e));
                afugVar2.d = aoyeVar2.f;
                aamp aampVar = xhnVar.e;
                if (aampVar != null) {
                    afugVar2.e = aampVar.a();
                }
                xhnVar.d.a(afugVar2, afxi.a);
            }
        });
    }

    public final afug h(Uri uri, List list, boolean z) {
        byte[] bArr;
        if (!z) {
            try {
                StringBuilder sb = new StringBuilder();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                    sb.append('=');
                    sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
                    sb.append('&');
                }
                bArr = sb.toString().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Failed to encode post body. ");
                sb2.append(valueOf);
                zga.b(sb2.toString());
                bArr = null;
            }
            return this.d.d(uri, bArr, this.a.c());
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            buildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        return this.d.c(buildUpon.build(), this.a.c());
    }
}
