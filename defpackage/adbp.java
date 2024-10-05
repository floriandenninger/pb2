package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbp {
    public final ci a;
    public final acra b;
    public final adcu c;
    public final adlj d;
    public final addy e;
    public TextInputLayout f;
    public TvCodeEditText g;
    public int h;
    public Button i;

    public adbp(ci ciVar, acra acraVar, adcu adcuVar, adlj adljVar, addy addyVar) {
        this.a = ciVar;
        this.b = acraVar;
        this.c = adcuVar;
        this.d = adljVar;
        this.e = addyVar;
    }

    public static String a(String str) {
        return str.replace(" ", "");
    }

    public final void b() {
        String valueOf = String.valueOf(this.i.getTag());
        if (valueOf == null) {
            return;
        }
        Collection.EL.stream(this.d.c()).filter(new opz(valueOf, 6)).findFirst().ifPresent(new Consumer() { // from class: adbm
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                adbp adbpVar = adbp.this;
                adbpVar.e.J((adga) obj, new jvq(3));
                ci ciVar = adbpVar.a;
                if (ciVar instanceof PairWithTvActivity) {
                    PairWithTvActivity pairWithTvActivity = (PairWithTvActivity) ciVar;
                    pairWithTvActivity.setResult(2);
                    pairWithTvActivity.finish();
                }
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/3230451"));
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a, R.string.mdx_use_tv_code_help_page_error, 1).show();
        }
    }
}
