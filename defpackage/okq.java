package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class okq extends okr {
    public SharedPreferences ae;
    public aahd af;
    public wdm ag;

    private final boolean aH() {
        wdk a;
        wdm wdmVar = this.ag;
        return (wdmVar == null || (a = wdmVar.a()) == null || !a.b.endsWith("@google.com")) ? false : true;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        n(false);
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Drawable a;
        ci C = C();
        final int a2 = zgx.a(C);
        View inflate = LayoutInflater.from(C).inflate(R.layout.dogfood_warning_dialog, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.meme_image);
        if (aH()) {
            a = aii.a(qR(), R.drawable.dogfood_hiring_warning);
        } else {
            a = aii.a(qR(), R.drawable.dogfood_warning);
        }
        imageView.setImageDrawable(a);
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "This is INTERNAL ONLY!\nPlease do not share outside of Google.\n");
        if (aH()) {
            spannableStringBuilder.append((CharSequence) "YouTube is hiring:\n");
            spannableStringBuilder.append((CharSequence) "go/ytma-jobs");
            spannableStringBuilder.setSpan(new StyleSpan(1), 62, 93, 33);
            aong aongVar = (aong) apxf.a.createBuilder();
            aonk aonkVar = UrlEndpointOuterClass.urlEndpoint;
            aone createBuilder = avuo.a.createBuilder();
            createBuilder.copyOnWrite();
            avuo avuoVar = (avuo) createBuilder.instance;
            avuoVar.b = 1 | avuoVar.b;
            avuoVar.c = "http://go/ytma-jobs";
            aongVar.e(aonkVar, (avuo) createBuilder.build());
            spannableStringBuilder.setSpan(aahi.a(false).a(this.af, null, (apxf) aongVar.build()), 81, 93, 33);
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dogfood_warning_dialog_dismiss_button);
        textView2.setText(R.string.ok);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: okp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                okq okqVar = okq.this;
                okqVar.ae.edit().putInt("dogfood_warning_shown_version", a2).apply();
                okqVar.dismiss();
            }
        });
        final AlertDialog create = new AlertDialog.Builder(C()).setView(inflate).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: oko
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Window window;
                Resources resources;
                okq okqVar = okq.this;
                Dialog dialog = create;
                ci C2 = okqVar.C();
                if (C2 == null || (window = dialog.getWindow()) == null || (resources = C2.getResources()) == null) {
                    return;
                }
                window.setLayout((int) resources.getDimension(R.dimen.dogfood_warning_dialog_width), -2);
            }
        });
        return create;
    }
}
