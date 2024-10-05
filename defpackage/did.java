package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.provider.Settings;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.TextContent;
import com.facebook.yoga.YogaMeasureMode;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class did {
    public static dgs a;
    public static djd b;
    public static dkr c;
    public static dlw d;
    public static dkd e;
    public static dle f;
    public static Paint g;
    public static Paint h;
    public static Rect i;
    public static Paint j;
    public static Paint k;
    public static volatile djg l;
    public static volatile dmz m;
    private static dip n;
    private static dmy o;
    private static djs p;
    private static dje q;
    private static dms r;
    private static djf s;
    private static dmu t;

    public did() {
    }

    public did(List list) {
        Collections.unmodifiableList(list);
    }

    public static void A(dic dicVar, int i2, StringBuilder sb) {
        if (dicVar == null) {
            return;
        }
        sb.append(dicVar.c().o());
        sb.append('{');
        dkp h2 = dicVar.h();
        die g2 = dicVar.g();
        sb.append((h2 == null || h2.getVisibility() != 0) ? "H" : "V");
        if (g2 != null && g2.a() != null) {
            sb.append(" [clickable]");
        }
        sb.append('}');
        for (dic dicVar2 : dicVar.m()) {
            sb.append("\n");
            for (int i3 = 0; i3 <= i2; i3++) {
                sb.append("  ");
            }
            A(dicVar2, i2 + 1, sb);
        }
    }

    public static String B(String str, int i2) {
        if (i2 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 4);
        sb.append(str);
        sb.append('!');
        sb.append(i2);
        return sb.toString();
    }

    public static TextContent C(List list) {
        int size = list.size();
        if (size == 1) {
            Object obj = list.get(0);
            return obj instanceof TextContent ? (TextContent) obj : TextContent.b;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 instanceof TextContent) {
                arrayList.addAll(((TextContent) obj2).getTextItems());
            }
        }
        return new dhh(arrayList);
    }

    public static void D(dum dumVar) {
        if (dju.a(dumVar).d()) {
            ((ComponentHost) dumVar.b).k();
        }
    }

    public static void E(int i2, int i3, aeh aehVar, aeh aehVar2) {
        Object e2;
        if (H(i2, aehVar2)) {
            e2 = aehVar2.e(i2);
            aehVar2.l(i2);
        } else {
            e2 = aehVar.e(i2);
            aehVar.l(i2);
        }
        aehVar.k(i3, e2);
    }

    public static void F(int i2, aeh aehVar, aeh aehVar2) {
        if (H(i2, aehVar2)) {
            aehVar2.l(i2);
        } else {
            aehVar.l(i2);
        }
    }

    public static void G(int i2, aeh aehVar, aeh aehVar2) {
        Object e2;
        if (aehVar == null || aehVar2 == null || (e2 = aehVar.e(i2)) == null) {
            return;
        }
        aehVar2.k(i2, e2);
    }

    static boolean H(int i2, aeh aehVar) {
        return (aehVar == null || aehVar.e(i2) == null) ? false : true;
    }

    public static void I(View view, Drawable drawable, int i2, dik dikVar) {
        if (((dikVar == null || !dikVar.s()) && !dju.e(i2)) || !drawable.isStateful()) {
            return;
        }
        drawable.setState(view.getDrawableState());
    }

    public static List J(List list, Object obj) {
        if (list == null) {
            list = new LinkedList();
        }
        list.add(obj);
        return list;
    }

    public static boolean K(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001f, code lost:
    
        if (r8 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void L(android.view.View r3, int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r0 = r6 - r4
            int r1 = r7 - r5
            if (r8 != 0) goto L12
            int r2 = r3.getMeasuredHeight()
            if (r2 != r1) goto L12
            int r2 = r3.getMeasuredWidth()
            if (r2 == r0) goto L21
        L12:
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r3.measure(r0, r1)
            if (r8 != 0) goto L3b
        L21:
            int r8 = r3.getLeft()
            if (r8 != r4) goto L3b
            int r8 = r3.getTop()
            if (r8 != r5) goto L3b
            int r8 = r3.getRight()
            if (r8 != r6) goto L3b
            int r8 = r3.getBottom()
            if (r8 == r7) goto L3a
            goto L3b
        L3a:
            return
        L3b:
            r3.layout(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.did.L(android.view.View, int, int, int, int, boolean):void");
    }

    public static void M(Drawable drawable, int i2, int i3) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(bounds.left, bounds.top, bounds.left + i2, bounds.top + i3);
        if (drawable instanceof dks) {
            ((dks) drawable).a(i2, i3);
        }
    }

    public static void N(Drawable drawable, int i2, int i3) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(i2, i3, bounds.width() + i2, bounds.height() + i3);
    }

    public static int O(Layout layout) {
        if (layout == null) {
            return 0;
        }
        return layout.getHeight();
    }

    public static TextDirectionHeuristic P(ajn ajnVar) {
        return ajnVar == ajt.a ? TextDirectionHeuristics.LTR : ajnVar == ajt.b ? TextDirectionHeuristics.RTL : ajnVar == ajt.c ? TextDirectionHeuristics.FIRSTSTRONG_LTR : ajnVar == ajt.d ? TextDirectionHeuristics.FIRSTSTRONG_RTL : ajnVar == ajt.e ? TextDirectionHeuristics.ANYRTL_LTR : ajnVar == ajt.f ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static StaticLayout Q(CharSequence charSequence, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f2, float f3, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, ajn ajnVar) {
        try {
            return new StaticLayout(charSequence, 0, i2, textPaint, i3, alignment, P(ajnVar), f2, f3, z, truncateAt, i4, i5);
        } catch (IllegalArgumentException e2) {
            if (e2.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, 0, i2, textPaint, i3, alignment, P(ajnVar), f2, f3, z, truncateAt, i4, i5);
            }
            throw e2;
        }
    }

    public static StaticLayout R(CharSequence charSequence, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f2, float f3, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, ajn ajnVar) {
        try {
            return Q(charSequence, i2, textPaint, i3, alignment, f2, f3, z, truncateAt, i4, i5, ajnVar);
        } catch (LinkageError unused) {
            return new StaticLayout(charSequence, 0, i2, textPaint, i3, alignment, f2, f3, z, truncateAt, i4);
        }
    }

    public static int S(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public static String T(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new Error(e2);
        }
    }

    public static byte[] U(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new Error(e2);
        }
    }

    public static void V(ByteBuffer byteBuffer, double d2) {
        int i2 = (int) (d2 * 1.073741824E9d);
        byteBuffer.put((byte) (i2 >> 24));
        byteBuffer.put((byte) ((i2 >> 16) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) ((i2 >> 8) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) (i2 & PrivateKeyType.INVALID));
    }

    public static void W(ByteBuffer byteBuffer, double d2) {
        int i2 = (int) (d2 * 65536.0d);
        byteBuffer.put((byte) (i2 >> 24));
        byteBuffer.put((byte) ((i2 >> 16) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) ((i2 >> 8) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) (i2 & PrivateKeyType.INVALID));
    }

    public static void X(ByteBuffer byteBuffer, double d2) {
        short s2 = (short) (d2 * 256.0d);
        byteBuffer.put((byte) ((s2 >> 8) & PrivateKeyType.INVALID));
        byteBuffer.put((byte) (s2 & 255));
    }

    public static void Y(ByteBuffer byteBuffer, int i2) {
        ab(byteBuffer, (i2 >> 8) & PrivateKeyType.INVALID);
        ab(byteBuffer, i2 & PrivateKeyType.INVALID);
    }

    public static void Z(ByteBuffer byteBuffer, int i2) {
        int i3 = i2 & 16777215;
        Y(byteBuffer, i3 >> 8);
        ab(byteBuffer, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean aB(java.lang.reflect.Field r2, java.lang.Class r3, java.lang.Object r4, java.lang.Object r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.did.aB(java.lang.reflect.Field, java.lang.Class, java.lang.Object, java.lang.Object, boolean):boolean");
    }

    private static final boolean aC(int i2, int i3, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i2 >= i3;
    }

    public static void aa(ByteBuffer byteBuffer, long j2) {
        byteBuffer.putInt((int) j2);
    }

    public static void ab(ByteBuffer byteBuffer, int i2) {
        byteBuffer.put((byte) (i2 & PrivateKeyType.INVALID));
    }

    public static void ac(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(U(str));
        ab(byteBuffer, 0);
    }

    public static double ad(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d2 = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d2);
        return d2 / 1.073741824E9d;
    }

    public static void addViewDescription(int i2, int i3, dic dicVar, StringBuilder sb, boolean z) {
        dik bb;
        sb.append("litho.");
        sb.append(dicVar.c().o());
        sb.append('{');
        sb.append(Integer.toHexString(dicVar.hashCode()));
        sb.append(' ');
        dkp h2 = dicVar.h();
        die g2 = dicVar.g();
        String str = ".";
        sb.append((h2 == null || h2.getVisibility() != 0) ? "." : "V");
        sb.append((g2 == null || (bb = g2.a.bb()) == null || bb.o != 1) ? "." : "F");
        sb.append((h2 == null || !h2.isEnabled()) ? "." : "E");
        sb.append(".");
        sb.append((h2 == null || !h2.isHorizontalScrollBarEnabled()) ? "." : "H");
        sb.append((h2 == null || !h2.isVerticalScrollBarEnabled()) ? "." : "V");
        if (g2 != null && g2.a() != null) {
            str = "C";
        }
        sb.append(str);
        sb.append(". .. ");
        Rect a2 = dicVar.a();
        sb.append(a2.left + i2);
        sb.append(",");
        sb.append(a2.top + i3);
        sb.append("-");
        sb.append(i2 + a2.right);
        sb.append(",");
        sb.append(i3 + a2.bottom);
        String str2 = null;
        String aq = dicVar.o() ? dicVar.b.aq() : null;
        if (aq != null && !TextUtils.isEmpty(aq)) {
            sb.append(String.format(" litho:id/%s", aq.replace(' ', '_')));
        }
        dkp h3 = dicVar.h();
        if (h3 != null) {
            dha c2 = dicVar.c();
            dkv dkvVar = h3.s;
            int a3 = dkvVar.a();
            int i4 = 0;
            while (true) {
                if (i4 >= a3) {
                    break;
                }
                dum g3 = dkvVar.g(i4);
                dha dhaVar = g3 == null ? null : dju.a(g3).b;
                if (dhaVar != null && dhaVar.k == c2.k) {
                    Object obj = g3.a;
                    StringBuilder sb2 = new StringBuilder();
                    if (obj instanceof TextContent) {
                        Iterator it = ((TextContent) obj).getTextItems().iterator();
                        while (it.hasNext()) {
                            sb2.append((CharSequence) it.next());
                        }
                    } else if (obj instanceof TextView) {
                        sb2.append(((TextView) obj).getText());
                    }
                    if (sb2.length() != 0) {
                        str2 = sb2.toString();
                        break;
                    }
                }
                i4++;
            }
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            String replace = str2.replace("\n", "").replace("\"", "");
            if (replace.length() > 200) {
                replace = String.valueOf(replace.substring(0, 200)).concat("...");
            }
            sb.append(String.format(" text=\"%s\"", replace));
        }
        if (!z && g2 != null && g2.a() != null) {
            sb.append(" [clickable]");
        }
        sb.append('}');
    }

    public static double ae(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d2 = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d2);
        return d2 / 65536.0d;
    }

    public static float af(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[2]);
        return ((short) (((short) ((r0[0] << 8) & 65280)) | (r0[1] & 255))) / 256.0f;
    }

    public static int ag(byte b2) {
        return b2 < 0 ? b2 + 256 : b2;
    }

    public static int ah(ByteBuffer byteBuffer) {
        return (ag(byteBuffer.get()) << 8) + ag(byteBuffer.get());
    }

    public static int ai(ByteBuffer byteBuffer) {
        return (ah(byteBuffer) << 8) + ag(byteBuffer.get());
    }

    public static int aj(ByteBuffer byteBuffer) {
        return ag(byteBuffer.get());
    }

    public static long ak(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    public static long al(ByteBuffer byteBuffer) {
        long ak = ak(byteBuffer) << 32;
        if (ak < 0) {
            throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        return ak + ak(byteBuffer);
    }

    public static String am(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String an(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b2 = byteBuffer.get();
            if (b2 != 0) {
                byteArrayOutputStream.write(b2);
            } else {
                return T(byteArrayOutputStream.toByteArray());
            }
        }
    }

    public static String ao(ByteBuffer byteBuffer, int i2) {
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return T(bArr);
    }

    public static Object ap(Object obj) {
        at(obj, "Argument must not be null");
        return obj;
    }

    public static void aq(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void ar(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void as(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void at(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final int au(int i2, ByteBuffer byteBuffer) {
        if (aC(i2, 4, byteBuffer)) {
            return byteBuffer.getInt(i2);
        }
        return -1;
    }

    public static final short av(int i2, ByteBuffer byteBuffer) {
        if (aC(i2, 2, byteBuffer)) {
            return byteBuffer.getShort(i2);
        }
        return (short) -1;
    }

    public static dlg aw(taz tazVar, String str, dlg dlgVar, amsj amsjVar) {
        Map e2;
        if (dlgVar == null) {
            return null;
        }
        if (str == null) {
            taz.b(dlgVar);
            return null;
        }
        dlgVar.a("log_tag", str);
        if (amsjVar == null || (e2 = tazVar.e(amsjVar)) == null) {
            return dlgVar;
        }
        for (Map.Entry entry : e2.entrySet()) {
            dlgVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return dlgVar;
    }

    public static final void ax(esv esvVar, vak vakVar) {
        List list = vakVar.a;
        dpw dpwVar = (dpw) esvVar;
        dpw.ab(1, dpwVar.c, dpwVar.b);
        list.add(dpwVar.a);
    }

    private static int ay(float f2) {
        return f2 >= 0.0f ? 1 : -1;
    }

    private static void az(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5) {
        int i6 = i2 > i4 ? i2 : i4;
        if (i2 > i4) {
            i2 = i4;
        }
        int i7 = i3 > i5 ? i3 : i5;
        if (i3 > i5) {
            i3 = i5;
        }
        canvas.drawRect(i2, i3, i6, i7, paint);
    }

    public static void b(diy diyVar, View view, MotionEvent motionEvent) {
        if (n == null) {
            n = new dip();
        }
        n.b = motionEvent;
        n.a = view;
        diyVar.a.l().K(diyVar, n);
        n.b = null;
        n.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(diy diyVar) {
        if (q == null) {
            q = new dje();
        }
        diyVar.a(q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(diy diyVar) {
        if (s == null) {
            s = new djf();
        }
        diyVar.a(s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(diy diyVar, View view) {
        if (p == null) {
            p = new djs();
        }
        p.a = view;
        diyVar.a(p);
        p.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(diy diyVar) {
        if (r == null) {
            r = new dms();
        }
        diyVar.a(r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(diy diyVar, int i2, int i3, float f2, float f3) {
        if (t == null) {
            t = new dmu();
        }
        t.a = i3;
        t.b = i2;
        t.d = f3;
        t.c = f2;
        diyVar.a(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(diy diyVar, View view, View view2) {
        if (o == null) {
            o = new dmy();
        }
        o.a = view;
        o.b = view2;
        diyVar.a(o);
        o.a = null;
        o.b = null;
    }

    public static int i(Resources resources, int i2) {
        return (int) ((i2 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static void j(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6) {
        az(canvas, paint, i2, i3, i2 + i4, i3 + (ay(i5) * i6));
        az(canvas, paint, i2, i3, i2 + (i6 * ay(i4)), i3 + i5);
    }

    public static boolean k(View view) {
        return (dkv.c(view) == null && dkv.e(view) == null && dkv.f(view) == null) ? false : true;
    }

    public static dlg l(dhe dheVar, taz tazVar, dlg dlgVar) {
        return aw(tazVar, dheVar.c, dlgVar, dheVar.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static djr m(dhe dheVar) {
        dlb dlbVar = dld.b;
        return new dii(dheVar);
    }

    public static int n(float f2) {
        double d2;
        double d3;
        if (f2 > 0.0f) {
            d2 = f2;
            d3 = 0.5d;
        } else {
            d2 = f2;
            d3 = -0.5d;
        }
        Double.isNaN(d2);
        return (int) (d2 + d3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean o(Drawable drawable, Drawable drawable2) {
        if (drawable == 0) {
            return drawable2 == 0;
        }
        if (drawable2 == 0) {
            return false;
        }
        if (!(drawable instanceof dow) || !(drawable2 instanceof dow)) {
            return drawable.equals(drawable2);
        }
        return ((dow) drawable).a((dow) drawable2);
    }

    public static dmi p(djr djrVar) {
        String str;
        int i2;
        String str2;
        if (djrVar.aQ()) {
            str = djrVar.ar();
            int ba = djrVar.ba();
            i2 = 2;
            if (ba == 1) {
                str2 = null;
                i2 = 1;
            } else if (ba == 2) {
                str2 = djrVar.as();
            } else {
                String str3 = ba != 1 ? "null" : "GLOBAL";
                StringBuilder sb = new StringBuilder(str3.length() + 30);
                sb.append("Unhandled transition key type ");
                sb.append(str3);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            dha W = djrVar.W();
            str = W != null ? W.m : null;
            i2 = 3;
            str2 = null;
        }
        if (str != null) {
            return new dmi(i2, str, str2);
        }
        return null;
    }

    public static void q(dmh dmhVar, List list, String str) {
        if (dmhVar instanceof dmb) {
            list.addAll(((dmb) dmhVar).a());
            return;
        }
        if (dmhVar != null) {
            list.add(dmhVar);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("[");
        sb.append(str);
        sb.append("] Adding null to transition list is not allowed.");
        throw new IllegalStateException(sb.toString());
    }

    public static void r(dmi dmiVar, dmh dmhVar, dng dngVar, dmc dmcVar) {
        int i2 = 0;
        if (dmhVar instanceof dmr) {
            ArrayList arrayList = ((dmr) dmhVar).a;
            int size = arrayList.size();
            while (i2 < size) {
                r(dmiVar, (dmh) arrayList.get(i2), dngVar, dmcVar);
                i2++;
            }
            return;
        }
        if (dmhVar instanceof dmg) {
            dmg dmgVar = (dmg) dmhVar;
            anjr anjrVar = dmgVar.a.b;
            int i3 = anjrVar.b;
            if (dmiVar.b.equals(anjrVar.a) && dngVar.equals(dmgVar.a.a.b)) {
                dmcVar.a = true;
                if (dmgVar.a()) {
                    dmcVar.b = dmgVar;
                    return;
                }
                return;
            }
            return;
        }
        if (dmhVar instanceof dmb) {
            ArrayList a2 = ((dmb) dmhVar).a();
            int size2 = a2.size();
            while (i2 < size2) {
                r(dmiVar, (dmh) a2.get(i2), dngVar, dmcVar);
                i2++;
            }
            return;
        }
        String valueOf = String.valueOf(dmhVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Unhandled transition type: ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString());
    }

    public static boolean s(Context context) {
        boolean z = doa.a;
        if (doa.f) {
            return false;
        }
        if (doa.e) {
            return (context == null || Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) ? false : true;
        }
        return true;
    }

    public static boolean t() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static int u(float f2, YogaMeasureMode yogaMeasureMode) {
        YogaMeasureMode yogaMeasureMode2 = YogaMeasureMode.UNDEFINED;
        int ordinal = yogaMeasureMode.ordinal();
        if (ordinal == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (ordinal == 1) {
            return View.MeasureSpec.makeMeasureSpec(n(f2), 1073741824);
        }
        if (ordinal == 2) {
            return View.MeasureSpec.makeMeasureSpec(n(f2), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        }
        String valueOf = String.valueOf(yogaMeasureMode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Unexpected YogaMeasureMode: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int v(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(View.MeasureSpec.getSize(i2), i3);
        }
        if (mode == 0) {
            return i3;
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i2);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unexpected size mode: ");
        sb.append(mode2);
        throw new IllegalStateException(sb.toString());
    }

    public static boolean w(int i2, int i3) {
        return i2 == i3 || (View.MeasureSpec.getMode(i2) == 0 && View.MeasureSpec.getMode(i3) == 0);
    }

    public static boolean x(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (i2 == i3) {
            return true;
        }
        if (mode2 == 0) {
            if (mode == 0) {
                return true;
            }
            mode2 = 0;
        }
        float f2 = i4;
        if (mode == 1073741824 && Math.abs(size - f2) < 0.5f) {
            return true;
        }
        if (mode == Integer.MIN_VALUE && mode2 == 0) {
            if (size >= f2) {
                return true;
            }
            mode2 = 0;
        }
        return mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 > size && f2 <= ((float) size);
    }

    public static boolean y(Object obj, Object obj2, boolean z) {
        if (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) {
            throw new IllegalArgumentException("The input is invalid.");
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(dnt.class)) {
                Class<?> type = field.getType();
                try {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj);
                    Object obj4 = field.get(obj2);
                    field.setAccessible(false);
                    boolean z2 = doa.a;
                    if (!aB(field, type, obj3, obj4, z)) {
                        return false;
                    }
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException("Unable to get fields by reflection.", e2);
                }
            }
        }
        return true;
    }

    public static boolean z(dha dhaVar, dha dhaVar2) {
        if (dhaVar == dhaVar2) {
            return true;
        }
        if (dhaVar == null || dhaVar2 == null) {
            return false;
        }
        return dhaVar.getClass().equals(dhaVar2.getClass());
    }

    private static boolean aA(int i2, Collection collection, Collection collection2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Level cannot be < 1");
        }
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (i2 == 1) {
                if (!((dha) it.next()).f((dha) it2.next())) {
                    return false;
                }
            } else if (!aA(i2 - 1, (Collection) it.next(), (Collection) it2.next())) {
                return false;
            }
        }
        return true;
    }
}
