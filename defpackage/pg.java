package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pg implements Runnable {
    final /* synthetic */ ph a;

    public pg(ph phVar) {
        this.a = phVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i;
        ou ouVar;
        while (true) {
            pj a = this.a.a.a();
            if (a == null) {
                this.a.b.set(false);
                return;
            }
            int i2 = a.b;
            if (i2 == 1) {
                this.a.a.b(1);
                ot otVar = (ot) this.a.c;
                otVar.c = a.c;
                otVar.b.clear();
                Cursor cursor = otVar.g.c.b;
                int count = cursor == null ? 0 : cursor.getCount();
                otVar.d = count;
                ((pf) otVar.g.f).a(pj.a(1, otVar.c, count));
            } else if (i2 == 2) {
                this.a.a.b(2);
                this.a.a.b(3);
                pk pkVar = this.a.c;
                int i3 = a.c;
                int i4 = a.d;
                int i5 = a.e;
                int i6 = a.f;
                int i7 = a.g;
                if (i3 <= i4) {
                    ot otVar2 = (ot) pkVar;
                    int a2 = otVar2.a(i3);
                    int a3 = otVar2.a(i4);
                    otVar2.e = otVar2.a(i5);
                    int a4 = otVar2.a(i6);
                    otVar2.f = a4;
                    if (i7 == 1) {
                        otVar2.d(otVar2.e, a3, 1, true);
                        otVar2.d(a3 + otVar2.g.b, otVar2.f, 1, false);
                    } else {
                        otVar2.d(a2, a4, i7, false);
                        otVar2.d(otVar2.e, a2 - otVar2.g.b, i7, true);
                    }
                }
            } else if (i2 == 3) {
                pk pkVar2 = this.a.c;
                int i8 = a.c;
                int i9 = a.d;
                ot otVar3 = (ot) pkVar2;
                if (!otVar3.b.get(i8)) {
                    pm pmVar = otVar3.a;
                    if (pmVar != null) {
                        otVar3.a = pmVar.d;
                    } else {
                        ow owVar = otVar3.g;
                        pmVar = new pm(owVar.a, owVar.b);
                    }
                    pmVar.b = i8;
                    int min = Math.min(otVar3.g.b, otVar3.d - i8);
                    pmVar.c = min;
                    ou ouVar2 = otVar3.g.c;
                    Object[] objArr = pmVar.a;
                    int i10 = pmVar.b;
                    xrt[] xrtVarArr = (xrt[]) objArr;
                    Cursor cursor2 = ouVar2.b;
                    if (cursor2 != null) {
                        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow2 = ouVar2.b.getColumnIndexOrThrow("_size");
                        int columnIndexOrThrow3 = ouVar2.b.getColumnIndexOrThrow("width");
                        int columnIndexOrThrow4 = ouVar2.b.getColumnIndexOrThrow("height");
                        int columnIndexOrThrow5 = ouVar2.b.getColumnIndexOrThrow("orientation");
                        int i11 = 0;
                        while (i11 < min) {
                            ouVar2.b.moveToPosition(i10 + i11);
                            int i12 = min;
                            long j = ouVar2.b.getLong(columnIndexOrThrow);
                            Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j);
                            int i13 = i10;
                            int i14 = columnIndexOrThrow;
                            Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(ouVar2.a, j, 1, null);
                            long j2 = ouVar2.b.getLong(columnIndexOrThrow2);
                            int i15 = ouVar2.b.getInt(columnIndexOrThrow3);
                            int i16 = ouVar2.b.getInt(columnIndexOrThrow4);
                            int i17 = ouVar2.b.getInt(columnIndexOrThrow5);
                            if (i17 == 0 || thumbnail == null) {
                                i = columnIndexOrThrow5;
                                ouVar = ouVar2;
                            } else {
                                i = columnIndexOrThrow5;
                                ouVar = ouVar2;
                                if (Build.VERSION.SDK_INT < 29) {
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(i17);
                                    thumbnail = Bitmap.createBitmap(thumbnail, 0, 0, thumbnail.getWidth(), thumbnail.getHeight(), matrix, true);
                                }
                            }
                            xrtVarArr[i11] = new xrt(withAppendedId, thumbnail, j2, i15, i16, i17, false);
                            i11++;
                            min = i12;
                            i10 = i13;
                            columnIndexOrThrow = i14;
                            columnIndexOrThrow5 = i;
                            ouVar2 = ouVar;
                        }
                    }
                    ow owVar2 = otVar3.g;
                    while (otVar3.b.size() >= 10) {
                        int keyAt = otVar3.b.keyAt(0);
                        int keyAt2 = otVar3.b.keyAt(r4.size() - 1);
                        int i18 = otVar3.e - keyAt;
                        int i19 = keyAt2 - otVar3.f;
                        if (i18 > 0 && (i18 >= i19 || i9 == 2)) {
                            otVar3.c(keyAt);
                        } else {
                            if (i19 <= 0) {
                                break;
                            }
                            z = true;
                            if (i18 >= i19 && i9 != 1) {
                                break;
                            } else {
                                otVar3.c(keyAt2);
                            }
                        }
                    }
                    z = true;
                    otVar3.b.put(pmVar.b, z);
                    ((pf) otVar3.g.f).a(pj.b(2, otVar3.c, pmVar));
                }
            } else if (i2 == 4) {
                Object obj = a.h;
                ot otVar4 = (ot) this.a.c;
                ow owVar3 = otVar4.g;
                pm pmVar2 = (pm) obj;
                Object[] objArr2 = pmVar2.a;
                int i20 = pmVar2.c;
                pmVar2.d = otVar4.a;
                otVar4.a = pmVar2;
            } else {
                Log.e("ThreadUtil", "Unsupported message, what=" + a.b);
            }
        }
    }
}
