package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfv implements ajom {
    private final View a;
    private final /* synthetic */ int b;

    public lfv(Context context, int i) {
        this.b = i;
        this.a = LayoutInflater.from(context).inflate(R.layout.chip_divider_vertical, (ViewGroup) null);
    }

    @Override // defpackage.ajom
    public final View a() {
        int i = this.b;
        if (i != 0 && i != 1 && i == 2) {
            return this.a;
        }
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public lfv(Context context, ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = LayoutInflater.from(context).inflate(R.layout.watch_card_horizontal_line, viewGroup, false);
    }

    public lfv(Context context, int i, byte[] bArr) {
        this.b = i;
        this.a = LayoutInflater.from(context).inflate(R.layout.account_switcher_loading, (ViewGroup) null);
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
        } else if (i != 2) {
        }
    }

    public lfv(Context context, int i, char[] cArr) {
        this.b = i;
        this.a = View.inflate(context, R.layout.share_target_section_divider, null);
    }
}
