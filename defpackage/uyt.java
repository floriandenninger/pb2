package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class uyt extends bv {
    public ListAdapter aD;

    public static int aP(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    protected abstract ListAdapter aH();

    protected abstract AdapterView.OnItemClickListener aJ();

    protected abstract String aK();

    protected abstract int mA();

    @Override // defpackage.bv, defpackage.ce
    public void mR(Bundle bundle) {
        super.mR(bundle);
        o(1, 0);
    }

    @Override // defpackage.bv, defpackage.ce
    public void mS() {
        super.mS();
        Window window = this.d.getWindow();
        int i = -1;
        if (mA() == 2 && aP(C()) > 600) {
            i = -2;
        }
        window.setLayout(i, -2);
        this.d.getWindow().setBackgroundDrawableResource(R.color.white);
        this.d.getWindow().setGravity(81);
        this.d.getWindow().setWindowAnimations(com.google.android.youtube.R.style.SlideUpDownAnimation);
    }

    @Override // defpackage.ce
    public View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        this.aD = aH();
        int mA = mA();
        if (mA == 0) {
            inflate = layoutInflater.inflate(com.google.android.youtube.R.layout.bottom_sheet_list_fragment, viewGroup, false);
            ListView listView = (ListView) inflate.findViewById(com.google.android.youtube.R.id.bottom_sheet_list_view);
            listView.setAdapter(this.aD);
            listView.setOnItemClickListener(aJ());
        } else if (mA != 1) {
            inflate = layoutInflater.inflate(com.google.android.youtube.R.layout.bottom_sheet_dialog_fragment, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(com.google.android.youtube.R.layout.bottom_sheet_grid_fragment, viewGroup, false);
            GridView gridView = (GridView) inflate.findViewById(com.google.android.youtube.R.id.bottom_sheet_grid_view);
            gridView.setAdapter(this.aD);
            gridView.setOnItemClickListener(aJ());
        }
        String aK = aK();
        TextView textView = (TextView) inflate.findViewById(com.google.android.youtube.R.id.bottom_sheet_title);
        if (TextUtils.isEmpty(aK)) {
            textView.setVisibility(8);
        } else {
            textView.setText(aK);
            textView.setVisibility(0);
        }
        return inflate;
    }
}
