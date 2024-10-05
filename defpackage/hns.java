package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hns extends zys {
    public final View a;
    public final hno b;
    private final View c;
    private final View d;

    public hns(Context context, dd ddVar, hno hnoVar, hrv hrvVar) {
        super(context, ddVar, null, false, true);
        View inflate = LayoutInflater.from(context).inflate(R.layout.shorts_creation_music_options_sheet, (ViewGroup) null);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.shorts_creation_change_music);
        this.d = findViewById;
        View findViewById2 = inflate.findViewById(R.id.shorts_creation_remove_music);
        this.a = findViewById2;
        if (hrvVar.f()) {
            findViewById.setContentDescription(context.getString(R.string.change_sound_option));
            ((TextView) inflate.findViewById(R.id.shorts_creation_change_sound_text)).setText(R.string.change_sound_option);
            findViewById2.setContentDescription(context.getString(R.string.delete_sound_option));
            ((TextView) inflate.findViewById(R.id.shorts_creation_remove_sound_text)).setText(R.string.delete_sound_option);
        }
        this.b = hnoVar;
        final int i = 1;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: hnr
            public final /* synthetic */ hns a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                if (i2 == 0) {
                    hno hnoVar2 = this.a.b;
                    hnoVar2.b.i.z();
                    hnoVar2.a.j();
                } else {
                    if (i2 != 1) {
                        this.a.b.b.i.z();
                        return;
                    }
                    hno hnoVar3 = this.a.b;
                    hnoVar3.b.i.z();
                    hnoVar3.b.b();
                }
            }
        });
        final int i2 = 0;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: hnr
            public final /* synthetic */ hns a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                if (i22 == 0) {
                    hno hnoVar2 = this.a.b;
                    hnoVar2.b.i.z();
                    hnoVar2.a.j();
                } else {
                    if (i22 != 1) {
                        this.a.b.b.i.z();
                        return;
                    }
                    hno hnoVar3 = this.a.b;
                    hnoVar3.b.i.z();
                    hnoVar3.b.b();
                }
            }
        });
        final int i3 = 2;
        inflate.findViewById(R.id.shorts_creation_music_options_close).setOnClickListener(new View.OnClickListener(this) { // from class: hnr
            public final /* synthetic */ hns a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                if (i22 == 0) {
                    hno hnoVar2 = this.a.b;
                    hnoVar2.b.i.z();
                    hnoVar2.a.j();
                } else {
                    if (i22 != 1) {
                        this.a.b.b.i.z();
                        return;
                    }
                    hno hnoVar3 = this.a.b;
                    hnoVar3.b.i.z();
                    hnoVar3.b.b();
                }
            }
        });
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.c;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return null;
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
