package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ixe extends ivt implements AdapterView.OnItemClickListener {
    private ajpd ae;

    static {
        zga.a("MDX.RemoteWatchBottomSheet");
    }

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        this.ae = new ajpd();
        return new ajxr(C(), this.ae);
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return null;
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.uyt, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mg = super.mg(layoutInflater, viewGroup, bundle);
        if (mg instanceof ViewGroup) {
            View inflate = layoutInflater.inflate(R.layout.bottom_sheet_cancel_footer, (ViewGroup) mg);
            inflate.findViewById(R.id.bottom_sheet_footer_root).setOnClickListener(new View.OnClickListener() { // from class: ixd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ixe.this.dismiss();
                }
            });
            ((TextView) inflate.findViewById(R.id.list_item_text)).setText(R.string.bottomsheet_cancel);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.list_item_icon_primary);
            Drawable drawable = qR().getDrawable(R.drawable.quantum_ic_close_white_24);
            drawable.setTintMode(PorterDuff.Mode.SRC_IN);
            drawable.setTint(wbs.Q(C(), R.attr.ytIconActiveOther));
            imageView.setImageDrawable(drawable);
        }
        return mg;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dismiss();
    }
}
