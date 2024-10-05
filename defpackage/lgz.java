package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgz implements akdn {
    private static final long a = TimeUnit.MINUTES.toSeconds(60);
    private final aaea b;
    private final SharedPreferences c;
    private final Context d;
    private boolean e;
    private ammv f;
    private ammv g;
    private final aadw h;

    static {
        TimeUnit.MINUTES.toSeconds(300L);
    }

    public lgz(Context context, SharedPreferences sharedPreferences, aadw aadwVar, aaea aaeaVar) {
        this.d = context;
        sharedPreferences.getClass();
        this.c = sharedPreferences;
        aadwVar.getClass();
        this.h = aadwVar;
        aaeaVar.getClass();
        this.b = aaeaVar;
        this.f = amlr.a;
        this.g = amlr.a;
    }

    private final ammv o() {
        ammv ammvVar;
        File file;
        String[] split;
        if (!this.e && !this.f.h()) {
            try {
                String valueOf = String.valueOf(this.d.getFilesDir());
                String str = File.separator;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append(str);
                sb.append("ondevicesuggest");
                try {
                    file = new File(sb.toString());
                } catch (NullPointerException | SecurityException e) {
                    zga.n("MainAppFileBasedOnDeviceSuggestConfig: Failed to delete the old index files.", e);
                }
                if (file.listFiles() == null) {
                    ammvVar = amlr.a;
                } else {
                    String str2 = null;
                    String str3 = null;
                    for (File file2 : file.listFiles()) {
                        String absolutePath = file2.getAbsolutePath();
                        try {
                            awxs.a(absolutePath);
                            split = absolutePath.substring(absolutePath.lastIndexOf(47) + 1).split("_", -1);
                        } catch (awzr unused) {
                        }
                        if (split.length != 6 || split[2].length() != 10 || split[2].charAt(4) != '-' || split[2].charAt(7) != '-') {
                            throw new awzr();
                            break;
                        }
                        String str4 = split[2];
                        if (str3 == null || str4.compareTo(str3) > 0) {
                            str2 = absolutePath;
                            str3 = str4;
                        }
                    }
                    if (str2 != null) {
                        ammvVar = ammv.j(str2);
                    }
                    ammvVar = amlr.a;
                }
                this.f = ammvVar;
                if (ammvVar.h()) {
                    this.g = ammv.j(awxs.a((String) this.f.c()));
                }
            } catch (awzr unused2) {
                this.f = amlr.a;
            }
        }
        this.e = true;
        return this.f;
    }

    @Override // defpackage.akdn
    public final int a() {
        int i;
        apwy b = this.h.b();
        if ((b.b & 16) != 0) {
            asvu asvuVar = b.e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            i = asvuVar.L;
        } else {
            i = -1;
        }
        if (i > 0) {
            return i;
        }
        return 10;
    }

    @Override // defpackage.akdn
    public final int b() {
        int i;
        apwy b = this.h.b();
        if ((b.b & 16) != 0) {
            asvu asvuVar = b.e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            i = asvuVar.M;
        } else {
            i = -1;
        }
        if (i > 0) {
            return i;
        }
        return 2;
    }

    @Override // defpackage.akdn
    public final int c() {
        int i;
        apwy b = this.h.b();
        if ((b.b & 16) != 0) {
            asvu asvuVar = b.e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            i = asvuVar.K;
        } else {
            i = -1;
        }
        if (i > 0) {
            return i;
        }
        return 300;
    }

    @Override // defpackage.akdn
    public final long d() {
        long j;
        try {
            j = Long.parseLong(this.c.getString("on_device_suggest_download_earliest_secs", "-1"));
        } catch (NumberFormatException unused) {
            j = -1;
        }
        return j == -1 ? a : j;
    }

    @Override // defpackage.akdn
    public final ammv e() {
        return o();
    }

    @Override // defpackage.akdn
    public final ammv f() {
        aunv aunvVar = this.b.a().n;
        if (aunvVar == null) {
            aunvVar = aunv.a;
        }
        return ammv.j(aunvVar.d);
    }

    @Override // defpackage.akdn
    public final ammv g() {
        return o();
    }

    @Override // defpackage.akdn
    public final ammv h() {
        o();
        return this.g;
    }

    @Override // defpackage.akdn
    public final void i(String str) {
        this.f = ammv.j(str);
    }

    @Override // defpackage.akdn
    public final void j(String str) {
        this.g = ammv.j(str);
    }

    @Override // defpackage.akdn
    public final boolean k() {
        aunv aunvVar = this.b.a().n;
        if (aunvVar == null) {
            aunvVar = aunv.a;
        }
        return aunvVar.c;
    }

    @Override // defpackage.akdn
    public final boolean l() {
        aunv aunvVar = this.b.a().n;
        if (aunvVar == null) {
            aunvVar = aunv.a;
        }
        return aunvVar.e;
    }

    @Override // defpackage.akdn
    public final void m() {
    }

    @Override // defpackage.akdn
    public final void n() {
        try {
            Long.parseLong(this.c.getString("on_device_suggest_download_latest_secs", "-1"));
        } catch (NumberFormatException unused) {
        }
    }
}
