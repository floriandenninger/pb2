package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czg implements cqp {
    private final Context a;

    public czg(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        return c((Uri) obj);
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final ctd c(Uri uri) {
        Context context;
        int parseInt;
        String authority = uri.getAuthority();
        if (authority.equals(this.a.getPackageName())) {
            context = this.a;
        } else {
            try {
                context = this.a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (authority.contains(this.a.getPackageName())) {
                    context = this.a;
                } else {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                    sb.append("Failed to obtain context or unrecognized Uri format for: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (parseInt == 0) {
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Failed to find resource id for: ");
                sb2.append(valueOf2);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else if (pathSegments.size() == 1) {
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                sb3.append("Unrecognized Uri format: ");
                sb3.append(valueOf3);
                throw new IllegalArgumentException(sb3.toString(), e2);
            }
        } else {
            String valueOf4 = String.valueOf(uri);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 25);
            sb4.append("Unrecognized Uri format: ");
            sb4.append(valueOf4);
            throw new IllegalArgumentException(sb4.toString());
        }
        return czf.g(czd.a(this.a, context, parseInt, null));
    }
}
