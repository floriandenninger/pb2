package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.opengl.GLES20;
import android.text.method.MovementMethod;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Objects;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vlu {
    public vlu() {
        new HashMap();
    }

    public vlu(char[] cArr) {
    }

    public static boolean a(Context context, String str) {
        try {
            return Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions).contains(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid channel count: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean c(int i) {
        return i == 2;
    }

    public static void d(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String hexString = Integer.toHexString(glGetError);
        StringBuilder sb = new StringBuilder(str.length() + 14 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": GL error: 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    public static void e(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String hexString = Integer.toHexString(glGetError);
            StringBuilder sb = new StringBuilder(str.length() + 14 + String.valueOf(hexString).length());
            sb.append(str);
            sb.append(": GL error: 0x");
            sb.append(hexString);
            vtv.b(sb.toString());
        }
    }

    public static String f(Context context, long j) {
        int i = (int) (j / 60000);
        int i2 = ((int) (j / 1000)) % 60;
        String quantityString = context.getResources().getQuantityString(R.plurals.duration_seconds, i2, Integer.valueOf(i2));
        if (i == 0) {
            return quantityString;
        }
        return context.getResources().getString(R.string.duration_content_description, context.getResources().getQuantityString(R.plurals.duration_minutes, i, Integer.valueOf(i)), quantityString);
    }

    public static String g(Context context, long j, boolean z) {
        return h(context, true != z ? R.string.time_minutes_seconds : R.string.time_minutes_seconds_millis, j);
    }

    public static String h(Context context, int i, long j) {
        int i2 = (int) (j % 1000);
        return context.getResources().getString(i, Integer.valueOf((int) (j / 60000)), Integer.valueOf(((int) (j / 1000)) % 60), Integer.valueOf(i2), Integer.valueOf(i2 / 100));
    }

    public static amru i(Object obj, Object[] objArr) {
        obj.getClass();
        amrp h = amru.h(1);
        h.h(obj);
        h.i(objArr);
        return h.g();
    }

    public static void j(Activity activity, int i, Collection collection, String str) {
        activity.getClass();
        collection.getClass();
        amkq.F(!collection.isEmpty(), "empty request types");
        activity.startActivityForResult(new Intent(str).putExtra("access_types", anaf.aj(amsx.o(amkq.bh(collection, tur.r)))).setPackage("com.google.android.apps.wellbeing"), i);
    }

    public static void k(TextView textView, MovementMethod movementMethod) {
        boolean isClickable = textView.isClickable();
        boolean isLongClickable = textView.isLongClickable();
        textView.setMovementMethod(movementMethod);
        textView.setClickable(isClickable);
        textView.setLongClickable(isLongClickable);
    }

    public static int[] l() {
        return new int[]{1, 2, 3};
    }

    public static final void m(vwc vwcVar, WritableByteChannel writableByteChannel) {
        vwcVar.a().e(writableByteChannel);
    }

    public static void n(String str) {
        amkq.E(str.length() == 4);
    }

    public static void o(long j) {
        amkq.E(j >= 0);
        amkq.E(j <= 4294967295L);
    }

    public static vvk p(vvn vvnVar) {
        if (!vvnVar.b.equals("mvhd")) {
            if (!vvnVar.b.equals("tkhd")) {
                if (!vvnVar.b.equals("stco")) {
                    if (!vvnVar.b.equals("co64")) {
                        if (vvnVar.b.equals("moov") || vvnVar.b.equals("trak") || vvnVar.b.equals("edts") || vvnVar.b.equals("mdia") || vvnVar.b.equals("minf") || vvnVar.b.equals("dinf") || vvnVar.b.equals("stbl")) {
                            return new vvs(vvnVar);
                        }
                        return new vvk(vvnVar);
                    }
                    return new vvl(vvnVar);
                }
                return new vvp(vvnVar);
            }
            return new vvq(vvnVar);
        }
        return new vvo(vvnVar);
    }

    public static int q(axnb axnbVar) {
        axnb axnbVar2 = new axnb(axnbVar.h, axnbVar.i, axnbVar.j, axnbVar.k, axnbVar.e, axnbVar.f, axnbVar.g, 0.0d, 0.0d);
        if (uqq.p(axnbVar2, axnb.a)) {
            return 0;
        }
        if (uqq.p(axnbVar2, axnb.b)) {
            return 90;
        }
        if (uqq.p(axnbVar2, axnb.c)) {
            return 180;
        }
        if (uqq.p(axnbVar2, axnb.d)) {
            return 270;
        }
        String valueOf = String.valueOf(axnbVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("track contains rotation matrix other than simple rotation ");
        sb.append(valueOf);
        vtv.e(sb.toString());
        return 0;
    }

    public static axlc r(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axlc axlcVar = (axlc) it.next();
            if (Objects.equals(axlcVar.k(), str)) {
                return axlcVar;
            }
        }
        throw new vuy(str.length() != 0 ? "Could not find track of handler type ".concat(str) : new String("Could not find track of handler type "));
    }

    public static axlc s(List list) {
        return r(list, "vide");
    }

    public vlu(byte[] bArr) {
        new aow(vmh.a());
    }
}
