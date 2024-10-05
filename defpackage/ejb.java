package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.application.Shell_UploadActivity;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejb extends wbz {
    public final wiz a;
    public final ffs b;
    private final aadw e;

    public ejb(Activity activity, afsy afsyVar, ffs ffsVar, aadw aadwVar, wiz wizVar) {
        super(activity, afsyVar);
        this.b = ffsVar;
        this.e = aadwVar;
        this.a = wizVar;
    }

    @Override // defpackage.wbz
    public final List a() {
        ArrayList arrayList = new ArrayList();
        if (this.d.t()) {
            asvu asvuVar = this.e.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.f115J) {
                View inflate = LayoutInflater.from(this.c).inflate(R.layout.fusion_manage_account_footer, (ViewGroup) null);
                final int i = 1;
                inflate.setOnClickListener(new View.OnClickListener(this) { // from class: eja
                    public final /* synthetic */ ejb a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = i;
                        if (i2 == 0) {
                            ejb ejbVar = this.a;
                            ejbVar.b.a(ejbVar.c, "yt_android_signout");
                        } else if (i2 != 1) {
                            this.a.a.k("User requested sign out.");
                        } else {
                            this.a.c();
                        }
                    }
                });
                arrayList.add(inflate);
                View inflate2 = LayoutInflater.from(this.c).inflate(R.layout.fusion_account_help_footer, (ViewGroup) null);
                final int i2 = 0;
                inflate2.setOnClickListener(new View.OnClickListener(this) { // from class: eja
                    public final /* synthetic */ ejb a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i22 = i2;
                        if (i22 == 0) {
                            ejb ejbVar = this.a;
                            ejbVar.b.a(ejbVar.c, "yt_android_signout");
                        } else if (i22 != 1) {
                            this.a.a.k("User requested sign out.");
                        } else {
                            this.a.c();
                        }
                    }
                });
                arrayList.add(inflate2);
            } else {
                View inflate3 = LayoutInflater.from(this.c).inflate(R.layout.fusion_sign_out_footer, (ViewGroup) null);
                final int i3 = 2;
                inflate3.setOnClickListener(new View.OnClickListener(this) { // from class: eja
                    public final /* synthetic */ ejb a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i22 = i3;
                        if (i22 == 0) {
                            ejb ejbVar = this.a;
                            ejbVar.b.a(ejbVar.c, "yt_android_signout");
                        } else if (i22 != 1) {
                            this.a.a.k("User requested sign out.");
                        } else {
                            this.a.c();
                        }
                    }
                });
                arrayList.add(inflate3);
            }
        }
        return arrayList;
    }

    @Override // defpackage.wbz
    public final boolean b() {
        char c;
        if (!this.d.t()) {
            return false;
        }
        Activity activity = this.c;
        if (activity instanceof WatchWhileActivity) {
            c = 1;
        } else if (activity instanceof Shell_UploadActivity) {
            c = 2;
        } else {
            c = activity instanceof LiveCreationActivity ? (char) 3 : (char) 0;
        }
        return (c == 2 || c == 3) ? false : true;
    }
}
