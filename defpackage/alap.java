package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alap implements alag {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap b(Uri uri, Point point) {
        String queryParameter = uri.getQueryParameter("camera_roll");
        File file = (queryParameter == null || queryParameter.isEmpty()) ? null : new File(queryParameter);
        if (file == null) {
            return null;
        }
        int i = 1;
        if (point.x <= 96 && point.y <= 96) {
            i = 3;
        }
        String absolutePath = file.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        return ThumbnailUtils.createVideoThumbnail(absolutePath, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static avuc d(String str, String str2) {
        aone createBuilder = avuc.a.createBuilder();
        aone createBuilder2 = aumz.a.createBuilder();
        createBuilder2.copyOnWrite();
        aumz aumzVar = (aumz) createBuilder2.instance;
        str.getClass();
        aumzVar.b |= 1;
        aumzVar.c = str;
        aumz aumzVar2 = (aumz) createBuilder2.build();
        aqqj aqqjVar = aqqj.a;
        File file = new File(str2, "video_edit_proto");
        if (file.exists()) {
            aqqjVar = (aqqj) aonm.parseFrom(aqqj.a, anaf.v(file), aomw.b());
        }
        if (aqqjVar.b.size() != 1) {
            createBuilder.copyOnWrite();
            avuc avucVar = (avuc) createBuilder.instance;
            aumzVar2.getClass();
            avucVar.c = aumzVar2;
            avucVar.b |= 1;
        } else {
            aone createBuilder3 = aqqh.a.createBuilder();
            createBuilder3.copyOnWrite();
            aqqh aqqhVar = (aqqh) createBuilder3.instance;
            aumzVar2.getClass();
            aqqhVar.c = aumzVar2;
            aqqhVar.b = 2;
            aqqh aqqhVar2 = (aqqh) createBuilder3.build();
            aone builder = ((aqqg) aqqjVar.b.get(0)).toBuilder();
            builder.copyOnWrite();
            aqqg aqqgVar = (aqqg) builder.instance;
            aqqhVar2.getClass();
            aqqgVar.c = aqqhVar2;
            aqqgVar.b |= 1;
            aqqg aqqgVar2 = (aqqg) builder.build();
            aone builder2 = aqqjVar.toBuilder();
            builder2.copyOnWrite();
            aqqj aqqjVar2 = (aqqj) builder2.instance;
            aqqgVar2.getClass();
            aqqjVar2.a();
            aqqjVar2.b.set(0, aqqgVar2);
            createBuilder.copyOnWrite();
            avuc avucVar2 = (avuc) createBuilder.instance;
            aqqj aqqjVar3 = (aqqj) builder2.build();
            aqqjVar3.getClass();
            avucVar2.d = aqqjVar3;
            avucVar2.b = 2 | avucVar2.b;
        }
        return (avuc) createBuilder.build();
    }

    @Override // defpackage.alag
    public final Bitmap a(ContentResolver contentResolver, Uri uri, Point point) {
        return b(uri, point);
    }

    @Override // defpackage.alag
    public final avuc c(String str, String str2) {
        return d(str, str2);
    }
}
