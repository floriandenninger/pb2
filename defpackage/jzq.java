package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzq implements fzk {
    private final aahd a;

    public jzq(aahd aahdVar) {
        this.a = aahdVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_settings;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.menu_settings;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        menuItem.setShowAsAction(0);
        menuItem.setVisible(true);
    }

    @Override // defpackage.fze
    public final boolean m() {
        aone createBuilder = apfu.a.createBuilder();
        String num = Integer.toString(10013);
        createBuilder.copyOnWrite();
        apfu apfuVar = (apfu) createBuilder.instance;
        num.getClass();
        apfuVar.b |= 8;
        apfuVar.e = num;
        apfu apfuVar2 = (apfu) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, apfuVar2);
        this.a.c((apxf) aongVar.build(), null);
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 102;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
