package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class umj {
    public Context a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public byte[] h;
    public boolean i = false;
    public umm j = umm.UNKNOWN;
    public boolean k = false;

    public final Intent a() {
        amkq.O(this.a != null, "Can't create an intent from a null context!");
        amkq.O(!TextUtils.isEmpty(this.b), "Client name is required");
        amkq.O(!TextUtils.isEmpty(this.c), "Client version is required");
        amkq.O(!TextUtils.isEmpty(this.d), "Parent account name is required");
        Intent intent = new Intent(this.a, (Class<?>) ParentToolsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.b);
        bundle.putString("client_version", this.c);
        bundle.putString("parent_account_name", this.d);
        bundle.putBoolean("should_block_system_back_button", this.i);
        bundle.putString("tool_bar_title", this.g);
        bundle.putSerializable("parent_tools_use_case", this.j);
        bundle.putBoolean("is_logging_enabled", this.k);
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("child_obfuscated_gaia_id", null);
        }
        if (!TextUtils.isEmpty(this.e)) {
            bundle.putString("parent_tools_url", this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
            bundle.putString("end_url", this.f);
        }
        byte[] bArr = this.h;
        if (bArr != null) {
            bundle.putByteArray("host_client_data", bArr);
        }
        intent.putExtras(bundle);
        return intent;
    }
}
