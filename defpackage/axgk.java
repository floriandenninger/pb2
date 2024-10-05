package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import com.google.vr.sdk.proto.Display$DisplayParams;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgk {
    private static final String a = "axgk";
    private static ArrayList b;
    private static final List c;

    static {
        Float valueOf = Float.valueOf(441.74f);
        Float valueOf2 = Float.valueOf(0.004f);
        Float valueOf3 = Float.valueOf(537.57f);
        Float valueOf4 = Float.valueOf(522.63f);
        Float valueOf5 = Float.valueOf(0.0038f);
        c = Arrays.asList(new axgj("Micromax", null, "4560MMX", null, 217.0f, 217.0f), new axgj("HTC", "endeavoru", "HTC One X", null, 312.0f, 312.0f), new axgj("samsung", null, "SM-G920P", null, 575.0f, 575.0f), new axgj("samsung", null, "SM-G930", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-G9300", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-G930A", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-G930F", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-G930P", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-G930R4", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-G930T", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-G930V", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-G930W8", null, 581.0f, 580.0f), new axgj("samsung", null, "SM-N915FY", null, 541.0f, 541.0f), new axgj("samsung", null, "SM-N915A", null, 541.0f, 541.0f), new axgj("samsung", null, "SM-N915T", null, 541.0f, 541.0f), new axgj("samsung", null, "SM-N915K", null, 541.0f, 541.0f), new axgj("samsung", null, "SM-N915T", null, 541.0f, 541.0f), new axgj("samsung", null, "SM-N915G", null, 541.0f, 541.0f), new axgj("samsung", null, "SM-N915D", null, 541.0f, 541.0f), new axgj("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294.0f, 294.0f), new axgj("OnePlus", "A0001", "A0001", "bacon", 401.0f, 401.0f), new axgj("THL", "THL", "thl 5000", "mt6592", 441.0f, 441.0f), new axgj("Google", "sailfish", "Pixel", "sailfish", valueOf, valueOf, valueOf2), new axgj("Google", "marlin", "Pixel XL", "marlin", valueOf3, valueOf3, valueOf2), new axgj("Google", "walleye", null, "walleye", valueOf, valueOf, valueOf2), new axgj("Google", "taimen", null, "taimen", null, null, Float.valueOf(0.0046f)), new axgj("Google", "21c8b5470a64adbb25bc84316cbc449361d86839", null, null, valueOf4, valueOf4, valueOf5), new axgj("Google", "6e2c7e24b7c7eae9fc94882c9f31befa00594872", null, null, null, null, valueOf5), new axgj("LGE", "joan", null, "joan", null, null, valueOf5), new axgj("LGE", "e44046539bb5b584279553ca6eacca937c8e16cf", null, null, null, null, valueOf5), new axgj("Lenovo", "vega", null, "vega", 537.388f, 537.882f));
    }

    private axgk() {
    }

    public static Display$DisplayParams a(Context context) {
        ArrayList arrayList;
        axgj axgjVar;
        Display$DisplayParams.Builder newBuilder = Display$DisplayParams.newBuilder();
        List list = c;
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.MODEL;
        String str4 = Build.HARDWARE;
        String b2 = b(str2);
        Iterator it = list.iterator();
        do {
            arrayList = null;
            if (!it.hasNext()) {
                return null;
            }
            axgjVar = (axgj) it.next();
            if (axgjVar.a(str, str2, str3, str4)) {
                break;
            }
        } while (!axgjVar.a(str, b2, str3, str4));
        String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f, bottom_bezel_height=%f)", axgjVar.a, axgjVar.b, axgjVar.c, axgjVar.d, axgjVar.e, axgjVar.f, axgjVar.g);
        Float f = axgjVar.e;
        if (f != null) {
            newBuilder.setXPpi(f.floatValue());
        }
        Float f2 = axgjVar.f;
        if (f2 != null) {
            newBuilder.setYPpi(f2.floatValue());
        }
        Float f3 = axgjVar.g;
        if (f3 != null) {
            newBuilder.setBottomBezelHeight(f3.floatValue());
        }
        if ("samsung".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 23) {
            Display i = axfq.i(context);
            DisplayMetrics g = axfq.g(i);
            int i2 = g.widthPixels;
            if (i != null && (arrayList = b) == null) {
                b = new ArrayList();
                Display.Mode[] supportedModes = i.getSupportedModes();
                if (supportedModes != null) {
                    for (Display.Mode mode : supportedModes) {
                        b.add(new Size(mode.getPhysicalWidth(), mode.getPhysicalHeight()));
                    }
                }
                arrayList = b;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Size size2 = (Size) arrayList.get(i3);
                    i2 = Math.max(i2, Math.max(size2.getWidth(), size2.getHeight()));
                }
                if (g.widthPixels != i2) {
                    float f4 = g.widthPixels / i2;
                    StringBuilder sb = new StringBuilder(61);
                    sb.append("Non-native screen resolution; scaling DPI by: ");
                    sb.append(f4);
                    newBuilder.setXPpi(newBuilder.getXPpi() * f4);
                    newBuilder.setYPpi(newBuilder.getYPpi() * f4);
                }
            }
        }
        return (Display$DisplayParams) newBuilder.build();
    }

    private static String b(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length + length);
            for (byte b2 : digest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (GeneralSecurityException unused) {
            Log.e(a, "SHA-256 is missing");
            return str;
        }
    }
}
