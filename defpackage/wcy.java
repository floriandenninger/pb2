package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.backup.Backup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcy {

    @Backup
    public static final String ACCOUNT_NAME = "user_account";

    @Backup
    public static final String DATASYNC_ID = "datasync_id";

    @Backup
    public static final String DELEGATION_CONTEXT = "delegation_context";

    @Backup
    public static final String DELEGTATION_TYPE = "delegation_type";

    @Backup
    public static final String EXTERNAL_ID = "user_identity_id";

    @Backup
    public static final String IDENTITY_VERSION = "identity_version";

    @Backup
    public static final String IS_GRIFFIN = "HAS_GRIFFIN_POLICY";

    @Backup
    public static final String IS_INCOGNITO = "IS_INCOGNITO_SESSION_IDENTITY";

    @Backup
    public static final String IS_TEENACORN = "IS_CHILD_ACCOUNT_OVER_13";

    @Backup
    public static final String IS_UNICORN = "IS_UNICORN_CHILD_ACCOUNT";

    @Backup
    public static final String NEXT_INCOGNITO_SESSION_INDEX = "NEXT_INCOGNITO_SESSION_INDEX";

    @Backup
    public static final String PAGE_ID = "user_identity";

    @Backup
    public static final String PERSONA_ACCOUNT = "persona_account";

    @Backup
    public static final String USERNAME = "username";

    @Backup
    public static final String USER_SIGNED_OUT = "user_signed_out";

    public static Bitmap A(Context context, View view) {
        float f;
        int i;
        amkq.N(view.getParent() == null);
        Configuration configuration = context.getResources().getConfiguration();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutDirection(configuration.getLayoutDirection());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = f2 / f3;
        int i2 = 2048;
        if (measuredWidth <= 2048 && measuredHeight <= 2048) {
            i2 = measuredHeight;
            i = measuredWidth;
            f = 1.0f;
        } else if (measuredWidth >= measuredHeight) {
            f = 2048.0f / f2;
            i2 = (int) (2048.0f / f4);
            i = 2048;
        } else {
            f = 2048.0f / f3;
            i = (int) (f4 * 2048.0f);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
        view.setScaleX(f);
        view.setScaleY(f);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        frameLayout.measure(0, 0);
        frameLayout.layout(0, 0, i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        frameLayout.draw(new Canvas(createBitmap));
        frameLayout.removeView(view);
        view.setLayoutParams(layoutParams);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        return createBitmap;
    }

    public static final zom B(Context context) {
        return new zom(context, 1, zoz.d, zoz.h, new zhr(0));
    }

    public static final void C(Context context, Bitmap bitmap, zpx zpxVar) {
        int height = bitmap.getHeight() + 2;
        double width = bitmap.getWidth() + 2;
        Double.isNaN(width);
        Bitmap createBitmap = Bitmap.createBitmap(((int) Math.ceil(width / 4.0d)) * 4, height, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, (r2 - bitmap.getWidth()) / 2, (height - bitmap.getHeight()) / 2, new Paint(2));
        new zpz(B(context.getApplicationContext()), zpxVar).execute(createBitmap);
    }

    public static float D(long j) {
        return ((float) j) / 1.0E9f;
    }

    public static long E(float f) {
        return f * 1.0E9f;
    }

    public static void F(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String hexString = Integer.toHexString(glGetError);
        StringBuilder sb = new StringBuilder(str.length() + 30 + String.valueOf(hexString).length());
        sb.append("GL Operation '");
        sb.append(str);
        sb.append("' caused error ");
        sb.append(hexString);
        sb.append("!");
        throw new RuntimeException(sb.toString());
    }

    public static aorq G(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        aone createBuilder = aorq.a.createBuilder();
        createBuilder.copyOnWrite();
        aorq.a((aorq) createBuilder.instance);
        createBuilder.copyOnWrite();
        aorq.b((aorq) createBuilder.instance);
        createBuilder.copyOnWrite();
        aorq aorqVar = (aorq) createBuilder.instance;
        aorqVar.f = 1;
        aorqVar.b |= 4;
        for (int i = 0; i < 9; i++) {
            createBuilder.W(fArr[i]);
        }
        return (aorq) createBuilder.build();
    }

    public static aorq H() {
        return G(new Matrix());
    }

    public static void I(axdj axdjVar, zsb zsbVar) {
        int i = zsbVar.d;
        axdjVar.copyOnWrite();
        axdk.p((axdk) axdjVar.instance, i);
        int i2 = zsbVar.e;
        axdjVar.copyOnWrite();
        axdk.q((axdk) axdjVar.instance, i2);
    }

    public static final boolean J(double d, double d2, double d3, double d4) {
        return (d == 0.0d && d2 == 0.0d && d3 == 0.0d && d4 == 0.0d) ? false : true;
    }

    public static String K(Throwable th) {
        if (th == null) {
            return "<null>";
        }
        String message = th.getMessage();
        for (int i = 0; th.getCause() != null && i < 10; i++) {
            th = th.getCause();
            String name = th.getClass() != null ? th.getClass().getName() : "<unknownClass>";
            String replaceAll = th.getMessage() != null ? th.getMessage().replaceAll("\\d+", "#") : "<unknownMessage>";
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(name).length() + String.valueOf(replaceAll).length());
            sb.append(valueOf);
            sb.append(" ::Caused by: ");
            sb.append(name);
            sb.append(": ");
            sb.append(replaceAll);
            message = sb.toString();
        }
        return message;
    }

    public static Uri L(Uri uri, Context context) {
        return aij.b() ? ev.a(context, "com.google.android.youtube.fileprovider", new File(uri.getPath())) : uri;
    }

    public static Uri M(Context context) {
        String format = new SimpleDateFormat(context.getString(R.string.video_file_name_format), Locale.US).format(new Date());
        try {
            if (!aij.b()) {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (!file.isDirectory() || !file.canWrite()) {
                    throw new RuntimeException("Camera roll directory not accessible.");
                }
                return Uri.fromFile(new File(file, String.valueOf(format).concat(".mp4")));
            }
            return Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), String.valueOf(format).concat(".mp4")));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create temp photo file.", e);
        }
    }

    public static int N(Activity activity) {
        activity.getClass();
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        return rotation == 3 ? 270 : 0;
    }

    public static long O() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public static File P(File file, long j) {
        file.mkdirs();
        if (!file.isDirectory() || !file.canWrite()) {
            throw new RuntimeException("Output directory not accessible.");
        }
        return new File(file, String.valueOf(Q(j)).concat(".mp4"));
    }

    public static String Q(long j) {
        return new SimpleDateFormat("'VID'_yyyyMMdd_HHmmssSSS", Locale.US).format(new Date(j));
    }

    public static void R(FrameLayout frameLayout) {
        frameLayout.getClass();
        if (zev.e(frameLayout.getContext())) {
            zev.c(frameLayout.getContext(), frameLayout, frameLayout.getContext().getString(R.string.accessibility_stories_camera_page));
        }
    }

    public static void S(View view, int i) {
        view.getClass();
        if (zev.e(view.getContext())) {
            zev.c(view.getContext(), view, view.getContext().getString(i));
        }
    }

    public static void T(Context context, int i) {
        context.getClass();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.WhiteAlertDialogStyle);
        builder.setTitle(R.string.camera_can_not_record).setMessage(i).setCancelable(false).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        create.show();
        create.getButton(-2).setTextColor(context.getResources().getColor(R.color.camera_dialog_button_text_color));
        create.getButton(-1).setTextColor(context.getResources().getColor(R.color.camera_dialog_button_text_color));
    }

    public static boolean U() {
        return TextUtils.equals(Environment.getExternalStorageState(), "mounted");
    }

    public static boolean V(Resources resources) {
        resources.getClass();
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    public static void W(View view) {
        S(view, R.string.accessibility_recording_end);
    }

    public static CamcorderProfile X(int i, int i2, int i3) {
        CamcorderProfile camcorderProfile;
        int[] iArr = {6, 5, 4, 0};
        int i4 = 0;
        while (i4 < 4 && iArr[i4] != i3) {
            i4++;
        }
        if (i4 == 4) {
            throw new IllegalStateException("Unexpected targetQuality specified.");
        }
        while (i4 < 4) {
            if (CamcorderProfile.hasProfile(i, iArr[i4]) && (camcorderProfile = CamcorderProfile.get(i, iArr[i4])) != null && camcorderProfile.videoFrameRate >= i2) {
                return camcorderProfile;
            }
            i4++;
        }
        if (i2 > 0) {
            return X(i, 0, i3);
        }
        return null;
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("incognito_session_");
        sb.append(i);
        sb.append("||");
        return sb.toString();
    }

    public static final void b(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    public static void c(wds wdsVar, int i) {
        wdsVar.r(i, null, null);
    }

    public static boolean d(xjp xjpVar, aoxt aoxtVar, Uri uri, apxf apxfVar) {
        aqyg aqygVar;
        boolean z;
        aqyg aqygVar2 = null;
        if ((aoxtVar.b & 8) != 0) {
            aqygVar = aoxtVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        CharSequence charSequence = "<NONE>";
        if (TextUtils.isEmpty(ajcq.b(aqygVar)) || (uri == null && apxfVar == null)) {
            z = false;
        } else {
            if ((aoxtVar.b & 8) != 0 && (aqygVar2 = aoxtVar.e) == null) {
                aqygVar2 = aqyg.a;
            }
            charSequence = ajcq.b(aqygVar2);
            z = true;
        }
        if (!z) {
            return false;
        }
        xjz a = xka.a();
        a.b(true);
        a.d(charSequence);
        xjpVar.d = a.a();
        return true;
    }

    public static void e(xjp xjpVar) {
        xjpVar.g(true);
    }

    public static Context f(Context context) {
        return new ContextThemeWrapper(context, R.style.VerificationTheme);
    }

    public static final wlu g(atvc atvcVar, boolean z) {
        wlw wlwVar = new wlw();
        Bundle bundle = new Bundle();
        amkq.cn(bundle, "ARG_INTRO_RENDERER", atvcVar);
        bundle.putBoolean("ARG_SHOW_AS_DIALOG", z);
        bundle.putBoolean("ARG_ALLOW_DIALOG_HARDWARE_BACK", false);
        wlwVar.af(bundle);
        if (z) {
            wlwVar.o(2, 0);
            wlwVar.n(false);
        }
        return wlwVar;
    }

    public static auwv h(asfw asfwVar) {
        if (asfwVar == null) {
            return null;
        }
        asfo asfoVar = asfwVar.d;
        if (asfoVar == null) {
            asfoVar = asfo.a;
        }
        if (asfoVar.b != 202129111) {
            return null;
        }
        asfo asfoVar2 = asfwVar.d;
        if (asfoVar2 == null) {
            asfoVar2 = asfo.a;
        }
        if (asfoVar2.b == 202129111) {
            return (auwv) asfoVar2.c;
        }
        return auwv.a;
    }

    public static awhq i(asfw asfwVar) {
        if (asfwVar == null) {
            return null;
        }
        asfo asfoVar = asfwVar.d;
        if (asfoVar == null) {
            asfoVar = asfo.a;
        }
        if (asfoVar.b != 65500215) {
            return null;
        }
        asfo asfoVar2 = asfwVar.d;
        if (asfoVar2 == null) {
            asfoVar2 = asfo.a;
        }
        if (asfoVar2.b == 65500215) {
            return (awhq) asfoVar2.c;
        }
        return awhq.a;
    }

    public static amru j(awgt awgtVar) {
        if (awgtVar != null) {
            awgu awguVar = awgtVar.d;
            if (awguVar == null) {
                awguVar = awgu.a;
            }
            if ((awguVar.b & 2) != 0) {
                awgu awguVar2 = awgtVar.d;
                if (awguVar2 == null) {
                    awguVar2 = awgu.a;
                }
                awgo awgoVar = awguVar2.c;
                if (awgoVar == null) {
                    awgoVar = awgo.a;
                }
                if (awgoVar.c.size() != 0) {
                    ArrayList arrayList = new ArrayList(awgoVar.c.size());
                    for (awgp awgpVar : awgoVar.c) {
                        if ((awgpVar.b & 1) != 0) {
                            awgq awgqVar = awgpVar.c;
                            if (awgqVar == null) {
                                awgqVar = awgq.a;
                            }
                            arrayList.add(awgqVar);
                        }
                    }
                    return amru.o(arrayList);
                }
            }
        }
        return amru.q();
    }

    public static awgm k(awgt awgtVar) {
        awgu awguVar = awgtVar.d;
        if (awguVar == null) {
            awguVar = awgu.a;
        }
        awgo awgoVar = awguVar.c;
        if (awgoVar == null) {
            awgoVar = awgo.a;
        }
        if ((awgoVar.b & 1) == 0) {
            return null;
        }
        awgu awguVar2 = awgtVar.d;
        if (awguVar2 == null) {
            awguVar2 = awgu.a;
        }
        awgo awgoVar2 = awguVar2.c;
        if (awgoVar2 == null) {
            awgoVar2 = awgo.a;
        }
        awgl awglVar = awgoVar2.d;
        if (awglVar == null) {
            awglVar = awgl.a;
        }
        if (awglVar.b == 123879355) {
            return (awgm) awglVar.c;
        }
        return awgm.a;
    }

    public static CharSequence[] l(List list, aahd aahdVar) {
        if (list.isEmpty()) {
            return null;
        }
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        for (int i = 0; i < list.size(); i++) {
            charSequenceArr[i] = aahk.a((aqyg) list.get(i), aahdVar, false);
        }
        return charSequenceArr;
    }

    public static void m(Spannable spannable, float f, float f2, float f3, int i) {
        if (spannable.length() != 0) {
            for (aahi aahiVar : (aahi[]) spannable.getSpans(0, spannable.length(), aahi.class)) {
                apxf apxfVar = aahiVar.c;
                if (apxfVar != null && apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
                    String str = ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c;
                    if (!str.isEmpty()) {
                        int spanStart = spannable.getSpanStart(aahiVar);
                        int spanEnd = spannable.getSpanEnd(aahiVar);
                        if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                            spannable.setSpan(new ajtg(str, f, f2, f3, i), spanStart, spanEnd, 33);
                        }
                    }
                }
            }
            for (Object obj : (aahi[]) spannable.getSpans(0, spannable.length(), aahi.class)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static void n(Editable editable) {
        for (ajtg ajtgVar : (ajtg[]) editable.getSpans(0, editable.length(), ajtg.class)) {
            int spanStart = editable.getSpanStart(ajtgVar);
            int spanEnd = editable.getSpanEnd(ajtgVar);
            if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                String valueOf = String.valueOf(ajtgVar.a);
                editable.replace(spanStart, spanEnd, valueOf.length() != 0 ? "@".concat(valueOf) : new String("@"));
            }
        }
        for (Object obj : (ajtg[]) editable.getSpans(0, editable.length(), ajtg.class)) {
            editable.removeSpan(obj);
        }
    }

    public static Drawable o(Context context, Drawable drawable, int i) {
        if (i == 0 || !(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
    }

    public static argf p(float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        if (f <= 0.0f || f2 <= 0.0f) {
            f3 = 1.0f;
            f4 = 1.0f;
            f5 = 0.0f;
        } else {
            if (f > f2) {
                float f7 = f2 / f;
                f6 = 0.5f - (f7 / 2.0f);
                f4 = f7 + f6;
                f3 = 1.0f;
                f5 = 0.0f;
                aone createBuilder = argf.a.createBuilder();
                float max = Math.max(0.0f, f6);
                createBuilder.copyOnWrite();
                argf argfVar = (argf) createBuilder.instance;
                argfVar.b |= 1;
                argfVar.c = max;
                float min = Math.min(1.0f, f4);
                createBuilder.copyOnWrite();
                argf argfVar2 = (argf) createBuilder.instance;
                argfVar2.b |= 4;
                argfVar2.e = min;
                float max2 = Math.max(0.0f, f5);
                createBuilder.copyOnWrite();
                argf argfVar3 = (argf) createBuilder.instance;
                argfVar3.b |= 2;
                argfVar3.d = max2;
                float min2 = Math.min(1.0f, f3);
                createBuilder.copyOnWrite();
                argf argfVar4 = (argf) createBuilder.instance;
                argfVar4.b |= 8;
                argfVar4.f = min2;
                return (argf) createBuilder.build();
            }
            float f8 = f / f2;
            float f9 = 0.5f - (f8 / 2.0f);
            f3 = f8 + f9;
            f5 = f9;
            f4 = 1.0f;
        }
        f6 = 0.0f;
        aone createBuilder2 = argf.a.createBuilder();
        float max3 = Math.max(0.0f, f6);
        createBuilder2.copyOnWrite();
        argf argfVar5 = (argf) createBuilder2.instance;
        argfVar5.b |= 1;
        argfVar5.c = max3;
        float min3 = Math.min(1.0f, f4);
        createBuilder2.copyOnWrite();
        argf argfVar22 = (argf) createBuilder2.instance;
        argfVar22.b |= 4;
        argfVar22.e = min3;
        float max22 = Math.max(0.0f, f5);
        createBuilder2.copyOnWrite();
        argf argfVar32 = (argf) createBuilder2.instance;
        argfVar32.b |= 2;
        argfVar32.d = max22;
        float min22 = Math.min(1.0f, f3);
        createBuilder2.copyOnWrite();
        argf argfVar42 = (argf) createBuilder2.instance;
        argfVar42.b |= 8;
        argfVar42.f = min22;
        return (argf) createBuilder2.build();
    }

    public static void q(View view, int i, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (jw.e(view) == 1) {
                rect.left -= i3;
                rect.right += i;
            } else {
                rect.left -= i;
                rect.right += i3;
            }
            rect.top -= i2;
            rect.bottom += i4;
            zeu.b(viewGroup, view, new TouchDelegate(rect, view));
        }
    }

    public static void r(AlertDialog alertDialog) {
        if (alertDialog == null) {
            return;
        }
        alertDialog.show();
        ((TextView) alertDialog.findViewById(android.R.id.message)).setLineSpacing(0.0f, 1.2f);
    }

    public static apxf s(aakv aakvVar, String str) {
        apxz apxzVar = (apxz) aakvVar.f(str).g(apxz.class).X();
        if (apxzVar == null || (apxzVar.b.b & 32768) == 0) {
            return null;
        }
        return apxzVar.getDismissDialogCommand();
    }

    public static void t(aakv aakvVar, String str) {
        apxz apxzVar = (apxz) aakvVar.f(str).g(apxz.class).X();
        if (apxzVar != null) {
            apxx e = apxzVar.e();
            aone aoneVar = e.a;
            aoneVar.copyOnWrite();
            apya apyaVar = (apya) aoneVar.instance;
            apya apyaVar2 = apya.a;
            apyaVar.b |= 2;
            apyaVar.d = "";
            aone aoneVar2 = e.a;
            aoneVar2.copyOnWrite();
            apya apyaVar3 = (apya) aoneVar2.instance;
            apyaVar3.b |= 4;
            apyaVar3.e = "";
            aone aoneVar3 = e.a;
            aoneVar3.copyOnWrite();
            ((apya) aoneVar3.instance).f = apya.emptyProtobufList();
            aone aoneVar4 = e.a;
            aoneVar4.copyOnWrite();
            ((apya) aoneVar4.instance).g = apya.emptyProtobufList();
            Boolean bool = true;
            aone aoneVar5 = e.a;
            boolean booleanValue = bool.booleanValue();
            aoneVar5.copyOnWrite();
            apya apyaVar4 = (apya) aoneVar5.instance;
            apyaVar4.b |= 256;
            apyaVar4.m = booleanValue;
            Boolean bool2 = false;
            aone aoneVar6 = e.a;
            boolean booleanValue2 = bool2.booleanValue();
            aoneVar6.copyOnWrite();
            apya apyaVar5 = (apya) aoneVar6.instance;
            apyaVar5.b |= 4096;
            apyaVar5.q = booleanValue2;
            apxz a = e.a(aakvVar);
            aaio c = ((aaih) aakvVar).c();
            c.d(a);
            c.b().Q();
        }
    }

    public static void u(aakv aakvVar, String str, boolean z) {
        apxv apxvVar = (apxv) aakvVar.f(str).g(apxv.class).X();
        if (apxvVar != null) {
            apxt e = apxvVar.e();
            Boolean bool = false;
            aone aoneVar = e.a;
            boolean booleanValue = bool.booleanValue();
            aoneVar.copyOnWrite();
            apxw apxwVar = (apxw) aoneVar.instance;
            apxw apxwVar2 = apxw.a;
            apxwVar.c |= 8;
            apxwVar.g = booleanValue;
            if (z) {
                aone aoneVar2 = e.a;
                boolean booleanValue2 = bool.booleanValue();
                aoneVar2.copyOnWrite();
                apxw apxwVar3 = (apxw) aoneVar2.instance;
                apxwVar3.c |= 32;
                apxwVar3.i = booleanValue2;
            }
            apxv b = e.b();
            aaio c = ((aaih) aakvVar).c();
            c.d(b);
            c.b().Q();
        }
    }

    public static void v(aakv aakvVar, String str, boolean z) {
        apxz apxzVar = (apxz) aakvVar.f(str).g(apxz.class).X();
        if (apxzVar != null) {
            apxx e = apxzVar.e();
            Boolean valueOf = Boolean.valueOf(z);
            aone aoneVar = e.a;
            boolean booleanValue = valueOf.booleanValue();
            aoneVar.copyOnWrite();
            apya apyaVar = (apya) aoneVar.instance;
            apya apyaVar2 = apya.a;
            apyaVar.b |= 16384;
            apyaVar.s = booleanValue;
            apxz a = e.a(aakvVar);
            aalc c = aakvVar.c();
            c.d(a);
            c.b().Q();
        }
    }

    public static final void w(zzm zzmVar, zzl zzlVar, zzl zzlVar2, float f) {
        if (zzlVar2.a() < 0.001f || zzlVar2.a() >= zzlVar.a()) {
            return;
        }
        float f2 = zzlVar2.b;
        float f3 = zzlVar2.c;
        float f4 = zzlVar.b;
        float f5 = f2 - f4;
        if (f5 < f) {
            f2 = f4;
        }
        boolean z = f5 < f;
        float f6 = zzlVar.c;
        float f7 = f6 - f3;
        boolean z2 = f7 >= f;
        if (f7 < f) {
            f3 = f6;
        }
        if ((!z2) || z) {
            zzmVar.a.remove(zzlVar2);
            zzlVar2.b = f2;
            zzlVar2.c = f3;
            zzmVar.a.add(zzlVar2);
        }
    }

    public static void x(Context context, ImageView imageView, boolean z) {
        if (imageView == null || context == null) {
            return;
        }
        if (z) {
            imageView.clearColorFilter();
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(wbs.W(context, R.attr.ytOverlayButtonPrimary).orElse(context.getResources().getColor(R.color.yt_white1_opacity30)), PorterDuff.Mode.MULTIPLY));
        }
    }

    public static void y(Set set, Object obj) {
        if (obj == null) {
            zga.b("EffectsProvider.addListener: Attempt to add null listener");
        } else {
            synchronized (set) {
                set.add(obj);
            }
        }
    }

    public static void z(Set set, Object obj) {
        HashSet hashSet;
        if (set == null) {
            return;
        }
        synchronized (set) {
            hashSet = new HashSet(set);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zfi) it.next()).a(obj);
        }
    }
}
