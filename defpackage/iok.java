package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iok extends afvw {
    public boolean a;
    public boolean b;
    private final afsx c;
    private final afvb k;
    private final ContentResolver l;
    private final cnl m;

    public iok(String str, afsx afsxVar, afvb afvbVar, ContentResolver contentResolver, cnl cnlVar) {
        super(1, str, (cnk) null);
        afsxVar.getClass();
        this.c = afsxVar;
        this.k = afvbVar;
        contentResolver.getClass();
        this.l = contentResolver;
        this.m = cnlVar;
    }

    @Override // defpackage.yvo
    public final cnq d(cnq cnqVar) {
        this.b = true;
        return cnqVar;
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final afsx e() {
        return this.c;
    }

    @Override // defpackage.yvo
    public final Map f() {
        HashMap hashMap = new HashMap();
        this.k.b(hashMap, this);
        return hashMap;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        String str = (String) cnhVar.c.get("content-type");
        if (str == null || !str.equals("video/mp4")) {
            this.b = true;
        } else if (!this.a) {
            byte[] bArr = cnhVar.b;
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
            file.mkdirs();
            if (!file.isDirectory() || !file.canWrite()) {
                zga.b("Camera roll directory not accessible.");
                this.b = true;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                String format = new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss", Locale.US).format(new Date(currentTimeMillis));
                File file2 = new File(file, String.valueOf(format).concat(".mp4"));
                try {
                    file2.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(bArr, 0, bArr.length);
                    fileOutputStream.close();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("media_type", (Integer) 3);
                    contentValues.put("_data", file2.getAbsolutePath());
                    contentValues.put("_size", Long.valueOf(file2.length()));
                    contentValues.put("_display_name", file2.getName());
                    contentValues.put("title", format);
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    contentValues.put("date_added", valueOf);
                    contentValues.put("date_modified", Long.valueOf(currentTimeMillis / 1000));
                    contentValues.put("mime_type", "video/mp4");
                    contentValues.put("datetaken", valueOf);
                    this.l.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                } catch (IOException | SecurityException unused) {
                    zga.b("Failed saving downloaded video to camera roll.");
                    this.b = true;
                }
            }
        }
        return cnm.b(null, null);
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
        this.m.kZ((Void) obj);
    }
}
