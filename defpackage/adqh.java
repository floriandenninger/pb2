package defpackage;

import android.os.Bundle;
import android.speech.RecognitionListener;
import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.youtube.mdx.smartremote.BitmapSoundLevelsView;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adqh implements RecognitionListener {
    final /* synthetic */ adqk a;

    public adqh(adqk adqkVar) {
        this.a = adqkVar;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        this.a.d();
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        zga.f(adqk.a, "Speech recognition error", new adql(i));
        this.a.f();
        adqc adqcVar = (adqc) this.a.b;
        if (adqcVar.C) {
            return;
        }
        if (i == 6 || i == 7) {
            adqcVar.g();
        } else {
            View view = adqcVar.m;
            if (view != null) {
                allo.m(view, R.string.mdx_smart_remote_generic_error_message, 0).h();
                adqcVar.h.n(new acqx(acsb.c(63268)));
            }
        }
        adqcVar.d.postDelayed(new adpx(adqcVar), 3500L);
        adqcVar.C = true;
        adqcVar.n(5, false, true);
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (defpackage.amkq.b(r0.g, r0.f) == false) goto L17;
     */
    @Override // android.speech.RecognitionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPartialResults(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "results_recognition"
            java.util.ArrayList r0 = r7.getStringArrayList(r0)
            java.lang.String r1 = "android.speech.extra.UNSTABLE_TEXT"
            java.util.ArrayList r7 = r7.getStringArrayList(r1)
            r1 = 0
            if (r7 == 0) goto L1c
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L1c
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            goto L1e
        L1c:
            java.lang.String r7 = ""
        L1e:
            if (r0 == 0) goto L26
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L2c
        L26:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L9f
        L2c:
            adqk r2 = r6.a
            r2.d = r0
            r2.f = r7
            java.util.List r0 = r2.e
            java.util.List r2 = r2.d
            boolean r0 = defpackage.amkq.b(r0, r2)
            if (r0 == 0) goto L48
            adqk r0 = r6.a
            java.lang.String r2 = r0.g
            java.lang.String r0 = r0.f
            boolean r0 = defpackage.amkq.b(r2, r0)
            if (r0 != 0) goto L9f
        L48:
            adqk r0 = r6.a
            java.lang.StringBuilder r0 = r0.b()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L62
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L95
        L62:
            adqk r2 = r6.a
            adqj r2 = r2.b
            adqc r2 = (defpackage.adqc) r2
            adlm r3 = r2.c
            r4 = 1
            if (r3 == 0) goto L70
            r3.R(r4, r0, r7)
        L70:
            android.widget.TextView r3 = r2.u
            r5 = 8
            r3.setVisibility(r5)
            android.widget.TextView r3 = r2.t
            r3.setVisibility(r1)
            android.widget.TextView r3 = r2.t
            android.content.Context r2 = r2.l
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r0
            r5[r4] = r7
            r7 = 2132018544(0x7f140570, float:1.9675398E38)
            java.lang.String r7 = r2.getString(r7, r5)
            android.text.Spanned r7 = android.text.Html.fromHtml(r7)
            r3.setText(r7)
        L95:
            adqk r7 = r6.a
            java.util.List r0 = r7.d
            r7.e = r0
            java.lang.String r0 = r7.f
            r7.g = r0
        L9f:
            adqk r7 = r6.a
            r7.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adqh.onPartialResults(android.os.Bundle):void");
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        adqk adqkVar = this.a;
        adqkVar.d = null;
        adqkVar.e = null;
        adqkVar.f = null;
        adqkVar.g = null;
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        String a;
        this.a.c();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.isEmpty() || TextUtils.isEmpty(stringArrayList.get(0))) {
            a = this.a.a();
        } else {
            a = stringArrayList.get(0);
        }
        this.a.b.c(a);
        this.a.e();
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        MicrophoneView microphoneView = ((adqc) this.a.b).v;
        int min = (int) (((Math.min(Math.max(f, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f);
        int i = min < 30 ? 0 : (min / 10) * 10;
        amkq.E(i <= 100);
        BitmapSoundLevelsView bitmapSoundLevelsView = microphoneView.a;
        amkq.E(i <= 100);
        bitmapSoundLevelsView.a = i;
    }
}
