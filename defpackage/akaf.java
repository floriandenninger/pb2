package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akaf extends ajzz {
    public SharedPreferences a;
    private CharSequence ae;
    private TextView af;
    private TextView ag;
    private ImageView ah;
    public String[] b;
    public boolean c;
    public xsl d;
    private CharSequence e;

    public static String[] o(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!zgy.a(context, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final void p() {
        this.af.setText(this.ae);
        this.ag.setText(R.string.open_settings_button);
        this.c = true;
    }

    private static boolean q(Context context, String[] strArr) {
        return o(context, strArr).length == 0;
    }

    private final boolean r() {
        Set<String> stringSet = this.a.getStringSet("permissions_requested", null);
        if (stringSet == null) {
            return false;
        }
        for (String str : this.b) {
            if (!zgy.a(C(), str) && stringSet.contains(str) && !C().shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        xsl xslVar;
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        HashSet hashSet = new HashSet(this.a.getStringSet("permissions_requested", amvs.a));
        Collections.addAll(hashSet, strArr);
        edit.putStringSet("permissions_requested", hashSet);
        edit.apply();
        if (r()) {
            p();
        }
        if (!q(C(), this.b) || (xslVar = this.d) == null) {
            return;
        }
        xslVar.a();
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        String[] stringArray = bundle2.getStringArray("missing_permissions");
        stringArray.getClass();
        this.b = stringArray;
        this.e = bundle2.getCharSequence("allow_access_description");
        this.ae = bundle2.getCharSequence("open_settings_description");
    }

    @Override // defpackage.ce
    public final void mS() {
        xsl xslVar;
        super.mS();
        if (this.c && q(C(), this.b) && (xslVar = this.d) != null) {
            xslVar.a();
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.permission_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.permission_description);
        this.af = textView;
        textView.setText(this.e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.action_button);
        this.ag = textView2;
        textView2.setOnClickListener(new akae(this, 1));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close_button);
        this.ah = imageView;
        imageView.setOnClickListener(new akae(this, 0));
        if (r()) {
            p();
        }
        return inflate;
    }
}
