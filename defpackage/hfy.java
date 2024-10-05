package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.youtube.R;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfy {
    public final Runnable b;
    public final Runnable c;
    final Dialog f;
    public final CircularProgressIndicator g;
    public final TextView h;
    public hqv i;
    public boolean d = false;
    public boolean e = false;
    public final Handler a = new Handler();

    public hfy(Context context) {
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.processing_indicator_dialog, (ViewGroup) null);
        this.g = (CircularProgressIndicator) inflate.findViewById(R.id.processing_indicator_spinner);
        this.h = (TextView) inflate.findViewById(R.id.processing_indicator_label);
        Dialog dialog = new Dialog(context);
        this.f = dialog;
        final int i2 = 1;
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hfw
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                hqv hqvVar = hfy.this.i;
                if (hqvVar != null) {
                    hqw hqwVar = hqvVar.a;
                    Toast.makeText(hqwVar.qR(), "Dialog canceled", 0).show();
                    hfy hfyVar = hqwVar.at;
                    if (hfyVar != null) {
                        hfyVar.a();
                    }
                    hfv hfvVar = hqwVar.au;
                    vyz vyzVar = hfvVar.c;
                    if (vyzVar != null) {
                        ((vtn) vyzVar.a).c(new CancellationException("Encoder cancel requested"));
                        return;
                    }
                    hfvVar.d.a();
                }
            }
        });
        dialog.setContentView(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.setDimAmount(0.0f);
        }
        this.b = new Runnable(this) { // from class: hfx
            public final /* synthetic */ hfy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 == 0) {
                    hfy hfyVar = this.a;
                    hfyVar.f.hide();
                    hfyVar.d = false;
                } else {
                    hfy hfyVar2 = this.a;
                    hfyVar2.f.show();
                    hfyVar2.d = true;
                    hfyVar2.e = false;
                    System.currentTimeMillis();
                }
            }
        };
        this.c = new Runnable(this) { // from class: hfx
            public final /* synthetic */ hfy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i == 0) {
                    hfy hfyVar = this.a;
                    hfyVar.f.hide();
                    hfyVar.d = false;
                } else {
                    hfy hfyVar2 = this.a;
                    hfyVar2.f.show();
                    hfyVar2.d = true;
                    hfyVar2.e = false;
                    System.currentTimeMillis();
                }
            }
        };
    }

    public final void a() {
        if (this.d) {
            this.f.hide();
        }
        this.a.removeCallbacks(this.b);
        this.a.removeCallbacks(this.c);
        this.d = false;
        this.e = false;
    }

    public final void b(int i) {
        this.g.setProgress(i);
    }
}
