package defpackage;

import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fev implements few {
    private final alep a;

    public fev(alep alepVar, byte[] bArr) {
        this.a = alepVar;
    }

    @Override // defpackage.few
    public final ynz a() {
        String str;
        try {
            alep alepVar = this.a;
            try {
                str = anaf.w(new File("/proc/self/stat"), Charset.defaultCharset()).g();
            } catch (Exception e) {
                e = e;
                str = null;
            }
            try {
                String[] split = str.split(" ");
                int length = split.length;
                if (length <= 21) {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Not enough fields: ");
                    sb.append(length);
                    throw new yoa(sb.toString());
                }
                String str2 = split[21];
                try {
                    long longValue = Long.decode(str2).longValue();
                    long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                    if (sysconf <= 0) {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append("jiffiesPerSecond bad value: ");
                        sb2.append(sysconf);
                        throw new yoa(sb2.toString());
                    }
                    if (longValue <= 0) {
                        StringBuilder sb3 = new StringBuilder(56);
                        sb3.append("processCreateTimeJiffies bad value: ");
                        sb3.append(longValue);
                        throw new yoa(sb3.toString());
                    }
                    long millis = TimeUnit.SECONDS.toMillis(longValue) / sysconf;
                    if (millis > 0 && millis < alepVar.a.d()) {
                        return new feu(millis);
                    }
                    StringBuilder sb4 = new StringBuilder(52);
                    sb4.append("valueInElapsedMillis bad value: ");
                    sb4.append(millis);
                    throw new yoa(sb4.toString());
                } catch (NumberFormatException e2) {
                    String valueOf = String.valueOf(str2);
                    throw new yoa(valueOf.length() != 0 ? "Failed to parse: ".concat(valueOf) : new String("Failed to parse: "), e2);
                }
            } catch (Exception e3) {
                e = e3;
                String valueOf2 = String.valueOf(str);
                throw new yoa(valueOf2.length() != 0 ? "Failed to get process create time: ".concat(valueOf2) : new String("Failed to get process create time: "), e);
            }
        } catch (Exception e4) {
            afsi.c(2, 18, "Failed to obtain process fork time using Kernel stats", e4);
            return null;
        }
    }

    @Override // defpackage.few
    public final void b(actg actgVar) {
        actgVar.h(feu.class, "proc_k");
    }

    @Override // defpackage.few
    public final boolean c() {
        return true;
    }
}
