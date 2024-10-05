package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vml implements anhh, anfy {
    private static final String[] b = {"_id", "date_added"};
    private final ContentResolver c;
    private final anib d;
    private vmg f;
    public final aow a = new aow();
    private final AtomicInteger e = new AtomicInteger(0);

    public vml(Context context, anib anibVar) {
        this.c = context.getContentResolver();
        this.d = anibVar;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        Cursor query;
        vmg a = vmg.a(awzb.OBAKE_DEVICE_PHOTO_FETCH);
        a.b();
        this.f = a;
        amrp f = amru.f();
        if (!aij.e()) {
            query = this.c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, null, null, "date_added DESC");
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
            query = this.c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, bundle, null);
        }
        if (query != null) {
            int columnIndex = query.getColumnIndex("_id");
            int columnIndex2 = query.getColumnIndex("date_added");
            while (query.moveToNext()) {
                long j = query.getLong(columnIndex);
                long j2 = query.getLong(columnIndex2);
                if (j2 <= 0) {
                    f.h(new vmj(j, amlr.a));
                } else {
                    f.h(new vmj(j, ammv.j(aora.e(j2, 0))));
                }
            }
            query.close();
        }
        this.e.set(2);
        return anaf.O(f.g());
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        amru amruVar = (amru) obj;
        this.a.j(new vmk(amruVar, this.f.c(amruVar.size()), amlr.a));
    }

    public final synchronized void c() {
        if (this.e.get() != 1 && this.e.get() != 2) {
            this.e.set(1);
            anaf.Y(anaf.T(this, this.d), this, this.d);
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.a.j(new vmk(amru.q(), this.f.d(aogv.UNKNOWN), ammv.j(vmd.RETRYABLE)));
    }
}
