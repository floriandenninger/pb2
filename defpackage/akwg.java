package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import com.google.android.libraries.backup.Backup;
import com.google.android.youtube.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwg {

    @Backup
    public static final String UPLOAD_QUALITY = "com.google.android.libraries.youtube.upload.pref.upload_quality";

    private static asiq A(String str, String str2) {
        aone createBuilder = asiq.a.createBuilder();
        if (str2 != null) {
            createBuilder.copyOnWrite();
            asiq asiqVar = (asiq) createBuilder.instance;
            asiqVar.b |= 4;
            asiqVar.d = str2;
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            asiq asiqVar2 = (asiq) createBuilder.instance;
            asiqVar2.b |= 1;
            asiqVar2.c = str;
        }
        return (asiq) createBuilder.build();
    }

    public static float i(Uri uri) {
        String queryParameter = uri.getQueryParameter("audioSwapVolume");
        if (queryParameter == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(queryParameter);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static asht j(String str, String str2) {
        aone createBuilder = asht.a.createBuilder();
        createBuilder.ar(A(str, str2));
        return (asht) createBuilder.build();
    }

    public static asht k(List list, String str) {
        if (!list.isEmpty()) {
            aone createBuilder = asht.a.createBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                alca alcaVar = (alca) it.next();
                createBuilder.ar(A(alcaVar.e(), alcaVar.i));
            }
            return (asht) createBuilder.build();
        }
        return j(str, null);
    }

    public static int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int m(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int n(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static void o(avuc avucVar) {
        int i;
        aumz aumzVar;
        avucVar.getClass();
        if ((avucVar.b & 1) != 0) {
            aumz aumzVar2 = avucVar.c;
            if (aumzVar2 == null) {
                aumzVar2 = aumz.a;
            }
            zhq.m(aumzVar2.c);
            i = 1;
        } else {
            i = 0;
        }
        if ((avucVar.b & 2) != 0) {
            i++;
            aqqj aqqjVar = avucVar.d;
            if (aqqjVar == null) {
                aqqjVar = aqqj.a;
            }
            amkq.N(aqqjVar.b.size() == 1);
            aqqj aqqjVar2 = avucVar.d;
            if (aqqjVar2 == null) {
                aqqjVar2 = aqqj.a;
            }
            aqqh aqqhVar = ((aqqg) aqqjVar2.b.get(0)).c;
            if (aqqhVar == null) {
                aqqhVar = aqqh.a;
            }
            if (aqqhVar.b == 2) {
                aumzVar = (aumz) aqqhVar.c;
            } else {
                aumzVar = aumz.a;
            }
            zhq.m(aumzVar.c);
        }
        amkq.N(i == 1);
    }

    public static boolean p() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    public static int q(int i, int i2) {
        return fm.f(i, (Color.alpha(i) * i2) / PrivateKeyType.INVALID);
    }

    public static int r(Context context, int i, int i2) {
        TypedValue l = alkd.l(context, i);
        return l != null ? l.data : i2;
    }

    public static int s(int i, int i2, float f) {
        return fm.e(fm.f(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static boolean t(int i) {
        return i != 0 && fm.b(i) > 0.5d;
    }

    public static int u(Context context, String str) {
        return alkd.k(context, R.attr.colorSurface, str);
    }

    public static void v(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static boolean w(akzs akzsVar) {
        int i = akzsVar.b;
        return ((i & 8192) == 0 && (i & 4096) == 0) ? false : true;
    }

    public static final ammv x(akzs akzsVar) {
        int i = akzsVar.b;
        if ((i & 8192) != 0) {
            String str = akzsVar.p;
            return !new File(str).exists() ? amlr.a : ammv.i(BitmapFactory.decodeFile(str));
        }
        if ((i & 4096) == 0) {
            return amlr.a;
        }
        byte[] I = akzsVar.o.I();
        return ammv.i(BitmapFactory.decodeByteArray(I, 0, I.length, new BitmapFactory.Options()));
    }

    public static final void y(boolean z, Bitmap bitmap, aone aoneVar) {
        if (z) {
            akzs akzsVar = (akzs) aoneVar.instance;
            if ((akzsVar.d & 2) != 0) {
                File file = new File(akzsVar.am);
                if (!file.exists()) {
                    akzs akzsVar2 = (akzs) aoneVar.buildPartial();
                    if ((akzsVar2.d & 2) == 0) {
                        String valueOf = String.valueOf(akzsVar2.k);
                        throw new IOException(valueOf.length() != 0 ? "Missing storage directory ".concat(valueOf) : new String("Missing storage directory "));
                    }
                    file = new File(akzsVar2.am);
                    if (!file.exists() && !file.mkdirs()) {
                        String valueOf2 = String.valueOf(akzsVar2.k);
                        throw new IOException(valueOf2.length() != 0 ? "Could not create storage directory ".concat(valueOf2) : new String("Could not create storage directory "));
                    }
                }
                File file2 = new File(file, bamb.a("'thumbnail'_yyyyMMdd_HHmmssSSS'.jpg'").a(baju.c()));
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                String absolutePath = file2.getAbsolutePath();
                aoneVar.copyOnWrite();
                akzs akzsVar3 = (akzs) aoneVar.instance;
                absolutePath.getClass();
                akzsVar3.b |= 8192;
                akzsVar3.p = absolutePath;
                return;
            }
        }
        aekb aekbVar = new aekb(null, null);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, aekbVar);
        aomf w = aomf.w(aekbVar.d());
        aoneVar.copyOnWrite();
        akzs akzsVar4 = (akzs) aoneVar.instance;
        akzs akzsVar5 = akzs.a;
        akzsVar4.b |= 4096;
        akzsVar4.o = w;
    }

    public static Intent z(Activity activity, Intent intent) {
        String fileExtensionFromUrl;
        if (intent == null) {
            StringBuilder sb = new StringBuilder("null".length() + 31);
            sb.append("No data on upload video intent:");
            sb.append("null");
            zga.l(sb.toString());
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb2.append("No Uri on upload video intent:");
            sb2.append(valueOf);
            zga.l(sb2.toString());
            return null;
        }
        String type = activity.getContentResolver().getType(data);
        if (TextUtils.isEmpty(type) && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(data.toString())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        if (TextUtils.isEmpty(type)) {
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            sb3.append("No mime-type on upload video intent:");
            sb3.append(valueOf2);
            zga.l(sb3.toString());
            return null;
        }
        return new Intent("com.google.android.youtube.intent.action.UPLOAD", data);
    }

    public final synchronized void a() {
    }

    public final synchronized void b() {
    }

    public final synchronized void c() {
    }

    public final synchronized void d() {
    }

    public final synchronized void e() {
    }

    public final synchronized void f() {
    }

    public final synchronized void g() {
    }

    public final synchronized void h() {
    }
}
