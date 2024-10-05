package defpackage;

import android.opengl.GLES20;
import android.os.Looper;
import android.widget.RemoteViews;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class art {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(RemoteViews remoteViews, int i, CharSequence charSequence) {
        remoteViews.setContentDescription(R.id.action0, charSequence);
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        d("glGenTextures");
        return iArr[0];
    }

    public static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 51);
        sb.append("Attempting to perform GL operation '");
        sb.append(str);
        sb.append("' on UI thread!");
        throw new RuntimeException(sb.toString());
    }

    public static void d(String str) {
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

    public static void e() {
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        d("glTexParameteri");
    }
}
