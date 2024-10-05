package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajxo extends uyw {
    public boolean g;
    public String h;
    public final Context i;

    public ajxo(Context context, String str) {
        super(str);
        this.i = context;
    }

    public void a(boolean z) {
        this.g = z;
        this.e = z ? this.i.getResources().getDrawable(R.drawable.quantum_ic_check_grey600_24) : null;
    }

    @Override // defpackage.uyw, defpackage.uyu
    public int b() {
        return R.layout.bottom_sheet_list_checkmark_item;
    }
}
