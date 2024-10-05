package defpackage;

import android.content.res.Resources;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import com.google.android.youtube.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xku extends xkt {
    private final boolean a;
    private final boolean f;
    private Resources g;
    private String h;
    private String i;

    public xku(boolean z, boolean z2) {
        super(xjs.b().a());
        this.a = z;
        this.f = z2;
    }

    private final void a(boolean z) {
        if (this.e) {
            ((AdProgressTextView) this.c).setVisibility(true != z ? 8 : 0);
        }
    }

    @Override // defpackage.xkt
    public final /* synthetic */ void b(Object obj, boolean z) {
        String str;
        String string;
        xjs xjsVar = (xjs) obj;
        int i = xjsVar.a;
        if (i == -1) {
            ((AdProgressTextView) this.c).a.a();
            i = -1;
        }
        boolean z2 = xjsVar.b;
        if (z2 != ((xjs) this.b).b) {
            ((AdProgressTextView) this.c).a.b(z2, false);
        }
        if (this.d != z) {
            a(z);
        }
        ammr c = ammr.b(this.h).c();
        String[] strArr = new String[3];
        xcf xcfVar = xjsVar.c;
        String str2 = null;
        if (!xcfVar.d) {
            str = this.i;
        } else if (xcfVar.e.h()) {
            aoyq aoyqVar = ((auuu) xcfVar.e.c()).b;
            if (aoyqVar == null) {
                aoyqVar = aoyq.a;
            }
            str = aoyqVar.c;
        } else {
            str = null;
        }
        strArr[0] = str;
        xcf xcfVar2 = xjsVar.c;
        int i2 = xcfVar2.c;
        if (i2 != 0 && i2 != 1 && !this.a) {
            if (!xcfVar2.d) {
                string = this.g.getString(R.string.ad_count, Integer.valueOf(xcfVar2.b), Integer.valueOf(xcfVar2.c));
            } else if (xcfVar2.f.h()) {
                string = ((aoyq) xcfVar2.f.c()).c;
            }
            strArr[1] = string;
            if (i >= 0 && !this.f) {
                str2 = zhq.i((i + 999) / 1000);
            }
            strArr[2] = str2;
            ((AdProgressTextView) this.c).setText(c.d(Arrays.asList(strArr)));
        }
        string = null;
        strArr[1] = string;
        if (i >= 0) {
            str2 = zhq.i((i + 999) / 1000);
        }
        strArr[2] = str2;
        ((AdProgressTextView) this.c).setText(c.d(Arrays.asList(strArr)));
    }

    @Override // defpackage.xkt
    public final void d() {
        a(this.d);
        this.g = ((AdProgressTextView) this.c).getResources();
        this.h = ((AdProgressTextView) this.c).getResources().getString(R.string.ad_text_separator);
        this.i = ((AdProgressTextView) this.c).getResources().getString(R.string.ad_badge);
    }
}
