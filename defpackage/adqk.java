package defpackage;

import android.content.Context;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqk {
    public static final String a = zga.a("MdxSpeechController");
    public final adqj b;
    protected SpeechRecognizer c;
    public List d;
    public List e;
    public String f;
    public String g;
    protected final RecognitionListener h = new adqh(this);
    private final Context i;
    private final Handler j;
    private adqi k;

    public adqk(Context context, Handler handler, adqj adqjVar) {
        this.i = context;
        this.j = handler;
        this.b = adqjVar;
        e();
    }

    public final String a() {
        StringBuilder b = b();
        if (!TextUtils.isEmpty(this.f)) {
            b.append(this.f);
        }
        return b.toString().trim();
    }

    public final StringBuilder b() {
        StringBuilder sb = new StringBuilder("");
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(" ");
            }
        }
        return sb;
    }

    public final void c() {
        adqi adqiVar = this.k;
        if (adqiVar != null) {
            this.j.removeCallbacks(adqiVar);
            this.k = null;
        }
    }

    public final void d() {
        c();
        adqi adqiVar = new adqi(this);
        this.k = adqiVar;
        this.j.postDelayed(adqiVar, 4000L);
    }

    public final void e() {
        if (SpeechRecognizer.isRecognitionAvailable(this.i)) {
            SpeechRecognizer speechRecognizer = this.c;
            if (speechRecognizer != null) {
                try {
                    speechRecognizer.destroy();
                } catch (Throwable th) {
                    try {
                        String str = a;
                        String valueOf = String.valueOf(th.getMessage());
                        zga.m(str, valueOf.length() != 0 ? "Non-Fatal error while destroying speech. ".concat(valueOf) : new String("Non-Fatal error while destroying speech. "));
                        this.c = null;
                    } finally {
                        this.c = null;
                    }
                }
            }
            SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this.i);
            this.c = createSpeechRecognizer;
            createSpeechRecognizer.setRecognitionListener(this.h);
        } else {
            this.c = null;
            this.b.d();
        }
        this.e = null;
        this.d = null;
        this.f = null;
    }

    public final void f() {
        this.b.c(a());
        e();
    }

    public final void g() {
        SpeechRecognizer speechRecognizer = this.c;
        if (speechRecognizer == null) {
            this.b.d();
        } else {
            speechRecognizer.cancel();
        }
    }
}
