package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hgb extends zys {
    public final hga a;
    private final View b;

    public hgb(Context context, dd ddVar, hga hgaVar, int i, int i2, int i3, int i4) {
        super(context, ddVar, null, false, true);
        this.a = hgaVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.shorts_camera_close_confirmation_sheet, (ViewGroup) null);
        this.b = inflate;
        final int i5 = 1;
        inflate.findViewById(R.id.shorts_close_sheet_reshoot).setOnClickListener(new View.OnClickListener(this) { // from class: hfz
            public final /* synthetic */ hgb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i5;
                if (i6 == 0) {
                    this.a.a.b(true);
                } else if (i6 != 1) {
                    this.a.a.a();
                } else {
                    this.a.a.c();
                }
            }
        });
        final int i6 = 0;
        inflate.findViewById(R.id.shorts_close_sheet_exit).setOnClickListener(new View.OnClickListener(this) { // from class: hfz
            public final /* synthetic */ hgb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i6;
                if (i62 == 0) {
                    this.a.a.b(true);
                } else if (i62 != 1) {
                    this.a.a.a();
                } else {
                    this.a.a.c();
                }
            }
        });
        final int i7 = 2;
        inflate.findViewById(R.id.shorts_close_sheet_cancel).setOnClickListener(new View.OnClickListener(this) { // from class: hfz
            public final /* synthetic */ hgb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i7;
                if (i62 == 0) {
                    this.a.a.b(true);
                } else if (i62 != 1) {
                    this.a.a.a();
                } else {
                    this.a.a.c();
                }
            }
        });
        ((ImageView) inflate.findViewById(R.id.shorts_close_sheet_reshoot_icon)).setImageResource(i);
        ((ImageView) inflate.findViewById(R.id.shorts_close_sheet_exit_icon)).setImageResource(i3);
        inflate.findViewById(R.id.shorts_close_sheet_reshoot).setContentDescription(context.getText(i2));
        ((TextView) inflate.findViewById(R.id.shorts_close_sheet_reshoot_text)).setText(i2);
        inflate.findViewById(R.id.shorts_close_sheet_exit).setContentDescription(context.getText(i4));
        ((TextView) inflate.findViewById(R.id.shorts_close_sheet_exit_text)).setText(i4);
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.b;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return "";
    }

    @Override // defpackage.zys
    protected final boolean lS() {
        return false;
    }

    @Override // defpackage.zys
    protected final boolean lT() {
        return false;
    }
}
