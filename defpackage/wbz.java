package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wbz {
    public final Activity c;
    protected final afsy d;

    /* JADX INFO: Access modifiers changed from: protected */
    public wbz(Activity activity, afsy afsyVar) {
        this.c = activity;
        this.d = afsyVar;
    }

    public List a() {
        ArrayList arrayList = new ArrayList();
        if (this.d.t()) {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.fusion_manage_account_footer, (ViewGroup) null);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: wby
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wbz.this.c();
                }
            });
            arrayList.add(inflate);
        }
        return arrayList;
    }

    public boolean b() {
        return false;
    }

    public final void c() {
        Intent intent = new Intent("android.settings.SYNC_SETTINGS");
        intent.putExtra("settings", new String[]{"com.google"});
        this.c.startActivity(intent);
    }
}
