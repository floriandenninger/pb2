package defpackage;

import android.text.TextUtils;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udp {
    private static final vcg a = new vcg();
    private final ucj b;
    private final twn c;
    private final axpg d;

    public udp(ucj ucjVar, twn twnVar, axpg axpgVar) {
        this.b = ucjVar;
        this.c = twnVar;
        this.d = axpgVar;
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [aooy, java.lang.Object] */
    public final udn a(String str, String str2, aooy aooyVar, aooy aooyVar2) {
        String str3;
        String concat;
        Map map;
        try {
            aooyVar.getClass();
            aooyVar2.getClass();
            byte[] byteArray = aooyVar.toByteArray();
            uce uceVar = new uce();
            uceVar.c = new HashMap();
            twn twnVar = this.c;
            vcg vcgVar = a;
            ammr ammrVar = vcg.c;
            if ("true".equals(vcq.a("debug.social", "true")) && "true".equals(vcq.a(ammrVar.b, "true"))) {
                str3 = vcq.a(vcgVar.a, vcgVar.b);
                if (str3 != null && str3.length() == 91) {
                    StringBuilder sb = new StringBuilder(str3);
                    int i = 2;
                    while (true) {
                        int i2 = i + 1;
                        StringBuilder sb2 = new StringBuilder(27);
                        sb2.append("chime.server.url");
                        sb2.append(i);
                        String a2 = vcq.a(sb2.toString(), "");
                        sb.append(a2);
                        if (a2.length() != 91) {
                            break;
                        }
                        i = i2;
                    }
                    str3 = sb.toString();
                }
            } else {
                str3 = vcgVar.b;
            }
            if (TextUtils.isEmpty(str3)) {
                concat = twnVar.c.f;
            } else {
                String valueOf = String.valueOf(str3);
                concat = valueOf.length() != 0 ? "https://".concat(valueOf) : new String("https://");
            }
            String valueOf2 = String.valueOf(concat);
            uceVar.a = new URL(str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2));
            uceVar.d = byteArray;
            uceVar.b = "application/x-protobuf";
            if (TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(null)) {
                    uceVar.b(ucd.a("X-Goog-Api-Key"), null);
                } else {
                    throw new Exception("One of Account Name or API Key must be set.");
                }
            } else {
                String b = this.b.b(str2);
                uceVar.b(ucd.a("Authorization"), b.length() != 0 ? "Bearer ".concat(b) : new String("Bearer "));
            }
            ucc uccVar = (ucc) this.d.get();
            URL url = uceVar.a;
            if (url != null && (map = uceVar.c) != null) {
                uch a3 = uccVar.a(new ucf(url, uceVar.b, map, uceVar.d));
                if (a3.b() != null) {
                    udl a4 = udn.a();
                    a4.b = a3.b();
                    Throwable b2 = a3.b();
                    boolean z = true;
                    if (b2 == null || (!(b2 instanceof SocketException) && !(b2 instanceof UnknownHostException) && !(b2 instanceof SSLException) && (!(b2 instanceof uci) || ((uci) b2).a != 401))) {
                        z = false;
                    }
                    a4.b(z);
                    return a4.a();
                }
                ?? j = aooyVar2.getParserForType().j(a3.a);
                udl a5 = udn.a();
                a5.a = j;
                return a5.a();
            }
            StringBuilder sb3 = new StringBuilder();
            if (uceVar.a == null) {
                sb3.append(" url");
            }
            if (uceVar.c == null) {
                sb3.append(" headers");
            }
            String valueOf3 = String.valueOf(sb3);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
            sb4.append("Missing required properties:");
            sb4.append(valueOf3);
            throw new IllegalStateException(sb4.toString());
        } catch (Exception e) {
            udl a6 = udn.a();
            a6.b = e;
            a6.b(false);
            return a6.a();
        }
    }
}
