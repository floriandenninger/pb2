package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mda {
    public final ArrayList a;
    private int b;

    public mda() {
        a();
        this.a = amkq.aR(Integer.valueOf(R.id.menu_item_0), Integer.valueOf(R.id.menu_item_1), Integer.valueOf(R.id.menu_item_2), Integer.valueOf(R.id.menu_item_3), Integer.valueOf(R.id.menu_item_4), Integer.valueOf(R.id.menu_item_5), Integer.valueOf(R.id.menu_item_6), Integer.valueOf(R.id.menu_item_7), Integer.valueOf(R.id.menu_item_8), Integer.valueOf(R.id.menu_item_9), Integer.valueOf(R.id.menu_item_10), Integer.valueOf(R.id.menu_item_11), Integer.valueOf(R.id.menu_item_12), Integer.valueOf(R.id.menu_item_13), Integer.valueOf(R.id.menu_item_14), Integer.valueOf(R.id.menu_item_15), Integer.valueOf(R.id.menu_item_16), Integer.valueOf(R.id.menu_item_17), Integer.valueOf(R.id.menu_item_18), Integer.valueOf(R.id.menu_item_19));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b = -1;
    }

    public final mdb b() {
        int i = this.b + 1;
        this.b = i;
        if (i >= this.a.size()) {
            throw new IllegalStateException("This id for ActionBarMenuItem is exceeding the maximum allowed number.");
        }
        return new mdb(this, this.b);
    }
}
