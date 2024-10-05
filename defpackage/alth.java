package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.setupcompat.logging.CustomEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alth implements View.OnClickListener {
    public final int a;
    public final CharSequence b;
    public int c;

    public alth(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alsl.b);
        this.b = obtainStyledAttributes.getString(1);
        int i = obtainStyledAttributes.getInt(2, 0);
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Not a ButtonType");
        }
        this.a = i;
        this.c = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final PersistableBundle a(String str) {
        String str2;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(str.concat("_text"), CustomEvent.h(this.b.toString()));
        String concat = str.concat("_type");
        switch (this.a) {
            case 1:
                str2 = "ADD_ANOTHER";
                break;
            case 2:
                str2 = "CANCEL";
                break;
            case 3:
                str2 = "CLEAR";
                break;
            case 4:
                str2 = "DONE";
                break;
            case 5:
                str2 = "NEXT";
                break;
            case 6:
                str2 = "OPT_IN";
                break;
            case 7:
                str2 = "SKIP";
                break;
            case 8:
                str2 = "STOP";
                break;
            default:
                str2 = "OTHER";
                break;
        }
        persistableBundle.putString(concat, str2);
        persistableBundle.putInt(str.concat("_onClickCount"), 0);
        return persistableBundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
