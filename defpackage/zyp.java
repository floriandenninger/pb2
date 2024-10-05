package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zyp {
    public final ysy a;
    public final SharedPreferences b;
    public final String c;
    public final mi d;
    private final Context e;
    private final String f;

    public zyp(Context context, SharedPreferences sharedPreferences, ysy ysyVar, irv irvVar) {
        this.e = context;
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        ysyVar.getClass();
        this.a = ysyVar;
        String string = context.getString(R.string.upload_network_policy_pref_value_any);
        this.c = string;
        this.f = context.getString(R.string.upload_network_policy_pref_value_wifi);
        if (!sharedPreferences.contains(yny.UPLOAD_NETWORK_POLICY)) {
            a(string);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.cellular_upload_dialog_contents, (ViewGroup) null);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.do_not_ask_again_checkbox);
        zym zymVar = new zym(this, checkBox, irvVar);
        zyn zynVar = new zyn(irvVar);
        mh mhVar = new mh(context);
        mhVar.n(R.string.cellular_upload_dialog_title);
        mhVar.p(inflate);
        mhVar.h(R.string.cellular_upload_dialog_action_negative, zymVar);
        mhVar.k(R.string.cellular_upload_dialog_action_positive, zymVar);
        mhVar.j(zynVar);
        mi b = mhVar.b();
        checkBox.setOnCheckedChangeListener(new zyo(b));
        this.d = b;
    }

    public final void a(String str) {
        this.b.edit().putString(yny.UPLOAD_NETWORK_POLICY, str).apply();
    }

    public final boolean b() {
        return amkq.b(this.b.getString(yny.UPLOAD_NETWORK_POLICY, null), this.f);
    }
}
