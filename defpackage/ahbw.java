package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahbw {

    @Backup
    public static final String AUTONAV = "autonav";

    @Backup
    public static final String NERD_STATS_ENABLED = "nerd_stats_enabled";

    @Backup
    public static final String SUBTITLES_ENABLED = "subtitles_enabled";

    @Backup
    public static final String SUBTITLES_LANGUAGE_CODE = "subtitles_language_code";

    public static float A(avgg avggVar) {
        float f = -1.0f;
        if (L(avggVar)) {
            Iterator it = avggVar.c.iterator();
            while (it.hasNext()) {
                int i = ((avgf) it.next()).e;
                if (i != 0) {
                    float f2 = r0.d / i;
                    if (f2 > f) {
                        f = f2;
                    }
                }
            }
        }
        return f;
    }

    public static Uri B(avgg avggVar) {
        avgf F = F(avggVar);
        if (F == null) {
            return null;
        }
        return wbs.aj(F.c);
    }

    public static Uri C(avgg avggVar, int i, int i2) {
        avgf H = H(avggVar, i, i2);
        if (H == null || (H.b & 1) == 0) {
            return null;
        }
        return wbs.aj(H.c);
    }

    public static Uri D(avgg avggVar, int i) {
        avgf I = I(avggVar, i);
        if (I == null) {
            return null;
        }
        return wbs.aj(I.c);
    }

    public static Uri E(avgg avggVar) {
        avgf J2 = J(avggVar);
        if (J2 != null) {
            return wbs.aj(J2.c);
        }
        return null;
    }

    public static avgf F(avgg avggVar) {
        if (!L(avggVar)) {
            return null;
        }
        return (avgf) avggVar.c.get(avggVar.c.size() - 1);
    }

    public static avgf G(avgg avggVar, int i, int i2) {
        int i3 = 0;
        amkq.E(i > 0);
        amkq.E(i2 > 0);
        avgf avgfVar = null;
        if (L(avggVar)) {
            for (avgf avgfVar2 : avggVar.c) {
                int i4 = avgfVar2.d;
                int i5 = avgfVar2.e;
                double d = i4;
                double d2 = i5;
                double d3 = i;
                double d4 = i2;
                Double.isNaN(d3);
                Double.isNaN(d4);
                double d5 = d3 / d4;
                Double.isNaN(d);
                Double.isNaN(d2);
                if (d / d2 > d5) {
                    Double.isNaN(d2);
                    i4 = (int) Math.round(d2 * d5);
                } else {
                    Double.isNaN(d);
                    i5 = (int) Math.round(d / d5);
                }
                int i6 = i - i4;
                int i7 = i2 - i5;
                int i8 = (i6 * i6) + (i7 * i7);
                if (avgfVar == null || i8 < i3) {
                    avgfVar = avgfVar2;
                    i3 = i8;
                }
            }
        }
        return avgfVar;
    }

    public static avgf H(avgg avggVar, int i, int i2) {
        int i3 = 0;
        amkq.E(i >= 0);
        amkq.E(i2 >= 0);
        avgf avgfVar = null;
        if (L(avggVar)) {
            for (avgf avgfVar2 : avggVar.c) {
                int i4 = i - avgfVar2.d;
                int i5 = i2 - avgfVar2.e;
                int i6 = (i4 * i4) + (i5 * i5);
                if (avgfVar == null || i6 < i3) {
                    avgfVar = avgfVar2;
                    i3 = i6;
                }
            }
        }
        return avgfVar;
    }

    public static avgf I(avgg avggVar, int i) {
        if (!L(avggVar)) {
            return null;
        }
        if (i <= 0) {
            return (avgf) avggVar.c.get(0);
        }
        for (avgf avgfVar : avggVar.c) {
            if (avgfVar.d >= i) {
                return avgfVar;
            }
        }
        return (avgf) avggVar.c.get(avggVar.c.size() - 1);
    }

    public static avgf J(avgg avggVar) {
        if (L(avggVar)) {
            return (avgf) avggVar.c.get(0);
        }
        return null;
    }

    public static avgg K(Uri uri) {
        if (uri == null) {
            return null;
        }
        aong aongVar = (aong) avgg.a.createBuilder();
        aone createBuilder = avgf.a.createBuilder();
        String uri2 = uri.toString();
        createBuilder.copyOnWrite();
        avgf avgfVar = (avgf) createBuilder.instance;
        uri2.getClass();
        avgfVar.b |= 1;
        avgfVar.c = uri2;
        aongVar.cB(createBuilder);
        return (avgg) aongVar.build();
    }

    public static boolean L(avgg avggVar) {
        return avggVar != null && avggVar.c.size() > 0;
    }

    public static boolean M(avgg avggVar) {
        return L(avggVar) && ((avgf) avggVar.c.get(0)).e == ((avgf) avggVar.c.get(0)).d;
    }

    public static Bitmap N(ContentResolver contentResolver, Uri uri, Rect rect, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        while (i > 0 && width / options.inSampleSize > i && i2 > 0 && height / options.inSampleSize > i2) {
            int i3 = options.inSampleSize;
            options.inSampleSize = i3 + i3;
        }
        int T = T(contentResolver, uri);
        if (T != 0) {
            Pair P = P(contentResolver, uri);
            Matrix matrix = new Matrix();
            matrix.postTranslate((-((Integer) P.first).intValue()) / 2, (-((Integer) P.second).intValue()) / 2);
            matrix.postRotate(-T);
            if (U(T)) {
                matrix.postTranslate(((Integer) P.second).intValue() / 2, ((Integer) P.first).intValue() / 2);
            } else {
                matrix.postTranslate(((Integer) P.first).intValue() / 2, ((Integer) P.second).intValue() / 2);
            }
            RectF rectF = new RectF(rect);
            matrix.mapRect(rectF);
            rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(contentResolver.openInputStream(uri), false);
        try {
            try {
                Bitmap decodeRegion = newInstance.decodeRegion(rect, options);
                if (T == 0) {
                    return decodeRegion;
                }
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(T);
                try {
                    return Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix2, false);
                } finally {
                    decodeRegion.recycle();
                }
            } finally {
                newInstance.recycle();
            }
        } catch (IllegalArgumentException e) {
            Pair P2 = P(contentResolver, uri);
            String valueOf = String.valueOf(uri);
            String valueOf2 = String.valueOf(P2.first);
            String valueOf3 = String.valueOf(P2.second);
            String valueOf4 = String.valueOf(rect);
            int i4 = options.inSampleSize;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 113 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
            sb.append("Unexpected exception while cropping an image: ");
            sb.append(valueOf);
            sb.append(", size: ");
            sb.append(valueOf2);
            sb.append("x");
            sb.append(valueOf3);
            sb.append(", crop bounds: ");
            sb.append(valueOf4);
            sb.append(", scale: x");
            sb.append(i4);
            sb.append(", degrees: ");
            sb.append(T);
            zga.d(sb.toString(), e);
            throw e;
        }
    }

    public static Bitmap O(Bitmap bitmap, ContentResolver contentResolver, Uri uri) {
        int T = T(contentResolver, uri);
        if (T == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(T);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        } finally {
            bitmap.recycle();
        }
    }

    public static Pair P(ContentResolver contentResolver, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        if (U(T(contentResolver, uri))) {
            return Pair.create(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        }
        return Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public static Bitmap Q(ContentResolver contentResolver, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        options.inSampleSize = 1;
        int i = options.outWidth / 2;
        int i2 = options.outHeight / 2;
        while (i / options.inSampleSize > 1024 && i2 / options.inSampleSize > 1024) {
            int i3 = options.inSampleSize;
            options.inSampleSize = i3 + i3;
        }
        options.inJustDecodeBounds = false;
        return O(BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options), contentResolver, uri);
    }

    public static void R(ajka ajkaVar) {
        afsi.c(2, 16, String.format("%s (%s)", ajkaVar.getClass().getSimpleName(), ajkaVar.a), ajkaVar);
    }

    private static void S(ajom ajomVar, View view, ajos ajosVar) {
        ajok p = p(view);
        if (p != null) {
            p.h();
        }
        ajosVar.getClass();
        ajomVar.b(ajosVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r3 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int T(android.content.ContentResolver r10, android.net.Uri r11) {
        /*
            java.lang.String r0 = "orientation"
            r1 = 0
            amy r2 = new amy     // Catch: java.io.IOException -> L57
            java.io.InputStream r3 = r10.openInputStream(r11)     // Catch: java.io.IOException -> L57
            r2.<init>(r3)     // Catch: java.io.IOException -> L57
            int r2 = r2.b()     // Catch: java.io.IOException -> L57
            switch(r2) {
                case 1: goto L21;
                case 2: goto L13;
                case 3: goto L1e;
                case 4: goto L1e;
                case 5: goto L1b;
                case 6: goto L1b;
                case 7: goto L18;
                case 8: goto L18;
                default: goto L13;
            }
        L13:
            r2 = 1
            r3 = 0
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            goto L22
        L18:
            r10 = -90
            return r10
        L1b:
            r10 = 90
            return r10
        L1e:
            r10 = 180(0xb4, float:2.52E-43)
            return r10
        L21:
            return r1
        L22:
            r6[r1] = r0     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r10
            r5 = r11
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            if (r3 == 0) goto L48
            boolean r10 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            if (r10 == 0) goto L48
            int r10 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            r11 = -1
            if (r10 == r11) goto L48
            int r10 = r3.getInt(r10)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            r3.close()     // Catch: java.io.IOException -> L57
            return r10
        L44:
            r10 = move-exception
            goto L4e
        L46:
            goto L54
        L48:
            if (r3 == 0) goto L57
        L4a:
            r3.close()     // Catch: java.io.IOException -> L57
            goto L57
        L4e:
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.io.IOException -> L57
        L53:
            throw r10     // Catch: java.io.IOException -> L57
        L54:
            if (r3 == 0) goto L57
            goto L4a
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahbw.T(android.content.ContentResolver, android.net.Uri):int");
    }

    private static boolean U(int i) {
        return Math.abs(i % 180) == 90;
    }

    public static final Class[] a(ahsh ahshVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahee.class};
        }
        if (i == 0) {
            ahshVar.a((ahee) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static Uri b(Context context) {
        return whl.s(context, "player", "features/backup.pb");
    }

    public static aypn c(aypn aypnVar, amml ammlVar) {
        return aypnVar.n().M(new aipp(ammlVar, 0));
    }

    public static aypn d(aypn aypnVar, amml ammlVar) {
        return aypnVar.n().M(new aipp(ammlVar, 2));
    }

    public static aypr e(int i) {
        return new aipo(i, 1);
    }

    public static void f(Throwable th) {
        afsi.c(2, 10, "AdNotificationController failed unexpectedly while receiving an RX event.", th);
    }

    public static aypr g(aadw aadwVar, long j) {
        atyg F = aifk.F(aadwVar);
        if ((j & (F != null ? F.i : 0L)) == 0) {
            return ntu.n;
        }
        atyg F2 = aifk.F(aadwVar);
        return new aipo(F2 != null ? F2.j : 0, 0);
    }

    public static aypn h(aioc aiocVar, amml ammlVar, amml ammlVar2) {
        return c((aypn) ammlVar.apply(aiocVar), ammlVar2);
    }

    public static boolean i(int i) {
        return i == 2 || i == 3;
    }

    public static aihl j(final aihi aihiVar) {
        return new aihl() { // from class: aimi
            @Override // defpackage.aihl
            public final aihk a(PlaybackStartDescriptor playbackStartDescriptor) {
                return aihi.this;
            }
        };
    }

    public static aimj k(ammy ammyVar, aimb aimbVar) {
        return new aimj(aimbVar, ammyVar);
    }

    public static final Class[] l(ajtc ajtcVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aacj.class, aaxa.class};
        }
        if (i == 0) {
            ajtcVar.p(((aacj) obj).b());
            return null;
        }
        if (i == 1) {
            ajtcVar.p(((aaxa) obj).b());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static final Class[] m(ajud ajudVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ajtr.class, ajtv.class, ajtw.class, ajuh.class};
        }
        if (i == 0) {
            ajudVar.k = true;
            ajudVar.J(ajudVar.j.b((ajtr) obj));
            return null;
        }
        if (i == 1) {
            ajudVar.k = false;
            ajudVar.J(ajudVar.j.b((ajtv) obj));
            return null;
        }
        if (i == 2) {
            ajudVar.k = false;
            ajudVar.J(ajudVar.j.b((ajtw) obj));
            return null;
        }
        if (i == 3) {
            ajudVar.F((ajuh) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static int n(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_viewtype_tag);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public static ajok o(View view) {
        ajok p = p(view);
        if (p == null) {
            p = new ajok();
            v(view, p);
        }
        p.h();
        return p;
    }

    public static ajok p(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_context_tag);
        if (tag instanceof ajok) {
            return (ajok) tag;
        }
        return null;
    }

    public static ajom q(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_tag);
        if (tag instanceof ajom) {
            return (ajom) tag;
        }
        return null;
    }

    public static ajom r(ajos ajosVar, Object obj, ViewGroup viewGroup) {
        ajosVar.getClass();
        obj.getClass();
        int c = ajosVar.c(obj);
        if (c == -1) {
            return null;
        }
        return ajosVar.e(c, viewGroup);
    }

    public static ammv s(ajos ajosVar, Object obj, ViewGroup viewGroup) {
        ajom r = r(ajosVar, obj, viewGroup);
        if (r == null) {
            return amlr.a;
        }
        x(r.a(), r, ajosVar.c(obj));
        return ammv.j(r);
    }

    public static void t(View view, ajos ajosVar) {
        view.getClass();
        ajom q = q(view);
        if (q != null) {
            S(q, view, ajosVar);
        }
    }

    public static void u(ajom ajomVar, ajos ajosVar) {
        ajomVar.getClass();
        S(ajomVar, ajomVar.a(), ajosVar);
    }

    public static void v(View view, ajok ajokVar) {
        view.getClass();
        view.setTag(R.id.presenter_adapter_context_tag, ajokVar);
    }

    public static void w(View view, ajom ajomVar) {
        view.getClass();
        view.setTag(R.id.presenter_adapter_tag, ajomVar);
    }

    public static void x(View view, ajom ajomVar, int i) {
        view.getClass();
        view.setTag(R.id.presenter_adapter_tag, ajomVar);
        view.setTag(R.id.presenter_adapter_viewtype_tag, Integer.valueOf(i));
    }

    public static void y(int i, con conVar) {
        if (i != 0) {
        }
    }

    public static final ajkj z(zaf zafVar, ImageView imageView) {
        zafVar.getClass();
        imageView.getClass();
        return new ajkj(zafVar, imageView);
    }
}
