package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xsd implements yq {
    final /* synthetic */ xse a;

    public xsd(xse xseVar) {
        this.a = xseVar;
    }

    @Override // defpackage.yq
    public final boolean a(MenuItem menuItem) {
        this.a.C().onBackPressed();
        xse xseVar = this.a;
        if (xseVar.b == null) {
            return true;
        }
        ImageView imageView = xseVar.af;
        if (imageView == null || imageView.getDrawable() == null) {
            zga.b("Preview image does not exist.");
            return true;
        }
        final Bitmap bitmap = ((BitmapDrawable) this.a.af.getDrawable()).getBitmap();
        this.a.a.execute(new Runnable() { // from class: xsc
            @Override // java.lang.Runnable
            public final void run() {
                Uri uri;
                xsd xsdVar = xsd.this;
                Bitmap bitmap2 = bitmap;
                try {
                    File file = new File(xsdVar.a.qR().getCacheDir(), "comment");
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    File createTempFile = File.createTempFile("attached_image_data", ".png", file);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(createTempFile));
                    uri = Uri.fromFile(createTempFile);
                } catch (IOException e) {
                    zga.d("Exception reading from cropped image file", e);
                    uri = null;
                }
                xse xseVar2 = xsdVar.a;
                xseVar2.b.d(xseVar2.e, xseVar2.ae, uri);
            }
        });
        return true;
    }
}
