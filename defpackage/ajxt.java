package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajxt extends uyw {
    public final ArrayList a;
    public boolean b;
    public boolean g;
    public String h;
    public int i;

    public ajxt(String str) {
        super(str);
        this.b = true;
        this.a = new ArrayList();
    }

    @Override // defpackage.uyw, defpackage.uyu
    public final int b() {
        return R.layout.bottom_sheet_enableable_list_item;
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nnx) arrayList.get(i)).a.aN();
        }
    }

    public final void d(String str) {
        if (amkq.b(this.h, str)) {
            return;
        }
        this.h = str;
        c();
    }

    @Override // defpackage.uyw, defpackage.uyu
    public final boolean e() {
        return this.b;
    }

    public final void g(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        c();
    }

    public boolean h() {
        return this.g;
    }
}
