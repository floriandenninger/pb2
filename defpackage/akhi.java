package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhi {
    public final Activity a;

    public akhi(Activity activity) {
        this.a = activity;
    }

    public static final Intent e(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setDataAndType(Uri.parse(str2), "image/*");
        intent.putExtra("CLIENT_ID", str);
        intent.setPackage("com.snapchat.android");
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("attachmentUrl", str3);
        }
        intent.setAction("android.intent.action.SEND");
        return intent;
    }

    public final File a(Bitmap bitmap, String str) {
        File file = new File(this.a.getCacheDir(), "story_share");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return file2;
    }

    public final String b() {
        String packageName = this.a.getPackageName();
        return ((packageName.hashCode() == 1713433253 && packageName.equals("com.google.android.apps.youtube.music")) ? (char) 0 : (char) 65535) != 0 ? "com.google.android.youtube.fileprovider" : "com.google.android.apps.youtube.music.fileprovider";
    }

    public final void c(Intent intent, Bitmap bitmap) {
        try {
            File a = a(bitmap, "sticker");
            int intValue = ((Integer) yjk.R(this.a).first).intValue();
            float f = intValue * 0.65f;
            Pair create = Pair.create(Float.valueOf(f), Float.valueOf(bitmap.getHeight() * (f / bitmap.getWidth())));
            Uri a2 = ev.a(this.a, b(), a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", a2);
            jSONObject.put("posX", 0.5d);
            jSONObject.put("posY", 0.5d);
            jSONObject.put("width", create.first);
            jSONObject.put("height", create.second);
            intent.putExtra("sticker", jSONObject.toString());
            this.a.grantUriPermission("com.snapchat.android", a2, 1);
        } catch (IOException e) {
            throw new Exception("Failed to create story sticker asset.", e);
        }
    }

    public final void d(Intent intent) {
        long j;
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.snapchat.android", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = packageInfo.versionCode;
            }
            if (j >= 2110) {
                intent.putExtra("RESULT_INTENT", PendingIntent.getActivity(this.a, 0, intent, yny.M() | 1073741824));
                intent.addFlags(268435456);
                this.a.startActivity(intent);
                return;
            }
            this.a.startActivityForResult(intent, 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new Exception("Snapchat is not installed.", e);
        }
    }

    public final FeedbackOptions f() {
        Bitmap bitmap;
        qwk qwkVar = new qwk(this.a.getApplicationContext());
        qwkVar.c = "com.google.android.libraries.user.profile.photopicker.USER_INITIATED_FEEDBACK_REPORT";
        try {
            bitmap = qob.y(this.a.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            bitmap = null;
        }
        qwkVar.d(bitmap);
        return qwkVar.a();
    }
}
