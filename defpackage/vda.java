package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vda {
    public String a;
    private final Context b;
    private String c = "files";
    private String d = "common";
    private Account e = vdb.b;
    private String f = "";
    private final amrp g = amru.f();

    public vda(Context context) {
        vls.k(context != null, "Context cannot be null", new Object[0]);
        this.b = context;
        this.a = context.getPackageName();
    }

    public final Uri a() {
        String str = this.c;
        String str2 = this.d;
        String b = vcx.b(this.e);
        String str3 = this.f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 4 + length2 + String.valueOf(b).length() + String.valueOf(str3).length());
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("/");
        sb.append(b);
        sb.append("/");
        sb.append(str3);
        String sb2 = sb.toString();
        return new Uri.Builder().scheme("android").authority(this.a).path(sb2).encodedFragment(vdy.b(this.g.g())).build();
    }

    public final void b(String str) {
        String str2;
        String str3;
        String substring;
        File g = uqq.g(this.b);
        String absolutePath = g.getAbsolutePath();
        String absolutePath2 = this.b.getCacheDir().getAbsolutePath();
        String absolutePath3 = new File(g, "managed").getAbsolutePath();
        File externalFilesDir = this.b.getExternalFilesDir(null);
        String absolutePath4 = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        if (Build.VERSION.SDK_INT >= 24) {
            File f = uqq.f(this.b);
            str3 = new File(f, "files").getAbsolutePath();
            str2 = new File(f, "cache").getAbsolutePath();
        } else {
            str2 = null;
            str3 = null;
        }
        if (str.startsWith(absolutePath3)) {
            d("managed");
            substring = str.substring(absolutePath3.length());
        } else if (str.startsWith(absolutePath)) {
            d("files");
            substring = str.substring(absolutePath.length());
        } else if (str.startsWith(absolutePath2)) {
            d("cache");
            substring = str.substring(absolutePath2.length());
        } else if (absolutePath4 == null || !str.startsWith(absolutePath4)) {
            if (str3 == null || !str.startsWith(str3)) {
                if (str2 == null || !str.startsWith(str2)) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Path must be in app-private files dir or external files dir: ".concat(valueOf) : new String("Path must be in app-private files dir or external files dir: "));
                }
                d("directboot-cache");
                substring = str.substring(str2.length());
            } else {
                d("directboot-files");
                substring = str.substring(str3.length());
            }
        } else {
            d("external");
            substring = str.substring(absolutePath4.length());
        }
        List asList = Arrays.asList(substring.split(File.separator));
        vls.k(asList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        e((String) asList.get(1));
        String str4 = (String) asList.get(2);
        if (!"managed".equals(this.c) || vcx.d(str4)) {
            c(vcx.a(str4));
            f(substring.substring(this.d.length() + str4.length() + 2));
            return;
        }
        try {
            Integer.parseInt(str4);
            vls.k(false, "AccountManager cannot be null", new Object[0]);
            try {
                throw null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalArgumentException(new vdo(e));
            } catch (ExecutionException e2) {
                throw new IllegalArgumentException(new vdo(e2.getCause()));
            }
        } catch (NumberFormatException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final void c(Account account) {
        vcx.b(account);
        this.e = account;
    }

    public final void d(String str) {
        vls.k(vdb.d.contains(str), "The only supported locations are %s: %s", vdb.d, str);
        this.c = str;
    }

    public final void e(String str) {
        vls.k(vdb.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        vls.k(!vdb.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void f(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = vdb.a;
        this.f = str;
    }
}
