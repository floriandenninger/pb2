package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzm extends UtteranceProgressListener implements TextToSpeech.OnInitListener, AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int g = 0;
    public TextToSpeech a;
    final AudioManager b;
    public final List e;
    private final Context h;
    private String i;
    public final azrj c = azrj.W();
    final List d = new ArrayList();
    public final aoae f = aoae.U();

    public yzm(Context context, ajfe ajfeVar) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = context;
        this.a = new TextToSpeech(context, this);
        this.b = (AudioManager) context.getSystemService("audio");
        arrayList.add(ajfeVar);
    }

    private final void c(String str) {
        this.c.b(new Throwable(str));
    }

    private final void d(String str) {
        this.d.remove(str);
        if (this.d.isEmpty()) {
            this.b.abandonAudioFocus(this);
        }
    }

    public final void a(String str, int i, String str2) {
        if (this.a != null) {
            this.d.add(str2);
            this.b.requestAudioFocus(this, 3, 2);
            if (this.a.speak(str, i, null, str2) == -1) {
                zga.l("TTS failed during speaking");
                return;
            }
            return;
        }
        this.i = str;
        this.a = new TextToSpeech(this.h, this);
    }

    public final void b(boolean z) {
        if (this.a == null) {
            return;
        }
        if (!z) {
            for (ajfe ajfeVar : this.e) {
                Instant instant = ajfeVar.c;
                if (instant != null) {
                    aone createBuilder = awez.a.createBuilder();
                    createBuilder.copyOnWrite();
                    ((awez) createBuilder.instance).b = false;
                    createBuilder.copyOnWrite();
                    ((awez) createBuilder.instance).c = true;
                    aneu aneuVar = aneu.a;
                    long seconds = Duration.between(instant, Instant.now()).getSeconds();
                    createBuilder.copyOnWrite();
                    ((awez) createBuilder.instance).d = (int) seconds;
                    awez awezVar = (awez) createBuilder.build();
                    arpn a = arpp.a();
                    a.copyOnWrite();
                    ((arpp) a.instance).el(awezVar);
                    ajfeVar.a.c((arpp) a.build());
                    ajfeVar.c = null;
                }
            }
        }
        this.a.stop();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -3 || i == -2 || i == -1) {
            b(false);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.f.i(new yzk(str, 1));
        d(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        this.f.i(new yzk(str, 0));
        d(str);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        if (i == 0) {
            Locale locale = Locale.getDefault();
            if (this.a.isLanguageAvailable(locale) < 0 || this.a.setLanguage(locale) == -1) {
                zga.l("TTS failed during initialization: LANG_MISSING_DATA");
                c("TTS failed during initialization with code: LANG_MISSING_DATA");
                return;
            }
            this.a.setOnUtteranceProgressListener(this);
            String str = this.i;
            if (str != null) {
                a(str, 0, "TextToSpeechController");
            }
            this.i = null;
            this.c.sh();
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("TTS failed during initialization with code: ");
        sb.append(i);
        zga.l(sb.toString());
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("TTS failed during initialization with code: ");
        sb2.append(i);
        c(sb2.toString());
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        this.f.i(new nvp(7));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(final String str, final int i) {
        this.f.i(new Consumer() { // from class: yzl
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                String str2 = str;
                int i2 = i;
                int i3 = yzm.g;
                ((smz) obj).a(str2, i2);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        d(str);
    }
}
