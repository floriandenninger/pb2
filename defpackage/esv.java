package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class esv {
    private static ecw a;
    public static anjn d;

    public static void A(dzf dzfVar, int i, List list) {
        B(dzfVar.name(), i, list);
    }

    public static void B(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void C(dzf dzfVar, int i, List list) {
        D(dzfVar.name(), i, list);
    }

    public static void D(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void E(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean F(dyn dynVar) {
        if (dynVar == null) {
            return false;
        }
        Double h = dynVar.h();
        return !h.isNaN() && h.doubleValue() >= 0.0d && h.equals(Double.valueOf(Math.floor(h.doubleValue())));
    }

    public static boolean G(dyn dynVar, dyn dynVar2) {
        if (!dynVar.getClass().equals(dynVar2.getClass())) {
            return false;
        }
        if ((dynVar instanceof dyr) || (dynVar instanceof dyl)) {
            return true;
        }
        if (dynVar instanceof dyg) {
            if (Double.isNaN(dynVar.h().doubleValue()) || Double.isNaN(dynVar2.h().doubleValue())) {
                return false;
            }
            return dynVar.h().equals(dynVar2.h());
        }
        if (dynVar instanceof dyq) {
            return dynVar.i().equals(dynVar2.i());
        }
        if (dynVar instanceof dye) {
            return dynVar.g().equals(dynVar2.g());
        }
        return dynVar == dynVar2;
    }

    public static void H(dxk dxkVar) {
        int v = v(dxkVar.d("runtime.counter").h().doubleValue() + 1.0d);
        if (v <= 1000000) {
            dxkVar.g("runtime.counter", new dyg(Double.valueOf(v)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static void I(Context context) {
        dvy a2 = dvy.a(context);
        synchronized (a2.a) {
            a2.b.add("1001680686");
            a2.c.remove("1001680686");
        }
    }

    public static int J(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int K(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int L(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static boolean M(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String N(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    protected static File O(Context context) {
        return context.getDir("lib", 0);
    }

    public static void P(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        r4 = new defpackage.duw(r12, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Q(android.content.Context r18, java.lang.String r19, java.lang.String r20, java.util.Set r21) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esv.Q(android.content.Context, java.lang.String, java.lang.String, java.util.Set):void");
    }

    protected static File R(Context context, String str, String str2) {
        String N = N(str);
        if (M(str2)) {
            return new File(O(context), N);
        }
        return new File(O(context), N + "." + str2);
    }

    public static void S(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean T(float f) {
        return Float.compare(f, Float.NaN) == 0;
    }

    public static void U(dhe dheVar, int i, int i2, dlo dloVar, ComponentTree componentTree, dha dhaVar, boolean z, boolean z2) {
        if (z && (!z2 || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE)) {
            dnc a2 = dnd.a(dheVar);
            a2.e(dhaVar);
            a2.M(View.MeasureSpec.getSize(i2));
            dhaVar = a2.a();
        }
        componentTree.p(dhaVar, i, View.MeasureSpec.makeMeasureSpec(0, 0), dloVar);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            dloVar.b = Math.min(View.MeasureSpec.getSize(i2), dloVar.b);
        } else {
            if (mode != 1073741824) {
                return;
            }
            dloVar.b = View.MeasureSpec.getSize(i2);
        }
    }

    public static View V(View view, Object obj) {
        if (obj.equals(view.getTag())) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View V = V(viewGroup.getChildAt(i), obj);
            if (V != null) {
                return V;
            }
        }
        return null;
    }

    public static int W(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }

    public static void X(int i, int i2, float f, dlo dloVar) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int ceil = (int) Math.ceil(size / f);
        int ceil2 = (int) Math.ceil(size2 * f);
        if (mode == 0) {
            if (mode2 == 0) {
                dloVar.a = 0;
                dloVar.b = 0;
                return;
            }
            mode = 0;
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (ceil > size2) {
                dloVar.a = ceil2;
                dloVar.b = size2;
                return;
            } else {
                dloVar.a = size;
                dloVar.b = ceil;
                return;
            }
        }
        if (mode == 1073741824) {
            dloVar.a = size;
            if (mode2 == 0 || ceil <= size2) {
                dloVar.b = ceil;
                return;
            } else {
                dloVar.b = size2;
                return;
            }
        }
        if (mode2 == 1073741824) {
            dloVar.b = size2;
            if (mode == 0 || ceil2 <= size) {
                dloVar.a = ceil2;
                return;
            } else {
                dloVar.a = size;
                return;
            }
        }
        if (mode == Integer.MIN_VALUE) {
            dloVar.a = size;
            dloVar.b = ceil;
        } else if (mode2 == Integer.MIN_VALUE) {
            dloVar.a = ceil2;
            dloVar.b = size2;
        }
    }

    public static void Y(dqt dqtVar, Map map) {
        boolean z = doa.a;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            dqtVar.a((String) entry.getKey(), entry.getValue());
        }
    }

    public static dlg Z(dhe dheVar, int i, dpi dpiVar, dpi dpiVar2) {
        taz tazVar = dheVar.l;
        if (tazVar == null) {
            return null;
        }
        dlg l = did.l(dheVar, tazVar, tazVar.a(dheVar, i));
        if (l != null) {
            l.a("section_current", dpiVar == null ? "null" : dpiVar.e);
            l.a("section_next", dpiVar2 != null ? dpiVar2.e : "null");
        }
        return l;
    }

    private static aqin a(int i) {
        aone createBuilder = aqin.a.createBuilder();
        createBuilder.copyOnWrite();
        aqin aqinVar = (aqin) createBuilder.instance;
        aqinVar.b |= 2;
        aqinVar.d = i;
        return (aqin) createBuilder.build();
    }

    public static String aa(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? "updateStateAsync" : "updateState" : "setRootAsync" : "setRoot" : "none";
    }

    public static void ab(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            String valueOf = String.valueOf(Arrays.toString(arrayList.toArray()));
            throw new IllegalStateException(valueOf.length() != 0 ? "The following props are not marked as optional and were not supplied: ".concat(valueOf) : new String("The following props are not marked as optional and were not supplied: "));
        }
    }

    public static void b(View view, GradientDrawable gradientDrawable, apqx apqxVar, Resources resources) {
        apqx apqxVar2 = apqx.CHANNEL_STATUS_UNKNOWN;
        int ordinal = apqxVar.ordinal();
        if (ordinal == 1) {
            view.setVisibility(0);
            gradientDrawable.setColor(resources.getColor(R.color.channel_list_sub_menu_avatar_unread));
        } else if (ordinal == 2) {
            view.setVisibility(0);
            gradientDrawable.setColor(resources.getColor(R.color.channel_list_sub_menu_avatar_live));
        } else {
            view.setVisibility(4);
        }
    }

    public static auqh c(int i, int i2, String str) {
        aone createBuilder = auqh.a.createBuilder();
        int max = Math.max(1, i2);
        int i3 = 0;
        while (i3 < 1440) {
            aone createBuilder2 = auqb.a.createBuilder();
            aqin a2 = a(i3);
            createBuilder2.copyOnWrite();
            auqb auqbVar = (auqb) createBuilder2.instance;
            a2.getClass();
            auqbVar.c = a2;
            auqbVar.b |= 2;
            boolean z = i3 == (i / max) * max;
            createBuilder2.copyOnWrite();
            auqb auqbVar2 = (auqb) createBuilder2.instance;
            auqbVar2.b |= 4;
            auqbVar2.d = z;
            aone createBuilder3 = auqd.a.createBuilder();
            auqb auqbVar3 = (auqb) createBuilder2.build();
            createBuilder3.copyOnWrite();
            auqd auqdVar = (auqd) createBuilder3.instance;
            auqbVar3.getClass();
            auqdVar.c = auqbVar3;
            auqdVar.b = 190692730;
            createBuilder.copyOnWrite();
            auqh auqhVar = (auqh) createBuilder.instance;
            auqd auqdVar2 = (auqd) createBuilder3.build();
            auqdVar2.getClass();
            auqhVar.a();
            auqhVar.f.add(auqdVar2);
            i3 += max;
        }
        aone mo21clone = createBuilder.mo21clone();
        aqyg h = ajcq.h(str);
        mo21clone.copyOnWrite();
        auqh auqhVar2 = (auqh) mo21clone.instance;
        h.getClass();
        auqhVar2.d = h;
        auqhVar2.b |= 2;
        return (auqh) mo21clone.build();
    }

    public static String d(Context context, int i) {
        aqin a2 = a(i);
        return DateFormat.getTimeFormat(context).format(new Date(0, 0, 0, a2.c, a2.d));
    }

    public static int e(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 27:
            case 28:
            case 31:
            case 34:
            case 36:
            case 37:
            case 40:
            case 41:
            case 45:
            case 46:
            case 50:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 59:
            case 61:
            case 62:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 73:
            case 75:
            case 80:
            case 81:
            case 83:
            case 86:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 101:
            case 109:
            case 112:
            case 114:
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 137:
            case 138:
            case 139:
            case 140:
            case 144:
            case 147:
            case 149:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 181:
            case 190:
            case 191:
            case 192:
            case 193:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 201:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 222:
            case 224:
            case 225:
            case 226:
            case 229:
            case 230:
            case 234:
            case 235:
            case 236:
            case 237:
            case 252:
            case 257:
            case 258:
            case 272:
            case 274:
            case 275:
            default:
                return 0;
            case 7:
                return 7;
            case 14:
                return 14;
            case 16:
                return 16;
            case 18:
                return 18;
            case 24:
                return 24;
            case 26:
                return 26;
            case 29:
                return 29;
            case 30:
                return 30;
            case 32:
                return 32;
            case 33:
                return 33;
            case 35:
                return 35;
            case 38:
                return 38;
            case 39:
                return 39;
            case 42:
                return 42;
            case 43:
                return 43;
            case 44:
                return 44;
            case 47:
                return 47;
            case 48:
                return 48;
            case 49:
                return 49;
            case 51:
                return 51;
            case 57:
                return 57;
            case 58:
                return 58;
            case 60:
                return 60;
            case 63:
                return 63;
            case 64:
                return 64;
            case 67:
                return 67;
            case 68:
                return 68;
            case 72:
                return 72;
            case 74:
                return 74;
            case 76:
                return 76;
            case 77:
                return 77;
            case 78:
                return 78;
            case 79:
                return 79;
            case 82:
                return 82;
            case 84:
                return 84;
            case 85:
                return 85;
            case 88:
                return 88;
            case 94:
                return 94;
            case 95:
                return 95;
            case 96:
                return 96;
            case 97:
                return 97;
            case 98:
                return 98;
            case 99:
                return 99;
            case 100:
                return 100;
            case 102:
                return 102;
            case 103:
                return 103;
            case 104:
                return 104;
            case 105:
                return 105;
            case 106:
                return 106;
            case 107:
                return 107;
            case 108:
                return 108;
            case 110:
                return 110;
            case 111:
                return 111;
            case 113:
                return 113;
            case 115:
                return 115;
            case 116:
                return 116;
            case 117:
                return 117;
            case 118:
                return 118;
            case 119:
                return 119;
            case 120:
                return 120;
            case 121:
                return 121;
            case 122:
                return 122;
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor;
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle;
            case 132:
                return 132;
            case 133:
                return 133;
            case 134:
                return 134;
            case 135:
                return 135;
            case 136:
                return 136;
            case 141:
                return 141;
            case 142:
                return 142;
            case 143:
                return 143;
            case 145:
                return 145;
            case 146:
                return 146;
            case 148:
                return 148;
            case 150:
                return 150;
            case 151:
                return 151;
            case 152:
                return 152;
            case 153:
                return 153;
            case 154:
                return 154;
            case 180:
                return 180;
            case 182:
                return 182;
            case 183:
                return 183;
            case 184:
                return 184;
            case 185:
                return 185;
            case 186:
                return 186;
            case 187:
                return 187;
            case 188:
                return 188;
            case 189:
                return 189;
            case 194:
                return 194;
            case 200:
                return 200;
            case 202:
                return 202;
            case 203:
                return 203;
            case 204:
                return 204;
            case 205:
                return 205;
            case 206:
                return 206;
            case 218:
                return 218;
            case 219:
                return 219;
            case 220:
                return 220;
            case 221:
                return 221;
            case 223:
                return 223;
            case 227:
                return 227;
            case 228:
                return 228;
            case 231:
                return 231;
            case 232:
                return 232;
            case 233:
                return 233;
            case 238:
                return 238;
            case 239:
                return 239;
            case 240:
                return 240;
            case 241:
                return 241;
            case 242:
                return 242;
            case 243:
                return 243;
            case 244:
                return 244;
            case 245:
                return 245;
            case 246:
                return 246;
            case 247:
                return 247;
            case 248:
                return 248;
            case 249:
                return 249;
            case 250:
                return 250;
            case 251:
                return 251;
            case 253:
                return 253;
            case 254:
                return 254;
            case PrivateKeyType.INVALID /* 255 */:
                return PrivateKeyType.INVALID;
            case 256:
                return 256;
            case 259:
                return 259;
            case 260:
                return 260;
            case 261:
                return 261;
            case 262:
                return 262;
            case 263:
                return 263;
            case 264:
                return 264;
            case 265:
                return 265;
            case 266:
                return 266;
            case 267:
                return 267;
            case 268:
                return 268;
            case 269:
                return 269;
            case 270:
                return 270;
            case 271:
                return 271;
            case 273:
                return 273;
            case 276:
                return 276;
            case 277:
                return 277;
            case 278:
                return 278;
            case 279:
                return 279;
            case 280:
                return 280;
            case 281:
                return 281;
            case 282:
                return 282;
            case 283:
                return 283;
            case 284:
                return 284;
            case 285:
                return 285;
            case 286:
                return 286;
            case 287:
                return 287;
            case 288:
                return 288;
            case 289:
                return 289;
            case 290:
                return 290;
            case 291:
                return 291;
            case 292:
                return 292;
            case 293:
                return 293;
            case 294:
                return 294;
            case 295:
                return 295;
            case 296:
                return 296;
            case 297:
                return 297;
            case 298:
                return 298;
            case 299:
                return 299;
            case 300:
                return 300;
            case 301:
                return 301;
            case 302:
                return 302;
            case 303:
                return 303;
            case 304:
                return 304;
            case 305:
                return 305;
            case 306:
                return 306;
            case 307:
                return 307;
            case 308:
                return 308;
            case 309:
                return 309;
            case 310:
                return 310;
            case 311:
                return 311;
            case 312:
                return 312;
            case 313:
                return 313;
            case 314:
                return 314;
            case 315:
                return 315;
            case 316:
                return 316;
            case 317:
                return 317;
            case 318:
                return 318;
            case 319:
                return 319;
            case 320:
                return 320;
            case 321:
                return 321;
            case 322:
                return 322;
            case 323:
                return 323;
            case 324:
                return 324;
            case 325:
                return 325;
        }
    }

    public static String f(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("?");
        for (String str2 : map.keySet()) {
            String str3 = (String) map.get(str2);
            sb.append(str2);
            sb.append("=");
            sb.append(str3);
            sb.append("&");
        }
        if (sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static boolean g(String str) {
        return str == null || str.length() == 0;
    }

    public static void h(String str) {
        if (Log.isLoggable("SenderHttpURLConnection", 6)) {
            Log.e("SenderHttpURLConnection", str);
        }
    }

    public static synchronized void i(ecu ecuVar) {
        synchronized (esv.class) {
            String str = ecuVar.b;
            String str2 = ecuVar.a;
            if (ecuVar.e == null) {
                ecuVar.e = new ecz(ecuVar.f, ecuVar.g);
            }
            ecw ecwVar = new ecw(str, str2, "3", ecuVar.e);
            a = ecwVar;
            if (ecuVar.c <= 0) {
                Log.w("ReporterDefault", "too small batch size :0, changed to 1");
            }
            int i = ecwVar.e;
            ecwVar.f = 1;
            for (Map.Entry entry : ecuVar.d.entrySet()) {
                a.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static synchronized ecw j() {
        ecw ecwVar;
        synchronized (esv.class) {
            if (a == null) {
                i(new ecu());
            }
            ecwVar = a;
        }
        return ecwVar;
    }

    public static void k(ebe ebeVar) {
        Method c;
        if (d != null) {
            return;
        }
        String str = (String) pyi.q.e();
        if (str == null || str.length() == 0) {
            str = null;
            if (ebeVar != null && (c = ebeVar.c("wC9I8kYd+RKAHfQkBEAJYQw7avQUH+U9s6BQ/SJiEcKjDl2sT+FDEb6J3VYVY+ui", "FSkZmgTbP/gL1jHU7M+TcfgVpePk57vWMdHk6knGCa4=")) != null) {
                str = (String) c.invoke(null, new Object[0]);
            }
            if (str == null) {
                return;
            }
        }
        try {
            try {
                anog anogVar = (anog) aonm.parseFrom(anog.a, m(str, true), aomw.a());
                for (anof anofVar : anogVar.c) {
                    anoc anocVar = anofVar.b;
                    if (anocVar == null) {
                        anocVar = anoc.a;
                    }
                    int T = aobq.T(anocVar.d);
                    if (T != 0 && T == 2) {
                        throw new GeneralSecurityException("keyset contains secret key material");
                    }
                    anoc anocVar2 = anofVar.b;
                    if (anocVar2 == null) {
                        anocVar2 = anoc.a;
                    }
                    int T2 = aobq.T(anocVar2.d);
                    if (T2 != 0 && T2 == 3) {
                        throw new GeneralSecurityException("keyset contains secret key material");
                    }
                    anoc anocVar3 = anofVar.b;
                    if (anocVar3 == null) {
                        anocVar3 = anoc.a;
                    }
                    int T3 = aobq.T(anocVar3.d);
                    if (T3 != 0 && T3 == 4) {
                        throw new GeneralSecurityException("keyset contains secret key material");
                    }
                }
                anjv a2 = anjv.a(anogVar);
                for (anoe anoeVar : anmf.a.b) {
                    if (!anoeVar.c.isEmpty()) {
                        if (!anoeVar.b.isEmpty()) {
                            if (!anoeVar.f.isEmpty()) {
                                if (!anoeVar.f.equals("TinkAead") && !anoeVar.f.equals("TinkMac") && !anoeVar.f.equals("TinkHybridDecrypt") && !anoeVar.f.equals("TinkHybridEncrypt") && !anoeVar.f.equals("TinkPublicKeySign") && !anoeVar.f.equals("TinkPublicKeyVerify") && !anoeVar.f.equals("TinkStreamingAead") && !anoeVar.f.equals("TinkDeterministicAead")) {
                                    anjj a3 = ankk.a(anoeVar.f);
                                    ankk.g(a3.a());
                                    String str2 = anoeVar.c;
                                    String str3 = anoeVar.b;
                                    int i = anoeVar.d;
                                    ankk.l(a3.b(), anoeVar.e);
                                }
                            } else {
                                throw new GeneralSecurityException("Missing catalogue_name.");
                            }
                        } else {
                            throw new GeneralSecurityException("Missing primitive_name.");
                        }
                    } else {
                        throw new GeneralSecurityException("Missing type_url.");
                    }
                }
                ankk.g(new anpj(1));
                d = (anjn) a2.b(anjn.class);
            } catch (aoob unused) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IllegalArgumentException | GeneralSecurityException unused2) {
        }
    }

    public static String l(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    public static byte[] m(String str, boolean z) {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unable to decode ".concat(valueOf) : new String("Unable to decode "));
    }

    public static dyd n(dyd dydVar, dxk dxkVar, dyh dyhVar, Boolean bool, Boolean bool2) {
        dyd dydVar2 = new dyd();
        Iterator k = dydVar.k();
        while (k.hasNext()) {
            int intValue = ((Integer) k.next()).intValue();
            if (dydVar.s(intValue)) {
                dyn a2 = dyhVar.a(dxkVar, Arrays.asList(dydVar.e(intValue), new dyg(Double.valueOf(intValue)), dydVar));
                if (a2.g().equals(bool)) {
                    return dydVar2;
                }
                if (bool2 == null || a2.g().equals(bool2)) {
                    dydVar2.q(intValue, a2);
                }
            }
        }
        return dydVar2;
    }

    public static dyd o(dyd dydVar, dxk dxkVar, dyh dyhVar) {
        return n(dydVar, dxkVar, dyhVar, null, null);
    }

    public static dyn p(dyd dydVar, dxk dxkVar, List list, boolean z) {
        dyn dynVar;
        D("reduce", 1, list);
        E("reduce", 2, list);
        dyn b = dxkVar.b((dyn) list.get(0));
        if (!(b instanceof dyh)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            dynVar = dxkVar.b((dyn) list.get(1));
            if (dynVar instanceof dyf) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (dydVar.c() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            dynVar = null;
        }
        dyh dyhVar = (dyh) b;
        int c = dydVar.c();
        int i = z ? 0 : c - 1;
        int i2 = z ? c - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (dynVar == null) {
            dynVar = dydVar.e(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (dydVar.s(i)) {
                dynVar = dyhVar.a(dxkVar, Arrays.asList(dynVar, dydVar.e(i), new dyg(Double.valueOf(i)), dydVar));
                if (dynVar instanceof dyf) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return dynVar;
    }

    public static dyn q(dyj dyjVar, dyn dynVar, dxk dxkVar, List list) {
        dyq dyqVar = (dyq) dynVar;
        if (dyjVar.t(dyqVar.a)) {
            dyn f = dyjVar.f(dyqVar.a);
            if (f instanceof dyh) {
                return ((dyh) f).a(dxkVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", dyqVar.a));
        }
        if ("hasOwnProperty".equals(dyqVar.a)) {
            B("hasOwnProperty", 1, list);
            return dyjVar.t(dxkVar.b((dyn) list.get(0)).i()) ? dyn.k : dyn.l;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", dyqVar.a));
    }

    public static Iterator r(Map map) {
        return new dyi(map.keySet().iterator());
    }

    public static dyn s(rll rllVar) {
        if (rllVar == null) {
            return dyn.f;
        }
        int n = rqr.n(rllVar.c);
        if (n == 0) {
            n = 1;
        }
        int i = n - 1;
        if (i == 1) {
            if ((rllVar.b & 4) == 0) {
                return dyn.m;
            }
            return new dyq(rllVar.f);
        }
        if (i == 2) {
            if ((rllVar.b & 16) == 0) {
                return new dyg(null);
            }
            return new dyg(Double.valueOf(rllVar.h));
        }
        if (i == 3) {
            if ((rllVar.b & 8) == 0) {
                return new dye(null);
            }
            return new dye(Boolean.valueOf(rllVar.g));
        }
        if (i == 4) {
            aony aonyVar = rllVar.d;
            ArrayList arrayList = new ArrayList();
            Iterator it = aonyVar.iterator();
            while (it.hasNext()) {
                arrayList.add(s((rll) it.next()));
            }
            return new dyo(rllVar.e, arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    public static dyn t(Object obj) {
        if (obj == null) {
            return dyn.g;
        }
        if (obj instanceof String) {
            return new dyq((String) obj);
        }
        if (obj instanceof Double) {
            return new dyg((Double) obj);
        }
        if (obj instanceof Long) {
            return new dyg(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new dyg(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new dye((Boolean) obj);
        }
        if (obj instanceof Map) {
            dyk dykVar = new dyk();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                dyn t = t(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    dykVar.r((String) obj2, t);
                }
            }
            return dykVar;
        }
        if (obj instanceof List) {
            dyd dydVar = new dyd();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dydVar.n(t(it.next()));
            }
            return dydVar;
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public static double u(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == 0.0d) {
            return d2;
        }
        double d3 = d2 > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d2));
        Double.isNaN(d3);
        return d3 * floor;
    }

    public static int v(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        double d3 = d2 > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d2));
        Double.isNaN(d3);
        return (int) ((d3 * floor) % 4.294967296E9d);
    }

    public static long w(double d2) {
        return v(d2) & 4294967295L;
    }

    public static dzf x(String str) {
        dzf dzfVar = null;
        if (str != null && !str.isEmpty()) {
            dzfVar = (dzf) dzf.ao.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (dzfVar != null) {
            return dzfVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object y(dyn dynVar) {
        if (dyn.g.equals(dynVar)) {
            return null;
        }
        if (dyn.f.equals(dynVar)) {
            return "";
        }
        if (dynVar instanceof dyk) {
            return z((dyk) dynVar);
        }
        if (dynVar instanceof dyd) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((dyd) dynVar).iterator();
            while (it.hasNext()) {
                Object y = y(((dyc) it).next());
                if (y != null) {
                    arrayList.add(y);
                }
            }
            return arrayList;
        }
        if (!dynVar.h().isNaN()) {
            return dynVar.h();
        }
        return dynVar.i();
    }

    public static Map z(dyk dykVar) {
        HashMap hashMap = new HashMap();
        for (String str : new ArrayList(dykVar.a.keySet())) {
            Object y = y(dykVar.f(str));
            if (y != null) {
                hashMap.put(str, y);
            }
        }
        return hashMap;
    }
}
