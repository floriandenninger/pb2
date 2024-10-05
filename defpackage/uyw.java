package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class uyw implements uyu {
    public String c;
    public ColorStateList d = null;
    public Drawable e = null;
    public Drawable f = null;

    public uyw(String str) {
        this.c = str;
    }

    @Override // defpackage.uyu
    public int b() {
        return R.layout.bottom_sheet_list_item;
    }

    @Override // defpackage.uyu
    public boolean e() {
        return true;
    }

    public final void f(int i) {
        this.d = ColorStateList.valueOf(i);
    }
}
