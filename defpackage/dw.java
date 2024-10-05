package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dw extends ea {
    public Bitmap a;
    private IconCompat f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea
    public final String a() {
        return "android.support.v4.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.ea
    public final void b(dt dtVar) {
        eb ebVar = (eb) dtVar;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(ebVar.b).setBigContentTitle(this.c).bigPicture(this.a);
        if (this.g) {
            Bitmap bitmap = null;
            if (this.f == null) {
                bigPicture.bigLargeIcon((Bitmap) null);
            } else if (Build.VERSION.SDK_INT >= 23) {
                bigPicture.bigLargeIcon(this.f.d(ebVar.a));
            } else if (this.f.b() != 1) {
                bigPicture.bigLargeIcon((Bitmap) null);
            } else {
                IconCompat iconCompat = this.f;
                if (iconCompat.b == -1 && Build.VERSION.SDK_INT >= 23) {
                    Object obj = iconCompat.c;
                    if (obj instanceof Bitmap) {
                        bitmap = (Bitmap) obj;
                    }
                } else {
                    int i = iconCompat.b;
                    if (i == 1) {
                        bitmap = (Bitmap) iconCompat.c;
                    } else if (i == 5) {
                        bitmap = IconCompat.c((Bitmap) iconCompat.c, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat);
                    }
                }
                bigPicture.bigLargeIcon(bitmap);
            }
        }
        if (this.e) {
            bigPicture.setSummaryText(this.d);
        }
    }

    public final void c(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.c = bitmap;
            iconCompat = iconCompat2;
        }
        this.f = iconCompat;
        this.g = true;
    }

    public final void d(CharSequence charSequence) {
        this.c = dy.d(charSequence);
    }

    public final void e(CharSequence charSequence) {
        this.d = dy.d(charSequence);
        this.e = true;
    }
}
