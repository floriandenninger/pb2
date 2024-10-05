package defpackage;

import android.content.SharedPreferences;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktj implements aktk {
    private final File a;
    private boolean b = false;

    public aktj(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("system_health_metric_disk_output_dir", null);
        if (string == null) {
            this.a = null;
            return;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        String valueOf = String.valueOf(File.separator);
        this.a = new File(externalStorageDirectory, string.length() != 0 ? valueOf.concat(string) : new String(valueOf));
    }

    @Override // defpackage.aktk
    public final void a(avdy avdyVar) {
        File file = this.a;
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            this.a.mkdirs();
        }
        this.b = true;
    }

    @Override // defpackage.aktk
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.aktk
    public final void c(avdg avdgVar) {
        e(avdgVar);
    }

    @Override // defpackage.aktk
    public final void d(avdg avdgVar) {
        e(avdgVar);
    }

    final void e(avdg avdgVar) {
        String str;
        int i;
        if (!this.b || avdgVar == null) {
            return;
        }
        try {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(System.currentTimeMillis());
            try {
                i = ((bact) aonm.parseFrom(bact.a, avdgVar.f.I(), aomw.b())).b;
            } catch (aoob e) {
                e.printStackTrace();
            }
            if ((i & 64) != 0) {
                str = "crash";
            } else if ((i & 256) != 0) {
                str = "disk";
            } else if ((i & 1) != 0) {
                str = "memory";
            } else if ((i & 32) != 0) {
                str = "network";
            } else {
                if ((i & 128) != 0) {
                    str = "stats";
                }
                str = "unknown";
            }
            objArr[1] = str;
            anaf.u(avdgVar.toByteArray(), File.createTempFile(String.format(locale, "%d-%s-", objArr), ".capture", this.a));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
