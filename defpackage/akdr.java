package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akdr {
    public final akdn a;
    public final Context b;
    public awzt c;

    public akdr(Context context, akdn akdnVar) {
        this.a = akdnVar;
        this.b = context;
    }

    public static void a(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    public final synchronized void b() {
        if (this.c != null) {
            return;
        }
        ammv g = this.a.g();
        if (!g.h()) {
            zga.l("OnDeviceSuggestIndexStore: Index file is absent in SharedPrefrences, probably not fetched yet. No on-device suggestions will be returned until the file is fetched.");
        } else {
            c((String) g.c());
        }
    }

    public final synchronized boolean c(String str) {
        File file = new File(str);
        if (!file.exists()) {
            zga.b("OnDeviceSuggestIndexStore: Index file does not exist.");
            return false;
        }
        try {
            this.c = new awzt(file.getPath(), this.a.a());
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
            sb.append("OnDeviceSuggestIndexStore: Successfully created Serving instance from ");
            sb.append(valueOf);
            zga.g(sb.toString());
            return true;
        } catch (IOException e) {
            akmq.e("Failed to create Serving instance", e);
            zga.d("OnDeviceSuggestIndexStore: Failed to create Serving instance. ", e);
            return false;
        }
    }
}
