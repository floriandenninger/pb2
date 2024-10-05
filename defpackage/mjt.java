package defpackage;

import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.Map;
import java.util.MissingFormatArgumentException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mjt implements zfk {
    public final azrs a;
    public final ayqw b;
    public final zce c;
    public final zce d;
    public final Map e;
    final /* synthetic */ PivotBar f;

    public mjt(PivotBar pivotBar, zce zceVar, zce zceVar2, Map map) {
        this.f = pivotBar;
        azrs aT = azrh.aN(Optional.empty()).aT();
        this.a = aT;
        this.c = zceVar;
        this.d = zceVar2;
        this.e = map;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.b = new ayqw(aT.Y(mmt.b).ax(new ayrs(this) { // from class: mjr
            public final /* synthetic */ mjt a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    mjt mjtVar = this.a;
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue() || mjtVar.c.c()) {
                        whu.I(mjtVar.c.a(), bool.booleanValue());
                        return;
                    }
                    return;
                }
                if (i4 == 1) {
                    mjt mjtVar2 = this.a;
                    Boolean bool2 = (Boolean) obj;
                    if (bool2.booleanValue() || mjtVar2.d.c()) {
                        whu.I(mjtVar2.d.a(), bool2.booleanValue());
                    }
                    if (bool2.booleanValue()) {
                        ((TextView) mjtVar2.d.a()).setLayoutDirection(((TextView) mjtVar2.d.a()).getParent().getLayoutDirection());
                        return;
                    }
                    return;
                }
                ((TextView) this.a.d.a()).setText((String) obj);
            }
        }), aT.Y(luw.u).ax(new ayrs(this) { // from class: mjr
            public final /* synthetic */ mjt a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    mjt mjtVar = this.a;
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue() || mjtVar.c.c()) {
                        whu.I(mjtVar.c.a(), bool.booleanValue());
                        return;
                    }
                    return;
                }
                if (i4 == 1) {
                    mjt mjtVar2 = this.a;
                    Boolean bool2 = (Boolean) obj;
                    if (bool2.booleanValue() || mjtVar2.d.c()) {
                        whu.I(mjtVar2.d.a(), bool2.booleanValue());
                    }
                    if (bool2.booleanValue()) {
                        ((TextView) mjtVar2.d.a()).setLayoutDirection(((TextView) mjtVar2.d.a()).getParent().getLayoutDirection());
                        return;
                    }
                    return;
                }
                ((TextView) this.a.d.a()).setText((String) obj);
            }
        }), aT.L(khf.q).Y(luw.t).L(khf.p).Y(luw.s).ax(new ayrs(this) { // from class: mjr
            public final /* synthetic */ mjt a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    mjt mjtVar = this.a;
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue() || mjtVar.c.c()) {
                        whu.I(mjtVar.c.a(), bool.booleanValue());
                        return;
                    }
                    return;
                }
                if (i4 == 1) {
                    mjt mjtVar2 = this.a;
                    Boolean bool2 = (Boolean) obj;
                    if (bool2.booleanValue() || mjtVar2.d.c()) {
                        whu.I(mjtVar2.d.a(), bool2.booleanValue());
                    }
                    if (bool2.booleanValue()) {
                        ((TextView) mjtVar2.d.a()).setLayoutDirection(((TextView) mjtVar2.d.a()).getParent().getLayoutDirection());
                        return;
                    }
                    return;
                }
                ((TextView) this.a.d.a()).setText((String) obj);
            }
        }));
    }

    public final CharSequence a(int i) {
        String string;
        try {
            if (i <= 9) {
                string = this.f.a.getQuantityString(R.plurals.tab_extra_info_new_items, i, Integer.valueOf(i));
            } else {
                string = this.f.a.getString(R.string.tab_extra_info_nine_plus_new_items);
            }
            return string;
        } catch (MissingFormatArgumentException unused) {
            return b();
        }
    }

    public final CharSequence b() {
        return this.f.a.getString(R.string.tab_extra_info_new_content);
    }

    @Override // defpackage.zfk
    public final void j() {
        throw null;
    }
}
